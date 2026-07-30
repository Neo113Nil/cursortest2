package defpackage;

import com.facebook.internal.AnalyticsEvents;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ko extends xy1 {
    public final y9 r;
    public final long s;
    public int t = 1;
    public final long u;
    public float v;
    public mo w;

    public ko(y9 y9Var, long j) {
        int i;
        this.r = y9Var;
        this.s = j;
        int i2 = (int) (j >> 32);
        if (i2 < 0 || (i = (int) (4294967295L & j)) < 0 || i2 > y9Var.a.getWidth() || i > y9Var.a.getHeight()) {
            lh.e("Failed requirement.");
            throw null;
        }
        this.u = j;
        this.v = 1.0f;
    }

    @Override // defpackage.xy1
    public final boolean b(float f) {
        this.v = f;
        return true;
    }

    @Override // defpackage.xy1
    public final boolean e(mo moVar) {
        this.w = moVar;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ko)) {
            return false;
        }
        ko koVar = (ko) obj;
        return Intrinsics.b(this.r, koVar.r) && s31.a(0L, 0L) && x31.a(this.s, koVar.s) && this.t == koVar.t;
    }

    @Override // defpackage.xy1
    public final long h() {
        return zm3.Q(this.u);
    }

    public final int hashCode() {
        return Integer.hashCode(this.t) + in1.h(in1.h(this.r.hashCode() * 31, 31, 0L), 31, this.s);
    }

    @Override // defpackage.xy1
    public final void i(yd0 yd0Var) {
        int round = Math.round(Float.intBitsToFloat((int) (yd0Var.f() >> 32)));
        int round2 = Math.round(Float.intBitsToFloat((int) (yd0Var.f() & 4294967295L)));
        yd0.S(yd0Var, this.r, this.s, (round << 32) | (round2 & 4294967295L), this.v, this.w, this.t, 328);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.r);
        sb.append(", srcOffset=");
        sb.append((Object) s31.d(0L));
        sb.append(", srcSize=");
        sb.append((Object) x31.b(this.s));
        sb.append(", filterQuality=");
        int i = this.t;
        sb.append((Object) (i == 0 ? "None" : i == 1 ? "Low" : i == 2 ? "Medium" : i == 3 ? "High" : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN));
        sb.append(')');
        return sb.toString();
    }
}
