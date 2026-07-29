package org.apache.a.f.a;

import com.applovin.sdk.AppLovinEventParameters;
import com.umeng.commonsdk.proguard.ao;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Locale;
import java.util.StringTokenizer;
import org.apache.a.p;

/* compiled from: DigestScheme.java */
/* loaded from: classes2.dex */
public class d extends m {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f9716a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b, reason: collision with root package name */
    private boolean f9717b = false;

    /* renamed from: c, reason: collision with root package name */
    private String f9718c;

    /* renamed from: d, reason: collision with root package name */
    private long f9719d;
    private String e;
    private String f;
    private String g;

    @Override // org.apache.a.a.a
    public String a() {
        return "digest";
    }

    @Override // org.apache.a.a.a
    public boolean c() {
        return false;
    }

    @Override // org.apache.a.f.a.a, org.apache.a.a.a
    public void a(org.apache.a.d dVar) throws org.apache.a.a.j {
        super.a(dVar);
        if (a("realm") == null) {
            throw new org.apache.a.a.j("missing realm in challenge");
        }
        if (a("nonce") == null) {
            throw new org.apache.a.a.j("missing nonce in challenge");
        }
        this.f9717b = true;
    }

    @Override // org.apache.a.a.a
    public boolean d() {
        if ("true".equalsIgnoreCase(a("stale"))) {
            return false;
        }
        return this.f9717b;
    }

