package j4;

import java.util.Arrays;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class n extends m {

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f5027e;

    public n(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f5027e = bArr;
    }

    @Override // j4.m
    public final byte[] g() {
        return this.f5027e;
    }
}
