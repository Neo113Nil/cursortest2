package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.objectweb.asm.signature.SignatureVisitor;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
@ParametersAreNonnullByDefault
@Deprecated
/* loaded from: classes2.dex */
public final class zzbdu {
    private final List zza = new LinkedList();
    private final Map zzb;
    private final Object zzc;

    public zzbdu(boolean z, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        this.zzc = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put(FirebaseAnalytics.Param.AD_FORMAT, str2);
    }

    public static final zzbdr zzf() {
        return new zzbdr(com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime(), null, null);
    }

    public final zzbdt zza() {
        zzbdt zzbdtVar;
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzbO)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap hashMap = new HashMap();
        synchronized (this.zzc) {
            for (zzbdr zzbdrVar : this.zza) {
                long zza = zzbdrVar.zza();
                String zzc = zzbdrVar.zzc();
                zzbdr zzb = zzbdrVar.zzb();
                if (zzb != null && zza > 0) {
                    long zza2 = zza - zzb.zza();
                    sb.append(zzc);
                    sb.append('.');
                    sb.append(zza2);
                    sb.append(AbstractJsonLexerKt.COMMA);
                    if (booleanValue) {
                        if (hashMap.containsKey(Long.valueOf(zzb.zza()))) {
                            StringBuilder sb2 = (StringBuilder) hashMap.get(Long.valueOf(zzb.zza()));
                            sb2.append(SignatureVisitor.EXTENDS);
                            sb2.append(zzc);
                        } else {
                            hashMap.put(Long.valueOf(zzb.zza()), new StringBuilder(zzc));
                        }
                    }
                }
            }
            this.zza.clear();
            String str = null;
            if (!TextUtils.isEmpty(null)) {
                sb.append((String) null);
            } else if (sb.length() > 0) {
                sb.setLength(sb.length() - 1);
            }
            StringBuilder sb3 = new StringBuilder();
            if (booleanValue) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    sb3.append((CharSequence) entry.getValue());
                    sb3.append('.');
                    sb3.append(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() + (((Long) entry.getKey()).longValue() - com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime()));
                    sb3.append(AbstractJsonLexerKt.COMMA);
                }
                if (sb3.length() > 0) {
                    sb3.setLength(sb3.length() - 1);
                }
                str = sb3.toString();
            }
            zzbdtVar = new zzbdt(sb.toString(), str);
        }
        return zzbdtVar;
    }

    public final Map zzb() {
        Map map;
        synchronized (this.zzc) {
            com.google.android.gms.ads.internal.zzt.zzo().zzg();
            map = this.zzb;
        }
        return map;
    }

    public final void zzc(zzbdu zzbduVar) {
        synchronized (this.zzc) {
        }
    }

    public final void zzd(String str, String str2) {
        zzbdk zzg;
        if (TextUtils.isEmpty(str2) || (zzg = com.google.android.gms.ads.internal.zzt.zzo().zzg()) == null) {
            return;
        }
        synchronized (this.zzc) {
            zzbdq zza = zzg.zza(str);
            Map map = this.zzb;
            map.put(str, zza.zza((String) map.get(str), str2));
        }
    }

    public final boolean zze(zzbdr zzbdrVar, long j, String... strArr) {
        synchronized (this.zzc) {
            for (int i = 0; i <= 0; i++) {
                this.zza.add(new zzbdr(j, strArr[i], zzbdrVar));
            }
        }
        return true;
    }
}
