package q2;

import f1.b0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b implements o {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f6038a;

    /* renamed from: b, reason: collision with root package name */
    public final float f6039b;

    public b(b0 b0Var, float f6) {
        this.f6038a = b0Var;
        this.f6039b = f6;
    }

    @Override // q2.o
    public final float a() {
        return this.f6039b;
    }

    @Override // q2.o
    public final long b() {
        int i = f1.s.i;
        return f1.s.f2704h;
    }

    @Override // q2.o
    public final f1.p c() {
        return this.f6038a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return q6.i.a(this.f6038a, bVar.f6038a) && Float.compare(this.f6039b, bVar.f6039b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6039b) + (this.f6038a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrushStyle(value=");
        sb.append(this.f6038a);
        sb.append(", alpha=");
        return a0.q.j(sb, this.f6039b, ')');
    }
}
