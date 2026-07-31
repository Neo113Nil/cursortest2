package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public enum zzjk implements zzfw {
    BROADCAST_ACTION_UNSPECIFIED(0),
    PURCHASES_UPDATED_ACTION(1),
    LOCAL_PURCHASES_UPDATED_ACTION(2),
    ALTERNATIVE_BILLING_ACTION(3);

    private final int zzf;

    zzjk(int i4) {
        this.zzf = i4;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzf);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfw
    public final int zza() {
        return this.zzf;
    }
}
