package com.google.android.gms.internal.ads;

import java.util.UUID;

/* loaded from: classes.dex */
public final class he {

    /* renamed from: a, reason: collision with root package name */
    public static final int f6194a;

    /* renamed from: b, reason: collision with root package name */
    public static final UUID f6195b;

    /* renamed from: c, reason: collision with root package name */
    public static final UUID f6196c;

    /* renamed from: d, reason: collision with root package name */
    public static final UUID f6197d;

    /* renamed from: e, reason: collision with root package name */
    public static final UUID f6198e;

    static {
        f6194a = zm.f15186a < 23 ? 1020 : 6396;
        f6195b = new UUID(0L, 0L);
        f6196c = new UUID(1186680826959645954L, -5988876978535335093L);
        f6197d = new UUID(-1301668207276963122L, -6645017420763422227L);
        f6198e = new UUID(-7348484286925749626L, -6083546864340672619L);
    }

    public static long a(long j7) {
        if (j7 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j7 * 1000;
    }

    public static long b(long j7) {
        if (j7 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j7 / 1000;
    }
}
