package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public enum X1 {
    BROADCAST_ACTION_UNSPECIFIED(0),
    PURCHASES_UPDATED_ACTION(1),
    LOCAL_PURCHASES_UPDATED_ACTION(2),
    ALTERNATIVE_BILLING_ACTION(3);


    /* renamed from: a, reason: collision with root package name */
    public final int f5134a;

    X1(int i2) {
        this.f5134a = i2;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f5134a);
    }
}
