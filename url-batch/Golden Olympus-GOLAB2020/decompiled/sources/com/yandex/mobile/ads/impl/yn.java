package com.yandex.mobile.ads.impl;

import java.util.Comparator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class yn {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final b f35246b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final a f35247c = new a();

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final LinkedHashMap f35248d = new LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public static final yn f35249e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public static final yn f35250f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    public static final yn f35251g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    public static final yn f35252h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    public static final yn f35253i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    public static final yn f35254j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    public static final yn f35255k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    public static final yn f35256l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    public static final yn f35257m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    public static final yn f35258n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    public static final yn f35259o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    public static final yn f35260p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    public static final yn f35261q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    public static final yn f35262r;

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    public static final yn f35263s;

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    public static final yn f35264t;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f35265a;

    public static final class a implements Comparator<String> {
        a() {
        }

        @Override // java.util.Comparator
        public final int compare(String str, String str2) {
            String a4 = str;
            String b4 = str2;
            Intrinsics.checkNotNullParameter(a4, "a");
            Intrinsics.checkNotNullParameter(b4, "b");
            int min = Math.min(a4.length(), b4.length());
            for (int i4 = 4; i4 < min; i4++) {
                char charAt = a4.charAt(i4);
                char charAt2 = b4.charAt(i4);
                if (charAt != charAt2) {
                    return Intrinsics.compare((int) charAt, (int) charAt2) < 0 ? -1 : 1;
                }
            }
            int length = a4.length();
            int length2 = b4.length();
            if (length != length2) {
                return length < length2 ? -1 : 1;
            }
            return 0;
        }
    }

    public static final class b {
        private b() {
        }

        private static String b(String str) {
            if (StringsKt.K(str, "TLS_", false, 2, null)) {
                String substring = str.substring(4);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                return "SSL_" + substring;
            }
            if (!StringsKt.K(str, "SSL_", false, 2, null)) {
                return str;
            }
            String substring2 = str.substring(4);
            Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
            return "TLS_" + substring2;
        }

        @NotNull
        public final synchronized yn a(@NotNull String javaName) {
            yn ynVar;
            try {
                Intrinsics.checkNotNullParameter(javaName, "javaName");
                ynVar = (yn) ((LinkedHashMap) yn.f35248d).get(javaName);
                if (ynVar == null) {
                    ynVar = (yn) ((LinkedHashMap) yn.f35248d).get(b(javaName));
                    if (ynVar == null) {
                        ynVar = new yn(javaName, 0);
                    }
                    yn.f35248d.put(javaName, ynVar);
                }
            } catch (Throwable th) {
                throw th;
            }
            return ynVar;
        }

        public /* synthetic */ b(int i4) {
            this();
        }
    }

    static {
        int i4 = 0;
        f35246b = new b(i4);
        yn a4 = xn.a("SSL_RSA_WITH_DES_CBC_SHA", xn.a("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", xn.a("SSL_RSA_WITH_RC4_128_SHA", xn.a("SSL_RSA_WITH_RC4_128_MD5", xn.a("SSL_RSA_EXPORT_WITH_RC4_40_MD5", xn.a("SSL_RSA_WITH_NULL_SHA", xn.a("SSL_RSA_WITH_NULL_MD5", new yn("SSL_RSA_WITH_NULL_MD5", i4), "SSL_RSA_WITH_NULL_SHA", 0), "SSL_RSA_EXPORT_WITH_RC4_40_MD5", 0), "SSL_RSA_WITH_RC4_128_MD5", 0), "SSL_RSA_WITH_RC4_128_SHA", 0), "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 0), "SSL_RSA_WITH_DES_CBC_SHA", 0), "SSL_RSA_WITH_3DES_EDE_CBC_SHA", 0);
        f35248d.put("SSL_RSA_WITH_3DES_EDE_CBC_SHA", a4);
        f35249e = a4;
        f35248d.put("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", xn.a("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", xn.a("SSL_DHE_RSA_WITH_DES_CBC_SHA", xn.a("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", xn.a("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", xn.a("SSL_DHE_DSS_WITH_DES_CBC_SHA", xn.a("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", new yn("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", i4), "SSL_DHE_DSS_WITH_DES_CBC_SHA", 0), "SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 0), "SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 0), "SSL_DHE_RSA_WITH_DES_CBC_SHA", 0), "SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 0), "SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 0));
        yn a5 = xn.a("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", xn.a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", xn.a("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", xn.a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", xn.a("TLS_KRB5_WITH_RC4_128_MD5", xn.a("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", xn.a("TLS_KRB5_WITH_DES_CBC_MD5", xn.a("TLS_KRB5_WITH_RC4_128_SHA", xn.a("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", xn.a("TLS_KRB5_WITH_DES_CBC_SHA", xn.a("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", xn.a("SSL_DH_anon_WITH_DES_CBC_SHA", xn.a("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", xn.a("SSL_DH_anon_WITH_RC4_128_MD5", new yn("SSL_DH_anon_WITH_RC4_128_MD5", i4), "SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 0), "SSL_DH_anon_WITH_DES_CBC_SHA", 0), "SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 0), "TLS_KRB5_WITH_DES_CBC_SHA", 0), "TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 0), "TLS_KRB5_WITH_RC4_128_SHA", 0), "TLS_KRB5_WITH_DES_CBC_MD5", 0), "TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 0), "TLS_KRB5_WITH_RC4_128_MD5", 0), "TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 0), "TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 0), "TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 0), "TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 0), "TLS_RSA_WITH_AES_128_CBC_SHA", 0);
        f35248d.put("TLS_RSA_WITH_AES_128_CBC_SHA", a5);
        f35250f = a5;
        f35248d.put("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", xn.a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", new yn("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", i4), "TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 0));
        yn a6 = xn.a("TLS_DH_anon_WITH_AES_128_CBC_SHA", new yn("TLS_DH_anon_WITH_AES_128_CBC_SHA", i4), "TLS_RSA_WITH_AES_256_CBC_SHA", 0);
        f35248d.put("TLS_RSA_WITH_AES_256_CBC_SHA", a6);
        f35251g = a6;
        f35248d.put("TLS_DH_anon_WITH_AES_256_CBC_SHA256", xn.a("TLS_DH_anon_WITH_AES_128_CBC_SHA256", xn.a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", xn.a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", xn.a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", xn.a("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", xn.a("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", xn.a("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", xn.a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", xn.a("TLS_RSA_WITH_AES_256_CBC_SHA256", xn.a("TLS_RSA_WITH_AES_128_CBC_SHA256", xn.a("TLS_RSA_WITH_NULL_SHA256", xn.a("TLS_DH_anon_WITH_AES_256_CBC_SHA", xn.a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", xn.a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", new yn("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", i4), "TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 0), "TLS_DH_anon_WITH_AES_256_CBC_SHA", 0), "TLS_RSA_WITH_NULL_SHA256", 0), "TLS_RSA_WITH_AES_128_CBC_SHA256", 0), "TLS_RSA_WITH_AES_256_CBC_SHA256", 0), "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 0), "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 0), "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 0), "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 0), "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 0), "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 0), "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 0), "TLS_DH_anon_WITH_AES_128_CBC_SHA256", 0), "TLS_DH_anon_WITH_AES_256_CBC_SHA256", 0));
        yn a7 = xn.a("TLS_RSA_WITH_SEED_CBC_SHA", xn.a("TLS_PSK_WITH_AES_256_CBC_SHA", xn.a("TLS_PSK_WITH_AES_128_CBC_SHA", xn.a("TLS_PSK_WITH_3DES_EDE_CBC_SHA", xn.a("TLS_PSK_WITH_RC4_128_SHA", xn.a("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", xn.a("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", xn.a("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", new yn("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", i4), "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 0), "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 0), "TLS_PSK_WITH_RC4_128_SHA", 0), "TLS_PSK_WITH_3DES_EDE_CBC_SHA", 0), "TLS_PSK_WITH_AES_128_CBC_SHA", 0), "TLS_PSK_WITH_AES_256_CBC_SHA", 0), "TLS_RSA_WITH_SEED_CBC_SHA", 0), "TLS_RSA_WITH_AES_128_GCM_SHA256", 0);
        f35248d.put("TLS_RSA_WITH_AES_128_GCM_SHA256", a7);
        f35252h = a7;
        yn ynVar = new yn("TLS_RSA_WITH_AES_256_GCM_SHA384", i4);
        f35248d.put("TLS_RSA_WITH_AES_256_GCM_SHA384", ynVar);
        f35253i = ynVar;
        f35248d.put("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", xn.a("TLS_DH_anon_WITH_AES_256_GCM_SHA384", xn.a("TLS_DH_anon_WITH_AES_128_GCM_SHA256", xn.a("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", xn.a("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", xn.a("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", xn.a("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", new yn("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", i4), "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 0), "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 0), "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 0), "TLS_DH_anon_WITH_AES_128_GCM_SHA256", 0), "TLS_DH_anon_WITH_AES_256_GCM_SHA384", 0), "TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 0));
        f35248d.put("TLS_ECDHE_RSA_WITH_NULL_SHA", xn.a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", xn.a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", xn.a("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", xn.a("TLS_ECDH_RSA_WITH_RC4_128_SHA", xn.a("TLS_ECDH_RSA_WITH_NULL_SHA", xn.a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", xn.a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", xn.a("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", xn.a("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", xn.a("TLS_ECDHE_ECDSA_WITH_NULL_SHA", xn.a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", xn.a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", xn.a("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", xn.a("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", xn.a("TLS_ECDH_ECDSA_WITH_NULL_SHA", xn.a("TLS_FALLBACK_SCSV", new yn("TLS_FALLBACK_SCSV", i4), "TLS_ECDH_ECDSA_WITH_NULL_SHA", 0), "TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 0), "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 0), "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 0), "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 0), "TLS_ECDHE_ECDSA_WITH_NULL_SHA", 0), "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 0), "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 0), "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 0), "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 0), "TLS_ECDH_RSA_WITH_NULL_SHA", 0), "TLS_ECDH_RSA_WITH_RC4_128_SHA", 0), "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 0), "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 0), "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 0), "TLS_ECDHE_RSA_WITH_NULL_SHA", 0));
        yn a8 = xn.a("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", xn.a("TLS_ECDHE_RSA_WITH_RC4_128_SHA", new yn("TLS_ECDHE_RSA_WITH_RC4_128_SHA", i4), "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 0), "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 0);
        f35248d.put("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", a8);
        f35254j = a8;
        yn ynVar2 = new yn("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", i4);
        f35248d.put("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", ynVar2);
        f35255k = ynVar2;
        f35248d.put("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", xn.a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", xn.a("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", xn.a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", xn.a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", xn.a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", xn.a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", xn.a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", xn.a("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", xn.a("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", xn.a("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", xn.a("TLS_ECDH_anon_WITH_RC4_128_SHA", xn.a("TLS_ECDH_anon_WITH_NULL_SHA", new yn("TLS_ECDH_anon_WITH_NULL_SHA", i4), "TLS_ECDH_anon_WITH_RC4_128_SHA", 0), "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 0), "TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 0), "TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 0), "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 0), "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 0), "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 0), "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 0), "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 0), "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 0), "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 0), "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 0));
        yn ynVar3 = new yn("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", i4);
        f35248d.put("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", ynVar3);
        f35256l = ynVar3;
        yn ynVar4 = new yn("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", i4);
        f35248d.put("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", ynVar4);
        f35257m = ynVar4;
        yn a9 = xn.a("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", xn.a("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", new yn("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", i4), "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 0), "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 0);
        f35248d.put("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", a9);
        f35258n = a9;
        yn ynVar5 = new yn("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", i4);
        f35248d.put("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", ynVar5);
        f35259o = ynVar5;
        yn a10 = xn.a("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", xn.a("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", xn.a("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", xn.a("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", new yn("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", i4), "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 0), "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 0), "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 0), "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 0);
        f35248d.put("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", a10);
        f35260p = a10;
        yn ynVar6 = new yn("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", i4);
        f35248d.put("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", ynVar6);
        f35261q = ynVar6;
        yn a11 = xn.a("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", xn.a("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", new yn("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", i4), "TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 0), "TLS_AES_128_GCM_SHA256", 0);
        f35248d.put("TLS_AES_128_GCM_SHA256", a11);
        f35262r = a11;
        yn ynVar7 = new yn("TLS_AES_256_GCM_SHA384", i4);
        f35248d.put("TLS_AES_256_GCM_SHA384", ynVar7);
        f35263s = ynVar7;
        yn ynVar8 = new yn("TLS_CHACHA20_POLY1305_SHA256", i4);
        f35248d.put("TLS_CHACHA20_POLY1305_SHA256", ynVar8);
        f35264t = ynVar8;
        f35248d.put("TLS_AES_128_CCM_8_SHA256", xn.a("TLS_AES_128_CCM_SHA256", new yn("TLS_AES_128_CCM_SHA256", i4), "TLS_AES_128_CCM_8_SHA256", 0));
    }

    private yn(String str) {
        this.f35265a = str;
    }

    @NotNull
    public final String c() {
        return this.f35265a;
    }

    @NotNull
    public final String toString() {
        return this.f35265a;
    }

    public /* synthetic */ yn(String str, int i4) {
        this(str);
    }
}
