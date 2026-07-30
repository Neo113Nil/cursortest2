package o7;

import java.util.Arrays;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class t extends q0 {

    /* renamed from: a, reason: collision with root package name */
    public float[] f6945a;

    /* renamed from: b, reason: collision with root package name */
    public int f6946b;

    @Override // o7.q0
    public final Object a() {
        float[] copyOf = Arrays.copyOf(this.f6945a, this.f6946b);
        r6.k.e(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // o7.q0
    public final void b(int i7) {
        float[] fArr = this.f6945a;
        if (fArr.length < i7) {
            int length = fArr.length * 2;
            if (i7 < length) {
                i7 = length;
            }
            float[] copyOf = Arrays.copyOf(fArr, i7);
            r6.k.e(copyOf, "copyOf(...)");
            this.f6945a = copyOf;
        }
    }

    @Override // o7.q0
    public final int d() {
        return this.f6946b;
    }
}
