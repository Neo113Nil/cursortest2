package m5;

import k5.C0603c;
import r5.AbstractC0848a;

/* loaded from: classes.dex */
public final class e extends k5.i {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6557b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f6558c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e(byte[] bArr, int i2) {
        super(C0603c.b(r0) + r0 + r4);
        int b7;
        this.f6557b = i2;
        switch (i2) {
            case 1:
                if (bArr.length == 0) {
                    b7 = 0;
                } else {
                    int i5 = AbstractC0848a.f7527a.f6058c;
                    int length = bArr.length;
                    b7 = i5 + C0603c.b(length) + length;
                }
                super(b7);
                this.f6558c = bArr;
                break;
            default:
                int i7 = AbstractC0848a.f7533g.f6058c;
                int length2 = bArr.length;
                this.f6558c = bArr;
                break;
        }
    }

    @Override // k5.AbstractC0605e
    public final void c(k5.l lVar) {
        switch (this.f6557b) {
            case 0:
                lVar.G(AbstractC0848a.f7533g, this.f6558c);
                break;
            default:
                byte[] bArr = this.f6558c;
                if (bArr.length != 0) {
                    lVar.W(AbstractC0848a.f7527a, bArr);
                    break;
                }
                break;
        }
    }
}
