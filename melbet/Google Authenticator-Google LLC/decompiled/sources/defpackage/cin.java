package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cin extends cii {
    final /* synthetic */ cib a;
    final /* synthetic */ bst b;

    public cin(cib cibVar, bst bstVar) {
        this.a = cibVar;
        this.b = bstVar;
    }

    @Override // defpackage.cii
    public final void d(Status status, cic cicVar) {
        boolean z = this.a.n;
        bst bstVar = this.b;
        if (z) {
            ciq.e(status, cicVar, bstVar);
        } else {
            ciq.f(status, cicVar, bstVar);
        }
    }

    @Override // defpackage.cii
    public final void f(Status status, cic cicVar) {
        boolean z = this.a.n;
        bst bstVar = this.b;
        if (z) {
            ciq.e(status, cicVar, bstVar);
        } else {
            ciq.f(status, cicVar, bstVar);
        }
    }
}
