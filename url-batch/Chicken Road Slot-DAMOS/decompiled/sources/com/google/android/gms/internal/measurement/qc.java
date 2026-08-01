package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.logging.Level;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class qc implements f8.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2710a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2711b;

    public /* synthetic */ qc(int i3, Object obj) {
        this.f2710a = i3;
        this.f2711b = obj;
    }

    @Override // f8.z
    public final ListenableFuture apply(Object obj) {
        switch (this.f2710a) {
            case 0:
                vc vcVar = (vc) this.f2711b;
                int i3 = ((hb) obj).f2375d;
                if ((i3 == 29501 || i3 == 29537 || i3 == 29538 || i3 == 29539 || i3 == 29540 || i3 == 29541 || i3 == 29542 || i3 == 29543 || i3 == 29544) && !vcVar.f2891h.P()) {
                    vcVar.b();
                }
                return f8.o0.f4157e;
            case 1:
                final a1.n nVar = (a1.n) this.f2711b;
                final od odVar = (od) obj;
                nVar.getClass();
                Callable callable = new Callable() { // from class: com.google.android.gms.internal.measurement.ld
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        od odVar2 = odVar;
                        a1.n nVar2 = a1.n.this;
                        sa saVar = (sa) nVar2.f41i;
                        l5 l5Var = new l5(7);
                        try {
                            zd zdVar = (zd) saVar.f2791f.get();
                            Uri uri = (Uri) nVar2.f42r;
                            l5 l5Var2 = new l5(odVar2);
                            l5Var2.f2500i = new l5[]{l5Var};
                            return null;
                        } catch (IOException | RuntimeException e2) {
                            h.h(Level.WARNING, saVar.a(), e2, "Failed to update snapshot for %s flags may be stale.", (String) nVar2.f40e);
                            return null;
                        }
                    }
                };
                f8.u0 a9 = ((sa) nVar.f41i).a();
                f8.z0 z0Var = new f8.z0(callable);
                a9.execute(z0Var);
                return z0Var;
            case 2:
                return f8.l0.e((ListenableFuture) ((rd) this.f2711b).f2752e.get());
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                return f8.l0.d(((tc) this.f2711b).apply(obj));
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                return ((re) this.f2711b).f2760e.i();
            default:
                IOException iOException = (IOException) this.f2711b;
                iOException.addSuppressed((IOException) obj);
                throw iOException;
        }
    }
}
