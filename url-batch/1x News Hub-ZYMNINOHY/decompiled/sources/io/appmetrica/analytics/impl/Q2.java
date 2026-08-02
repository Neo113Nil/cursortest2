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
public abstract class Q2 implements Ka {

    /* renamed from: n, reason: collision with root package name */
    public static final HashSet f6482n = new HashSet(Arrays.asList(1, 13));
    public static final O2 o = new O2();

    /* renamed from: a, reason: collision with root package name */
    protected final Context f6483a;

    /* renamed from: b, reason: collision with root package name */
    protected final Kh f6484b;

    /* renamed from: c, reason: collision with root package name */
    protected final PublicLogger f6485c;

    /* renamed from: d, reason: collision with root package name */
    protected final Tn f6486d;

    /* renamed from: e, reason: collision with root package name */
    protected final Jg f6487e;
    protected final C6 f;

    /* renamed from: g, reason: collision with root package name */
    public final C0427d0 f6488g;

    /* renamed from: h, reason: collision with root package name */
    protected final Bi f6489h;

    /* renamed from: i, reason: collision with root package name */
    public C0903vb f6490i;

    /* renamed from: j, reason: collision with root package name */
    public final Hf f6491j;

    /* renamed from: k, reason: collision with root package name */
    public final T9 f6492k;

    /* renamed from: l, reason: collision with root package name */
    public final Oe f6493l;

    /* renamed from: m, reason: collision with root package name */
    public final C0578in f6494m;

    public Q2(Context context, Bi bi, Kh kh, T9 t9, C0975y6 c0975y6, Tn tn, Jg jg, C6 c6, C0427d0 c0427d0, Oe oe) {
        Context applicationContext = context.getApplicationContext();
        this.f6483a = applicationContext;
        this.f6489h = bi;
        this.f6484b = kh;
        this.f6492k = t9;
        this.f6486d = tn;
        this.f6487e = jg;
        this.f = c6;
        this.f6488g = c0427d0;
        this.f6493l = oe;
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(kh.b().getApiKey());
        this.f6485c = orCreatePublicLogger;
        if (AbstractC0507g3.a(kh.b().isLogEnabled())) {
            orCreatePublicLogger.setEnabled(true);
        }
        this.f6491j = c0975y6;
        this.f6494m = new C0578in(applicationContext);
    }

