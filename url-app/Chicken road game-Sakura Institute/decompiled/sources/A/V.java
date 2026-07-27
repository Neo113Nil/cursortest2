package A;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IInterface;
import android.os.Parcel;
import androidx.lifecycle.C0483x;
import androidx.lifecycle.EnumC0475o;
import h.C0643d;
import h.C0645f;
import i.AbstractC0664E;
import java.util.ArrayDeque;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import n.AbstractC0864b;
import v1.C1245b;
import v1.C1248e;
import v1.InterfaceC1247d;
import v1.InterfaceC1249f;
import w2.C1294c;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f61b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f62c;

    /* renamed from: d, reason: collision with root package name */
    public Object f63d;

    public V(int i2) {
        this.f60a = i2;
        switch (i2) {
            case 3:
                long[] jArr = AbstractC0664E.f6891a;
                this.f62c = new i.y();
                this.f63d = new I.d(new Function0[16]);
                break;
            default:
                this.f62c = new Object();
                break;
        }
    }

    public static final void a(V v4) {
        ((i.y) v4.f62c).a();
        int i2 = 0;
        v4.f61b = false;
        I.d dVar = (I.d) v4.f63d;
        int i4 = dVar.f3332i;
        if (i4 > 0) {
            Object[] objArr = dVar.f3330d;
            do {
                ((Function0) objArr[i2]).invoke();
                i2++;
            } while (i2 < i4);
        }
        dVar.g();
    }

    public static final void b(V v4) {
        i.y yVar = (i.y) v4.f62c;
        Object[] objArr = yVar.f6983b;
        long[] jArr = yVar.f6982a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j4 = jArr[i2];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j4) < 128) {
                            X.t tVar = (X.t) objArr[(i2 << 3) + i5];
                            tVar.getClass();
                            X.s sVar = (X.s) ((i.y) X.d.F(tVar).f62c).e(tVar);
                            if (sVar == null) {
                                AbstractC0864b.E("committing a node that was not updated in the current transaction");
                                throw null;
                            }
                            tVar.f4354v = sVar;
                        }
                        j4 >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        yVar.a();
        v4.f61b = false;
        ((I.d) v4.f63d).g();
    }

    public void c(F1.a aVar, U1.e eVar) {
        IInterface iInterface;
        C1294c c1294c = (C1294c) ((C1294c) this.f63d).f11388d;
        c1294c.getClass();
        J1.d dVar = (J1.d) aVar;
        synchronized (dVar.f6039f) {
            if (dVar.f6046m == 5) {
                throw new DeadObjectException();
            }
            if (!dVar.c()) {
                throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
            }
            iInterface = dVar.f6043j;
            H1.o.e(iInterface, "Client is connected but service is null");
        }
        J1.a aVar2 = (J1.a) iInterface;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(aVar2.f3382b);
        int i2 = P1.b.f3783a;
        H1.h hVar = (H1.h) c1294c.f11388d;
        if (hVar == null) {
            obtain.writeInt(0);
        } else {
            obtain.writeInt(1);
            hVar.writeToParcel(obtain, 0);
        }
        try {
            aVar2.f3381a.transact(1, obtain, null, 1);
            obtain.recycle();
            eVar.f4107a.h(null);
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    public int d() {
        C0020p c0020p = (C0020p) this.f63d;
        int i2 = c0020p.f172b;
        int i4 = c0020p.f173c;
        if (i2 < i4) {
            return 2;
        }
        return i2 > i4 ? 1 : 3;
    }

    public void e() {
        InterfaceC1249f interfaceC1249f = (InterfaceC1249f) this.f62c;
        C0483x lifecycle = interfaceC1249f.e();
        if (lifecycle.f5496d != EnumC0475o.f5481e) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        lifecycle.a(new C1245b(interfaceC1249f));
        C1248e c1248e = (C1248e) this.f63d;
        c1248e.getClass();
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        if (c1248e.f10980b) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        lifecycle.a(new s1.k(1, c1248e));
        c1248e.f10980b = true;
        this.f61b = true;
    }

    public void f(Bundle bundle) {
        if (!this.f61b) {
            e();
        }
        C0483x e4 = ((InterfaceC1249f) this.f62c).e();
        if (e4.f5496d.a(EnumC0475o.f5483j)) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + e4.f5496d).toString());
        }
        C1248e c1248e = (C1248e) this.f63d;
        if (!c1248e.f10980b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (c1248e.f10982d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        c1248e.f10981c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        c1248e.f10982d = true;
    }

    public void g(Bundle outBundle) {
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        C1248e c1248e = (C1248e) this.f63d;
        c1248e.getClass();
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        Bundle bundle = new Bundle();
        Bundle bundle2 = c1248e.f10981c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        C0645f c0645f = c1248e.f10979a;
        c0645f.getClass();
        C0643d c0643d = new C0643d(c0645f);
        c0645f.f6824i.put(c0643d, Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(c0643d, "this.components.iteratorWithAdditions()");
        while (c0643d.hasNext()) {
            Map.Entry entry = (Map.Entry) c0643d.next();
            bundle.putBundle((String) entry.getKey(), ((InterfaceC1247d) entry.getValue()).a());
        }
        if (bundle.isEmpty()) {
            return;
        }
        outBundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
    }

    public void h(U1.h hVar) {
        synchronized (this.f62c) {
            try {
                if (((ArrayDeque) this.f63d) == null) {
                    this.f63d = new ArrayDeque();
                }
                ((ArrayDeque) this.f63d).add(hVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void i(U1.d dVar) {
        U1.h hVar;
        synchronized (this.f62c) {
            if (((ArrayDeque) this.f63d) != null && !this.f61b) {
                this.f61b = true;
                while (true) {
                    synchronized (this.f62c) {
                        try {
                            hVar = (U1.h) ((ArrayDeque) this.f63d).poll();
                            if (hVar == null) {
                                this.f61b = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    hVar.a(dVar);
                }
            }
        }
    }

    public String toString() {
        switch (this.f60a) {
            case 0:
                StringBuilder sb = new StringBuilder("SingleSelectionLayout(isStartHandle=");
                sb.append(this.f61b);
                sb.append(", crossed=");
                int d4 = d();
                sb.append(d4 != 1 ? d4 != 2 ? d4 != 3 ? "null" : "COLLAPSED" : "NOT_CROSSED" : "CROSSED");
                sb.append(", info=\n\t");
                sb.append((C0020p) this.f63d);
                sb.append(')');
                return sb.toString();
            case 4:
                StringBuilder sb2 = new StringBuilder("http");
                sb2.append(this.f61b ? "s" : "");
                sb2.append("://");
                sb2.append((String) this.f62c);
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public V(C1294c c1294c, E1.d[] dVarArr) {
        this.f60a = 1;
        this.f63d = c1294c;
        this.f62c = dVarArr;
        this.f61b = false;
    }

    public V(InterfaceC1249f interfaceC1249f) {
        this.f60a = 5;
        this.f62c = interfaceC1249f;
        this.f63d = new C1248e();
    }

    public V(boolean z4, String str, String str2) {
        this.f60a = 4;
        this.f62c = str;
        this.f63d = str2;
        this.f61b = z4;
    }

    public V(boolean z4, r rVar, C0020p c0020p) {
        this.f60a = 0;
        this.f61b = z4;
        this.f62c = rVar;
        this.f63d = c0020p;
    }
}
