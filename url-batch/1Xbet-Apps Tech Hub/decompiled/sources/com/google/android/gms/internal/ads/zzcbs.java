package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcbs implements zzcbf {
    private final String zza;

    public zzcbs() {
        this.zza = null;
    }

    public zzcbs(String str) {
        this.zza = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0085, code lost:
    
        if (com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide() == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00d7, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d4, code lost:
    
        android.net.TrafficStats.clearThreadStatsTag();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b2, code lost:
    
        if (com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide() != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d2, code lost:
    
        if (com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide() == false) goto L40;
     */
    @Override // com.google.android.gms.internal.ads.zzcbf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zza(String str) {
        try {
            try {
                if (ClientLibraryUtils.isPackageSide()) {
                    TrafficStats.setThreadStatsTag(263);
                }
                zzcbn.zze("Pinging URL: " + str);
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                try {
                    com.google.android.gms.ads.internal.client.zzay.zzb();
                    String str2 = this.zza;
                    httpURLConnection.setConnectTimeout(60000);
                    httpURLConnection.setInstanceFollowRedirects(true);
                    httpURLConnection.setReadTimeout(60000);
                    if (str2 != null) {
                        httpURLConnection.setRequestProperty(HttpHeaders.USER_AGENT, str2);
                    }
                    httpURLConnection.setUseCaches(false);
                    zzcbm zzcbmVar = new zzcbm(null);
                    zzcbmVar.zzc(httpURLConnection, null);
                    int responseCode = httpURLConnection.getResponseCode();
                    zzcbmVar.zze(httpURLConnection, responseCode);
                    r5 = responseCode >= 200 && responseCode < 300;
                    zzcbn.zzj("Received non-success response code " + responseCode + " from pinging URL: " + str);
                } finally {
                    httpURLConnection.disconnect();
                }
            } catch (Throwable th) {
                if (ClientLibraryUtils.isPackageSide()) {
                    TrafficStats.clearThreadStatsTag();
                }
                throw th;
            }
        } catch (IOException e) {
            e = e;
            zzcbn.zzj("Error while pinging URL: " + str + ". " + e.getMessage());
        } catch (IndexOutOfBoundsException e2) {
            zzcbn.zzj("Error while parsing ping URL: " + str + ". " + e2.getMessage());
        } catch (RuntimeException e3) {
            e = e3;
            zzcbn.zzj("Error while pinging URL: " + str + ". " + e.getMessage());
        }
    }
}
