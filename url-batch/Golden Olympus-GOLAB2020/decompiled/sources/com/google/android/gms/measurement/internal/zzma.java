package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.huawei.hms.iap.entity.OrderStatusCode;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes.dex */
final class zzma implements Runnable {
    final /* synthetic */ zzmb zza;
    private final URL zzb;
    private final byte[] zzc;
    private final zzly zzd;
    private final String zze;
    private final Map zzf;

    public zzma(zzmb zzmbVar, String str, URL url, byte[] bArr, Map map, zzly zzlyVar) {
        this.zza = zzmbVar;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(zzlyVar);
        this.zzb = url;
        this.zzc = bArr;
        this.zzd = zzlyVar;
        this.zze = str;
        this.zzf = map;
    }

    private final void zzb(final int i4, final Exception exc, final byte[] bArr, final Map map) {
        this.zza.zzu.zzaX().zzq(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzlz
            @Override // java.lang.Runnable
            public final void run() {
                r0.zzd.zza(zzma.this.zze, i4, exc, bArr, map);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0135 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.io.OutputStream] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        HttpURLConnection httpURLConnection;
        Map map;
        Map map2;
        Map map3;
        ?? r5;
        Map map4;
        ?? r52;
        int responseCode;
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        zzmb zzmbVar = this.zza;
        zzmbVar.zzaY();
        int i4 = 0;
        try {
            URL url = this.zzb;
            int i5 = com.google.android.gms.internal.measurement.zzcm.zzb;
            URLConnection openConnection = url.openConnection();
            if (!(openConnection instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            zzio zzioVar = zzmbVar.zzu;
            zzioVar.zzf();
            httpURLConnection.setConnectTimeout(OrderStatusCode.ORDER_STATE_CANCEL);
            zzioVar.zzf();
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            ?? r53 = 1;
            httpURLConnection.setDoInput(true);
            try {
                try {
                    Map map5 = this.zzf;
                    if (map5 != null) {
                        for (Map.Entry entry : map5.entrySet()) {
                            httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                        }
                    }
                    byte[] bArr = this.zzc;
                    if (bArr != null) {
                        try {
                            zzioVar.zzaV();
                            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream2);
                            gZIPOutputStream.write(bArr);
                            gZIPOutputStream.close();
                            byteArrayOutputStream2.close();
                            byte[] byteArray = byteArrayOutputStream2.toByteArray();
                            zzhc zzj = this.zza.zzu.zzaW().zzj();
                            int length = byteArray.length;
                            zzj.zzb("Uploading data. size", Integer.valueOf(length));
                            httpURLConnection.setDoOutput(true);
                            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                            httpURLConnection.setFixedLengthStreamingMode(length);
                            httpURLConnection.connect();
                            OutputStream outputStream = httpURLConnection.getOutputStream();
                            try {
                                outputStream.write(byteArray);
                                outputStream.close();
                                r53 = outputStream;
                            } catch (IOException e4) {
                                e = e4;
                                map4 = null;
                                r52 = outputStream;
                                if (r52 != 0) {
                                    try {
                                        r52.close();
                                    } catch (IOException e5) {
                                        this.zza.zzu.zzaW().zze().zzc("Error closing HTTP compressed POST connection output stream. appId", zzhe.zzn(this.zze), e5);
                                    }
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                zzb(i4, e, null, map4);
                            } catch (Throwable th) {
                                th = th;
                                map3 = null;
                                r5 = outputStream;
                                if (r5 != 0) {
                                    try {
                                        r5.close();
                                    } catch (IOException e6) {
                                        this.zza.zzu.zzaW().zze().zzc("Error closing HTTP compressed POST connection output stream. appId", zzhe.zzn(this.zze), e6);
                                    }
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                zzb(i4, null, null, map3);
                                throw th;
                            }
                        } catch (IOException e7) {
                            this.zza.zzu.zzaW().zze().zzb("Failed to gzip post request content", e7);
                            throw e7;
                        }
                    }
                    responseCode = httpURLConnection.getResponseCode();
                } catch (IOException e8) {
                    e = e8;
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                try {
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    try {
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        inputStream = httpURLConnection.getInputStream();
                    } catch (Throwable th3) {
                        th = th3;
                        inputStream = null;
                    }
                    try {
                        byte[] bArr2 = new byte[1024];
                        while (true) {
                            int read = inputStream.read(bArr2);
                            if (read <= 0) {
                                byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                                inputStream.close();
                                httpURLConnection.disconnect();
                                zzb(responseCode, null, byteArray2, headerFields);
                                return;
                            }
                            byteArrayOutputStream.write(bArr2, 0, read);
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        throw th;
                    }
                } catch (IOException e9) {
                    i4 = responseCode;
                    e = e9;
                    map2 = null;
                    map4 = map2;
                    r52 = map2;
                    if (r52 != 0) {
                    }
                    if (httpURLConnection != null) {
                    }
                    zzb(i4, e, null, map4);
                } catch (Throwable th5) {
                    i4 = responseCode;
                    th = th5;
                    map = null;
                    map3 = map;
                    r5 = map;
                    if (r5 != 0) {
                    }
                    if (httpURLConnection != null) {
                    }
                    zzb(i4, null, null, map3);
                    throw th;
                }
            } catch (IOException e10) {
                i4 = responseCode;
                e = e10;
                map4 = r53;
                r52 = 0;
                if (r52 != 0) {
                }
                if (httpURLConnection != null) {
                }
                zzb(i4, e, null, map4);
            } catch (Throwable th6) {
                i4 = responseCode;
                th = th6;
                map3 = r53;
                r5 = 0;
                if (r5 != 0) {
                }
                if (httpURLConnection != null) {
                }
                zzb(i4, null, null, map3);
                throw th;
            }
        } catch (IOException e11) {
            e = e11;
            httpURLConnection = null;
            map2 = null;
        } catch (Throwable th7) {
            th = th7;
            httpURLConnection = null;
            map = null;
        }
    }
}
