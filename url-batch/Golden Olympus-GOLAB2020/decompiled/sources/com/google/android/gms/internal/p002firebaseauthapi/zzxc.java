package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzakg;

@Deprecated
/* loaded from: classes.dex */
public final class zzxc extends zzakg<zzxc, zza> implements zzalp {
    private static final zzxc zzc;
    private static volatile zzalw<zzxc> zzd;
    private String zze = "";
    private zzakn<zzwi> zzf = zzakg.zzp();

    public static final class zza extends zzakg.zzb<zzxc, zza> implements zzalp {
        private zza() {
            super(zzxc.zzc);
        }
    }

    static {
        zzxc zzxcVar = new zzxc();
        zzc = zzxcVar;
        zzakg.zza((Class<zzxc>) zzxc.class, zzxcVar);
    }

    private zzxc() {
    }

    public static zzxc zzb() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
    protected final Object zza(int i4, Object obj, Object obj2) {
        zzalw zzalwVar;
        switch (zzxe.zza[i4 - 1]) {
            case 1:
                return new zzxc();
            case 2:
                return new zza();
            case 3:
                return zzakg.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zze", "zzf", zzwi.class});
            case 4:
                return zzc;
            case 5:
                zzalw<zzxc> zzalwVar2 = zzd;
                if (zzalwVar2 != null) {
                    return zzalwVar2;
                }
                synchronized (zzxc.class) {
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