    @Override // org.apache.a.a.a
    public org.apache.a.d a(org.apache.a.a.h hVar, p pVar) throws org.apache.a.a.f {
        if (hVar == null) {
            throw new IllegalArgumentException("Credentials may not be null");
        }
        if (pVar == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
        g().put("methodname", pVar.getRequestLine().a());
        g().put("uri", pVar.getRequestLine().c());
        if (a("charset") == null) {
            g().put("charset", org.apache.a.a.a.a.a(pVar.getParams()));
        }
        return a(hVar);
    }

    private static MessageDigest b(String str) throws o {
        try {
            return MessageDigest.getInstance(str);
        } catch (Exception unused) {
            throw new o("Unsupported algorithm in HTTP Digest authentication: " + str);
        }
    }

    private org.apache.a.d a(org.apache.a.a.h hVar) throws org.apache.a.a.f {
        char c2;
        char c3;
        String str;
        MessageDigest messageDigest;
        String sb;
        String a2 = a("uri");
        String a3 = a("realm");
        String a4 = a("nonce");
        String a5 = a("opaque");
        String a6 = a("methodname");
        String a7 = a("algorithm");
        if (a2 == null) {
            throw new IllegalStateException("URI may not be null");
        }
        if (a3 == null) {
            throw new IllegalStateException("Realm may not be null");
        }
        if (a4 == null) {
            throw new IllegalStateException("Nonce may not be null");
        }
        String a8 = a("qop");
        if (a8 != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(a8, ",");
            while (true) {
                if (!stringTokenizer.hasMoreTokens()) {
                    c2 = 65535;
                    break;
                }
                if (stringTokenizer.nextToken().trim().equals("auth")) {
                    c2 = 2;
                    break;
                }
            }
        } else {
            c2 = 0;
        }
        if (c2 == 65535) {
            throw new org.apache.a.a.f("None of the qop methods is supported: " + a8);
        }
        if (a7 == null) {
            a7 = "MD5";
        }
        String a9 = a("charset");
        if (a9 == null) {
            a9 = "ISO-8859-1";
        }
        String str2 = a7.equalsIgnoreCase("MD5-sess") ? "MD5" : a7;
        try {
            MessageDigest b2 = b(str2);
            String name = hVar.a().getName();
            String b3 = hVar.b();
            if (a4.equals(this.f9718c)) {
                c3 = c2;
                this.f9719d++;
            } else {
                c3 = c2;
                this.f9719d = 1L;
                this.e = null;
                this.f9718c = a4;
            }
            StringBuilder sb2 = new StringBuilder(256);
            new Formatter(sb2, Locale.US).format("%08x", Long.valueOf(this.f9719d));
            String sb3 = sb2.toString();
            if (this.e == null) {
                this.e = f();
            }
            this.f = null;
            this.g = null;
            if (a7.equalsIgnoreCase("MD5-sess")) {
                sb2.setLength(0);
                str = name;
                sb2.append(str);
                sb2.append(':');
                sb2.append(a3);
                sb2.append(':');
                sb2.append(b3);
                messageDigest = b2;
                String a10 = a(messageDigest.digest(org.apache.a.k.c.a(sb2.toString(), a9)));
                sb2.setLength(0);
                sb2.append(a10);
                sb2.append(':');
                sb2.append(a4);
                sb2.append(':');
                sb2.append(this.e);
                this.f = sb2.toString();
            } else {
                str = name;
                messageDigest = b2;
                sb2.setLength(0);
                sb2.append(str);
                sb2.append(':');
                sb2.append(a3);
                sb2.append(':');
                sb2.append(b3);
                this.f = sb2.toString();
            }
            String a11 = a(messageDigest.digest(org.apache.a.k.c.a(this.f, a9)));
            char c4 = c3;
            if (c4 == 2) {
                this.g = a6 + ':' + a2;
            } else {
                if (c4 == 1) {
                    throw new org.apache.a.a.f("qop-int method is not suppported");
                }
                this.g = a6 + ':' + a2;
            }
            String a12 = a(messageDigest.digest(org.apache.a.k.c.a(this.g, a9)));
            if (c4 == 0) {
                sb2.setLength(0);
                sb2.append(a11);
                sb2.append(':');
                sb2.append(a4);
                sb2.append(':');
                sb2.append(a12);
                sb = sb2.toString();
            } else {
                sb2.setLength(0);
                sb2.append(a11);
                sb2.append(':');
                sb2.append(a4);
                sb2.append(':');
                sb2.append(sb3);
                sb2.append(':');
                sb2.append(this.e);
                sb2.append(':');
                sb2.append(c4 == 1 ? "auth-int" : "auth");
                sb2.append(':');
                sb2.append(a12);
                sb = sb2.toString();
            }
            String a13 = a(messageDigest.digest(org.apache.a.k.c.a(sb)));
            org.apache.a.k.b bVar = new org.apache.a.k.b(128);
            if (e()) {
                bVar.a("Proxy-Authorization");
            } else {
                bVar.a("Authorization");
            }
            bVar.a(": Digest ");
            ArrayList arrayList = new ArrayList(20);
            arrayList.add(new org.apache.a.h.l(AppLovinEventParameters.USER_ACCOUNT_IDENTIFIER, str));
            arrayList.add(new org.apache.a.h.l("realm", a3));
            arrayList.add(new org.apache.a.h.l("nonce", a4));
            arrayList.add(new org.apache.a.h.l("uri", a2));
            arrayList.add(new org.apache.a.h.l("response", a13));
            if (c4 != 0) {
                arrayList.add(new org.apache.a.h.l("qop", c4 == 1 ? "auth-int" : "auth"));
                arrayList.add(new org.apache.a.h.l("nc", sb3));
                arrayList.add(new org.apache.a.h.l("cnonce", this.e));
            }
            if (a7 != null) {
                arrayList.add(new org.apache.a.h.l("algorithm", a7));
            }
            if (a5 != null) {
                arrayList.add(new org.apache.a.h.l("opaque", a5));
            }
            for (int i = 0; i < arrayList.size(); i++) {
                org.apache.a.h.l lVar = (org.apache.a.h.l) arrayList.get(i);
                if (i > 0) {
                    bVar.a(", ");
                }
                org.apache.a.h.e.f9943a.a(bVar, lVar, !("nc".equals(lVar.a()) || "qop".equals(lVar.a())));
            }
            return new org.apache.a.h.p(bVar);
        } catch (o unused) {
            throw new org.apache.a.a.f("Unsuppported digest algorithm: " + str2);
        }
    }

    private static String a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length * 2];
        for (int i = 0; i < length; i++) {
            int i2 = bArr[i] & ao.m;
            int i3 = i * 2;
            cArr[i3] = f9716a[(bArr[i] & 240) >> 4];
            cArr[i3 + 1] = f9716a[i2];
        }
        return new String(cArr);
    }

    public static String f() {
        byte[] bArr = new byte[8];
        new SecureRandom().nextBytes(bArr);
        return a(bArr);
    }
}
