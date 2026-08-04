package com.google.android.gms.internal.ads;

import androidx.browser.trusted.sharing.ShareTarget;
import com.google.common.net.HttpHeaders;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzaqi extends zzapv {
    public zzaqi() {
        throw null;
    }

    public zzaqi(zzaqh zzaqhVar, SSLSocketFactory sSLSocketFactory) {
    }

    static List zzb(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new zzaoz((String) entry.getKey(), (String) it.next()));
                }
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzapv
    public final zzaqf zza(zzaph zzaphVar, Map map) throws IOException, zzaop {
        String zzh = zzaphVar.zzh();
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        hashMap.putAll(zzaphVar.zzm());
        URL url = new URL(zzh);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        int zzo = zzaphVar.zzo();
        httpURLConnection.setConnectTimeout(zzo);
        httpURLConnection.setReadTimeout(zzo);
        boolean z = false;
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        "https".equals(url.getProtocol());
        try {
            for (String str : hashMap.keySet()) {
                httpURLConnection.setRequestProperty(str, (String) hashMap.get(str));
            }
            if (zzaphVar.zza() != 0) {
                httpURLConnection.setRequestMethod(ShareTarget.METHOD_POST);
                byte[] zzn = zzaphVar.zzn();
                if (zzn != null) {
                    httpURLConnection.setDoOutput(true);
                    if (!httpURLConnection.getRequestProperties().containsKey(HttpHeaders.CONTENT_TYPE)) {
                        httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded; charset=UTF-8");
                    }
                    DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                    dataOutputStream.write(zzn);
                    dataOutputStream.close();
                }
            } else {
                httpURLConnection.setRequestMethod(ShareTarget.METHOD_GET);
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == -1) {
                throw new IOException("Could not retrieve response code from HttpUrlConnection.");
            }
            zzaphVar.zza();
            if ((responseCode >= 100 && responseCode < 200) || responseCode == 204 || responseCode == 304) {
                zzaqf zzaqfVar = new zzaqf(responseCode, zzb(httpURLConnection.getHeaderFields()), -1, null);
                httpURLConnection.disconnect();
                return zzaqfVar;
            }
            try {
                return new zzaqf(responseCode, zzb(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new zzaqg(httpURLConnection));
            } catch (Throwable th) {
                th = th;
                z = true;
                if (!z) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
