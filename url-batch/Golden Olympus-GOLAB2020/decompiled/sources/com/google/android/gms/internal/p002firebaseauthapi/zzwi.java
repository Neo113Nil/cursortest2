package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzakg;

@Deprecated
/* loaded from: classes.dex */
public final class zzwi extends zzakg<zzwi, zza> implements zzalp {
    private static final zzwi zzc;
    private static volatile zzalw<zzwi> zzd;
    private int zzg;
    private boolean zzh;
    private String zze = "";
    private String zzf = "";
    private String zzi = "";

    public static final class zza extends zzakg.zzb<zzwi, zza> implements zzalp {
        private zza() {
            super(zzwi.zzc);
        }
    }

    static {
        zzwi zzwiVar = new zzwi();
        zzc = zzwiVar;
        zzakg.zza((Class<zzwi>) zzwi.class, zzwiVar);
    }

    private zzwi() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
    protected final Object zza(int i4, Object obj, Object obj2) {
        zzalw zzalwVar;
        switch (zzwh.zza[i4 - 1]) {
            case 1:
                return new zzwi();
            case 2:
                return new zza();
            case 3:
                return zzakg.zza(zzc, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                zzalw<zzwi> zzalwVar2 = zzd;
                if (zzalwVar2 != null) {
                    return zzalwVar2;
                }
                synchronized (zzwi.class) {
                    try {
                        zzalwVar = zzd;
                        if (zzalwVar == null) {
                            zzalwVar = new zzakg.zza(zzc);
                            zzd = zzalwVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return zzalwVar;
            case 6:
                return (byte) 1;
            default:
                throw null;
        }
    }
}
