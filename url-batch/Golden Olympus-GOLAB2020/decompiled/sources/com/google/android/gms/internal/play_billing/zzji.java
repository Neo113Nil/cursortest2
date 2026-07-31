package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class zzji extends zzfu implements zzhc {
    private static final zzji zzb;

    static {
        zzji zzjiVar = new zzji();
        zzb = zzjiVar;
        zzfu.zzB(zzji.class, zzjiVar);
    }

    private zzji() {
    }

    public static zzji zzb() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfu
    protected final Object zzd(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        zzjh zzjhVar = null;
        if (i5 == 2) {
            return zzfu.zzy(zzb, "\u0004\u0000", null);
        }
        if (i5 == 3) {
            return new zzji();
        }
        if (i5 == 4) {
            return new zzjg(zzjhVar);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }
}
