package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class jja implements jll {
    protected transient int r = 0;

    private final String a(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public int c(jlz jlzVar) {
        throw null;
    }

    @Override // defpackage.jll
    public final jjq d() {
        try {
            int j = j();
            jjq jjqVar = jjq.d;
            byte[] bArr = new byte[j];
            jjz S = jjz.S(bArr);
            K(S);
            return ilq.a(S, bArr);
        } catch (IOException e) {
            throw new RuntimeException(this.a("ByteString"), e);
        }
    }

    @Override // defpackage.jll
    public final void e(OutputStream outputStream) {
        jjy jjyVar = new jjy(outputStream, jjz.L(j()));
        K(jjyVar);
        jjyVar.c();
    }

    @Override // defpackage.jll
    public final byte[] f() {
        try {
            byte[] bArr = new byte[j()];
            jjz S = jjz.S(bArr);
            K(S);
            S.T();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(a("byte array"), e);
        }
    }
}
