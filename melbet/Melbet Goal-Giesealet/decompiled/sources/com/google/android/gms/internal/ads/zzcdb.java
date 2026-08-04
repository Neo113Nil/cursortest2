package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.react.animated.InterpolationAnimatedNode;
import com.google.common.net.HttpHeaders;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.Socket;
import java.net.SocketException;
import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzcdb extends zzfs implements zzgt {
    private static final Pattern zza = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference zzb = new AtomicReference();
    private final SSLSocketFactory zzc;
    private final int zzd;
    private final int zze;
    private final String zzf;
    private final zzgs zzg;
    private zzge zzh;
    private HttpURLConnection zzi;
    private InputStream zzj;
    private boolean zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private int zzq;
    private final Set zzr;

    zzcdb(String str, zzgy zzgyVar, int i, int i2, int i3) {
        super(true);
        this.zzc = new zzcda(this);
        this.zzr = new HashSet();
        zzcu.zza(str);
        this.zzf = str;
        this.zzg = new zzgs();
        this.zzd = i;
        this.zze = i2;
        this.zzq = i3;
        if (zzgyVar != null) {
            zze(zzgyVar);
        }
    }

    private final void zzn() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unexpected error while disconnecting", e);
            }
            this.zzi = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0124, code lost:
    
        if (r2 == r16) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0291 A[Catch: IOException -> 0x02eb, TryCatch #4 {IOException -> 0x02eb, blocks: (B:3:0x000e, B:4:0x0027, B:6:0x002f, B:8:0x003d, B:9:0x0045, B:10:0x005d, B:12:0x0063, B:19:0x0090, B:21:0x00b0, B:22:0x00cf, B:23:0x00d4, B:25:0x00dd, B:26:0x00e4, B:40:0x010c, B:102:0x0284, B:104:0x0291, B:106:0x02a2, B:112:0x02ab, B:113:0x02bb, B:116:0x02c5, B:117:0x02cc, B:120:0x02cd, B:121:0x02ea), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02c5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00dd A[Catch: IOException -> 0x02eb, TryCatch #4 {IOException -> 0x02eb, blocks: (B:3:0x000e, B:4:0x0027, B:6:0x002f, B:8:0x003d, B:9:0x0045, B:10:0x005d, B:12:0x0063, B:19:0x0090, B:21:0x00b0, B:22:0x00cf, B:23:0x00d4, B:25:0x00dd, B:26:0x00e4, B:40:0x010c, B:102:0x0284, B:104:0x0291, B:106:0x02a2, B:112:0x02ab, B:113:0x02bb, B:116:0x02c5, B:117:0x02cc, B:120:0x02cd, B:121:0x02ea), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzga
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzb(zzge zzgeVar) throws zzgp {
        long j;
        int responseCode;
        String headerField;
        int responseCode2;
        long j2;
        long parseLong;
        String headerField2;
        this.zzh = zzgeVar;
        long j3 = 0;
        this.zzp = 0L;
        this.zzo = 0L;
        try {
            URL url = new URL(zzgeVar.zza.toString());
            byte[] bArr = zzgeVar.zzc;
            long j4 = zzgeVar.zze;
            long j5 = zzgeVar.zzf;
            boolean zza2 = zzgeVar.zza(1);
            int i = 0;
            while (true) {
                int i2 = i + 1;
                long j6 = j3;
                if (i > 20) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 20);
                    sb.append("Too many redirects: ");
                    sb.append(i2);
                    throw new NoRouteToHostException(sb.toString());
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                if (httpURLConnection instanceof HttpsURLConnection) {
                    ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(this.zzc);
                }
                httpURLConnection.setConnectTimeout(this.zzd);
                httpURLConnection.setReadTimeout(this.zze);
                for (Map.Entry entry : this.zzg.zza().entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    j4 = j4;
                }
                long j7 = j4;
                if (j7 == j6) {
                    if (j5 != -1) {
                        j = j6;
                    }
                    httpURLConnection.setRequestProperty(HttpHeaders.USER_AGENT, this.zzf);
                    if (!zza2) {
                        httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, InterpolationAnimatedNode.EXTRAPOLATE_TYPE_IDENTITY);
                    }
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setDoOutput(false);
                    httpURLConnection.connect();
                    responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                        this.zzi = httpURLConnection;
                        try {
                            responseCode2 = httpURLConnection.getResponseCode();
                            this.zzl = responseCode2;
                            if (responseCode2 >= 200 || responseCode2 > 299) {
                                Map<String, List<String>> headerFields = this.zzi.getHeaderFields();
                                zzn();
                                zzgr zzgrVar = new zzgr(this.zzl, null, null, headerFields, zzgeVar, zzeo.zzb);
                                if (this.zzl == 416) {
                                    throw zzgrVar;
                                }
                                zzgrVar.initCause(new zzgb(2008));
                                throw zzgrVar;
                            }
                            if (responseCode2 == 200) {
                                j2 = zzgeVar.zze;
                            }
                            j2 = j6;
                            this.zzm = j2;
                            if (zzgeVar.zza(1)) {
                                this.zzn = zzgeVar.zzf;
                            } else {
                                long j8 = zzgeVar.zzf;
                                if (j8 != -1) {
                                    this.zzn = j8;
                                } else {
                                    HttpURLConnection httpURLConnection2 = this.zzi;
                                    String headerField3 = httpURLConnection2.getHeaderField(HttpHeaders.CONTENT_LENGTH);
                                    if (!TextUtils.isEmpty(headerField3)) {
                                        try {
                                            parseLong = Long.parseLong(headerField3);
                                        } catch (NumberFormatException unused) {
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(headerField3).length() + 28);
                                            sb2.append("Unexpected Content-Length [");
                                            sb2.append(headerField3);
                                            sb2.append("]");
                                            String sb3 = sb2.toString();
                                            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                                            com.google.android.gms.ads.internal.util.client.zzo.zzf(sb3);
                                        }
                                        headerField2 = httpURLConnection2.getHeaderField(HttpHeaders.CONTENT_RANGE);
                                        if (!TextUtils.isEmpty(headerField2)) {
                                            Matcher matcher = zza.matcher(headerField2);
                                            if (matcher.find()) {
                                                try {
                                                    long parseLong2 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                                                    if (parseLong < j6) {
                                                        parseLong = parseLong2;
                                                    } else if (parseLong != parseLong2) {
                                                        StringBuilder sb4 = new StringBuilder(String.valueOf(headerField3).length() + 25 + String.valueOf(headerField2).length() + 1);
                                                        sb4.append("Inconsistent headers [");
                                                        sb4.append(headerField3);
                                                        sb4.append("] [");
                                                        sb4.append(headerField2);
                                                        sb4.append("]");
                                                        String sb5 = sb4.toString();
                                                        int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                                                        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb5);
                                                        parseLong = Math.max(parseLong, parseLong2);
                                                    }
                                                } catch (NumberFormatException unused2) {
                                                    StringBuilder sb6 = new StringBuilder(String.valueOf(headerField2).length() + 27);
                                                    sb6.append("Unexpected Content-Range [");
                                                    sb6.append(headerField2);
                                                    sb6.append("]");
                                                    String sb7 = sb6.toString();
                                                    int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                                                    com.google.android.gms.ads.internal.util.client.zzo.zzf(sb7);
                                                }
                                            }
                                        }
                                        this.zzn = parseLong != -1 ? parseLong - this.zzm : -1L;
                                    }
                                    parseLong = -1;
                                    headerField2 = httpURLConnection2.getHeaderField(HttpHeaders.CONTENT_RANGE);
                                    if (!TextUtils.isEmpty(headerField2)) {
                                    }
                                    this.zzn = parseLong != -1 ? parseLong - this.zzm : -1L;
                                }
                            }
                            try {
                                this.zzj = this.zzi.getInputStream();
                                this.zzk = true;
                                zzg(zzgeVar);
                                return this.zzn;
                            } catch (IOException e) {
                                zzn();
                                throw new zzgp(e, zzgeVar, 2000, 1);
                            }
                        } catch (IOException e2) {
                            zzn();
                            String uri = zzgeVar.zza.toString();
                            String.valueOf(uri);
                            throw new zzgp("Unable to connect to ".concat(String.valueOf(uri)), e2, zzgeVar, 2000, 1);
                        }
                    }
                    headerField = httpURLConnection.getHeaderField(HttpHeaders.LOCATION);
                    httpURLConnection.disconnect();
                    if (headerField != null) {
                        throw new ProtocolException("Null location redirect");
                    }
                    URL url2 = new URL(url, headerField);
                    String protocol = url2.getProtocol();
                    if (!"https".equals(protocol) && !"http".equals(protocol)) {
                        String.valueOf(protocol);
                        throw new ProtocolException("Unsupported protocol redirect: ".concat(String.valueOf(protocol)));
                    }
                    url = url2;
                    i = i2;
                    j3 = j6;
                    j4 = j7;
                } else {
                    j = j7;
                }
                StringBuilder sb8 = new StringBuilder(String.valueOf(j).length() + 7);
                sb8.append("bytes=");
                sb8.append(j);
                sb8.append("-");
                String sb9 = sb8.toString();
                if (j5 != -1) {
                    long j9 = (j + j5) - 1;
                    StringBuilder sb10 = new StringBuilder(sb9.length() + String.valueOf(j9).length());
                    sb10.append(sb9);
                    sb10.append(j9);
                    sb9 = sb10.toString();
                }
                httpURLConnection.setRequestProperty(HttpHeaders.RANGE, sb9);
                httpURLConnection.setRequestProperty(HttpHeaders.USER_AGENT, this.zzf);
                if (!zza2) {
                }
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setDoOutput(false);
                httpURLConnection.connect();
                responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 300) {
                    this.zzi = httpURLConnection;
                    responseCode2 = httpURLConnection.getResponseCode();
                    this.zzl = responseCode2;
                    if (responseCode2 >= 200) {
                    }
                    Map<String, List<String>> headerFields2 = this.zzi.getHeaderFields();
                    zzn();
                    zzgr zzgrVar2 = new zzgr(this.zzl, null, null, headerFields2, zzgeVar, zzeo.zzb);
                    if (this.zzl == 416) {
                    }
                }
                headerField = httpURLConnection.getHeaderField(HttpHeaders.LOCATION);
                httpURLConnection.disconnect();
                if (headerField != null) {
                }
            }
        } catch (IOException e3) {
            String uri2 = zzgeVar.zza.toString();
            String.valueOf(uri2);
            throw new zzgp("Unable to connect to ".concat(String.valueOf(uri2)), e3, zzgeVar, 2000, 1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final void zzd() throws zzgp {
        try {
            if (this.zzj != null) {
                String str = zzeo.zza;
                try {
                    this.zzj.close();
                } catch (IOException e) {
                    throw new zzgp(e, this.zzh, 2000, 3);
                }
            }
        } finally {
            this.zzj = null;
            zzn();
            if (this.zzk) {
                this.zzk = false;
                zzi();
            }
            this.zzr.clear();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzga, com.google.android.gms.internal.ads.zzgt
    public final Map zzj() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    final void zzk(int i) {
        this.zzq = i;
        for (Socket socket : this.zzr) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.zzq);
                } catch (SocketException e) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to update receive buffer size.", e);
                }
            }
        }
    }

    final /* synthetic */ void zzl(Socket socket) {
        this.zzr.add(socket);
    }

    final /* synthetic */ int zzm() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzi
    public final int zza(byte[] bArr, int i, int i2) throws zzgp {
        try {
            if (this.zzo != this.zzm) {
                AtomicReference atomicReference = zzb;
                byte[] bArr2 = (byte[]) atomicReference.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j = this.zzo;
                    long j2 = this.zzm;
                    if (j == j2) {
                        atomicReference.set(bArr2);
                        break;
                    }
                    int read = this.zzj.read(bArr2, 0, (int) Math.min(j2 - j, bArr2.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (read == -1) {
                        throw new EOFException();
                    }
                    this.zzo += read;
                    zzh(read);
                }
            }
            if (i2 == 0) {
                return 0;
            }
            long j3 = this.zzn;
            if (j3 != -1) {
                long j4 = j3 - this.zzp;
                if (j4 == 0) {
                    return -1;
                }
                i2 = (int) Math.min(i2, j4);
            }
            int read2 = this.zzj.read(bArr, i, i2);
            if (read2 == -1) {
                if (this.zzn == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.zzp += read2;
            zzh(read2);
            return read2;
        } catch (IOException e) {
            throw new zzgp(e, this.zzh, 2000, 2);
        }
    }
}
