package K0;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class o extends n {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f861d;

    public o(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f861d = bArr;
    }

    @Override // K0.n
    public final byte[] g() {
        return this.f861d;
    }
}
