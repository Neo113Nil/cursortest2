package com.haibin.calendarview;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
final class h extends com.haibin.calendarview.a {
    private c mDelegate;
    private int mItemHeight;
    private int mItemWidth;

    private static class a extends RecyclerView.ViewHolder {
        YearView mYearView;

        a(View view, c cVar) {
            super(view);
            YearView yearView = (YearView) view;
            this.mYearView = yearView;
            yearView.setup(cVar);
        }
    }

    h(Context context) {
        super(context);
    }

    @Override // com.haibin.calendarview.a
    RecyclerView.ViewHolder onCreateDefaultViewHolder(ViewGroup viewGroup, int i8) {
        View defaultYearView;
        if (TextUtils.isEmpty(this.mDelegate.getYearViewClassPath())) {
            defaultYearView = new DefaultYearView(this.mContext);
        } else {
            try {
                defaultYearView = (YearView) this.mDelegate.getYearViewClass().getConstructor(Context.class).newInstance(this.mContext);
            } catch (Exception e8) {
                e8.printStackTrace();
                defaultYearView = new DefaultYearView(this.mContext);
            }
        }
        defaultYearView.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
        return new a(defaultYearView, this.mDelegate);
    }

    final void setYearViewSize(int i8, int i9) {
        this.mItemWidth = i8;
        this.mItemHeight = i9;
    }

    final void setup(c cVar) {
        this.mDelegate = cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.haibin.calendarview.a
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, Month month, int i8) {
        YearView yearView = ((a) viewHolder).mYearView;
        yearView.init(month.getYear(), month.getMonth());
        yearView.measureSize(this.mItemWidth, this.mItemHeight);
    }
}
