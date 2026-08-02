package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dei extends dee {
    private final cnr a;
    private final def b;
    private final dbz c;

    public dei(def defVar, cnr cnrVar, dbz dbzVar) {
        this.b = defVar;
        this.a = cnrVar;
        this.c = dbzVar;
    }

    @Override // defpackage.dee
    public final void c(Status status) {
        boolean c = status.c();
        cnr cnrVar = this.a;
        if (c) {
            cnrVar.i(Status.a);
        } else {
            cnrVar.i(status);
        }
    }

    @Override // defpackage.dee
    public final void d(Status status) {
        if (!status.c()) {
            this.a.i(status);
            return;
        }
        dbz dbzVar = this.c;
        if (dbzVar == null) {
            this.a.i(Status.a);
        } else {
            this.b.e(dbzVar, this);
        }
    }
}
