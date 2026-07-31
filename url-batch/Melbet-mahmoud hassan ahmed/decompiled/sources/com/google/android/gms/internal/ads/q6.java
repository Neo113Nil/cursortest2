package com.google.android.gms.internal.ads;

import android.os.SystemClock;
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

/* loaded from: classes.dex */
public class q6 implements t5 {

    /* renamed from: a, reason: collision with root package name */
    private final p6 f10589a;

    /* renamed from: b, reason: collision with root package name */
    protected final s6 f10590b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    protected final p6 f10591c;

    public q6(p6 p6Var) {
        s6 s6Var = new s6(4096);
        this.f10589a = p6Var;
        this.f10591c = p6Var;
        this.f10590b = s6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:191:0x02b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02d5  */
    @Override // com.google.android.gms.internal.ads.t5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public w5 a(a6<?> a6Var) {
        z6 z6Var;
        byte[] bArr;
        e7 e7Var;
        e7 e7Var2;
        int b7;
        String str;
        k6 k6Var;
        String str2;
        Map map;
        byte[] bArr2;
        byte[] bArr3;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            Collections.emptyList();
            boolean z6 = true;
            try {
                j5 e7 = a6Var.e();
                if (e7 == null) {
                    map = Collections.emptyMap();
                } else {
                    HashMap hashMap = new HashMap();
                    String str3 = e7.f6971b;
                    if (str3 != null) {
                        hashMap.put("If-None-Match", str3);
                    }
                    long j7 = e7.f6973d;
                    if (j7 > 0) {
                        hashMap.put("If-Modified-Since", y6.c(j7));
                    }
                    map = hashMap;
                }
                String l7 = a6Var.l();
                HashMap hashMap2 = new HashMap();
                hashMap2.putAll(map);
                hashMap2.putAll(a6Var.m());
                URL url = new URL(l7);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
                int b8 = a6Var.b();
                httpURLConnection.setConnectTimeout(b8);
                httpURLConnection.setReadTimeout(b8);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoInput(true);
                "https".equals(url.getProtocol());
                try {
                    for (String str4 : hashMap2.keySet()) {
                        httpURLConnection.setRequestProperty(str4, (String) hashMap2.get(str4));
                    }
                    if (a6Var.zza() != 0) {
                        httpURLConnection.setRequestMethod("POST");
                        byte[] y6 = a6Var.y();
                        if (y6 != null) {
                            httpURLConnection.setDoOutput(true);
                            if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
                                httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
                            }
                            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                            dataOutputStream.write(y6);
                            dataOutputStream.close();
                        }
                    } else {
                        httpURLConnection.setRequestMethod("GET");
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode == -1) {
                        try {
                            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
                        } catch (Throwable th) {
                            th = th;
                            z6 = false;
                            if (!z6) {
                            }
                            throw th;
                        }
                    }
                    a6Var.zza();
                    if ((responseCode >= 100 && responseCode < 200) || responseCode == 204 || responseCode == 304) {
                        z6Var = new z6(responseCode, c7.a(httpURLConnection.getHeaderFields()), -1, null);
                        httpURLConnection.disconnect();
                    } else {
                        try {
                            z6Var = new z6(responseCode, c7.a(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new a7(httpURLConnection));
                        } catch (Throwable th2) {
                            th = th2;
                            if (!z6) {
                                try {
                                    httpURLConnection.disconnect();
                                } catch (IOException e8) {
                                    e = e8;
                                    z6Var = null;
                                    bArr = null;
                                    if (e instanceof SocketTimeoutException) {
                                        e7Var = new e7("socket", new j6(), null);
                                    } else {
                                        if (e instanceof MalformedURLException) {
                                            String valueOf = String.valueOf(a6Var.l());
                                            throw new RuntimeException(valueOf.length() != 0 ? "Bad URL ".concat(valueOf) : new String("Bad URL "), e);
                                        }
                                        if (z6Var == null) {
                                            throw new x5(e);
                                        }
                                        int b9 = z6Var.b();
                                        n6.b("Unexpected response code %d for %s", Integer.valueOf(b9), a6Var.l());
                                        if (bArr != null) {
                                            w5 w5Var = new w5(b9, bArr, false, SystemClock.elapsedRealtime() - elapsedRealtime, z6Var.d());
                                            if (b9 != 401 && b9 != 403) {
                                                if (b9 < 400 || b9 > 499) {
                                                    throw new h6(w5Var);
                                                }
                                                throw new n5(w5Var);
                                            }
                                            e7Var = new e7("auth", new i5(w5Var), null);
                                        } else {
                                            e7Var = new e7("network", new v5(), null);
                                        }
                                    }
                                    e7Var2 = e7Var;
                                    o5 z7 = a6Var.z();
                                    b7 = a6Var.b();
                                    try {
                                        k6Var = e7Var2.f4506b;
                                        z7.c(k6Var);
                                        str2 = e7Var2.f4505a;
                                        a6Var.n(String.format("%s-retry [timeout=%s]", str2, Integer.valueOf(b7)));
                                    } catch (k6 e9) {
                                        str = e7Var2.f4505a;
                                        a6Var.n(String.format("%s-timeout-giveup [timeout=%s]", str, Integer.valueOf(b7)));
                                        throw e9;
                                    }
                                }
                            }
                            throw th;
                        }
                    }
                    try {
                        int b10 = z6Var.b();
                        List<s5> d7 = z6Var.d();
                        if (b10 == 304) {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                            j5 e10 = a6Var.e();
                            if (e10 == null) {
                                return new w5(304, (byte[]) null, true, elapsedRealtime2, d7);
                            }
                            TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                            if (!d7.isEmpty()) {
                                Iterator<s5> it = d7.iterator();
                                while (it.hasNext()) {
                                    treeSet.add(it.next().a());
                                }
                            }
                            ArrayList arrayList = new ArrayList(d7);
                            List<s5> list = e10.f6977h;
                            if (list != null) {
                                if (!list.isEmpty()) {
                                    for (s5 s5Var : e10.f6977h) {
                                        if (!treeSet.contains(s5Var.a())) {
                                            arrayList.add(s5Var);
                                        }
                                    }
                                }
                            } else if (!e10.f6976g.isEmpty()) {
                                for (Map.Entry<String, String> entry : e10.f6976g.entrySet()) {
                                    if (!treeSet.contains(entry.getKey())) {
                                        arrayList.add(new s5(entry.getKey(), entry.getValue()));
                                    }
                                }
                            }
                            return new w5(304, e10.f6970a, true, elapsedRealtime2, (List<s5>) arrayList);
                        }
                        InputStream c7 = z6Var.c();
                        if (c7 != null) {
                            int a7 = z6Var.a();
                            try {
                                s6 s6Var = this.f10590b;
                                f7 f7Var = new f7(s6Var, a7);
                                try {
                                    bArr3 = s6Var.b(1024);
                                    while (true) {
                                        try {
                                            int read = c7.read(bArr3);
                                            if (read == -1) {
                                                break;
                                            }
                                            f7Var.write(bArr3, 0, read);
                                        } catch (Throwable th3) {
                                            th = th3;
                                            try {
                                                c7.close();
                                            } catch (IOException unused) {
                                                n6.d("Error occurred when closing InputStream", new Object[0]);
                                            }
                                            s6Var.a(bArr3);
                                            f7Var.close();
                                            throw th;
                                        }
                                    }
                                    bArr2 = f7Var.toByteArray();
                                    try {
                                        c7.close();
                                    } catch (IOException unused2) {
                                        n6.d("Error occurred when closing InputStream", new Object[0]);
                                    }
                                    s6Var.a(bArr3);
                                    f7Var.close();
                                } catch (Throwable th4) {
                                    th = th4;
                                    bArr3 = null;
                                }
                            } catch (IOException e11) {
                                e = e11;
                                bArr = null;
                                if (e instanceof SocketTimeoutException) {
                                }
                                e7Var2 = e7Var;
                                o5 z72 = a6Var.z();
                                b7 = a6Var.b();
                                k6Var = e7Var2.f4506b;
                                z72.c(k6Var);
                                str2 = e7Var2.f4505a;
                                a6Var.n(String.format("%s-retry [timeout=%s]", str2, Integer.valueOf(b7)));
                            }
                        } else {
                            bArr2 = new byte[0];
                        }
                        try {
                            long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime;
                            if (!n6.f8944b) {
                                if (elapsedRealtime3 > 3000) {
                                }
                                if (b10 >= 200 || b10 > 299) {
                                    throw new IOException();
                                }
                                return new w5(b10, bArr2, false, SystemClock.elapsedRealtime() - elapsedRealtime, d7);
                            }
                            Object[] objArr = new Object[5];
                            objArr[0] = a6Var;
                            objArr[1] = Long.valueOf(elapsedRealtime3);
                            objArr[2] = bArr2 != null ? Integer.valueOf(bArr2.length) : "null";
                            objArr[3] = Integer.valueOf(b10);
                            objArr[4] = Integer.valueOf(a6Var.z().a());
                            n6.a("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", objArr);
                            if (b10 >= 200) {
                            }
                            throw new IOException();
                        } catch (IOException e12) {
                            e = e12;
                            bArr = bArr2;
                            if (e instanceof SocketTimeoutException) {
                            }
                            e7Var2 = e7Var;
                            o5 z722 = a6Var.z();
                            b7 = a6Var.b();
                            k6Var = e7Var2.f4506b;
                            z722.c(k6Var);
                            str2 = e7Var2.f4505a;
                            a6Var.n(String.format("%s-retry [timeout=%s]", str2, Integer.valueOf(b7)));
                        }
                    } catch (IOException e13) {
                        e = e13;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (IOException e14) {
                e = e14;
            }
            str2 = e7Var2.f4505a;
            a6Var.n(String.format("%s-retry [timeout=%s]", str2, Integer.valueOf(b7)));
        }
    }
}
