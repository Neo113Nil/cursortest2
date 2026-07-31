package w2;

import java.util.Arrays;

/* renamed from: w2.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1046z extends P {

    /* renamed from: a, reason: collision with root package name */
    public int[] f8708a;

    /* renamed from: b, reason: collision with root package name */
    public int f8709b;

    @Override // w2.P
    public final Object a() {
        int[] copyOf = Arrays.copyOf(this.f8708a, this.f8709b);
        Z1.i.e(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // w2.P
    public final void b(int i3) {
        int[] iArr = this.f8708a;
        if (iArr.length < i3) {
            int length = iArr.length * 2;
            if (i3 < length) {
                i3 = length;
            }
            int[] copyOf = Arrays.copyOf(iArr, i3);
            Z1.i.e(copyOf, "copyOf(...)");
            this.f8708a = copyOf;
        }
    }

    @Override // w2.P
    public final int d() {
        return this.f8709b;
    }
}
