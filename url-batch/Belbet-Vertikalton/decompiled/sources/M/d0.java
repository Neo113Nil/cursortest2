package M;

import android.graphics.Insets;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class d0 extends WindowInsetsAnimation$Callback {

    /* renamed from: a, reason: collision with root package name */
    public final C0008d f739a;

    /* renamed from: b, reason: collision with root package name */
    public List f740b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f741c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f742d;

    public d0(C0008d c0008d) {
        super(0);
        this.f742d = new HashMap();
        this.f739a = c0008d;
    }

    public final g0 a(WindowInsetsAnimation windowInsetsAnimation) {
        g0 g0Var = (g0) this.f742d.get(windowInsetsAnimation);
        if (g0Var == null) {
            g0Var = new g0(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                g0Var.f755a = new e0(windowInsetsAnimation);
            }
            this.f742d.put(windowInsetsAnimation, g0Var);
        }
        return g0Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        C0008d c0008d = this.f739a;
        a(windowInsetsAnimation);
        ((View) c0008d.e).setTranslationY(0.0f);
        this.f742d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        C0008d c0008d = this.f739a;
        a(windowInsetsAnimation);
        View view = (View) c0008d.e;
        int[] iArr = (int[]) c0008d.f738f;
        view.getLocationOnScreen(iArr);
        c0008d.f736c = iArr[1];
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        float fraction;
        ArrayList arrayList = this.f741c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f741c = arrayList2;
            this.f740b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation j = F0.c.j(list.get(size));
            g0 a2 = a(j);
            fraction = j.getFraction();
            a2.f755a.d(fraction);
            this.f741c.add(a2);
        }
        C0008d c0008d = this.f739a;
        t0 g2 = t0.g(null, windowInsets);
        c0008d.b(g2, this.f740b);
        return g2.f();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        C0008d c0008d = this.f739a;
        a(windowInsetsAnimation);
        lowerBound = bounds.getLowerBound();
        E.c c2 = E.c.c(lowerBound);
        upperBound = bounds.getUpperBound();
        E.c c3 = E.c.c(upperBound);
        View view = (View) c0008d.e;
        int[] iArr = (int[]) c0008d.f738f;
        view.getLocationOnScreen(iArr);
        int i = c0008d.f736c - iArr[1];
        c0008d.f737d = i;
        view.setTranslationY(i);
        F0.c.m();
        return F0.c.h(c2.d(), c3.d());
    }
}
