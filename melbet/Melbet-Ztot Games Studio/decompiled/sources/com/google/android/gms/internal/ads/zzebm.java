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

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzebm implements zzfio {
    protected final Context zza;
    protected final String zzb;

    public zzebm(Context context, String str, zzbvj zzbvjVar, int i) {
        this.zza = context;
        this.zzb = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x01b6, code lost:
    
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Received error HTTP response code: " + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01dc, code lost:
    
        throw new com.google.android.gms.internal.ads.zzdwl(1, "Received error HTTP response code: " + r8);
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzfio
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzebl zza(zzebk zzebkVar) throws zzdwl {
        int i;
        zzebl zzeblVar;
        InputStreamReader inputStreamReader;
        com.google.android.gms.ads.internal.util.client.zzl zzlVar;
        int responseCode;
        zzebm zzebmVar = this;
        String str = zzebkVar.zza;
        int i2 = zzebkVar.zzb;
        Map map = zzebkVar.zzc;
        byte[] bArr = zzebkVar.zzd;
        String str2 = zzebkVar.zze;
        long elapsedRealtime = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime();
        try {
            zzebl zzeblVar2 = new zzebl();
            com.google.android.gms.ads.internal.util.client.zzm.zzi("SDK version: " + zzebmVar.zzb);
            com.google.android.gms.ads.internal.util.client.zzm.zze("AdRequestServiceImpl: Sending request: " + str);
            URL url = new URL(str);
            HashMap hashMap = new HashMap();
            int i3 = 0;
            while (true) {
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                try {
                    com.google.android.gms.ads.internal.util.zzt zzp = com.google.android.gms.ads.internal.zzu.zzp();
                    Context context = zzebmVar.zza;
                    String str3 = zzebmVar.zzb;
                    zzebl zzeblVar3 = zzeblVar2;
                    i = 1;
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
                                httpURLConnection.setDoOutput(true);
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
                            zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
                            zzlVar.zzc(httpURLConnection, bArr);
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
                            zzlVar.zze(httpURLConnection, responseCode);
                            zzeblVar = zzeblVar3;
                        } catch (Throwable th3) {
                            th = th3;
                            httpURLConnection.disconnect();
                            throw th;
                        }
                    } catch (zzdwl e) {
                        e = e;
                        zzeblVar = zzeblVar3;
                    }
                    try {
                        zzeblVar.zza = responseCode;
                        zzeblVar.zzb = hashMap;
                        zzeblVar.zzc = "";
                        if (responseCode >= 200 && responseCode < 300) {
                            try {
                                InputStreamReader inputStreamReader2 = new InputStreamReader(httpURLConnection.getInputStream());
                                try {
                                    com.google.android.gms.ads.internal.zzu.zzp();
                                    String zzN = com.google.android.gms.ads.internal.util.zzt.zzN(inputStreamReader2);
                                    IOUtils.closeQuietly(inputStreamReader2);
                                    zzlVar.zzg(zzN);
                                    zzeblVar.zzc = zzN;
                                    if (TextUtils.isEmpty(zzN)) {
                                        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzeR)).booleanValue()) {
                                            throw new zzdwl(3);
                                        }
                                    }
                                    zzeblVar.zzd = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - elapsedRealtime;
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
                                com.google.android.gms.ads.internal.util.client.zzm.zzj("No location header to follow redirect.");
                                throw new zzdwl(1, "No location header to follow redirect");
                            }
                            URL url2 = new URL(headerField);
                            i3++;
                            if (i3 > ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzey)).intValue()) {
                                com.google.android.gms.ads.internal.util.client.zzm.zzj("Too many redirects.");
                                throw new zzdwl(1, "Too many redirects");
                            }
                            try {
                                httpURLConnection.disconnect();
                                zzebmVar = this;
                                url = url2;
                                zzeblVar2 = zzeblVar;
                            } catch (IOException e2) {
                                e = e2;
                                String concat = "Error while connecting to ad server: ".concat(String.valueOf(e.getMessage()));
                                com.google.android.gms.ads.internal.util.client.zzm.zzj(concat);
                                throw new zzdwl(i, concat, e);
                            }
                        }
                    } catch (zzdwl e3) {
                        e = e3;
                        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzhx)).booleanValue()) {
                            throw e;
                        }
                        zzeblVar.zzd = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - elapsedRealtime;
                        httpURLConnection.disconnect();
                        return zzeblVar;
                    }
                } catch (zzdwl e4) {
                    e = e4;
                    zzeblVar = zzeblVar2;
                } catch (Throwable th6) {
                    th = th6;
                }
            }
        } catch (IOException e5) {
            e = e5;
            i = 1;
        }
    }
}
