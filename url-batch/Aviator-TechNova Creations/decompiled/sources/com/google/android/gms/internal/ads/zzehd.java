package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.common.net.HttpHeaders;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzehd implements zzfmu {
    private static final Pattern zzd = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);
    private final String zza;
    private final zzfoe zzb;
    private final zzfoo zzc;

    public zzehd(String str, zzfoo zzfooVar, zzfoe zzfoeVar) {
        this.zza = str;
        this.zzc = zzfooVar;
        this.zzb = zzfoeVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0168  */
    @Override // com.google.android.gms.internal.ads.zzfmu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ Object zza(Object obj) throws Exception {
        zzecr zzecrVar;
        String str;
        byte[] bArr;
        JSONObject zza;
        String str2;
        zzehc zzehcVar = (zzehc) obj;
        int optInt = zzehcVar.zza().optInt("http_timeout_millis", 60000);
        zzbzw zzb = zzehcVar.zzb();
        if (zzb.zza() != -2) {
            if (zzb.zza() == 1) {
                if (zzb.zzb() != null) {
                    str = TextUtils.join(", ", zzb.zzb());
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf(str);
                } else {
                    str = "";
                }
                String.valueOf(str);
                zzecrVar = new zzecr(2, "Error building request URL: ".concat(String.valueOf(str)));
            } else {
                zzecrVar = new zzecr(1);
            }
            zzfoo zzfooVar = this.zzc;
            zzfoe zzfoeVar = this.zzb;
            zzfoeVar.zzj(zzecrVar);
            zzfoeVar.zzd(false);
            zzfooVar.zza(zzfoeVar);
            throw zzecrVar;
        }
        HashMap hashMap = new HashMap();
        if (zzehcVar.zzb().zzg()) {
            String str3 = this.zza;
            if (!TextUtils.isEmpty(str3)) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbv)).booleanValue()) {
                    if (TextUtils.isEmpty(str3)) {
                        str2 = "";
                    } else {
                        Matcher matcher = zzd.matcher(str3);
                        str2 = "";
                        while (matcher.find()) {
                            String group = matcher.group(1);
                            if (group != null && (group.toLowerCase(Locale.ROOT).startsWith("id=") || group.toLowerCase(Locale.ROOT).startsWith("ide="))) {
                                if (!TextUtils.isEmpty(str2)) {
                                    str2 = str2.concat("; ");
                                }
                                str2 = str2.concat(group);
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        hashMap.put(HttpHeaders.COOKIE, str2);
                    }
                } else {
                    hashMap.put(HttpHeaders.COOKIE, str3);
                }
            }
        }
        if (zzehcVar.zzb().zzf() && (zza = zzehcVar.zza()) != null) {
            JSONObject optJSONObject = zza.optJSONObject("pii");
            if (optJSONObject != null) {
                if (!TextUtils.isEmpty(optJSONObject.optString("doritos", ""))) {
                    hashMap.put("x-afma-drt-cookie", optJSONObject.optString("doritos", ""));
                }
                if (!TextUtils.isEmpty(optJSONObject.optString("doritos_v2", ""))) {
                    hashMap.put("x-afma-drt-v2-cookie", optJSONObject.optString("doritos_v2", ""));
                }
            } else {
                com.google.android.gms.ads.internal.util.zze.zza("DSID signal does not exist.");
            }
        }
        byte[] bArr2 = new byte[0];
        if (!TextUtils.isEmpty(zzehcVar.zzb().zzd())) {
            byte[] bytes = zzehcVar.zzb().zzd().getBytes(StandardCharsets.UTF_8);
            if (zzehcVar.zzb().zzm()) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    try {
                        gZIPOutputStream.write(bytes);
                        gZIPOutputStream.finish();
                        bArr2 = byteArrayOutputStream.toByteArray();
                        gZIPOutputStream.close();
                    } finally {
                    }
                } catch (IOException e) {
                    com.google.android.gms.ads.internal.util.zze.zzb("gzip compression failed, sending uncompressed.", e);
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "PrepareRequestFunction.apply");
                    bArr2 = null;
                }
                if (bArr2 != null) {
                    hashMap.put(HttpHeaders.CONTENT_ENCODING, "gzip");
                }
            }
            bArr = bytes;
            String zzl = TextUtils.isEmpty(zzehcVar.zzb().zzl()) ? zzehcVar.zzb().zzl() : "";
            zzfoo zzfooVar2 = this.zzc;
            zzfoe zzfoeVar2 = this.zzb;
            zzfoeVar2.zzd(true);
            zzfooVar2.zza(zzfoeVar2);
            return new zzegy(zzehcVar.zzb().zze(), optInt, hashMap, bArr, zzl, zzehcVar.zzb().zzf());
        }
        bArr = bArr2;
        if (TextUtils.isEmpty(zzehcVar.zzb().zzl())) {
        }
        zzfoo zzfooVar22 = this.zzc;
        zzfoe zzfoeVar22 = this.zzb;
        zzfoeVar22.zzd(true);
        zzfooVar22.zza(zzfoeVar22);
        return new zzegy(zzehcVar.zzb().zze(), optInt, hashMap, bArr, zzl, zzehcVar.zzb().zzf());
    }
}
