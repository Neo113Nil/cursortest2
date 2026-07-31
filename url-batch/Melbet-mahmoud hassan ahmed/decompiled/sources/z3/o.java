package z3;

import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
final class o extends e {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ j4.i f23701f;

    o(p pVar, j4.i iVar) {
        this.f23701f = iVar;
    }

    @Override // z3.f
    public final void J3(Status status, l3.f fVar) {
        q3.o.a(status, fVar != null ? new l3.c(fVar.g(), fVar.c()) : null, this.f23701f);
    }
}
