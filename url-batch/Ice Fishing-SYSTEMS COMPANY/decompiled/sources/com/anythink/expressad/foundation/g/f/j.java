package com.anythink.expressad.foundation.g.f;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.GZIPInputStream;

/* loaded from: classes.dex */
public abstract class j<T> implements Comparable<j<T>> {

    /* renamed from: c, reason: collision with root package name */
    private static final String f19522c = "j";

    /* renamed from: a, reason: collision with root package name */
    protected ConcurrentHashMap<String, String> f19523a;

    /* renamed from: b, reason: collision with root package name */
    protected e<T> f19524b;

    /* renamed from: d, reason: collision with root package name */
    private final int f19525d;

    /* renamed from: e, reason: collision with root package name */
    private final String f19526e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f19527f;

    /* renamed from: g, reason: collision with root package name */
    private Integer f19528g;

    /* renamed from: h, reason: collision with root package name */
    private k f19529h;
    private boolean i;

    /* renamed from: j, reason: collision with root package name */
    private m f19530j;

    /* renamed from: k, reason: collision with root package name */
    private Object f19531k;

    public interface a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f19532a = 0;

        /* renamed from: b, reason: collision with root package name */
        public static final int f19533b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f19534c = 2;

        /* renamed from: d, reason: collision with root package name */
        public static final int f19535d = 3;

        /* renamed from: e, reason: collision with root package name */
        public static final int f19536e = 4;

        /* renamed from: f, reason: collision with root package name */
        public static final int f19537f = 5;

        /* renamed from: g, reason: collision with root package name */
        public static final int f19538g = 6;

