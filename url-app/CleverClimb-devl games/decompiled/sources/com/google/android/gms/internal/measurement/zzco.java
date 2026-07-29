package com.google.android.gms.internal.measurement;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.google.android.gms.analytics.zzk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes2.dex */
final class zzco extends zzar {
    private static final byte[] zzaaw = "\n".getBytes();
    private final String zzaau;
    private final zzcz zzaav;

    zzco(zzat zzatVar) {
        super(zzatVar);
        this.zzaau = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", "GoogleAnalytics", zzas.VERSION, Build.VERSION.RELEASE, zzdd.zza(Locale.getDefault()), Build.MODEL, Build.ID);
        this.zzaav = new zzcz(zzatVar.zzbt());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.net.URL] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.net.HttpURLConnection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int zza(URL url) {
        Throwable th;
        IOException e;
        HttpURLConnection httpURLConnection;
        Preconditions.checkNotNull(url);
        zzb("GET request", (Object) url);
        try {
            try {
                httpURLConnection = zzb((URL) url);
                try {
                    httpURLConnection.connect();
                    zza(httpURLConnection);
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode == 200) {
                        zzby().zzbr();
                    }
                    zzb("GET status", Integer.valueOf(responseCode));
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return responseCode;
                } catch (IOException e2) {
                    e = e2;
                    zzd("Network GET connection error", e);
                    if (httpURLConnection == null) {
                        return 0;
                    }
                    httpURLConnection.disconnect();
                    return 0;
                }
            } catch (Throwable th2) {
                th = th2;
                if (url != 0) {
                    url.disconnect();
                }
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            httpURLConnection = null;
        } catch (Throwable th3) {
            th = th3;
            url = 0;
            if (url != 0) {
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.google.android.gms.internal.measurement.zzaq, com.google.android.gms.internal.measurement.zzco] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.net.URL] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.net.HttpURLConnection] */
    private final int zza(URL url, byte[] bArr) {
        OutputStream outputStream;
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(bArr);
        zzb("POST bytes, url", Integer.valueOf(bArr.length), url);
        if (zzcg()) {
            zza("Post payload\n", new String(bArr));
        }
        OutputStream outputStream2 = null;
        try {
            try {
                getContext().getPackageName();
                url = zzb(url);
                try {
                    url.setDoOutput(true);
                    url.setFixedLengthStreamingMode(bArr.length);
                    url.connect();
                    outputStream = url.getOutputStream();
                } catch (IOException e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e2) {
            e = e2;
            url = 0;
        } catch (Throwable th2) {
            th = th2;
            url = 0;
        }
        try {
            outputStream.write(bArr);
            zza(url);
            int responseCode = url.getResponseCode();
            if (responseCode == 200) {
                zzby().zzbr();
            }
            zzb("POST status", Integer.valueOf(responseCode));
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e3) {
                    zze("Error closing http post connection output stream", e3);
                }
            }
            if (url != 0) {
                url.disconnect();
            }
            return responseCode;
        } catch (IOException e4) {
            e = e4;
            outputStream2 = outputStream;
            zzd("Network POST connection error", e);
            if (outputStream2 != null) {
                try {
                    outputStream2.close();
                } catch (IOException e5) {
                    zze("Error closing http post connection output stream", e5);
                }
            }
            if (url == 0) {
                return 0;
            }
            url.disconnect();
            return 0;
        } catch (Throwable th3) {
            th = th3;
            outputStream2 = outputStream;
            if (outputStream2 != null) {
                try {
                    outputStream2.close();
                } catch (IOException e6) {
                    zze("Error closing http post connection output stream", e6);
                }
            }
            if (url == 0) {
                throw th;
            }
            url.disconnect();
            throw th;
        }
    }

    private static void zza(StringBuilder sb, String str, String str2) throws UnsupportedEncodingException {
        if (sb.length() != 0) {
            sb.append('&');
        }
        sb.append(URLEncoder.encode(str, "UTF-8"));
        sb.append('=');
        sb.append(URLEncoder.encode(str2, "UTF-8"));
    }

