package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.oriondriftchasers.arordrft.R;
import java.util.Calendar;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class s extends BaseAdapter {
    public static final int d = z.c(null).getMaximum(4);

    /* renamed from: e, reason: collision with root package name */
    public static final int f961e = (z.c(null).getMaximum(7) + z.c(null).getMaximum(5)) - 1;

    /* renamed from: a, reason: collision with root package name */
    public final r f962a;

    /* renamed from: b, reason: collision with root package name */
    public c f963b;

    /* renamed from: c, reason: collision with root package name */
    public final b f964c;

    public s(r rVar, b bVar) {
        this.f962a = rVar;
        this.f964c = bVar;
        throw null;
    }

    public final int a() {
        int i = this.f964c.f906j;
        r rVar = this.f962a;
        Calendar calendar = rVar.f955f;
        int i4 = calendar.get(7);
        if (i <= 0) {
            i = calendar.getFirstDayOfWeek();
        }
        int i5 = i4 - i;
        return i5 < 0 ? i5 + rVar.i : i5;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i) {
        if (i < a() || i > c()) {
            return null;
        }
        int a2 = (i - a()) + 1;
        Calendar a4 = z.a(this.f962a.f955f);
        a4.set(5, a2);
        return Long.valueOf(a4.getTimeInMillis());
    }

    public final int c() {
        return (a() + this.f962a.f958j) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f961e;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.f962a.i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (this.f963b == null) {
            this.f963b = new c(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int a2 = i - a();
        if (a2 >= 0) {
            r rVar = this.f962a;
            if (a2 < rVar.f958j) {
                textView.setTag(rVar);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(a2 + 1)));
                textView.setVisibility(0);
                textView.setEnabled(true);
                if (getItem(i) == null || textView == null) {
                    return textView;
                }
                textView.getContext();
                z.b().getTimeInMillis();
                throw null;
            }
        }
        textView.setVisibility(8);
        textView.setEnabled(false);
        if (getItem(i) == null) {
            textView.getContext();
            z.b().getTimeInMillis();
            throw null;
        }
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