        /* renamed from: h, reason: collision with root package name */
        public static final int f19539h = 7;
    }

    public class b {

        /* renamed from: a, reason: collision with root package name */
        public static final int f19540a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f19541b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f19542c = 3;

        /* renamed from: d, reason: collision with root package name */
        public static final int f19543d = 4;

        private b() {
        }
    }

    public j(int i, String str, e<T> eVar) {
        this.f19523a = new ConcurrentHashMap<>();
        this.i = false;
        this.f19526e = str;
        this.f19525d = i;
        this.f19524b = eVar;
        this.f19527f = false;
        this.f19530j = new com.anythink.expressad.foundation.g.f.b();
    }

    public static com.anythink.expressad.foundation.g.f.a.a a(com.anythink.expressad.foundation.g.f.a.a aVar) {
        return aVar;
    }

    private int p() {
        Integer num = this.f19528g;
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("getSequence called before setSequence");
    }

    private static void q() {
    }

    private static void r() {
    }

    public abstract l<T> a(com.anythink.expressad.foundation.g.f.f.c cVar);

    public final Object b() {
        return this.f19531k;
    }

    public final void c() {
        k kVar = this.f19529h;
        if (kVar != null) {
            kVar.b(this);
        }
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(Object obj) {
        j jVar = (j) obj;
        int j9 = j();
        int j10 = jVar.j();
        return j9 == j10 ? this.f19528g.intValue() - jVar.f19528g.intValue() : j10 - j9;
    }

    public final String d() {
        return this.f19526e;
    }

    public final void e() {
        this.i = true;
    }

    public final boolean f() {
        return this.i;
    }

    public final Map<String, String> g() {
        return this.f19523a;
    }

    public byte[] h() {
        return null;
    }

    public void i() {
        a("Charset", "UTF-8");
        if (this.f19527f) {
            a("Connection", "keep-alive");
        } else {
            a("Connection", com.anythink.expressad.foundation.d.d.cs);
        }
    }

    public int j() {
        return 2;
    }

    public final int k() {
        return this.f19530j.b();
    }

    public final m l() {
        return this.f19530j;
    }

    public final void m() {
        e<T> eVar = this.f19524b;
        if (eVar != null) {
            eVar.c();
        }
    }

    public final void n() {
        e<T> eVar = this.f19524b;
        if (eVar != null) {
            eVar.b();
        }
    }

    public final void o() {
        e<T> eVar = this.f19524b;
        if (eVar != null) {
            eVar.a();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.i ? "[X] " : "[ ] ");
        sb.append(this.f19526e);
        sb.append(" ");
        sb.append(j());
        sb.append(" ");
        sb.append(this.f19528g);
        return sb.toString();
    }

    public void a(OutputStream outputStream) {
    }

    public final void b(com.anythink.expressad.foundation.g.f.a.a aVar) {
        e<T> eVar = this.f19524b;
        if (eVar != null) {
            eVar.a(aVar);
        }
    }

    public final int a() {
        return this.f19525d;
    }

    public final void a(e<T> eVar) {
        this.f19524b = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private j<?> a(Object obj) {
        this.f19531k = obj;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final j<?> a(m mVar) {
        this.f19530j = mVar;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final j<?> a(k kVar) {
        this.f19529h = kVar;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final j<?> a(int i) {
        this.f19528g = Integer.valueOf(i);
        return this;
    }

    public final void a(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            a(entry.getKey(), entry.getValue());
        }
    }

    public j(int i, String str, e<T> eVar, boolean z8) {
        this.f19523a = new ConcurrentHashMap<>();
        this.i = false;
        this.f19526e = str;
        this.f19525d = i;
        this.f19524b = eVar;
        this.f19527f = z8;
        this.f19530j = new com.anythink.expressad.foundation.g.f.b();
    }

    private void a(String str) {
        this.f19523a.remove(str);
    }

    public byte[] a(com.anythink.expressad.foundation.g.f.f.b bVar, c cVar) {
        if (bVar.c() != null) {
            return a(bVar);
        }
        return new byte[0];
    }

    private static byte[] a(com.anythink.expressad.foundation.g.f.f.b bVar) {
        ByteArrayOutputStream byteArrayOutputStream;
        InputStream inputStream;
        InputStream inputStream2 = null;
        try {
            InputStream c4 = bVar.c();
            try {
                if (com.anythink.expressad.foundation.g.f.g.d.b(bVar.b()) && !(c4 instanceof GZIPInputStream)) {
                    c4 = new GZIPInputStream(c4);
                }
                if (c4 != null) {
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = c4.read(bArr);
                            if (read != -1) {
                                byteArrayOutputStream2.write(bArr, 0, read);
                            } else {
                                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                                try {
                                    c4.close();
                                    byteArrayOutputStream2.close();
                                    return byteArray;
                                } catch (IOException e6) {
                                    e6.getMessage();
                                    return byteArray;
                                }
                            }
                        }
                    } catch (Throwable th) {
                        inputStream = c4;
                        byteArrayOutputStream = byteArrayOutputStream2;
                        th = th;
                        inputStream2 = inputStream;
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (IOException e9) {
                                e9.getMessage();
                                throw th;
                            }
                        }
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                        }
                        throw th;
                    }
                } else {
                    throw new com.anythink.expressad.foundation.g.f.a.a(7, null);
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream = c4;
                byteArrayOutputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
        }
    }

    public j(String str) {
        this.f19523a = new ConcurrentHashMap<>();
        this.f19524b = null;
        this.i = false;
        this.f19526e = str;
        this.f19525d = 0;
        this.f19527f = false;
        this.f19530j = new com.anythink.expressad.foundation.g.f.b();
    }

    public final void a(l<T> lVar) {
        e<T> eVar = this.f19524b;
        if (eVar != null) {
            eVar.a(lVar);
        }
    }

    public final void a(long j9, long j10) {
        e<T> eVar = this.f19524b;
        if (eVar != null) {
            eVar.a(j9, j10);
        }
    }

    private int a(j<T> jVar) {
        int j9 = j();
        int j10 = jVar.j();
        return j9 == j10 ? this.f19528g.intValue() - jVar.f19528g.intValue() : j10 - j9;
    }

    public final void a(String str, String str2) {
        this.f19523a.remove(str);
        this.f19523a.put(str, str2);
    }
}
