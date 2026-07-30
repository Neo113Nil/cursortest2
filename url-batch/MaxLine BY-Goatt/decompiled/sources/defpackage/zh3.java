package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.zip.GZIPOutputStream;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class zh3 implements Runnable {
    public final /* synthetic */ int m = 0;
    public final URL n;
    public final byte[] o;
    public final String p;
    public final Map q;
    public final Object r;
    public final /* synthetic */ rp3 s;

    public zh3(bi3 bi3Var, String str, URL url, byte[] bArr, Map map, xh3 xh3Var) {
        Objects.requireNonNull(bi3Var);
        this.s = bi3Var;
        ll3.s(str);
        ll3.v(url);
        this.n = url;
        this.o = bArr;
        this.r = xh3Var;
        this.p = str;
        this.q = map;
    }

    public void a(int i, IOException iOException, byte[] bArr, Map map) {
        lj3 lj3Var = ((pj3) ((om3) this.s).m).s;
        pj3.m(lj3Var);
        lj3Var.F(new ws0(this, i, iOException, bArr, map));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0167 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0143 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v8 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Throwable th;
        int i;
        HttpURLConnection httpURLConnection;
        Map map;
        IOException iOException;
        HttpURLConnection httpURLConnection2;
        Map map2;
        rh3 rh3Var;
        lj3 lj3Var;
        URLConnection openConnection;
        Map<String, List<String>> headerFields;
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        Throwable th2;
        OutputStream outputStream;
        HttpURLConnection httpURLConnection3;
        Map map3;
        IOException iOException2;
        OutputStream outputStream2;
        HttpURLConnection httpURLConnection4;
        Map map4;
        Map map5;
        ?? r7;
        Map map6;
        InputStream inputStream2;
        Object obj = this.r;
        int i2 = this.m;
        ?? r6 = "Content-Encoding";
        byte[] bArr2 = this.o;
        Map map7 = this.q;
        URL url = this.n;
        rp3 rp3Var = this.s;
        int i3 = 0;
        String str = this.p;
        switch (i2) {
            case 0:
                OutputStream outputStream3 = null;
                bi3 bi3Var = (bi3) rp3Var;
                pj3 pj3Var = (pj3) bi3Var.m;
                pj3 pj3Var2 = (pj3) bi3Var.m;
                lj3 lj3Var2 = pj3Var.s;
                pj3.m(lj3Var2);
                lj3Var2.A();
                try {
                    openConnection = url.openConnection();
                } catch (IOException e) {
                    iOException = e;
                    i = 0;
                    httpURLConnection2 = null;
                    map2 = null;
                } catch (Throwable th3) {
                    th = th3;
                    i = 0;
                    httpURLConnection = null;
                    map = null;
                }
                if (!(openConnection instanceof HttpURLConnection)) {
                    throw new IOException("Failed to obtain HTTP connection");
                }
                httpURLConnection2 = (HttpURLConnection) openConnection;
                httpURLConnection2.setDefaultUseCaches(false);
                pj3Var2.getClass();
                httpURLConnection2.setConnectTimeout(60000);
                httpURLConnection2.setReadTimeout(61000);
                httpURLConnection2.setInstanceFollowRedirects(false);
                httpURLConnection2.setDoInput(true);
                if (map7 != null) {
                    try {
                        for (Map.Entry entry : map7.entrySet()) {
                            httpURLConnection2.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                        }
                    } catch (IOException e2) {
                        iOException = e2;
                        i = 0;
                        map2 = null;
                        if (outputStream3 != null) {
                        }
                        if (httpURLConnection2 != null) {
                        }
                        lj3Var = pj3Var2.s;
                        pj3.m(lj3Var);
                        rh3Var = new rh3(this.p, (xh3) obj, i, iOException, (byte[]) null, map2);
                        lj3Var.F(rh3Var);
                        return;
                    } catch (Throwable th4) {
                        th = th4;
                        httpURLConnection = httpURLConnection2;
                        i = 0;
                        map = null;
                        th = th;
                        if (outputStream3 != null) {
                        }
                        if (httpURLConnection != null) {
                        }
                        lj3 lj3Var3 = pj3Var2.s;
                        pj3.m(lj3Var3);
                        lj3Var3.F(new rh3(this.p, (xh3) obj, i, (IOException) null, (byte[]) null, map));
                        throw th;
                    }
                }
                if (bArr2 != null) {
                    bi3 bi3Var2 = bi3Var.n.s;
                    oq3.U(bi3Var2);
                    byte[] i0 = bi3Var2.i0(bArr2);
                    vh3 vh3Var = pj3Var2.r;
                    pj3.m(vh3Var);
                    g10 g10Var = vh3Var.z;
                    int length = i0.length;
                    g10Var.c(Integer.valueOf(length), "Uploading data. size");
                    httpURLConnection2.setDoOutput(true);
                    httpURLConnection2.addRequestProperty("Content-Encoding", "gzip");
                    httpURLConnection2.setFixedLengthStreamingMode(length);
                    httpURLConnection2.connect();
                    OutputStream outputStream4 = httpURLConnection2.getOutputStream();
                    try {
                        outputStream4.write(i0);
                        outputStream4.close();
                    } catch (IOException e3) {
                        iOException = e3;
                        i = 0;
                        map2 = null;
                        outputStream3 = outputStream4;
                        if (outputStream3 != null) {
                        }
                        if (httpURLConnection2 != null) {
                        }
                        lj3Var = pj3Var2.s;
                        pj3.m(lj3Var);
                        rh3Var = new rh3(this.p, (xh3) obj, i, iOException, (byte[]) null, map2);
                        lj3Var.F(rh3Var);
                        return;
                    } catch (Throwable th5) {
                        th = th5;
                        i = 0;
                        map = null;
                        outputStream3 = outputStream4;
                        httpURLConnection = httpURLConnection2;
                        th = th;
                        if (outputStream3 != null) {
                        }
                        if (httpURLConnection != null) {
                        }
                        lj3 lj3Var32 = pj3Var2.s;
                        pj3.m(lj3Var32);
                        lj3Var32.F(new rh3(this.p, (xh3) obj, i, (IOException) null, (byte[]) null, map));
                        throw th;
                    }
                }
                i = httpURLConnection2.getResponseCode();
                try {
                    try {
                        headerFields = httpURLConnection2.getHeaderFields();
                        try {
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            inputStream = httpURLConnection2.getInputStream();
                        } catch (Throwable th6) {
                            th = th6;
                            inputStream = null;
                        }
                        try {
                            bArr = new byte[1024];
                        } catch (Throwable th7) {
                            th = th7;
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            throw th;
                        }
                    } catch (IOException e4) {
                        iOException = e4;
                        if (outputStream3 != null) {
                            try {
                                outputStream3.close();
                            } catch (IOException e5) {
                                vh3 vh3Var2 = pj3Var2.r;
                                pj3.m(vh3Var2);
                                vh3Var2.r.d(vh3.E(str), e5, "Error closing HTTP compressed POST connection output stream. appId");
                            }
                        }
                        if (httpURLConnection2 != null) {
                            httpURLConnection2.disconnect();
                        }
                        lj3Var = pj3Var2.s;
                        pj3.m(lj3Var);
                        rh3Var = new rh3(this.p, (xh3) obj, i, iOException, (byte[]) null, map2);
                        lj3Var.F(rh3Var);
                        return;
                    } catch (Throwable th8) {
                        th = th8;
                        httpURLConnection = httpURLConnection2;
                        th = th;
                        if (outputStream3 != null) {
                            try {
                                outputStream3.close();
                            } catch (IOException e6) {
                                vh3 vh3Var3 = pj3Var2.r;
                                pj3.m(vh3Var3);
                                vh3Var3.r.d(vh3.E(str), e6, "Error closing HTTP compressed POST connection output stream. appId");
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        lj3 lj3Var322 = pj3Var2.s;
                        pj3.m(lj3Var322);
                        lj3Var322.F(new rh3(this.p, (xh3) obj, i, (IOException) null, (byte[]) null, map));
                        throw th;
                    }
                } catch (IOException e7) {
                    iOException = e7;
                    map2 = null;
                    if (outputStream3 != null) {
                    }
                    if (httpURLConnection2 != null) {
                    }
                    lj3Var = pj3Var2.s;
                    pj3.m(lj3Var);
                    rh3Var = new rh3(this.p, (xh3) obj, i, iOException, (byte[]) null, map2);
                    lj3Var.F(rh3Var);
                    return;
                } catch (Throwable th9) {
                    th = th9;
                    httpURLConnection = httpURLConnection2;
                    map = null;
                    th = th;
                    if (outputStream3 != null) {
                    }
                    if (httpURLConnection != null) {
                    }
                    lj3 lj3Var3222 = pj3Var2.s;
                    pj3.m(lj3Var3222);
                    lj3Var3222.F(new rh3(this.p, (xh3) obj, i, (IOException) null, (byte[]) null, map));
                    throw th;
                }
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read <= 0) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        inputStream.close();
                        httpURLConnection2.disconnect();
                        lj3Var = pj3Var2.s;
                        pj3.m(lj3Var);
                        rh3Var = new rh3(this.p, (xh3) obj, i, (IOException) null, byteArray, headerFields);
                        lj3Var.F(rh3Var);
                        return;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            default:
                om3 om3Var = (om3) rp3Var;
                pj3 pj3Var3 = (pj3) om3Var.m;
                pj3 pj3Var4 = (pj3) om3Var.m;
                lj3 lj3Var4 = pj3Var3.s;
                pj3.m(lj3Var4);
                lj3Var4.A();
                try {
                    URLConnection openConnection2 = url.openConnection();
                    if (!(openConnection2 instanceof HttpURLConnection)) {
                        throw new IOException("Failed to obtain HTTP connection");
                    }
                    HttpURLConnection httpURLConnection5 = (HttpURLConnection) openConnection2;
                    httpURLConnection5.setDefaultUseCaches(false);
                    pj3Var4.getClass();
                    httpURLConnection5.setConnectTimeout(60000);
                    httpURLConnection5.setReadTimeout(61000);
                    httpURLConnection5.setInstanceFollowRedirects(false);
                    httpURLConnection5.setDoInput(true);
                    if (map7 != null) {
                        try {
                            try {
                                for (Map.Entry entry2 : map7.entrySet()) {
                                    httpURLConnection5.addRequestProperty((String) entry2.getKey(), (String) entry2.getValue());
                                }
                            } catch (Throwable th10) {
                                th = th10;
                                httpURLConnection3 = httpURLConnection5;
                                outputStream = null;
                                r7 = 0;
                                th2 = th;
                                map3 = r7;
                                if (outputStream != null) {
                                    try {
                                        outputStream.close();
                                    } catch (IOException e8) {
                                        vh3 vh3Var4 = pj3Var4.r;
                                        pj3.m(vh3Var4);
                                        vh3Var4.r.d(vh3.E(str), e8, "Error closing HTTP compressed POST connection output stream. appId");
                                    }
                                }
                                if (httpURLConnection3 != null) {
                                    httpURLConnection3.disconnect();
                                }
                                a(i3, null, null, map3);
                                throw th2;
                            }
                        } catch (IOException e9) {
                            e = e9;
                            httpURLConnection4 = httpURLConnection5;
                            map5 = null;
                            iOException2 = e;
                            outputStream2 = null;
                            map4 = map5;
                            if (outputStream2 != null) {
                                try {
                                    outputStream2.close();
                                } catch (IOException e10) {
                                    vh3 vh3Var5 = pj3Var4.r;
                                    pj3.m(vh3Var5);
                                    vh3Var5.r.d(vh3.E(str), e10, "Error closing HTTP compressed POST connection output stream. appId");
                                }
                            }
                            if (httpURLConnection4 != null) {
                                httpURLConnection4.disconnect();
                            }
                            a(i3, iOException2, null, map4);
                            return;
                        }
                    }
                    if (bArr2 != null) {
                        try {
                            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream2);
                            gZIPOutputStream.write(bArr2);
                            gZIPOutputStream.close();
                            byteArrayOutputStream2.close();
                            byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                            vh3 vh3Var6 = pj3Var4.r;
                            pj3.m(vh3Var6);
                            g10 g10Var2 = vh3Var6.z;
                            int length2 = byteArray2.length;
                            g10Var2.c(Integer.valueOf(length2), "Uploading data. size");
                            httpURLConnection5.setDoOutput(true);
                            httpURLConnection5.addRequestProperty("Content-Encoding", "gzip");
                            httpURLConnection5.setFixedLengthStreamingMode(length2);
                            httpURLConnection5.connect();
                            outputStream = httpURLConnection5.getOutputStream();
                            try {
                                outputStream.write(byteArray2);
                                outputStream.close();
                            } catch (IOException e11) {
                                iOException2 = e11;
                                outputStream2 = outputStream;
                                httpURLConnection4 = httpURLConnection5;
                                map4 = null;
                                if (outputStream2 != null) {
                                }
                                if (httpURLConnection4 != null) {
                                }
                                a(i3, iOException2, null, map4);
                                return;
                            } catch (Throwable th11) {
                                th = th11;
                                httpURLConnection3 = httpURLConnection5;
                                r7 = 0;
                                th2 = th;
                                map3 = r7;
                                if (outputStream != null) {
                                }
                                if (httpURLConnection3 != null) {
                                }
                                a(i3, null, null, map3);
                                throw th2;
                            }
                        } catch (IOException e12) {
                            vh3 vh3Var7 = pj3Var4.r;
                            pj3.m(vh3Var7);
                            vh3Var7.r.c(e12, "Failed to gzip post request content");
                            throw e12;
                        }
                    }
                    int responseCode = httpURLConnection5.getResponseCode();
                    try {
                        try {
                            Map<String, List<String>> headerFields2 = httpURLConnection5.getHeaderFields();
                            try {
                                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                                inputStream2 = httpURLConnection5.getInputStream();
                                try {
                                    byte[] bArr3 = new byte[1024];
                                    while (true) {
                                        int read2 = inputStream2.read(bArr3);
                                        if (read2 <= 0) {
                                            byte[] byteArray3 = byteArrayOutputStream3.toByteArray();
                                            inputStream2.close();
                                            httpURLConnection5.disconnect();
                                            a(responseCode, null, byteArray3, headerFields2);
                                            return;
                                        }
                                        byteArrayOutputStream3.write(bArr3, 0, read2);
                                    }
                                } catch (Throwable th12) {
                                    th = th12;
                                    if (inputStream2 != null) {
                                        inputStream2.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th13) {
                                th = th13;
                                inputStream2 = null;
                            }
                        } catch (IOException e13) {
                            e = e13;
                            i3 = responseCode;
                            map6 = null;
                            httpURLConnection4 = httpURLConnection5;
                            map5 = map6;
                            iOException2 = e;
                            outputStream2 = null;
                            map4 = map5;
                            if (outputStream2 != null) {
                            }
                            if (httpURLConnection4 != null) {
                            }
                            a(i3, iOException2, null, map4);
                            return;
                        } catch (Throwable th14) {
                            th = th14;
                            httpURLConnection3 = httpURLConnection5;
                            i3 = responseCode;
                            outputStream = null;
                            r7 = 0;
                            th2 = th;
                            map3 = r7;
                            if (outputStream != null) {
                            }
                            if (httpURLConnection3 != null) {
                            }
                            a(i3, null, null, map3);
                            throw th2;
                        }
                    } catch (IOException e14) {
                        e = e14;
                        i3 = responseCode;
                        map6 = r6;
                        httpURLConnection4 = httpURLConnection5;
                        map5 = map6;
                        iOException2 = e;
                        outputStream2 = null;
                        map4 = map5;
                        if (outputStream2 != null) {
                        }
                        if (httpURLConnection4 != null) {
                        }
                        a(i3, iOException2, null, map4);
                        return;
                    } catch (Throwable th15) {
                        th = th15;
                        i3 = responseCode;
                        r7 = "Content-Encoding";
                        outputStream = null;
                        httpURLConnection3 = httpURLConnection5;
                        th2 = th;
                        map3 = r7;
                        if (outputStream != null) {
                        }
                        if (httpURLConnection3 != null) {
                        }
                        a(i3, null, null, map3);
                        throw th2;
                    }
                } catch (IOException e15) {
                    iOException2 = e15;
                    outputStream2 = null;
                    httpURLConnection4 = null;
                } catch (Throwable th16) {
                    th2 = th16;
                    outputStream = null;
                    httpURLConnection3 = null;
                    map3 = null;
                }
        }
    }

    public zh3(om3 om3Var, String str, URL url, byte[] bArr, HashMap hashMap, mm3 mm3Var) {
        Objects.requireNonNull(om3Var);
        this.s = om3Var;
        ll3.s(str);
        this.n = url;
        this.o = bArr;
        this.r = mm3Var;
        this.p = str;
        this.q = hashMap;
    }
}
