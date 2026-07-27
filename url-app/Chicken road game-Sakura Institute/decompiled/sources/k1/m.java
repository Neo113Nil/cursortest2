package k1;

/* loaded from: classes.dex */
public final class m implements l {

    /* renamed from: d, reason: collision with root package name */
    public final int f7394d;

    /* renamed from: e, reason: collision with root package name */
    public int f7395e = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f7396i = -1;

    public m(int i2) {
        this.f7394d = i2;
    }

    @Override // k1.l
    public final Object a() {
        return this;
    }

    @Override // k1.l
    public final boolean d(CharSequence charSequence, int i2, int i4, q qVar) {
        int i5 = this.f7394d;
        if (i2 > i5 || i5 >= i4) {
            return i4 <= i5;
        }
        this.f7395e = i2;
        this.f7396i = i4;
        return false;
    }
}
