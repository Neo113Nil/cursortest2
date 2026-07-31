package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class th {

    /* renamed from: f, reason: collision with root package name */
    public static final th f12210f = new th(new rf());

    /* renamed from: g, reason: collision with root package name */
    public static final my3<th> f12211g = new my3() { // from class: com.google.android.gms.internal.ads.qe
    };

    /* renamed from: a, reason: collision with root package name */
    public final long f12212a;

    /* renamed from: b, reason: collision with root package name */
    public final long f12213b;

    /* renamed from: c, reason: collision with root package name */
    public final long f12214c;

    /* renamed from: d, reason: collision with root package name */
    public final float f12215d;

    /* renamed from: e, reason: collision with root package name */
    public final float f12216e;

    private th(rf rfVar) {
        this.f12212a = -9223372036854775807L;
        this.f12213b = -9223372036854775807L;
        this.f12214c = -9223372036854775807L;
        this.f12215d = -3.4028235E38f;
        this.f12216e = -3.4028235E38f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof th)) {
            return false;
        }
        long j7 = ((th) obj).f12212a;
        return true;
    }

    public final int hashCode() {
        int i7 = (int) (-9223372034707292159L);
        return (((((((i7 * 31) + i7) * 31) + i7) * 31) + Float.floatToIntBits(-3.4028235E38f)) * 31) + Float.floatToIntBits(-3.4028235E38f);
    }
}
