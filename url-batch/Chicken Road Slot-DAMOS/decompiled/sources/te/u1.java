package te;

import java.util.Arrays;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class u1 extends e1 {

    /* renamed from: a, reason: collision with root package name */
    public int[] f9446a;

    /* renamed from: b, reason: collision with root package name */
    public int f9447b;

    @Override // te.e1
    public final Object a() {
        return new hd.y(Arrays.copyOf(this.f9446a, this.f9447b));
    }

    @Override // te.e1
    public final void b(int i3) {
        int[] iArr = this.f9446a;
        if (iArr.length < i3) {
            int length = iArr.length * 2;
            if (i3 < length) {
                i3 = length;
            }
            this.f9446a = Arrays.copyOf(iArr, i3);
        }
    }

    @Override // te.e1
    public final int d() {
        return this.f9447b;
    }
}
