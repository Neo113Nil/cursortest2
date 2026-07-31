package b;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f959a;

    /* renamed from: b, reason: collision with root package name */
    public final float f960b;

    /* renamed from: c, reason: collision with root package name */
    public final float f961c;

    /* renamed from: d, reason: collision with root package name */
    public final int f962d;

    /* renamed from: e, reason: collision with root package name */
    public final long f963e;

    public a(s4.b bVar) {
        q6.i.e(bVar, "navigationEvent");
        float f6 = bVar.f6702c;
        float f8 = bVar.f6703d;
        float f9 = bVar.f6701b;
        int i = bVar.f6700a;
        long j7 = bVar.f6704e;
        this.f959a = f6;
        this.f960b = f8;
        this.f961c = f9;
        this.f962d = i;
        this.f963e = j7;
    }

    public final String toString() {
        return "BackEventCompat(touchX=" + this.f959a + ", touchY=" + this.f960b + ", progress=" + this.f961c + ", swipeEdge=" + this.f962d + ", frameTimeMillis=" + this.f963e + ')';
    }
}
