package s;

/* loaded from: classes.dex */
class g implements f {

    /* renamed from: a, reason: collision with root package name */
    private final Object[] f45906a;

    /* renamed from: b, reason: collision with root package name */
    private int f45907b;

    g(int i4) {
        if (i4 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f45906a = new Object[i4];
    }

    @Override // s.f
    public boolean a(Object obj) {
        int i4 = this.f45907b;
        Object[] objArr = this.f45906a;
        if (i4 >= objArr.length) {
            return false;
        }
        objArr[i4] = obj;
        this.f45907b = i4 + 1;
        return true;
    }

    @Override // s.f
    public Object b() {
        int i4 = this.f45907b;
        if (i4 <= 0) {
            return null;
        }
        int i5 = i4 - 1;
        Object[] objArr = this.f45906a;
        Object obj = objArr[i5];
        objArr[i5] = null;
        this.f45907b = i4 - 1;
        return obj;
    }

    @Override // s.f
    public void c(Object[] objArr, int i4) {
        if (i4 > objArr.length) {
            i4 = objArr.length;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            Object obj = objArr[i5];
            int i6 = this.f45907b;
            Object[] objArr2 = this.f45906a;
            if (i6 < objArr2.length) {
                objArr2[i6] = obj;
                this.f45907b = i6 + 1;
            }
        }
    }
}
