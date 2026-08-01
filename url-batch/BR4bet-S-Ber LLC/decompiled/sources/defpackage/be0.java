package defpackage;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class be0 extends WindowInsetsAnimation$Callback {
    public final nf a;
    public List b;
    public ArrayList c;
    public final HashMap d;

    public be0(nf nfVar) {
        super(0);
        this.d = new HashMap();
        this.a = nfVar;
    }

    public final ee0 a(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap hashMap = this.d;
        ee0 ee0Var = (ee0) hashMap.get(windowInsetsAnimation);
        if (ee0Var != null) {
            return ee0Var;
        }
        ee0 ee0Var2 = new ee0(0, null, 0L);
        ee0Var2.a = new ce0(windowInsetsAnimation);
        hashMap.put(windowInsetsAnimation, ee0Var2);
        return ee0Var2;
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
            WindowInsetsAnimation j = d0.j(list.get(size));
            ee0 a = a(j);
            fraction = j.getFraction();
            a.a.e(fraction);
            this.c.add(a);
        }
        return this.a.c(ye0.g(null, windowInsets), this.b).f();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        a5 d = this.a.d(a(windowInsetsAnimation), new a5(bounds));
        d.getClass();
        d0.m();
        return d0.h(((er) d.g).e(), ((er) d.h).e());
    }
}
