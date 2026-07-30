package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

@WorkerThread
/* loaded from: classes3.dex */
final class zzez implements Runnable {
    final /* synthetic */ zzfa zza;
    private final URL zzb;
    private final byte[] zzc;
    private final zzew zzd;
    private final String zze;
    private final Map zzf;

    public zzez(zzfa zzfaVar, String str, URL url, byte[] bArr, Map map, zzew zzewVar) {
        this.zza = zzfaVar;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(zzewVar);
        this.zzb = url;
        this.zzc = bArr;
        this.zzd = zzewVar;
        this.zze = str;
        this.zzf = map;
    }

    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0109: MOVE (r12 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]) (LINE:266), block:B:83:0x0108 */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x010d: MOVE (r12 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]) (LINE:270), block:B:80:0x010b */
    /* JADX WARN: Removed duplicated region for block: B:26:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0171 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0133 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Throwable th;
        HttpURLConnection httpURLConnection;
        Map map;
        IOException e8;
        Map map2;
        int i8;
        zzey zzeyVar;
        zzgb zzgbVar;
        IOException iOException;
        int i9;
        zzfa zzfaVar;
        URLConnection openConnection;
        int responseCode;
        Map map3;
        Map map4;
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        this.zza.zzaz();
        OutputStream outputStream = null;
        try {
            zzfaVar = this.zza;
            openConnection = this.zzb.openConnection();
        } catch (IOException e9) {
            e8 = e9;
            httpURLConnection = null;
            map2 = null;
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection = null;
            map = null;
        }
        if (!(openConnection instanceof HttpURLConnection)) {
            throw new IOException("Failed to obtain HTTP connection");
        }
        httpURLConnection = (HttpURLConnection) openConnection;
        httpURLConnection.setDefaultUseCaches(false);
        zzfaVar.zzt.zzf();
        httpURLConnection.setConnectTimeout(60000);
        zzfaVar.zzt.zzf();
        httpURLConnection.setReadTimeout(61000);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setDoInput(true);
        try {
            Map map5 = this.zzf;
            if (map5 != null) {
                for (Map.Entry entry : map5.entrySet()) {
                    httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            if (this.zzc != null) {
                byte[] zzy = this.zza.zzf.zzu().zzy(this.zzc);
                zzes zzj = this.zza.zzt.zzaA().zzj();
                int length = zzy.length;
                zzj.zzb("Uploading data. size", Integer.valueOf(length));
                httpURLConnection.setDoOutput(true);
                httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                httpURLConnection.setFixedLengthStreamingMode(length);
                httpURLConnection.connect();
                OutputStream outputStream2 = httpURLConnection.getOutputStream();
                try {
                    outputStream2.write(zzy);
                    outputStream2.close();
                } catch (IOException e10) {
                    e8 = e10;
                    map2 = null;
                    outputStream = outputStream2;
                    iOException = e8;
                    i9 = 0;
                    if (outputStream != null) {
                    }
                    if (httpURLConnection != null) {
                    }
                    zzgbVar = this.zza.zzt.zzaB();
                    zzeyVar = new zzey(this.zze, this.zzd, i9, iOException, null, map2, null);
                    zzgbVar.zzp(zzeyVar);
                } catch (Throwable th3) {
                    th = th3;
                    map = null;
                    outputStream = outputStream2;
                    i8 = 0;
                    if (outputStream != null) {
                    }
                    if (httpURLConnection != null) {
                    }
                    this.zza.zzt.zzaB().zzp(new zzey(this.zze, this.zzd, i8, null, null, map, null));
                    throw th;
                }
            }
            responseCode = httpURLConnection.getResponseCode();
        } catch (IOException e11) {
            map2 = null;
            iOException = e11;
            i9 = 0;
            if (outputStream != null) {
            }
            if (httpURLConnection != null) {
            }
            zzgbVar = this.zza.zzt.zzaB();
            zzeyVar = new zzey(this.zze, this.zzd, i9, iOException, null, map2, null);
            zzgbVar.zzp(zzeyVar);
        } catch (Throwable th4) {
            map = null;
            th = th4;
        }
        try {
            try {
                Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    inputStream = httpURLConnection.getInputStream();
                } catch (Throwable th5) {
                    th = th5;
                    inputStream = null;
                }
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
                    inputStream.close();
                    httpURLConnection.disconnect();
                    zzgbVar = this.zza.zzt.zzaB();
                    zzeyVar = new zzey(this.zze, this.zzd, responseCode, null, byteArray, headerFields, null);
                } catch (Throwable th6) {
                    th = th6;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw th;
                }
            } catch (IOException e12) {
                map2 = null;
                iOException = e12;
                i9 = responseCode;
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (IOException e13) {
                        this.zza.zzt.zzaA().zzd().zzc("Error closing HTTP compressed POST connection output stream. appId", zzeu.zzn(this.zze), e13);
                    }
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                zzgbVar = this.zza.zzt.zzaB();
                zzeyVar = new zzey(this.zze, this.zzd, i9, iOException, null, map2, null);
                zzgbVar.zzp(zzeyVar);
            } catch (Throwable th7) {
                th = th7;
                map = null;
                i8 = responseCode;
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (IOException e14) {
                        this.zza.zzt.zzaA().zzd().zzc("Error closing HTTP compressed POST connection output stream. appId", zzeu.zzn(this.zze), e14);
                    }
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                this.zza.zzt.zzaB().zzp(new zzey(this.zze, this.zzd, i8, null, null, map, null));
                throw th;
            }
        } catch (IOException e15) {
            iOException = e15;
            i9 = responseCode;
            map2 = map4;
            if (outputStream != null) {
            }
            if (httpURLConnection != null) {
            }
            zzgbVar = this.zza.zzt.zzaB();
            zzeyVar = new zzey(this.zze, this.zzd, i9, iOException, null, map2, null);
            zzgbVar.zzp(zzeyVar);
        } catch (Throwable th8) {
            th = th8;
            i8 = responseCode;
            map = map3;
            if (outputStream != null) {
            }
            if (httpURLConnection != null) {
            }
            this.zza.zzt.zzaB().zzp(new zzey(this.zze, this.zzd, i8, null, null, map, null));
            throw th;
        }
        zzgbVar.zzp(zzeyVar);
    }
}
