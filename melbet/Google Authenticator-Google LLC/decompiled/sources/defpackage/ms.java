package defpackage;

import android.graphics.Canvas;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ms {
    private int a;

    public ms() {
        this.a = -1;
    }

    public static int a(int i, int i2) {
        int i3;
        int i4 = i & 789516;
        if (i4 == 0) {
            return i;
        }
        int i5 = i & (~i4);
        if (i2 == 0) {
            i3 = i4 << 2;
        } else {
            int i6 = i4 + i4;
            i5 |= (-789517) & i6;
            i3 = (i6 & 789516) << 2;
        }
        return i5 | i3;
    }

    public static final void d(lp lpVar) {
        View view = lpVar.a;
        Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
        if (tag instanceof Float) {
            float floatValue = ((Float) tag).floatValue();
            int i = yq.a;
            view.setElevation(floatValue);
        }
        view.setTag(R.id.item_touch_helper_previous_elevation, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    public static final int e(int i, int i2) {
        int i3;
        int i4 = i & 3158064;
        if (i4 == 0) {
            return i;
        }
        int i5 = i & (~i4);
        if (i2 == 0) {
            i3 = i4 >> 2;
        } else {
            int i6 = i4 >> 1;
            i5 |= (-3158065) & i6;
            i3 = (i6 & 3158064) >> 2;
        }
        return i5 | i3;
    }

    public void b(Canvas canvas, RecyclerView recyclerView, lp lpVar, float f, float f2, int i, boolean z) {
        throw null;
    }

    public final int c(RecyclerView recyclerView, int i, int i2, long j) {
        int i3 = this.a;
        if (i3 == -1) {
            i3 = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
            this.a = i3;
        }
        int abs = Math.abs(i2);
        int signum = (int) Math.signum(i2);
        float min = Math.min(1.0f, abs / i) - 1.0f;
        float f = j > 2000 ? 1.0f : j / 2000.0f;
        int i4 = (int) (((int) (signum * i3 * ((min * min * min * min * min) + 1.0f))) * f * f * f * f * f);
        return i4 == 0 ? i2 > 0 ? 1 : -1 : i4;
    }

    public int f() {
        throw null;
    }

    public final int g() {
        int f = f();
        return (f << 8) | f | 3 | 196608;
    }

    final int h(RecyclerView recyclerView) {
        return e(g(), recyclerView.getLayoutDirection());
    }

    public ms(byte[] bArr) {
        this();
    }
}
