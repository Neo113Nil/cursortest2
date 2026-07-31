package C2;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class e0 extends P {

    /* renamed from: a, reason: collision with root package name */
    public int[] f744a;

    /* renamed from: b, reason: collision with root package name */
    public int f745b;

    @Override // C2.P
    public final Object a() {
        int[] copyOf = Arrays.copyOf(this.f744a, this.f745b);
        f2.j.e(copyOf, "copyOf(...)");
        return new R1.s(copyOf);
    }

    @Override // C2.P
    public final void b(int i3) {
        int[] iArr = this.f744a;
        if (iArr.length < i3) {
            int length = iArr.length * 2;
            if (i3 < length) {
                i3 = length;
            }
            int[] copyOf = Arrays.copyOf(iArr, i3);
            f2.j.e(copyOf, "copyOf(...)");
            this.f744a = copyOf;
        }
    }

    @Override // C2.P
    public final int d() {
        return this.f745b;
    }
}
