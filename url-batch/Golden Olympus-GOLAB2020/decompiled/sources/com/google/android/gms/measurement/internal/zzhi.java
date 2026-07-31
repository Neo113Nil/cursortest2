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

/* loaded from: classes.dex */
final class zzhi implements Runnable {
    final /* synthetic */ zzhk zza;
    private final URL zzb;
    private final byte[] zzc;
    private final zzhg zzd;
    private final String zze;
    private final Map zzf;

    public zzhi(zzhk zzhkVar, String str, URL url, byte[] bArr, Map map, zzhg zzhgVar) {
        this.zza = zzhkVar;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(zzhgVar);
        this.zzb = url;
        this.zzc = bArr;
        this.zzd = zzhgVar;
        this.zze = str;
        this.zzf = map;
    }

    /* JADX WARN: Not initialized variable reg: 11, insn: 0x00fe: MOVE (r9 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]) (LINE:255), block:B:80:0x00fc */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0101: MOVE (r10 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]) (LINE:258), block:B:78:0x0100 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0164 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0127 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i4;
        HttpURLConnection httpURLConnection;
        Map map;
        IOException iOException;
        int i5;
        Map map2;
        Throwable th;
        Map map3;
        Map map4;
        InputStream inputStream;
        zzhk zzhkVar = this.zza;
        zzhkVar.zzaY();
        OutputStream outputStream = null;
        try {
            URL url = this.zzb;
            int i6 = com.google.android.gms.internal.measurement.zzcm.zzb;
            URLConnection openConnection = url.openConnection();
            if (!(openConnection instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            zzio zzioVar = zzhkVar.zzu;
            zzioVar.zzf();
            httpURLConnection.setConnectTimeout(OrderStatusCode.ORDER_STATE_CANCEL);
            zzioVar.zzf();
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
                byte[] bArr = this.zzc;
                if (bArr != null) {
                    byte[] zzB = zzhkVar.zzg.zzA().zzB(bArr);
                    zzhc zzj = zzioVar.zzaW().zzj();
                    int length = zzB.length;
                    zzj.zzb("Uploading data. size", Integer.valueOf(length));
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                    httpURLConnection.setFixedLengthStreamingMode(length);
                    httpURLConnection.connect();
                    OutputStream outputStream2 = httpURLConnection.getOutputStream();
                    try {
                        outputStream2.write(zzB);
                        outputStream2.close();
                    } catch (IOException e4) {
                        iOException = e4;
                        i5 = 0;
                        map2 = null;
                        outputStream = outputStream2;
                        if (outputStream != null) {
                        }
                        if (httpURLConnection != null) {
                        }
                        this.zza.zzu.zzaX().zzq(new zzhh(this.zze, this.zzd, i5, iOException, null, map2, null));
                    } catch (Throwable th2) {
                        th = th2;
                        i4 = 0;
                        map = null;
                        outputStream = outputStream2;
                        th = th;
                        if (outputStream != null) {
                        }
                        if (httpURLConnection != null) {
                        }
                        this.zza.zzu.zzaX().zzq(new zzhh(this.zze, this.zzd, i4, null, null, map, null));
                        throw th;
                    }
                }
                int responseCode = httpURLConnection.getResponseCode();
                try {
                    try {
                        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            inputStream = httpURLConnection.getInputStream();
                            try {
                                byte[] bArr2 = new byte[1024];
                                while (true) {
                                    int read = inputStream.read(bArr2);
                                    if (read <= 0) {
                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                        inputStream.close();
                                        httpURLConnection.disconnect();
                                        this.zza.zzu.zzaX().zzq(new zzhh(this.zze, this.zzd, responseCode, null, byteArray, headerFields, null));
                                        return;
                                    }
                                    byteArrayOutputStream.write(bArr2, 0, read);
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            inputStream = null;
                        }
                    } catch (IOException e5) {
                        e = e5;
                        map2 = null;
                        i5 = responseCode;
                        iOException = e;
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException e6) {
                                this.zza.zzu.zzaW().zze().zzc("Error closing HTTP compressed POST connection output stream. appId", zzhe.zzn(this.zze), e6);
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        this.zza.zzu.zzaX().zzq(new zzhh(this.zze, this.zzd, i5, iOException, null, map2, null));
                    } catch (Throwable th5) {
                        th = th5;
                        map = null;
                        i4 = responseCode;
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException e7) {
                                this.zza.zzu.zzaW().zze().zzc("Error closing HTTP compressed POST connection output stream. appId", zzhe.zzn(this.zze), e7);
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        this.zza.zzu.zzaX().zzq(new zzhh(this.zze, this.zzd, i4, null, null, map, null));
                        throw th;
                    }
                } catch (IOException e8) {
                    e = e8;
                    i5 = responseCode;
                    map2 = map4;
                    iOException = e;
                    if (outputStream != null) {
                    }
                    if (httpURLConnection != null) {
                    }
                    this.zza.zzu.zzaX().zzq(new zzhh(this.zze, this.zzd, i5, iOException, null, map2, null));
                } catch (Throwable th6) {
                    th = th6;
                    i4 = responseCode;
                    map = map3;
                    if (outputStream != null) {
                    }
                    if (httpURLConnection != null) {
                    }
                    this.zza.zzu.zzaX().zzq(new zzhh(this.zze, this.zzd, i4, null, null, map, null));
                    throw th;
                }
            } catch (IOException e9) {
                iOException = e9;
                i5 = 0;
                map2 = null;
            } catch (Throwable th7) {
                th = th7;
                i4 = 0;
                map = null;
            }
        } catch (IOException e10) {
            iOException = e10;
            i5 = 0;
            httpURLConnection = null;
            map2 = null;
        } catch (Throwable th8) {
            th = th8;
            i4 = 0;
            httpURLConnection = null;
            map = null;
        }
    }
}
