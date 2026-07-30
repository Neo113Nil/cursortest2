package com.haibin.calendarview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.haibin.calendarview.a;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class YearRecyclerView extends RecyclerView {
    private h mAdapter;
    private c mDelegate;
    private b mListener;

    class a implements a.c {
        a() {
        }

        @Override // com.haibin.calendarview.a.c
        public void onItemClick(int i8, long j8) {
            Month month;
            if (YearRecyclerView.this.mListener == null || YearRecyclerView.this.mDelegate == null || (month = (Month) YearRecyclerView.this.mAdapter.getItem(i8)) == null || !com.haibin.calendarview.b.isMonthInRange(month.getYear(), month.getMonth(), YearRecyclerView.this.mDelegate.getMinYear(), YearRecyclerView.this.mDelegate.getMinYearMonth(), YearRecyclerView.this.mDelegate.getMaxYear(), YearRecyclerView.this.mDelegate.getMaxYearMonth())) {
                return;
            }
            YearRecyclerView.this.mListener.onMonthSelected(month.getYear(), month.getMonth());
            YearRecyclerView.this.mDelegate.getClass();
        }
    }

    interface b {
        void onMonthSelected(int i8, int i9);
    }

    public YearRecyclerView(Context context) {
        this(context, null);
    }

    final void init(int i8) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        for (int i9 = 1; i9 <= 12; i9++) {
            calendar.set(i8, i9 - 1, 1);
            int monthDaysCount = com.haibin.calendarview.b.getMonthDaysCount(i8, i9);
            Month month = new Month();
            month.setDiff(com.haibin.calendarview.b.getMonthViewStartDiff(i8, i9, this.mDelegate.getWeekStart()));
            month.setCount(monthDaysCount);
            month.setMonth(i9);
            month.setYear(i8);
            this.mAdapter.addItem(month);
        }
    }

    void notifyAdapterDataSetChanged() {
        if (getAdapter() == null) {
            return;
        }
        getAdapter().notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    protected void onMeasure(int i8, int i9) {
        super.onMeasure(i8, i9);
        int size = View.MeasureSpec.getSize(i9);
        this.mAdapter.setYearViewSize(View.MeasureSpec.getSize(i8) / 3, size / 4);
    }

    final void setOnMonthSelectedListener(b bVar) {
        this.mListener = bVar;
    }

    final void setup(c cVar) {
        this.mDelegate = cVar;
        this.mAdapter.setup(cVar);
    }

    final void updateStyle() {
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            YearView yearView = (YearView) getChildAt(i8);
            yearView.updateStyle();
            yearView.invalidate();
        }
    }

    final void updateWeekStart() {
        Iterator<Object> it = this.mAdapter.getItems().iterator();
        while (it.hasNext()) {
            Month month = (Month) it.next();
            month.setDiff(com.haibin.calendarview.b.getMonthViewStartDiff(month.getYear(), month.getMonth(), this.mDelegate.getWeekStart()));
        }
    }

    public YearRecyclerView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mAdapter = new h(context);
        setLayoutManager(new GridLayoutManager(context, 3));
        setAdapter(this.mAdapter);
        this.mAdapter.setOnItemClickListener(new a());
    }
}
