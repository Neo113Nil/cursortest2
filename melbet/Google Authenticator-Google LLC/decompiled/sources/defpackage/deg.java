package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class deg implements cnc {
    public final ded a;
    private final Status b;

    public deg(Status status, ded dedVar) {
        this.b = status;
        this.a = dedVar;
    }

    @Override // defpackage.cnc
    public final Status b() {
        return this.b;
    }

    public final String toString() {
        ded dedVar = this.a;
        oy.at(dedVar);
        return String.format("OptInOptionsResultImpl[%s]", Boolean.valueOf(dedVar.a == 1));
    }
}
