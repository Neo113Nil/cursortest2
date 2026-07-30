package a0;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IInterface;
import android.os.Parcel;
import c7.m1;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f136b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f137c;

    /* renamed from: d, reason: collision with root package name */
    public Object f138d;

    public s0(l1.x xVar, j4.d[] dVarArr) {
        this.f135a = 3;
        this.f138d = xVar;
        this.f137c = dVarArr;
        this.f136b = false;
    }

    public static final void a(s0 s0Var) {
        ((i.x) s0Var.f137c).a();
        int i7 = 0;
        s0Var.f136b = false;
        i0.d dVar = (i0.d) s0Var.f138d;
        int i8 = dVar.f4842h;
        if (i8 > 0) {
            Object[] objArr = dVar.f4840f;
            do {
                ((q6.a) objArr[i7]).a();
                i7++;
            } while (i7 < i8);
        }
        dVar.h();
    }

    public static final void b(s0 s0Var) {
        i.x xVar = (i.x) s0Var.f137c;
        Object[] objArr = xVar.f4813b;
        long[] jArr = xVar.f4812a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j8 = jArr[i7];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    for (int i9 = 0; i9 < i8; i9++) {
                        if ((255 & j8) < 128) {
                            x0.r rVar = (x0.r) objArr[(i7 << 3) + i9];
                            rVar.getClass();
                            x0.q qVar = (x0.q) ((i.x) x0.d.E(rVar).f137c).e(rVar);
                            if (qVar == null) {
                                a.a.N("committing a node that was not updated in the current transaction");
                                throw null;
                            }
                            rVar.f9634u = qVar;
                        }
                        j8 >>= 8;
                    }
                    if (i8 != 8) {
                        break;
                    }
                }
                if (i7 == length) {
                    break;
                } else {
                    i7++;
                }
            }
        }
        xVar.a();
        s0Var.f136b = false;
        ((i0.d) s0Var.f138d).h();
    }

    public void c() {
        ((e7.e) this.f137c).k(new CancellationException("onBack cancelled"), true);
        ((m1) this.f138d).c(null);
    }

    public void d(k4.a aVar, z4.c cVar) {
        IInterface iInterface;
        m4.h hVar = (m4.h) ((l1.x) ((l1.x) this.f138d).f5847g).f5847g;
        o4.d dVar = (o4.d) aVar;
        synchronized (dVar.f1784f) {
            if (dVar.f1791m == 5) {
                throw new DeadObjectException();
            }
            if (!dVar.a()) {
                throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
            }
            iInterface = dVar.f1788j;
            m4.o.e(iInterface, "Client is connected but service is null");
        }
        o4.a aVar2 = (o4.a) iInterface;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(aVar2.f6831d);
        int i7 = u4.b.f9052a;
        if (hVar == null) {
            obtain.writeInt(0);
        } else {
            obtain.writeInt(1);
            hVar.writeToParcel(obtain, 0);
        }
        try {
            aVar2.f6830c.transact(1, obtain, null, 1);
            obtain.recycle();
            cVar.f10092a.d(null);
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    public int e() {
        p pVar = (p) this.f138d;
        int i7 = pVar.f118b;
        int i8 = pVar.f119c;
        if (i7 < i8) {
            return 2;
        }
        return i7 > i8 ? 1 : 3;
    }

    public void f() {
        x3.f fVar = (x3.f) this.f137c;
        androidx.lifecycle.x f9 = fVar.f();
        if (f9.f1046d != androidx.lifecycle.o.f1008g) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        f9.a(new x3.b(0, fVar));
        x3.e eVar = (x3.e) this.f138d;
        eVar.getClass();
        if (eVar.f9676b) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        f9.a(new t3.j(1, eVar));
        eVar.f9676b = true;
        this.f136b = true;
    }

    public void g(Bundle bundle) {
        if (!this.f136b) {
            f();
        }
        androidx.lifecycle.x f9 = ((x3.f) this.f137c).f();
        if (f9.f1046d.compareTo(androidx.lifecycle.o.f1010i) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + f9.f1046d).toString());
        }
        x3.e eVar = (x3.e) this.f138d;
        if (!eVar.f9676b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (eVar.f9678d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        eVar.f9677c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        eVar.f9678d = true;
    }

    public void h(Bundle bundle) {
        x3.e eVar = (x3.e) this.f138d;
        eVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = eVar.f9677c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        h.f fVar = eVar.f9675a;
        fVar.getClass();
        h.d dVar = new h.d(fVar);
        fVar.f4585h.put(dVar, Boolean.FALSE);
        while (dVar.hasNext()) {
            Map.Entry entry = (Map.Entry) dVar.next();
            bundle2.putBundle((String) entry.getKey(), ((x3.d) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    public void i(z4.f fVar) {
        synchronized (this.f137c) {
            try {
                if (((ArrayDeque) this.f138d) == null) {
                    this.f138d = new ArrayDeque();
                }
                ((ArrayDeque) this.f138d).add(fVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j(z4.i iVar) {
        z4.f fVar;
        synchronized (this.f137c) {
            if (((ArrayDeque) this.f138d) != null && !this.f136b) {
                this.f136b = true;
                while (true) {
                    synchronized (this.f137c) {
                        try {
                            fVar = (z4.f) ((ArrayDeque) this.f138d).poll();
                            if (fVar == null) {
                                this.f136b = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    fVar.a(iVar);
                }
            }
        }
    }

    public String toString() {
        switch (this.f135a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                StringBuilder sb = new StringBuilder("SingleSelectionLayout(isStartHandle=");
                sb.append(this.f136b);
                sb.append(", crossed=");
                int e9 = e();
                sb.append(e9 != 1 ? e9 != 2 ? e9 != 3 ? "null" : "COLLAPSED" : "NOT_CROSSED" : "CROSSED");
                sb.append(", info=\n\t");
                sb.append((p) this.f138d);
                sb.append(')');
                return sb.toString();
            case 1:
            default:
                return super.toString();
            case 2:
                StringBuilder sb2 = new StringBuilder("http");
                sb2.append(this.f136b ? "s" : "");
                sb2.append("://");
                sb2.append((String) this.f137c);
                return sb2.toString();
        }
    }

    public s0(x3.f fVar) {
        this.f135a = 5;
        this.f137c = fVar;
        this.f138d = new x3.e();
    }

    public s0(boolean z8, String str, String str2) {
        this.f135a = 2;
        this.f137c = str;
        this.f138d = str2;
        this.f136b = z8;
    }

    public s0(int i7) {
        this.f135a = i7;
        switch (i7) {
            case 6:
                this.f137c = new Object();
                break;
            default:
                long[] jArr = i.e0.f4736a;
                this.f137c = new i.x();
                this.f138d = new i0.d(new q6.a[16]);
                break;
        }
    }

    public s0(h7.c cVar, boolean z8, q6.e eVar, c.e eVar2) {
        this.f135a = 1;
        this.f136b = z8;
        this.f137c = j1.c.C(-2, 4, e7.a.f2833f);
        this.f138d = c7.a0.p(cVar, null, null, new androidx.lifecycle.g0(eVar2, eVar, this, (h6.d) null, 3), 3);
    }

    public s0(boolean z8, r rVar, p pVar) {
        this.f135a = 0;
        this.f136b = z8;
        this.f137c = rVar;
        this.f138d = pVar;
    }
}
