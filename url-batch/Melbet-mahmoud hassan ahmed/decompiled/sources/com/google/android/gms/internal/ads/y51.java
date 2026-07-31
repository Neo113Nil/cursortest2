package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class y51 {

    /* renamed from: c, reason: collision with root package name */
    public static final y51 f14553c = new y51(null, new of0[0], 0, -9223372036854775807L, 0);

    /* renamed from: d, reason: collision with root package name */
    private static final of0 f14554d = new of0(0).b(0);

    /* renamed from: e, reason: collision with root package name */
    public static final my3<y51> f14555e = new my3() { // from class: com.google.android.gms.internal.ads.a
    };

    /* renamed from: a, reason: collision with root package name */
    public final long f14556a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final of0[] f14557b;

    private y51(Object obj, of0[] of0VarArr, long j7, long j8, int i7) {
        this.f14557b = of0VarArr;
    }

    public final of0 a(int i7) {
        return i7 < 0 ? f14554d : this.f14557b[i7];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y51.class == obj.getClass()) {
            y51 y51Var = (y51) obj;
            if (n13.p(null, null) && Arrays.equals(this.f14557b, y51Var.f14557b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) (-9223372036854775807L)) * 961) + Arrays.hashCode(this.f14557b);
    }

    public final String toString() {
        return "AdPlaybackState(adsId=" + ((Object) null) + ", adResumePositionUs=0, adGroups=[])";
    }
}
