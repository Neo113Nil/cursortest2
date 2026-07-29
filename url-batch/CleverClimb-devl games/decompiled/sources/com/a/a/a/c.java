package com.a.a.a;

import android.util.Log;
import com.aiming.mdt.utils.Constants;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static int f2228a = 15000;

    /* renamed from: c, reason: collision with root package name */
    private static c f2229c;

    /* renamed from: b, reason: collision with root package name */
    private boolean f2230b = false;

    /* renamed from: d, reason: collision with root package name */
    private final HashMap<Object, Object> f2231d = new HashMap<>();
    private ScheduledExecutorService e;
    private a f;
    private b g;

    public interface a {
        void a(String str, String str2);
    }

    public interface b {
        <T> T a(Reader reader, Class<T> cls);

        <T> T a(String str, Class<T> cls);

        String a(Object obj);
    }

    /* renamed from: com.a.a.a.c$c, reason: collision with other inner class name */
    class CallableC0019c<T> implements Callable<f<T>> {

        /* renamed from: b, reason: collision with root package name */
        private e f2234b;

        public CallableC0019c(e eVar) {
            this.f2234b = eVar;
        }

        private HttpURLConnection a(e eVar) {
            URL url;
            OutputStream outputStream;
            OutputStreamWriter outputStreamWriter;
            String a2;
            String headerField;
            int read;
            StringBuilder sb = new StringBuilder();
            sb.append(eVar.k());
            if (eVar.l() != null && eVar.l().length() > 0) {
                sb.append("/");
                sb.append(eVar.l());
            }
            StringBuilder sb2 = new StringBuilder();
            String str = "";
            if (eVar.m() != null) {
                for (Map.Entry<String, String> entry : eVar.m().entrySet()) {
                    sb2.append(str);
                    sb2.append(entry.getKey());
                    sb2.append("=");
                    sb2.append(entry.getValue());
                    str = "&";
                }
            }
            if (!eVar.h().equals("GET") || sb2.length() <= 0) {
                url = new URL(sb.toString());
                if (eVar.b() == null && eVar.n() == null && eVar.g() == null && sb2.length() > 0) {
                    eVar.a(sb2.toString());
                }
            } else {
                sb.append("?");
                sb.append(sb2.toString());
                url = new URL(sb.toString());
            }
            if (c.this.f2230b) {
                c.this.d().a(c.class.getSimpleName(), url.toString());
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod(eVar.h());
            httpURLConnection.setInstanceFollowRedirects(eVar.s());
            if (eVar.i() != null) {
                for (Map.Entry<String, String> entry2 : eVar.i().entrySet()) {
                    if (c.this.f2230b) {
                        c.this.d().a(c.class.getSimpleName(), "Header " + entry2.getKey() + ": " + entry2.getValue());
                    }
                    httpURLConnection.setRequestProperty(entry2.getKey(), entry2.getValue());
                }
            }
            int a3 = eVar.a();
            if (a3 <= 0) {
                a3 = c.f2228a;
            }
            httpURLConnection.setReadTimeout(a3);
            httpURLConnection.setConnectTimeout(a3);
            httpURLConnection.setDoInput(true);
            if (eVar.n() != null) {
                httpURLConnection.setDoOutput(true);
                OutputStream outputStream2 = httpURLConnection.getOutputStream();
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream2);
                InputStream bufferedInputStream = new BufferedInputStream(eVar.n());
                if (c.this.f2230b) {
                    byte[] a4 = c.this.a(bufferedInputStream);
                    c.this.d().a(c.class.getSimpleName(), new String(a4));
                    bufferedInputStream.close();
                    bufferedInputStream = new ByteArrayInputStream(a4);
                }
                InputStream inputStream = bufferedInputStream;
                byte[] bArr = new byte[102400];
                do {
                    read = inputStream.read(bArr);
                    if (read > 0) {
                        bufferedOutputStream.write(bArr, 0, read);
                        bufferedOutputStream.flush();
                    }
                } while (read > 0);
                inputStream.close();
                eVar.n().close();
                bufferedOutputStream.flush();
                bufferedOutputStream.close();
                outputStream2.close();
            } else {
                if (eVar.b() != null) {
                    httpURLConnection.setDoOutput(true);
                    outputStream = httpURLConnection.getOutputStream();
                    outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-8");
                    if (c.this.f2230b) {
                        c.this.d().a(c.class.getSimpleName(), eVar.b());
                    }
                    a2 = eVar.b();
                } else if (eVar.g() != null) {
                    httpURLConnection.setDoOutput(true);
                    outputStream = httpURLConnection.getOutputStream();
                    outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-8");
                    a2 = c.this.c().a(eVar.g());
                    if (c.this.f2230b) {
                        c.this.d().a(c.class.getSimpleName(), a2);
                    }
                }
                outputStreamWriter.write(a2);
                outputStreamWriter.flush();
                outputStreamWriter.close();
                outputStream.close();
            }
            if (!c.this.a(httpURLConnection.getResponseCode()) || !eVar.s() || !eVar.t() || (headerField = httpURLConnection.getHeaderField(Constants.KEY_LOCATION)) == null) {
                return httpURLConnection;
            }
            eVar.b(headerField);
            eVar.c("");
            return a(eVar);
        }

        private void a(f fVar) {
            while (!this.f2234b.r() && this.f2234b.f() != null) {
                try {
                    com.a.a.a.b e = this.f2234b.e();
                    if (e != null && e.onNetFinished(fVar)) {
                        return;
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:66:0x01bc A[Catch: Throwable -> 0x0196, TRY_ENTER, TRY_LEAVE, TryCatch #9 {Throwable -> 0x0196, blocks: (B:41:0x0192, B:66:0x01bc), top: B:6:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:67:0x01b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r5v6, types: [java.util.Iterator] */
        /* JADX WARN: Type inference failed for: r6v10, types: [com.a.a.a.f] */
        /* JADX WARN: Type inference failed for: r6v19, types: [com.a.a.a.f] */
        /* JADX WARN: Type inference failed for: r7v3, types: [com.a.a.a.f] */
        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public f<T> call() {
            d dVar;
            HttpURLConnection httpURLConnection;
            int responseCode;
            HashMap hashMap;
            ?? it;
            String str;
            d dVar2;
            InputStream inputStream = null;
            if (this.f2234b.r()) {
                return null;
            }
            try {
                try {
                    try {
                        httpURLConnection = a(this.f2234b);
                        if (httpURLConnection != null) {
                            try {
                                responseCode = httpURLConnection.getResponseCode();
                            } catch (Throwable th) {
                                th = th;
                                dVar = new d(this.f2234b, -1, th);
                                th.printStackTrace();
                                a(dVar);
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (Throwable th2) {
                                        th2.printStackTrace();
                                    }
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                return dVar;
                            }
                        } else {
                            responseCode = -1;
                        }
                        if (c.this.f2230b) {
                            c.this.d().a(c.class.getSimpleName(), "Status code: " + responseCode);
                            c.this.d().a(c.class.getSimpleName(), httpURLConnection.getResponseMessage());
                            c.this.d().a(c.class.getSimpleName(), "Content length: " + httpURLConnection.getContentLength() + " type:" + httpURLConnection.getContentType());
                        }
                        hashMap = new HashMap();
                        it = httpURLConnection.getHeaderFields().entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            StringBuilder sb = new StringBuilder();
                            String str2 = "";
                            for (String str3 : (List) entry.getValue()) {
                                sb.append(str2);
                                sb.append(str3);
                                str2 = ",";
                            }
                            if (c.this.f2230b) {
                                c.this.d().a(c.class.getSimpleName(), ((String) entry.getKey()) + ": " + sb.toString());
                            }
                            hashMap.put(entry.getKey(), sb.toString());
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    try {
                        if (httpURLConnection == null || responseCode >= 400) {
                            if (httpURLConnection != null) {
                                InputStream errorStream = httpURLConnection.getErrorStream();
                                str = (String) a(errorStream, String.class);
                                if (str == null) {
                                    str = httpURLConnection.getResponseMessage();
                                }
                                errorStream.close();
                            } else {
                                str = null;
                            }
                            dVar = new d(this.f2234b, responseCode, str);
                            dVar.a(hashMap);
                            a(dVar);
                        } else {
                            InputStream inputStream2 = httpURLConnection.getInputStream();
                            if (this.f2234b.c() == null) {
                                inputStream = inputStream2;
                                dVar2 = new f(this.f2234b, responseCode, null);
                            } else if (this.f2234b.c().equals(InputStream.class)) {
                                dVar2 = new f(this.f2234b, responseCode, inputStream2);
                            } else {
                                ?? fVar = new f(this.f2234b, responseCode, a(inputStream2, this.f2234b.c()));
                                inputStream2.close();
                                dVar2 = fVar;
                            }
                            dVar2.a(hashMap);
                            a((f) dVar2);
                            dVar = dVar2;
                        }
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th4) {
                                th4.printStackTrace();
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        inputStream = it;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th6) {
                                th6.printStackTrace();
                            }
                        }
                        if (httpURLConnection == null) {
                            throw th;
                        }
                        try {
                            httpURLConnection.disconnect();
                            throw th;
                        } catch (Throwable th7) {
                            th7.printStackTrace();
                            throw th;
                        }
                    }
                } catch (Throwable th8) {
                    th = th8;
                    httpURLConnection = null;
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            } catch (Throwable th9) {
                th9.printStackTrace();
            }
            return dVar;
        }

        public Object a(InputStream inputStream, Class<? extends Object> cls) {
            Object a2;
            a d2;
            String simpleName;
            String str;
            if (cls.equals(String.class)) {
                a2 = new String(c.this.a(inputStream));
                if (!c.this.f2230b) {
                    return a2;
                }
                d2 = c.this.d();
                simpleName = c.class.getSimpleName();
                str = (String) a2;
            } else {
                if (!cls.equals(byte[].class)) {
                    if (c.this.f2230b) {
                        byte[] a3 = c.this.a(inputStream);
                        c.this.d().a(c.class.getSimpleName(), new String(a3));
                        return c.this.c().a(new String(a3), cls);
                    }
                    InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                    Object a4 = c.this.c().a(inputStreamReader, cls);
                    inputStreamReader.close();
                    return a4;
                }
                a2 = c.this.a(inputStream);
                if (!c.this.f2230b) {
                    return a2;
                }
                d2 = c.this.d();
                simpleName = c.class.getSimpleName();
                str = new String((byte[]) a2);
            }
            d2.a(simpleName, str);
            return a2;
        }

        public void a(d dVar) {
            if (this.f2234b.r()) {
                return;
            }
            if (this.f2234b.p() <= 0) {
                if (this.f2234b.j() != null) {
                    int size = this.f2234b.j().size();
                    for (int i = 0; i < size && !this.f2234b.e().onNetError(dVar); i++) {
                    }
                    return;
                }
                return;
            }
            if (this.f2234b.j() != null) {
                for (int size2 = this.f2234b.j().size() - 1; size2 >= 0 && !this.f2234b.j().get(size2).onNetError(dVar); size2--) {
                }
                this.f2234b.a(this.f2234b.p() - 1);
                if (this.f2234b.p() < 0 || this.f2234b.r()) {
                    return;
                }
                c.this.e().schedule(this, this.f2234b.q(), TimeUnit.MILLISECONDS);
            }
        }
    }

    private c() {
    }

    public static c a() {
        if (f2229c == null) {
            f2229c = new c();
        }
        return f2229c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int i) {
        return (i >= 301 && i <= 302) || (i >= 307 && i <= 308);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] a(InputStream inputStream) {
        int read;
        try {
            byte[] bArr = new byte[5120];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            do {
                read = inputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            } while (read > 0);
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static void b() {
        if (f2229c != null) {
            if (f2229c.e != null) {
                f2229c.e.shutdownNow();
                f2229c.e = null;
            }
            f2229c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ScheduledExecutorService e() {
        if (this.e == null) {
            this.e = Executors.newScheduledThreadPool(8);
        }
        return this.e;
    }

    public <T> Future<f<T>> a(e<T> eVar) {
        return e().submit(new CallableC0019c(eVar));
    }

    public b c() {
        if (this.g == null) {
            this.g = new com.a.a.a.a();
        }
        return this.g;
    }

    public a d() {
        if (this.f == null) {
            this.f = new a() { // from class: com.a.a.a.c.1
                @Override // com.a.a.a.c.a
                public void a(String str, String str2) {
                    Log.i(str, str2);
                }
            };
        }
        return this.f;
    }
}
