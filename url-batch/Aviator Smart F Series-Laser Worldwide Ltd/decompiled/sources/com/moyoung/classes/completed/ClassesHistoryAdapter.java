package com.moyoung.classes.completed;

import android.content.Context;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.moyoung.classes.R$drawable;
import com.moyoung.classes.R$id;
import com.moyoung.classes.R$layout;
import com.moyoung.classes.R$string;
import com.moyoung.classes.coach.model.CoachCoursePlayedBean;
import com.moyoung.classes.completed.model.ClassesHistoryModel;
import com.moyoung.classes.completed.model.ClassesType;
import com.moyoung.classes.db.ClassesHistory;
import com.moyoung.classes.meditation.onlineclass.model.OnlineClassBean;
import com.moyoung.dafit.module.common.utils.m;
import com.moyoung.dafit.module.common.utils.o;
import java.util.Date;

/* loaded from: classes4.dex */
public class ClassesHistoryAdapter extends BaseQuickAdapter<ClassesHistory, BaseViewHolder> {
    public ClassesHistoryAdapter() {
        super(R$layout.item_classes_history);
    }

    private static String formatPeriodTime(Context context, Date date) {
        String string = context.getString(R$string.hour_minute_format_24);
        if (is12HourTime(context)) {
            string = context.getString(R$string.hour_minute_format_12);
        }
        return m.format(date, string);
    }

    public static boolean is12HourTime(Context context) {
        return !DateFormat.is24HourFormat(context);
    }

    private void showCover(@NonNull BaseViewHolder baseViewHolder, ClassesHistory classesHistory) {
        com.moyoung.dafit.module.common.imageload.c.load((ImageView) baseViewHolder.getView(R$id.iv_cover), ClassesType.isCoachType(classesHistory) ? ClassesHistoryModel.getCoachCoursePlayedBean(classesHistory).getCoverUrl() : ClassesHistoryModel.getMedationOnlineClassBean(classesHistory).getThumbUrl(), R$drawable.shape_net_img_placeholder, o.dp2px(50.0f), o.dp2px(80.0f));
    }

    private void showTitle(@NonNull BaseViewHolder baseViewHolder, ClassesHistory classesHistory) {
        String titleWithLocale;
        if (ClassesType.isCoachType(classesHistory)) {
            CoachCoursePlayedBean coachCoursePlayedBean = ClassesHistoryModel.getCoachCoursePlayedBean(classesHistory);
            titleWithLocale = ClassesHistoryModel.getTitleWithLocale(coachCoursePlayedBean.getCourseNameLanguageList());
            if (TextUtils.isEmpty(titleWithLocale)) {
                titleWithLocale = coachCoursePlayedBean.getCourseTitle();
            }
        } else {
            OnlineClassBean medationOnlineClassBean = ClassesHistoryModel.getMedationOnlineClassBean(classesHistory);
            titleWithLocale = ClassesHistoryModel.getTitleWithLocale(medationOnlineClassBean.getTitleLanguageList());
            if (TextUtils.isEmpty(titleWithLocale)) {
                titleWithLocale = medationOnlineClassBean.getTitle();
            }
        }
        baseViewHolder.setText(R$id.tv_title, titleWithLocale);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(@NonNull BaseViewHolder baseViewHolder, ClassesHistory classesHistory) {
        baseViewHolder.setText(R$id.tv_spent_kcal, c5.b.getKcalStr(getContext(), classesHistory.getSpentKcal()));
        Date date = new Date(classesHistory.getStartTimestamp());
        String format = m.format(date, getContext().getString(R$string.yyyy_mm_dd_format));
        String formatPeriodTime = formatPeriodTime(getContext(), date);
        baseViewHolder.setText(R$id.tv_training_date, format);
        baseViewHolder.setText(R$id.tv_training_time, formatPeriodTime);
        showCover(baseViewHolder, classesHistory);
        showTitle(baseViewHolder, classesHistory);
    }
}
