package N3;

import T.C0097o;
import W.AbstractC0108a;
import W.J;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import io.appmetrica.analytics.impl.ap;
import java.lang.ref.WeakReference;
import k.C1232s;

/* loaded from: classes.dex */
public final class A implements S0.e {

    /* renamed from: a, reason: collision with root package name */
    public final int f1810a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1811b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1812c;

    public A() {
        this.f1812c = new A[256];
        this.f1810a = 0;
        this.f1811b = 0;
    }

    @Override // S0.e
    public int a() {
        return this.f1810a;
    }

    @Override // S0.e
    public int b() {
        return this.f1811b;
    }

    @Override // S0.e
    public int c() {
        int i4 = this.f1810a;
        return i4 == -1 ? ((W.u) this.f1812c).D() : i4;
    }

    public void d() {
        new Handler(Looper.getMainLooper()).post(new ap(5, this));
    }

    public void e(Typeface typeface) {
        int i4;
        WeakReference weakReference = (WeakReference) this.f1812c;
        C1232s c1232s = (C1232s) weakReference.get();
        if (c1232s == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 28 && (i4 = this.f1810a) != -1) {
            typeface = Typeface.create(typeface, i4, (this.f1811b & 2) != 0);
        }
        c1232s.f14090a.post(new B.a(weakReference, 16, typeface));
    }

    public A(int i4, int i5) {
        this.f1812c = null;
        this.f1810a = i4;
        int i6 = i5 & 7;
        this.f1811b = i6 == 0 ? 8 : i6;
    }

    public A(C1232s c1232s, int i4, int i5) {
        this.f1812c = new WeakReference(c1232s);
        this.f1810a = i4;
        this.f1811b = i5;
    }

    public A(int i4, int i5, SparseArray sparseArray) {
        this.f1810a = i4;
        this.f1811b = i5;
        this.f1812c = sparseArray;
    }

    public A(X.d dVar, C0097o c0097o) {
        W.u uVar = dVar.f3494c;
        this.f1812c = uVar;
        uVar.M(12);
        int D3 = uVar.D();
        if ("audio/raw".equals(c0097o.n)) {
            int s4 = J.s(c0097o.f2848H) * c0097o.f2846F;
            if (D3 % s4 != 0) {
                AbstractC0108a.s("BoxParsers", "Audio sample size mismatch. stsd sample size: " + s4 + ", stsz sample size: " + D3);
                D3 = s4;
            }
        }
        this.f1810a = D3 == 0 ? -1 : D3;
        this.f1811b = uVar.D();
    }
}
