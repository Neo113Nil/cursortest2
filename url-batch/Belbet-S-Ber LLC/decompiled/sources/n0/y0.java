package n0;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class y0 extends WindowInsetsAnimation$Callback {

    /* renamed from: a, reason: collision with root package name */
    public final b1.b f2853a;

    /* renamed from: b, reason: collision with root package name */
    public List f2854b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f2855c;
    public final HashMap d;

    public y0(b1.b bVar) {
        super(0);
        this.d = new HashMap();
        this.f2853a = bVar;
    }

    public final b1 a(WindowInsetsAnimation windowInsetsAnimation) {
        b1 b1Var = (b1) this.d.get(windowInsetsAnimation);
        if (b1Var != null) {
            return b1Var;
        }
        b1 b1Var2 = new b1(0, null, 0L);
        b1Var2.f2759a = new z0(windowInsetsAnimation);
        this.d.put(windowInsetsAnimation, b1Var2);
        return b1Var2;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.f2853a.a(a(windowInsetsAnimation));
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.f2853a.b(a(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        float fraction;
        ArrayList arrayList = this.f2855c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f2855c = arrayList2;
            this.f2854b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation j2 = d2.b.j(list.get(size));
            b1 a5 = a(j2);
            fraction = j2.getFraction();
            a5.f2759a.e(fraction);
            this.f2855c.add(a5);
        }
        return this.f2853a.c(v1.g(null, windowInsets), this.f2854b).f();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        androidx.emoji2.text.q d = this.f2853a.d(a(windowInsetsAnimation), new androidx.emoji2.text.q(bounds));
        d.getClass();
        d2.b.l();
        return d2.b.h(((f0.c) d.f466g).e(), ((f0.c) d.h).e());
    }
}
