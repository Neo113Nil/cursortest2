package K;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;
import java.util.WeakHashMap;
import u0.C0385x;

/* loaded from: classes.dex */
public final class e0 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final C0008d f608a;

    /* renamed from: b, reason: collision with root package name */
    public w0 f609b;

    public e0(View view, C0008d c0008d) {
        w0 w0Var;
        this.f608a = c0008d;
        WeakHashMap weakHashMap = Q.f578a;
        w0 a2 = G.a(view);
        if (a2 != null) {
            int i = Build.VERSION.SDK_INT;
            w0Var = (i >= 30 ? new n0(a2) : i >= 29 ? new m0(a2) : new l0(a2)).b();
        } else {
            w0Var = null;
        }
        this.f609b = w0Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        u0 u0Var;
        if (!view.isLaidOut()) {
            this.f609b = w0.g(view, windowInsets);
            return f0.i(view, windowInsets);
        }
        w0 g2 = w0.g(view, windowInsets);
        if (this.f609b == null) {
            WeakHashMap weakHashMap = Q.f578a;
            this.f609b = G.a(view);
        }
        if (this.f609b == null) {
            this.f609b = g2;
            return f0.i(view, windowInsets);
        }
        C0008d j2 = f0.j(view);
        if (j2 != null && Objects.equals((WindowInsets) j2.f601b, windowInsets)) {
            return f0.i(view, windowInsets);
        }
        w0 w0Var = this.f609b;
        int i = 1;
        int i2 = 0;
        while (true) {
            u0Var = g2.f668a;
            if (i > 256) {
                break;
            }
            if (!u0Var.f(i).equals(w0Var.f668a.f(i))) {
                i2 |= i;
            }
            i <<= 1;
        }
        if (i2 == 0) {
            return f0.i(view, windowInsets);
        }
        w0 w0Var2 = this.f609b;
        j0 j0Var = new j0(i2, (i2 & 8) != 0 ? u0Var.f(8).d > w0Var2.f668a.f(8).d ? f0.f611e : f0.f612f : f0.f613g, 160L);
        j0Var.f628a.d(RecyclerView.f1937A0);
        ValueAnimator duration = ValueAnimator.ofFloat(RecyclerView.f1937A0, 1.0f).setDuration(j0Var.f628a.a());
        C.d f2 = u0Var.f(i2);
        C.d f3 = w0Var2.f668a.f(i2);
        int min = Math.min(f2.f68a, f3.f68a);
        int i3 = f2.f69b;
        int i4 = f3.f69b;
        int min2 = Math.min(i3, i4);
        int i5 = f2.f70c;
        int i6 = f3.f70c;
        int min3 = Math.min(i5, i6);
        int i7 = f2.d;
        int i8 = i2;
        int i9 = f3.d;
        C0385x c0385x = new C0385x(C.d.b(min, min2, min3, Math.min(i7, i9)), 2, C.d.b(Math.max(f2.f68a, f3.f68a), Math.max(i3, i4), Math.max(i5, i6), Math.max(i7, i9)));
        f0.f(view, windowInsets, false);
        duration.addUpdateListener(new c0(j0Var, g2, w0Var2, i8, view));
        duration.addListener(new d0(j0Var, view));
        ViewTreeObserverOnPreDrawListenerC0022s.a(view, new H.m(view, j0Var, c0385x, duration));
        this.f609b = g2;
        return f0.i(view, windowInsets);
    }
}
