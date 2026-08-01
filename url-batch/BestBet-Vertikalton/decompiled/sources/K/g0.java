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
public final class g0 extends WindowInsetsAnimation$Callback {

    /* renamed from: a, reason: collision with root package name */
    public final C0008d f620a;

    /* renamed from: b, reason: collision with root package name */
    public List f621b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f622c;
    public final HashMap d;

    public g0(C0008d c0008d) {
        super(0);
        this.d = new HashMap();
        this.f620a = c0008d;
    }

    public final j0 a(WindowInsetsAnimation windowInsetsAnimation) {
        j0 j0Var = (j0) this.d.get(windowInsetsAnimation);
        if (j0Var == null) {
            j0Var = new j0(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                j0Var.f628a = new h0(windowInsetsAnimation);
            }
            this.d.put(windowInsetsAnimation, j0Var);
        }
        return j0Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        C0008d c0008d = this.f620a;
        a(windowInsetsAnimation);
        ((View) c0008d.f603e).setTranslationY(RecyclerView.f1937A0);
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        C0008d c0008d = this.f620a;
        a(windowInsetsAnimation);
        View view = (View) c0008d.f603e;
        int[] iArr = (int[]) c0008d.f604f;
        view.getLocationOnScreen(iArr);
        c0008d.f602c = iArr[1];
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        float fraction;
        ArrayList arrayList = this.f622c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f622c = arrayList2;
            this.f621b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation j2 = J0.b.j(list.get(size));
            j0 a2 = a(j2);
            fraction = j2.getFraction();
            a2.f628a.d(fraction);
            this.f622c.add(a2);
        }
        C0008d c0008d = this.f620a;
        w0 g2 = w0.g(null, windowInsets);
        c0008d.d(g2, this.f621b);
        return g2.f();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        C0008d c0008d = this.f620a;
        a(windowInsetsAnimation);
        lowerBound = bounds.getLowerBound();
        C.d c2 = C.d.c(lowerBound);
        upperBound = bounds.getUpperBound();
        C.d c3 = C.d.c(upperBound);
        View view = (View) c0008d.f603e;
        int[] iArr = (int[]) c0008d.f604f;
        view.getLocationOnScreen(iArr);
        int i = c0008d.f602c - iArr[1];
        c0008d.d = i;
        view.setTranslationY(i);
        J0.b.m();
        return J0.b.h(c2.d(), c3.d());
    }
}
