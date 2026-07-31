package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C2360y7;
import com.yandex.mobile.ads.impl.cf0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class rc1<T> implements pc1<T> {

    /* renamed from: k, reason: collision with root package name */
    private static final long f31106k = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2286v2 f31107a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final uq1<T> f31108b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final i80 f31109c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ty0 f31110d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final pr1 f31111e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final wr f31112f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final uf0 f31113g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final cs0 f31114h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final C1876dd f31115i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final C2383z7 f31116j;

    public rc1(@NotNull C2286v2 adConfiguration, @NotNull uq1<T> responseBodyParser, @NotNull i80 falseClickParser, @NotNull ty0 mediationDataParser, @NotNull pr1 rewardDataParser, @NotNull wr contentTypeHeaderParser, @NotNull uf0 htmlAdImpressionDataParser, @NotNull cs0 localeParser, @NotNull C1876dd analyticsParametersParser, @NotNull C2383z7 adResponseAbExperimentDataParser) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(responseBodyParser, "responseBodyParser");
        Intrinsics.checkNotNullParameter(falseClickParser, "falseClickParser");
        Intrinsics.checkNotNullParameter(mediationDataParser, "mediationDataParser");
        Intrinsics.checkNotNullParameter(rewardDataParser, "rewardDataParser");
        Intrinsics.checkNotNullParameter(contentTypeHeaderParser, "contentTypeHeaderParser");
        Intrinsics.checkNotNullParameter(htmlAdImpressionDataParser, "htmlAdImpressionDataParser");
        Intrinsics.checkNotNullParameter(localeParser, "localeParser");
        Intrinsics.checkNotNullParameter(analyticsParametersParser, "analyticsParametersParser");
        Intrinsics.checkNotNullParameter(adResponseAbExperimentDataParser, "adResponseAbExperimentDataParser");
        this.f31107a = adConfiguration;
        this.f31108b = responseBodyParser;
        this.f31109c = falseClickParser;
        this.f31110d = mediationDataParser;
        this.f31111e = rewardDataParser;
        this.f31112f = contentTypeHeaderParser;
        this.f31113g = htmlAdImpressionDataParser;
        this.f31114h = localeParser;
        this.f31115i = analyticsParametersParser;
        this.f31116j = adResponseAbExperimentDataParser;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer b(String value) {
        int parseInt;
        Intrinsics.checkNotNullParameter(value, "value");
        int i4 = C2362y9.f34935b;
        if (value != null) {
            try {
                parseInt = Integer.parseInt(value);
            } catch (NumberFormatException unused) {
            }
            return Integer.valueOf(Math.min(parseInt, 100));
        }
        parseInt = 0;
        return Integer.valueOf(Math.min(parseInt, 100));
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x016f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x011f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x022f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0227 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.yandex.mobile.ads.impl.pc1
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C2360y7<T> a(@NotNull pq1 networkResponse, @NotNull Map<String, String> responseHeaders, @NotNull gs responseAdType) {
        Integer valueOf;
        String a4;
        Integer valueOf2;
        int length;
        int i4;
        Locale locale;
        String a5;
        Long valueOf3;
        boolean parseBoolean;
        Intrinsics.checkNotNullParameter(networkResponse, "networkResponse");
        Intrinsics.checkNotNullParameter(responseHeaders, "headers");
        Intrinsics.checkNotNullParameter(responseAdType, "responseAdType");
        C2360y7.a aVar = new C2360y7.a();
        aVar.f(this.f31107a.c());
        aVar.a(responseAdType);
        int b4 = cf0.b(responseHeaders, bh0.f23776c);
        int b5 = cf0.b(responseHeaders, bh0.f23778d);
        aVar.e(b4);
        aVar.b(b5);
        String a6 = cf0.a(responseHeaders, bh0.f23764Q);
        String a7 = cf0.a(responseHeaders, bh0.f23765R);
        aVar.e(a6);
        aVar.k(a7);
        aVar.b(cf0.a(responseHeaders, bh0.f23784g));
        String analyticsParametersValue = cf0.a(responseHeaders, bh0.f23769V);
        if (analyticsParametersValue != null) {
            this.f31115i.getClass();
            Intrinsics.checkNotNullParameter(analyticsParametersValue, "analyticsParametersValue");
            HashMap hashMap = new HashMap();
            try {
                JSONObject jSONObject = new JSONObject(analyticsParametersValue);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object obj = jSONObject.get(next);
                    Intrinsics.checkNotNull(next);
                    Intrinsics.checkNotNull(obj);
                    hashMap.put(next, obj);
                }
            } catch (Throwable unused) {
            }
            aVar.a(hashMap);
        }
        vy1 q4 = this.f31107a.q();
        aVar.a(q4 != null ? q4.a() : null);
        aVar.c(cf0.c(responseHeaders, bh0.f23786h));
        aVar.f(cf0.c(responseHeaders, bh0.f23796q));
        this.f31116j.getClass();
        aVar.a(C2383z7.a(responseHeaders));
        aVar.a(cf0.a(responseHeaders, bh0.f23799t, new cf0.a() { // from class: com.yandex.mobile.ads.impl.Lc
            @Override // com.yandex.mobile.ads.impl.cf0.a
            public final Object a(String str) {
                Long a8;
                a8 = rc1.a(str);
                return a8;
            }
        }));
        aVar.d(cf0.a(responseHeaders, bh0.f23762O, new cf0.a() { // from class: com.yandex.mobile.ads.impl.Mc
            @Override // com.yandex.mobile.ads.impl.cf0.a
            public final Object a(String str) {
                Integer b6;
                b6 = rc1.b(str);
                return b6;
            }
        }));
        aVar.e(cf0.c(responseHeaders, bh0.f23788i));
        bh0 httpHeader = bh0.f23789j;
        Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
        Intrinsics.checkNotNullParameter(httpHeader, "httpHeader");
        String a8 = cf0.a(responseHeaders, httpHeader);
        int i5 = C2362y9.f34935b;
        if (a8 != null) {
            try {
                valueOf = Integer.valueOf(a8);
            } catch (NumberFormatException unused2) {
            }
            aVar.a(valueOf == null ? Long.valueOf(valueOf.intValue() * f31106k) : null);
            bh0 httpHeader2 = bh0.f23750C;
            int i6 = cf0.f24191b;
            Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
            Intrinsics.checkNotNullParameter(httpHeader2, "httpHeader");
            a4 = cf0.a(responseHeaders, httpHeader2);
            int i7 = C2362y9.f34935b;
            if (a4 != null) {
                try {
                    valueOf2 = Integer.valueOf(a4);
                } catch (NumberFormatException unused3) {
                }
                aVar.b(valueOf2 != null ? Long.valueOf(valueOf2.intValue() * f31106k) : null);
                aVar.g(cf0.a(responseHeaders, bh0.f23794o));
                this.f31114h.getClass();
                Intrinsics.checkNotNullParameter(responseHeaders, "headers");
                String a9 = cf0.a(responseHeaders, bh0.f23795p);
                Locale[] availableLocales = Locale.getAvailableLocales();
                Intrinsics.checkNotNull(availableLocales);
                length = availableLocales.length;
                i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        locale = null;
                        break;
                    }
                    if (Intrinsics.areEqual(availableLocales[i4].getLanguage(), a9)) {
                        locale = new Locale(a9);
                        break;
                    }
                    i4++;
                }
                aVar.a(locale);
                aVar.b(cf0.c(responseHeaders, bh0.f23793n));
                aVar.f(cf0.b(responseHeaders, bh0.f23804y));
                aVar.c(cf0.b(responseHeaders, bh0.f23805z));
                aVar.d(cf0.b(responseHeaders, bh0.f23748A));
                aVar.a(cf0.b(responseHeaders, bh0.f23753F));
                aVar.l(cf0.a(responseHeaders, bh0.f23803x));
                bh0 httpHeader3 = bh0.f23791l;
                Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
                Intrinsics.checkNotNullParameter(httpHeader3, "httpHeader");
                String a10 = cf0.a(responseHeaders, httpHeader3);
                aVar.i(a10 == null ? false : Boolean.parseBoolean(a10));
                aVar.h(cf0.a(responseHeaders, bh0.f23772Y));
                aVar.j(cf0.a(responseHeaders, bh0.f23773Z));
                aVar.i(cf0.a(responseHeaders, bh0.f23774a0));
                aVar.c(cf0.a(responseHeaders, bh0.f23754G));
                this.f31112f.getClass();
                aVar.a(wr.a(responseHeaders));
                aVar.a(this.f31111e.a(networkResponse));
                this.f31109c.getClass();
                Intrinsics.checkNotNullParameter(networkResponse, "networkResponse");
                Map<String, String> responseHeaders2 = networkResponse.b();
                bh0 header = bh0.f23801v;
                Intrinsics.checkNotNullParameter(responseHeaders2, "responseHeaders");
                Intrinsics.checkNotNullParameter(header, "header");
                String str = (String) CollectionsKt.firstOrNull((List) cf0.c(responseHeaders2, header));
                bh0 httpHeader4 = bh0.f23802w;
                Intrinsics.checkNotNullParameter(responseHeaders2, "responseHeaders");
                Intrinsics.checkNotNullParameter(httpHeader4, "httpHeader");
                a5 = cf0.a(responseHeaders2, httpHeader4);
                if (a5 != null) {
                    try {
                        valueOf3 = Long.valueOf(a5);
                    } catch (NumberFormatException unused4) {
                    }
                    aVar.a((str != null || valueOf3 == null) ? null : new c80(str, valueOf3.longValue()));
                    this.f31113g.getClass();
                    Intrinsics.checkNotNullParameter(responseHeaders, "headers");
                    String a11 = cf0.a(responseHeaders, bh0.f23790k);
                    aVar.a((a11 != null || a11.length() <= 0) ? null : new C1795a4(a11));
                    bh0 httpHeader5 = bh0.f23755H;
                    Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
                    Intrinsics.checkNotNullParameter(httpHeader5, "httpHeader");
                    String a12 = cf0.a(responseHeaders, httpHeader5);
                    aVar.j(a12 != null ? false : Boolean.parseBoolean(a12));
                    bh0 httpHeader6 = bh0.f23763P;
                    Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
                    Intrinsics.checkNotNullParameter(httpHeader6, "httpHeader");
                    String a13 = cf0.a(responseHeaders, httpHeader6);
                    aVar.f(a13 != null ? false : Boolean.parseBoolean(a13));
                    bh0 httpHeader7 = bh0.f23798s;
                    Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
                    Intrinsics.checkNotNullParameter(httpHeader7, "httpHeader");
                    String a14 = cf0.a(responseHeaders, httpHeader7);
                    parseBoolean = a14 != null ? false : Boolean.parseBoolean(a14);
                    aVar.e(parseBoolean);
                    if (parseBoolean) {
                        aVar.a((C2360y7.a) this.f31108b.a(networkResponse));
                    } else {
                        aVar.a(this.f31110d.a(networkResponse));
                    }
                    aVar.d(cf0.a(responseHeaders, bh0.f23766S));
                    aVar.a(cf0.a(responseHeaders, bh0.f23782f));
                    bh0 httpHeader8 = bh0.f23770W;
                    Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
                    Intrinsics.checkNotNullParameter(httpHeader8, "httpHeader");
                    String a15 = cf0.a(responseHeaders, httpHeader8);
                    aVar.c(a15 != null ? false : Boolean.parseBoolean(a15));
                    String a16 = cf0.a(responseHeaders, bh0.f23759L);
                    aVar.a(a16 != null ? new aa0(a16) : null);
                    bh0 httpHeader9 = bh0.f23792m;
                    Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
                    Intrinsics.checkNotNullParameter(httpHeader9, "httpHeader");
                    String a17 = cf0.a(responseHeaders, httpHeader9);
                    aVar.h(a17 != null ? true : Boolean.parseBoolean(a17));
                    bh0 httpHeader10 = bh0.f23777c0;
                    Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
                    Intrinsics.checkNotNullParameter(httpHeader10, "httpHeader");
                    String a18 = cf0.a(responseHeaders, httpHeader10);
                    aVar.g(a18 != null ? Boolean.parseBoolean(a18) : false);
                    bh0 httpHeader11 = bh0.f23779d0;
                    Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
                    Intrinsics.checkNotNullParameter(httpHeader11, "httpHeader");
                    String a19 = cf0.a(responseHeaders, httpHeader11);
                    aVar.a(a19 != null ? true : Boolean.parseBoolean(a19));
                    bh0 httpHeader12 = bh0.f23781e0;
                    Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
                    Intrinsics.checkNotNullParameter(httpHeader12, "httpHeader");
                    String a20 = cf0.a(responseHeaders, httpHeader12);
                    aVar.d(a20 != null ? true : Boolean.parseBoolean(a20));
                    bh0 httpHeader13 = bh0.f23783f0;
                    Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
                    Intrinsics.checkNotNullParameter(httpHeader13, "httpHeader");
                    String a21 = cf0.a(responseHeaders, httpHeader13);
                    aVar.b(a21 != null ? true : Boolean.parseBoolean(a21));
                    bh0 httpHeader14 = bh0.f23785g0;
                    Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
                    Intrinsics.checkNotNullParameter(httpHeader14, "httpHeader");
                    String a22 = cf0.a(responseHeaders, httpHeader14);
                    aVar.k(a22 != null ? Boolean.parseBoolean(a22) : true);
                    return aVar.a();
                }
                valueOf3 = null;
                aVar.a((str != null || valueOf3 == null) ? null : new c80(str, valueOf3.longValue()));
                this.f31113g.getClass();
                Intrinsics.checkNotNullParameter(responseHeaders, "headers");
                String a112 = cf0.a(responseHeaders, bh0.f23790k);
                aVar.a((a112 != null || a112.length() <= 0) ? null : new C1795a4(a112));
                bh0 httpHeader52 = bh0.f23755H;
                Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
                Intrinsics.checkNotNullParameter(httpHeader52, "httpHeader");
                String a122 = cf0.a(responseHeaders, httpHeader52);
                aVar.j(a122 != null ? false : Boolean.parseBoolean(a122));
                bh0 httpHeader62 = bh0.f23763P;
                Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
                Intrinsics.checkNotNullParameter(httpHeader62, "httpHeader");
                String a132 = cf0.a(responseHeaders, httpHeader62);
                aVar.f(a132 != null ? false : Boolean.parseBoolean(a132));
                bh0 httpHeader72 = bh0.f23798s;
                Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
                Intrinsics.checkNotNullParameter(httpHeader72, "httpHeader");
                String a142 = cf0.a(responseHeaders, httpHeader72);
                if (a142 != null) {
                }
                aVar.e(parseBoolean);
                if (parseBoolean) {
                }
                aVar.d(cf0.a(responseHeaders, bh0.f23766S));
                aVar.a(cf0.a(responseHeaders, bh0.f23782f));
                bh0 httpHeader82 = bh0.f23770W;
                Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
                Intrinsics.checkNotNullParameter(httpHeader82, "httpHeader");
                String a152 = cf0.a(responseHeaders, httpHeader82);
                aVar.c(a152 != null ? false : Boolean.parseBoolean(a152));
                String a162 = cf0.a(responseHeaders, bh0.f23759L);
                aVar.a(a162 != null ? new aa0(a162) : null);
                bh0 httpHeader92 = bh0.f23792m;
                Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
                Intrinsics.checkNotNullParameter(httpHeader92, "httpHeader");
                String a172 = cf0.a(responseHeaders, httpHeader92);
                aVar.h(a172 != null ? true : Boolean.parseBoolean(a172));
                bh0 httpHeader102 = bh0.f23777c0;
                Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
                Intrinsics.checkNotNullParameter(httpHeader102, "httpHeader");
                String a182 = cf0.a(responseHeaders, httpHeader102);
                aVar.g(a182 != null ? Boolean.parseBoolean(a182) : false);
                bh0 httpHeader112 = bh0.f23779d0;
                Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
                Intrinsics.checkNotNullParameter(httpHeader112, "httpHeader");
                String a192 = cf0.a(responseHeaders, httpHeader112);
                aVar.a(a192 != null ? true : Boolean.parseBoolean(a192));
                bh0 httpHeader122 = bh0.f23781e0;
                Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
                Intrinsics.checkNotNullParameter(httpHeader122, "httpHeader");
                String a202 = cf0.a(responseHeaders, httpHeader122);
                aVar.d(a202 != null ? true : Boolean.parseBoolean(a202));
                bh0 httpHeader132 = bh0.f23783f0;
                Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
                Intrinsics.checkNotNullParameter(httpHeader132, "httpHeader");
                String a212 = cf0.a(responseHeaders, httpHeader132);
                aVar.b(a212 != null ? true : Boolean.parseBoolean(a212));
                bh0 httpHeader142 = bh0.f23785g0;
                Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
                Intrinsics.checkNotNullParameter(httpHeader142, "httpHeader");
                String a222 = cf0.a(responseHeaders, httpHeader142);
                aVar.k(a222 != null ? Boolean.parseBoolean(a222) : true);
                return aVar.a();
            }
            valueOf2 = null;
            aVar.b(valueOf2 != null ? Long.valueOf(valueOf2.intValue() * f31106k) : null);
            aVar.g(cf0.a(responseHeaders, bh0.f23794o));
            this.f31114h.getClass();
            Intrinsics.checkNotNullParameter(responseHeaders, "headers");
            String a92 = cf0.a(responseHeaders, bh0.f23795p);
            Locale[] availableLocales2 = Locale.getAvailableLocales();
            Intrinsics.checkNotNull(availableLocales2);
            length = availableLocales2.length;
            i4 = 0;
            while (true) {
                if (i4 >= length) {
                }
                i4++;
            }
            aVar.a(locale);
            aVar.b(cf0.c(responseHeaders, bh0.f23793n));
            aVar.f(cf0.b(responseHeaders, bh0.f23804y));
            aVar.c(cf0.b(responseHeaders, bh0.f23805z));
            aVar.d(cf0.b(responseHeaders, bh0.f23748A));
            aVar.a(cf0.b(responseHeaders, bh0.f23753F));
            aVar.l(cf0.a(responseHeaders, bh0.f23803x));
            bh0 httpHeader32 = bh0.f23791l;
            Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
            Intrinsics.checkNotNullParameter(httpHeader32, "httpHeader");
            String a102 = cf0.a(responseHeaders, httpHeader32);
            aVar.i(a102 == null ? false : Boolean.parseBoolean(a102));
            aVar.h(cf0.a(responseHeaders, bh0.f23772Y));
            aVar.j(cf0.a(responseHeaders, bh0.f23773Z));
            aVar.i(cf0.a(responseHeaders, bh0.f23774a0));
            aVar.c(cf0.a(responseHeaders, bh0.f23754G));
            this.f31112f.getClass();
            aVar.a(wr.a(responseHeaders));
            aVar.a(this.f31111e.a(networkResponse));
            this.f31109c.getClass();
            Intrinsics.checkNotNullParameter(networkResponse, "networkResponse");
            Map<String, String> responseHeaders22 = networkResponse.b();
            bh0 header2 = bh0.f23801v;
            Intrinsics.checkNotNullParameter(responseHeaders22, "responseHeaders");
            Intrinsics.checkNotNullParameter(header2, "header");
            String str2 = (String) CollectionsKt.firstOrNull((List) cf0.c(responseHeaders22, header2));
            bh0 httpHeader42 = bh0.f23802w;
            Intrinsics.checkNotNullParameter(responseHeaders22, "responseHeaders");
            Intrinsics.checkNotNullParameter(httpHeader42, "httpHeader");
            a5 = cf0.a(responseHeaders22, httpHeader42);
            if (a5 != null) {
            }
            valueOf3 = null;
            aVar.a((str2 != null || valueOf3 == null) ? null : new c80(str2, valueOf3.longValue()));
            this.f31113g.getClass();
            Intrinsics.checkNotNullParameter(responseHeaders, "headers");
            String a1122 = cf0.a(responseHeaders, bh0.f23790k);
            aVar.a((a1122 != null || a1122.length() <= 0) ? null : new C1795a4(a1122));
            bh0 httpHeader522 = bh0.f23755H;
            Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
            Intrinsics.checkNotNullParameter(httpHeader522, "httpHeader");
            String a1222 = cf0.a(responseHeaders, httpHeader522);
            aVar.j(a1222 != null ? false : Boolean.parseBoolean(a1222));
            bh0 httpHeader622 = bh0.f23763P;
            Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
            Intrinsics.checkNotNullParameter(httpHeader622, "httpHeader");
            String a1322 = cf0.a(responseHeaders, httpHeader622);
            aVar.f(a1322 != null ? false : Boolean.parseBoolean(a1322));
            bh0 httpHeader722 = bh0.f23798s;
            Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
            Intrinsics.checkNotNullParameter(httpHeader722, "httpHeader");
            String a1422 = cf0.a(responseHeaders, httpHeader722);
            if (a1422 != null) {
            }
            aVar.e(parseBoolean);
            if (parseBoolean) {
            }
            aVar.d(cf0.a(responseHeaders, bh0.f23766S));
            aVar.a(cf0.a(responseHeaders, bh0.f23782f));
            bh0 httpHeader822 = bh0.f23770W;
            Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
            Intrinsics.checkNotNullParameter(httpHeader822, "httpHeader");
            String a1522 = cf0.a(responseHeaders, httpHeader822);
            aVar.c(a1522 != null ? false : Boolean.parseBoolean(a1522));
            String a1622 = cf0.a(responseHeaders, bh0.f23759L);
            aVar.a(a1622 != null ? new aa0(a1622) : null);
            bh0 httpHeader922 = bh0.f23792m;
            Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
            Intrinsics.checkNotNullParameter(httpHeader922, "httpHeader");
            String a1722 = cf0.a(responseHeaders, httpHeader922);
            aVar.h(a1722 != null ? true : Boolean.parseBoolean(a1722));
            bh0 httpHeader1022 = bh0.f23777c0;
            Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
            Intrinsics.checkNotNullParameter(httpHeader1022, "httpHeader");
            String a1822 = cf0.a(responseHeaders, httpHeader1022);
            aVar.g(a1822 != null ? Boolean.parseBoolean(a1822) : false);
            bh0 httpHeader1122 = bh0.f23779d0;
            Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
            Intrinsics.checkNotNullParameter(httpHeader1122, "httpHeader");
            String a1922 = cf0.a(responseHeaders, httpHeader1122);
            aVar.a(a1922 != null ? true : Boolean.parseBoolean(a1922));
            bh0 httpHeader1222 = bh0.f23781e0;
            Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
            Intrinsics.checkNotNullParameter(httpHeader1222, "httpHeader");
            String a2022 = cf0.a(responseHeaders, httpHeader1222);
            aVar.d(a2022 != null ? true : Boolean.parseBoolean(a2022));
            bh0 httpHeader1322 = bh0.f23783f0;
            Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
            Intrinsics.checkNotNullParameter(httpHeader1322, "httpHeader");
            String a2122 = cf0.a(responseHeaders, httpHeader1322);
            aVar.b(a2122 != null ? true : Boolean.parseBoolean(a2122));
            bh0 httpHeader1422 = bh0.f23785g0;
            Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
            Intrinsics.checkNotNullParameter(httpHeader1422, "httpHeader");
            String a2222 = cf0.a(responseHeaders, httpHeader1422);
            aVar.k(a2222 != null ? Boolean.parseBoolean(a2222) : true);
            return aVar.a();
        }
        valueOf = null;
        aVar.a(valueOf == null ? Long.valueOf(valueOf.intValue() * f31106k) : null);
        bh0 httpHeader22 = bh0.f23750C;
        int i62 = cf0.f24191b;
        Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
        Intrinsics.checkNotNullParameter(httpHeader22, "httpHeader");
        a4 = cf0.a(responseHeaders, httpHeader22);
        int i72 = C2362y9.f34935b;
        if (a4 != null) {
        }
        valueOf2 = null;
        aVar.b(valueOf2 != null ? Long.valueOf(valueOf2.intValue() * f31106k) : null);
        aVar.g(cf0.a(responseHeaders, bh0.f23794o));
        this.f31114h.getClass();
        Intrinsics.checkNotNullParameter(responseHeaders, "headers");
        String a922 = cf0.a(responseHeaders, bh0.f23795p);
        Locale[] availableLocales22 = Locale.getAvailableLocales();
        Intrinsics.checkNotNull(availableLocales22);
        length = availableLocales22.length;
        i4 = 0;
        while (true) {
            if (i4 >= length) {
            }
            i4++;
        }
        aVar.a(locale);
        aVar.b(cf0.c(responseHeaders, bh0.f23793n));
        aVar.f(cf0.b(responseHeaders, bh0.f23804y));
        aVar.c(cf0.b(responseHeaders, bh0.f23805z));
        aVar.d(cf0.b(responseHeaders, bh0.f23748A));
        aVar.a(cf0.b(responseHeaders, bh0.f23753F));
        aVar.l(cf0.a(responseHeaders, bh0.f23803x));
        bh0 httpHeader322 = bh0.f23791l;
        Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
        Intrinsics.checkNotNullParameter(httpHeader322, "httpHeader");
        String a1022 = cf0.a(responseHeaders, httpHeader322);
        aVar.i(a1022 == null ? false : Boolean.parseBoolean(a1022));
        aVar.h(cf0.a(responseHeaders, bh0.f23772Y));
        aVar.j(cf0.a(responseHeaders, bh0.f23773Z));
        aVar.i(cf0.a(responseHeaders, bh0.f23774a0));
        aVar.c(cf0.a(responseHeaders, bh0.f23754G));
        this.f31112f.getClass();
        aVar.a(wr.a(responseHeaders));
        aVar.a(this.f31111e.a(networkResponse));
        this.f31109c.getClass();
        Intrinsics.checkNotNullParameter(networkResponse, "networkResponse");
        Map<String, String> responseHeaders222 = networkResponse.b();
        bh0 header22 = bh0.f23801v;
        Intrinsics.checkNotNullParameter(responseHeaders222, "responseHeaders");
        Intrinsics.checkNotNullParameter(header22, "header");
        String str22 = (String) CollectionsKt.firstOrNull((List) cf0.c(responseHeaders222, header22));
        bh0 httpHeader422 = bh0.f23802w;
        Intrinsics.checkNotNullParameter(responseHeaders222, "responseHeaders");
        Intrinsics.checkNotNullParameter(httpHeader422, "httpHeader");
        a5 = cf0.a(responseHeaders222, httpHeader422);
        if (a5 != null) {
        }
        valueOf3 = null;
        aVar.a((str22 != null || valueOf3 == null) ? null : new c80(str22, valueOf3.longValue()));
        this.f31113g.getClass();
        Intrinsics.checkNotNullParameter(responseHeaders, "headers");
        String a11222 = cf0.a(responseHeaders, bh0.f23790k);
        aVar.a((a11222 != null || a11222.length() <= 0) ? null : new C1795a4(a11222));
        bh0 httpHeader5222 = bh0.f23755H;
        Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
        Intrinsics.checkNotNullParameter(httpHeader5222, "httpHeader");
        String a12222 = cf0.a(responseHeaders, httpHeader5222);
        aVar.j(a12222 != null ? false : Boolean.parseBoolean(a12222));
        bh0 httpHeader6222 = bh0.f23763P;
        Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
        Intrinsics.checkNotNullParameter(httpHeader6222, "httpHeader");
        String a13222 = cf0.a(responseHeaders, httpHeader6222);
        aVar.f(a13222 != null ? false : Boolean.parseBoolean(a13222));
        bh0 httpHeader7222 = bh0.f23798s;
        Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
        Intrinsics.checkNotNullParameter(httpHeader7222, "httpHeader");
        String a14222 = cf0.a(responseHeaders, httpHeader7222);
        if (a14222 != null) {
        }
        aVar.e(parseBoolean);
        if (parseBoolean) {
        }
        aVar.d(cf0.a(responseHeaders, bh0.f23766S));
        aVar.a(cf0.a(responseHeaders, bh0.f23782f));
        bh0 httpHeader8222 = bh0.f23770W;
        Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
        Intrinsics.checkNotNullParameter(httpHeader8222, "httpHeader");
        String a15222 = cf0.a(responseHeaders, httpHeader8222);
        aVar.c(a15222 != null ? false : Boolean.parseBoolean(a15222));
        String a16222 = cf0.a(responseHeaders, bh0.f23759L);
        aVar.a(a16222 != null ? new aa0(a16222) : null);
        bh0 httpHeader9222 = bh0.f23792m;
        Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
        Intrinsics.checkNotNullParameter(httpHeader9222, "httpHeader");
        String a17222 = cf0.a(responseHeaders, httpHeader9222);
        aVar.h(a17222 != null ? true : Boolean.parseBoolean(a17222));
        bh0 httpHeader10222 = bh0.f23777c0;
        Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
        Intrinsics.checkNotNullParameter(httpHeader10222, "httpHeader");
        String a18222 = cf0.a(responseHeaders, httpHeader10222);
        aVar.g(a18222 != null ? Boolean.parseBoolean(a18222) : false);
        bh0 httpHeader11222 = bh0.f23779d0;
        Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
        Intrinsics.checkNotNullParameter(httpHeader11222, "httpHeader");
        String a19222 = cf0.a(responseHeaders, httpHeader11222);
        aVar.a(a19222 != null ? true : Boolean.parseBoolean(a19222));
        bh0 httpHeader12222 = bh0.f23781e0;
        Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
        Intrinsics.checkNotNullParameter(httpHeader12222, "httpHeader");
        String a20222 = cf0.a(responseHeaders, httpHeader12222);
        aVar.d(a20222 != null ? true : Boolean.parseBoolean(a20222));
        bh0 httpHeader13222 = bh0.f23783f0;
        Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
        Intrinsics.checkNotNullParameter(httpHeader13222, "httpHeader");
        String a21222 = cf0.a(responseHeaders, httpHeader13222);
        aVar.b(a21222 != null ? true : Boolean.parseBoolean(a21222));
        bh0 httpHeader14222 = bh0.f23785g0;
        Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
        Intrinsics.checkNotNullParameter(httpHeader14222, "httpHeader");
        String a22222 = cf0.a(responseHeaders, httpHeader14222);
        aVar.k(a22222 != null ? Boolean.parseBoolean(a22222) : true);
        return aVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long a(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        int i4 = C2362y9.f34935b;
        if (value != null) {
            try {
                return Long.valueOf(value);
            } catch (NumberFormatException unused) {
            }
        }
        return 0L;
    }
}
