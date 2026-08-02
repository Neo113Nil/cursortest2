package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.appmetrica.analytics.profile.UserProfile;
import io.appmetrica.analytics.profile.UserProfileUpdate;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class I2 implements Da {
    public static final HashSet n = new HashSet(Arrays.asList(1, 13));
    public static final G2 o = new G2();

    /* renamed from: a, reason: collision with root package name */
    protected final Context f10389a;

    /* renamed from: b, reason: collision with root package name */
    protected final Fh f10390b;

    /* renamed from: c, reason: collision with root package name */
    protected final PublicLogger f10391c;

    /* renamed from: d, reason: collision with root package name */
    protected final Rn f10392d;

    /* renamed from: e, reason: collision with root package name */
    protected final Eg f10393e;

    /* renamed from: f, reason: collision with root package name */
    protected final C1020v6 f10394f;

    /* renamed from: g, reason: collision with root package name */
    public final C0549d0 f10395g;

    /* renamed from: h, reason: collision with root package name */
    protected final C1058wi f10396h;

    /* renamed from: i, reason: collision with root package name */
    public C0844ob f10397i;

    /* renamed from: j, reason: collision with root package name */
    public final Cf f10398j;

    /* renamed from: k, reason: collision with root package name */
    public final M9 f10399k;

    /* renamed from: l, reason: collision with root package name */
    public final Je f10400l;

    /* renamed from: m, reason: collision with root package name */
    public final C0623fn f10401m;

    public I2(Context context, C1058wi c1058wi, Fh fh, M9 m9, C0916r6 c0916r6, Rn rn, Eg eg, C1020v6 c1020v6, C0549d0 c0549d0, Je je) {
        Context applicationContext = context.getApplicationContext();
        this.f10389a = applicationContext;
        this.f10396h = c1058wi;
        this.f10390b = fh;
        this.f10399k = m9;
        this.f10392d = rn;
        this.f10393e = eg;
        this.f10394f = c1020v6;
        this.f10395g = c0549d0;
        this.f10400l = je;
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(fh.b().getApiKey());
        this.f10391c = orCreatePublicLogger;
        if (Y2.a(fh.b().isLogEnabled())) {
            orCreatePublicLogger.setEnabled(true);
        }
        this.f10398j = c0916r6;
        this.f10401m = new C0623fn(applicationContext);
    }

    public void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            this.f10391c.warning("Invalid Error Environment (key,value) pair: (%s,%s).", str, str2);
            return;
        }
        this.f10391c.info("Put error environment pair <%s, %s>", str, str2);
        Fh fh = this.f10390b;
        synchronized (fh) {
            D8 d8 = fh.f10281c;
            d8.f10191b.b(d8.f10190a, str, str2);
        }
    }

    public final void b(Map<String, String> map) {
        if (AbstractC0779lo.a((Map) map)) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            a(entry.getKey(), entry.getValue());
        }
    }

    public final void c(String str) {
        if (this.f10390b.f()) {
            return;
        }
        this.f10396h.f12947d.c();
        C0844ob c0844ob = this.f10397i;
        c0844ob.f12508a.removeCallbacks(c0844ob.f12510c, c0844ob.f12509b.f10390b.f10356b.getApiKey());
        this.f10390b.f10283e = true;
        C1058wi c1058wi = this.f10396h;
        PublicLogger publicLogger = this.f10391c;
        Set set = AbstractC1049w9.f12924a;
        EnumC0508bb enumC0508bb = EnumC0508bb.EVENT_TYPE_UNDEFINED;
        M3 m32 = new M3("", str, 3, 0, publicLogger);
        Fh fh = this.f10390b;
        c1058wi.getClass();
        c1058wi.a(C1058wi.a(m32, fh), fh, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void clearAppEnvironment() {
        String str;
        this.f10391c.info("Clear app environment", new Object[0]);
        C1058wi c1058wi = this.f10396h;
        Fh fh = this.f10390b;
        c1058wi.getClass();
        P5 n4 = M3.n();
        Bf bf = new Bf(fh.f10355a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(fh.f10356b);
        D8 d8 = fh.f10281c;
        synchronized (fh) {
            str = fh.f10284f;
        }
        c1058wi.a(new C1031vh(n4, false, 1, null, new Fh(bf, counterConfiguration, d8, str)));
    }

    public final void d(String str) {
        this.f10396h.f12947d.b();
        C0844ob c0844ob = this.f10397i;
        C0844ob.a(c0844ob.f12508a, c0844ob.f12509b, c0844ob.f12510c);
        C1058wi c1058wi = this.f10396h;
        PublicLogger publicLogger = this.f10391c;
        Set set = AbstractC1049w9.f12924a;
        EnumC0508bb enumC0508bb = EnumC0508bb.EVENT_TYPE_UNDEFINED;
        M3 m32 = new M3("", str, 6400, 0, publicLogger);
        Fh fh = this.f10390b;
        c1058wi.getClass();
        c1058wi.a(C1058wi.a(m32, fh), fh, 1, (Map) null);
        this.f10390b.f10283e = false;
    }

    @Override // io.appmetrica.analytics.IReporter
    public final IPluginReporter getPluginExtension() {
        return this;
    }

    public String j() {
        return "[BaseReporter]";
    }

    public void k() {
        String str;
        C0900qf c0900qf;
        C1058wi c1058wi = this.f10396h;
        Fh fh = this.f10390b;
        c1058wi.getClass();
        C1003uf c1003uf = fh.f10282d;
        synchronized (fh) {
            str = fh.f10284f;
        }
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(fh.f10356b.getApiKey());
        Set set = AbstractC1049w9.f12924a;
        JSONObject jSONObject = new JSONObject();
        if (c1003uf != null && (c0900qf = c1003uf.f12829a) != null) {
            try {
                jSONObject.put("preloadInfo", c0900qf.c());
            } catch (Throwable unused) {
            }
        }
        String jSONObject2 = jSONObject.toString();
        EnumC0508bb enumC0508bb = EnumC0508bb.EVENT_TYPE_UNDEFINED;
        M3 m32 = new M3(jSONObject2, "", 6144, 0, orCreatePublicLogger);
        m32.c(str);
        c1058wi.a(C1058wi.a(m32, fh), fh, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void pauseSession() {
        this.f10391c.info("Pause session", new Object[0]);
        c(null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void putAppEnvironmentValue(String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str)) {
            this.f10391c.warning("Invalid App Environment (key,value) pair: (%s,%s).", str, str2);
            return;
        }
        this.f10391c.info("Put app environment: <%s, %s>", str, str2);
        C1058wi c1058wi = this.f10396h;
        Fh fh = this.f10390b;
        c1058wi.getClass();
        P5 b4 = M3.b(str, str2);
        Bf bf = new Bf(fh.f10355a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(fh.f10356b);
        D8 d8 = fh.f10281c;
        synchronized (fh) {
            str3 = fh.f10284f;
        }
        c1058wi.a(new C1031vh(b4, false, 1, null, new Fh(bf, counterConfiguration, d8, str3)));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAdRevenue(AdRevenue adRevenue) {
        reportAdRevenue(adRevenue, false);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAnr(Map<Thread, StackTraceElement[]> map) {
        StackTraceElement[] stackTraceElementArr;
        C0574e0 c0574e0 = new C0574e0(new C0600f0(this, map));
        C0765la c0765la = new C0765la();
        C0916r6 c0916r6 = C0501b4.l().f11455a;
        Thread a3 = c0574e0.a();
        Map map2 = null;
        try {
            stackTraceElementArr = c0574e0.b();
            if (stackTraceElementArr == null) {
                try {
                    stackTraceElementArr = a3.getStackTrace();
                } catch (SecurityException unused) {
                }
            }
        } catch (SecurityException unused2) {
            stackTraceElementArr = null;
        }
        C1063wn c1063wn = (C1063wn) c0765la.apply(a3, stackTraceElementArr);
        ArrayList arrayList = new ArrayList();
        TreeMap treeMap = new TreeMap(new Bn());
        try {
            map2 = c0574e0.c();
        } catch (SecurityException unused3) {
        }
        if (map2 != null) {
            treeMap.putAll(map2);
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            Thread thread = (Thread) entry.getKey();
            if (thread != a3 && thread != null) {
                arrayList.add((C1063wn) c0765la.apply(thread, (StackTraceElement[]) entry.getValue()));
            }
        }
        a(new V(c1063wn, arrayList, c0916r6.a()));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportECommerce(ECommerceEvent eCommerceEvent) {
        String str;
        this.f10391c.info("E-commerce event received: " + eCommerceEvent.getPublicDescription(), new Object[0]);
        C1058wi c1058wi = this.f10396h;
        Fh fh = this.f10390b;
        c1058wi.getClass();
        for (Di di : eCommerceEvent.toProto()) {
            M3 m32 = new M3(LoggerStorage.getOrCreatePublicLogger(fh.f10356b.getApiKey()));
            EnumC0508bb enumC0508bb = EnumC0508bb.EVENT_TYPE_UNDEFINED;
            m32.f10797d = 41000;
            m32.f10795b = m32.e(Base64Utils.compressBase64(MessageNano.toByteArray((MessageNano) di.f10202a)));
            m32.f10800g = di.f10203b.getBytesTruncated();
            Bf bf = new Bf(fh.f10355a);
            CounterConfiguration counterConfiguration = new CounterConfiguration(fh.f10356b);
            D8 d8 = fh.f10281c;
            synchronized (fh) {
                str = fh.f10284f;
            }
            c1058wi.a(new C1031vh(m32, false, 1, null, new Fh(bf, counterConfiguration, d8, str)));
        }
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, Throwable th) {
        Dg dg = new Dg(str, a(th));
        C1058wi c1058wi = this.f10396h;
        byte[] byteArray = MessageNano.toByteArray(this.f10393e.fromModel(dg));
        PublicLogger publicLogger = this.f10391c;
        Set set = AbstractC1049w9.f12924a;
        EnumC0508bb enumC0508bb = EnumC0508bb.EVENT_TYPE_UNDEFINED;
        M3 m32 = new M3(byteArray, str, 5892, publicLogger);
        Fh fh = this.f10390b;
        c1058wi.getClass();
        c1058wi.a(C1058wi.a(m32, fh), fh, 1, (Map) null);
        this.f10391c.info("Error received: %s", WrapUtils.wrapToTag(str));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str) {
        this.f10391c.info("Event received: " + WrapUtils.wrapToTag(str), new Object[0]);
        C1058wi c1058wi = this.f10396h;
        PublicLogger publicLogger = this.f10391c;
        Set set = AbstractC1049w9.f12924a;
        EnumC0508bb enumC0508bb = EnumC0508bb.EVENT_TYPE_UNDEFINED;
        M3 m32 = new M3("", str, 1, 0, publicLogger);
        Fh fh = this.f10390b;
        c1058wi.getClass();
        c1058wi.a(C1058wi.a(m32, fh), fh, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportRevenue(Revenue revenue) {
        String str;
        Ni ni = H2.f10354a;
        ni.getClass();
        C0909qo a3 = ni.a(revenue);
        if (!a3.f12630a) {
            this.f10391c.warning("Passed revenue is not valid. Reason: " + a3.f12631b, new Object[0]);
            return;
        }
        C1058wi c1058wi = this.f10396h;
        Oi oi = new Oi(revenue, this.f10391c);
        Fh fh = this.f10390b;
        c1058wi.getClass();
        M3 a4 = M3.a(LoggerStorage.getOrCreatePublicLogger(fh.f10356b.getApiKey()), oi);
        Bf bf = new Bf(fh.f10355a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(fh.f10356b);
        D8 d8 = fh.f10281c;
        synchronized (fh) {
            str = fh.f10284f;
        }
        c1058wi.a(new C1031vh(a4, false, 1, null, new Fh(bf, counterConfiguration, d8, str)));
        this.f10391c.info("Revenue received for productID: " + WrapUtils.wrapToTag(revenue.productID) + " of quantity: " + WrapUtils.wrapToTag(revenue.quantity) + " with price (in micros): " + revenue.priceMicros + " " + revenue.currency, new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUnhandledException(Throwable th) {
        Qn a3 = Tn.a(th, new V(null, null, this.f10398j.a()), null, (String) this.f10399k.f10638b.a(), (Boolean) this.f10399k.f10639c.a());
        C1058wi c1058wi = this.f10396h;
        c1058wi.a(c1058wi.a(a3, this.f10390b));
        this.f10391c.info("Unhandled exception received: " + a3, new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUserProfile(UserProfile userProfile) {
        String str;
        Cdo cdo = new Cdo(Cdo.f11708c);
        Iterator<UserProfileUpdate<? extends InterfaceC0598eo>> it = userProfile.getUserProfileUpdates().iterator();
        while (it.hasNext()) {
            InterfaceC0598eo userProfileUpdatePatcher = it.next().getUserProfileUpdatePatcher();
            userProfileUpdatePatcher.a(this.f10391c);
            userProfileUpdatePatcher.a(cdo);
        }
        C0701io c0701io = new C0701io();
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < cdo.f11709a.size(); i4++) {
            SparseArray sparseArray = cdo.f11709a;
            Iterator it2 = ((HashMap) sparseArray.get(sparseArray.keyAt(i4))).values().iterator();
            while (it2.hasNext()) {
                arrayList.add((C0624fo) it2.next());
            }
        }
        c0701io.f12083a = (C0624fo[]) arrayList.toArray(new C0624fo[arrayList.size()]);
        C0909qo a3 = o.a(c0701io);
        if (!a3.f12630a) {
            this.f10391c.warning("UserInfo wasn't sent because " + a3.f12631b, new Object[0]);
            return;
        }
        C1058wi c1058wi = this.f10396h;
        Fh fh = this.f10390b;
        c1058wi.getClass();
        P5 a4 = M3.a(c0701io);
        Bf bf = new Bf(fh.f10355a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(fh.f10356b);
        D8 d8 = fh.f10281c;
        synchronized (fh) {
            str = fh.f10284f;
        }
        c1058wi.a(new C1031vh(a4, false, 1, null, new Fh(bf, counterConfiguration, d8, str)));
        this.f10391c.info("User profile received", new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void resumeSession() {
        d(null);
        this.f10391c.info("Resume session", new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter, io.appmetrica.analytics.IModuleReporter
    public final void sendEventsBuffer() {
        this.f10391c.info("Send event buffer", new Object[0]);
        C1058wi c1058wi = this.f10396h;
        EnumC0508bb enumC0508bb = EnumC0508bb.EVENT_TYPE_UNDEFINED;
        PublicLogger publicLogger = this.f10391c;
        Set set = AbstractC1049w9.f12924a;
        M3 m32 = new M3("", "", 256, 0, publicLogger);
        Fh fh = this.f10390b;
        c1058wi.getClass();
        c1058wi.a(C1058wi.a(m32, fh), fh, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setDataSendingEnabled(boolean z) {
        this.f10390b.f10356b.setDataSendingEnabled(z);
        this.f10391c.info("Updated data sending enabled: %s", Boolean.valueOf(z));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void setSessionExtra(String str, byte[] bArr) {
        C1058wi c1058wi = this.f10396h;
        PublicLogger publicLogger = this.f10391c;
        Set set = AbstractC1049w9.f12924a;
        EnumC0508bb enumC0508bb = EnumC0508bb.EVENT_TYPE_UNDEFINED;
        M3 m32 = new M3("", null, 8193, 0, publicLogger);
        if (bArr == null) {
            bArr = new byte[0];
        }
        m32.f10807p = Collections.singletonMap(str, bArr);
        Fh fh = this.f10390b;
        c1058wi.getClass();
        c1058wi.a(C1058wi.a(m32, fh), fh, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setUserProfileID(String str) {
        String str2;
        C1058wi c1058wi = this.f10396h;
        Fh fh = this.f10390b;
        c1058wi.getClass();
        M3 m32 = new M3(LoggerStorage.getOrCreatePublicLogger(fh.f10356b.getApiKey()));
        EnumC0508bb enumC0508bb = EnumC0508bb.EVENT_TYPE_UNDEFINED;
        m32.f10797d = 40962;
        m32.c(str);
        m32.f10795b = m32.e(str);
        Bf bf = new Bf(fh.f10355a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(fh.f10356b);
        D8 d8 = fh.f10281c;
        synchronized (fh) {
            str2 = fh.f10284f;
        }
        c1058wi.a(new C1031vh(m32, false, 1, null, new Fh(bf, counterConfiguration, d8, str2)));
        this.f10391c.info("Set user profile ID: " + WrapUtils.wrapToTag(str), new Object[0]);
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportAdRevenue(AdRevenue adRevenue, boolean z) {
        String str;
        C1058wi c1058wi = this.f10396h;
        E e4 = new E(adRevenue, z, this.f10401m, this.f10391c);
        Fh fh = this.f10390b;
        c1058wi.getClass();
        M3 a3 = M3.a(LoggerStorage.getOrCreatePublicLogger(fh.f10356b.getApiKey()), e4);
        Bf bf = new Bf(fh.f10355a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(fh.f10356b);
        D8 d8 = fh.f10281c;
        synchronized (fh) {
            str = fh.f10284f;
        }
        c1058wi.a(new C1031vh(a3, false, 1, null, new Fh(bf, counterConfiguration, d8, str)));
        this.f10391c.info("AdRevenue Received: AdRevenue{adRevenue=" + adRevenue.adRevenue + ", currency='" + WrapUtils.wrapToTag(adRevenue.currency.getCurrencyCode()) + "', adType=" + WrapUtils.wrapToTag(adRevenue.adType) + ", adNetwork='" + WrapUtils.wrapToTag(adRevenue.adNetwork) + "', adUnitId='" + WrapUtils.wrapToTag(adRevenue.adUnitId) + "', adUnitName='" + WrapUtils.wrapToTag(adRevenue.adUnitName) + "', adPlacementId='" + WrapUtils.wrapToTag(adRevenue.adPlacementId) + "', adPlacementName='" + WrapUtils.wrapToTag(adRevenue.adPlacementName) + "', precision='" + WrapUtils.wrapToTag(adRevenue.precision) + "', payload=" + AbstractC0637gb.b(adRevenue.payload) + ", autoCollected=" + z + "}", new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.Da
    public final void b(String str, String str2) {
        this.f10391c.info("Event received: " + WrapUtils.wrapToTag(str) + ". With value: " + WrapUtils.wrapToTag(str2), new Object[0]);
        C1058wi c1058wi = this.f10396h;
        PublicLogger publicLogger = this.f10391c;
        Set set = AbstractC1049w9.f12924a;
        EnumC0508bb enumC0508bb = EnumC0508bb.EVENT_TYPE_UNDEFINED;
        M3 m32 = new M3(str2, str, 1, 0, publicLogger);
        m32.f10805l = EnumC0790m9.JS;
        Fh fh = this.f10390b;
        c1058wi.getClass();
        c1058wi.a(C1058wi.a(m32, fh), fh, 1, (Map) null);
    }

    public final void a(Map<String, String> map) {
        if (AbstractC0779lo.a((Map) map)) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            putAppEnvironmentValue(entry.getKey(), entry.getValue());
        }
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, String str2) {
        reportError(str, str2, (Throwable) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str, String str2) {
        this.f10391c.info("Event received: " + WrapUtils.wrapToTag(str) + ". With value: " + WrapUtils.wrapToTag(str2), new Object[0]);
        C1058wi c1058wi = this.f10396h;
        PublicLogger publicLogger = this.f10391c;
        Set set = AbstractC1049w9.f12924a;
        EnumC0508bb enumC0508bb = EnumC0508bb.EVENT_TYPE_UNDEFINED;
        M3 m32 = new M3(str2, str, 1, 0, publicLogger);
        Fh fh = this.f10390b;
        c1058wi.getClass();
        c1058wi.a(C1058wi.a(m32, fh), fh, 1, (Map) null);
    }

    public final Qn a(Throwable th) {
        Throwable th2;
        StackTraceElement[] stackTraceElementArr;
        if (th == null) {
            stackTraceElementArr = null;
            th2 = null;
        } else if (th instanceof N1) {
            stackTraceElementArr = th.getStackTrace();
            th2 = null;
        } else {
            th2 = th;
            stackTraceElementArr = null;
        }
        return Tn.a(th2, new V(null, null, this.f10398j.a()), stackTraceElementArr != null ? Arrays.asList(stackTraceElementArr) : null, (String) this.f10399k.f10638b.a(), (Boolean) this.f10399k.f10639c.a());
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, String str2, Throwable th) {
        C0994u6 c0994u6 = new C0994u6(new Dg(str2, a(th)), str);
        C1058wi c1058wi = this.f10396h;
        byte[] byteArray = MessageNano.toByteArray(this.f10394f.fromModel(c0994u6));
        PublicLogger publicLogger = this.f10391c;
        Set set = AbstractC1049w9.f12924a;
        EnumC0508bb enumC0508bb = EnumC0508bb.EVENT_TYPE_UNDEFINED;
        M3 m32 = new M3(byteArray, str2, 5896, publicLogger);
        Fh fh = this.f10390b;
        c1058wi.getClass();
        c1058wi.a(C1058wi.a(m32, fh), fh, 1, (Map) null);
        this.f10391c.info("Error received: id: %s, message: %s", WrapUtils.wrapToTag(str), WrapUtils.wrapToTag(str2));
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
        Qn a3 = this.f10400l.a(pluginErrorDetails);
        C1058wi c1058wi = this.f10396h;
        Gn gn = a3.f10850a;
        String str = gn != null ? (String) WrapUtils.getOrDefault(gn.f10341a, "") : "";
        byte[] byteArray = MessageNano.toByteArray(this.f10392d.fromModel(a3));
        PublicLogger publicLogger = this.f10391c;
        Set set = AbstractC1049w9.f12924a;
        EnumC0508bb enumC0508bb = EnumC0508bb.EVENT_TYPE_UNDEFINED;
        M3 m32 = new M3(byteArray, str, 5891, publicLogger);
        Fh fh = this.f10390b;
        c1058wi.getClass();
        c1058wi.a(C1058wi.a(m32, fh), fh, 1, (Map) null);
        this.f10391c.info("Crash from plugin received: %s", WrapUtils.wrapToTag(pluginErrorDetails.getMessage()));
    }

    @Override // io.appmetrica.analytics.impl.Da
    public final void b(String str) {
        C1058wi c1058wi = this.f10396h;
        P5 a3 = P5.a(str);
        Fh fh = this.f10390b;
        c1058wi.getClass();
        c1058wi.a(C1058wi.a(a3, fh), fh, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.impl.Da
    public final boolean b() {
        return this.f10390b.f();
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str, Map<String, Object> map) {
        C1058wi c1058wi = this.f10396h;
        PublicLogger publicLogger = this.f10391c;
        Set set = AbstractC1049w9.f12924a;
        EnumC0508bb enumC0508bb = EnumC0508bb.EVENT_TYPE_UNDEFINED;
        c1058wi.a(new M3("", str, 1, 0, publicLogger), this.f10390b, 1, map);
        PublicLogger publicLogger2 = this.f10391c;
        StringBuilder sb = new StringBuilder("Event received: ");
        sb.append(WrapUtils.wrapToTag(str));
        sb.append(". With value: ");
        sb.append(WrapUtils.wrapToTag(map == null ? null : map.toString()));
        publicLogger2.info(sb.toString(), new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.Ra, io.appmetrica.analytics.impl.Ua
    public final void a(Qn qn) {
        C1058wi c1058wi = this.f10396h;
        C1031vh a3 = c1058wi.a(qn, this.f10390b);
        Fh fh = a3.f12897e;
        Pl pl = c1058wi.f12948e;
        if (pl != null) {
            fh.f10356b.setUuid(((Ol) pl).g());
        } else {
            fh.getClass();
        }
        c1058wi.f12946c.b(a3);
        this.f10391c.info("Unhandled exception received: " + qn, new Object[0]);
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(PluginErrorDetails pluginErrorDetails, String str) {
        Qn qn;
        Je je = this.f10400l;
        if (pluginErrorDetails != null) {
            qn = je.a(pluginErrorDetails);
        } else {
            je.getClass();
            qn = null;
        }
        Dg dg = new Dg(str, qn);
        C1058wi c1058wi = this.f10396h;
        byte[] byteArray = MessageNano.toByteArray(this.f10393e.fromModel(dg));
        PublicLogger publicLogger = this.f10391c;
        Set set = AbstractC1049w9.f12924a;
        EnumC0508bb enumC0508bb = EnumC0508bb.EVENT_TYPE_UNDEFINED;
        M3 m32 = new M3(byteArray, str, 5896, publicLogger);
        Fh fh = this.f10390b;
        c1058wi.getClass();
        c1058wi.a(C1058wi.a(m32, fh), fh, 1, (Map) null);
        this.f10391c.info("Error from plugin received: %s", WrapUtils.wrapToTag(str));
    }

    @Override // io.appmetrica.analytics.impl.Ra, io.appmetrica.analytics.impl.InterfaceC0626g0
    public final void a(V v) {
        C0523c0 c0523c0 = new C0523c0(v, (String) this.f10399k.f10638b.a(), (Boolean) this.f10399k.f10639c.a());
        C1058wi c1058wi = this.f10396h;
        byte[] byteArray = MessageNano.toByteArray(this.f10395g.fromModel(c0523c0));
        PublicLogger publicLogger = this.f10391c;
        Set set = AbstractC1049w9.f12924a;
        EnumC0508bb enumC0508bb = EnumC0508bb.EVENT_TYPE_UNDEFINED;
        M3 m32 = new M3(byteArray, "", 5968, publicLogger);
        Fh fh = this.f10390b;
        c1058wi.getClass();
        String str = null;
        c1058wi.a(C1058wi.a(m32, fh), fh, 1, (Map) null);
        PublicLogger publicLogger2 = this.f10391c;
        StringBuilder sb = new StringBuilder("ANR was reported ");
        C1063wn c1063wn = v.f11074a;
        if (c1063wn != null) {
            str = "Thread[name=" + c1063wn.f12981a + ",tid={" + c1063wn.f12983c + ", priority=" + c1063wn.f12982b + ", group=" + c1063wn.f12984d + "}] at " + d3.i.g0(c1063wn.f12986f, IOUtils.LINE_SEPARATOR_UNIX, null, null, null, 62);
        }
        sb.append(str);
        publicLogger2.info(sb.toString(), new Object[0]);
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportEvent(ModuleEvent moduleEvent) {
        EnumC0790m9 enumC0790m9;
        if (n.contains(Integer.valueOf(moduleEvent.getType()))) {
            return;
        }
        PublicLogger publicLogger = this.f10391c;
        Set set = AbstractC1049w9.f12924a;
        String value = moduleEvent.getValue();
        String name = moduleEvent.getName();
        EnumC0508bb enumC0508bb = EnumC0508bb.EVENT_TYPE_UNDEFINED;
        M3 m32 = new M3(value, name, 8192, moduleEvent.getType(), publicLogger);
        int i4 = E8.f10246a[moduleEvent.getCategory().ordinal()];
        if (i4 == 1) {
            enumC0790m9 = EnumC0790m9.NATIVE;
        } else if (i4 == 2) {
            enumC0790m9 = EnumC0790m9.SYSTEM;
        } else {
            throw new G1.a();
        }
        m32.f10805l = enumC0790m9;
        m32.f10796c = AbstractC0637gb.b(moduleEvent.getEnvironment());
        if (moduleEvent.getExtras() != null) {
            m32.f10807p = moduleEvent.getExtras();
        }
        this.f10396h.a(m32, this.f10390b, moduleEvent.getServiceDataReporterType(), moduleEvent.getAttributes());
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        Qn qn;
        Je je = this.f10400l;
        if (pluginErrorDetails != null) {
            qn = je.a(pluginErrorDetails);
        } else {
            je.getClass();
            qn = null;
        }
        C0994u6 c0994u6 = new C0994u6(new Dg(str2, qn), str);
        C1058wi c1058wi = this.f10396h;
        byte[] byteArray = MessageNano.toByteArray(this.f10394f.fromModel(c0994u6));
        PublicLogger publicLogger = this.f10391c;
        Set set = AbstractC1049w9.f12924a;
        EnumC0508bb enumC0508bb = EnumC0508bb.EVENT_TYPE_UNDEFINED;
        M3 m32 = new M3(byteArray, str2, 5896, publicLogger);
        Fh fh = this.f10390b;
        c1058wi.getClass();
        c1058wi.a(C1058wi.a(m32, fh), fh, 1, (Map) null);
        this.f10391c.info("Error with identifier: %s from plugin received: %s", str, WrapUtils.wrapToTag(str2));
    }
}
