package T0;

import android.os.Parcel;
import c1.AbstractC0277b;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2256a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2257b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2258c;

    public M() {
        this.f2257b = new Object();
    }

    public void a(S0.a aVar, k1.h hVar) {
        U0.j jVar = (U0.j) ((D3.M) ((J1.c) this.f2258c).f1289g).f401g;
        W0.a aVar2 = (W0.a) ((W0.d) aVar).r();
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(aVar2.f3774e);
        int i7 = AbstractC0277b.f3775a;
        if (jVar == null) {
            obtain.writeInt(0);
        } else {
            obtain.writeInt(1);
            jVar.writeToParcel(obtain, 0);
        }
        try {
            aVar2.f3773d.transact(1, obtain, null, 1);
            obtain.recycle();
            hVar.a(null);
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    public void b(double d7, double d8) {
        double[] dArr = (double[]) this.f2257b;
        double d9 = 1.0d;
        if (!this.f2256a) {
            d9 = 1.0d / (((dArr[7] * d8) + (dArr[3] * d7)) + dArr[15]);
        }
        double d10 = ((dArr[4] * d8) + (dArr[0] * d7) + dArr[12]) * d9;
        double d11 = ((dArr[5] * d8) + (dArr[1] * d7) + dArr[13]) * d9;
        double[] dArr2 = (double[]) this.f2258c;
        if (d10 < dArr2[0]) {
            dArr2[0] = d10;
        } else if (d10 > dArr2[1]) {
            dArr2[1] = d10;
        }
        if (d11 < dArr2[2]) {
            dArr2[2] = d11;
        } else if (d11 > dArr2[3]) {
            dArr2[3] = d11;
        }
    }

    public void c(k1.l lVar) {
        synchronized (this.f2257b) {
            try {
                if (((ArrayDeque) this.f2258c) == null) {
                    this.f2258c = new ArrayDeque();
                }
                ((ArrayDeque) this.f2258c).add(lVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(k1.n nVar) {
        k1.l lVar;
        synchronized (this.f2257b) {
            if (((ArrayDeque) this.f2258c) != null && !this.f2256a) {
                this.f2256a = true;
                while (true) {
                    synchronized (this.f2257b) {
                        try {
                            lVar = (k1.l) ((ArrayDeque) this.f2258c).poll();
                            if (lVar == null) {
                                this.f2256a = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    lVar.c(nVar);
                }
            }
        }
    }

    public M(J1.c cVar, R0.c[] cVarArr, boolean z5) {
        this.f2258c = cVar;
        this.f2257b = cVarArr;
        boolean z6 = false;
        if (cVarArr != null && z5) {
            z6 = true;
        }
        this.f2256a = z6;
    }

    public M(boolean z5, double[] dArr, double[] dArr2) {
        this.f2256a = z5;
        this.f2257b = dArr;
        this.f2258c = dArr2;
    }
}
