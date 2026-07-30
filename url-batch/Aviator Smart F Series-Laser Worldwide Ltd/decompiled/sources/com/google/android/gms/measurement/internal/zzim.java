package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

@WorkerThread
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

    private final void zzb(final int i8, final Exception exc, final byte[] bArr, final Map map) {
        this.zza.zzt.zzaB().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzil
            @Override // java.lang.Runnable
            public final void run() {
                zzim.this.zza(i8, exc, bArr, map);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0091  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.google.android.gms.measurement.internal.zzim] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        HttpURLConnection httpURLConnection;
        ?? r42;
        ?? r43;
        Throwable th;
        int i8;
        IOException e8;
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
            r42 = 60000;
            r43 = 60000;
            httpURLConnection.setConnectTimeout(60000);
            zzinVar.zzt.zzf();
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            try {
                i8 = httpURLConnection.getResponseCode();
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
                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                        inputStream.close();
                                        httpURLConnection.disconnect();
                                        zzb(i8, null, byteArray, headerFields);
                                        return;
                                    }
                                    byteArrayOutputStream.write(bArr, 0, read);
                                }
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
                    } catch (IOException e9) {
                        e8 = e9;
                        r43 = 0;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        zzb(i8, e8, null, r43);
                    } catch (Throwable th4) {
                        th = th4;
                        r42 = 0;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        zzb(i8, null, null, r42);
                        throw th;
                    }
                } catch (IOException e10) {
                    e8 = e10;
                    if (httpURLConnection != null) {
                    }
                    zzb(i8, e8, null, r43);
                } catch (Throwable th5) {
                    th = th5;
                    if (httpURLConnection != null) {
                    }
                    zzb(i8, null, null, r42);
                    throw th;
                }
            } catch (IOException e11) {
                e = e11;
                r43 = 0;
                e8 = e;
                i8 = 0;
                if (httpURLConnection != null) {
                }
                zzb(i8, e8, null, r43);
            } catch (Throwable th6) {
                th = th6;
                r42 = 0;
                th = th;
                i8 = 0;
                if (httpURLConnection != null) {
                }
                zzb(i8, null, null, r42);
                throw th;
            }
        } catch (IOException e12) {
            e = e12;
            httpURLConnection = null;
            r43 = 0;
        } catch (Throwable th7) {
            th = th7;
            httpURLConnection = null;
            r42 = 0;
        }
    }

    final /* synthetic */ void zza(int i8, Exception exc, byte[] bArr, Map map) {
        zzgc zzgcVar = this.zzd;
        zzgcVar.zza.zzC(this.zzc, i8, exc, bArr, map);
    }
}
