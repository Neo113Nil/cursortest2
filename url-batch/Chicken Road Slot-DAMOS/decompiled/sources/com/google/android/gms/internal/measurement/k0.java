package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public enum k0 implements m1 {
    PURPOSE_RESTRICTION_NOT_ALLOWED(0),
    PURPOSE_RESTRICTION_REQUIRE_CONSENT(1),
    PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST(2),
    PURPOSE_RESTRICTION_UNDEFINED(3),
    UNRECOGNIZED(-1);


    /* renamed from: d, reason: collision with root package name */
    public final int f2440d;

    k0(int i3) {
        this.f2440d = i3;
    }

    @Override // com.google.android.gms.internal.measurement.m1
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f2440d;
        }
        te.a1.e("Can't get the number of an unknown enum value.");
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f2440d);
    }
}
