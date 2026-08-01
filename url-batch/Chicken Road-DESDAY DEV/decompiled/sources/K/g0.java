package K;

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
public final class g0 extends WindowInsetsAnimation$Callback {

    /* renamed from: a, reason: collision with root package name */
    public final C0003d f402a;

    /* renamed from: b, reason: collision with root package name */
    public List f403b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f404c;
    public final HashMap d;

    public g0(C0003d c0003d) {
        super(0);
        this.d = new HashMap();
        this.f402a = c0003d;
    }

    public final j0 a(WindowInsetsAnimation windowInsetsAnimation) {
        j0 j0Var = (j0) this.d.get(windowInsetsAnimation);
        if (j0Var == null) {
            j0Var = new j0(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                j0Var.f416a = new h0(windowInsetsAnimation);
            }
            this.d.put(windowInsetsAnimation, j0Var);
        }
        return j0Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        C0003d c0003d = this.f402a;
        a(windowInsetsAnimation);
        ((View) c0003d.f390e).setTranslationY(0.0f);
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        C0003d c0003d = this.f402a;
        a(windowInsetsAnimation);
        View view = (View) c0003d.f390e;
        int[] iArr = (int[]) c0003d.f391f;
        view.getLocationOnScreen(iArr);
        c0003d.f389c = iArr[1];
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        float fraction;
        ArrayList arrayList = this.f404c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f404c = arrayList2;
            this.f403b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation j2 = A0.c.j(list.get(size));
            j0 a2 = a(j2);
            fraction = j2.getFraction();
            a2.f416a.d(fraction);
            this.f404c.add(a2);
        }
        C0003d c0003d = this.f402a;
        w0 g2 = w0.g(null, windowInsets);
        c0003d.b(g2, this.f403b);
        return g2.f();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        C0003d c0003d = this.f402a;
        a(windowInsetsAnimation);
        lowerBound = bounds.getLowerBound();
        C.c c2 = C.c.c(lowerBound);
        upperBound = bounds.getUpperBound();
        C.c c3 = C.c.c(upperBound);
        View view = (View) c0003d.f390e;
        int[] iArr = (int[]) c0003d.f391f;
        view.getLocationOnScreen(iArr);
        int i = c0003d.f389c - iArr[1];
        c0003d.d = i;
        view.setTranslationY(i);
        A0.c.m();
        return A0.c.h(c2.d(), c3.d());
    }
}
