package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.browser.trusted.sharing.ShareTarget;
import com.facebook.react.animated.InterpolationAnimatedNode;
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

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzgl extends zzfs implements zzgt {
    private final boolean zza;
    private final int zzb;
    private final int zzc;
    private final String zzd;
    private final zzgs zze;
    private final zzgs zzf;
    private zzge zzg;
    private HttpURLConnection zzh;
    private InputStream zzi;
    private boolean zzj;
    private int zzk;
    private long zzl;
    private long zzm;

    /* synthetic */ zzgl(String str, int i, int i2, boolean z, boolean z2, zzgs zzgsVar, zzghd zzghdVar, boolean z3, byte[] bArr) {
        super(true);
        this.zzd = str;
        this.zzb = i;
        this.zzc = i2;
        this.zza = z;
        this.zze = zzgsVar;
        this.zzf = new zzgs();
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
                httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, true == z ? InterpolationAnimatedNode.EXTRAPOLATE_TYPE_IDENTITY : "gzip");
                httpURLConnection.setInstanceFollowRedirects(z2);
                httpURLConnection.setDoOutput(false);
                int i2 = zzge.zzh;
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
        httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, true == z ? InterpolationAnimatedNode.EXTRAPOLATE_TYPE_IDENTITY : "gzip");
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(false);
        int i22 = zzge.zzh;
        httpURLConnection.setRequestMethod(ShareTarget.METHOD_GET);
        httpURLConnection.connect();
        return httpURLConnection;
    }

    private final URL zzl(URL url, String str, zzge zzgeVar) throws zzgp {
        if (str == null) {
            throw new zzgp("Null location redirect", zzgeVar, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                String.valueOf(protocol);
                throw new zzgp("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), zzgeVar, 2001, 1);
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
            throw new zzgp(sb.toString(), zzgeVar, 2001, 1);
        } catch (MalformedURLException e) {
            throw new zzgp(e, zzgeVar, 2001, 1);
        }
    }

    private final void zzm() {
        HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                zzds.zzf("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzi
    public final int zza(byte[] bArr, int i, int i2) throws zzgp {
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
            String str = zzeo.zza;
            InputStream inputStream2 = inputStream;
            int read = inputStream.read(bArr, i, i2);
            if (read == -1) {
                return -1;
            }
            this.zzm += read;
            zzh(read);
            return read;
        } catch (IOException e) {
            zzge zzgeVar = this.zzg;
            String str2 = zzeo.zza;
            throw zzgp.zza(e, zzgeVar, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b2, code lost:
    
        if (r0 == r18) goto L40;
     */
    @Override // com.google.android.gms.internal.ads.zzga
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzb(zzge zzgeVar) throws zzgp {
        zzgl zzglVar;
        long j;
        int i;
        HttpURLConnection httpURLConnection;
        byte[] bArr;
        long j2;
        zzgl zzglVar2 = this;
        zzglVar2.zzg = zzgeVar;
        long j3 = 0;
        zzglVar2.zzm = 0L;
        zzglVar2.zzl = 0L;
        zzf(zzgeVar);
        try {
            URL url = new URL(zzgeVar.zza.toString());
            int i2 = zzgeVar.zzb;
            byte[] bArr2 = zzgeVar.zzc;
            long j4 = zzgeVar.zze;
            long j5 = zzgeVar.zzf;
            boolean zza = zzgeVar.zza(1);
            int i3 = 0;
            try {
                if (zzglVar2.zza) {
                    int i4 = 0;
                    while (true) {
                        int i5 = i3 + 1;
                        if (i3 > 20) {
                            StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 20);
                            sb.append("Too many redirects: ");
                            sb.append(i5);
                            throw new zzgp(new NoRouteToHostException(sb.toString()), zzgeVar, 2001, 1);
                        }
                        j = j3;
                        i = i4;
                        zzglVar2 = this;
                        HttpURLConnection zzk = zzglVar2.zzk(url, 1, null, j4, j5, zza, false, zzgeVar.zzd);
                        URL url2 = url;
                        long j6 = j5;
                        zzglVar = zzglVar2;
                        try {
                            int responseCode = zzk.getResponseCode();
                            String headerField = zzk.getHeaderField(HttpHeaders.LOCATION);
                            if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                                httpURLConnection = zzk;
                                break;
                            }
                            zzk.disconnect();
                            URL zzl = zzglVar.zzl(url2, headerField, zzgeVar);
                            j5 = j6;
                            url = zzl;
                            i4 = i;
                            i3 = i5;
                            j3 = j;
                        } catch (IOException e) {
                            e = e;
                            zzglVar.zzm();
                            throw zzgp.zza(e, zzgeVar, 1);
                        }
                    }
                } else {
                    httpURLConnection = zzglVar2.zzk(url, 1, null, j4, j5, zza, true, zzgeVar.zzd);
                    zzglVar = this;
                    j = 0;
                    i = 0;
                }
                zzglVar.zzh = httpURLConnection;
                zzglVar.zzk = httpURLConnection.getResponseCode();
                String responseMessage = httpURLConnection.getResponseMessage();
                int i6 = zzglVar.zzk;
                if (i6 < 200 || i6 > 299) {
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    if (zzglVar.zzk == 416) {
                        if (zzgeVar.zze == zzgu.zza(httpURLConnection.getHeaderField(HttpHeaders.CONTENT_RANGE))) {
                            zzglVar.zzj = true;
                            zzg(zzgeVar);
                            long j7 = zzgeVar.zzf;
                            return j7 != -1 ? j7 : j;
                        }
                    }
                    InputStream errorStream = httpURLConnection.getErrorStream();
                    try {
                        bArr = errorStream != null ? zzgmo.zza(errorStream) : zzeo.zzb;
                    } catch (IOException unused) {
                        bArr = zzeo.zzb;
                    }
                    zzglVar.zzm();
                    throw new zzgr(zzglVar.zzk, responseMessage, zzglVar.zzk == 416 ? new zzgb(2008) : null, headerFields, zzgeVar, bArr);
                }
                httpURLConnection.getContentType();
                if (zzglVar.zzk == 200) {
                    j2 = zzgeVar.zze;
                }
                j2 = j;
                boolean equalsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField(HttpHeaders.CONTENT_ENCODING));
                if (equalsIgnoreCase) {
                    zzglVar.zzl = zzgeVar.zzf;
                } else {
                    long j8 = zzgeVar.zzf;
                    if (j8 != -1) {
                        zzglVar.zzl = j8;
                    } else {
                        long zzb = zzgu.zzb(httpURLConnection.getHeaderField(HttpHeaders.CONTENT_LENGTH), httpURLConnection.getHeaderField(HttpHeaders.CONTENT_RANGE));
                        zzglVar.zzl = zzb != -1 ? zzb - j2 : -1L;
                    }
                }
                try {
                    zzglVar.zzi = httpURLConnection.getInputStream();
                    if (equalsIgnoreCase) {
                        zzglVar.zzi = new GZIPInputStream(zzglVar.zzi);
                    }
                    zzglVar.zzj = true;
                    zzg(zzgeVar);
                    if (j2 != j) {
                        try {
                            byte[] bArr3 = new byte[4096];
                            while (j2 > j) {
                                int min = (int) Math.min(j2, 4096L);
                                InputStream inputStream = zzglVar.zzi;
                                String str = zzeo.zza;
                                InputStream inputStream2 = inputStream;
                                int read = inputStream.read(bArr3, i, min);
                                if (Thread.currentThread().isInterrupted()) {
                                    throw new zzgp(new InterruptedIOException(), zzgeVar, 2000, 1);
                                }
                                if (read == -1) {
                                    throw new zzgp(zzgeVar, 2008, 1);
                                }
                                j2 -= read;
                                zzglVar.zzh(read);
                            }
                        } catch (IOException e2) {
                            zzglVar.zzm();
                            if (e2 instanceof zzgp) {
                                throw ((zzgp) e2);
                            }
                            throw new zzgp(e2, zzgeVar, 2000, 1);
                        }
                    }
                    return zzglVar.zzl;
                } catch (IOException e3) {
                    zzglVar.zzm();
                    throw new zzgp(e3, zzgeVar, 2000, 1);
                }
            } catch (IOException e4) {
                e = e4;
                zzglVar = this;
            }
        } catch (IOException e5) {
            e = e5;
            zzglVar = zzglVar2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        zzge zzgeVar = this.zzg;
        if (zzgeVar != null) {
            return zzgeVar.zza;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzga
    public final void zzd() throws zzgp {
        try {
            InputStream inputStream = this.zzi;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    zzge zzgeVar = this.zzg;
                    String str = zzeo.zza;
                    zzge zzgeVar2 = zzgeVar;
                    throw new zzgp(e, zzgeVar, 2000, 3);
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

    @Override // com.google.android.gms.internal.ads.zzga, com.google.android.gms.internal.ads.zzgt
    public final Map zzj() {
        HttpURLConnection httpURLConnection = this.zzh;
        return httpURLConnection == null ? zzgkc.zza() : new zzgk(httpURLConnection.getHeaderFields());
    }
}
