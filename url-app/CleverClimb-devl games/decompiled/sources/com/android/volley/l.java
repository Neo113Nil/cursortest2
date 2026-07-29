package com.android.volley;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.volley.b;
import com.android.volley.n;
import com.android.volley.t;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Map;

/* compiled from: Request.java */
/* loaded from: classes.dex */
public abstract class l<T> implements Comparable<l<T>> {

    /* renamed from: a, reason: collision with root package name */
    private final t.a f2288a;

    /* renamed from: b, reason: collision with root package name */
    private final int f2289b;

    /* renamed from: c, reason: collision with root package name */
    private final String f2290c;

    /* renamed from: d, reason: collision with root package name */
    private final int f2291d;
    private final n.a e;
    private Integer f;
    private m g;
    private boolean h;
    private boolean i;
    private boolean j;
    private p k;
    private b.a l;

    /* compiled from: Request.java */
    public enum a {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    protected abstract n<T> a(i iVar);

    protected s a(s sVar) {
        return sVar;
    }

    protected abstract void a(T t);

    protected Map<String, String> m() throws com.android.volley.a {
        return null;
    }

    protected String n() {
        return "UTF-8";
    }

    public l(int i, String str, n.a aVar) {
        this.f2288a = t.a.f2311a ? new t.a() : null;
        this.h = true;
        this.i = false;
        this.j = false;
        this.l = null;
        this.f2289b = i;
        this.f2290c = str;
        this.e = aVar;
        a((p) new d());
        this.f2291d = c(str);
    }

    public int a() {
        return this.f2289b;
    }

    public int b() {
        return this.f2291d;
    }

    private static int c(String str) {
        Uri parse;
        String host;
        if (TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null || (host = parse.getHost()) == null) {
            return 0;
        }
        return host.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l<?> a(p pVar) {
        this.k = pVar;
        return this;
    }

    public void a(String str) {
        if (t.a.f2311a) {
            this.f2288a.a(str, Thread.currentThread().getId());
        }
    }

    void b(final String str) {
        if (this.g != null) {
            this.g.b(this);
        }
        if (t.a.f2311a) {
            final long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.android.volley.l.1
                    @Override // java.lang.Runnable
                    public void run() {
                        l.this.f2288a.a(str, id);
                        l.this.f2288a.a(toString());
                    }
                });
            } else {
                this.f2288a.a(str, id);
                this.f2288a.a(toString());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l<?> a(m mVar) {
        this.g = mVar;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final l<?> a(int i) {
        this.f = Integer.valueOf(i);
        return this;
    }

    public String c() {
        return this.f2290c;
    }

    public String d() {
        return c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l<?> a(b.a aVar) {
        this.l = aVar;
        return this;
    }

    public b.a e() {
        return this.l;
    }

    public void f() {
        this.i = true;
    }

    public boolean g() {
        return this.i;
    }

    public Map<String, String> h() throws com.android.volley.a {
        return Collections.emptyMap();
    }

    @Deprecated
    protected Map<String, String> i() throws com.android.volley.a {
        return m();
    }

    @Deprecated
    protected String j() {
        return n();
    }

    @Deprecated
    public String k() {
        return o();
    }

    @Deprecated
    public byte[] l() throws com.android.volley.a {
        Map<String, String> i = i();
        if (i == null || i.size() <= 0) {
            return null;
        }
        return a(i, j());
    }

    public String o() {
        String valueOf = String.valueOf(n());
        return valueOf.length() != 0 ? "application/x-www-form-urlencoded; charset=".concat(valueOf) : new String("application/x-www-form-urlencoded; charset=");
    }

    public byte[] p() throws com.android.volley.a {
        Map<String, String> m = m();
        if (m == null || m.size() <= 0) {
            return null;
        }
        return a(m, n());
    }

    private byte[] a(Map<String, String> map, String str) {
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sb.append(URLEncoder.encode(entry.getKey(), str));
                sb.append('=');
                sb.append(URLEncoder.encode(entry.getValue(), str));
                sb.append('&');
            }
            return sb.toString().getBytes(str);
        } catch (UnsupportedEncodingException e) {
            String valueOf = String.valueOf(str);
            throw new RuntimeException(valueOf.length() != 0 ? "Encoding not supported: ".concat(valueOf) : new String("Encoding not supported: "), e);
        }
    }

    public final boolean q() {
        return this.h;
    }

    public a r() {
        return a.NORMAL;
    }

    public final int s() {
        return this.k.a();
    }

    public p t() {
        return this.k;
    }

    public void u() {
        this.j = true;
    }

    public boolean v() {
        return this.j;
    }

    public void b(s sVar) {
        if (this.e != null) {
            this.e.onErrorResponse(sVar);
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(l<T> lVar) {
        a r = r();
        a r2 = lVar.r();
        return r == r2 ? this.f.intValue() - lVar.f.intValue() : r2.ordinal() - r.ordinal();
    }

    public String toString() {
        String valueOf = String.valueOf(Integer.toHexString(b()));
        String concat = valueOf.length() != 0 ? "0x".concat(valueOf) : new String("0x");
        String valueOf2 = String.valueOf(String.valueOf(this.i ? "[X] " : "[ ] "));
        String valueOf3 = String.valueOf(String.valueOf(c()));
        String valueOf4 = String.valueOf(String.valueOf(concat));
        String valueOf5 = String.valueOf(String.valueOf(r()));
        String valueOf6 = String.valueOf(String.valueOf(this.f));
        StringBuilder sb = new StringBuilder(valueOf2.length() + 3 + valueOf3.length() + valueOf4.length() + valueOf5.length() + valueOf6.length());
        sb.append(valueOf2);
        sb.append(valueOf3);
        sb.append(" ");
        sb.append(valueOf4);
        sb.append(" ");
        sb.append(valueOf5);
        sb.append(" ");
        sb.append(valueOf6);
        return sb.toString();
    }
}
