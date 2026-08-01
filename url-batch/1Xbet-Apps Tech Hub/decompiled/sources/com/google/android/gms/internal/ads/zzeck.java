package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.util.IOUtils;
import com.google.common.net.HttpHeaders;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzeck implements zzfhx {
    protected final Context zza;
    protected final String zzb;
    protected final zzbwm zzc;

    public zzeck(Context context, String str, zzbwm zzbwmVar, int i) {
        this.zza = context;
        this.zzb = str;
        this.zzc = zzbwmVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x01b6, code lost:
    
        com.google.android.gms.internal.ads.zzcbn.zzj("Received error HTTP response code: " + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01dc, code lost:
    
        throw new com.google.android.gms.internal.ads.zzdxn(r1 == true ? 1 : 0, "Received error HTTP response code: " + r8);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
    @Override // com.google.android.gms.internal.ads.zzfhx
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzecj zza(zzeci zzeciVar) throws zzdxn {
        int i;
        zzecj zzecjVar;
        InputStreamReader inputStreamReader;
        zzcbm zzcbmVar;
        int responseCode;
        zzeck zzeckVar = this;
        String str = zzeciVar.zza;
        int i2 = zzeciVar.zzb;
        Map map = zzeciVar.zzc;
        byte[] bArr = zzeciVar.zzd;
        String str2 = zzeciVar.zze;
        long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
        boolean z = true;
        try {
            zzecj zzecjVar2 = new zzecj();
            zzcbn.zzi("SDK version: " + zzeckVar.zzb);
            zzcbn.zze("AdRequestServiceImpl: Sending request: " + str);
            URL url = new URL(str);
            HashMap hashMap = new HashMap();
            int i3 = 0;
            while (true) {
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                try {
                    com.google.android.gms.ads.internal.util.zzt zzp = com.google.android.gms.ads.internal.zzt.zzp();
                    Context context = zzeckVar.zza;
                    String str3 = zzeckVar.zzb;
                    zzecj zzecjVar3 = zzecjVar2;
                    i = z;
                    try {
                        try {
                            zzp.zzf(context, str3, false, httpURLConnection, false, i2);
                            for (Map.Entry entry : map.entrySet()) {
                                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                            }
                            if (!TextUtils.isEmpty(str2)) {
                                httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, str2);
                            }
                            int length = bArr.length;
                            inputStreamReader = null;
                            if (length > 0) {
                                httpURLConnection.setDoOutput(i);
                                httpURLConnection.setFixedLengthStreamingMode(length);
                                try {
                                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                                    try {
                                        bufferedOutputStream.write(bArr);
                                        IOUtils.closeQuietly(bufferedOutputStream);
                                    } catch (Throwable th) {
                                        th = th;
                                        inputStreamReader = bufferedOutputStream;
                                        IOUtils.closeQuietly(inputStreamReader);
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                            zzcbmVar = new zzcbm(null);
                            zzcbmVar.zzc(httpURLConnection, bArr);
                            responseCode = httpURLConnection.getResponseCode();
                            for (Map.Entry<String, List<String>> entry2 : httpURLConnection.getHeaderFields().entrySet()) {
                                String key = entry2.getKey();
                                List<String> value = entry2.getValue();
                                if (hashMap.containsKey(key)) {
                                    ((List) hashMap.get(key)).addAll(value);
                                } else {
                                    hashMap.put(key, new ArrayList(value));
                                }
                            }
                            zzcbmVar.zze(httpURLConnection, responseCode);
                            zzecjVar = zzecjVar3;
                        } catch (Throwable th3) {
                            th = th3;
                            httpURLConnection.disconnect();
                            throw th;
                        }
                    } catch (zzdxn e) {
                        e = e;
                        zzecjVar = zzecjVar3;
                    }
                    try {
                        zzecjVar.zza = responseCode;
                        zzecjVar.zzb = hashMap;
                        zzecjVar.zzc = "";
                        if (responseCode >= 200 && responseCode < 300) {
                            try {
                                InputStreamReader inputStreamReader2 = new InputStreamReader(httpURLConnection.getInputStream());
                                try {
                                    com.google.android.gms.ads.internal.zzt.zzp();
                                    String zzM = com.google.android.gms.ads.internal.util.zzt.zzM(inputStreamReader2);
                                    IOUtils.closeQuietly(inputStreamReader2);
                                    zzcbmVar.zzg(zzM);
                                    zzecjVar.zzc = zzM;
                                    if (TextUtils.isEmpty(zzM)) {
                                        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzfs)).booleanValue()) {
                                            throw new zzdxn(3);
                                        }
                                    }
                                    zzecjVar.zzd = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - elapsedRealtime;
                                } catch (Throwable th4) {
                                    th = th4;
                                    inputStreamReader = inputStreamReader2;
                                    IOUtils.closeQuietly(inputStreamReader);
                                    throw th;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                            }
                        } else {
                            if (responseCode < 300 || responseCode >= 400) {
                                break;
                            }
                            String headerField = httpURLConnection.getHeaderField(HttpHeaders.LOCATION);
                            if (TextUtils.isEmpty(headerField)) {
                                zzcbn.zzj("No location header to follow redirect.");
                                throw new zzdxn(i == true ? 1 : 0, "No location header to follow redirect");
                            }
                            URL url2 = new URL(headerField);
                            i3 += i == true ? 1 : 0;
                            if (i3 > ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzeS)).intValue()) {
                                zzcbn.zzj("Too many redirects.");
                                throw new zzdxn(i == true ? 1 : 0, "Too many redirects");
                            }
                            try {
                                httpURLConnection.disconnect();
                                z = i == true ? 1 : 0;
                                url = url2;
                                zzecjVar2 = zzecjVar;
                                zzeckVar = this;
                            } catch (IOException e2) {
                                e = e2;
                                String concat = "Error while connecting to ad server: ".concat(String.valueOf(e.getMessage()));
                                zzcbn.zzj(concat);
                                throw new zzdxn(i, concat, e);
                            }
                        }
                    } catch (zzdxn e3) {
                        e = e3;
                        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzig)).booleanValue()) {
                            throw e;
                        }
                        zzecjVar.zzd = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - elapsedRealtime;
                        httpURLConnection.disconnect();
                        return zzecjVar;
                    }
                } catch (zzdxn e4) {
                    e = e4;
                    zzecjVar = zzecjVar2;
                } catch (Throwable th6) {
                    th = th6;
                }
            }
        } catch (IOException e5) {
            e = e5;
            i = z;
        }
    }
}
