package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import androidx.browser.trusted.sharing.ShareTarget;
import com.google.common.net.HttpHeaders;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public class zzanp implements zzamt {
    protected final zzanr zza;

    @Deprecated
    protected final zzano zzb;
    private final zzano zzc;

    public zzanp(zzano zzanoVar) {
        zzanr zzanrVar = new zzanr(4096);
        this.zzc = zzanoVar;
        this.zzb = zzanoVar;
        this.zza = zzanrVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:188:0x02b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02d5  */
    @Override // com.google.android.gms.internal.ads.zzamt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzamw zza(zzana zzanaVar) throws zzanj {
        zzany zzanyVar;
        byte[] bArr;
        zzaoc zzaocVar;
        zzaoc zzaocVar2;
        int zzb;
        String str;
        zzanj zzanjVar;
        String str2;
        Map map;
        byte[] bArr2;
        byte[] bArr3;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            Collections.emptyList();
            boolean z = true;
            try {
                zzamj zzd = zzanaVar.zzd();
                if (zzd == null) {
                    map = Collections.emptyMap();
                } else {
                    HashMap hashMap = new HashMap();
                    String str3 = zzd.zzb;
                    if (str3 != null) {
                        hashMap.put(HttpHeaders.IF_NONE_MATCH, str3);
                    }
                    long j = zzd.zzd;
                    if (j > 0) {
                        hashMap.put(HttpHeaders.IF_MODIFIED_SINCE, zzanx.zzc(j));
                    }
                    map = hashMap;
                }
                String zzk = zzanaVar.zzk();
                HashMap hashMap2 = new HashMap();
                hashMap2.putAll(map);
                hashMap2.putAll(zzanaVar.zzl());
                URL url = new URL(zzk);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
                int zzb2 = zzanaVar.zzb();
                httpURLConnection.setConnectTimeout(zzb2);
                httpURLConnection.setReadTimeout(zzb2);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoInput(true);
                "https".equals(url.getProtocol());
                try {
                    for (String str4 : hashMap2.keySet()) {
                        httpURLConnection.setRequestProperty(str4, (String) hashMap2.get(str4));
                    }
                    if (zzanaVar.zza() != 0) {
                        httpURLConnection.setRequestMethod(ShareTarget.METHOD_POST);
                        byte[] zzx = zzanaVar.zzx();
                        if (zzx != null) {
                            httpURLConnection.setDoOutput(true);
                            if (!httpURLConnection.getRequestProperties().containsKey(HttpHeaders.CONTENT_TYPE)) {
                                httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded; charset=UTF-8");
                            }
                            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                            dataOutputStream.write(zzx);
                            dataOutputStream.close();
                        }
                    } else {
                        httpURLConnection.setRequestMethod(ShareTarget.METHOD_GET);
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode == -1) {
                        try {
                            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
                        } catch (Throwable th) {
                            th = th;
                            z = false;
                            if (!z) {
                            }
                            throw th;
                        }
                    }
                    zzanaVar.zza();
                    if ((responseCode >= 100 && responseCode < 200) || responseCode == 204 || responseCode == 304) {
                        zzanyVar = new zzany(responseCode, zzaoa.zza(httpURLConnection.getHeaderFields()), -1, null);
                        httpURLConnection.disconnect();
                    } else {
                        try {
                            zzanyVar = new zzany(responseCode, zzaoa.zza(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new zzanz(httpURLConnection));
                        } catch (Throwable th2) {
                            th = th2;
                            if (!z) {
                                try {
                                    httpURLConnection.disconnect();
                                } catch (IOException e) {
                                    e = e;
                                    zzanyVar = null;
                                    bArr = null;
                                    if (e instanceof SocketTimeoutException) {
                                        zzaocVar = new zzaoc("socket", new zzani(), null);
                                    } else {
                                        if (e instanceof MalformedURLException) {
                                            throw new RuntimeException("Bad URL ".concat(String.valueOf(zzanaVar.zzk())), e);
                                        }
                                        if (zzanyVar == null) {
                                            throw new zzamx(e);
                                        }
                                        int zzb3 = zzanyVar.zzb();
                                        zzanm.zzb("Unexpected response code %d for %s", Integer.valueOf(zzb3), zzanaVar.zzk());
                                        if (bArr != null) {
                                            zzamw zzamwVar = new zzamw(zzb3, bArr, false, SystemClock.elapsedRealtime() - elapsedRealtime, zzanyVar.zzd());
                                            if (zzb3 != 401 && zzb3 != 403) {
                                                if (zzb3 < 400 || zzb3 > 499) {
                                                    throw new zzanh(zzamwVar);
                                                }
                                                throw new zzamn(zzamwVar);
                                            }
                                            zzaocVar = new zzaoc("auth", new zzami(zzamwVar), null);
                                        } else {
                                            zzaocVar = new zzaoc("network", new zzamv(), null);
                                        }
                                    }
                                    zzaocVar2 = zzaocVar;
                                    zzamo zzy = zzanaVar.zzy();
                                    zzb = zzanaVar.zzb();
                                    try {
                                        zzanjVar = zzaocVar2.zzb;
                                        zzy.zzc(zzanjVar);
                                        str2 = zzaocVar2.zza;
                                        zzanaVar.zzm(String.format("%s-retry [timeout=%s]", str2, Integer.valueOf(zzb)));
                                    } catch (zzanj e2) {
                                        str = zzaocVar2.zza;
                                        zzanaVar.zzm(String.format("%s-timeout-giveup [timeout=%s]", str, Integer.valueOf(zzb)));
                                        throw e2;
                                    }
                                }
                            }
                            throw th;
                        }
                    }
                    try {
                        int zzb4 = zzanyVar.zzb();
                        List zzd2 = zzanyVar.zzd();
                        if (zzb4 == 304) {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                            zzamj zzd3 = zzanaVar.zzd();
                            if (zzd3 == null) {
                                return new zzamw(304, (byte[]) null, true, elapsedRealtime2, zzd2);
                            }
                            TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                            if (!zzd2.isEmpty()) {
                                Iterator it = zzd2.iterator();
                                while (it.hasNext()) {
                                    treeSet.add(((zzams) it.next()).zza());
                                }
                            }
                            ArrayList arrayList = new ArrayList(zzd2);
                            List list = zzd3.zzh;
                            if (list != null) {
                                if (!list.isEmpty()) {
                                    for (zzams zzamsVar : zzd3.zzh) {
                                        if (!treeSet.contains(zzamsVar.zza())) {
                                            arrayList.add(zzamsVar);
                                        }
                                    }
                                }
                            } else if (!zzd3.zzg.isEmpty()) {
                                for (Map.Entry entry : zzd3.zzg.entrySet()) {
                                    if (!treeSet.contains(entry.getKey())) {
                                        arrayList.add(new zzams((String) entry.getKey(), (String) entry.getValue()));
                                    }
                                }
                            }
                            return new zzamw(304, zzd3.zza, true, elapsedRealtime2, (List) arrayList);
                        }
                        InputStream zzc = zzanyVar.zzc();
                        if (zzc != null) {
                            int zza = zzanyVar.zza();
                            try {
                                zzanr zzanrVar = this.zza;
                                zzaod zzaodVar = new zzaod(zzanrVar, zza);
                                try {
                                    bArr3 = zzanrVar.zzb(1024);
                                    while (true) {
                                        try {
                                            int read = zzc.read(bArr3);
                                            if (read == -1) {
                                                break;
                                            }
                                            zzaodVar.write(bArr3, 0, read);
                                        } catch (Throwable th3) {
                                            th = th3;
                                            try {
                                                zzc.close();
                                            } catch (IOException unused) {
                                                zzanm.zzd("Error occurred when closing InputStream", new Object[0]);
                                            }
                                            zzanrVar.zza(bArr3);
                                            zzaodVar.close();
                                            throw th;
                                        }
                                    }
                                    bArr2 = zzaodVar.toByteArray();
                                    try {
                                        zzc.close();
                                    } catch (IOException unused2) {
                                        zzanm.zzd("Error occurred when closing InputStream", new Object[0]);
                                    }
                                    zzanrVar.zza(bArr3);
                                    zzaodVar.close();
                                } catch (Throwable th4) {
                                    th = th4;
                                    bArr3 = null;
                                }
                            } catch (IOException e3) {
                                e = e3;
                                bArr = null;
                                if (e instanceof SocketTimeoutException) {
                                }
                                zzaocVar2 = zzaocVar;
                                zzamo zzy2 = zzanaVar.zzy();
                                zzb = zzanaVar.zzb();
                                zzanjVar = zzaocVar2.zzb;
                                zzy2.zzc(zzanjVar);
                                str2 = zzaocVar2.zza;
                                zzanaVar.zzm(String.format("%s-retry [timeout=%s]", str2, Integer.valueOf(zzb)));
                            }
                        } else {
                            bArr2 = new byte[0];
                        }
                        try {
                            long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime;
                            if (!zzanm.zzb) {
                                if (elapsedRealtime3 > 3000) {
                                }
                                if (zzb4 >= 200 || zzb4 > 299) {
                                    throw new IOException();
                                }
                                return new zzamw(zzb4, bArr2, false, SystemClock.elapsedRealtime() - elapsedRealtime, zzd2);
                            }
                            Object[] objArr = new Object[5];
                            objArr[0] = zzanaVar;
                            objArr[1] = Long.valueOf(elapsedRealtime3);
                            objArr[2] = bArr2 != null ? Integer.valueOf(bArr2.length) : AbstractJsonLexerKt.NULL;
                            objArr[3] = Integer.valueOf(zzb4);
                            objArr[4] = Integer.valueOf(zzanaVar.zzy().zza());
                            zzanm.zza("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", objArr);
                            if (zzb4 >= 200) {
                            }
                            throw new IOException();
                        } catch (IOException e4) {
                            e = e4;
                            bArr = bArr2;
                            if (e instanceof SocketTimeoutException) {
                            }
                            zzaocVar2 = zzaocVar;
                            zzamo zzy22 = zzanaVar.zzy();
                            zzb = zzanaVar.zzb();
                            zzanjVar = zzaocVar2.zzb;
                            zzy22.zzc(zzanjVar);
                            str2 = zzaocVar2.zza;
                            zzanaVar.zzm(String.format("%s-retry [timeout=%s]", str2, Integer.valueOf(zzb)));
                        }
                    } catch (IOException e5) {
                        e = e5;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (IOException e6) {
                e = e6;
            }
            str2 = zzaocVar2.zza;
            zzanaVar.zzm(String.format("%s-retry [timeout=%s]", str2, Integer.valueOf(zzb)));
        }
    }
}
