package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.webkit.ProxyConfig;
import com.google.android.gms.games.GamesStatusCodes;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzgg extends zzfl implements zzgp {
    private final boolean zza;
    private final int zzb;
    private final int zzc;
    private final String zzd;
    private final zzgo zze;
    private final zzgo zzf;
    private zzfy zzg;
    private HttpURLConnection zzh;
    private InputStream zzi;
    private boolean zzj;
    private int zzk;
    private long zzl;
    private long zzm;

    /* synthetic */ zzgg(String str, int i, int i2, boolean z, boolean z2, zzgo zzgoVar, zzfuv zzfuvVar, boolean z3, zzgf zzgfVar) {
        super(true);
        this.zzd = str;
        this.zzb = i;
        this.zzc = i2;
        this.zza = z;
        this.zze = zzgoVar;
        this.zzf = new zzgo();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final HttpURLConnection zzk(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map map) throws IOException {
        String sb;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.zzb);
        httpURLConnection.setReadTimeout(this.zzc);
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.zze.zza());
        hashMap.putAll(this.zzf.zza());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (j == 0) {
            if (j2 == -1) {
                sb = null;
                if (sb != null) {
                    httpURLConnection.setRequestProperty(HttpHeaders.RANGE, sb);
                }
                str = this.zzd;
                if (str != null) {
                    httpURLConnection.setRequestProperty(HttpHeaders.USER_AGENT, str);
                }
                httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, true == z ? "identity" : "gzip");
                httpURLConnection.setInstanceFollowRedirects(z2);
                httpURLConnection.setDoOutput(false);
                int i2 = zzfy.zzh;
                httpURLConnection.setRequestMethod(ShareTarget.METHOD_GET);
                httpURLConnection.connect();
                return httpURLConnection;
            }
            j = 0;
        }
        StringBuilder sb2 = new StringBuilder("bytes=");
        sb2.append(j);
        sb2.append("-");
        if (j2 != -1) {
            sb2.append((j + j2) - 1);
        }
        sb = sb2.toString();
        if (sb != null) {
        }
        str = this.zzd;
        if (str != null) {
        }
        httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, true == z ? "identity" : "gzip");
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(false);
        int i22 = zzfy.zzh;
        httpURLConnection.setRequestMethod(ShareTarget.METHOD_GET);
        httpURLConnection.connect();
        return httpURLConnection;
    }

    private final URL zzl(URL url, String str, zzfy zzfyVar) throws zzgl {
        if (str == null) {
            throw new zzgl("Null location redirect", zzfyVar, GamesStatusCodes.STATUS_REQUEST_UPDATE_TOTAL_FAILURE, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!ProxyConfig.MATCH_HTTPS.equals(protocol) && !ProxyConfig.MATCH_HTTP.equals(protocol)) {
                throw new zzgl("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), zzfyVar, GamesStatusCodes.STATUS_REQUEST_UPDATE_TOTAL_FAILURE, 1);
            }
            if (this.zza || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new zzgl("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", zzfyVar, GamesStatusCodes.STATUS_REQUEST_UPDATE_TOTAL_FAILURE, 1);
        } catch (MalformedURLException e) {
            throw new zzgl(e, zzfyVar, GamesStatusCodes.STATUS_REQUEST_UPDATE_TOTAL_FAILURE, 1);
        }
    }

    private final void zzm() {
        HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                zzea.zzd("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.zzh = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] bArr, int i, int i2) throws zzgl {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.zzl;
            if (j != -1) {
                long j2 = j - this.zzm;
                if (j2 != 0) {
                    i2 = (int) Math.min(i2, j2);
                }
                return -1;
            }
            InputStream inputStream = this.zzi;
            int i3 = zzet.zza;
            int read = inputStream.read(bArr, i, i2);
            if (read == -1) {
                return -1;
            }
            this.zzm += read;
            zzg(read);
            return read;
        } catch (IOException e) {
            zzfy zzfyVar = this.zzg;
            int i4 = zzet.zza;
            throw zzgl.zza(e, zzfyVar, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b4, code lost:
    
        if (r8 == 0) goto L33;
     */
    @Override // com.google.android.gms.internal.ads.zzfs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzb(zzfy zzfyVar) throws zzgl {
        int i;
        URL url;
        long j;
        long j2;
        boolean zzb;
        HttpURLConnection httpURLConnection;
        String str;
        byte[] bArr;
        long j3;
        this.zzg = zzfyVar;
        this.zzm = 0L;
        this.zzl = 0L;
        zzi(zzfyVar);
        try {
            url = new URL(zzfyVar.zza.toString());
            int i2 = zzfyVar.zzb;
            byte[] bArr2 = zzfyVar.zzc;
            j = zzfyVar.zze;
            j2 = zzfyVar.zzf;
            zzb = zzfyVar.zzb(1);
        } catch (IOException e) {
            e = e;
            i = 1;
        }
        if (this.zza) {
            URL url2 = url;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 > 20) {
                    i = 1;
                    throw new zzgl(new NoRouteToHostException("Too many redirects: " + i4), zzfyVar, GamesStatusCodes.STATUS_REQUEST_UPDATE_TOTAL_FAILURE, 1);
                }
                long j4 = j2;
                long j5 = j;
                URL url3 = url2;
                HttpURLConnection zzk = zzk(url2, 1, null, j, j2, zzb, false, zzfyVar.zzd);
                int responseCode = zzk.getResponseCode();
                String headerField = zzk.getHeaderField(HttpHeaders.LOCATION);
                if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                    httpURLConnection = zzk;
                    break;
                }
                i = 1;
                try {
                    zzk.disconnect();
                    url2 = zzl(url3, headerField, zzfyVar);
                    i3 = i4;
                    j2 = j4;
                    j = j5;
                } catch (IOException e2) {
                    e = e2;
                }
                e = e2;
                zzm();
                throw zzgl.zza(e, zzfyVar, i);
            }
        }
        httpURLConnection = zzk(url, 1, null, j, j2, zzb, true, zzfyVar.zzd);
        this.zzh = httpURLConnection;
        this.zzk = httpURLConnection.getResponseCode();
        String responseMessage = httpURLConnection.getResponseMessage();
        int i5 = this.zzk;
        if (i5 < 200 || i5 > 299) {
            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
            if (this.zzk == 416) {
                str = responseMessage;
                if (zzfyVar.zze == zzgq.zzb(httpURLConnection.getHeaderField(HttpHeaders.CONTENT_RANGE))) {
                    this.zzj = true;
                    zzj(zzfyVar);
                    long j6 = zzfyVar.zzf;
                    if (j6 != -1) {
                        return j6;
                    }
                    return 0L;
                }
            } else {
                str = responseMessage;
            }
            InputStream errorStream = httpURLConnection.getErrorStream();
            try {
                bArr = errorStream != null ? zzgab.zzb(errorStream) : zzet.zzf;
            } catch (IOException unused) {
                bArr = zzet.zzf;
            }
            byte[] bArr3 = bArr;
            zzm();
            throw new zzgn(this.zzk, str, this.zzk == 416 ? new zzft(2008) : null, headerFields, zzfyVar, bArr3);
        }
        httpURLConnection.getContentType();
        if (this.zzk == 200) {
            j3 = zzfyVar.zze;
        }
        j3 = 0;
        boolean equalsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField(HttpHeaders.CONTENT_ENCODING));
        if (equalsIgnoreCase) {
            this.zzl = zzfyVar.zzf;
        } else {
            long j7 = zzfyVar.zzf;
            if (j7 != -1) {
                this.zzl = j7;
            } else {
                long zza = zzgq.zza(httpURLConnection.getHeaderField(HttpHeaders.CONTENT_LENGTH), httpURLConnection.getHeaderField(HttpHeaders.CONTENT_RANGE));
                this.zzl = zza != -1 ? zza - j3 : -1L;
            }
        }
        try {
            this.zzi = httpURLConnection.getInputStream();
            if (equalsIgnoreCase) {
                this.zzi = new GZIPInputStream(this.zzi);
            }
            this.zzj = true;
            zzj(zzfyVar);
            if (j3 != 0) {
                try {
                    byte[] bArr4 = new byte[4096];
                    while (j3 > 0) {
                        int min = (int) Math.min(j3, 4096L);
                        InputStream inputStream = this.zzi;
                        int i6 = zzet.zza;
                        int read = inputStream.read(bArr4, 0, min);
                        if (Thread.currentThread().isInterrupted()) {
                            throw new zzgl(new InterruptedIOException(), zzfyVar, GamesStatusCodes.STATUS_REQUEST_UPDATE_PARTIAL_SUCCESS, 1);
                        }
                        if (read == -1) {
                            throw new zzgl(zzfyVar, 2008, 1);
                        }
                        j3 -= read;
                        zzg(read);
                    }
                } catch (IOException e3) {
                    zzm();
                    if (e3 instanceof zzgl) {
                        throw ((zzgl) e3);
                    }
                    throw new zzgl(e3, zzfyVar, GamesStatusCodes.STATUS_REQUEST_UPDATE_PARTIAL_SUCCESS, 1);
                }
            }
            return this.zzl;
        } catch (IOException e4) {
            zzm();
            throw new zzgl(e4, zzfyVar, GamesStatusCodes.STATUS_REQUEST_UPDATE_PARTIAL_SUCCESS, 1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfs
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzfs
    public final void zzd() throws zzgl {
        try {
            InputStream inputStream = this.zzi;
            if (inputStream != null) {
                if (this.zzh != null) {
                    int i = zzet.zza;
                }
                try {
                    inputStream.close();
                } catch (IOException e) {
                    zzfy zzfyVar = this.zzg;
                    int i2 = zzet.zza;
                    throw new zzgl(e, zzfyVar, GamesStatusCodes.STATUS_REQUEST_UPDATE_PARTIAL_SUCCESS, 3);
                }
            }
        } finally {
            this.zzi = null;
            zzm();
            if (this.zzj) {
                this.zzj = false;
                zzh();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfl, com.google.android.gms.internal.ads.zzfs
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzh;
        return httpURLConnection == null ? zzfxu.zzd() : new zzge(httpURLConnection.getHeaderFields());
    }
}
