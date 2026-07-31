package w2;

import java.util.Arrays;

/* renamed from: w2.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1040t extends P {

    /* renamed from: a, reason: collision with root package name */
    public float[] f8701a;

    /* renamed from: b, reason: collision with root package name */
    public int f8702b;

    @Override // w2.P
    public final Object a() {
        float[] copyOf = Arrays.copyOf(this.f8701a, this.f8702b);
        Z1.i.e(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // w2.P
    public final void b(int i3) {
        float[] fArr = this.f8701a;
        if (fArr.length < i3) {
            int length = fArr.length * 2;
            if (i3 < length) {
                i3 = length;
            }
            float[] copyOf = Arrays.copyOf(fArr, i3);
            Z1.i.e(copyOf, "copyOf(...)");
            this.f8701a = copyOf;
        }
    }

    @Override // w2.P
    public final int d() {
        return this.f8702b;
    }
}
