package z6;

import java.util.Arrays;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class p extends o {

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f10896f;

    public p(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f10896f = bArr;
    }

    @Override // z6.o
    public final byte[] E() {
        return this.f10896f;
    }
}
