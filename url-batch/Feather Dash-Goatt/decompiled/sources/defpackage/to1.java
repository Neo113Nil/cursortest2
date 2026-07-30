package defpackage;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class to1 extends WindowInsetsAnimation.Callback {
    public final so1 a;
    public List b;
    public ArrayList c;
    public final HashMap d;

    public to1(so1 so1Var) {
        super(so1Var.d);
        this.d = new HashMap();
        this.a = so1Var;
    }

    public final uo1 a(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap hashMap = this.d;
        uo1 uo1Var = (uo1) hashMap.get(windowInsetsAnimation);
        if (uo1Var != null) {
            return uo1Var;
        }
        uo1 uo1Var2 = new uo1();
        new WindowInsetsAnimation(0, null, 0L);
        uo1Var2.a = new nq0(22, windowInsetsAnimation);
        hashMap.put(windowInsetsAnimation, uo1Var2);
        return uo1Var2;
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.a(a(windowInsetsAnimation));
        this.d.remove(windowInsetsAnimation);
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        a(windowInsetsAnimation);
        this.a.c();
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.c = arrayList2;
            this.b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) list.get(size);
            uo1 a = a(windowInsetsAnimation);
            ((WindowInsetsAnimation) a.a.e).setFraction(windowInsetsAnimation.getFraction());
            this.c.add(a);
        }
        return this.a.d(ip1.c(null, windowInsets), this.b).b();
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        c51 e = this.a.e(a(windowInsetsAnimation), new c51(bounds));
        e.getClass();
        return new WindowInsetsAnimation.Bounds(((c90) e.e).c(), ((c90) e.g).c());
    }
}
