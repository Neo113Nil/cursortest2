package l;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f2 implements z1 {

    /* renamed from: f, reason: collision with root package name */
    public final int f5489f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5490g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f5491h;

    public f2() {
        this.f5491h = new f2[256];
        this.f5489f = 0;
        this.f5490g = 0;
    }

    @Override // l.y1
    public q e(long j8, q qVar, q qVar2, q qVar3) {
        return ((g3.k) this.f5491h).e(j8, qVar, qVar2, qVar3);
    }

    @Override // l.y1
    public q f(long j8, q qVar, q qVar2, q qVar3) {
        return ((g3.k) this.f5491h).f(j8, qVar, qVar2, qVar3);
    }

    @Override // l.z1
    public int j() {
        return this.f5490g;
    }

    @Override // l.z1
    public int k() {
        return this.f5489f;
    }

    public f2(int i7, int i8) {
        this.f5491h = null;
        this.f5489f = i7;
        int i9 = i8 & 7;
        this.f5490g = i9 == 0 ? 8 : i9;
    }

    public f2(int i7, int i8, y yVar) {
        this.f5489f = i7;
        this.f5490g = i8;
        this.f5491h = new g3.k(new d0(i7, i8, yVar));
    }
}
