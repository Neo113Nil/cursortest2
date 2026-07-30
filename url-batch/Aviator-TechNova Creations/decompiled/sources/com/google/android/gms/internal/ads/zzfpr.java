package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzfpr extends zzibr implements zzidd {
    private static final zzfpr zzb;
    private static volatile zzidk zzc;
    private zzicd zza = zzbM();

    static {
        zzfpr zzfprVar = new zzfpr();
        zzb = zzfprVar;
        zzibr.zzbu(zzfpr.class, zzfprVar);
    }

    private zzfpr() {
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", zzfpp.class});
        }
        if (ordinal == 3) {
            return new zzfpr();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzfpq(bArr);
        }
        if (ordinal == 5) {
            return zzb;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar2 = zzc;
        if (zzidkVar2 != null) {
            return zzidkVar2;
        }
        synchronized (zzfpr.class) {
            zzidkVar = zzc;
            if (zzidkVar == null) {
                zzidkVar = new zzibm(zzb);
                zzc = zzidkVar;
            }
        }
        return zzidkVar;
    }
}
