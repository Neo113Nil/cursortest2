package com.crrepa.band.my.health.water.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.ItemWaterCalendarBinding;
import com.crrepa.band.my.health.water.adapter.WaterCalendarMonthAdapter;
import com.crrepa.band.my.health.water.model.WaterCalendarModel;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public class WaterCalendarAdapter extends RecyclerView.Adapter<b> {
    private List<WaterCalendarModel> calendarModelList;
    private final Context context;
    private int currentYear = i3.a.getDateYear(new Date());
    private WaterCalendarMonthAdapter.a onCalendarDayClickListener;
    private a onScrollYearChangeListener;

    public interface a {
        void onYearChange(String str);
    }

    static class b extends RecyclerView.ViewHolder {
        ItemWaterCalendarBinding binding;

        public b(@NonNull View view) {
            super(view);
            this.binding = ItemWaterCalendarBinding.bind(view);
        }
    }

    public WaterCalendarAdapter(Context context) {
        this.context = context;
    }

    private void setCalendarDayList(RecyclerView recyclerView, WaterCalendarModel waterCalendarModel) {
        recyclerView.setLayoutManager(new GridLayoutManager(this.context, 7));
        WaterCalendarMonthAdapter waterCalendarMonthAdapter = new WaterCalendarMonthAdapter(this.context, waterCalendarModel.getCalendarWaterList(), i3.a.getDayOfWeek(waterCalendarModel.getMonth()) - 1);
        WaterCalendarMonthAdapter.a aVar = this.onCalendarDayClickListener;
        if (aVar != null) {
            waterCalendarMonthAdapter.setOnItemClickListener(aVar);
        }
        recyclerView.setAdapter(waterCalendarMonthAdapter);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<WaterCalendarModel> list = this.calendarModelList;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public void setCalendarModelList(List<WaterCalendarModel> list) {
        this.calendarModelList = list;
        notifyDataSetChanged();
    }

    public void setOnCalendarDayClickListener(WaterCalendarMonthAdapter.a aVar) {
        this.onCalendarDayClickListener = aVar;
    }

    public void setOnScrollYearChangeListener(a aVar) {
        this.onScrollYearChangeListener = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull b bVar, int i8) {
        int dateYear;
        List<WaterCalendarModel> list = this.calendarModelList;
        if (list == null || i8 >= list.size()) {
            return;
        }
        WaterCalendarModel waterCalendarModel = this.calendarModelList.get(i8);
        Date month = waterCalendarModel.getMonth();
        bVar.binding.tvCalendarMonth.setText(i3.a.getDateText(this.context, month, 2));
        setCalendarDayList(bVar.binding.rcvCalendarDay, waterCalendarModel);
        if (this.onScrollYearChangeListener == null || (dateYear = i3.a.getDateYear(month)) == this.currentYear) {
            return;
        }
        this.currentYear = dateYear;
        this.onScrollYearChangeListener.onYearChange(i3.a.getDateText(this.context, month, 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public b onCreateViewHolder(@NonNull ViewGroup viewGroup, int i8) {
        return new b(LayoutInflater.from(this.context).inflate(R.layout.item_water_calendar, viewGroup, false));
    }
}
