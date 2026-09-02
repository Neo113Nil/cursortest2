package n0;

import android.os.Build;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class v0 extends WindowInsetsAnimation$Callback {

    /* renamed from: a, reason: collision with root package name */
    public final a1.b f2791a;

    /* renamed from: b, reason: collision with root package name */
    public List f2792b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f2793c;
    public final HashMap d;

    public v0(a1.b bVar) {
        super(0);
        this.d = new HashMap();
        this.f2791a = bVar;
    }

    public final y0 a(WindowInsetsAnimation windowInsetsAnimation) {
        y0 y0Var = (y0) this.d.get(windowInsetsAnimation);
        if (y0Var == null) {
            y0Var = new y0(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                y0Var.f2803a = new w0(windowInsetsAnimation);
            }
            this.d.put(windowInsetsAnimation, y0Var);
        }
        return y0Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.f2791a.a(a(windowInsetsAnimation));
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.f2791a.b(a(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        float fraction;
        ArrayList arrayList = this.f2793c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f2793c = arrayList2;
            this.f2792b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation j4 = c2.b.j(list.get(size));
            y0 a2 = a(j4);
            fraction = j4.getFraction();
            a2.f2803a.e(fraction);
            this.f2793c.add(a2);
        }
        return this.f2791a.c(q1.g(null, windowInsets), this.f2792b).f();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        androidx.emoji2.text.q d = this.f2791a.d(a(windowInsetsAnimation), new androidx.emoji2.text.q(bounds));
        d.getClass();
        c2.b.l();
        return c2.b.h(((f0.c) d.f346g).e(), ((f0.c) d.f347h).e());
    }
}
