package a2;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class n extends m {

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f4291c;

    public n(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f4291c = bArr;
    }

    @Override // a2.m
    public final byte[] g() {
        return this.f4291c;
    }
}
