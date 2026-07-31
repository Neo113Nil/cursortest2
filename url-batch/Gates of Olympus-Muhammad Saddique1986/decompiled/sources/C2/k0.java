package C2;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class k0 extends P {

    /* renamed from: a, reason: collision with root package name */
    public short[] f763a;

    /* renamed from: b, reason: collision with root package name */
    public int f764b;

    @Override // C2.P
    public final Object a() {
        short[] copyOf = Arrays.copyOf(this.f763a, this.f764b);
        f2.j.e(copyOf, "copyOf(...)");
        return new R1.x(copyOf);
    }

    @Override // C2.P
    public final void b(int i3) {
        short[] sArr = this.f763a;
        if (sArr.length < i3) {
            int length = sArr.length * 2;
            if (i3 < length) {
                i3 = length;
            }
            short[] copyOf = Arrays.copyOf(sArr, i3);
            f2.j.e(copyOf, "copyOf(...)");
            this.f763a = copyOf;
        }
    }

    @Override // C2.P
    public final int d() {
        return this.f764b;
    }
}
