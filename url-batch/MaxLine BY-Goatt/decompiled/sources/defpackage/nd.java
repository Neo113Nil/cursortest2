package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class nd implements so2 {
    public final k03 m;
    public final lz1 n;
    public sd o;
    public long p;
    public long q;
    public boolean r;

    public nd(k03 k03Var, Object obj, sd sdVar, long j, long j2, boolean z) {
        sd sdVar2;
        this.m = k03Var;
        this.n = ij2.j(obj);
        if (sdVar != null) {
            sdVar2 = yk3.A(sdVar);
        } else {
            sdVar2 = (sd) k03Var.a.invoke(obj);
            sdVar2.d();
        }
        this.o = sdVar2;
        this.p = j;
        this.q = j2;
        this.r = z;
    }

    public final Object a() {
        return this.m.b.invoke(this.o);
    }

    @Override // defpackage.so2
    public final Object getValue() {
        return this.n.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.n.getValue() + ", velocity=" + a() + ", isRunning=" + this.r + ", lastFrameTimeNanos=" + this.p + ", finishedTimeNanos=" + this.q + ')';
    }

    public /* synthetic */ nd(k03 k03Var, Object obj, sd sdVar, int i) {
        this(k03Var, obj, (i & 4) != 0 ? null : sdVar, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }
}