    public void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            this.f6485c.warning("Invalid Error Environment (key,value) pair: (%s,%s).", str, str2);
            return;
        }
        this.f6485c.info("Put error environment pair <%s, %s>", str, str2);
        Kh kh = this.f6484b;
        synchronized (kh) {
            I8 i8 = kh.f6234c;
            i8.f6141b.b(i8.f6140a, str, str2);
        }
    }

    public final void b(Map<String, String> map) {
        if (AbstractC0709no.a((Map) map)) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            a(entry.getKey(), entry.getValue());
        }
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void clearAppEnvironment() {
        String str;
        this.f6485c.info("Clear app environment", new Object[0]);
        Bi bi = this.f6489h;
        Kh kh = this.f6484b;
        bi.getClass();
        W5 n3 = U3.n();
        Gf gf = new Gf(kh.f6427a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(kh.f6428b);
        I8 i8 = kh.f6234c;
        synchronized (kh) {
            str = kh.f;
        }
        bi.a(new Ah(n3, false, 1, null, new Kh(gf, counterConfiguration, i8, str)));
    }

    public final void d(String str) {
        if (this.f6484b.f()) {
            return;
        }
        this.f6489h.f5827d.c();
        C0903vb c0903vb = this.f6490i;
        c0903vb.f8509a.removeCallbacks(c0903vb.f8511c, c0903vb.f8510b.f6484b.f6428b.getApiKey());
        this.f6484b.f6236e = true;
        Bi bi = this.f6489h;
        PublicLogger publicLogger = this.f6485c;
        Set set = D9.f5886a;
        EnumC0567ib enumC0567ib = EnumC0567ib.EVENT_TYPE_UNDEFINED;
        U3 u3 = new U3("", str, 3, 0, publicLogger);
        Kh kh = this.f6484b;
        bi.getClass();
        bi.a(Bi.a(u3, kh), kh, 1, (Map) null);
    }

    public final void e(String str) {
        this.f6489h.f5827d.b();
        C0903vb c0903vb = this.f6490i;
        C0903vb.a(c0903vb.f8509a, c0903vb.f8510b, c0903vb.f8511c);
        Bi bi = this.f6489h;
        PublicLogger publicLogger = this.f6485c;
        Set set = D9.f5886a;
        EnumC0567ib enumC0567ib = EnumC0567ib.EVENT_TYPE_UNDEFINED;
        U3 u3 = new U3("", str, 6400, 0, publicLogger);
        Kh kh = this.f6484b;
        bi.getClass();
        bi.a(Bi.a(u3, kh), kh, 1, (Map) null);
        this.f6484b.f6236e = false;
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
        C0907vf c0907vf;
        Bi bi = this.f6489h;
        Kh kh = this.f6484b;
        bi.getClass();
        C1009zf c1009zf = kh.f6235d;
        synchronized (kh) {
            str = kh.f;
        }
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(kh.f6428b.getApiKey());
        Set set = D9.f5886a;
        JSONObject jSONObject = new JSONObject();
        if (c1009zf != null && (c0907vf = c1009zf.f8688a) != null) {
            try {
                jSONObject.put("preloadInfo", c0907vf.c());
            } catch (Throwable unused) {
            }
        }
        String jSONObject2 = jSONObject.toString();
        EnumC0567ib enumC0567ib = EnumC0567ib.EVENT_TYPE_UNDEFINED;
        U3 u3 = new U3(jSONObject2, "", 6144, 0, orCreatePublicLogger);
        u3.c(str);
        bi.a(Bi.a(u3, kh), kh, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void pauseSession() {
        this.f6485c.info("Pause session", new Object[0]);
        d(null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void putAppEnvironmentValue(String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str)) {
            this.f6485c.warning("Invalid App Environment (key,value) pair: (%s,%s).", str, str2);
            return;
        }
        this.f6485c.info("Put app environment: <%s, %s>", str, str2);
        Bi bi = this.f6489h;
        Kh kh = this.f6484b;
        bi.getClass();
        W5 b3 = U3.b(str, str2);
        Gf gf = new Gf(kh.f6427a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(kh.f6428b);
        I8 i8 = kh.f6234c;
        synchronized (kh) {
            str3 = kh.f;
        }
        bi.a(new Ah(b3, false, 1, null, new Kh(gf, counterConfiguration, i8, str3)));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAdRevenue(AdRevenue adRevenue) {
        reportAdRevenue(adRevenue, false);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAnr(Map<Thread, StackTraceElement[]> map) {
        StackTraceElement[] stackTraceElementArr;
        C0452e0 c0452e0 = new C0452e0(new C0478f0(this, map));
        C0824sa c0824sa = new C0824sa();
        C0975y6 c0975y6 = C0585j4.l().f7592a;
        Thread a3 = c0452e0.a();
        Map map2 = null;
        try {
            stackTraceElementArr = c0452e0.b();
            if (stackTraceElementArr == null) {
                try {
                    stackTraceElementArr = a3.getStackTrace();
                } catch (SecurityException unused) {
                }
            }
        } catch (SecurityException unused2) {
            stackTraceElementArr = null;
        }
        C0992yn c0992yn = (C0992yn) c0824sa.apply(a3, stackTraceElementArr);
        ArrayList arrayList = new ArrayList();
        TreeMap treeMap = new TreeMap(new Dn());
        try {
            map2 = c0452e0.c();
        } catch (SecurityException unused3) {
        }
        if (map2 != null) {
            treeMap.putAll(map2);
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            Thread thread = (Thread) entry.getKey();
            if (thread != a3 && thread != null) {
                arrayList.add((C0992yn) c0824sa.apply(thread, (StackTraceElement[]) entry.getValue()));
            }
        }
        a(new V(c0992yn, arrayList, c0975y6.a()));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportECommerce(ECommerceEvent eCommerceEvent) {
        String str;
        this.f6485c.info("E-commerce event received: " + eCommerceEvent.getPublicDescription(), new Object[0]);
        Bi bi = this.f6489h;
        Kh kh = this.f6484b;
        bi.getClass();
        for (Ii ii : eCommerceEvent.toProto()) {
            U3 u3 = new U3(LoggerStorage.getOrCreatePublicLogger(kh.f6428b.getApiKey()));
            EnumC0567ib enumC0567ib = EnumC0567ib.EVENT_TYPE_UNDEFINED;
            u3.f6818d = 41000;
            u3.f6816b = u3.e(Base64Utils.compressBase64(MessageNano.toByteArray((MessageNano) ii.f6160a)));
            u3.f6820g = ii.f6161b.getBytesTruncated();
            Gf gf = new Gf(kh.f6427a);
            CounterConfiguration counterConfiguration = new CounterConfiguration(kh.f6428b);
            I8 i8 = kh.f6234c;
            synchronized (kh) {
                str = kh.f;
            }
            bi.a(new Ah(u3, false, 1, null, new Kh(gf, counterConfiguration, i8, str)));
        }
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, Throwable th) {
        Ig ig = new Ig(str, a(th));
        Bi bi = this.f6489h;
        byte[] byteArray = MessageNano.toByteArray(this.f6487e.fromModel(ig));
        PublicLogger publicLogger = this.f6485c;
        Set set = D9.f5886a;
        EnumC0567ib enumC0567ib = EnumC0567ib.EVENT_TYPE_UNDEFINED;
        U3 u3 = new U3(byteArray, str, 5892, publicLogger);
        Kh kh = this.f6484b;
        bi.getClass();
        bi.a(Bi.a(u3, kh), kh, 1, (Map) null);
        this.f6485c.info("Error received: %s", WrapUtils.wrapToTag(str));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str) {
        this.f6485c.info("Event received: " + WrapUtils.wrapToTag(str), new Object[0]);
        Bi bi = this.f6489h;
        PublicLogger publicLogger = this.f6485c;
        Set set = D9.f5886a;
        EnumC0567ib enumC0567ib = EnumC0567ib.EVENT_TYPE_UNDEFINED;
        U3 u3 = new U3("", str, 1, 0, publicLogger);
        Kh kh = this.f6484b;
        bi.getClass();
        bi.a(Bi.a(u3, kh), kh, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportRevenue(Revenue revenue) {
        String str;
        Si si = P2.f6426a;
        si.getClass();
        C0838so a3 = si.a(revenue);
        if (!a3.f8327a) {
            this.f6485c.warning("Passed revenue is not valid. Reason: " + a3.f8328b, new Object[0]);
            return;
        }
        Bi bi = this.f6489h;
        Ti ti = new Ti(revenue, this.f6485c);
        Kh kh = this.f6484b;
        bi.getClass();
        U3 a4 = U3.a(LoggerStorage.getOrCreatePublicLogger(kh.f6428b.getApiKey()), ti);
        Gf gf = new Gf(kh.f6427a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(kh.f6428b);
        I8 i8 = kh.f6234c;
        synchronized (kh) {
            str = kh.f;
        }
        bi.a(new Ah(a4, false, 1, null, new Kh(gf, counterConfiguration, i8, str)));
        this.f6485c.info("Revenue received for productID: " + WrapUtils.wrapToTag(revenue.productID) + " of quantity: " + WrapUtils.wrapToTag(revenue.quantity) + " with price (in micros): " + revenue.priceMicros + " " + revenue.currency, new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUnhandledException(Throwable th) {
        Sn a3 = Vn.a(th, new V(null, null, this.f6491j.a()), null, (String) this.f6492k.f6696b.a(), (Boolean) this.f6492k.f6697c.a());
        Bi bi = this.f6489h;
        bi.a(bi.a(a3, this.f6484b));
        this.f6485c.info("Unhandled exception received: " + a3, new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUserProfile(UserProfile userProfile) {
        String str;
        C0502fo c0502fo = new C0502fo(C0502fo.f7339c);
        Iterator<UserProfileUpdate<? extends InterfaceC0528go>> it = userProfile.getUserProfileUpdates().iterator();
        while (it.hasNext()) {
            InterfaceC0528go userProfileUpdatePatcher = it.next().getUserProfileUpdatePatcher();
            ((Hd) userProfileUpdatePatcher).f6084e = this.f6485c;
            userProfileUpdatePatcher.a(c0502fo);
        }
        C0631ko c0631ko = new C0631ko();
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < c0502fo.f7340a.size(); i3++) {
            SparseArray sparseArray = c0502fo.f7340a;
            Iterator it2 = ((HashMap) sparseArray.get(sparseArray.keyAt(i3))).values().iterator();
            while (it2.hasNext()) {
                arrayList.add((C0554ho) it2.next());
            }
        }
        c0631ko.f7746a = (C0554ho[]) arrayList.toArray(new C0554ho[arrayList.size()]);
        C0838so a3 = o.a(c0631ko);
        if (!a3.f8327a) {
            this.f6485c.warning("UserInfo wasn't sent because " + a3.f8328b, new Object[0]);
            return;
        }
        Bi bi = this.f6489h;
        Kh kh = this.f6484b;
        bi.getClass();
        W5 a4 = U3.a(c0631ko);
        Gf gf = new Gf(kh.f6427a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(kh.f6428b);
        I8 i8 = kh.f6234c;
        synchronized (kh) {
            str = kh.f;
        }
        bi.a(new Ah(a4, false, 1, null, new Kh(gf, counterConfiguration, i8, str)));
        this.f6485c.info("User profile received", new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void resumeSession() {
        e(null);
        this.f6485c.info("Resume session", new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter, io.appmetrica.analytics.IModuleReporter
    public final void sendEventsBuffer() {
        this.f6485c.info("Send event buffer", new Object[0]);
        Bi bi = this.f6489h;
        EnumC0567ib enumC0567ib = EnumC0567ib.EVENT_TYPE_UNDEFINED;
        PublicLogger publicLogger = this.f6485c;
        Set set = D9.f5886a;
        U3 u3 = new U3("", "", 256, 0, publicLogger);
        Kh kh = this.f6484b;
        bi.getClass();
        bi.a(Bi.a(u3, kh), kh, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setDataSendingEnabled(boolean z) {
        this.f6484b.f6428b.setDataSendingEnabled(z);
        this.f6485c.info("Updated data sending enabled: %s", Boolean.valueOf(z));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void setSessionExtra(String str, byte[] bArr) {
        Bi bi = this.f6489h;
        PublicLogger publicLogger = this.f6485c;
        Set set = D9.f5886a;
        EnumC0567ib enumC0567ib = EnumC0567ib.EVENT_TYPE_UNDEFINED;
        U3 u3 = new U3("", null, 8193, 0, publicLogger);
        if (bArr == null) {
            bArr = new byte[0];
        }
        u3.f6828p = Collections.singletonMap(str, bArr);
        Kh kh = this.f6484b;
        bi.getClass();
        bi.a(Bi.a(u3, kh), kh, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setUserProfileID(String str) {
        String str2;
        Bi bi = this.f6489h;
        Kh kh = this.f6484b;
        bi.getClass();
        U3 u3 = new U3(LoggerStorage.getOrCreatePublicLogger(kh.f6428b.getApiKey()));
        EnumC0567ib enumC0567ib = EnumC0567ib.EVENT_TYPE_UNDEFINED;
        u3.f6818d = 40962;
        u3.c(str);
        u3.f6816b = u3.e(str);
        Gf gf = new Gf(kh.f6427a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(kh.f6428b);
        I8 i8 = kh.f6234c;
        synchronized (kh) {
            str2 = kh.f;
        }
        bi.a(new Ah(u3, false, 1, null, new Kh(gf, counterConfiguration, i8, str2)));
        this.f6485c.info("Set user profile ID: " + WrapUtils.wrapToTag(str), new Object[0]);
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportAdRevenue(AdRevenue adRevenue, boolean z) {
        String str;
        Bi bi = this.f6489h;
        E e3 = new E(adRevenue, z, this.f6494m, this.f6485c);
        Kh kh = this.f6484b;
        bi.getClass();
        U3 a3 = U3.a(LoggerStorage.getOrCreatePublicLogger(kh.f6428b.getApiKey()), e3);
        Gf gf = new Gf(kh.f6427a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(kh.f6428b);
        I8 i8 = kh.f6234c;
        synchronized (kh) {
            str = kh.f;
        }
        bi.a(new Ah(a3, false, 1, null, new Kh(gf, counterConfiguration, i8, str)));
        this.f6485c.info("AdRevenue Received: AdRevenue{adRevenue=" + adRevenue.adRevenue + ", currency='" + WrapUtils.wrapToTag(adRevenue.currency.getCurrencyCode()) + "', adType=" + WrapUtils.wrapToTag(adRevenue.adType) + ", adNetwork='" + WrapUtils.wrapToTag(adRevenue.adNetwork) + "', adUnitId='" + WrapUtils.wrapToTag(adRevenue.adUnitId) + "', adUnitName='" + WrapUtils.wrapToTag(adRevenue.adUnitName) + "', adPlacementId='" + WrapUtils.wrapToTag(adRevenue.adPlacementId) + "', adPlacementName='" + WrapUtils.wrapToTag(adRevenue.adPlacementName) + "', precision='" + WrapUtils.wrapToTag(adRevenue.precision) + "', payload=" + AbstractC0696nb.b(adRevenue.payload) + ", autoCollected=" + z + "}", new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.Ka
    public final void b(String str, String str2) {
        this.f6485c.info("Event received: " + WrapUtils.wrapToTag(str) + ". With value: " + WrapUtils.wrapToTag(str2), new Object[0]);
        Bi bi = this.f6489h;
        PublicLogger publicLogger = this.f6485c;
        Set set = D9.f5886a;
        EnumC0567ib enumC0567ib = EnumC0567ib.EVENT_TYPE_UNDEFINED;
        U3 u3 = new U3(str2, str, 1, 0, publicLogger);
        u3.f6825l = EnumC0849t9.JS;
        Kh kh = this.f6484b;
        bi.getClass();
        bi.a(Bi.a(u3, kh), kh, 1, (Map) null);
    }

    public final void a(Map<String, String> map) {
        if (AbstractC0709no.a((Map) map)) {
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
        this.f6485c.info("Event received: " + WrapUtils.wrapToTag(str) + ". With value: " + WrapUtils.wrapToTag(str2), new Object[0]);
        Bi bi = this.f6489h;
        PublicLogger publicLogger = this.f6485c;
        Set set = D9.f5886a;
        EnumC0567ib enumC0567ib = EnumC0567ib.EVENT_TYPE_UNDEFINED;
        U3 u3 = new U3(str2, str, 1, 0, publicLogger);
        Kh kh = this.f6484b;
        bi.getClass();
        bi.a(Bi.a(u3, kh), kh, 1, (Map) null);
    }

    public final Sn a(Throwable th) {
        Throwable th2;
        StackTraceElement[] stackTraceElementArr;
        if (th == null) {
            stackTraceElementArr = null;
            th2 = null;
        } else if (th instanceof W1) {
            stackTraceElementArr = th.getStackTrace();
            th2 = null;
        } else {
            th2 = th;
            stackTraceElementArr = null;
        }
        return Vn.a(th2, new V(null, null, this.f6491j.a()), stackTraceElementArr != null ? Arrays.asList(stackTraceElementArr) : null, (String) this.f6492k.f6696b.a(), (Boolean) this.f6492k.f6697c.a());
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, String str2, Throwable th) {
        B6 b6 = new B6(new Ig(str2, a(th)), str);
        Bi bi = this.f6489h;
        byte[] byteArray = MessageNano.toByteArray(this.f.fromModel(b6));
        PublicLogger publicLogger = this.f6485c;
        Set set = D9.f5886a;
        EnumC0567ib enumC0567ib = EnumC0567ib.EVENT_TYPE_UNDEFINED;
        U3 u3 = new U3(byteArray, str2, 5896, publicLogger);
        Kh kh = this.f6484b;
        bi.getClass();
        bi.a(Bi.a(u3, kh), kh, 1, (Map) null);
        this.f6485c.info("Error received: id: %s, message: %s", WrapUtils.wrapToTag(str), WrapUtils.wrapToTag(str2));
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
        Sn a3 = this.f6493l.a(pluginErrorDetails);
        Bi bi = this.f6489h;
        In in = a3.f6664a;
        String str = in != null ? (String) WrapUtils.getOrDefault(in.f6176a, "") : "";
        byte[] byteArray = MessageNano.toByteArray(this.f6486d.fromModel(a3));
        PublicLogger publicLogger = this.f6485c;
        Set set = D9.f5886a;
        EnumC0567ib enumC0567ib = EnumC0567ib.EVENT_TYPE_UNDEFINED;
        U3 u3 = new U3(byteArray, str, 5891, publicLogger);
        Kh kh = this.f6484b;
        bi.getClass();
        bi.a(Bi.a(u3, kh), kh, 1, (Map) null);
        this.f6485c.info("Crash from plugin received: %s", WrapUtils.wrapToTag(pluginErrorDetails.getMessage()));
    }

    @Override // io.appmetrica.analytics.impl.Ka
    public final void b(String str) {
        Bi bi = this.f6489h;
        W5 a3 = W5.a(str);
        Kh kh = this.f6484b;
        bi.getClass();
        bi.a(Bi.a(a3, kh), kh, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.impl.Ka
    public final boolean b() {
        return this.f6484b.f();
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str, Map<String, Object> map) {
        Bi bi = this.f6489h;
        PublicLogger publicLogger = this.f6485c;
        Set set = D9.f5886a;
        EnumC0567ib enumC0567ib = EnumC0567ib.EVENT_TYPE_UNDEFINED;
        bi.a(new U3("", str, 1, 0, publicLogger), this.f6484b, 1, map);
        PublicLogger publicLogger2 = this.f6485c;
        StringBuilder sb = new StringBuilder("Event received: ");
        sb.append(WrapUtils.wrapToTag(str));
        sb.append(". With value: ");
        sb.append(WrapUtils.wrapToTag(map == null ? null : map.toString()));
        publicLogger2.info(sb.toString(), new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.Ya, io.appmetrica.analytics.impl.InterfaceC0386bb
    public final void a(Sn sn) {
        Bi bi = this.f6489h;
        Ah a3 = bi.a(sn, this.f6484b);
        Kh kh = a3.f5757e;
        Tl tl = bi.f5828e;
        if (tl != null) {
            kh.f6428b.setUuid(((Sl) tl).g());
        } else {
            kh.getClass();
        }
        bi.f5826c.b(a3);
        this.f6485c.info("Unhandled exception received: " + sn, new Object[0]);
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(PluginErrorDetails pluginErrorDetails, String str) {
        Sn sn;
        Oe oe = this.f6493l;
        if (pluginErrorDetails != null) {
            sn = oe.a(pluginErrorDetails);
        } else {
            oe.getClass();
            sn = null;
        }
        Ig ig = new Ig(str, sn);
        Bi bi = this.f6489h;
        byte[] byteArray = MessageNano.toByteArray(this.f6487e.fromModel(ig));
        PublicLogger publicLogger = this.f6485c;
        Set set = D9.f5886a;
        EnumC0567ib enumC0567ib = EnumC0567ib.EVENT_TYPE_UNDEFINED;
        U3 u3 = new U3(byteArray, str, 5896, publicLogger);
        Kh kh = this.f6484b;
        bi.getClass();
        bi.a(Bi.a(u3, kh), kh, 1, (Map) null);
        this.f6485c.info("Error from plugin received: %s", WrapUtils.wrapToTag(str));
    }

    @Override // io.appmetrica.analytics.impl.Ya, io.appmetrica.analytics.impl.InterfaceC0504g0
    public final void a(V v) {
        C0401c0 c0401c0 = new C0401c0(v, (String) this.f6492k.f6696b.a(), (Boolean) this.f6492k.f6697c.a());
        Bi bi = this.f6489h;
        byte[] byteArray = MessageNano.toByteArray(this.f6488g.fromModel(c0401c0));
        PublicLogger publicLogger = this.f6485c;
        Set set = D9.f5886a;
        EnumC0567ib enumC0567ib = EnumC0567ib.EVENT_TYPE_UNDEFINED;
        U3 u3 = new U3(byteArray, "", 5968, publicLogger);
        Kh kh = this.f6484b;
        bi.getClass();
        String str = null;
        bi.a(Bi.a(u3, kh), kh, 1, (Map) null);
        PublicLogger publicLogger2 = this.f6485c;
        StringBuilder sb = new StringBuilder("ANR was reported ");
        C0992yn c0992yn = v.f6775a;
        if (c0992yn != null) {
            str = "Thread[name=" + c0992yn.f8649a + ",tid={" + c0992yn.f8651c + ", priority=" + c0992yn.f8650b + ", group=" + c0992yn.f8652d + "}] at " + c2.e.S(c0992yn.f, IOUtils.LINE_SEPARATOR_UNIX, null, null, null, 62);
        }
        sb.append(str);
        publicLogger2.info(sb.toString(), new Object[0]);
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportEvent(ModuleEvent moduleEvent) {
        EnumC0849t9 enumC0849t9;
        if (f6482n.contains(Integer.valueOf(moduleEvent.getType()))) {
            return;
        }
        PublicLogger publicLogger = this.f6485c;
        Set set = D9.f5886a;
        String value = moduleEvent.getValue();
        String name = moduleEvent.getName();
        EnumC0567ib enumC0567ib = EnumC0567ib.EVENT_TYPE_UNDEFINED;
        U3 u3 = new U3(value, name, 8192, moduleEvent.getType(), publicLogger);
        int i3 = J8.f6200a[moduleEvent.getCategory().ordinal()];
        if (i3 == 1) {
            enumC0849t9 = EnumC0849t9.NATIVE;
        } else if (i3 == 2) {
            enumC0849t9 = EnumC0849t9.SYSTEM;
        } else {
            throw new O0.b();
        }
        u3.f6825l = enumC0849t9;
        u3.f6817c = AbstractC0696nb.b(moduleEvent.getEnvironment());
        if (moduleEvent.getExtras() != null) {
            u3.f6828p = moduleEvent.getExtras();
        }
        this.f6489h.a(u3, this.f6484b, moduleEvent.getServiceDataReporterType(), moduleEvent.getAttributes());
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        Sn sn;
        Oe oe = this.f6493l;
        if (pluginErrorDetails != null) {
            sn = oe.a(pluginErrorDetails);
        } else {
            oe.getClass();
            sn = null;
        }
        B6 b6 = new B6(new Ig(str2, sn), str);
        Bi bi = this.f6489h;
        byte[] byteArray = MessageNano.toByteArray(this.f.fromModel(b6));
        PublicLogger publicLogger = this.f6485c;
        Set set = D9.f5886a;
        EnumC0567ib enumC0567ib = EnumC0567ib.EVENT_TYPE_UNDEFINED;
        U3 u3 = new U3(byteArray, str2, 5896, publicLogger);
        Kh kh = this.f6484b;
        bi.getClass();
        bi.a(Bi.a(u3, kh), kh, 1, (Map) null);
        this.f6485c.info("Error with identifier: %s from plugin received: %s", str, WrapUtils.wrapToTag(str2));
    }
}
