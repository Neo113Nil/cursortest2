package com.anythink.basead.b.b;

import android.text.TextUtils;
import android.util.Log;
import com.anythink.basead.b.b.a;
import com.anythink.core.basead.ui.web.WebLandPageActivity;
import com.anythink.core.common.d.s;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.ay;
import com.anythink.core.common.h.bk;
import com.anythink.core.common.h.r;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.h.y;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Objects;

/* loaded from: classes.dex */
public class c extends com.anythink.basead.b.b.a {

    /* renamed from: h, reason: collision with root package name */
    int f5920h;
    boolean i;

    /* renamed from: j, reason: collision with root package name */
    a f5921j;

    /* renamed from: k, reason: collision with root package name */
    com.anythink.basead.d.j f5922k;

    /* renamed from: l, reason: collision with root package name */
    d f5923l;

    /* renamed from: m, reason: collision with root package name */
    private final String f5924m;

    /* renamed from: n, reason: collision with root package name */
    private final int f5925n;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        long f5926a;

        /* renamed from: b, reason: collision with root package name */
        long f5927b;

        /* renamed from: c, reason: collision with root package name */
        String f5928c;

        public final boolean a() {
            return System.currentTimeMillis() - this.f5926a <= this.f5927b;
        }
    }

    public c(a.C0005a c0005a) {
        super(c0005a);
        this.f5924m = "c";
        this.f5925n = 10;
        this.f5922k = null;
        w wVar = this.f5901c;
        if (wVar != null) {
            this.f5920h = wVar.K();
            x xVar = this.f5902d;
            if (xVar != null) {
                w wVar2 = this.f5901c;
                y yVar = xVar.f14325o;
                boolean z8 = false;
                if (!(wVar2 instanceof r) ? !(!(wVar2 instanceof ay) || ((ay) wVar2).d() != 1) : !(!(yVar instanceof bk) || ((bk) yVar).b() != 1)) {
                    z8 = true;
                }
                this.i = z8;
            }
        }
    }

    private String b(String str, com.anythink.basead.d.e eVar) {
        String e6;
        com.anythink.basead.d.e a9;
        if (com.anythink.basead.b.e.c(this.f5901c) && TextUtils.isEmpty(eVar.f6298a) && (a9 = com.anythink.basead.f.e.a.a.a(this.f5902d, this.f5901c, str)) != null) {
            eVar.f6298a = a9.f6298a;
            eVar.f6300c = a9.f6300c;
        }
        a aVar = this.f5921j;
        if (aVar == null || !aVar.a()) {
            e6 = e(eVar.f6298a);
            if (!TextUtils.isEmpty(e6)) {
                this.f5921j = f(e6);
            }
        } else {
            e6 = this.f5921j.f5928c;
        }
        eVar.f6299b = e6;
        a(eVar);
        if (TextUtils.isEmpty(e6)) {
            return eVar.f6298a;
        }
        this.f5922k.f6373l = true;
        return e6;
    }

    private n c(String str, e eVar) {
        b bVar = this.f5904f;
        if (bVar != null && !bVar.a(str, this.f5905g)) {
            com.anythink.core.basead.b.c cVar = new com.anythink.core.basead.b.c();
            cVar.f12076c = this.f5901c;
            cVar.f12081h = this.f5902d;
            cVar.f12079f = str;
            cVar.f12080g = this.f5905g;
            cVar.f12083k = (eVar == e.HANDLE_SUCCESS_WITH_WEB_CLICK || eVar == e.HANDLE_DEEPLINK_REFUSE) ? false : true;
            WebLandPageActivity.a(this.f5900b, cVar);
        }
        return n.a(true, "ClickUrlClickAction execute success with INNER_BROWSER_TYPE");
    }

    private String e(String str) {
        String str2;
        HttpURLConnection httpURLConnection;
        String str3;
        boolean z8 = false;
        String str4 = str;
        for (int i = 0; i < 10; i++) {
            HttpURLConnection httpURLConnection2 = null;
            try {
                try {
                    httpURLConnection = (HttpURLConnection) new URL(str4).openConnection();
                } catch (Exception e6) {
                    e = e6;
                    str2 = str4;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                try {
                    httpURLConnection.setRequestMethod("GET");
                    httpURLConnection.setInstanceFollowRedirects(false);
                    y yVar = this.f5902d.f14325o;
                    if (yVar != null && com.anythink.basead.b.b.a(9, yVar)) {
                        String h9 = com.anythink.core.common.v.m.h();
                        if (!TextUtils.isEmpty(h9)) {
                            httpURLConnection.addRequestProperty("User-Agent", h9);
                        }
                    }
                    httpURLConnection.setConnectTimeout(30000);
                    httpURLConnection.connect();
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 302 && responseCode != 301 && responseCode != 307) {
                        str3 = str4;
                        if (!z8 || responseCode == 200) {
                            httpURLConnection.disconnect();
                            return str3;
                        }
                        try {
                            com.anythink.core.common.u.e.a(this.f5902d, this.f5901c, str, str3, String.valueOf(responseCode), "");
                            httpURLConnection.disconnect();
                            return "";
                        } catch (Exception e9) {
                            e = e9;
                            httpURLConnection2 = httpURLConnection;
                            str2 = str3;
                            com.anythink.core.common.u.e.a(this.f5902d, this.f5901c, str, str2, "", e.getMessage());
                            if (httpURLConnection2 != null) {
                                httpURLConnection2.disconnect();
                            }
                            return "";
                        }
                    }
                    str4 = httpURLConnection.getHeaderField("Location");
                    if (!com.anythink.core.basead.a.e.c(str4) && !str4.contains(".apk") && str4.startsWith("http")) {
                        httpURLConnection.disconnect();
                        httpURLConnection.disconnect();
                    }
                    z8 = true;
                    str3 = str4;
                    if (z8) {
                    }
                    httpURLConnection.disconnect();
                    return str3;
                } catch (Exception e10) {
                    e = e10;
                    str2 = str4;
                    httpURLConnection2 = httpURLConnection;
                }
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection2 = httpURLConnection;
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                throw th;
            }
        }
        return "";
    }

    private synchronized a f(String str) {
        a aVar;
        aVar = new a();
        aVar.f5928c = str;
        aVar.f5927b = this.f5902d.f14325o.Z();
        aVar.f5926a = System.currentTimeMillis();
        return aVar;
    }

    public final void a(d dVar) {
        this.f5923l = dVar;
    }

    public final String d() {
        String e6;
        com.anythink.basead.d.e a9;
        b bVar = this.f5904f;
        if (bVar != null) {
            bVar.b();
            this.f5904f.a();
        }
        k kVar = this.f5903e;
        if (kVar != null) {
            this.f5922k = kVar.a();
        }
        String str = "";
        String H6 = this.f5901c.H() != null ? this.f5901c.H() : "";
        String str2 = this.f5902d.f14315d;
        if (str2 == null) {
            str2 = "";
        }
        String a10 = com.anythink.basead.b.j.a(H6.replaceAll("\\{req_id\\}", str2), this.f5922k, System.currentTimeMillis(), this.f5901c, true);
        com.anythink.basead.d.e eVar = (com.anythink.basead.b.e.c(this.f5901c) && this.f5901c.K() == 4) ? new com.anythink.basead.d.e("", "", "") : new com.anythink.basead.d.e(a10, "", "");
        a(eVar);
        int K8 = this.f5901c.K();
        if (K8 != 1) {
            if (K8 == 2 || K8 == 3) {
                if (com.anythink.basead.b.e.c(this.f5901c) && !TextUtils.isEmpty(this.f5901c.G())) {
                    str = e(a10);
                    String a11 = com.anythink.basead.f.e.a.a.a(str);
                    eVar.f6299b = str;
                    eVar.f6300c = a11;
                    a(eVar);
                }
                return TextUtils.isEmpty(str) ? eVar.f6298a : str;
            }
            if (K8 == 4) {
                if (com.anythink.basead.b.e.c(this.f5901c) && TextUtils.isEmpty(eVar.f6298a) && (a9 = com.anythink.basead.f.e.a.a.a(this.f5902d, this.f5901c, a10)) != null) {
                    eVar.f6298a = a9.f6298a;
                    eVar.f6300c = a9.f6300c;
                }
                a aVar = this.f5921j;
                if (aVar == null || !aVar.a()) {
                    e6 = e(eVar.f6298a);
                    if (!TextUtils.isEmpty(e6)) {
                        this.f5921j = f(e6);
                    }
                } else {
                    e6 = this.f5921j.f5928c;
                }
                eVar.f6299b = e6;
                a(eVar);
                if (TextUtils.isEmpty(e6)) {
                    return eVar.f6298a;
                }
                this.f5922k.f6373l = true;
                return e6;
            }
        } else {
            if (!a10.startsWith("http")) {
                return a10;
            }
            a aVar2 = this.f5921j;
            boolean z8 = aVar2 != null && aVar2.a();
            if (this.i) {
                str = this.f5901c.F();
                if (z8) {
                    str = this.f5921j.f5928c;
                }
            }
            if (!z8) {
                String e9 = e(a10);
                if (TextUtils.isEmpty(str)) {
                    str = e9;
                }
                if (!TextUtils.isEmpty(e9)) {
                    this.f5921j = f(e9);
                }
            } else if (TextUtils.isEmpty(str)) {
                str = this.f5921j.f5928c;
            }
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return eVar.f6298a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0191, code lost:
    
        if (com.anythink.basead.b.b.a(r11.f5900b, r11.f5902d, r11.f5901c, b(), r9, new com.anythink.basead.b.i()) == false) goto L112;
     */
    @Override // com.anythink.basead.b.b.a, com.anythink.basead.b.b.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final n a(String str, e eVar) {
        b bVar;
        n a9;
        b bVar2;
        d dVar;
        Objects.toString(eVar);
        if (eVar == e.HANDLE_SUCCESS) {
            return n.a(true, "ClickUrlClickAction execute success with DeeplinkHandleType.HANDLE_SUCCESS before");
        }
        if (eVar == e.NO_HANDLE && (dVar = this.f5923l) != null) {
            n a10 = dVar.a();
            if (a10.f6021a) {
                return a10;
            }
            eVar = e.HANDLE_FAIL;
        }
        boolean z8 = false;
        if ((!TextUtils.isEmpty(this.f5901c.u()) || !TextUtils.isEmpty(this.f5901c.G())) && (bVar = this.f5904f) != null && eVar == e.HANDLE_FAIL) {
            bVar.a(false);
        }
        if (!TextUtils.isEmpty(this.f5901c.I()) && (this.f5901c.K() == 1 || this.f5901c.K() == 4)) {
            boolean b9 = com.anythink.core.basead.a.e.b(this.f5900b, this.f5901c.I());
            com.anythink.basead.d.j jVar = this.f5922k;
            if (jVar != null) {
                jVar.f6372k = new com.anythink.basead.d.b();
                com.anythink.basead.d.e b10 = b();
                com.anythink.basead.d.j jVar2 = this.f5922k;
                jVar2.f6372k.f6288a = b10 != null ? b10.f6300c : "";
                com.anythink.basead.d.a aVar = jVar2.i;
                if (aVar != null) {
                    aVar.f6273j = b9 ? 5 : aVar.f6273j;
                }
            }
            if (b9) {
                k kVar = this.f5903e;
                if (kVar != null) {
                    kVar.b();
                }
                com.anythink.basead.b.b.a(25, this.f5901c, this.f5922k);
                b bVar3 = this.f5904f;
                if (bVar3 != null) {
                    bVar3.c();
                }
                return n.a(true, "ClickUrlClickAction execute success with openApp");
            }
            com.anythink.basead.b.b.a(26, this.f5901c, this.f5922k);
        }
        com.anythink.basead.d.j jVar3 = this.f5922k;
        if (jVar3 != null && jVar3.i != null && this.f5901c.K() == 4) {
            com.anythink.basead.d.j jVar4 = this.f5922k;
            if (jVar4.f6373l) {
                s c4 = t.b().c();
                boolean z9 = c4 != null && c4.a();
                com.anythink.basead.d.a aVar2 = this.f5922k.i;
                aVar2.f6273j = z9 ? c4.checkDataFetchType(this.f5901c, this.f5902d) : aVar2.f6273j;
            } else {
                jVar4.i.f6273j = 3;
            }
        }
        k kVar2 = this.f5903e;
        if (kVar2 != null) {
            kVar2.b();
        }
        if (TextUtils.isEmpty(str)) {
            str = this.f5901c.F();
        }
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            b bVar4 = this.f5904f;
            if (bVar4 != null) {
                bVar4.c();
            }
            return n.a(false, "ClickUrlClickAction execute fail with empty url");
        }
        x xVar = this.f5902d;
        if (xVar != null && com.anythink.core.basead.a.e.a(str2, xVar.f14325o)) {
            Log.d("anythink", "Offer click result FilterDeeplinkByScheme.");
            com.anythink.core.common.u.e.b(this.f5901c, this.f5902d, 3);
            b bVar5 = this.f5904f;
            if (bVar5 != null) {
                bVar5.c();
            }
            return n.a(false, "ClickUrlClickAction execute fail by FilterDeeplinkByScheme");
        }
        int K8 = this.f5901c.K();
        if (K8 == 1) {
            a9 = n.a(true, "ClickUrlClickAction execute success with MARKET_TYPE");
            boolean z10 = (str2 == null || str2.startsWith("http")) ? false : true;
            if (!com.anythink.core.basead.a.e.a(this.f5900b, str2, this.f5901c, this.f5902d) && !z10) {
                if (this.f5902d.f14325o.u() == 2) {
                    com.anythink.core.basead.b.c cVar = new com.anythink.core.basead.b.c();
                    cVar.f12076c = this.f5901c;
                    cVar.f12081h = this.f5902d;
                    cVar.f12079f = str2;
                    cVar.f12080g = this.f5905g;
                    WebLandPageActivity.a(this.f5900b, cVar);
                } else {
                    com.anythink.core.basead.a.e.b(str2);
                }
            }
        } else if (K8 != 2) {
            if (K8 != 3) {
                if (K8 != 4) {
                    a9 = K8 != 6 ? d(str2) : d(str2);
                } else {
                    com.anythink.basead.d.j jVar5 = this.f5922k;
                    if (jVar5 != null && jVar5.f6373l) {
                        if (TextUtils.isEmpty(str2)) {
                            com.anythink.core.basead.a.e.b(str2);
                        }
                        a9 = n.a(true, "ClickUrlClickAction execute success with APK_TYPE");
                    }
                    com.anythink.core.basead.a.e.b(str2);
                    a9 = n.a(true, "ClickUrlClickAction execute success with APK_TYPE");
                }
            }
            bVar2 = this.f5904f;
            if (bVar2 != null && !bVar2.a(str2, this.f5905g)) {
                com.anythink.core.basead.b.c cVar2 = new com.anythink.core.basead.b.c();
                cVar2.f12076c = this.f5901c;
                cVar2.f12081h = this.f5902d;
                cVar2.f12079f = str2;
                cVar2.f12080g = this.f5905g;
                if (eVar != e.HANDLE_SUCCESS_WITH_WEB_CLICK && eVar != e.HANDLE_DEEPLINK_REFUSE) {
                    z8 = true;
                }
                cVar2.f12083k = z8;
                WebLandPageActivity.a(this.f5900b, cVar2);
            }
            a9 = n.a(true, "ClickUrlClickAction execute success with INNER_BROWSER_TYPE");
        } else {
            if (eVar != e.HANDLE_SUCCESS_WITH_WEB_CLICK) {
                com.anythink.core.basead.a.e.b(str2);
                a9 = n.a(true, "ClickUrlClickAction execute success with BROWSER_TYPE");
            }
            bVar2 = this.f5904f;
            if (bVar2 != null) {
                com.anythink.core.basead.b.c cVar22 = new com.anythink.core.basead.b.c();
                cVar22.f12076c = this.f5901c;
                cVar22.f12081h = this.f5902d;
                cVar22.f12079f = str2;
                cVar22.f12080g = this.f5905g;
                if (eVar != e.HANDLE_SUCCESS_WITH_WEB_CLICK) {
                    z8 = true;
                }
                cVar22.f12083k = z8;
                WebLandPageActivity.a(this.f5900b, cVar22);
            }
            a9 = n.a(true, "ClickUrlClickAction execute success with INNER_BROWSER_TYPE");
        }
        b bVar6 = this.f5904f;
        if (bVar6 != null) {
            bVar6.c();
        }
        return a9;
    }

    private n c(String str) {
        return d(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0042, code lost:
    
        if (com.anythink.basead.b.b.a(r10.f5900b, r10.f5902d, r10.f5901c, b(), r8, new com.anythink.basead.b.i()) == false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private n b(String str, e eVar) {
        String str2;
        String str3;
        int K8 = this.f5901c.K();
        boolean z8 = false;
        if (K8 != 1) {
            if (K8 == 2) {
                str2 = str;
                if (eVar != e.HANDLE_SUCCESS_WITH_WEB_CLICK) {
                    com.anythink.core.basead.a.e.b(str2);
                    return n.a(true, "ClickUrlClickAction execute success with BROWSER_TYPE");
                }
            } else {
                if (K8 != 3) {
                    if (K8 != 4) {
                        if (K8 != 6) {
                            return d(str);
                        }
                        return d(str);
                    }
                    com.anythink.basead.d.j jVar = this.f5922k;
                    if (jVar != null && jVar.f6373l) {
                        if (TextUtils.isEmpty(str)) {
                            com.anythink.core.basead.a.e.b(str);
                        } else {
                            str3 = str;
                        }
                        return n.a(true, "ClickUrlClickAction execute success with APK_TYPE");
                    }
                    str3 = str;
                    com.anythink.core.basead.a.e.b(str3);
                    return n.a(true, "ClickUrlClickAction execute success with APK_TYPE");
                }
                str2 = str;
            }
            b bVar = this.f5904f;
            if (bVar != null && !bVar.a(str2, this.f5905g)) {
                com.anythink.core.basead.b.c cVar = new com.anythink.core.basead.b.c();
                cVar.f12076c = this.f5901c;
                cVar.f12081h = this.f5902d;
                cVar.f12079f = str2;
                cVar.f12080g = this.f5905g;
                if (eVar != e.HANDLE_SUCCESS_WITH_WEB_CLICK && eVar != e.HANDLE_DEEPLINK_REFUSE) {
                    z8 = true;
                }
                cVar.f12083k = z8;
                WebLandPageActivity.a(this.f5900b, cVar);
            }
            return n.a(true, "ClickUrlClickAction execute success with INNER_BROWSER_TYPE");
        }
        n a9 = n.a(true, "ClickUrlClickAction execute success with MARKET_TYPE");
        if (str != null && !str.startsWith("http")) {
            z8 = true;
        }
        if (!com.anythink.core.basead.a.e.a(this.f5900b, str, this.f5901c, this.f5902d) && !z8) {
            if (this.f5902d.f14325o.u() == 2) {
                com.anythink.core.basead.b.c cVar2 = new com.anythink.core.basead.b.c();
                cVar2.f12076c = this.f5901c;
                cVar2.f12081h = this.f5902d;
                cVar2.f12079f = str;
                cVar2.f12080g = this.f5905g;
                WebLandPageActivity.a(this.f5900b, cVar2);
                return a9;
            }
            com.anythink.core.basead.a.e.b(str);
        }
        return a9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (com.anythink.basead.b.b.a(r7.f5900b, r7.f5902d, r7.f5901c, b(), r5, new com.anythink.basead.b.i()) == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private n b(String str) {
        String str2;
        com.anythink.basead.d.j jVar = this.f5922k;
        if (jVar != null && jVar.f6373l) {
            if (TextUtils.isEmpty(str)) {
                com.anythink.core.basead.a.e.b(str);
            } else {
                str2 = str;
            }
            return n.a(true, "ClickUrlClickAction execute success with APK_TYPE");
        }
        str2 = str;
        com.anythink.core.basead.a.e.b(str2);
        return n.a(true, "ClickUrlClickAction execute success with APK_TYPE");
    }

    private n d(String str) {
        if (this.f5902d.f14325o.u() == 2) {
            com.anythink.core.basead.b.c cVar = new com.anythink.core.basead.b.c();
            cVar.f12076c = this.f5901c;
            cVar.f12081h = this.f5902d;
            cVar.f12079f = str;
            cVar.f12080g = this.f5905g;
            WebLandPageActivity.a(this.f5900b, cVar);
        } else {
            com.anythink.core.basead.a.e.b(str);
        }
        return n.a(true, "ClickUrlClickAction execute success with DEFAULT");
    }

    private String a(String str, com.anythink.basead.d.e eVar) {
        String str2;
        if (com.anythink.basead.b.e.c(this.f5901c) && !TextUtils.isEmpty(this.f5901c.G())) {
            str2 = e(str);
            String a9 = com.anythink.basead.f.e.a.a.a(str2);
            eVar.f6299b = str2;
            eVar.f6300c = a9;
            a(eVar);
        } else {
            str2 = "";
        }
        return TextUtils.isEmpty(str2) ? eVar.f6298a : str2;
    }

    private n a(String str) {
        n a9 = n.a(true, "ClickUrlClickAction execute success with MARKET_TYPE");
        boolean z8 = (str == null || str.startsWith("http")) ? false : true;
        if (!com.anythink.core.basead.a.e.a(this.f5900b, str, this.f5901c, this.f5902d) && !z8) {
            if (this.f5902d.f14325o.u() == 2) {
                com.anythink.core.basead.b.c cVar = new com.anythink.core.basead.b.c();
                cVar.f12076c = this.f5901c;
                cVar.f12081h = this.f5902d;
                cVar.f12079f = str;
                cVar.f12080g = this.f5905g;
                WebLandPageActivity.a(this.f5900b, cVar);
                return a9;
            }
            com.anythink.core.basead.a.e.b(str);
        }
        return a9;
    }

    private void a(com.anythink.basead.d.e eVar) {
        com.anythink.basead.b.d.a().a(this.f5901c.b(), this.f5901c.v(), eVar);
    }
}
