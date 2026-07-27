package L;

/* loaded from: classes.dex */
public final class o extends n {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f3491j;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f3491j) {
            case 0:
                int i2 = this.f3490i;
                this.f3490i = i2 + 2;
                Object[] objArr = this.f3488d;
                return new a(objArr[i2], objArr[i2 + 1]);
            case 1:
                int i4 = this.f3490i;
                this.f3490i = i4 + 2;
                return this.f3488d[i4];
            default:
                int i5 = this.f3490i;
                this.f3490i = i5 + 2;
                return this.f3488d[i5 + 1];
        }
    }
}
