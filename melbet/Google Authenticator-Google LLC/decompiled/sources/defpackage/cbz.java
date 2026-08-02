package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cbz {
    public final AtomicInteger a;
    public final AtomicInteger b;
    public final AtomicInteger c;
    public final AtomicInteger d;
    public final AtomicInteger e;
    public final AtomicInteger f;
    public final AtomicInteger g;
    public final AtomicInteger h;
    public final AtomicInteger i;
    public final AtomicInteger j;

    public cbz(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, AtomicInteger atomicInteger3, AtomicInteger atomicInteger4, AtomicInteger atomicInteger5, AtomicInteger atomicInteger6, AtomicInteger atomicInteger7, AtomicInteger atomicInteger8, AtomicInteger atomicInteger9, AtomicInteger atomicInteger10) {
        this.a = atomicInteger;
        this.b = atomicInteger2;
        this.c = atomicInteger3;
        this.d = atomicInteger4;
        this.e = atomicInteger5;
        this.f = atomicInteger6;
        this.g = atomicInteger7;
        this.h = atomicInteger8;
        this.i = atomicInteger9;
        this.j = atomicInteger10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cbz) {
            cbz cbzVar = (cbz) obj;
            if (this.a.equals(cbzVar.a) && this.b.equals(cbzVar.b) && this.c.equals(cbzVar.c) && this.d.equals(cbzVar.d) && this.e.equals(cbzVar.e) && this.f.equals(cbzVar.f) && this.g.equals(cbzVar.g) && this.h.equals(cbzVar.h) && this.i.equals(cbzVar.i) && this.j.equals(cbzVar.j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode();
        return this.j.hashCode() ^ (hashCode * 1000003);
    }

    public final String toString() {
        AtomicInteger atomicInteger = this.j;
        AtomicInteger atomicInteger2 = this.i;
        AtomicInteger atomicInteger3 = this.h;
        AtomicInteger atomicInteger4 = this.g;
        AtomicInteger atomicInteger5 = this.f;
        AtomicInteger atomicInteger6 = this.e;
        AtomicInteger atomicInteger7 = this.d;
        AtomicInteger atomicInteger8 = this.c;
        AtomicInteger atomicInteger9 = this.b;
        return "ClearcutSyncStatsCounter{localAdds=" + this.a.toString() + ", localEdits=" + atomicInteger9.toString() + ", localDeletes=" + atomicInteger8.toString() + ", passboxRpcBatchUpdates=" + atomicInteger7.toString() + ", passboxRpcBatchUpdatesFailure=" + atomicInteger6.toString() + ", passboxRpcDeletes=" + atomicInteger5.toString() + ", passboxRpcDeletesFailure=" + atomicInteger4.toString() + ", passboxAdds=" + atomicInteger3.toString() + ", passboxEdits=" + atomicInteger2.toString() + ", passboxDeletes=" + atomicInteger.toString() + "}";
    }

    public cbz() {
        throw null;
    }
}
