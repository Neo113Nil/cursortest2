package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public enum m0 implements m1 {
    UNKNOWN(0),
    SHARED_PREFS(1),
    CONTENT_PROVIDER(2),
    FILE(6),
    TIKTOK(4),
    DEVICE_CONFIG(5),
    PROCESS_STABLE_CONTENT_PROVIDER(3);


    /* renamed from: d, reason: collision with root package name */
    public final int f2522d;

    m0(int i3) {
        this.f2522d = i3;
    }

    public static m0 b(int i3) {
        switch (i3) {
            case 0:
                return UNKNOWN;
            case 1:
                return SHARED_PREFS;
            case 2:
                return CONTENT_PROVIDER;
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                return PROCESS_STABLE_CONTENT_PROVIDER;
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                return TIKTOK;
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                return DEVICE_CONFIG;
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return FILE;
            default:
                return null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.m1
    public final int a() {
        return this.f2522d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f2522d);
    }
}
