package p2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final int f7191a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7192b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7193c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7194d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f7195e;

    public z(int i7, boolean z8, boolean z9) {
        g0.z zVar = l.f7153a;
        int i8 = !z8 ? 262152 : 262144;
        i8 = i7 == 2 ? i8 | 8192 : i8;
        i8 = z9 ? i8 : i8 | 512;
        boolean z10 = i7 == 1;
        this.f7191a = i8;
        this.f7192b = z10;
        this.f7193c = true;
        this.f7194d = true;
        this.f7195e = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f7191a == zVar.f7191a && this.f7192b == zVar.f7192b && this.f7193c == zVar.f7193c && this.f7194d == zVar.f7194d && this.f7195e == zVar.f7195e;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + a0.m.e(a0.m.e(a0.m.e(a0.m.e(this.f7191a * 31, 31, this.f7192b), 31, this.f7193c), 31, this.f7194d), 31, this.f7195e);
    }
}
