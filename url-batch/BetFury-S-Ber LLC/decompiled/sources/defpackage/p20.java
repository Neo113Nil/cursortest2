package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.trembin.nirefon.betfury.R;
import java.util.Calendar;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class p20 extends BaseAdapter {
    public static final int i = xk0.c(null).getMaximum(4);
    public static final int j = (xk0.c(null).getMaximum(7) + xk0.c(null).getMaximum(5)) - 1;
    public final o20 f;
    public s6 g;
    public final ca h;

    public p20(o20 o20Var, ca caVar) {
        this.f = o20Var;
        this.h = caVar;
        throw null;
    }

    public final int a(int i2) {
        do {
            i2++;
            if (i2 > f()) {
                return -1;
            }
        } while (!e(i2));
        return i2;
    }

    public final int b(int i2) {
        do {
            i2--;
            if (i2 < c()) {
                return -1;
            }
        } while (!e(i2));
        return i2;
    }

    public final int c() {
        int i2 = this.h.j;
        o20 o20Var = this.f;
        Calendar calendar = o20Var.f;
        int i3 = calendar.get(7);
        if (i2 <= 0) {
            i2 = calendar.getFirstDayOfWeek();
        }
        int i4 = i3 - i2;
        return i4 < 0 ? i4 + o20Var.i : i4;
    }

    @Override // android.widget.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i2) {
        if (i2 < c() || i2 > f()) {
            return null;
        }
        int c = (i2 - c()) + 1;
        Calendar a = xk0.a(this.f.f);
        a.set(5, c);
        return Long.valueOf(a.getTimeInMillis());
    }

    public final boolean e(int i2) {
        Long item = getItem(i2);
        if (item != null) {
            return item.longValue() >= this.h.h.f;
        }
        return false;
    }

    public final int f() {
        return (c() + this.f.j) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return j;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        return i2 / this.f.i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (this.g == null) {
            this.g = new s6(context, 3);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int c = i2 - c();
        if (c >= 0) {
            o20 o20Var = this.f;
            if (c < o20Var.j) {
                textView.setTag(o20Var);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(c + 1)));
                textView.setVisibility(0);
                textView.setEnabled(true);
                if (getItem(i2) == null || textView == null) {
                    return textView;
                }
                textView.getContext();
                xk0.b().getTimeInMillis();
                throw null;
            }
        }
        textView.setVisibility(8);
        textView.setEnabled(false);
        if (getItem(i2) == null) {
            textView.getContext();
            xk0.b().getTimeInMillis();
            throw null;
        }
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
