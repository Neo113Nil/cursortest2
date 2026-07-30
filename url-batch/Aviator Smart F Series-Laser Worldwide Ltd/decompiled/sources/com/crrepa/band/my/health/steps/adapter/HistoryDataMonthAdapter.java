package com.crrepa.band.my.health.steps.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.ItemHistoryDataMonthBinding;
import com.crrepa.band.my.health.base.HistoryCalendarAdapter;
import com.moyoung.dafit.module.common.utils.m;
import com.moyoung.dafit.module.common.widgets.CircleDisplayView;
import java.util.Date;
import java.util.Map;

/* loaded from: classes2.dex */
public class HistoryDataMonthAdapter extends RecyclerView.Adapter<c> {
    private int blankCount;
    private Context context;
    private Date date;
    private HistoryCalendarAdapter historyCalendarAdapter;
    private Map<Integer, Float> historyStepData;
    private b onSelectDayStepListener;
    private int type;

    class a implements View.OnClickListener {
        final /* synthetic */ int val$dayNumber;
        final /* synthetic */ c val$holder;

        a(int i8, c cVar) {
            this.val$dayNumber = i8;
            this.val$holder = cVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HistoryDataMonthAdapter.this.handleSeeStepDetails(this.val$dayNumber, this.val$holder);
        }
    }

    public interface b {
        void onSelectDay(CircleDisplayView circleDisplayView, Date date);
    }

    static class c extends RecyclerView.ViewHolder {
        ItemHistoryDataMonthBinding binding;

        c(ItemHistoryDataMonthBinding itemHistoryDataMonthBinding) {
            super(itemHistoryDataMonthBinding.getRoot());
            this.binding = itemHistoryDataMonthBinding;
        }
    }

    public HistoryDataMonthAdapter(Context context, HistoryCalendarAdapter historyCalendarAdapter, Date date, Map<Integer, Float> map) {
        this.context = context;
        this.historyCalendarAdapter = historyCalendarAdapter;
        this.date = date;
        this.historyStepData = map;
        this.blankCount = m.isDayOfWeekOfFirstDayOfMonth(date) - 1;
    }

    private float getCompletion(int i8) {
        Float f8;
        Map<Integer, Float> map = this.historyStepData;
        if (map == null || (f8 = map.get(Integer.valueOf(i8))) == null) {
            return 0.0f;
        }
        return f8.floatValue();
    }

    @NonNull
    private Date getSelectDate(int i8) {
        return m.getDateOfDayNumber(this.date, i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleSeeStepDetails(int i8, c cVar) {
        if (this.onSelectDayStepListener == null) {
            return;
        }
        if (m.getMonthNumber(this.date) != m.getMonthNumber(new Date()) || m.getDayOfMonth(new Date()) >= i8) {
            this.onSelectDayStepListener.onSelectDay(cVar.binding.cdvDailyDegreeCompletion, getSelectDate(i8));
        }
    }

    private boolean isSameDay(Date date, int i8) {
        Date highLightDate = this.historyCalendarAdapter.getHighLightDate();
        return m.getMonthNumber(date) == m.getMonthNumber(highLightDate) && m.getDayOfMonth(highLightDate) == i8;
    }

    private void setDegreeCompletion(CircleDisplayView circleDisplayView, float f8, int i8) {
        int color;
        circleDisplayView.setValueWidthPercent(20.0f);
        circleDisplayView.setDimAlpha(50);
        circleDisplayView.setDrawInnerCircle(true);
        circleDisplayView.setDrawText(true);
        switch (getType()) {
            case 1:
                color = ContextCompat.getColor(this.context, R.color.color_step_same_age_group_bar_high_light_bg);
                break;
            case 2:
                color = ContextCompat.getColor(this.context, R.color.color_sleep_same_age_group_bar_high_light_bg);
                break;
            case 3:
                color = ContextCompat.getColor(this.context, R.color.color_heart_rate_high_light_bg);
                break;
            case 4:
                color = ContextCompat.getColor(this.context, R.color.color_temperature_completion_circle_bg);
                break;
            case 5:
                color = ContextCompat.getColor(this.context, R.color.color_bo_completion_circle_bg);
                break;
            case 6:
                color = ContextCompat.getColor(this.context, R.color.color_stress_completion_circle_bg);
                break;
            case 7:
                color = ContextCompat.getColor(this.context, R.color.color_gomore_sport_exercise_capacity_completion_circle_bg);
                break;
            case 8:
                color = ContextCompat.getColor(this.context, R.color.color_gomore_sport_training_analysis_completion_circle_bg);
                break;
            case 9:
                color = ContextCompat.getColor(this.context, R.color.color_gomore_sport_training_recovery_completion_circle_bg);
                break;
            default:
                color = 0;
                break;
        }
        circleDisplayView.setColor(color);
        circleDisplayView.setCustomText(String.valueOf(i8));
        circleDisplayView.showValue(f8 * 100.0f, 100.0f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return m.getMonthCountDay(this.date) + this.blankCount;
    }

    public int getType() {
        return this.type;
    }

    public void setOnSelectDayStepListener(b bVar) {
        this.onSelectDayStepListener = bVar;
    }

    public void setType(int i8) {
        this.type = i8;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(c cVar, int i8) {
        int i9 = this.blankCount;
        if (i8 < i9) {
            cVar.binding.cdvDailyDegreeCompletion.setVisibility(8);
            return;
        }
        int i10 = (i8 - i9) + 1;
        setDegreeCompletion(cVar.binding.cdvDailyDegreeCompletion, getCompletion(i10), i10);
        if (isSameDay(this.date, i10)) {
            this.historyCalendarAdapter.drawInnerCircle(cVar.binding.cdvDailyDegreeCompletion);
        }
        cVar.itemView.setOnClickListener(new a(i10, cVar));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public c onCreateViewHolder(ViewGroup viewGroup, int i8) {
        return new c(ItemHistoryDataMonthBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
    }
}
