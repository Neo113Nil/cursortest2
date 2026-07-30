package com.crrepa.band.my.health.base;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.health.steps.model.LastWeekActivityStandardModel;
import com.moyoung.dafit.module.common.utils.m;
import com.moyoung.dafit.module.common.utils.u;
import com.moyoung.dafit.module.common.widgets.CircleDisplayView;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public class LastWeekActivityStandardAdapter extends BaseQuickAdapter<LastWeekActivityStandardModel, BaseViewHolder> {
    public static final float CIRCLE_DISPLAY_MAX_VALUE = 100.0f;
    private Date todayDate;

    public LastWeekActivityStandardAdapter() {
        super(R.layout.item_last_week_step_standard);
        this.todayDate = new Date();
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < 7; i8++) {
            arrayList.add(new LastWeekActivityStandardModel(0.0f));
        }
        setNewInstance(arrayList);
    }

    private String getDateOfPosition(Context context, int i8) {
        Date dateOfOffsetDay = m.getDateOfOffsetDay(this.todayDate, i8 - 6);
        String string = context.getString(R.string.month_day_format);
        if (u.isEN()) {
            string = context.getString(R.string.month_day_format_en);
        }
        return m.format(dateOfOffsetDay, string);
    }

    private void setDegreeCompletion(CircleDisplayView circleDisplayView, float f8) {
        circleDisplayView.setColor(ContextCompat.getColor(circleDisplayView.getContext(), R.color.color_step_daily_completion));
        circleDisplayView.setValueWidthPercent(27.0f);
        circleDisplayView.setDimAlpha(50);
        circleDisplayView.setDrawInnerCircle(true);
        circleDisplayView.setDrawText(false);
        circleDisplayView.showValue(f8 * 100.0f, 100.0f);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return 7;
    }

    public void setData(List<LastWeekActivityStandardModel> list, Date date) {
        this.todayDate = date;
        setNewInstance(list);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(BaseViewHolder baseViewHolder, LastWeekActivityStandardModel lastWeekActivityStandardModel) {
        CircleDisplayView circleDisplayView = (CircleDisplayView) baseViewHolder.getView(R.id.cd_daily_step_standard);
        setDegreeCompletion(circleDisplayView, lastWeekActivityStandardModel.getCompletion());
        baseViewHolder.setText(R.id.tv_activity_date, getDateOfPosition(circleDisplayView.getContext(), getItemPosition(lastWeekActivityStandardModel)));
    }
}
