package y0;

/* renamed from: y0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1573e implements y {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1575g f16142a;

    /* renamed from: b, reason: collision with root package name */
    public final long f16143b;

    /* renamed from: c, reason: collision with root package name */
    public final long f16144c;

    /* renamed from: d, reason: collision with root package name */
    public final long f16145d;

    /* renamed from: e, reason: collision with root package name */
    public final long f16146e;

    /* renamed from: f, reason: collision with root package name */
    public final long f16147f;

    public C1573e(InterfaceC1575g interfaceC1575g, long j4, long j5, long j6, long j7, long j8) {
        this.f16142a = interfaceC1575g;
        this.f16143b = j4;
        this.f16144c = j5;
        this.f16145d = j6;
        this.f16146e = j7;
        this.f16147f = j8;
    }

    @Override // y0.y
    public final boolean c() {
        return true;
    }

    @Override // y0.y
    public final x e(long j4) {
        z zVar = new z(j4, C1574f.a(this.f16142a.b(j4), 0L, this.f16144c, this.f16145d, this.f16146e, this.f16147f));
        return new x(zVar, zVar);
    }

    @Override // y0.y
    public final long g() {
        return this.f16143b;
    }
}
