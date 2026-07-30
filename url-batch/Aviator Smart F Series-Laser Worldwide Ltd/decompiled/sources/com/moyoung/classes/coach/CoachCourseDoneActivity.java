package com.moyoung.classes.coach;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.moyoung.classes.R$drawable;
import com.moyoung.classes.coach.adapter.CoachActionPlayedAdapter;
import com.moyoung.classes.coach.model.CoachActionPlayedBean;
import com.moyoung.classes.coach.model.CoachCoursePlayedBean;
import com.moyoung.classes.completed.model.ClassesHistoryModel;
import com.moyoung.classes.completed.model.ClassesRecentBean;
import com.moyoung.classes.completed.model.ClassesRecentModel;
import com.moyoung.classes.databinding.ActivityCoachCourseDoneBinding;
import com.moyoung.classes.db.ClassesHistory;
import com.moyoung.classes.meditation.onlineclass.model.OnlineClassDoneEvent;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.k0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class CoachCourseDoneActivity extends BaseVBActivity<ActivityCoachCourseDoneBinding> {
    private CoachActionPlayedBean getBeanFromCombinedList(List<CoachActionPlayedBean> list, CoachActionPlayedBean coachActionPlayedBean) {
        for (CoachActionPlayedBean coachActionPlayedBean2 : list) {
            if (coachActionPlayedBean2.getActionId() == coachActionPlayedBean.getActionId() && coachActionPlayedBean2.getActionIndex() == coachActionPlayedBean.getActionIndex()) {
                return coachActionPlayedBean2;
            }
        }
        return null;
    }

    private List<CoachActionPlayedBean> getCombinedActionList(List<CoachActionPlayedBean> list) {
        ArrayList arrayList = new ArrayList();
        for (CoachActionPlayedBean coachActionPlayedBean : list) {
            CoachActionPlayedBean beanFromCombinedList = getBeanFromCombinedList(arrayList, coachActionPlayedBean);
            if (beanFromCombinedList != null) {
                beanFromCombinedList.setSpentTimeMs(beanFromCombinedList.getSpentTimeMs() + coachActionPlayedBean.getSpentTimeMs());
            } else {
                arrayList.add(coachActionPlayedBean);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$1(View view) {
        finish();
    }

    private static void recordRecentPlayedClass(CoachCoursePlayedBean coachCoursePlayedBean) {
        ClassesRecentModel.recordRecentPlayedClass(new ClassesRecentBean(coachCoursePlayedBean.getCourseId(), 1, coachCoursePlayedBean.getCourseTitle(), coachCoursePlayedBean.getCourseNameLanguageList(), coachCoursePlayedBean.getCoverUrl(), coachCoursePlayedBean.getCourseDuration()));
        org.greenrobot.eventbus.c.getDefault().post(new OnlineClassDoneEvent());
    }

    @SuppressLint({"SetTextI18n"})
    private void showCourseDetail(ClassesHistory classesHistory, CoachCoursePlayedBean coachCoursePlayedBean) {
        com.moyoung.dafit.module.common.imageload.c.load(((ActivityCoachCourseDoneBinding) this.binding).ivCover, coachCoursePlayedBean.getCoverUrl(), R$drawable.shape_net_img_placeholder, c5.d.getScreenWidth(this), com.moyoung.dafit.module.common.utils.o.dp2px(282.0f));
        String titleWithLocale = ClassesHistoryModel.getTitleWithLocale(coachCoursePlayedBean.getCourseNameLanguageList());
        if (TextUtils.isEmpty(titleWithLocale)) {
            titleWithLocale = coachCoursePlayedBean.getCourseTitle();
        }
        ((ActivityCoachCourseDoneBinding) this.binding).tvTitle.setText(titleWithLocale);
        ((ActivityCoachCourseDoneBinding) this.binding).tvDuration.setText(c5.b.ms2MinuteRoundStr(this, coachCoursePlayedBean.getCourseDuration()));
        ((ActivityCoachCourseDoneBinding) this.binding).tvKcal.setText(c5.b.getKcalStr(getApplicationContext(), coachCoursePlayedBean.getCourseKcal()));
        ((ActivityCoachCourseDoneBinding) this.binding).tvSpentTime.setText(c5.b.ms2HourAndMinAndSecondStr(classesHistory.getSpentTime()));
        ((ActivityCoachCourseDoneBinding) this.binding).tvSpentKcal.setText(classesHistory.getSpentKcal() + "");
        ((ActivityCoachCourseDoneBinding) this.binding).tvLevel.setText(c5.b.getLevelStr(getApplicationContext(), coachCoursePlayedBean.getCourseLevel()));
        ((ActivityCoachCourseDoneBinding) this.binding).tvLevel.setCompoundDrawablesWithIntrinsicBounds(c5.b.getLevelDrawable(getApplicationContext(), coachCoursePlayedBean.getCourseLevel()), (Drawable) null, (Drawable) null, (Drawable) null);
        String courseStartDateStr = c5.b.getCourseStartDateStr(getApplicationContext(), coachCoursePlayedBean.getCompletedTimestamp());
        if (TextUtils.isEmpty(courseStartDateStr)) {
            ((ActivityCoachCourseDoneBinding) this.binding).tvCompletedTime.setVisibility(8);
        } else {
            ((ActivityCoachCourseDoneBinding) this.binding).tvCompletedTime.setText(courseStartDateStr);
        }
        CoachActionPlayedAdapter coachActionPlayedAdapter = new CoachActionPlayedAdapter();
        ((ActivityCoachCourseDoneBinding) this.binding).rvPlayedAction.setAdapter(coachActionPlayedAdapter);
        coachActionPlayedAdapter.setNewData(getCombinedActionList(coachCoursePlayedBean.getActionPlayedList()));
    }

    public static void start(Context context, ClassesHistory classesHistory) {
        Intent intent = new Intent(context, (Class<?>) CoachCourseDoneActivity.class);
        intent.putExtra(ClassesHistory.class.getName(), classesHistory);
        context.startActivity(intent);
    }

    public static void startFromHistory(Context context, ClassesHistory classesHistory) {
        Intent intent = new Intent(context, (Class<?>) CoachCourseDoneActivity.class);
        intent.putExtra(ClassesHistory.class.getName(), classesHistory);
        intent.putExtra("isFromHistory", true);
        context.startActivity(intent);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected boolean getFitsSystemWindows() {
        return false;
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        k0.setDarkMode(getWindow());
        ((ActivityCoachCourseDoneBinding) this.binding).rvPlayedAction.setLayoutManager(new LinearLayoutManager(this, 1, false));
        ((ActivityCoachCourseDoneBinding) this.binding).ivClose.setOnClickListener(new View.OnClickListener() { // from class: com.moyoung.classes.coach.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoachCourseDoneActivity.this.lambda$initBinding$0(view);
            }
        });
        ((ActivityCoachCourseDoneBinding) this.binding).tvDone.setOnClickListener(new View.OnClickListener() { // from class: com.moyoung.classes.coach.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoachCourseDoneActivity.this.lambda$initBinding$1(view);
            }
        });
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void loadData() {
        super.loadData();
        ClassesHistory classesHistory = (ClassesHistory) getIntent().getSerializableExtra(ClassesHistory.class.getName());
        if (classesHistory == null) {
            finish();
            return;
        }
        CoachCoursePlayedBean coachCoursePlayedBean = ClassesHistoryModel.getCoachCoursePlayedBean(classesHistory);
        showCourseDetail(classesHistory, coachCoursePlayedBean);
        if (!getIntent().getBooleanExtra("isFromHistory", false)) {
            recordRecentPlayedClass(coachCoursePlayedBean);
            return;
        }
        ((ActivityCoachCourseDoneBinding) this.binding).slDone.setVisibility(8);
        ((ActivityCoachCourseDoneBinding) this.binding).viewBottom.setVisibility(8);
        ((ActivityCoachCourseDoneBinding) this.binding).ivClose.setVisibility(0);
    }
}
