package defpackage;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class f73 extends WindowInsetsAnimation$Callback {
    public final iv a;
    public List b;
    public ArrayList c;
    public final HashMap d;

    public f73(iv ivVar) {
        super(ivVar.m);
        this.d = new HashMap();
        this.a = ivVar;
    }

    public final i73 a(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap hashMap = this.d;
        i73 i73Var = (i73) hashMap.get(windowInsetsAnimation);
        if (i73Var != null) {
            return i73Var;
        }
        i73 i73Var2 = new i73(0, null, 0L);
        i73Var2.a = new g73(windowInsetsAnimation);
        hashMap.put(windowInsetsAnimation, i73Var2);
        return i73Var2;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.e(a(windowInsetsAnimation));
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.f(a(windowInsetsAnimation));
    }

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
            i73 a = a(windowInsetsAnimation);
            a.a.e(windowInsetsAnimation.getFraction());
            this.c.add(a);
        }
        return this.a.g(c83.c(null, windowInsets), this.b).b();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        tt1 h = this.a.h(a(windowInsetsAnimation), new tt1(bounds));
        h.getClass();
        e73.c();
        return e73.a(((z21) h.n).d(), ((z21) h.o).d());
    }
}
