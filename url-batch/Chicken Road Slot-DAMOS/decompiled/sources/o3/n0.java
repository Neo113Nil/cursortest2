package o3;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class n0 extends WindowInsetsAnimation$Callback {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.datastore.preferences.protobuf.i f7424a;

    /* renamed from: b, reason: collision with root package name */
    public List f7425b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f7426c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f7427d;

    public n0(androidx.datastore.preferences.protobuf.i iVar) {
        super(iVar.f559d);
        this.f7427d = new HashMap();
        this.f7424a = iVar;
    }

    public final q0 a(WindowInsetsAnimation windowInsetsAnimation) {
        q0 q0Var = (q0) this.f7427d.get(windowInsetsAnimation);
        if (q0Var != null) {
            return q0Var;
        }
        q0 q0Var2 = new q0(0, null, 0L);
        q0Var2.f7435a = new o0(windowInsetsAnimation);
        this.f7427d.put(windowInsetsAnimation, q0Var2);
        return q0Var2;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.f7424a.e(a(windowInsetsAnimation));
        this.f7427d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.f7424a.f(a(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        float fraction;
        ArrayList arrayList = this.f7426c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f7426c = arrayList2;
            this.f7425b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation l10 = com.appsflyer.internal.n.l(list.get(size));
            q0 a9 = a(l10);
            fraction = l10.getFraction();
            a9.f7435a.e(fraction);
            this.f7426c.add(a9);
        }
        return this.f7424a.g(k1.c(windowInsets, null), this.f7425b).b();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        c6.e h10 = this.f7424a.h(a(windowInsetsAnimation), new c6.e(bounds));
        h10.getClass();
        com.appsflyer.internal.n.p();
        return com.appsflyer.internal.n.j(((h3.b) h10.f1814e).d(), ((h3.b) h10.f1815i).d());
    }
}
