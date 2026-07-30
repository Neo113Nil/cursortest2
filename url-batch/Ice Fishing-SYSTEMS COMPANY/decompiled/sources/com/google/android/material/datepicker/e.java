package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.icefishing.icefishingliveapp.C5284R;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class e extends BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public static final int f36108d;

    /* renamed from: a, reason: collision with root package name */
    public final Calendar f36109a;

    /* renamed from: b, reason: collision with root package name */
    public final int f36110b;

    /* renamed from: c, reason: collision with root package name */
    public final int f36111c;

    static {
        f36108d = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public e() {
        Calendar c4 = w.c(null);
        this.f36109a = c4;
        this.f36110b = c4.getMaximum(7);
        this.f36111c = c4.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f36110b;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        int i4 = this.f36110b;
        if (i >= i4) {
            return null;
        }
        int i9 = i + this.f36111c;
        if (i9 > i4) {
            i9 -= i4;
        }
        return Integer.valueOf(i9);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C5284R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i4 = i + this.f36111c;
        int i9 = this.f36110b;
        if (i4 > i9) {
            i4 -= i9;
        }
        Calendar calendar = this.f36109a;
        calendar.set(7, i4);
        textView.setText(calendar.getDisplayName(7, f36108d, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(C5284R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public e(int i) {
        Calendar c4 = w.c(null);
        this.f36109a = c4;
        this.f36110b = c4.getMaximum(7);
        this.f36111c = i;
    }
}
