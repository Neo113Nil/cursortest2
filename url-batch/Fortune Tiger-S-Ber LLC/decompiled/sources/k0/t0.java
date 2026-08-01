package k0;

import android.os.Build;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class t0 extends WindowInsetsAnimation$Callback {

    /* renamed from: a, reason: collision with root package name */
    public final o0 f2776a;

    /* renamed from: b, reason: collision with root package name */
    public List f2777b;
    public ArrayList c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f2778d;

    public t0(o0 o0Var) {
        super(0);
        this.f2778d = new HashMap();
        this.f2776a = o0Var;
    }

    public final w0 a(WindowInsetsAnimation windowInsetsAnimation) {
        w0 w0Var = (w0) this.f2778d.get(windowInsetsAnimation);
        if (w0Var == null) {
            w0Var = new w0(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                w0Var.f2788a = new u0(windowInsetsAnimation);
            }
            this.f2778d.put(windowInsetsAnimation, w0Var);
        }
        return w0Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.f2776a.a(a(windowInsetsAnimation));
        this.f2778d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.f2776a.b(a(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        float fraction;
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.c = arrayList2;
            this.f2777b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation j4 = s0.j(list.get(size));
            w0 a4 = a(j4);
            fraction = j4.getFraction();
            a4.f2788a.e(fraction);
            this.c.add(a4);
        }
        return this.f2776a.c(m1.g(null, windowInsets), this.f2777b).f();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        a2.s d4 = this.f2776a.d(a(windowInsetsAnimation), new a2.s(bounds));
        d4.getClass();
        s0.l();
        return s0.h(((c0.c) d4.g).e(), ((c0.c) d4.h).e());
    }
}
