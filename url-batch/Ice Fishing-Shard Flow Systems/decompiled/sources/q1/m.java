package q1;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class m extends l {

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f7344g;

    public m(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f7344g = bArr;
    }

    @Override // q1.l
    public final byte[] c() {
        return this.f7344g;
    }
}
