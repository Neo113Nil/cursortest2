package N;

/* loaded from: classes.dex */
public final class o extends n {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2847g;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f2847g) {
            case 0:
                int i3 = this.f2846f;
                this.f2846f = i3 + 2;
                Object[] objArr = this.f2844d;
                return new a(objArr[i3], objArr[i3 + 1]);
            case 1:
                int i4 = this.f2846f;
                this.f2846f = i4 + 2;
                return this.f2844d[i4];
            default:
                int i5 = this.f2846f;
                this.f2846f = i5 + 2;
                return this.f2844d[i5 + 1];
        }
    }
}
