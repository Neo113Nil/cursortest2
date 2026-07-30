package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class il2 extends ay2 {
    public final short c;
    public final short d;

    public il2(ay2 ay2Var, int i, int i2) {
        super(ay2Var);
        this.c = (short) i;
        this.d = (short) i2;
    }

    @Override // defpackage.ay2
    public final void a(co coVar, byte[] bArr) {
        coVar.b(this.c, this.d);
    }

    public final String toString() {
        short s = this.d;
        return "<" + Integer.toBinaryString((this.c & ((1 << s) - 1)) | (1 << s) | (1 << s)).substring(1) + '>';
    }
}
