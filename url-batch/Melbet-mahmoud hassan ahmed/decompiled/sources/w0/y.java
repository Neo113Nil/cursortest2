package w0;

import java.io.EOFException;
import o1.h;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    private final o2.a0 f22984a = new o2.a0(10);

    public j1.a a(m mVar, h.a aVar) {
        j1.a aVar2 = null;
        int i7 = 0;
        while (true) {
            try {
                mVar.n(this.f22984a.d(), 0, 10);
                this.f22984a.O(0);
                if (this.f22984a.F() != 4801587) {
                    break;
                }
                this.f22984a.P(3);
                int B = this.f22984a.B();
                int i8 = B + 10;
                if (aVar2 == null) {
                    byte[] bArr = new byte[i8];
                    System.arraycopy(this.f22984a.d(), 0, bArr, 0, 10);
                    mVar.n(bArr, 10, B);
                    aVar2 = new o1.h(aVar).e(bArr, i8);
                } else {
                    mVar.o(B);
                }
                i7 += i8;
            } catch (EOFException unused) {
            }
        }
        mVar.h();
        mVar.o(i7);
        return aVar2;
    }
}
