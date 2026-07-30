package com.crrepa.band.my.health.base;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.ItemHistoryDataCalendarBinding;
import com.crrepa.band.my.health.steps.adapter.HistoryDataMonthAdapter;
import com.crrepa.band.my.model.CalendarHistoryCompletionModel;
import com.moyoung.dafit.module.common.utils.k;
import com.moyoung.dafit.module.common.utils.m;
import com.moyoung.dafit.module.common.widgets.CircleDisplayView;
import java.lang.ref.WeakReference;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public class HistoryCalendarAdapter extends RecyclerView.Adapter<c> {
    private CalendarHistoryCompletionModel calendarHistoryCompletionModel;
    private Context context;
    private Date highLightDate;
    private a onSeeHistoryDetailsListener = new a(this);
    private b onStatisticsDateListener;
    private CircleDisplayView previousCircleDisplayView;

    static class a implements HistoryDataMonthAdapter.b {
        private WeakReference<HistoryCalendarAdapter> weakReference;

        public a(HistoryCalendarAdapter historyCalendarAdapter) {
            this.weakReference = new WeakReference<>(historyCalendarAdapter);
        }

        @Override // com.crrepa.band.my.health.steps.adapter.HistoryDataMonthAdapter.b
        public void onSelectDay(CircleDisplayView circleDisplayView, Date date) {
            HistoryCalendarAdapter historyCalendarAdapter = this.weakReference.get();
            historyCalendarAdapter.drawInnerCircle(circleDisplayView);
            historyCalendarAdapter.onStatisticsDateListener.onStatisticsDate(date);
        }
    }

    public interface b {
        void onStatisticsDate(Date date);
    }

    static class c extends RecyclerView.ViewHolder {
        ItemHistoryDataCalendarBinding binding;

        c(ItemHistoryDataCalendarBinding itemHistoryDataCalendarBinding) {
            super(itemHistoryDataCalendarBinding.getRoot());
            this.binding = itemHistoryDataCalendarBinding;
        }
    }

    public HistoryCalendarAdapter(Context context, Date date) {
        this.context = context;
        this.highLightDate = date;
    }

    private int getHistoryMonthCount(Date date) {
        return m.getMonthSapce(this.calendarHistoryCompletionModel.getStartDate(), date);
    }

    private String getMonthOfPotision(Date date) {
        Calendar calendar = k.getCalendar();
        calendar.setTime(date);
        return calendar.getDisplayName(2, 2, Locale.getDefault());
    }

    private void setMonthHistoryData(RecyclerView recyclerView, Date date, Map<Integer, Float> map) {
        recyclerView.setLayoutManager(new GridLayoutManager(this.context, 7));
        HistoryDataMonthAdapter historyDataMonthAdapter = new HistoryDataMonthAdapter(this.context, this, date, map);
        if (this.onStatisticsDateListener != null) {
            historyDataMonthAdapter.setOnSelectDayStepListener(this.onSeeHistoryDetailsListener);
        }
        historyDataMonthAdapter.setType(this.calendarHistoryCompletionModel.getType());
        recyclerView.setAdapter(historyDataMonthAdapter);
    }

    public void drawInnerCircle(CircleDisplayView circleDisplayView) {
        int i8;
        if (this.previousCircleDisplayView != null) {
            i8 = ContextCompat.getColor(this.context, R.color.white);
            this.previousCircleDisplayView.setInnerCircleColor(i8);
        } else {
            i8 = 0;
        }
        switch (this.calendarHistoryCompletionModel.getType()) {
            case 1:
                i8 = ContextCompat.getColor(this.context, R.color.color_step_daily_completion_inner_circle_bg);
                break;
            case 2:
                i8 = ContextCompat.getColor(this.context, R.color.color_sleep_daily_completion_inner_circle_bg);
                break;
            case 3:
                i8 = ContextCompat.getColor(this.context, R.color.color_heart_rate_daily_completion_inner_circle_bg);
                break;
            case 4:
                i8 = ContextCompat.getColor(this.context, R.color.color_temperature_completion_inner_circle_bg);
                break;
            case 5:
                i8 = ContextCompat.getColor(this.context, R.color.color_bo_completion_inner_circle_bg);
                break;
            case 6:
                i8 = ContextCompat.getColor(this.context, R.color.color_stress_completion_inner_circle_bg);
                break;
            case 7:
                i8 = ContextCompat.getColor(this.context, R.color.color_gomore_sport_exercise_capacity_completion_inner_circle_bg);
                break;
            case 8:
                i8 = ContextCompat.getColor(this.context, R.color.color_gomore_sport_training_analysis_completion_inner_circle_bg);
                break;
            case 9:
                i8 = ContextCompat.getColor(this.context, R.color.color_gomore_sport_training_recovery_completion_inner_circle_bg);
                break;
        }
        circleDisplayView.setTextColor(ContextCompat.getColor(circleDisplayView.getContext(), R.color.white));
        circleDisplayView.setInnerCircleColor(i8);
        circleDisplayView.invalidate();
        this.previousCircleDisplayView = circleDisplayView;
    }

    public int getCurrentDatePosition() {
        return getHistoryMonthCount(this.highLightDate);
    }

    public Date getDateOfPosition(int i8) {
        return m.getDateOfOffsetMonth(this.calendarHistoryCompletionModel.getStartDate(), i8);
    }

    public Date getHighLightDate() {
        return this.highLightDate;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (this.calendarHistoryCompletionModel == null) {
            return 0;
        }
        return getHistoryMonthCount(new Date()) + 1;
    }

    public void setHistoryData(CalendarHistoryCompletionModel calendarHistoryCompletionModel) {
        this.calendarHistoryCompletionModel = calendarHistoryCompletionModel;
        notifyDataSetChanged();
    }

    public void setOnStatisticsDateListener(b bVar) {
        this.onStatisticsDateListener = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(c cVar, int i8) {
        Date dateOfOffsetMonth = m.getDateOfOffsetMonth(this.calendarHistoryCompletionModel.getStartDate(), i8);
        cVar.binding.tvMonth.setText(getMonthOfPotision(dateOfOffsetMonth));
        setMonthHistoryData(cVar.binding.rcvDayOfMonth, dateOfOffsetMonth, this.calendarHistoryCompletionModel.getMonthStepCompletion(dateOfOffsetMonth));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public c onCreateViewHolder(ViewGroup viewGroup, int i8) {
        return new c(ItemHistoryDataCalendarBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
    }
}
