package c1;

import android.graphics.Insets;
import android.os.Build;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import r.RunnableC0841C;
import r.Y;

/* renamed from: c1.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0376C extends WindowInsetsAnimation$Callback {

    /* renamed from: a, reason: collision with root package name */
    public final RunnableC0841C f5550a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f5551b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f5552c;

    public C0376C(RunnableC0841C runnableC0841C) {
        super(runnableC0841C.f7954e);
        this.f5552c = new HashMap();
        this.f5550a = runnableC0841C;
    }

    public final F a(WindowInsetsAnimation windowInsetsAnimation) {
        F f3 = (F) this.f5552c.get(windowInsetsAnimation);
        if (f3 == null) {
            f3 = new F(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                f3.f5557a = new D(windowInsetsAnimation);
            }
            this.f5552c.put(windowInsetsAnimation, f3);
        }
        return f3;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.f5550a.b(a(windowInsetsAnimation));
        this.f5552c.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        RunnableC0841C runnableC0841C = this.f5550a;
        a(windowInsetsAnimation);
        runnableC0841C.f7956g = true;
        runnableC0841C.f7957h = true;
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        float fraction;
        ArrayList arrayList = this.f5551b;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f5551b = arrayList2;
            Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation i3 = D0.l.i(list.get(size));
            F a3 = a(i3);
            fraction = i3.getFraction();
            a3.f5557a.c(fraction);
            this.f5551b.add(a3);
        }
        RunnableC0841C runnableC0841C = this.f5550a;
        U b3 = U.b(null, windowInsets);
        Y y3 = runnableC0841C.f7955f;
        Y.a(y3, b3);
        if (y3.f8020r) {
            b3 = U.f5588b;
        }
        return b3.a();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        RunnableC0841C runnableC0841C = this.f5550a;
        a(windowInsetsAnimation);
        lowerBound = bounds.getLowerBound();
        X0.c c2 = X0.c.c(lowerBound);
        upperBound = bounds.getUpperBound();
        X0.c c3 = X0.c.c(upperBound);
        runnableC0841C.f7956g = false;
        D0.l.k();
        return D0.l.g(c2.d(), c3.d());
    }
}
