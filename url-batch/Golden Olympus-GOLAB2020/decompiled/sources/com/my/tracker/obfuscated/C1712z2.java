package com.my.tracker.obfuscated;

import android.os.Handler;
import android.text.TextUtils;
import com.my.tracker.MyTracker;
import com.my.tracker.MyTrackerConfig;
import com.my.tracker.MyTrackerParams;
import com.my.tracker.config.AntiFraudConfig;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.URI;

/* renamed from: com.my.tracker.obfuscated.z2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1712z2 {

    /* renamed from: a, reason: collision with root package name */
    private final MyTrackerParams f21590a = new MyTrackerParams();

    /* renamed from: b, reason: collision with root package name */
    private String f21591b = "";

    /* renamed from: c, reason: collision with root package name */
    private AntiFraudConfig f21592c = AntiFraudConfig.newBuilder().build();

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f21593d = true;

    /* renamed from: e, reason: collision with root package name */
    private volatile int f21594e = 0;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f21595f = true;

    /* renamed from: g, reason: collision with root package name */
    private volatile boolean f21596g = true;

    /* renamed from: h, reason: collision with root package name */
    private volatile boolean f21597h = true;

    /* renamed from: i, reason: collision with root package name */
    private volatile boolean f21598i = true;

    /* renamed from: j, reason: collision with root package name */
    private volatile int f21599j = 30;

    /* renamed from: k, reason: collision with root package name */
    private volatile int f21600k = 0;

    /* renamed from: l, reason: collision with root package name */
    private volatile int f21601l = 900;

    /* renamed from: m, reason: collision with root package name */
    private volatile String f21602m = null;

    /* renamed from: n, reason: collision with root package name */
    private volatile String f21603n = null;

    /* renamed from: o, reason: collision with root package name */
    private volatile MyTrackerConfig.InstalledPackagesProvider f21604o = null;

    /* renamed from: p, reason: collision with root package name */
    private volatile MyTrackerConfig.OkHttpClientProvider f21605p = null;

    /* renamed from: q, reason: collision with root package name */
    private volatile String f21606q = "";

    /* renamed from: r, reason: collision with root package name */
    private volatile String f21607r = "";

    /* renamed from: s, reason: collision with root package name */
    private volatile String f21608s = "";

    /* renamed from: t, reason: collision with root package name */
    private volatile String f21609t = "";

    /* renamed from: u, reason: collision with root package name */
    private volatile String f21610u = "";

    /* renamed from: v, reason: collision with root package name */
    private volatile MyTracker.AttributionListener f21611v = null;

    /* renamed from: w, reason: collision with root package name */
    private volatile Handler f21612w = null;

    /* renamed from: com.my.tracker.obfuscated.z2$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f21613a;

        /* renamed from: b, reason: collision with root package name */
        public final int f21614b;

        /* renamed from: c, reason: collision with root package name */
        public final int f21615c;

        /* renamed from: d, reason: collision with root package name */
        public final int f21616d;

        /* renamed from: e, reason: collision with root package name */
        public final int f21617e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f21618f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f21619g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f21620h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f21621i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f21622j;

        /* renamed from: k, reason: collision with root package name */
        public final MyTrackerParams.a f21623k;

        /* renamed from: l, reason: collision with root package name */
        public final AntiFraudConfig f21624l;

        /* renamed from: m, reason: collision with root package name */
        public final MyTrackerConfig.InstalledPackagesProvider f21625m;

        public a(String str, int i4, int i5, int i6, int i7, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, MyTrackerParams.a aVar, AntiFraudConfig antiFraudConfig, MyTrackerConfig.InstalledPackagesProvider installedPackagesProvider) {
            this.f21613a = str;
            this.f21614b = i4;
            this.f21615c = i5;
            this.f21616d = i6;
            this.f21617e = i7;
            this.f21618f = z4;
            this.f21619g = z5;
            this.f21620h = z6;
            this.f21621i = z7;
            this.f21622j = z8;
            this.f21623k = aVar;
            this.f21624l = antiFraudConfig;
            this.f21625m = installedPackagesProvider;
        }
    }

    private C1712z2() {
        y();
    }

    public static C1712z2 x() {
        return new C1712z2();
    }

    private void y() {
        d("tracker-api.vk-analytics.ru");
    }

    public AntiFraudConfig a() {
        return this.f21592c;
    }

    public String b() {
        return this.f21602m;
    }

    public Handler c() {
        return this.f21612w;
    }

    public MyTracker.AttributionListener d() {
        return this.f21611v;
    }

    public int e() {
        return this.f21601l;
    }

    public int f() {
        return this.f21600k;
    }

    public String g() {
        return this.f21591b;
    }

    public String h() {
        return this.f21607r;
    }

    public int i() {
        return this.f21599j;
    }

    public int j() {
        return this.f21594e;
    }

    public String k() {
        return this.f21609t;
    }

    public String l() {
        return this.f21608s;
    }

    public MyTrackerParams m() {
        return this.f21590a;
    }

    public MyTrackerConfig.OkHttpClientProvider n() {
        return this.f21605p;
    }

    public a o() {
        return new a(this.f21591b, this.f21599j, this.f21601l, this.f21600k, this.f21594e, this.f21593d, this.f21595f, this.f21596g, this.f21597h, this.f21598i, this.f21590a.a(), this.f21592c, this.f21604o);
    }

    public String p() {
        return this.f21610u;
    }

    public String q() {
        return this.f21606q;
    }

    public String r() {
        return this.f21603n;
    }

    public boolean s() {
        return this.f21596g;
    }

    public boolean t() {
        return this.f21595f;
    }

    public boolean u() {
        return this.f21593d;
    }

    public boolean v() {
        return this.f21597h;
    }

    public boolean w() {
        return this.f21598i;
    }

    public void z() {
        this.f21603n = "com.my.games.vendorapp";
    }

    public void a(AntiFraudConfig antiFraudConfig) {
        this.f21592c = antiFraudConfig;
    }

    public void b(int i4) {
        if (i4 > 432000) {
            AbstractC1708y2.a("Invalid forcingPeriod value " + i4 + ", forcingPeriod set to max 432000");
            this.f21600k = 432000;
            return;
        }
        if (i4 >= 0) {
            this.f21600k = i4;
            return;
        }
        AbstractC1708y2.a("Invalid forcingPeriod value " + i4 + ", forcingPeriod set to min 0");
        this.f21600k = 0;
    }

    public void c(int i4) {
        StringBuilder sb;
        String str;
        int i5 = 7200;
        if (i4 <= 7200) {
            i5 = 30;
            if (i4 < 30) {
                sb = new StringBuilder();
                sb.append("Invalid launchTimeout value ");
                sb.append(i4);
                str = ", timeout set to min ";
            }
            this.f21599j = i4;
        }
        sb = new StringBuilder();
        sb.append("Invalid launchTimeout value ");
        sb.append(i4);
        str = ", timeout set to max ";
        sb.append(str);
        sb.append(i5);
        AbstractC1708y2.a(sb.toString());
        i4 = i5;
        this.f21599j = i4;
    }

    public void d(int i4) {
        this.f21594e = i4;
    }

    public void e(boolean z4) {
        this.f21598i = z4;
    }

    public void a(String str) {
        this.f21602m = str;
    }

    void b(String str) {
        this.f21591b = str;
    }

    public void c(String str) {
        String str2;
        String host;
        try {
            if (TextUtils.isEmpty(str)) {
                AbstractC1708y2.c("setProxyHost: reset proxy host to default = tracker-api.vk-analytics.ru");
                y();
                return;
            }
            AbstractC1708y2.c("setProxyHost: try to set proxy host = " + str);
            int indexOf = str.indexOf("://");
            if (indexOf > 0) {
                AbstractC1708y2.c("setProxyHost: detected custom schema, will be suppressed");
                str2 = str.substring(indexOf + 3);
            } else {
                str2 = str;
            }
            URI uri = new URI(AbstractC1610a3.a(str2, null));
            if (uri.getUserInfo() != null) {
                AbstractC1708y2.c("setProxyHost: detected custom userinfo, will be suppressed");
            }
            if (!TextUtils.isEmpty(uri.getPath())) {
                AbstractC1708y2.c("setProxyHost: detected custom path, will be suppressed");
            }
            int port = uri.getPort();
            if (port != -1) {
                host = uri.getHost() + StringUtils.PROCESS_POSTFIX_DELIMITER + port;
            } else {
                host = uri.getHost();
            }
            if (host.startsWith("www.")) {
                AbstractC1708y2.c("setProxyHost: proxyHost starts from 'www.' which is not recommended (check docs), continue anyway");
            }
            d(host);
            AbstractC1708y2.c("setProxyHost: proxy host = " + host + " successfully set");
        } catch (Throwable th) {
            AbstractC1708y2.c("setProxyHost: unable to set proxy host = " + str + " (reason: invalid url), using default = tracker-api.vk-analytics.ru,\norig error = " + th.getMessage());
            y();
        }
    }

    public void d(boolean z4) {
        this.f21597h = z4;
    }

    public void e(String str) {
        this.f21603n = str;
    }

    private void d(String str) {
        this.f21606q = AbstractC1610a3.a(str, "v3/");
        AbstractC1708y2.a("trackerUrl set = " + this.f21606q);
        this.f21607r = AbstractC1610a3.a("ip4", str, null);
        AbstractC1708y2.a("ipv4TrackerUrl set = " + this.f21607r);
        this.f21610u = AbstractC1610a3.a("ts", str, "mobile/v1");
        AbstractC1708y2.a("timeSpentUrl set = " + this.f21610u);
        this.f21608s = AbstractC1610a3.a("mlapi", str, null);
        this.f21609t = AbstractC1610a3.a("beta-ml", str, null);
    }

    public void a(MyTracker.AttributionListener attributionListener, Handler handler) {
        this.f21611v = attributionListener;
        this.f21612w = handler;
    }

    public void b(boolean z4) {
        this.f21595f = z4;
    }

    public void c(boolean z4) {
        this.f21593d = z4;
    }

    public void a(boolean z4) {
        this.f21596g = z4;
    }

    public void a(int i4) {
        StringBuilder sb;
        String str;
        int i5 = 86400;
        if (i4 <= 86400) {
            i5 = 1;
            if (i4 < 1) {
                sb = new StringBuilder();
                sb.append("Invalid bufferingPeriod value ");
                sb.append(i4);
                str = ", bufferingPeriod set to min ";
            }
            this.f21601l = i4;
        }
        sb = new StringBuilder();
        sb.append("Invalid bufferingPeriod value ");
        sb.append(i4);
        str = ", bufferingPeriod set to max ";
        sb.append(str);
        sb.append(i5);
        AbstractC1708y2.a(sb.toString());
        i4 = i5;
        this.f21601l = i4;
    }

    public void a(MyTrackerConfig.InstalledPackagesProvider installedPackagesProvider) {
        this.f21604o = installedPackagesProvider;
    }

    public void a(MyTrackerConfig.OkHttpClientProvider okHttpClientProvider) {
        this.f21605p = okHttpClientProvider;
    }
}
