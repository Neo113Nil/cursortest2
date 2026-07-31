package com.applovin.impl;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.util.Consumer;
import com.applovin.impl.b4;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u4;
import java.net.MalformedURLException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.chromium.net.NetError;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class q0 {
    private static final List e = Arrays.asList("5.0/i", "4.0/ad", "1.0/mediate");
    private final com.applovin.impl.sdk.k a;
    private final com.applovin.impl.sdk.o b;
    private final b4 c;
    private d d;

    public static class b {
        private long a;
        private long b;

        public long a() {
            return this.a;
        }

        public long b() {
            return this.b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(long j) {
            this.a = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(long j) {
            this.b = j;
        }
    }

    private class c implements Consumer {
        private final String a;
        private final com.applovin.impl.sdk.network.a b;
        private final String c;
        private final Object d;
        private final boolean e;
        private final b f;
        private final e g;

        @Override // androidx.core.util.Consumer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(b4.d dVar) {
            int i;
            int c;
            long e = dVar.e();
            Object obj = null;
            try {
                try {
                    c = dVar.c();
                } catch (MalformedURLException e2) {
                    e = e2;
                    i = 0;
                }
                try {
                    if (c <= 0) {
                        q0.this.a(this.c, this.a, c, e, (Throwable) null);
                        this.g.a(this.a, c, null, null);
                        return;
                    }
                    if (c < 200 || c >= 400) {
                        this.g.a(this.a, c, null, null);
                        return;
                    }
                    b bVar = this.f;
                    if (bVar != null) {
                        bVar.a(e);
                    }
                    q0.this.a(this.c, this.a, c, e);
                    byte[] d = dVar.d();
                    if (n7.h(com.applovin.impl.sdk.k.o()) && (!this.e || u4.b(d) != u4.a.V2)) {
                        q0.this.a.t().a(d != null ? new String(dVar.d(), Charset.forName("UTF-8")) : "", this.a, this.b.b() != null ? this.b.b().toString() : "");
                    }
                    if (d == null) {
                        this.g.a(this.a, this.d, c);
                        return;
                    }
                    String str = new String(dVar.d(), Charset.forName("UTF-8"));
                    b bVar2 = this.f;
                    if (bVar2 != null) {
                        bVar2.b(d.length);
                        if (this.b.r()) {
                            q0.this.d = new d(this.b.f(), d.length, e);
                        }
                    }
                    if (this.e) {
                        String b = u4.b(d, q0.this.a.i0(), q0.this.a);
                        if (b == null) {
                            HashMap hashMap = new HashMap(2);
                            hashMap.put("request", StringUtils.getHostAndPath(this.a));
                            hashMap.put("response", str);
                            q0.this.a.F().trackEvent("rdf", hashMap);
                        }
                        str = b;
                    }
                    try {
                        this.g.a(this.a, q0.this.a(str, this.d), c);
                    } catch (Throwable th) {
                        String str2 = "Unable to parse response from " + StringUtils.getHostAndPath(this.a) + " because of " + th.getClass().getName() + " : " + th.getMessage();
                        com.applovin.impl.sdk.o unused = q0.this.b;
                        if (com.applovin.impl.sdk.o.a()) {
                            q0.this.b.a("ConnectionManager", str2, th);
                        }
                        q0.this.a.D().a("ConnectionManager", "failedToParseResponse", th, CollectionUtils.hashMap("url", StringUtils.getHostAndPath(this.a)));
                        this.g.a(this.a, -800, str2, null);
                    }
                } catch (MalformedURLException e3) {
                    e = e3;
                    i = c;
                    if (this.d != null) {
                        q0.this.a(this.c, this.a, i, e, e);
                        this.g.a(this.a, NetError.ERR_BLOB_OUT_OF_MEMORY, e.getMessage(), null);
                    } else {
                        q0.this.a(this.c, this.a, i, e);
                        this.g.a(this.a, this.d, NetError.ERR_BLOB_OUT_OF_MEMORY);
                    }
                }
            } catch (Throwable th2) {
                int b2 = dVar.b();
                try {
                    byte[] f = dVar.f();
                    String str3 = new String(f);
                    if (f != null) {
                        if (this.e) {
                            str3 = u4.b(f, q0.this.a.i0(), q0.this.a);
                        }
                        obj = q0.this.a(str3, this.d);
                    }
                } catch (Throwable unused2) {
                }
                q0.this.a(this.c, this.a, b2, e, th2);
                this.g.a(this.a, b2, th2.getMessage(), obj);
            }
        }

        private c(String str, com.applovin.impl.sdk.network.a aVar, String str2, Object obj, boolean z, b bVar, e eVar) {
            this.a = str;
            this.b = aVar;
            this.c = str2;
            this.d = obj;
            this.e = z;
            this.f = bVar;
            this.g = eVar;
        }
    }

    public static class d {
        private final long a = System.currentTimeMillis();
        private final String b;
        private final long c;
        private final long d;

        public d(String str, long j, long j2) {
            this.b = str;
            this.c = j;
            this.d = j2;
        }

        protected boolean a(Object obj) {
            return obj instanceof d;
        }

        public long b() {
            return this.c;
        }

        public long c() {
            return this.a;
        }

        public String d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (!dVar.a(this) || c() != dVar.c() || b() != dVar.b() || a() != dVar.a()) {
                return false;
            }
            String d = d();
            String d2 = dVar.d();
            return d != null ? d.equals(d2) : d2 == null;
        }

        public int hashCode() {
            long c = c();
            long b = b();
            int i = ((((int) (c ^ (c >>> 32))) + 59) * 59) + ((int) (b ^ (b >>> 32)));
            long a = a();
            String d = d();
            return (((i * 59) + ((int) ((a >>> 32) ^ a))) * 59) + (d == null ? 43 : d.hashCode());
        }

        public String toString() {
            return "ConnectionManager.RequestMeasurement(timestampMillis=" + c() + ", urlHostAndPathString=" + d() + ", responseSizeBytes=" + b() + ", connectionTimeMillis=" + a() + ")";
        }

        public long a() {
            return this.d;
        }
    }

    public interface e {
        void a(String str, int i, String str2, Object obj);

        void a(String str, Object obj, int i);
    }

    public q0(com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
        this.b = kVar.O();
        b4 b4Var = new b4(kVar);
        this.c = b4Var;
        b4Var.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x021f A[Catch: all -> 0x0145, TryCatch #1 {all -> 0x0145, blocks: (B:34:0x00f9, B:36:0x0109, B:39:0x0135, B:40:0x0131, B:41:0x014a, B:44:0x016f, B:46:0x018b, B:50:0x01ad, B:53:0x0205, B:56:0x0214, B:58:0x021f, B:59:0x01b1, B:62:0x01b9, B:69:0x01d1, B:71:0x01d7, B:72:0x01f1, B:73:0x019a, B:74:0x0222, B:76:0x0228, B:77:0x023c, B:65:0x01ca), top: B:33:0x00f9, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(com.applovin.impl.sdk.network.a aVar, b bVar, e eVar) {
        String str;
        byte[] bytes;
        byte[] a2;
        if (aVar != null) {
            String f = aVar.f();
            String h = aVar.h();
            if (f == null) {
                throw new IllegalArgumentException("No endpoint specified");
            }
            if (h == null) {
                throw new IllegalArgumentException("No method specified");
            }
            if (eVar != null) {
                if (!f.toLowerCase().startsWith("http")) {
                    String str2 = "Requested postback submission to non HTTP endpoint " + f + "; skipping...";
                    com.applovin.impl.sdk.o.h("ConnectionManager", str2);
                    eVar.a(f, -900, str2, null);
                    return;
                }
                String httpsString = StringUtils.toHttpsString(f);
                HashMap hashMap = new HashMap(2);
                boolean m = aVar.m();
                u4.a a3 = ((Boolean) this.a.a(x4.o5)).booleanValue() ? u4.a.a(((Integer) this.a.a(x4.l5)).intValue()) : aVar.e();
                long a4 = n7.a(this.a);
                if ((aVar.i() != null && !aVar.i().isEmpty()) || aVar.c() > 0) {
                    Map i = aVar.i();
                    Boolean bool = (Boolean) this.a.a(x4.i3);
                    if (i != null && aVar.c() > 0) {
                        i.put("current_retry_attempt", String.valueOf(aVar.c()));
                    }
                    if (m) {
                        String a5 = n7.a(i, bool.booleanValue());
                        String b2 = u4.b(a5, a4, a3, this.a.i0(), this.a);
                        if (StringUtils.isValidString(a5) && TextUtils.isEmpty(b2)) {
                            hashMap.put("query", a5);
                        }
                        httpsString = StringUtils.appendQueryParameter(httpsString, "p", b2);
                    } else {
                        httpsString = StringUtils.appendQueryParameters(httpsString, i, bool.booleanValue());
                    }
                }
                String str3 = httpsString;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    Boolean endsWith = StringUtils.endsWith(StringUtils.getHostAndPath(str3), e);
                    if (com.applovin.impl.sdk.o.a()) {
                        com.applovin.impl.sdk.o oVar = this.b;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Sending ");
                        sb.append(h);
                        sb.append(" request to id=#");
                        sb.append(str3.hashCode());
                        sb.append(" \"");
                        sb.append(endsWith.booleanValue() ? str3 : StringUtils.getHostAndPath(str3));
                        sb.append("\"...");
                        oVar.d("ConnectionManager", sb.toString());
                    }
                    b4.c.a a6 = new b4.c.a().a(str3).b(h).a(aVar.g()).a(aVar.l());
                    if (aVar.b() != null) {
                        if (m) {
                            bytes = u4.a(aVar.b().toString(), a4, a3, this.a.i0(), this.a);
                            if (bytes == null) {
                                hashMap.put("body", aVar.b().toString());
                            }
                        } else {
                            bytes = aVar.b().toString().getBytes("UTF-8");
                        }
                        byte[] bArr = bytes;
                        if ((!m || a3 != u4.a.V2) && aVar.o() && bArr != null && bArr.length > ((Integer) this.a.a(x4.J5)).intValue()) {
                            try {
                                a2 = n7.a(bArr);
                            } catch (Throwable th) {
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.b.a("ConnectionManager", "Failed to gzip POST body for request " + a(str3), th);
                                }
                                this.a.D().a("ConnectionManager", "gzip", th, CollectionUtils.hashMap("url", StringUtils.getHostAndPath(str3)));
                            }
                            a6.a("Content-Type", "application/json; charset=utf-8");
                            if (!aVar.o() && a2 != null) {
                                a6.a("Content-Encoding", "gzip");
                                a6.a(a2);
                            } else if (bArr != null) {
                                a6.a(bArr);
                            }
                        }
                        a2 = null;
                        a6.a("Content-Type", "application/json; charset=utf-8");
                        if (!aVar.o()) {
                        }
                        if (bArr != null) {
                        }
                    }
                    if (!hashMap.isEmpty()) {
                        hashMap.put("request", StringUtils.getHostAndPath(str3));
                        this.a.F().trackEvent("ref", hashMap);
                    }
                    b4 b4Var = this.c;
                    Object d2 = aVar.d();
                    str = str3;
                    try {
                        b4Var.a(a6.a(new c(str3, aVar, h, d2, m, bVar, eVar)).a(this.a.q0().c()).a());
                    } catch (Throwable th2) {
                        th = th2;
                        String str4 = str;
                        a(h, str4, 0, SystemClock.elapsedRealtime() - elapsedRealtime, th);
                        eVar.a(str4, 0, th.getMessage(), null);
                    }
                } catch (Throwable th3) {
                    th = th3;
                    str = str3;
                }
            } else {
                throw new IllegalArgumentException("No callback specified");
            }
        } else {
            throw new IllegalArgumentException("No request specified");
        }
    }

    public d a() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object a(String str, Object obj) {
        if (obj == null) {
            return str;
        }
        if (str != null && str.length() >= 3) {
            if (obj instanceof JSONObject) {
                return new JSONObject(str);
            }
            if (obj instanceof p8) {
                return q8.a(str, this.a);
            }
            if (obj instanceof String) {
                return str;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.b.b("ConnectionManager", "Failed to process response of type '" + obj.getClass().getName() + "'");
            }
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, int i, long j) {
        if (com.applovin.impl.sdk.o.a()) {
            this.b.d("ConnectionManager", "Successful " + str + " returned " + i + " in " + (j / 1000.0f) + " s over " + r0.g(this.a) + " to " + a(str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, int i, long j, Throwable th) {
        if (com.applovin.impl.sdk.o.a()) {
            this.b.a("ConnectionManager", "Failed " + str + " returned " + i + " in " + (j / 1000.0f) + " s over " + r0.g(this.a) + " to " + a(str2), th);
        }
    }

    private String a(String str) {
        return "#" + str.hashCode() + " \"" + StringUtils.getHostAndPath(str) + "\"";
    }
}
