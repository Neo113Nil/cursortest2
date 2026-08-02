package y0;

import T.C0097o;
import T.InterfaceC0090h;
import java.io.EOFException;

/* loaded from: classes.dex */
public final class m implements F {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f16181a = new byte[4096];

    @Override // y0.F
    public final void b(W.u uVar, int i4, int i5) {
        uVar.N(i4);
    }

    @Override // y0.F
    public final int f(InterfaceC0090h interfaceC0090h, int i4, boolean z) {
        byte[] bArr = this.f16181a;
        int read = interfaceC0090h.read(bArr, 0, Math.min(bArr.length, i4));
        if (read != -1) {
            return read;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // y0.F
    public final void d(C0097o c0097o) {
    }

    @Override // y0.F
    public final void e(long j4, int i4, int i5, int i6, E e4) {
    }
}
