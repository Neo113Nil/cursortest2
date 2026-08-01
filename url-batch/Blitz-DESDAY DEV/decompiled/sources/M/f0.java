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
public final class f0 extends WindowInsetsAnimation$Callback {

    /* renamed from: a, reason: collision with root package name */
    public final C0003d f545a;

    /* renamed from: b, reason: collision with root package name */
    public List f546b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f547c;
    public final HashMap d;

    public f0(C0003d c0003d) {
        super(0);
        this.d = new HashMap();
        this.f545a = c0003d;
    }

    public final i0 a(WindowInsetsAnimation windowInsetsAnimation) {
        i0 i0Var = (i0) this.d.get(windowInsetsAnimation);
        if (i0Var == null) {
            i0Var = new i0(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                i0Var.f559a = new g0(windowInsetsAnimation);
            }
            this.d.put(windowInsetsAnimation, i0Var);
        }
        return i0Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        C0003d c0003d = this.f545a;
        a(windowInsetsAnimation);
        ((View) c0003d.f537e).setTranslationY(0.0f);
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        C0003d c0003d = this.f545a;
        a(windowInsetsAnimation);
        View view = (View) c0003d.f537e;
        int[] iArr = (int[]) c0003d.f538f;
        view.getLocationOnScreen(iArr);
        c0003d.f536c = iArr[1];
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        float fraction;
        ArrayList arrayList = this.f547c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f547c = arrayList2;
            this.f546b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation j2 = D0.b.j(list.get(size));
            i0 a2 = a(j2);
            fraction = j2.getFraction();
            a2.f559a.d(fraction);
            this.f547c.add(a2);
        }
        C0003d c0003d = this.f545a;
        v0 g2 = v0.g(null, windowInsets);
        c0003d.b(g2, this.f546b);
        return g2.f();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        C0003d c0003d = this.f545a;
        a(windowInsetsAnimation);
        lowerBound = bounds.getLowerBound();
        E.c c2 = E.c.c(lowerBound);
        upperBound = bounds.getUpperBound();
        E.c c3 = E.c.c(upperBound);
        View view = (View) c0003d.f537e;
        int[] iArr = (int[]) c0003d.f538f;
        view.getLocationOnScreen(iArr);
        int i = c0003d.f536c - iArr[1];
        c0003d.d = i;
        view.setTranslationY(i);
        D0.b.m();
        return D0.b.h(c2.d(), c3.d());
    }
}
