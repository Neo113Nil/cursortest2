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
public final class h0 extends WindowInsetsAnimation$Callback {

    /* renamed from: a, reason: collision with root package name */
    public final C0004d f420a;

    /* renamed from: b, reason: collision with root package name */
    public List f421b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f422c;
    public final HashMap d;

    public h0(C0004d c0004d) {
        super(0);
        this.d = new HashMap();
        this.f420a = c0004d;
    }

    public final k0 a(WindowInsetsAnimation windowInsetsAnimation) {
        k0 k0Var = (k0) this.d.get(windowInsetsAnimation);
        if (k0Var == null) {
            k0Var = new k0(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                k0Var.f428a = new i0(windowInsetsAnimation);
            }
            this.d.put(windowInsetsAnimation, k0Var);
        }
        return k0Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        C0004d c0004d = this.f420a;
        a(windowInsetsAnimation);
        ((View) c0004d.f398e).setTranslationY(0.0f);
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        C0004d c0004d = this.f420a;
        a(windowInsetsAnimation);
        View view = (View) c0004d.f398e;
        int[] iArr = (int[]) c0004d.f399f;
        view.getLocationOnScreen(iArr);
        c0004d.f397c = iArr[1];
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        float fraction;
        ArrayList arrayList = this.f422c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f422c = arrayList2;
            this.f421b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation j2 = AbstractC0021v.j(list.get(size));
            k0 a2 = a(j2);
            fraction = j2.getFraction();
            a2.f428a.d(fraction);
            this.f422c.add(a2);
        }
        C0004d c0004d = this.f420a;
        x0 g2 = x0.g(null, windowInsets);
        c0004d.d(g2, this.f421b);
        return g2.f();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        C0004d c0004d = this.f420a;
        a(windowInsetsAnimation);
        lowerBound = bounds.getLowerBound();
        C.d c2 = C.d.c(lowerBound);
        upperBound = bounds.getUpperBound();
        C.d c3 = C.d.c(upperBound);
        View view = (View) c0004d.f398e;
        int[] iArr = (int[]) c0004d.f399f;
        view.getLocationOnScreen(iArr);
        int i = c0004d.f397c - iArr[1];
        c0004d.d = i;
        view.setTranslationY(i);
        AbstractC0021v.m();
        return AbstractC0021v.h(c2.d(), c3.d());
    }
}
