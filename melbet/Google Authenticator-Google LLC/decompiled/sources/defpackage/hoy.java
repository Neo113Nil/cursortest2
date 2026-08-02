package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hoy extends hpa implements Serializable {
    private static final long serialVersionUID = 0;
    final byte[] a;

    public hoy(byte[] bArr) {
        bArr.getClass();
        this.a = bArr;
    }

    @Override // defpackage.hpa
    public final int a() {
        byte[] bArr = this.a;
        int length = bArr.length;
        hoq.J(length >= 4, "HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", length);
        return ((bArr[3] & 255) << 24) | (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
    }

    @Override // defpackage.hpa
    public final int b() {
        return this.a.length * 8;
    }

    @Override // defpackage.hpa
    public final boolean c(hpa hpaVar) {
        int length = hpaVar.e().length;
        byte[] bArr = this.a;
        if (bArr.length != length) {
            return false;
        }
        boolean z = true;
        for (int i = 0; i < bArr.length; i++) {
            z &= bArr[i] == hpaVar.e()[i];
        }
        return z;
    }

    @Override // defpackage.hpa
    public final byte[] d() {
        return (byte[]) this.a.clone();
    }

    @Override // defpackage.hpa
    public final byte[] e() {
        return this.a;
    }
}
