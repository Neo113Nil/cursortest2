package N;

/* loaded from: classes.dex */
public final class o extends n {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3529g;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f3529g) {
            case 0:
                int i3 = this.f3528f;
                this.f3528f = i3 + 2;
                Object[] objArr = this.f3526d;
                return new a(objArr[i3], objArr[i3 + 1]);
            case 1:
                int i4 = this.f3528f;
                this.f3528f = i4 + 2;
                return this.f3526d[i4];
            default:
                int i5 = this.f3528f;
                this.f3528f = i5 + 2;
                return this.f3526d[i5 + 1];
        }
    }
}
