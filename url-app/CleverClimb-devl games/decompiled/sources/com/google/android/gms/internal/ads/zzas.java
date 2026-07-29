package com.google.android.gms.internal.ads;

import com.aiming.mdt.utils.Constants;
import com.mopub.volley.toolbox.HttpClientStack;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes2.dex */
public final class zzas extends zzai {
    private final zzat zzci;
    private final SSLSocketFactory zzcj;

    public zzas() {
        this(null);
    }

    private zzas(zzat zzatVar) {
        this(null, null);
    }

    private zzas(zzat zzatVar, SSLSocketFactory sSLSocketFactory) {
        this.zzci = null;
        this.zzcj = null;
    }

    private static InputStream zza(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }

    private static List<zzl> zza(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator<String> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    arrayList.add(new zzl(entry.getKey(), it.next()));
                }
            }
        }
        return arrayList;
    }

    private static void zza(HttpURLConnection httpURLConnection, zzr<?> zzrVar) throws IOException, zza {
        byte[] zzg = zzrVar.zzg();
        if (zzg != null) {
            httpURLConnection.setDoOutput(true);
            String valueOf = String.valueOf("UTF-8");
            httpURLConnection.addRequestProperty(Constants.KEY_CONTENT_TYPE, valueOf.length() != 0 ? "application/x-www-form-urlencoded; charset=".concat(valueOf) : new String("application/x-www-form-urlencoded; charset="));
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.write(zzg);
            dataOutputStream.close();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fc  */
    @Override // com.google.android.gms.internal.ads.zzai
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzaq zza(zzr<?> zzrVar, Map<String, String> map) throws IOException, zza {
        String str;
        int responseCode;
        String str2;
        String str3;
        String url = zzrVar.getUrl();
        HashMap hashMap = new HashMap();
        hashMap.putAll(zzrVar.getHeaders());
        hashMap.putAll(map);
        if (this.zzci != null) {
            str = this.zzci.zzg(url);
            if (str == null) {
                String valueOf = String.valueOf(url);
                throw new IOException(valueOf.length() != 0 ? "URL blocked by rewriter: ".concat(valueOf) : new String("URL blocked by rewriter: "));
            }
        } else {
            str = url;
        }
        URL url2 = new URL(str);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url2.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        int zzi = zzrVar.zzi();
        httpURLConnection.setConnectTimeout(zzi);
        httpURLConnection.setReadTimeout(zzi);
        boolean z = false;
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        com.mopub.common.Constants.HTTPS.equals(url2.getProtocol());
        for (String str4 : hashMap.keySet()) {
            httpURLConnection.addRequestProperty(str4, (String) hashMap.get(str4));
        }
        switch (zzrVar.getMethod()) {
            case -1:
                responseCode = httpURLConnection.getResponseCode();
                if (responseCode == -1) {
                    throw new IOException("Could not retrieve response code from HttpUrlConnection.");
                }
                if (zzrVar.getMethod() != 4 && ((100 > responseCode || responseCode >= 200) && responseCode != 204 && responseCode != 304)) {
                    z = true;
                }
                return !z ? new zzaq(responseCode, zza(httpURLConnection.getHeaderFields())) : new zzaq(responseCode, zza(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), zza(httpURLConnection));
            case 0:
                str2 = "GET";
                httpURLConnection.setRequestMethod(str2);
                responseCode = httpURLConnection.getResponseCode();
                if (responseCode == -1) {
                }
                break;
            case 1:
                str3 = "POST";
                httpURLConnection.setRequestMethod(str3);
                zza(httpURLConnection, zzrVar);
                responseCode = httpURLConnection.getResponseCode();
                if (responseCode == -1) {
                }
                break;
            case 2:
                str3 = "PUT";
                httpURLConnection.setRequestMethod(str3);
                zza(httpURLConnection, zzrVar);
                responseCode = httpURLConnection.getResponseCode();
                if (responseCode == -1) {
                }
                break;
            case 3:
                str2 = "DELETE";
                httpURLConnection.setRequestMethod(str2);
                responseCode = httpURLConnection.getResponseCode();
                if (responseCode == -1) {
                }
                break;
            case 4:
                str2 = "HEAD";
                httpURLConnection.setRequestMethod(str2);
                responseCode = httpURLConnection.getResponseCode();
                if (responseCode == -1) {
                }
                break;
            case 5:
                str2 = "OPTIONS";
                httpURLConnection.setRequestMethod(str2);
                responseCode = httpURLConnection.getResponseCode();
                if (responseCode == -1) {
                }
                break;
            case 6:
                str2 = "TRACE";
                httpURLConnection.setRequestMethod(str2);
                responseCode = httpURLConnection.getResponseCode();
                if (responseCode == -1) {
                }
                break;
            case 7:
                str3 = HttpClientStack.HttpPatch.METHOD_NAME;
                httpURLConnection.setRequestMethod(str3);
                zza(httpURLConnection, zzrVar);
                responseCode = httpURLConnection.getResponseCode();
                if (responseCode == -1) {
                }
                break;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }
}
