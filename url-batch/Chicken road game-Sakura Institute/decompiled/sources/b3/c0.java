package b3;

import android.graphics.Insets;
import android.os.Build;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c0 extends WindowInsetsAnimation$Callback {

    /* renamed from: a, reason: collision with root package name */
    public final q.a0 f1314a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f1315b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f1316c;

    public c0(q.a0 a0Var) {
        super(a0Var.f7248g);
        this.f1316c = new HashMap();
        this.f1314a = a0Var;
    }

    public final f0 a(WindowInsetsAnimation windowInsetsAnimation) {
        f0 f0Var = (f0) this.f1316c.get(windowInsetsAnimation);
        if (f0Var == null) {
            f0Var = new f0(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                f0Var.f1322a = new d0(windowInsetsAnimation);
            }
            this.f1316c.put(windowInsetsAnimation, f0Var);
        }
        return f0Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.f1314a.b(a(windowInsetsAnimation));
        this.f1316c.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        a(windowInsetsAnimation);
        q.a0 a0Var = this.f1314a;
        a0Var.f7250i = true;
        a0Var.f7251j = true;
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        float fraction;
        ArrayList arrayList = this.f1315b;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f1315b = arrayList2;
            Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation i7 = b2.j.i(list.get(size));
            f0 a3 = a(i7);
            fraction = i7.getFraction();
            a3.f1322a.c(fraction);
            this.f1315b.add(a3);
        }
        t0 b9 = t0.b(null, windowInsets);
        q.u0 u0Var = this.f1314a.f7249h;
        q.u0.a(u0Var, b9);
        if (u0Var.f7365r) {
            b9 = t0.f1366b;
        }
        return b9.a();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        a(windowInsetsAnimation);
        lowerBound = bounds.getLowerBound();
        v2.c c4 = v2.c.c(lowerBound);
        upperBound = bounds.getUpperBound();
        v2.c c6 = v2.c.c(upperBound);
        this.f1314a.f7250i = false;
        b2.j.k();
        return b2.j.g(c4.d(), c6.d());
    }
}
