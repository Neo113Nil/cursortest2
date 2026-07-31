package r;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class q1 implements v {

    /* renamed from: a, reason: collision with root package name */
    public final int f6399a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6400b;

    /* renamed from: c, reason: collision with root package name */
    public final t f6401c;

    public q1(int i, int i8, t tVar) {
        this.f6399a = i;
        this.f6400b = i8;
        this.f6401c = tVar;
    }

    @Override // r.j
    public final t1 a(r1 r1Var) {
        return new b3.g(this.f6399a, this.f6400b, this.f6401c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q1) {
            q1 q1Var = (q1) obj;
            if (q1Var.f6399a == this.f6399a && q1Var.f6400b == this.f6400b && q6.i.a(q1Var.f6401c, this.f6401c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f6401c.hashCode() + (this.f6399a * 31)) * 31) + this.f6400b;
    }
}
