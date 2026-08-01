package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import androidx.browser.trusted.sharing.ShareTarget;
import com.facebook.ads.AdError;
import com.google.common.net.HttpHeaders;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzcgl extends zzgk implements zzhn {
    private static final Pattern zzb = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private final int zzc;
    private final int zzd;
    private final String zze;
    private final zzhm zzf;
    private zzgv zzg;
    private HttpURLConnection zzh;
    private final Queue zzi;
    private InputStream zzj;
    private boolean zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private final long zzr;
    private final long zzs;

    zzcgl(String str, zzhs zzhsVar, int i, int i2, long j, long j2) {
        super(true);
        zzef.zzc(str);
        this.zze = str;
        this.zzf = new zzhm();
        this.zzc = i;
        this.zzd = i2;
        this.zzi = new ArrayDeque();
        this.zzr = j;
        this.zzs = j2;
        if (zzhsVar != null) {
            zzf(zzhsVar);
        }
    }

    private final void zzl() {
        while (!this.zzi.isEmpty()) {
            try {
                ((HttpURLConnection) this.zzi.remove()).disconnect();
            } catch (Exception e) {
                zzcbn.zzh("Unexpected error while disconnecting", e);
            }
        }
        this.zzh = null;
    }

    @Override // com.google.android.gms.internal.ads.zzt
    public final int zza(byte[] bArr, int i, int i2) throws zzhj {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.zzm;
            long j2 = this.zzn;
            if (j - j2 == 0) {
                return -1;
            }
            long j3 = this.zzo + j2;
            long j4 = i2;
            long j5 = j3 + j4 + this.zzs;
            long j6 = this.zzq;
            long j7 = j6 + 1;
            if (j5 > j7) {
                long j8 = this.zzp;
                if (j6 < j8) {
                    long min = Math.min(j8, Math.max(((this.zzr + j7) - r3) - 1, (-1) + j7 + j4));
                    zzk(j7, min, 2);
                    this.zzq = min;
                    j6 = min;
                }
            }
            int read = this.zzj.read(bArr, i, (int) Math.min(j4, ((j6 + 1) - this.zzo) - this.zzn));
            if (read == -1) {
                throw new EOFException();
            }
            this.zzn += read;
            zzg(read);
            return read;
        } catch (IOException e) {
            throw new zzhj(e, this.zzg, AdError.SERVER_ERROR_CODE, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgq
    public final long zzb(zzgv zzgvVar) throws zzhj {
        this.zzg = zzgvVar;
        this.zzn = 0L;
        long j = zzgvVar.zzf;
        long j2 = zzgvVar.zzg;
        long min = j2 == -1 ? this.zzr : Math.min(this.zzr, j2);
        this.zzo = j;
        HttpURLConnection zzk = zzk(j, (min + j) - 1, 1);
        this.zzh = zzk;
        String headerField = zzk.getHeaderField(HttpHeaders.CONTENT_RANGE);
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = zzb.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long parseLong = Long.parseLong(matcher.group(2));
                    long parseLong2 = Long.parseLong(matcher.group(3));
                    long j3 = zzgvVar.zzg;
                    if (j3 != -1) {
                        this.zzm = j3;
                        this.zzp = Math.max(parseLong, (this.zzo + j3) - 1);
                    } else {
                        this.zzm = parseLong2 - this.zzo;
                        this.zzp = parseLong2 - 1;
                    }
                    this.zzq = parseLong;
                    this.zzk = true;
                    zzj(zzgvVar);
                    return this.zzm;
                } catch (NumberFormatException unused) {
                    zzcbn.zzg("Unexpected Content-Range [" + headerField + "]");
                }
            }
        }
        throw new zzcgj(headerField, zzgvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgq
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzgq
    public final void zzd() throws zzhj {
        try {
            InputStream inputStream = this.zzj;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new zzhj(e, this.zzg, AdError.SERVER_ERROR_CODE, 3);
                }
            }
        } finally {
            this.zzj = null;
            zzl();
            if (this.zzk) {
                this.zzk = false;
                zzh();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgk, com.google.android.gms.internal.ads.zzgq
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    final HttpURLConnection zzk(long j, long j2, int i) throws zzhj {
        String uri = this.zzg.zza.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            httpURLConnection.setConnectTimeout(this.zzc);
            httpURLConnection.setReadTimeout(this.zzd);
            for (Map.Entry entry : this.zzf.zza().entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setRequestProperty(HttpHeaders.RANGE, "bytes=" + j + "-" + j2);
            httpURLConnection.setRequestProperty(HttpHeaders.USER_AGENT, this.zze);
            httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, "identity");
            httpURLConnection.setRequestMethod(ShareTarget.METHOD_GET);
            httpURLConnection.connect();
            this.zzi.add(httpURLConnection);
            String uri2 = this.zzg.zza.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                this.zzl = responseCode;
                if (responseCode < 200 || responseCode > 299) {
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    zzl();
                    throw new zzcgk(this.zzl, headerFields, this.zzg, i);
                }
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (this.zzj != null) {
                        inputStream = new SequenceInputStream(this.zzj, inputStream);
                    }
                    this.zzj = inputStream;
                    return httpURLConnection;
                } catch (IOException e) {
                    zzl();
                    throw new zzhj(e, this.zzg, AdError.SERVER_ERROR_CODE, i);
                }
            } catch (IOException e2) {
                zzl();
                throw new zzhj("Unable to connect to ".concat(String.valueOf(uri2)), e2, this.zzg, AdError.SERVER_ERROR_CODE, i);
            }
        } catch (IOException e3) {
            throw new zzhj("Unable to connect to ".concat(String.valueOf(uri)), e3, this.zzg, AdError.SERVER_ERROR_CODE, i);
        }
    }
}
