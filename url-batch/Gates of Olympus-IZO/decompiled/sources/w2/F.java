package w2;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class F extends P {

    /* renamed from: a, reason: collision with root package name */
    public long[] f8608a;

    /* renamed from: b, reason: collision with root package name */
    public int f8609b;

    @Override // w2.P
    public final Object a() {
        long[] copyOf = Arrays.copyOf(this.f8608a, this.f8609b);
        Z1.i.e(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // w2.P
    public final void b(int i3) {
        long[] jArr = this.f8608a;
        if (jArr.length < i3) {
            int length = jArr.length * 2;
            if (i3 < length) {
                i3 = length;
            }
            long[] copyOf = Arrays.copyOf(jArr, i3);
            Z1.i.e(copyOf, "copyOf(...)");
            this.f8608a = copyOf;
        }
    }

    @Override // w2.P
    public final int d() {
        return this.f8609b;
    }
}
