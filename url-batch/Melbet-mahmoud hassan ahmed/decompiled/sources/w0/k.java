package w0;

import java.io.EOFException;
import r0.s1;
import w0.e0;

/* loaded from: classes.dex */
public final class k implements e0 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f22958a = new byte[4096];

    @Override // w0.e0
    public /* synthetic */ int a(n2.i iVar, int i7, boolean z6) {
        return d0.a(this, iVar, i7, z6);
    }

    @Override // w0.e0
    public void b(long j7, int i7, int i8, int i9, e0.a aVar) {
    }

    @Override // w0.e0
    public void c(o2.a0 a0Var, int i7, int i8) {
        a0Var.P(i7);
    }

    @Override // w0.e0
    public /* synthetic */ void d(o2.a0 a0Var, int i7) {
        d0.b(this, a0Var, i7);
    }

    @Override // w0.e0
    public void e(s1 s1Var) {
    }

    @Override // w0.e0
    public int f(n2.i iVar, int i7, boolean z6, int i8) {
        int read = iVar.read(this.f22958a, 0, Math.min(this.f22958a.length, i7));
        if (read != -1) {
            return read;
        }
        if (z6) {
            return -1;
        }
        throw new EOFException();
    }
}
