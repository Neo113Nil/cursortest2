package C2;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class h0 extends P {

    /* renamed from: a, reason: collision with root package name */
    public long[] f754a;

    /* renamed from: b, reason: collision with root package name */
    public int f755b;

    @Override // C2.P
    public final Object a() {
        long[] copyOf = Arrays.copyOf(this.f754a, this.f755b);
        f2.j.e(copyOf, "copyOf(...)");
        return new R1.u(copyOf);
    }

    @Override // C2.P
    public final void b(int i3) {
        long[] jArr = this.f754a;
        if (jArr.length < i3) {
            int length = jArr.length * 2;
            if (i3 < length) {
                i3 = length;
            }
            long[] copyOf = Arrays.copyOf(jArr, i3);
            f2.j.e(copyOf, "copyOf(...)");
            this.f754a = copyOf;
        }
    }

    @Override // C2.P
    public final int d() {
        return this.f755b;
    }
}
