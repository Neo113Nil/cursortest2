package l3;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class r implements q {

    /* renamed from: f, reason: collision with root package name */
    public final int f5922f;

    /* renamed from: g, reason: collision with root package name */
    public int f5923g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f5924h = -1;

    public r(int i7) {
        this.f5922f = i7;
    }

    @Override // l3.q
    public final boolean f(CharSequence charSequence, int i7, int i8, v vVar) {
        int i9 = this.f5922f;
        if (i7 > i9 || i9 >= i8) {
            return i8 <= i9;
        }
        this.f5923g = i7;
        this.f5924h = i8;
        return false;
    }

    @Override // l3.q
    public final Object a() {
        return this;
    }
}
