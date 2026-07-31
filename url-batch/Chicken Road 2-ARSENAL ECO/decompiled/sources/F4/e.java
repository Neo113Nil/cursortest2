package F4;

import com.onesignal.inAppMessages.internal.display.impl.a;

/* loaded from: classes.dex */
public final class e extends D4.k {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f758b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f759c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e(int i7, byte[] bArr) {
        super(D4.d.b(r0) + r0 + r3);
        int b7;
        this.f758b = i7;
        switch (i7) {
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                if (bArr.length == 0) {
                    b7 = 0;
                } else {
                    int i8 = K4.a.f1371a.f512c;
                    int length = bArr.length;
                    b7 = i8 + D4.d.b(length) + length;
                }
                super(b7);
                this.f759c = bArr;
                break;
            default:
                int i9 = K4.a.f1377g.f512c;
                int length2 = bArr.length;
                this.f759c = bArr;
                break;
        }
    }

    @Override // D4.f
    public final void c(D4.n nVar) {
        switch (this.f758b) {
            case 0:
                nVar.G(K4.a.f1377g, this.f759c);
                break;
            default:
                byte[] bArr = this.f759c;
                if (bArr.length != 0) {
                    nVar.W(K4.a.f1371a, bArr);
                    break;
                }
                break;
        }
    }
}
