package m1;

/* loaded from: classes.dex */
public final class p implements o {

    /* renamed from: d, reason: collision with root package name */
    public final int f6962d;

    /* renamed from: e, reason: collision with root package name */
    public int f6963e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f6964f = -1;

    public p(int i3) {
        this.f6962d = i3;
    }

    @Override // m1.o
    public final boolean c(CharSequence charSequence, int i3, int i4, u uVar) {
        int i5 = this.f6962d;
        if (i3 > i5 || i5 >= i4) {
            return i4 <= i5;
        }
        this.f6963e = i3;
        this.f6964f = i4;
        return false;
    }

    @Override // m1.o
    public final Object b() {
        return this;
    }
}
