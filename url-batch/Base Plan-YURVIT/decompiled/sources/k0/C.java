package k0;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public int f2647a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f2648b;

    public /* synthetic */ C(int i2, Object[] objArr) {
        this.f2647a = i2;
        this.f2648b = objArr;
    }

    public C(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f2648b = new Object[i2];
    }
}
