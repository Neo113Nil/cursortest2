package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes3.dex */
final class zzim implements Runnable {
    final /* synthetic */ zzin zza;
    private final URL zzb;
    private final String zzc;
    private final zzgc zzd;

    public zzim(zzin zzinVar, String str, URL url, byte[] bArr, Map map, zzgc zzgcVar) {
        this.zza = zzinVar;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(zzgcVar);
        this.zzb = url;
        this.zzd = zzgcVar;
        this.zzc = str;
    }

    private final void zzb(final int i, final Exception exc, final byte[] bArr, final Map map) {
        this.zza.zzt.zzaB().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzil
            @Override // java.lang.Runnable
            public final void run() {
                zzim.this.zza(i, exc, bArr, map);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0094  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.google.android.gms.measurement.internal.zzim] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        Throwable th;
        HttpURLConnection httpURLConnection;
        ?? r4;
        IOException e;
        ?? r42;
        InputStream inputStream;
        this.zza.zzaz();
        try {
            zzin zzinVar = this.zza;
            URLConnection openConnection = this.zzb.openConnection();
            if (!(openConnection instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            zzinVar.zzt.zzf();
            r4 = 60000;
            r42 = 60000;
            httpURLConnection.setConnectTimeout(60000);
            zzinVar.zzt.zzf();
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            try {
                i = httpURLConnection.getResponseCode();
                try {
                    try {
                        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            inputStream = httpURLConnection.getInputStream();
                            try {
                                byte[] bArr = new byte[1024];
                                while (true) {
                                    int read = inputStream.read(bArr);
                                    if (read <= 0) {
                                        break;
                                    } else {
                                        byteArrayOutputStream.write(bArr, 0, read);
                                    }
                                }
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                zzb(i, null, byteArray, headerFields);
                            } catch (Throwable th2) {
                                th = th2;
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            inputStream = null;
                        }
                    } catch (IOException e2) {
                        e = e2;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        zzb(i, e, null, r42);
                    } catch (Throwable th4) {
                        th = th4;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        zzb(i, null, null, r4);
                        throw th;
                    }
                } catch (IOException e3) {
                    e = e3;
                    r42 = 0;
                    if (httpURLConnection != null) {
                    }
                    zzb(i, e, null, r42);
                } catch (Throwable th5) {
                    th = th5;
                    r4 = 0;
                    if (httpURLConnection != null) {
                    }
                    zzb(i, null, null, r4);
                    throw th;
                }
            } catch (IOException e4) {
                i = 0;
                e = e4;
            } catch (Throwable th6) {
                i = 0;
                th = th6;
            }
        } catch (IOException e5) {
            i = 0;
            e = e5;
            httpURLConnection = null;
            r42 = 0;
        } catch (Throwable th7) {
            i = 0;
            th = th7;
            httpURLConnection = null;
            r4 = 0;
        }
    }

    final /* synthetic */ void zza(int i, Exception exc, byte[] bArr, Map map) {
        zzgc zzgcVar = this.zzd;
        zzgcVar.zza.zzC(this.zzc, i, exc, bArr, map);
    }
}
