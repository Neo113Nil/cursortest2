package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.gdmhkmf.belbet.R;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class y extends BaseAdapter {

    /* renamed from: f, reason: collision with root package name */
    public static final int f1127f = i0.e(null).getMaximum(4);

    /* renamed from: g, reason: collision with root package name */
    public static final int f1128g = (i0.e(null).getMaximum(7) + i0.e(null).getMaximum(5)) - 1;

    /* renamed from: a, reason: collision with root package name */
    public final x f1129a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f1130b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f1131c;
    public d d;

    /* renamed from: e, reason: collision with root package name */
    public final b f1132e;

    public y(x xVar, f0 f0Var, b bVar) {
        this.f1129a = xVar;
        this.f1130b = f0Var;
        this.f1132e = bVar;
        this.f1131c = f0Var.a();
    }

    public final int a(int i) {
        do {
            i++;
            if (i > f()) {
                return -1;
            }
        } while (!e(i));
        return i;
    }

    public final int b(int i) {
        do {
            i--;
            if (i < c()) {
                return -1;
            }
        } while (!e(i));
        return i;
    }

    public final int c() {
        int i = this.f1132e.f1035j;
        x xVar = this.f1129a;
        Calendar calendar = xVar.f1122f;
        int i4 = calendar.get(7);
        if (i <= 0) {
            i = calendar.getFirstDayOfWeek();
        }
        int i5 = i4 - i;
        return i5 < 0 ? i5 + xVar.i : i5;
    }

    @Override // android.widget.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i) {
        if (i < c() || i > f()) {
            return null;
        }
        int c5 = (i - c()) + 1;
        Calendar c6 = i0.c(this.f1129a.f1122f);
        c6.set(5, c5);
        return Long.valueOf(c6.getTimeInMillis());
    }

    public final boolean e(int i) {
        Long item = getItem(i);
        if (item != null) {
            return item.longValue() >= this.f1132e.h.f1068f;
        }
        return false;
    }

    public final int f() {
        return (c() + this.f1129a.f1124j) - 1;
    }

    public final void g(TextView textView, long j2) {
        c cVar;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        boolean z4 = false;
        boolean z5 = i0.d().getTimeInMillis() == j2;
        f0 f0Var = this.f1130b;
        f0Var.getClass();
        Iterator it = new ArrayList().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        Iterator it2 = new ArrayList().iterator();
        if (it2.hasNext()) {
            it2.next().getClass();
            throw new ClassCastException();
        }
        Calendar d = i0.d();
        Calendar e4 = i0.e(null);
        e4.setTimeInMillis(j2);
        String format = d.get(1) == e4.get(1) ? i0.b("MMMMEEEEd", Locale.getDefault()).format(new Date(j2)) : i0.b("yMMMMEEEEd", Locale.getDefault()).format(new Date(j2));
        if (z5) {
            format = String.format(context.getString(R.string.mtrl_picker_today_description), format);
        }
        textView.setContentDescription(format);
        if (j2 >= this.f1132e.h.f1068f) {
            textView.setEnabled(true);
            ArrayList a5 = f0Var.a();
            int size = a5.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                Object obj = a5.get(i);
                i++;
                if (i0.a(j2) == i0.a(((Long) obj).longValue())) {
                    z4 = true;
                    break;
                }
            }
            textView.setSelected(z4);
            cVar = z4 ? this.d.f1050b : i0.d().getTimeInMillis() == j2 ? this.d.f1051c : this.d.f1049a;
        } else {
            textView.setEnabled(false);
            cVar = this.d.f1054g;
        }
        cVar.w(textView);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f1128g;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.f1129a.i;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View getView(int i, View view, ViewGroup viewGroup) {
        Long item;
        Context context = viewGroup.getContext();
        if (this.d == null) {
            this.d = new d(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int c5 = i - c();
        if (c5 >= 0) {
            x xVar = this.f1129a;
            if (c5 < xVar.f1124j) {
                textView.setTag(xVar);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(c5 + 1)));
                textView.setVisibility(0);
                textView.setEnabled(true);
                item = getItem(i);
                if (item != null) {
                    return textView;
                }
                g(textView, item.longValue());
                return textView;
            }
        }
        textView.setVisibility(8);
        textView.setEnabled(false);
        item = getItem(i);
        if (item != null) {
        }
    }

    public final void h(MaterialCalendarGridView materialCalendarGridView, long j2) {
        x c5 = x.c(j2);
        x xVar = this.f1129a;
        if (c5.equals(xVar)) {
            Calendar c6 = i0.c(xVar.f1122f);
            c6.setTimeInMillis(j2);
            g((TextView) materialCalendarGridView.getChildAt((materialCalendarGridView.b().c() + (c6.get(5) - 1)) - materialCalendarGridView.getFirstVisiblePosition()), j2);
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
