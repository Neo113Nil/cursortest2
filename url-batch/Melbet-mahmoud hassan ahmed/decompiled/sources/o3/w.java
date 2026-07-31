package o3;

import java.util.Arrays;

/* loaded from: classes.dex */
final class w extends v {

    /* renamed from: g, reason: collision with root package name */
    private final byte[] f19873g;

    w(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f19873g = bArr;
    }

    @Override // o3.v
    final byte[] q0() {
        return this.f19873g;
    }
}
