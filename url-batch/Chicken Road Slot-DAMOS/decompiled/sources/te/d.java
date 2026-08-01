package te;

import java.util.Arrays;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d extends e1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean[] f9351a;

    /* renamed from: b, reason: collision with root package name */
    public int f9352b;

    @Override // te.e1
    public final Object a() {
        return Arrays.copyOf(this.f9351a, this.f9352b);
    }

    @Override // te.e1
    public final void b(int i3) {
        boolean[] zArr = this.f9351a;
        if (zArr.length < i3) {
            int length = zArr.length * 2;
            if (i3 < length) {
                i3 = length;
            }
            this.f9351a = Arrays.copyOf(zArr, i3);
        }
    }

    @Override // te.e1
    public final int d() {
        return this.f9352b;
    }
}
