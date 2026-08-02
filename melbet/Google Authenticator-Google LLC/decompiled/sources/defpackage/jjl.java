package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jjl extends jjn {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 1;
    public final byte[] a;
    public final int b;
    private final int e;

    public jjl(byte[] bArr, int i, int i2) {
        o(i, i + i2, bArr.length);
        this.a = bArr;
        this.b = i;
        this.e = i2;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    @Override // defpackage.jjq
    public final byte a(int i) {
        return this.a[this.b + i];
    }

    @Override // defpackage.jjq
    protected final int b(int i, int i2, int i3) {
        return jky.b(i, this.a, this.b + i2, i3);
    }

    @Override // defpackage.jjq
    public final int c() {
        return this.e;
    }

    @Override // defpackage.jjq
    public final jjq d(int i, int i2) {
        int o = o(i, i2, this.e);
        return o == 0 ? jjq.d : new jjl(this.a, this.b + i, o);
    }

    @Override // defpackage.jjq
    public final jjq e(int i, int i2) {
        int o = o(i, i2, this.e);
        return o == 0 ? jjq.d : new jjl(this.a, this.b + i, o);
    }

    @Override // defpackage.jjq
    public final jju f() {
        return jju.Q(this.a, this.b, this.e);
    }

    @Override // defpackage.jjq
    public final ByteBuffer g() {
        return ByteBuffer.wrap(this.a, this.b, this.e).asReadOnlyBuffer();
    }

    @Override // defpackage.jjq
    protected final void h(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.a, this.b + i, bArr, i2, i3);
    }

    @Override // defpackage.jjq
    public final void i(jji jjiVar) {
        jjiVar.a(this.a, this.b, this.e);
    }

    @Override // defpackage.jjq
    public final void j(OutputStream outputStream) {
        outputStream.write(x());
    }

    @Override // defpackage.jjq
    protected final boolean k(jjq jjqVar) {
        return ((jjqVar instanceof jjo) || (jjqVar instanceof jjl)) ? l(jjqVar, 0, this.e) : jjqVar.k(this);
    }

    @Override // defpackage.jjn
    public final boolean l(jjq jjqVar, int i, int i2) {
        if (i2 > jjqVar.c()) {
            throw new IllegalArgumentException("Length too large: " + i2 + this.e);
        }
        int i3 = i + i2;
        if (i3 > jjqVar.c()) {
            throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + jjqVar.c());
        }
        if (jjqVar instanceof jjo) {
            byte[] bArr = this.a;
            int i4 = this.b;
            int i5 = jjo.b;
            return jjq.w(bArr, i4, ((jjo) jjqVar).a, i, i2);
        }
        if (jjqVar instanceof jjl) {
            jjl jjlVar = (jjl) jjqVar;
            return jjq.w(this.a, this.b, jjlVar.a, jjlVar.b + i, i2);
        }
        jjq e = jjqVar.e(i, i3);
        int i6 = this.b;
        return e.equals(e(i6, i2 + i6));
    }

    Object writeReplace() {
        return jjq.u(x());
    }
}
