package r0;

import android.os.Bundle;
import r0.i;

/* loaded from: classes.dex */
public final class u2 implements i {

    /* renamed from: i, reason: collision with root package name */
    public static final u2 f21046i = new u2(1.0f);

    /* renamed from: j, reason: collision with root package name */
    public static final i.a<u2> f21047j = new i.a() { // from class: r0.t2
        @Override // r0.i.a
        public final i a(Bundle bundle) {
            u2 d7;
            d7 = u2.d(bundle);
            return d7;
        }
    };

    /* renamed from: f, reason: collision with root package name */
    public final float f21048f;

    /* renamed from: g, reason: collision with root package name */
    public final float f21049g;

    /* renamed from: h, reason: collision with root package name */
    private final int f21050h;

    public u2(float f7) {
        this(f7, 1.0f);
    }

    public u2(float f7, float f8) {
        o2.a.a(f7 > 0.0f);
        o2.a.a(f8 > 0.0f);
        this.f21048f = f7;
        this.f21049g = f8;
        this.f21050h = Math.round(f7 * 1000.0f);
    }

    private static String c(int i7) {
        return Integer.toString(i7, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ u2 d(Bundle bundle) {
        return new u2(bundle.getFloat(c(0), 1.0f), bundle.getFloat(c(1), 1.0f));
    }

    public long b(long j7) {
        return j7 * this.f21050h;
    }

    public u2 e(float f7) {
        return new u2(f7, this.f21049g);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u2.class != obj.getClass()) {
            return false;
        }
        u2 u2Var = (u2) obj;
        return this.f21048f == u2Var.f21048f && this.f21049g == u2Var.f21049g;
    }

    public int hashCode() {
        return ((527 + Float.floatToRawIntBits(this.f21048f)) * 31) + Float.floatToRawIntBits(this.f21049g);
    }

    public String toString() {
        return o2.m0.C("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f21048f), Float.valueOf(this.f21049g));
    }
}
