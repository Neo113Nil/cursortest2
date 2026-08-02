package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dal implements cyk {
    private final Status a;
    private final cpe b;

    public dal(Status status, cpe cpeVar) {
        this.a = status;
        this.b = cpeVar;
    }

    @Override // defpackage.cna
    public final void a() {
        cpe cpeVar = this.b;
        if (cpeVar != null) {
            cpeVar.a();
        }
    }

    @Override // defpackage.cnc
    public final Status b() {
        return this.a;
    }

    @Override // defpackage.cyk
    public final cpe c() {
        return this.b;
    }
}
