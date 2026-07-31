package q3;

import android.os.Build;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class r0 extends WindowInsetsAnimation$Callback {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.datastore.preferences.protobuf.j f6149a;

    /* renamed from: b, reason: collision with root package name */
    public List f6150b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f6151c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f6152d;

    public r0(androidx.datastore.preferences.protobuf.j jVar) {
        super(jVar.f706d);
        this.f6152d = new HashMap();
        this.f6149a = jVar;
    }

    public final u0 a(WindowInsetsAnimation windowInsetsAnimation) {
        u0 u0Var = (u0) this.f6152d.get(windowInsetsAnimation);
        if (u0Var == null) {
            u0Var = new u0(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                u0Var.f6160a = new s0(windowInsetsAnimation);
            }
            this.f6152d.put(windowInsetsAnimation, u0Var);
        }
        return u0Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.f6149a.d(a(windowInsetsAnimation));
        this.f6152d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        a(windowInsetsAnimation);
        this.f6149a.e();
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        float fraction;
        ArrayList arrayList = this.f6151c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f6151c = arrayList2;
            this.f6150b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation j7 = h2.a.j(list.get(size));
            u0 a8 = a(j7);
            fraction = j7.getFraction();
            a8.f6160a.e(fraction);
            this.f6151c.add(a8);
        }
        return this.f6149a.f(l1.d(null, windowInsets), this.f6150b).c();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        a0.a0 g3 = this.f6149a.g(a(windowInsetsAnimation), new a0.a0(bounds));
        g3.getClass();
        h2.a.k();
        return h2.a.h(((i3.c) g3.f11e).d(), ((i3.c) g3.f12f).d());
    }
}
