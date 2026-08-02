package u0;

import W.J;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public int f15443c;

    /* renamed from: d, reason: collision with root package name */
    public int f15444d;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f15441a = true;

    /* renamed from: b, reason: collision with root package name */
    public final int f15442b = 65536;

    /* renamed from: e, reason: collision with root package name */
    public int f15445e = 0;

    /* renamed from: f, reason: collision with root package name */
    public a[] f15446f = new a[100];

    public final synchronized a a() {
        a aVar;
        try {
            int i4 = this.f15444d + 1;
            this.f15444d = i4;
            int i5 = this.f15445e;
            if (i5 > 0) {
                a[] aVarArr = this.f15446f;
                int i6 = i5 - 1;
                this.f15445e = i6;
                aVar = aVarArr[i6];
                aVar.getClass();
                this.f15446f[this.f15445e] = null;
            } else {
                a aVar2 = new a(0, new byte[this.f15442b]);
                a[] aVarArr2 = this.f15446f;
                if (i4 > aVarArr2.length) {
                    this.f15446f = (a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                }
                aVar = aVar2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return aVar;
    }

    public final synchronized void b(S0.d dVar) {
        while (dVar != null) {
            try {
                a[] aVarArr = this.f15446f;
                int i4 = this.f15445e;
                this.f15445e = i4 + 1;
                a aVar = (a) dVar.f2409c;
                aVar.getClass();
                aVarArr[i4] = aVar;
                this.f15444d--;
                dVar = (S0.d) dVar.f2410d;
                if (dVar == null || ((a) dVar.f2409c) == null) {
                    dVar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        notifyAll();
    }

    public final synchronized void c(int i4) {
        boolean z = i4 < this.f15443c;
        this.f15443c = i4;
        if (z) {
            d();
        }
    }

    public final synchronized void d() {
        int max = Math.max(0, J.g(this.f15443c, this.f15442b) - this.f15444d);
        int i4 = this.f15445e;
        if (max >= i4) {
            return;
        }
        Arrays.fill(this.f15446f, max, i4, (Object) null);
        this.f15445e = max;
    }
}
