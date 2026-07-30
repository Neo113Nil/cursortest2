package com.crrepa.band.my.health.water.adapter;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.databinding.ItemWaterCalendarDayBinding;
import com.crrepa.band.my.health.widgets.WaveCalendarView;
import com.crrepa.band.my.model.db.Water;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public class WaterCalendarMonthAdapter extends RecyclerView.Adapter<b> {
    private final int blankCount;
    private final Context context;
    private a onItemClickListener;
    private final List<Water> calendarWaterList = new ArrayList();
    private final Date todayDate = new Date();

    public interface a {
        void onItemClick(Water water);
    }

    static class b extends RecyclerView.ViewHolder {
        ItemWaterCalendarDayBinding binding;

        public b(@NonNull View view) {
            super(view);
            this.binding = ItemWaterCalendarDayBinding.bind(view);
        }
    }

    public WaterCalendarMonthAdapter(Context context, List<Water> list, int i8) {
        this.context = context;
        this.blankCount = i8;
        for (int i9 = 0; i9 < i8; i9++) {
            this.calendarWaterList.add(null);
        }
        this.calendarWaterList.addAll(list);
    }

    private void initWaveView(WaveCalendarView waveCalendarView) {
        Drawable drawable = ContextCompat.getDrawable(this.context, R$drawable.water_calendar_bg);
        if (drawable != null) {
            drawable.setColorFilter(ContextCompat.getColor(this.context, R.color.water_main_2_cup), PorterDuff.Mode.SRC_ATOP);
            waveCalendarView.setBackground(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onBindViewHolder$0(Water water, View view) {
        this.onItemClickListener.onItemClick(water);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.calendarWaterList.size();
    }

    public void setOnItemClickListener(a aVar) {
        this.onItemClickListener = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull b bVar, int i8) {
        initWaveView(bVar.binding.wcvWater);
        if (i8 < this.calendarWaterList.size()) {
            final Water water = this.calendarWaterList.get(i8);
            if (water == null) {
                bVar.itemView.setVisibility(8);
                return;
            }
            bVar.binding.wcvWater.setWaterLevelRatio((water.getPercentage().intValue() * 1.0f) / 100.0f);
            bVar.binding.tvCalendarDay.setText(String.valueOf((i8 - this.blankCount) + 1));
            Date date = water.getDate();
            boolean isGreaterDay = i3.a.isGreaterDay(date, this.todayDate);
            if (i3.a.isSameDay(date, this.todayDate)) {
                bVar.binding.tvCalendarDay.setTextColor(ContextCompat.getColor(this.context, R.color.white));
                bVar.binding.tvCalendarDay.setBackgroundResource(R.drawable.shape_water_calendar_day_bg);
            } else {
                bVar.binding.tvCalendarDay.setBackgroundResource(0);
                bVar.binding.tvCalendarDay.setTextColor(ContextCompat.getColor(this.context, R.color.black));
            }
            if (isGreaterDay || this.onItemClickListener == null) {
                return;
            }
            bVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.health.water.adapter.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    WaterCalendarMonthAdapter.this.lambda$onBindViewHolder$0(water, view);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public b onCreateViewHolder(@NonNull ViewGroup viewGroup, int i8) {
        return new b(LayoutInflater.from(this.context).inflate(R.layout.item_water_calendar_day, viewGroup, false));
    }
}
