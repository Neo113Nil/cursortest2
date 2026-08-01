package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.gglhk.bofio.fortunetiger.R;
import java.util.Calendar;
import java.util.Locale;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class d extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final Calendar f1284a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1285b;
    public final int c;

    public d() {
        Calendar c = a0.c(null);
        this.f1284a = c;
        this.f1285b = c.getMaximum(7);
        this.c = c.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f1285b;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i4) {
        int i5 = this.f1285b;
        if (i4 >= i5) {
            return null;
        }
        int i6 = i4 + this.c;
        if (i6 > i5) {
            i6 -= i5;
        }
        return Integer.valueOf(i6);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i4) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i4, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i5 = i4 + this.c;
        int i6 = this.f1285b;
        if (i5 > i6) {
            i5 -= i6;
        }
        Calendar calendar = this.f1284a;
        calendar.set(7, i5);
        textView.setText(calendar.getDisplayName(7, 4, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public d(int i4) {
        Calendar c = a0.c(null);
        this.f1284a = c;
        this.f1285b = c.getMaximum(7);
        this.c = i4;
    }
}
