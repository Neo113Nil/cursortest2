package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.oriondriftchasers.arordrft.R;
import java.util.Calendar;
import java.util.Locale;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class e extends BaseAdapter {
    public static final int d;

    /* renamed from: a, reason: collision with root package name */
    public final Calendar f912a;

    /* renamed from: b, reason: collision with root package name */
    public final int f913b;

    /* renamed from: c, reason: collision with root package name */
    public final int f914c;

    static {
        d = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public e() {
        Calendar c4 = z.c(null);
        this.f912a = c4;
        this.f913b = c4.getMaximum(7);
        this.f914c = c4.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f913b;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        int i4 = this.f913b;
        if (i >= i4) {
            return null;
        }
        int i5 = i + this.f914c;
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
        int i4 = i + this.f914c;
        int i5 = this.f913b;
        if (i4 > i5) {
            i4 -= i5;
        }
        Calendar calendar = this.f912a;
        calendar.set(7, i4);
        textView.setText(calendar.getDisplayName(7, d, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public e(int i) {
        Calendar c4 = z.c(null);
        this.f912a = c4;
        this.f913b = c4.getMaximum(7);
        this.f914c = i;
    }
}
