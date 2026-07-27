package E1;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class o extends n {

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f2304c;

    public o(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f2304c = bArr;
    }

    @Override // E1.n
    public final byte[] f() {
        return this.f2304c;
    }
}
