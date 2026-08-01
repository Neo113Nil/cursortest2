package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.gglhk.bofio.fortunetiger.R;
import java.util.Calendar;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class s extends BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public static final int f1329d = a0.c(null).getMaximum(4);

    /* renamed from: e, reason: collision with root package name */
    public static final int f1330e = (a0.c(null).getMaximum(7) + a0.c(null).getMaximum(5)) - 1;

    /* renamed from: a, reason: collision with root package name */
    public final r f1331a;

    /* renamed from: b, reason: collision with root package name */
    public androidx.emoji2.text.s f1332b;
    public final b c;

    public s(r rVar, b bVar) {
        this.f1331a = rVar;
        this.c = bVar;
        throw null;
    }

    public final int a(int i4) {
        do {
            i4++;
            if (i4 > f()) {
                return -1;
            }
        } while (!e(i4));
        return i4;
    }

    public final int b(int i4) {
        do {
            i4--;
            if (i4 < c()) {
                return -1;
            }
        } while (!e(i4));
        return i4;
    }

    public final int c() {
        int i4 = this.c.f1278j;
        r rVar = this.f1331a;
        Calendar calendar = rVar.f1324f;
        int i5 = calendar.get(7);
        if (i4 <= 0) {
            i4 = calendar.getFirstDayOfWeek();
        }
        int i6 = i5 - i4;
        return i6 < 0 ? i6 + rVar.f1325i : i6;
    }

    @Override // android.widget.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i4) {
        if (i4 < c() || i4 > f()) {
            return null;
        }
        int c = (i4 - c()) + 1;
        Calendar a4 = a0.a(this.f1331a.f1324f);
        a4.set(5, c);
        return Long.valueOf(a4.getTimeInMillis());
    }

    public final boolean e(int i4) {
        Long item = getItem(i4);
        if (item != null) {
            return item.longValue() >= this.c.h.f1282f;
        }
        return false;
    }

    public final int f() {
        return (c() + this.f1331a.f1326j) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f1330e;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i4) {
        return i4 / this.f1331a.f1325i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i4, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (this.f1332b == null) {
            this.f1332b = new androidx.emoji2.text.s(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int c = i4 - c();
        if (c >= 0) {
            r rVar = this.f1331a;
            if (c < rVar.f1326j) {
                textView.setTag(rVar);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(c + 1)));
                textView.setVisibility(0);
                textView.setEnabled(true);
                if (getItem(i4) == null || textView == null) {
                    return textView;
                }
                textView.getContext();
                a0.b().getTimeInMillis();
                throw null;
            }
        }
        textView.setVisibility(8);
        textView.setEnabled(false);
        if (getItem(i4) == null) {
            textView.getContext();
            a0.b().getTimeInMillis();
            throw null;
        }
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
