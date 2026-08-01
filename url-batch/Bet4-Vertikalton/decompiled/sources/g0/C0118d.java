package g0;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: g0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0118d {

    /* renamed from: a, reason: collision with root package name */
    public final C0111C f2355a;

    /* renamed from: e, reason: collision with root package name */
    public View f2358e;
    public int d = 0;

    /* renamed from: b, reason: collision with root package name */
    public final C0117c f2356b = new C0117c();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2357c = new ArrayList();

    public C0118d(C0111C c0111c) {
        this.f2355a = c0111c;
    }

    public final void a(View view, int i, boolean z2) {
        RecyclerView recyclerView = this.f2355a.f2261a;
        int childCount = i < 0 ? recyclerView.getChildCount() : f(i);
        this.f2356b.e(childCount, z2);
        if (z2) {
            i(view);
        }
        recyclerView.addView(view, childCount);
        RecyclerView.L(view);
    }

    public final void b(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z2) {
        RecyclerView recyclerView = this.f2355a.f2261a;
        int childCount = i < 0 ? recyclerView.getChildCount() : f(i);
        this.f2356b.e(childCount, z2);
        if (z2) {
            i(view);
        }
        c0 L2 = RecyclerView.L(view);
        if (L2 != null) {
            if (!L2.l() && !L2.q()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(L2);
                throw new IllegalArgumentException(Y.V.d(recyclerView, sb));
            }
            if (RecyclerView.f1528A0) {
                Log.d("RecyclerView", "reAttach " + L2);
            }
            L2.f2345j &= -257;
        } else if (RecyclerView.z0) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            sb2.append(", index: ");
            sb2.append(childCount);
            throw new IllegalArgumentException(Y.V.d(recyclerView, sb2));
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public final void c(int i) {
        int f2 = f(i);
        this.f2356b.g(f2);
        RecyclerView recyclerView = this.f2355a.f2261a;
        View childAt = recyclerView.getChildAt(f2);
        if (childAt != null) {
            c0 L2 = RecyclerView.L(childAt);
            if (L2 != null) {
                if (L2.l() && !L2.q()) {
                    StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                    sb.append(L2);
                    throw new IllegalArgumentException(Y.V.d(recyclerView, sb));
                }
                if (RecyclerView.f1528A0) {
                    Log.d("RecyclerView", "tmpDetach " + L2);
                }
                L2.a(256);
            }
        } else if (RecyclerView.z0) {
            StringBuilder sb2 = new StringBuilder("No view at offset ");
            sb2.append(f2);
            throw new IllegalArgumentException(Y.V.d(recyclerView, sb2));
        }
        recyclerView.detachViewFromParent(f2);
    }

    public final View d(int i) {
        return this.f2355a.f2261a.getChildAt(f(i));
    }

    public final int e() {
        return this.f2355a.f2261a.getChildCount() - this.f2357c.size();
    }

    public final int f(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = this.f2355a.f2261a.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            C0117c c0117c = this.f2356b;
            int b2 = i - (i2 - c0117c.b(i2));
            if (b2 == 0) {
                while (c0117c.d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b2;
        }
        return -1;
    }

    public final View g(int i) {
        return this.f2355a.f2261a.getChildAt(i);
    }

    public final int h() {
        return this.f2355a.f2261a.getChildCount();
    }

    public final void i(View view) {
        this.f2357c.add(view);
        C0111C c0111c = this.f2355a;
        c0 L2 = RecyclerView.L(view);
        if (L2 != null) {
            int i = L2.f2352q;
            View view2 = L2.f2339a;
            if (i != -1) {
                L2.f2351p = i;
            } else {
                WeakHashMap weakHashMap = K.T.f423a;
                L2.f2351p = view2.getImportantForAccessibility();
            }
            RecyclerView recyclerView = c0111c.f2261a;
            if (recyclerView.O()) {
                L2.f2352q = 4;
                recyclerView.f1592t0.add(L2);
            } else {
                WeakHashMap weakHashMap2 = K.T.f423a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    public final void j(View view) {
        if (this.f2357c.remove(view)) {
            C0111C c0111c = this.f2355a;
            c0 L2 = RecyclerView.L(view);
            if (L2 != null) {
                int i = L2.f2351p;
                RecyclerView recyclerView = c0111c.f2261a;
                if (recyclerView.O()) {
                    L2.f2352q = i;
                    recyclerView.f1592t0.add(L2);
                } else {
                    WeakHashMap weakHashMap = K.T.f423a;
                    L2.f2339a.setImportantForAccessibility(i);
                }
                L2.f2351p = 0;
            }
        }
    }

    public final String toString() {
        return this.f2356b.toString() + ", hidden list:" + this.f2357c.size();
    }
}
