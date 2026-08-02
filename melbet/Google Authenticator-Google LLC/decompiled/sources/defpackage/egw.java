package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class egw extends ehd {
    private final cnc a;
    private final Status b;

    public egw(cnc cncVar, Status status) {
        if (cncVar == null) {
            throw new NullPointerException("Null result");
        }
        this.a = cncVar;
        if (status == null) {
            throw new NullPointerException("Null status");
        }
        this.b = status;
    }

    @Override // defpackage.ehd
    public final cnc a() {
        return this.a;
    }

    @Override // defpackage.ehd
    public final Status b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ehd) {
            ehd ehdVar = (ehd) obj;
            if (this.a.equals(ehdVar.a()) && this.b.equals(ehdVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        return this.b.hashCode() ^ (hashCode * 1000003);
    }
}
