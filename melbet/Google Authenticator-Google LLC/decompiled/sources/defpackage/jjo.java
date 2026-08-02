package defpackage;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jjo extends jjn {
    public static final /* synthetic */ int b = 0;
    private static final long serialVersionUID = 1;
    public final byte[] a;

    public jjo(byte[] bArr) {
        bArr.getClass();
        this.a = bArr;
    }

    @Override // defpackage.jjq
    public final byte a(int i) {
        return this.a[i];
    }

    @Override // defpackage.jjq
    protected final int b(int i, int i2, int i3) {
        return jky.b(i, this.a, i2, i3);
    }

    @Override // defpackage.jjq
    public final int c() {
        return this.a.length;
    }

    @Override // defpackage.jjq
    public final jjq d(int i, int i2) {
        int o = o(i, i2, c());
        return o == 0 ? jjq.d : new jjl(this.a, i, o);
    }

    @Override // defpackage.jjq
    public final jjq e(int i, int i2) {
        int o = o(i, i2, c());
        return o == 0 ? jjq.d : new jjl(this.a, i, o);
    }

    @Override // defpackage.jjq
    public final jju f() {
        return jju.Q(this.a, 0, c());
    }

    @Override // defpackage.jjq
    public final ByteBuffer g() {
        return ByteBuffer.wrap(this.a).asReadOnlyBuffer();
    }

    @Override // defpackage.jjq
    protected final void h(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.a, i, bArr, i2, i3);
    }

    @Override // defpackage.jjq
    public final void i(jji jjiVar) {
        jjiVar.a(this.a, 0, c());
    }

    @Override // defpackage.jjq
    public final void j(OutputStream outputStream) {
        outputStream.write(x());
    }

    @Override // defpackage.jjq
    protected final boolean k(jjq jjqVar) {
        return jjqVar instanceof jjo ? Arrays.equals(this.a, ((jjo) jjqVar).a) : jjqVar instanceof jjl ? l(jjqVar, 0, c()) : jjqVar.k(this);
    }

    @Override // defpackage.jjn
    public final boolean l(jjq jjqVar, int i, int i2) {
        if (i2 > jjqVar.c()) {
            throw new IllegalArgumentException("Length too large: " + i2 + c());
        }
        int i3 = i + i2;
        if (i3 <= jjqVar.c()) {
            if (jjqVar instanceof jjo) {
                return jjq.w(this.a, 0, ((jjo) jjqVar).a, i, i2);
            }
            if (!(jjqVar instanceof jjl)) {
                return jjqVar.e(i, i3).equals(e(0, i2));
            }
            jjl jjlVar = (jjl) jjqVar;
            byte[] bArr = this.a;
            int i4 = jjl.c;
            return jjq.w(bArr, 0, jjlVar.a, jjlVar.b + i, i2);
        }
        throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + jjqVar.c());
    }
}
