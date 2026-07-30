package c0;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public int f1667a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f1668b;

    public /* synthetic */ E(int i2, Object[] objArr) {
        this.f1667a = i2;
        this.f1668b = objArr;
    }

    public E(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f1668b = new Object[i2];
    }
}
