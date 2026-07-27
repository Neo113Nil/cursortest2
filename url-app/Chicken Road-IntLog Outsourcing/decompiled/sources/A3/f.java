package A3;

import y3.C1569c;

/* loaded from: classes.dex */
public final class f extends y3.i {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f56b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f57c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f(int i2, byte[] bArr) {
        super(C1569c.b(r0) + r0 + r3);
        int b6;
        this.f56b = i2;
        switch (i2) {
            case 1:
                if (bArr.length == 0) {
                    b6 = 0;
                } else {
                    int i3 = F3.a.f677a.f12384c;
                    int length = bArr.length;
                    b6 = i3 + C1569c.b(length) + length;
                }
                super(b6);
                this.f57c = bArr;
                break;
            default:
                int i6 = F3.a.f683g.f12384c;
                int length2 = bArr.length;
                this.f57c = bArr;
                break;
        }
    }

    @Override // y3.AbstractC1571e
    public final void c(y3.m mVar) {
        switch (this.f56b) {
            case 0:
                mVar.D(F3.a.f683g, this.f57c);
                break;
            default:
                byte[] bArr = this.f57c;
                if (bArr.length != 0) {
                    mVar.T(F3.a.f677a, bArr);
                    break;
                }
                break;
        }
    }
}
