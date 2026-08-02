package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class fdw implements fdv {
    long a;

    public fdw(byte[] bArr) {
        this.a = 0L;
    }

    @Override // defpackage.fdv
    public final ihp a() {
        jkj k = ihp.a.k();
        long j = this.a;
        if (!k.b.M()) {
            k.t();
        }
        ihp ihpVar = (ihp) k.b;
        ihpVar.b = 1;
        ihpVar.c = Long.valueOf(j);
        return (ihp) k.q();
    }

    @Override // defpackage.fdv
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.a += ((Long) obj).longValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof fdw) && this.a == ((fdw) obj).a;
    }

    public final int hashCode() {
        return Long.valueOf(this.a).hashCode();
    }

    public final String toString() {
        return Long.toString(this.a);
    }

    fdw() {
        throw null;
    }
}
