package s;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f8004a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8005b;

    /* renamed from: c, reason: collision with root package name */
    public final b1.b f8006c;

    public g(int i7, int i8, b1.b bVar) {
        this.f8004a = i7;
        this.f8005b = i8;
        this.f8006c = bVar;
        if (i7 < 0) {
            throw new IllegalArgumentException(a0.m.i("startIndex should be >= 0, but was ", i7).toString());
        }
        if (i8 <= 0) {
            throw new IllegalArgumentException(a0.m.i("size should be >0, but was ", i8).toString());
        }
    }
}
