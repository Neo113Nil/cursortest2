package R0;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class l extends k {

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f2075e;

    public l(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f2075e = bArr;
    }

    @Override // R0.k
    public final byte[] d() {
        return this.f2075e;
    }
}
