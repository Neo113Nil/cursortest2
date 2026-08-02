package w0;

import a.AbstractC0124a;
import android.util.Range;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public long f15909a;

    /* renamed from: b, reason: collision with root package name */
    public long f15910b;

    /* renamed from: c, reason: collision with root package name */
    public double f15911c;

    /* renamed from: d, reason: collision with root package name */
    public Range f15912d;

    public final void a(long j4, long j5) {
        double doubleValue;
        AbstractC0124a.h(j4 != -9223372036854775807L);
        AbstractC0124a.h(j5 != -9223372036854775807L);
        long j6 = this.f15909a;
        if (j6 != -9223372036854775807L) {
            if (this.f15910b != -9223372036854775807L && j4 != j6) {
                doubleValue = (j5 - r4) / (j4 - j6);
                this.f15911c = (((Double) this.f15912d.clamp(Double.valueOf(doubleValue))).doubleValue() * 0.20000000298023224d) + (this.f15911c * 0.800000011920929d);
                this.f15909a = j4;
                this.f15910b = j5;
            }
        }
        doubleValue = ((Double) this.f15912d.getUpper()).doubleValue();
        this.f15911c = (((Double) this.f15912d.clamp(Double.valueOf(doubleValue))).doubleValue() * 0.20000000298023224d) + (this.f15911c * 0.800000011920929d);
        this.f15909a = j4;
        this.f15910b = j5;
    }

    public final void b() {
        this.f15911c = ((Double) this.f15912d.getUpper()).doubleValue();
        this.f15909a = -9223372036854775807L;
        this.f15910b = -9223372036854775807L;
    }

    public final void c(float f4) {
        AbstractC0124a.h(f4 > 0.0f);
        this.f15912d = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / f4));
        b();
    }
}
