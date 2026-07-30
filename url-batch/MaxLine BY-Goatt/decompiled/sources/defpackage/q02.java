package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class q02 implements pn2 {
    public final pq m;
    public final fq n;
    public ug2 o;
    public int p;
    public boolean q;
    public long r;

    public q02(pq pqVar) {
        this.m = pqVar;
        fq t = pqVar.t();
        this.n = t;
        ug2 ug2Var = t.m;
        this.o = ug2Var;
        this.p = ug2Var != null ? ug2Var.b : -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.q = true;
    }

    @Override // defpackage.pn2
    public final rx2 e() {
        return this.m.e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if (r3 == r5.b) goto L15;
     */
    @Override // defpackage.pn2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long h(long j, fq fqVar) {
        ug2 ug2Var;
        fqVar.getClass();
        if (j < 0) {
            lh.c(q40.i(j, "byteCount < 0: "));
            return 0L;
        }
        if (this.q) {
            lh.g("closed");
            return 0L;
        }
        ug2 ug2Var2 = this.o;
        fq fqVar2 = this.n;
        if (ug2Var2 != null) {
            ug2 ug2Var3 = fqVar2.m;
            if (ug2Var2 == ug2Var3) {
                int i = this.p;
                ug2Var3.getClass();
            }
            lh.g("Peek source is invalid because upstream source was used");
            return 0L;
        }
        if (j == 0) {
            return 0L;
        }
        if (!this.m.request(this.r + 1)) {
            return -1L;
        }
        if (this.o == null && (ug2Var = fqVar2.m) != null) {
            this.o = ug2Var;
            this.p = ug2Var.b;
        }
        long min = Math.min(j, fqVar2.n - this.r);
        this.n.f(fqVar, this.r, min);
        this.r += min;
        return min;
    }
}