    private final void zza(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream;
        try {
            inputStream = httpURLConnection.getInputStream();
            try {
                do {
                } while (inputStream.read(new byte[1024]) > 0);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e) {
                        zze("Error closing http connection input stream", e);
                    }
                }
            } catch (Throwable th) {
                th = th;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e2) {
                        zze("Error closing http connection input stream", e2);
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int zzb(URL url, byte[] bArr) {
        HttpURLConnection httpURLConnection;
        OutputStream outputStream;
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(bArr);
        OutputStream outputStream2 = null;
        try {
            getContext().getPackageName();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            zza("POST compressed size, ratio %, url", Integer.valueOf(byteArray.length), Long.valueOf((byteArray.length * 100) / bArr.length), url);
            if (byteArray.length > bArr.length) {
                zzc("Compressed payload is larger then uncompressed. compressed, uncompressed", Integer.valueOf(byteArray.length), Integer.valueOf(bArr.length));
            }
            if (zzcg()) {
                String valueOf = String.valueOf(new String(bArr));
                zza("Post payload", valueOf.length() != 0 ? "\n".concat(valueOf) : new String("\n"));
            }
            HttpURLConnection zzb = zzb(url);
            try {
                zzb.setDoOutput(true);
                zzb.addRequestProperty("Content-Encoding", "gzip");
                zzb.setFixedLengthStreamingMode(byteArray.length);
                zzb.connect();
                outputStream = zzb.getOutputStream();
            } catch (IOException e) {
                httpURLConnection = zzb;
                e = e;
            } catch (Throwable th) {
                httpURLConnection = zzb;
                th = th;
            }
            try {
                outputStream.write(byteArray);
                outputStream.close();
                zza(zzb);
                int responseCode = zzb.getResponseCode();
                if (responseCode == 200) {
                    zzby().zzbr();
                }
                zzb("POST status", Integer.valueOf(responseCode));
                if (zzb != null) {
                    zzb.disconnect();
                }
                return responseCode;
            } catch (IOException e2) {
                httpURLConnection = zzb;
                e = e2;
                outputStream2 = outputStream;
                try {
                    zzd("Network compressed POST connection error", e);
                    if (outputStream2 != null) {
                        try {
                            outputStream2.close();
                        } catch (IOException e3) {
                            zze("Error closing http compressed post connection output stream", e3);
                        }
                    }
                    if (httpURLConnection == null) {
                        return 0;
                    }
                    httpURLConnection.disconnect();
                    return 0;
                } catch (Throwable th2) {
                    th = th2;
                    if (outputStream2 != null) {
                        try {
                            outputStream2.close();
                        } catch (IOException e4) {
                            zze("Error closing http compressed post connection output stream", e4);
                        }
                    }
                    if (httpURLConnection != null) {
                        throw th;
                    }
                    httpURLConnection.disconnect();
                    throw th;
                }
            } catch (Throwable th3) {
                httpURLConnection = zzb;
                th = th3;
                outputStream2 = outputStream;
                if (outputStream2 != null) {
                }
                if (httpURLConnection != null) {
                }
            }
        } catch (IOException e5) {
            e = e5;
            httpURLConnection = null;
        } catch (Throwable th4) {
            th = th4;
            httpURLConnection = null;
        }
    }

    @VisibleForTesting
    private final HttpURLConnection zzb(URL url) throws IOException {
        URLConnection openConnection = url.openConnection();
        if (!(openConnection instanceof HttpURLConnection)) {
            throw new IOException("Failed to obtain http connection");
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        httpURLConnection.setDefaultUseCaches(false);
        httpURLConnection.setConnectTimeout(zzcc.zzzj.get().intValue());
        httpURLConnection.setReadTimeout(zzcc.zzzk.get().intValue());
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestProperty("User-Agent", this.zzaau);
        httpURLConnection.setDoInput(true);
        return httpURLConnection;
    }

    private final URL zzb(zzch zzchVar, String str) {
        String zzea;
        String zzeb;
        StringBuilder sb;
        if (zzchVar.zzeo()) {
            zzea = zzbu.zzdz();
            zzeb = zzbu.zzeb();
            sb = new StringBuilder(String.valueOf(zzea).length() + 1 + String.valueOf(zzeb).length() + String.valueOf(str).length());
        } else {
            zzea = zzbu.zzea();
            zzeb = zzbu.zzeb();
            sb = new StringBuilder(String.valueOf(zzea).length() + 1 + String.valueOf(zzeb).length() + String.valueOf(str).length());
        }
        sb.append(zzea);
        sb.append(zzeb);
        sb.append("?");
        sb.append(str);
        try {
            return new URL(sb.toString());
        } catch (MalformedURLException e) {
            zze("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    private final URL zzd(zzch zzchVar) {
        String valueOf;
        String valueOf2;
        String str;
        String str2;
        if (zzchVar.zzeo()) {
            valueOf = String.valueOf(zzbu.zzdz());
            valueOf2 = String.valueOf(zzbu.zzeb());
            if (valueOf2.length() == 0) {
                str = new String(valueOf);
                str2 = str;
            }
            str2 = valueOf.concat(valueOf2);
        } else {
            valueOf = String.valueOf(zzbu.zzea());
            valueOf2 = String.valueOf(zzbu.zzeb());
            if (valueOf2.length() == 0) {
                str = new String(valueOf);
                str2 = str;
            }
            str2 = valueOf.concat(valueOf2);
        }
        try {
            return new URL(str2);
        } catch (MalformedURLException e) {
            zze("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    private final URL zzex() {
        String valueOf = String.valueOf(zzbu.zzdz());
        String valueOf2 = String.valueOf(zzcc.zzyy.get());
        try {
            return new URL(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        } catch (MalformedURLException e) {
            zze("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    @VisibleForTesting
    final String zza(zzch zzchVar, boolean z) {
        Preconditions.checkNotNull(zzchVar);
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : zzchVar.zzcs().entrySet()) {
                String key = entry.getKey();
                if (!"ht".equals(key) && !"qt".equals(key) && !"AppUID".equals(key) && !"z".equals(key) && !"_gmsv".equals(key)) {
                    zza(sb, key, entry.getValue());
                }
            }
            zza(sb, "ht", String.valueOf(zzchVar.zzen()));
            zza(sb, "qt", String.valueOf(zzbt().currentTimeMillis() - zzchVar.zzen()));
            if (z) {
                long zzep = zzchVar.zzep();
                zza(sb, "z", zzep != 0 ? String.valueOf(zzep) : String.valueOf(zzchVar.zzem()));
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e) {
            zze("Failed to encode name or value", e);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzar
    protected final void zzac() {
        zza("Network initialized. User agent", this.zzaau);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0159, code lost:
    
        if (zza(r5) == 200) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0190, code lost:
    
        if (zza(r6, r5) == 200) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ab A[EDGE_INSN: B:53:0x01ab->B:51:0x01ab BREAK  A[LOOP:1: B:40:0x0112->B:52:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<Long> zzb(List<zzch> list) {
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        zzcm zzbu;
        String str2;
        boolean z4;
        zzk.zzab();
        zzch();
        Preconditions.checkNotNull(list);
        if (zzbv().zzec().isEmpty() || !this.zzaav.zzj(zzcc.zzzh.get().intValue() * 1000)) {
            z = false;
        } else {
            z = zzbk.zzz(zzcc.zzza.get()) != zzbk.NONE;
            if (zzbq.zzaa(zzcc.zzzb.get()) == zzbq.GZIP) {
                z2 = z;
                z3 = true;
                if (!z2) {
                    Preconditions.checkArgument(!list.isEmpty());
                    zza("Uploading batched hits. compression, count", Boolean.valueOf(z3), Integer.valueOf(list.size()));
                    zzcp zzcpVar = new zzcp(this);
                    ArrayList arrayList = new ArrayList();
                    for (zzch zzchVar : list) {
                        if (!zzcpVar.zze(zzchVar)) {
                            break;
                        }
                        arrayList.add(Long.valueOf(zzchVar.zzem()));
                    }
                    if (zzcpVar.zzez() == 0) {
                        return arrayList;
                    }
                    URL zzex = zzex();
                    if (zzex == null) {
                        zzu("Failed to build batching endpoint url");
                    } else {
                        int zzb = z3 ? zzb(zzex, zzcpVar.getPayload()) : zza(zzex, zzcpVar.getPayload());
                        if (200 == zzb) {
                            zza("Batched upload completed. Hits batched", Integer.valueOf(zzcpVar.zzez()));
                            return arrayList;
                        }
                        zza("Network error uploading hits. status code", Integer.valueOf(zzb));
                        if (zzbv().zzec().contains(Integer.valueOf(zzb))) {
                            zzt("Server instructed the client to stop batching");
                            this.zzaav.start();
                        }
                    }
                    return Collections.emptyList();
                }
                ArrayList arrayList2 = new ArrayList(list.size());
                for (zzch zzchVar2 : list) {
                    Preconditions.checkNotNull(zzchVar2);
                    String zza = zza(zzchVar2, !zzchVar2.zzeo());
                    if (zza != null) {
                        if (zza.length() <= zzcc.zzyz.get().intValue()) {
                            URL zzb2 = zzb(zzchVar2, zza);
                            if (zzb2 == null) {
                                str = "Failed to build collect GET endpoint url";
                                zzu(str);
                                z4 = false;
                            }
                        } else {
                            String zza2 = zza(zzchVar2, false);
                            if (zza2 == null) {
                                zzbu = zzbu();
                                str2 = "Error formatting hit for POST upload";
                            } else {
                                byte[] bytes = zza2.getBytes();
                                if (bytes.length > zzcc.zzze.get().intValue()) {
                                    zzbu = zzbu();
                                    str2 = "Hit payload exceeds size limit";
                                } else {
                                    URL zzd = zzd(zzchVar2);
                                    if (zzd == null) {
                                        str = "Failed to build collect POST endpoint url";
                                        zzu(str);
                                        z4 = false;
                                    }
                                }
                            }
                        }
                        if (z4) {
                            break;
                        }
                        arrayList2.add(Long.valueOf(zzchVar2.zzem()));
                        if (arrayList2.size() >= zzbu.zzdx()) {
                            break;
                        }
                    } else {
                        zzbu = zzbu();
                        str2 = "Error formatting hit for upload";
                    }
                    zzbu.zza(zzchVar2, str2);
                    z4 = true;
                    if (z4) {
                    }
                }
                return arrayList2;
            }
        }
        z2 = z;
        z3 = false;
        if (!z2) {
        }
    }

    public final boolean zzew() {
        NetworkInfo networkInfo;
        zzk.zzab();
        zzch();
        try {
            networkInfo = ((ConnectivityManager) getContext().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (SecurityException unused) {
            networkInfo = null;
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        zzq("No network connectivity");
        return false;
    }
}
