package defpackage;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class db0 extends WindowInsetsAnimation$Callback {
    public final za0 a;
    public List b;
    public ArrayList c;
    public final HashMap d;

    public db0(za0 za0Var) {
        super(za0Var.getDispatchMode());
        this.d = new HashMap();
        this.a = za0Var;
    }

    public final gb0 a(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap hashMap = this.d;
        gb0 gb0Var = (gb0) hashMap.get(windowInsetsAnimation);
        if (gb0Var != null) {
            return gb0Var;
        }
        gb0 gb0Var2 = new gb0(0, null, 0L);
        gb0Var2.a = new eb0(windowInsetsAnimation);
        hashMap.put(windowInsetsAnimation, gb0Var2);
        return gb0Var2;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.onEnd(a(windowInsetsAnimation));
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.onPrepare(a(windowInsetsAnimation));
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
            gb0 a = a(j);
            fraction = j.getFraction();
            a.a.e(fraction);
            this.c.add(a);
        }
        return this.a.onProgress(ac0.g(null, windowInsets), this.b).f();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        ya0 onStart = this.a.onStart(a(windowInsetsAnimation), new ya0(bounds));
        onStart.getClass();
        b0.m();
        return b0.h(onStart.a.e(), onStart.b.e());
    }
}
