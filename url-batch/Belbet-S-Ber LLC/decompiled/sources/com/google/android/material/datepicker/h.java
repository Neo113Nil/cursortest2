package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.gdmhkmf.belbet.R;
import java.util.Calendar;
import java.util.Locale;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class h extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final Calendar f1070a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1071b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1072c;

    public h() {
        Calendar e4 = i0.e(null);
        this.f1070a = e4;
        this.f1071b = e4.getMaximum(7);
        this.f1072c = e4.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f1071b;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        int i4 = this.f1071b;
        if (i >= i4) {
            return null;
        }
        int i5 = i + this.f1072c;
        if (i5 > i4) {
            i5 -= i4;
        }
        return Integer.valueOf(i5);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i4 = i + this.f1072c;
        int i5 = this.f1071b;
        if (i4 > i5) {
            i4 -= i5;
        }
        Calendar calendar = this.f1070a;
        calendar.set(7, i4);
        textView.setText(calendar.getDisplayName(7, 4, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public h(int i) {
        Calendar e4 = i0.e(null);
        this.f1070a = e4;
        this.f1071b = e4.getMaximum(7);
        this.f1072c = i;
    }
}
