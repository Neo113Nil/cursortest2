package te;

import java.util.Arrays;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g extends e1 {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f9376a;

    /* renamed from: b, reason: collision with root package name */
    public int f9377b;

    @Override // te.e1
    public final Object a() {
        return Arrays.copyOf(this.f9376a, this.f9377b);
    }

    @Override // te.e1
    public final void b(int i3) {
        byte[] bArr = this.f9376a;
        if (bArr.length < i3) {
            int length = bArr.length * 2;
            if (i3 < length) {
                i3 = length;
            }
            this.f9376a = Arrays.copyOf(bArr, i3);
        }
    }

    @Override // te.e1
    public final int d() {
        return this.f9377b;
    }
}
