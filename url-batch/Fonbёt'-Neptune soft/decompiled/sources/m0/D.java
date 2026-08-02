package m0;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public int f3126a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f3127b;

    public /* synthetic */ D(int i2, Object[] objArr) {
        this.f3126a = i2;
        this.f3127b = objArr;
    }

    public D(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f3127b = new Object[i2];
    }
}
