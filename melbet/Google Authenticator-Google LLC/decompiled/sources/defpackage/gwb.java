package defpackage;

import android.util.SparseArray;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gwb {
    public final String a;
    public final UUID b;
    public final gvy c;
    public final SparseArray d;
    public final int e;

    public gwb(String str, UUID uuid, gvy gvyVar, SparseArray sparseArray, int i) {
        this.a = str;
        this.b = uuid;
        this.c = gvyVar;
        this.d = sparseArray;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gwb) {
            gwb gwbVar = (gwb) obj;
            if (this.a.equals(gwbVar.a) && this.b.equals(gwbVar.b) && this.c.equals(gwbVar.c) && this.d.equals(gwbVar.d) && this.e == gwbVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e ^ ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003);
    }

    public final String toString() {
        SparseArray sparseArray = this.d;
        gvy gvyVar = this.c;
        return "TraceSnapshot{name=" + this.a + ", rootTraceId=" + String.valueOf(this.b) + ", record=" + String.valueOf(gvyVar) + ", spanExtrasSparseArray=" + String.valueOf(sparseArray) + ", numUnfinishedSpans=" + this.e + "}";
    }

    public gwb() {
        throw null;
    }
}
