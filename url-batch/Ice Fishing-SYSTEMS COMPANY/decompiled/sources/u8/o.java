package u8;

/* loaded from: classes2.dex */
public final class o implements x {

    /* renamed from: n, reason: collision with root package name */
    public final g f41298n;

    /* renamed from: u, reason: collision with root package name */
    public final e f41299u;

    /* renamed from: v, reason: collision with root package name */
    public s f41300v;

    /* renamed from: w, reason: collision with root package name */
    public int f41301w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f41302x;

    /* renamed from: y, reason: collision with root package name */
    public long f41303y;

    public o(g gVar) {
        this.f41298n = gVar;
        e Q3 = gVar.Q();
        this.f41299u = Q3;
        s sVar = Q3.f41276n;
        this.f41300v = sVar;
        this.f41301w = sVar != null ? sVar.f41312b : -1;
    }

    @Override // u8.x
    public final z L() {
        return this.f41298n.L();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f41302x = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r9 == r0.f41312b) goto L13;
     */
    @Override // u8.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long f(long j9, e sink) {
        s sVar;
        kotlin.jvm.internal.h.e(sink, "sink");
        if (this.f41302x) {
            throw new IllegalStateException("closed");
        }
        s sVar2 = this.f41300v;
        e eVar = this.f41299u;
        if (sVar2 != null) {
            s sVar3 = eVar.f41276n;
            if (sVar2 == sVar3) {
                int i = this.f41301w;
                kotlin.jvm.internal.h.b(sVar3);
            }
            throw new IllegalStateException("Peek source is invalid because upstream source was used");
        }
        if (!this.f41298n.S(this.f41303y + 1)) {
            return -1L;
        }
        if (this.f41300v == null && (sVar = eVar.f41276n) != null) {
            this.f41300v = sVar;
            this.f41301w = sVar.f41312b;
        }
        long min = Math.min(8192L, eVar.f41277u - this.f41303y);
        this.f41299u.a(sink, this.f41303y, min);
        this.f41303y += min;
        return min;
    }
}
