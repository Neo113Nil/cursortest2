package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzhjx {
    public static final /* synthetic */ int zza = 0;
    private static final zzhjb zzc = zzhjw.zza;
    private static final zzhjx zzd = zzd();
    private final Map zzb = new HashMap();

    public static zzhjx zza() {
        return zzd;
    }

    private static zzhjx zzd() {
        zzhjx zzhjxVar = new zzhjx();
        try {
            zzhjxVar.zzb(zzc, zzhjp.class);
            return zzhjxVar;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException("unexpected error.", e);
        }
    }

    private final synchronized zzhaz zze(zzhbp zzhbpVar, @Nullable Integer num) throws GeneralSecurityException {
        zzhjb zzhjbVar;
        zzhjbVar = (zzhjb) this.zzb.get(zzhbpVar.getClass());
        if (zzhjbVar == null) {
            String obj = zzhbpVar.toString();
            StringBuilder sb = new StringBuilder(obj.length() + 86);
            sb.append("Cannot create a new key for parameters ");
            sb.append(obj);
            sb.append(": no key creator for this class was registered.");
            throw new GeneralSecurityException(sb.toString());
        }
        return zzhjbVar.zza(zzhbpVar, num);
    }

    public final synchronized void zzb(zzhjb zzhjbVar, Class cls) throws GeneralSecurityException {
        Map map = this.zzb;
        zzhjb zzhjbVar2 = (zzhjb) map.get(cls);
        if (zzhjbVar2 != null && !zzhjbVar2.equals(zzhjbVar)) {
            String obj = cls.toString();
            StringBuilder sb = new StringBuilder(obj.length() + 60);
            sb.append("Different key creator for parameters class ");
            sb.append(obj);
            sb.append(" already inserted");
            throw new GeneralSecurityException(sb.toString());
        }
        map.put(cls, zzhjbVar);
    }

    public final zzhaz zzc(zzhbp zzhbpVar, @Nullable Integer num) throws GeneralSecurityException {
        return zze(zzhbpVar, num);
    }
}
