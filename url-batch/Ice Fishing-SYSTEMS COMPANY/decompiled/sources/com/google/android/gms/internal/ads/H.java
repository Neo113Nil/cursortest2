package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import t0.AbstractC5019C;
import t0.C5036U;

/* loaded from: classes2.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f25264a;

    /* renamed from: b, reason: collision with root package name */
    public int f25265b;

    /* renamed from: c, reason: collision with root package name */
    public int f25266c;

    /* renamed from: d, reason: collision with root package name */
    public int f25267d;

    /* renamed from: e, reason: collision with root package name */
    public int f25268e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f25269f;

    public H() {
        this.f25269f = new G[5];
        this.f25264a = new ArrayList();
        this.f25265b = -1;
    }

    public void a() {
        View view = (View) this.f25264a.get(r0.size() - 1);
        C5036U c5036u = (C5036U) view.getLayoutParams();
        this.f25266c = ((StaggeredGridLayoutManager) this.f25269f).f5400r.b(view);
        c5036u.getClass();
    }

    public void b() {
        this.f25264a.clear();
        this.f25265b = Integer.MIN_VALUE;
        this.f25266c = Integer.MIN_VALUE;
        this.f25267d = 0;
    }

    public int c() {
        return ((StaggeredGridLayoutManager) this.f25269f).f5405w ? e(r1.size() - 1, -1) : e(0, this.f25264a.size());
    }

    public int d() {
        return ((StaggeredGridLayoutManager) this.f25269f).f5405w ? e(0, this.f25264a.size()) : e(r1.size() - 1, -1);
    }

    public int e(int i, int i4) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f25269f;
        int k6 = staggeredGridLayoutManager.f5400r.k();
        int g9 = staggeredGridLayoutManager.f5400r.g();
        int i9 = i4 > i ? 1 : -1;
        while (i != i4) {
            View view = (View) this.f25264a.get(i);
            int e6 = staggeredGridLayoutManager.f5400r.e(view);
            int b9 = staggeredGridLayoutManager.f5400r.b(view);
            boolean z8 = e6 <= g9;
            boolean z9 = b9 >= k6;
            if (z8 && z9 && (e6 < k6 || b9 > g9)) {
                return AbstractC5019C.H(view);
            }
            i += i9;
        }
        return -1;
    }

    public int f(int i) {
        int i4 = this.f25266c;
        if (i4 != Integer.MIN_VALUE) {
            return i4;
        }
        if (this.f25264a.size() == 0) {
            return i;
        }
        a();
        return this.f25266c;
    }

    public View g(int i, int i4) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f25269f;
        ArrayList arrayList = this.f25264a;
        View view = null;
        if (i4 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f5405w && AbstractC5019C.H(view2) >= i) || ((!staggeredGridLayoutManager.f5405w && AbstractC5019C.H(view2) <= i) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i9 = 0;
        while (i9 < size2) {
            View view3 = (View) arrayList.get(i9);
            if ((staggeredGridLayoutManager.f5405w && AbstractC5019C.H(view3) <= i) || ((!staggeredGridLayoutManager.f5405w && AbstractC5019C.H(view3) >= i) || !view3.hasFocusable())) {
                break;
            }
            i9++;
            view = view3;
        }
        return view;
    }

    public int h(int i) {
        int i4 = this.f25265b;
        if (i4 != Integer.MIN_VALUE) {
            return i4;
        }
        if (this.f25264a.size() == 0) {
            return i;
        }
        View view = (View) this.f25264a.get(0);
        C5036U c5036u = (C5036U) view.getLayoutParams();
        this.f25265b = ((StaggeredGridLayoutManager) this.f25269f).f5400r.e(view);
        c5036u.getClass();
        return this.f25265b;
    }

    public void i(float f6, int i) {
        G g9;
        int i4 = this.f25265b;
        ArrayList arrayList = this.f25264a;
        if (i4 != 1) {
            Collections.sort(arrayList, C2959b.f29360E);
            this.f25265b = 1;
        }
        int i9 = this.f25268e;
        G[] gArr = (G[]) this.f25269f;
        if (i9 > 0) {
            int i10 = i9 - 1;
            this.f25268e = i10;
            g9 = gArr[i10];
        } else {
            g9 = new G();
        }
        int i11 = this.f25266c;
        this.f25266c = i11 + 1;
        g9.f25078a = i11;
        g9.f25079b = i;
        g9.f25080c = f6;
        arrayList.add(g9);
        this.f25267d += i;
        while (true) {
            int i12 = this.f25267d;
            if (i12 <= 2000) {
                return;
            }
            int i13 = i12 - 2000;
            G g10 = (G) arrayList.get(0);
            int i14 = g10.f25079b;
            if (i14 <= i13) {
                this.f25267d -= i14;
                arrayList.remove(0);
                int i15 = this.f25268e;
                if (i15 < 5) {
                    this.f25268e = i15 + 1;
                    gArr[i15] = g10;
                }
            } else {
                g10.f25079b = i14 - i13;
                this.f25267d -= i13;
            }
        }
    }

    public float j() {
        int i = this.f25265b;
        ArrayList arrayList = this.f25264a;
        if (i != 0) {
            Collections.sort(arrayList, C2959b.f29359D);
            this.f25265b = 0;
        }
        float f6 = this.f25267d;
        int i4 = 0;
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            float f9 = 0.5f * f6;
            G g9 = (G) arrayList.get(i9);
            i4 += g9.f25079b;
            if (i4 >= f9) {
                return g9.f25080c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((G) arrayList.get(arrayList.size() - 1)).f25080c;
    }

    public H(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f25269f = staggeredGridLayoutManager;
        this.f25264a = new ArrayList();
        this.f25265b = Integer.MIN_VALUE;
        this.f25266c = Integer.MIN_VALUE;
        this.f25267d = 0;
        this.f25268e = i;
    }
}
