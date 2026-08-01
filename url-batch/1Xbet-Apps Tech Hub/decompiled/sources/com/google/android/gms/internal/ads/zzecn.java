package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.common.net.HttpHeaders;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzecn implements zzfhx {
    private static final Pattern zza = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);
    private final String zzb;
    private final zzfjw zzc;
    private final zzfkh zzd;

    public zzecn(String str, zzfkh zzfkhVar, zzfjw zzfjwVar) {
        this.zzb = str;
        this.zzd = zzfkhVar;
        this.zzc = zzfjwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfhx
    public final /* bridge */ /* synthetic */ Object zza(Object obj) throws Exception {
        JSONObject jSONObject;
        zzbwd zzbwdVar;
        zzdxn zzdxnVar;
        zzbwd zzbwdVar2;
        zzbwd zzbwdVar3;
        zzbwd zzbwdVar4;
        zzbwd zzbwdVar5;
        zzbwd zzbwdVar6;
        zzbwd zzbwdVar7;
        zzbwd zzbwdVar8;
        JSONObject jSONObject2;
        String str;
        zzecm zzecmVar = (zzecm) obj;
        jSONObject = zzecmVar.zza;
        int optInt = jSONObject.optInt("http_timeout_millis", 60000);
        zzbwdVar = zzecmVar.zzb;
        String str2 = "";
        if (zzbwdVar.zza() != -2) {
            if (zzbwdVar.zza() == 1) {
                if (zzbwdVar.zzf() != null) {
                    str2 = TextUtils.join(", ", zzbwdVar.zzf());
                    zzcbn.zzg(str2);
                }
                zzdxnVar = new zzdxn(2, "Error building request URL: ".concat(String.valueOf(str2)));
            } else {
                zzdxnVar = new zzdxn(1);
            }
            zzfkh zzfkhVar = this.zzd;
            zzfjw zzfjwVar = this.zzc;
            zzfjwVar.zzg(zzdxnVar);
            zzfjwVar.zzf(false);
            zzfkhVar.zza(zzfjwVar);
            throw zzdxnVar;
        }
        HashMap hashMap = new HashMap();
        zzbwdVar2 = zzecmVar.zzb;
        if (zzbwdVar2.zzh() && !TextUtils.isEmpty(this.zzb)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzaN)).booleanValue()) {
                String str3 = this.zzb;
                if (TextUtils.isEmpty(str3)) {
                    str = "";
                } else {
                    Matcher matcher = zza.matcher(str3);
                    str = "";
                    while (matcher.find()) {
                        String group = matcher.group(1);
                        if (group != null && (group.toLowerCase(Locale.ROOT).startsWith("id=") || group.toLowerCase(Locale.ROOT).startsWith("ide="))) {
                            if (!TextUtils.isEmpty(str)) {
                                str = str.concat("; ");
                            }
                            str = str.concat(group);
                        }
                    }
                }
                if (!TextUtils.isEmpty(str)) {
                    hashMap.put(HttpHeaders.COOKIE, str);
                }
            } else {
                hashMap.put(HttpHeaders.COOKIE, this.zzb);
            }
        }
        zzbwdVar3 = zzecmVar.zzb;
        if (zzbwdVar3.zzi()) {
            jSONObject2 = zzecmVar.zza;
            zzeco.zza(hashMap, jSONObject2);
        }
        zzbwdVar4 = zzecmVar.zzb;
        if (zzbwdVar4 != null) {
            zzbwdVar7 = zzecmVar.zzb;
            if (!TextUtils.isEmpty(zzbwdVar7.zzd())) {
                zzbwdVar8 = zzecmVar.zzb;
                str2 = zzbwdVar8.zzd();
            }
        }
        zzfkh zzfkhVar2 = this.zzd;
        zzfjw zzfjwVar2 = this.zzc;
        zzfjwVar2.zzf(true);
        zzfkhVar2.zza(zzfjwVar2);
        zzbwdVar5 = zzecmVar.zzb;
        String zze = zzbwdVar5.zze();
        byte[] bytes = str2.getBytes(zzftl.zzc);
        zzbwdVar6 = zzecmVar.zzb;
        return new zzeci(zze, optInt, hashMap, bytes, "", zzbwdVar6.zzi());
    }
}
