package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.webkit.ProxyConfig;
import com.facebook.ads.AdError;
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

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzhm extends zzgt implements zzhu {
    private final boolean zza;
    private final int zzb;
    private final int zzc;
    private final String zzd;
    private final zzht zze;
    private final zzht zzf;
    private zzhf zzg;
    private HttpURLConnection zzh;
    private InputStream zzi;
    private boolean zzj;
    private int zzk;
    private long zzl;
    private long zzm;

    /* synthetic */ zzhm(String str, int i, int i2, boolean z, boolean z2, zzht zzhtVar, zzgrd zzgrdVar, boolean z3, byte[] bArr) {
        super(true);
        this.zzd = str;
        this.zzb = i;
        this.zzc = i2;
        this.zza = z;
        this.zze = zzhtVar;
        this.zzf = new zzht();
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
                int i2 = zzhf.zzh;
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
        int i22 = zzhf.zzh;
        httpURLConnection.setRequestMethod(ShareTarget.METHOD_GET);
        httpURLConnection.connect();
        return httpURLConnection;
    }

    private final URL zzl(URL url, String str, zzhf zzhfVar) throws zzhq {
        if (str == null) {
            throw new zzhq("Null location redirect", zzhfVar, AdError.INTERNAL_ERROR_CODE, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !ProxyConfig.MATCH_HTTP.equals(protocol)) {
                String.valueOf(protocol);
                throw new zzhq("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), zzhfVar, AdError.INTERNAL_ERROR_CODE, 1);
            }
            if (this.zza || protocol.equals(url.getProtocol())) {
                return url2;
            }
            String protocol2 = url.getProtocol();
            StringBuilder sb = new StringBuilder(String.valueOf(protocol2).length() + 40 + String.valueOf(protocol).length() + 1);
            sb.append("Disallowed cross-protocol redirect (");
            sb.append(protocol2);
            sb.append(" to ");
            sb.append(protocol);
            sb.append(")");
            throw new zzhq(sb.toString(), zzhfVar, AdError.INTERNAL_ERROR_CODE, 1);
        } catch (MalformedURLException e) {
            throw new zzhq(e, zzhfVar, AdError.INTERNAL_ERROR_CODE, 1);
        }
    }

    private final void zzm() {
        HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                zzee.zzf("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i, int i2) throws zzhq {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.zzl;
            if (j != -1) {
                long j2 = j - this.zzm;
                if (j2 == 0) {
                    return -1;
                }
                i2 = (int) Math.min(i2, j2);
            }
            InputStream inputStream = this.zzi;
            String str = zzfj.zza;
            InputStream inputStream2 = inputStream;
            int read = inputStream.read(bArr, i, i2);
            if (read == -1) {
                return -1;
            }
            this.zzm += read;
            zzh(read);
            return read;
        } catch (IOException e) {
            zzhf zzhfVar = this.zzg;
            String str2 = zzfj.zza;
            throw zzhq.zza(e, zzhfVar, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b2, code lost:
    
        if (r0 == r18) goto L40;
     */
    @Override // com.google.android.gms.internal.ads.zzhb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzb(zzhf zzhfVar) throws zzhq {
        zzhm zzhmVar;
        long j;
        int i;
        HttpURLConnection httpURLConnection;
        byte[] bArr;
        long j2;
        zzhm zzhmVar2 = this;
        zzhmVar2.zzg = zzhfVar;
        long j3 = 0;
        zzhmVar2.zzm = 0L;
        zzhmVar2.zzl = 0L;
        zzf(zzhfVar);
        try {
            URL url = new URL(zzhfVar.zza.toString());
            int i2 = zzhfVar.zzb;
            byte[] bArr2 = zzhfVar.zzc;
            long j4 = zzhfVar.zze;
            long j5 = zzhfVar.zzf;
            boolean zza = zzhfVar.zza(1);
            int i3 = 0;
            try {
                if (zzhmVar2.zza) {
                    int i4 = 0;
                    while (true) {
                        int i5 = i3 + 1;
                        if (i3 > 20) {
                            StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 20);
                            sb.append("Too many redirects: ");
                            sb.append(i5);
                            throw new zzhq(new NoRouteToHostException(sb.toString()), zzhfVar, AdError.INTERNAL_ERROR_CODE, 1);
                        }
                        j = j3;
                        i = i4;
                        zzhmVar2 = this;
                        HttpURLConnection zzk = zzhmVar2.zzk(url, 1, null, j4, j5, zza, false, zzhfVar.zzd);
                        URL url2 = url;
                        long j6 = j5;
                        zzhmVar = zzhmVar2;
                        try {
                            int responseCode = zzk.getResponseCode();
                            String headerField = zzk.getHeaderField(HttpHeaders.LOCATION);
                            if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                                httpURLConnection = zzk;
                                break;
                            }
                            zzk.disconnect();
                            URL zzl = zzhmVar.zzl(url2, headerField, zzhfVar);
                            j5 = j6;
                            url = zzl;
                            i4 = i;
                            i3 = i5;
                            j3 = j;
                        } catch (IOException e) {
                            e = e;
                            zzhmVar.zzm();
                            throw zzhq.zza(e, zzhfVar, 1);
                        }
                    }
                } else {
                    httpURLConnection = zzhmVar2.zzk(url, 1, null, j4, j5, zza, true, zzhfVar.zzd);
                    zzhmVar = this;
                    j = 0;
                    i = 0;
                }
                zzhmVar.zzh = httpURLConnection;
                zzhmVar.zzk = httpURLConnection.getResponseCode();
                String responseMessage = httpURLConnection.getResponseMessage();
                int i6 = zzhmVar.zzk;
                if (i6 < 200 || i6 > 299) {
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    if (zzhmVar.zzk == 416) {
                        if (zzhfVar.zze == zzhv.zza(httpURLConnection.getHeaderField(HttpHeaders.CONTENT_RANGE))) {
                            zzhmVar.zzj = true;
                            zzg(zzhfVar);
                            long j7 = zzhfVar.zzf;
                            return j7 != -1 ? j7 : j;
                        }
                    }
                    InputStream errorStream = httpURLConnection.getErrorStream();
                    try {
                        bArr = errorStream != null ? zzgxf.zza(errorStream) : zzfj.zzb;
                    } catch (IOException unused) {
                        bArr = zzfj.zzb;
                    }
                    zzhmVar.zzm();
                    throw new zzhs(zzhmVar.zzk, responseMessage, zzhmVar.zzk == 416 ? new zzhc(AdError.REMOTE_ADS_SERVICE_ERROR) : null, headerFields, zzhfVar, bArr);
                }
                httpURLConnection.getContentType();
                if (zzhmVar.zzk == 200) {
                    j2 = zzhfVar.zze;
                }
                j2 = j;
                boolean equalsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField(HttpHeaders.CONTENT_ENCODING));
                if (equalsIgnoreCase) {
                    zzhmVar.zzl = zzhfVar.zzf;
                } else {
                    long j8 = zzhfVar.zzf;
                    if (j8 != -1) {
                        zzhmVar.zzl = j8;
                    } else {
                        long zzb = zzhv.zzb(httpURLConnection.getHeaderField(HttpHeaders.CONTENT_LENGTH), httpURLConnection.getHeaderField(HttpHeaders.CONTENT_RANGE));
                        zzhmVar.zzl = zzb != -1 ? zzb - j2 : -1L;
                    }
                }
                try {
                    zzhmVar.zzi = httpURLConnection.getInputStream();
                    if (equalsIgnoreCase) {
                        zzhmVar.zzi = new GZIPInputStream(zzhmVar.zzi);
                    }
                    zzhmVar.zzj = true;
                    zzg(zzhfVar);
                    if (j2 != j) {
                        try {
                            byte[] bArr3 = new byte[4096];
                            while (j2 > j) {
                                int min = (int) Math.min(j2, PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
                                InputStream inputStream = zzhmVar.zzi;
                                String str = zzfj.zza;
                                InputStream inputStream2 = inputStream;
                                int read = inputStream.read(bArr3, i, min);
                                if (Thread.currentThread().isInterrupted()) {
                                    throw new zzhq(new InterruptedIOException(), zzhfVar, AdError.SERVER_ERROR_CODE, 1);
                                }
                                if (read == -1) {
                                    throw new zzhq(zzhfVar, AdError.REMOTE_ADS_SERVICE_ERROR, 1);
                                }
                                j2 -= read;
                                zzhmVar.zzh(read);
                            }
                        } catch (IOException e2) {
                            zzhmVar.zzm();
                            if (e2 instanceof zzhq) {
                                throw ((zzhq) e2);
                            }
                            throw new zzhq(e2, zzhfVar, AdError.SERVER_ERROR_CODE, 1);
                        }
                    }
                    return zzhmVar.zzl;
                } catch (IOException e3) {
                    zzhmVar.zzm();
                    throw new zzhq(e3, zzhfVar, AdError.SERVER_ERROR_CODE, 1);
                }
            } catch (IOException e4) {
                e = e4;
                zzhmVar = this;
            }
        } catch (IOException e5) {
            e = e5;
            zzhmVar = zzhmVar2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        zzhf zzhfVar = this.zzg;
        if (zzhfVar != null) {
            return zzhfVar.zza;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzd() throws zzhq {
        try {
            InputStream inputStream = this.zzi;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    zzhf zzhfVar = this.zzg;
                    String str = zzfj.zza;
                    zzhf zzhfVar2 = zzhfVar;
                    throw new zzhq(e, zzhfVar, AdError.SERVER_ERROR_CODE, 3);
                }
            }
        } finally {
            this.zzi = null;
            zzm();
            if (this.zzj) {
                this.zzj = false;
                zzi();
            }
            this.zzh = null;
            this.zzg = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhb, com.google.android.gms.internal.ads.zzhu
    public final Map zzj() {
        HttpURLConnection httpURLConnection = this.zzh;
        return httpURLConnection == null ? zzgui.zza() : new zzhl(httpURLConnection.getHeaderFields());
    }
}
