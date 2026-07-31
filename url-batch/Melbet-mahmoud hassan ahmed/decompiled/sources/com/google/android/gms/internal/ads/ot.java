package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public enum ot implements cq3 {
    UNSPECIFIED(0),
    CONNECTING(1),
    CONNECTED(2),
    DISCONNECTING(3),
    DISCONNECTED(4),
    SUSPENDED(5);


    /* renamed from: m, reason: collision with root package name */
    private static final dq3<ot> f9823m = new dq3<ot>() { // from class: com.google.android.gms.internal.ads.mt
    };

    /* renamed from: f, reason: collision with root package name */
    private final int f9825f;

    ot(int i7) {
        this.f9825f = i7;
    }

    public static ot b(int i7) {
        if (i7 == 0) {
            return UNSPECIFIED;
        }
        if (i7 == 1) {
            return CONNECTING;
        }
        if (i7 == 2) {
            return CONNECTED;
        }
        if (i7 == 3) {
            return DISCONNECTING;
        }
        if (i7 == 4) {
            return DISCONNECTED;
        }
        if (i7 != 5) {
            return null;
        }
        return SUSPENDED;
    }

    public static eq3 d() {
        return nt.f9308a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f9825f);
    }

    public final int zza() {
        return this.f9825f;
    }
}
