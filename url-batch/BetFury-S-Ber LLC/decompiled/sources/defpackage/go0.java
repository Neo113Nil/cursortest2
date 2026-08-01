package defpackage;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class go0 extends WindowInsetsAnimation$Callback {
    public final co0 a;
    public List b;
    public ArrayList c;
    public final HashMap d;

    public go0(co0 co0Var) {
        super(0);
        this.d = new HashMap();
        this.a = co0Var;
    }

    public final jo0 a(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap hashMap = this.d;
        jo0 jo0Var = (jo0) hashMap.get(windowInsetsAnimation);
        if (jo0Var != null) {
            return jo0Var;
        }
        jo0 jo0Var2 = new jo0(0, null, 0L);
        jo0Var2.a = new ho0(windowInsetsAnimation);
        hashMap.put(windowInsetsAnimation, jo0Var2);
        return jo0Var2;
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
            WindowInsetsAnimation j = f0.j(list.get(size));
            jo0 a = a(j);
            fraction = j.getFraction();
            a.a.e(fraction);
            this.c.add(a);
        }
        return this.a.c(dp0.g(null, windowInsets), this.b).f();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        tl0 d = this.a.d(a(windowInsetsAnimation), new tl0(bounds));
        d.getClass();
        f0.m();
        return f0.h(((fv) d.g).e(), ((fv) d.h).e());
    }
}
