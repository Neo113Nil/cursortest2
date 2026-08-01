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
    public final C0004e f397a;

    /* renamed from: b, reason: collision with root package name */
    public List f398b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f399c;
    public final HashMap d;

    public g0(C0004e c0004e) {
        super(0);
        this.d = new HashMap();
        this.f397a = c0004e;
    }

    public final j0 a(WindowInsetsAnimation windowInsetsAnimation) {
        j0 j0Var = (j0) this.d.get(windowInsetsAnimation);
        if (j0Var == null) {
            j0Var = new j0(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                j0Var.f411a = new h0(windowInsetsAnimation);
            }
            this.d.put(windowInsetsAnimation, j0Var);
        }
        return j0Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        C0004e c0004e = this.f397a;
        a(windowInsetsAnimation);
        ((View) c0004e.f389e).setTranslationY(0.0f);
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        C0004e c0004e = this.f397a;
        a(windowInsetsAnimation);
        View view = (View) c0004e.f389e;
        int[] iArr = (int[]) c0004e.f390f;
        view.getLocationOnScreen(iArr);
        c0004e.f388c = iArr[1];
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        float fraction;
        ArrayList arrayList = this.f399c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f399c = arrayList2;
            this.f398b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation j2 = G0.b.j(list.get(size));
            j0 a2 = a(j2);
            fraction = j2.getFraction();
            a2.f411a.d(fraction);
            this.f399c.add(a2);
        }
        C0004e c0004e = this.f397a;
        w0 g2 = w0.g(null, windowInsets);
        c0004e.b(g2, this.f398b);
        return g2.f();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        C0004e c0004e = this.f397a;
        a(windowInsetsAnimation);
        lowerBound = bounds.getLowerBound();
        C.d c2 = C.d.c(lowerBound);
        upperBound = bounds.getUpperBound();
        C.d c3 = C.d.c(upperBound);
        View view = (View) c0004e.f389e;
        int[] iArr = (int[]) c0004e.f390f;
        view.getLocationOnScreen(iArr);
        int i = c0004e.f388c - iArr[1];
        c0004e.d = i;
        view.setTranslationY(i);
        G0.b.l();
        return G0.b.h(c2.d(), c3.d());
    }
}
