package defpackage;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class ua0 extends WindowInsetsAnimation$Callback {
    public final vd a;
    public List b;
    public ArrayList c;
    public final HashMap d;

    public ua0(vd vdVar) {
        super(0);
        this.d = new HashMap();
        this.a = vdVar;
    }

    public final xa0 a(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap hashMap = this.d;
        xa0 xa0Var = (xa0) hashMap.get(windowInsetsAnimation);
        if (xa0Var != null) {
            return xa0Var;
        }
        xa0 xa0Var2 = new xa0(0, null, 0L);
        xa0Var2.a = new va0(windowInsetsAnimation);
        hashMap.put(windowInsetsAnimation, xa0Var2);
        return xa0Var2;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.a(a(windowInsetsAnimation));
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.b(a(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        float fraction;
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.c = arrayList2;
            this.b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation j = b0.j(list.get(size));
            xa0 a = a(j);
            fraction = j.getFraction();
            a.a.e(fraction);
            this.c.add(a);
        }
        return this.a.c(rb0.g(null, windowInsets), this.b).f();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        q4 d = this.a.d(a(windowInsetsAnimation), new q4(bounds));
        d.getClass();
        b0.m();
        return b0.h(((to) d.g).e(), ((to) d.h).e());
    }
}
