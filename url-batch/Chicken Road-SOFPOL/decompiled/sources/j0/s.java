package j0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final float f3881a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3882b;

    /* renamed from: c, reason: collision with root package name */
    public final float f3883c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3884d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3885e;

    public s(float f6, float f8, float f9, float f10, float f11) {
        this.f3881a = f6;
        this.f3882b = f8;
        this.f3883c = f9;
        this.f3884d = f10;
        this.f3885e = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return r2.f.a(this.f3881a, sVar.f3881a) && r2.f.a(this.f3882b, sVar.f3882b) && r2.f.a(this.f3883c, sVar.f3883c) && r2.f.a(this.f3884d, sVar.f3884d) && r2.f.a(this.f3885e, sVar.f3885e);
    }

    public final int hashCode() {
        return Float.hashCode(this.f3885e) + a0.q.a(this.f3884d, a0.q.a(this.f3883c, a0.q.a(this.f3882b, Float.hashCode(this.f3881a) * 31, 31), 31), 31);
    }
}
