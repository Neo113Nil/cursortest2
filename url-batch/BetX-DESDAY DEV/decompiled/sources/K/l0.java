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
public final class l0 extends WindowInsetsAnimation$Callback {

    /* renamed from: a, reason: collision with root package name */
    public final C0006d f466a;

    /* renamed from: b, reason: collision with root package name */
    public List f467b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f468c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f469d;

    public l0(C0006d c0006d) {
        super(0);
        this.f469d = new HashMap();
        this.f466a = c0006d;
    }

    public final o0 a(WindowInsetsAnimation windowInsetsAnimation) {
        o0 o0Var = (o0) this.f469d.get(windowInsetsAnimation);
        if (o0Var == null) {
            o0Var = new o0(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                o0Var.f483a = new m0(windowInsetsAnimation);
            }
            this.f469d.put(windowInsetsAnimation, o0Var);
        }
        return o0Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        C0006d c0006d = this.f466a;
        a(windowInsetsAnimation);
        ((View) c0006d.f435e).setTranslationY(0.0f);
        this.f469d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        C0006d c0006d = this.f466a;
        a(windowInsetsAnimation);
        View view = (View) c0006d.f435e;
        int[] iArr = (int[]) c0006d.f436f;
        view.getLocationOnScreen(iArr);
        c0006d.f433c = iArr[1];
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        float fraction;
        ArrayList arrayList = this.f468c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f468c = arrayList2;
            this.f467b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation j2 = AbstractC0029z.j(list.get(size));
            o0 a2 = a(j2);
            fraction = j2.getFraction();
            a2.f483a.d(fraction);
            this.f468c.add(a2);
        }
        C0006d c0006d = this.f466a;
        B0 g2 = B0.g(null, windowInsets);
        c0006d.b(g2, this.f467b);
        return g2.f();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        C0006d c0006d = this.f466a;
        a(windowInsetsAnimation);
        lowerBound = bounds.getLowerBound();
        C.d c2 = C.d.c(lowerBound);
        upperBound = bounds.getUpperBound();
        C.d c3 = C.d.c(upperBound);
        View view = (View) c0006d.f435e;
        int[] iArr = (int[]) c0006d.f436f;
        view.getLocationOnScreen(iArr);
        int i = c0006d.f433c - iArr[1];
        c0006d.f434d = i;
        view.setTranslationY(i);
        AbstractC0029z.m();
        return AbstractC0029z.h(c2.d(), c3.d());
    }
}
