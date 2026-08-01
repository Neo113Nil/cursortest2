package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.clutchquizarena.app.R;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class p extends BaseAdapter {
    public static final int d = w.c(null).getMaximum(4);

    /* renamed from: e, reason: collision with root package name */
    public static final int f1911e = (w.c(null).getMaximum(7) + w.c(null).getMaximum(5)) - 1;

    /* renamed from: a, reason: collision with root package name */
    public final o f1912a;

    /* renamed from: b, reason: collision with root package name */
    public c f1913b;

    /* renamed from: c, reason: collision with root package name */
    public final b f1914c;

    public p(o oVar, b bVar) {
        this.f1912a = oVar;
        this.f1914c = bVar;
        throw null;
    }

    public final int a() {
        int i = this.f1914c.f1848e;
        o oVar = this.f1912a;
        Calendar calendar = oVar.f1905a;
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
        Calendar a3 = w.a(this.f1912a.f1905a);
        a3.set(5, a2);
        return Long.valueOf(a3.getTimeInMillis());
    }

    public final int c() {
        return (a() + this.f1912a.f1908e) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f1911e;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.f1912a.d;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (this.f1913b == null) {
            this.f1913b = new c(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int a2 = i - a();
        if (a2 >= 0) {
            o oVar = this.f1912a;
            if (a2 < oVar.f1908e) {
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
