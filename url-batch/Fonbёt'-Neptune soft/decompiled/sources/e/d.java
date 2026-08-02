package e;

import android.animation.TimeInterpolator;

/* loaded from: classes.dex */
public final class d implements TimeInterpolator {

    /* renamed from: a, reason: collision with root package name */
    public int[] f2153a;

    /* renamed from: b, reason: collision with root package name */
    public int f2154b;

    /* renamed from: c, reason: collision with root package name */
    public int f2155c;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f2) {
        int i2 = (int) ((f2 * this.f2155c) + 0.5f);
        int i3 = this.f2154b;
        int[] iArr = this.f2153a;
        int i4 = 0;
        while (i4 < i3) {
            int i5 = iArr[i4];
            if (i2 < i5) {
                break;
            }
            i2 -= i5;
            i4++;
        }
        return (i4 / i3) + (i4 < i3 ? i2 / this.f2155c : 0.0f);
    }
}
