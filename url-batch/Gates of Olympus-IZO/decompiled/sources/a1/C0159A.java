package a1;

import android.graphics.Insets;
import android.os.Build;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import r.RunnableC0789A;

/* renamed from: a1.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0159A extends WindowInsetsAnimation$Callback {

    /* renamed from: a, reason: collision with root package name */
    public final RunnableC0789A f3504a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f3505b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f3506c;

    public C0159A(RunnableC0789A runnableC0789A) {
        super(runnableC0789A.f6983e);
        this.f3506c = new HashMap();
        this.f3504a = runnableC0789A;
    }

    public final C0162D a(WindowInsetsAnimation windowInsetsAnimation) {
        C0162D c0162d = (C0162D) this.f3506c.get(windowInsetsAnimation);
        if (c0162d == null) {
            c0162d = new C0162D(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                c0162d.f3511a = new C0160B(windowInsetsAnimation);
            }
            this.f3506c.put(windowInsetsAnimation, c0162d);
        }
        return c0162d;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.f3504a.b(a(windowInsetsAnimation));
        this.f3506c.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        RunnableC0789A runnableC0789A = this.f3504a;
        a(windowInsetsAnimation);
        runnableC0789A.f6985g = true;
        runnableC0789A.f6986h = true;
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        float fraction;
        ArrayList arrayList = this.f3505b;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f3505b = arrayList2;
            Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation i3 = C0.i.i(list.get(size));
            C0162D a3 = a(i3);
            fraction = i3.getFraction();
            a3.f3511a.c(fraction);
            this.f3505b.add(a3);
        }
        RunnableC0789A runnableC0789A = this.f3504a;
        Q b2 = Q.b(null, windowInsets);
        r.V v3 = runnableC0789A.f6984f;
        r.V.a(v3, b2);
        if (v3.f7045r) {
            b2 = Q.f3541b;
        }
        return b2.a();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        RunnableC0789A runnableC0789A = this.f3504a;
        a(windowInsetsAnimation);
        lowerBound = bounds.getLowerBound();
        V0.c c3 = V0.c.c(lowerBound);
        upperBound = bounds.getUpperBound();
        V0.c c4 = V0.c.c(upperBound);
        runnableC0789A.f6985g = false;
        C0.i.k();
        return C0.i.g(c3.d(), c4.d());
    }
}
