package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.winfour.winrandom.R;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class p extends BaseAdapter {
    public static final int d = w.c(null).getMaximum(4);

    /* renamed from: e, reason: collision with root package name */
    public static final int f1928e = (w.c(null).getMaximum(7) + w.c(null).getMaximum(5)) - 1;

    /* renamed from: a, reason: collision with root package name */
    public final o f1929a;

    /* renamed from: b, reason: collision with root package name */
    public c f1930b;

    /* renamed from: c, reason: collision with root package name */
    public final b f1931c;

    public p(o oVar, b bVar) {
        this.f1929a = oVar;
        this.f1931c = bVar;
        throw null;
    }

    public final int a() {
        int i = this.f1931c.f1865e;
        o oVar = this.f1929a;
        Calendar calendar = oVar.f1922a;
        int i2 = calendar.get(7);
        if (i <= 0) {
            i = calendar.getFirstDayOfWeek();
        }
        int i3 = i2 - i;
        return i3 < 0 ? i3 + oVar.d : i3;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i) {
        if (i < a() || i > c()) {
            return null;
        }
        int a2 = (i - a()) + 1;
        Calendar a3 = w.a(this.f1929a.f1922a);
        a3.set(5, a2);
        return Long.valueOf(a3.getTimeInMillis());
    }

    public final int c() {
        return (a() + this.f1929a.f1925e) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f1928e;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.f1929a.d;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (this.f1930b == null) {
            this.f1930b = new c(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int a2 = i - a();
        if (a2 >= 0) {
            o oVar = this.f1929a;
            if (a2 < oVar.f1925e) {
                textView.setTag(oVar);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(a2 + 1)));
                textView.setVisibility(0);
                textView.setEnabled(true);
                if (getItem(i) == null || textView == null) {
                    return textView;
                }
                textView.getContext();
                w.b().getTimeInMillis();
                throw null;
            }
        }
        textView.setVisibility(8);
        textView.setEnabled(false);
        if (getItem(i) == null) {
            textView.getContext();
            w.b().getTimeInMillis();
            throw null;
        }
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
