package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class clt extends cqr {
    public final byte[] a;

    public clt(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.a = bArr;
    }

    @Override // defpackage.cqr
    public final byte[] z() {
        return this.a;
    }
}
