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
import q.RunnableC1012P;
import q.o0;

/* renamed from: a1.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0365A extends WindowInsetsAnimation$Callback {

    /* renamed from: a, reason: collision with root package name */
    public final RunnableC1012P f4832a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f4833b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f4834c;

    public C0365A(RunnableC1012P runnableC1012P) {
        super(runnableC1012P.f9203e);
        this.f4834c = new HashMap();
        this.f4832a = runnableC1012P;
    }

    public final C0368D a(WindowInsetsAnimation windowInsetsAnimation) {
        C0368D c0368d = (C0368D) this.f4834c.get(windowInsetsAnimation);
        if (c0368d == null) {
            c0368d = new C0368D(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                c0368d.f4839a = new C0366B(windowInsetsAnimation);
            }
            this.f4834c.put(windowInsetsAnimation, c0368d);
        }
        return c0368d;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.f4832a.b(a(windowInsetsAnimation));
        this.f4834c.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        RunnableC1012P runnableC1012P = this.f4832a;
        a(windowInsetsAnimation);
        runnableC1012P.f9205j = true;
        runnableC1012P.f9206k = true;
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        float fraction;
        ArrayList arrayList = this.f4833b;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f4833b = arrayList2;
            Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation i2 = B0.k.i(list.get(size));
            C0368D a4 = a(i2);
            fraction = i2.getFraction();
            a4.f4839a.c(fraction);
            this.f4833b.add(a4);
        }
        RunnableC1012P runnableC1012P = this.f4832a;
        C0383T b4 = C0383T.b(null, windowInsets);
        o0 o0Var = runnableC1012P.f9204i;
        o0.a(o0Var, b4);
        if (o0Var.f9315r) {
            b4 = C0383T.f4870b;
        }
        return b4.a();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        RunnableC1012P runnableC1012P = this.f4832a;
        a(windowInsetsAnimation);
        lowerBound = bounds.getLowerBound();
        V0.c c4 = V0.c.c(lowerBound);
        upperBound = bounds.getUpperBound();
        V0.c c5 = V0.c.c(upperBound);
        runnableC1012P.f9205j = false;
        B0.k.k();
        return B0.k.g(c4.d(), c5.d());
    }
}
