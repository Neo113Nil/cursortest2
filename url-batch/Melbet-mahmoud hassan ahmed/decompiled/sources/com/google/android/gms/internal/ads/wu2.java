package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ea1;
import com.google.android.gms.internal.ads.v61;

/* loaded from: classes.dex */
public final class wu2<R extends ea1<AdT>, AdT extends v61> {

    /* renamed from: a, reason: collision with root package name */
    private final pu2<R, AdT> f13946a;

    /* renamed from: b, reason: collision with root package name */
    private final cc3<nu2<R, AdT>> f13947b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f13948c = false;

    /* renamed from: d, reason: collision with root package name */
    private boolean f13949d = false;

    public wu2(final tt2 tt2Var, final ou2<R, AdT> ou2Var, final pu2<R, AdT> pu2Var) {
        this.f13946a = pu2Var;
        this.f13947b = rb3.g(rb3.n(ou2Var.a(pu2Var), new xa3() { // from class: com.google.android.gms.internal.ads.uu2
            @Override // com.google.android.gms.internal.ads.xa3
            public final cc3 c(Object obj) {
                return wu2.this.b(ou2Var, tt2Var, pu2Var, (cu2) obj);
            }
        }, pu2Var.a()), Exception.class, new xa3() { // from class: com.google.android.gms.internal.ads.tu2
            @Override // com.google.android.gms.internal.ads.xa3
            public final cc3 c(Object obj) {
                return wu2.this.c(ou2Var, (Exception) obj);
            }
        }, pu2Var.a());
    }

    public final synchronized cc3<nu2<R, AdT>> a(pu2<R, AdT> pu2Var) {
        if (!this.f13949d && !this.f13948c) {
            if (this.f13946a.zza() != null && pu2Var.zza() != null && this.f13946a.zza().equals(pu2Var.zza())) {
                this.f13948c = true;
                return this.f13947b;
            }
            return null;
        }
        return null;
    }

    final /* synthetic */ cc3 b(ou2 ou2Var, tt2 tt2Var, pu2 pu2Var, cu2 cu2Var) {
        synchronized (this) {
            this.f13949d = true;
            ou2Var.b(cu2Var);
            if (this.f13948c) {
                return rb3.i(new nu2(cu2Var, pu2Var));
            }
            tt2Var.a(pu2Var.zza(), cu2Var);
            return rb3.i(null);
        }
    }

    final /* synthetic */ cc3 c(ou2 ou2Var, Exception exc) {
        synchronized (this) {
            this.f13949d = true;
            throw exc;
        }
    }

    public final synchronized void d(nb3<Void> nb3Var) {
        rb3.r(rb3.n(this.f13947b, new xa3() { // from class: com.google.android.gms.internal.ads.vu2
            @Override // com.google.android.gms.internal.ads.xa3
            public final cc3 c(Object obj) {
                return rb3.j();
            }
        }, this.f13946a.a()), nb3Var, this.f13946a.a());
    }
}
