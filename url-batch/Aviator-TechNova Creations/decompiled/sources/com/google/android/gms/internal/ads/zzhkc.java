package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzhkc {
    private static final zzhkc zzb = new zzhkc();
    private final Map zza = new HashMap();

    zzhkc() {
    }

    public static zzhkc zza() {
        return zzb;
    }

    public final synchronized void zzb(String str, zzhbp zzhbpVar) throws GeneralSecurityException {
        Map map = this.zza;
        if (!map.containsKey(str)) {
            map.put(str, zzhbpVar);
            return;
        }
        if (((zzhbp) map.get(str)).equals(zzhbpVar)) {
            return;
        }
        String valueOf = String.valueOf(map.get(str));
        String valueOf2 = String.valueOf(zzhbpVar);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 45 + String.valueOf(valueOf).length() + 17 + String.valueOf(valueOf2).length());
        sb.append("Parameters object with name ");
        sb.append(str);
        sb.append(" already exists (");
        sb.append(valueOf);
        sb.append("), cannot insert ");
        sb.append(valueOf2);
        throw new GeneralSecurityException(sb.toString());
    }

    public final synchronized zzhbp zzc(String str) throws GeneralSecurityException {
        Map map;
        map = this.zza;
        if (!map.containsKey("AES128_GCM")) {
            throw new GeneralSecurityException("Name AES128_GCM does not exist");
        }
        return (zzhbp) map.get("AES128_GCM");
    }

    public final synchronized void zzd(Map map) throws GeneralSecurityException {
        for (Map.Entry entry : map.entrySet()) {
            zzb((String) entry.getKey(), (zzhbp) entry.getValue());
        }
    }
}
