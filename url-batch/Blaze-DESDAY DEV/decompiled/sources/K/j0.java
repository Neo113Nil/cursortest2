package K;

import android.graphics.Insets;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class j0 extends WindowInsetsAnimation$Callback {

    /* renamed from: a, reason: collision with root package name */
    public final C0006d f487a;

    /* renamed from: b, reason: collision with root package name */
    public List f488b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f489c;
    public final HashMap d;

    public j0(C0006d c0006d) {
        super(0);
        this.d = new HashMap();
        this.f487a = c0006d;
    }

    public final m0 a(WindowInsetsAnimation windowInsetsAnimation) {
        m0 m0Var = (m0) this.d.get(windowInsetsAnimation);
        if (m0Var == null) {
            m0Var = new m0(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                m0Var.f497a = new k0(windowInsetsAnimation);
            }
            this.d.put(windowInsetsAnimation, m0Var);
        }
        return m0Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        C0006d c0006d = this.f487a;
        a(windowInsetsAnimation);
        ((View) c0006d.f464e).setTranslationY(RecyclerView.f1559A0);
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        C0006d c0006d = this.f487a;
        a(windowInsetsAnimation);
        View view = (View) c0006d.f464e;
        int[] iArr = (int[]) c0006d.f465f;
        view.getLocationOnScreen(iArr);
        c0006d.f463c = iArr[1];
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        float fraction;
        ArrayList arrayList = this.f489c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f489c = arrayList2;
            this.f488b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation j2 = B0.b.j(list.get(size));
            m0 a2 = a(j2);
            fraction = j2.getFraction();
            a2.f497a.d(fraction);
            this.f489c.add(a2);
        }
        C0006d c0006d = this.f487a;
        z0 g2 = z0.g(null, windowInsets);
        c0006d.b(g2, this.f488b);
        return g2.f();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        C0006d c0006d = this.f487a;
        a(windowInsetsAnimation);
        lowerBound = bounds.getLowerBound();
        C.c c2 = C.c.c(lowerBound);
        upperBound = bounds.getUpperBound();
        C.c c3 = C.c.c(upperBound);
        View view = (View) c0006d.f464e;
        int[] iArr = (int[]) c0006d.f465f;
        view.getLocationOnScreen(iArr);
        int i = c0006d.f463c - iArr[1];
        c0006d.d = i;
        view.setTranslationY(i);
        B0.b.m();
        return B0.b.h(c2.d(), c3.d());
    }
}
