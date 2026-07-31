package C2;

import java.util.Arrays;

/* renamed from: C2.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0056t extends P {

    /* renamed from: a, reason: collision with root package name */
    public float[] f788a;

    /* renamed from: b, reason: collision with root package name */
    public int f789b;

    @Override // C2.P
    public final Object a() {
        float[] copyOf = Arrays.copyOf(this.f788a, this.f789b);
        f2.j.e(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // C2.P
    public final void b(int i3) {
        float[] fArr = this.f788a;
        if (fArr.length < i3) {
            int length = fArr.length * 2;
            if (i3 < length) {
                i3 = length;
            }
            float[] copyOf = Arrays.copyOf(fArr, i3);
            f2.j.e(copyOf, "copyOf(...)");
            this.f788a = copyOf;
        }
    }

    @Override // C2.P
    public final int d() {
        return this.f789b;
    }
}
