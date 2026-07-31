package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
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
import kotlin.collections.CollectionsKt;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class V2 implements Ya {

    /* renamed from: n, reason: collision with root package name */
    public static final HashSet f38389n = new HashSet(Arrays.asList(1, 13));

    /* renamed from: o, reason: collision with root package name */
    public static final T2 f38390o = new T2();

    /* renamed from: a, reason: collision with root package name */
    protected final Context f38391a;

    /* renamed from: b, reason: collision with root package name */
    protected final Sh f38392b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    protected final PublicLogger f38393c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    protected final On f38394d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    protected final Rg f38395e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    protected final Q6 f38396f;

    /* renamed from: g, reason: collision with root package name */
    public final C2504b0 f38397g;

    /* renamed from: h, reason: collision with root package name */
    protected final Ji f38398h;

    /* renamed from: i, reason: collision with root package name */
    public Jb f38399i;

    /* renamed from: j, reason: collision with root package name */
    public final M6 f38400j;

    /* renamed from: k, reason: collision with root package name */
    public final C2674ha f38401k;

    /* renamed from: l, reason: collision with root package name */
    public final Xe f38402l;

    /* renamed from: m, reason: collision with root package name */
    public final C2607en f38403m;

    public V2(Context context, Ji ji, Sh sh, C2674ha c2674ha, M6 m6, On on, Rg rg, Q6 q6, C2504b0 c2504b0, Xe xe) {
        Context applicationContext = context.getApplicationContext();
        this.f38391a = applicationContext;
        this.f38398h = ji;
        this.f38392b = sh;
        this.f38401k = c2674ha;
        this.f38394d = on;
        this.f38395e = rg;
        this.f38396f = q6;
        this.f38397g = c2504b0;
        this.f38402l = xe;
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(sh.b().getApiKey());
        this.f38393c = orCreatePublicLogger;
        if (AbstractC3003u3.a(sh.b().isLogEnabled())) {
            orCreatePublicLogger.setEnabled(true);
        }
        this.f38400j = m6;
        this.f38403m = new C2607en(applicationContext);
    }

    public void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            this.f38393c.warning("Invalid Error Environment (key,value) pair: (%s,%s).", str, str2);
            return;
        }
        this.f38393c.info("Put error environment pair <%s, %s>", str, str2);
        Sh sh = this.f38392b;
        synchronized (sh) {
            W8 w8 = sh.f38256c;
            w8.f38460b.b(w8.f38459a, str, str2);
        }
    }

    public final void b(Map<String, String> map) {
        if (AbstractC2713io.a((Map) map)) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            a(entry.getKey(), entry.getValue());
        }
    }

    public final void c(String str) {
        if (this.f38392b.f()) {
            return;
        }
        this.f38398h.f37842d.c();
        Jb jb = this.f38399i;
        jb.f37827a.removeCallbacks(jb.f37829c, jb.f37828b.f38392b.f38818b.getApiKey());
        this.f38392b.f38258e = true;
        Ji ji = this.f38398h;
        PublicLogger publicLogger = this.f38393c;
        Set set = R9.f38186a;
        EnumC3063wb enumC3063wb = EnumC3063wb.EVENT_TYPE_UNDEFINED;
        C2694i4 c2694i4 = new C2694i4("", str, 3, 0, publicLogger);
        Sh sh = this.f38392b;
        ji.getClass();
        ji.a(Ji.a(c2694i4, sh), sh, 1, null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void clearAppEnvironment() {
        String str;
        this.f38393c.info("Clear app environment", new Object[0]);
        Ji ji = this.f38398h;
        Sh sh = this.f38392b;
        ji.getClass();
        C2773l6 n4 = C2694i4.n();
        Pf pf = new Pf(sh.f38817a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(sh.f38818b);
        W8 w8 = sh.f38256c;
        synchronized (sh) {
            str = sh.f38259f;
        }
        ji.a(new Ih(n4, false, 1, null, new Sh(pf, counterConfiguration, w8, str)));
    }

    public final void d(String str) {
        this.f38398h.f37842d.b();
        Jb jb = this.f38399i;
        Jb.a(jb.f37827a, jb.f37828b, jb.f37829c);
        Ji ji = this.f38398h;
        PublicLogger publicLogger = this.f38393c;
        Set set = R9.f38186a;
        EnumC3063wb enumC3063wb = EnumC3063wb.EVENT_TYPE_UNDEFINED;
        C2694i4 c2694i4 = new C2694i4("", str, 6400, 0, publicLogger);
        Sh sh = this.f38392b;
        ji.getClass();
        ji.a(Ji.a(c2694i4, sh), sh, 1, null);
        this.f38392b.f38258e = false;
    }

    @Override // io.appmetrica.analytics.IReporter
    @NonNull
    public final IPluginReporter getPluginExtension() {
        return this;
    }

    public String j() {
        return "[BaseReporter]";
    }

    public void k() {
        String str;
        Ef ef;
        Ji ji = this.f38398h;
        Sh sh = this.f38392b;
        ji.getClass();
        If r22 = sh.f38257d;
        synchronized (sh) {
            str = sh.f38259f;
        }
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(sh.f38818b.getApiKey());
        Set set = R9.f38186a;
        JSONObject jSONObject = new JSONObject();
        if (r22 != null && (ef = r22.f37762a) != null) {
            try {
                jSONObject.put("preloadInfo", ef.c());
            } catch (Throwable unused) {
            }
        }
        String jSONObject2 = jSONObject.toString();
        EnumC3063wb enumC3063wb = EnumC3063wb.EVENT_TYPE_UNDEFINED;
        C2694i4 c2694i4 = new C2694i4(jSONObject2, "", 6144, 0, orCreatePublicLogger);
        c2694i4.c(str);
        ji.a(Ji.a(c2694i4, sh), sh, 1, null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void pauseSession() {
        this.f38393c.info("Pause session", new Object[0]);
        c(null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void putAppEnvironmentValue(String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str)) {
            this.f38393c.warning("Invalid App Environment (key,value) pair: (%s,%s).", str, str2);
            return;
        }
        this.f38393c.info("Put app environment: <%s, %s>", str, str2);
        Ji ji = this.f38398h;
        Sh sh = this.f38392b;
        ji.getClass();
        C2773l6 b4 = C2694i4.b(str, str2);
        Pf pf = new Pf(sh.f38817a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(sh.f38818b);
        W8 w8 = sh.f38256c;
        synchronized (sh) {
            str3 = sh.f38259f;
        }
        ji.a(new Ih(b4, false, 1, null, new Sh(pf, counterConfiguration, w8, str3)));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAdRevenue(@NonNull AdRevenue adRevenue) {
        reportAdRevenue(adRevenue, false);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAnr(@NonNull Map<Thread, StackTraceElement[]> map) {
        StackTraceElement[] stackTraceElementArr;
        C2531c0 c2531c0 = new C2531c0(new C2558d0(this, map));
        Ga ga = new Ga();
        M6 m6 = C3082x4.l().f40116a;
        Thread a4 = c2531c0.a();
        Map map2 = null;
        try {
            stackTraceElementArr = c2531c0.b();
            if (stackTraceElementArr == null) {
                try {
                    stackTraceElementArr = a4.getStackTrace();
                } catch (SecurityException unused) {
                }
            }
        } catch (SecurityException unused2) {
            stackTraceElementArr = null;
        }
        C2997tn c2997tn = (C2997tn) ga.apply(a4, stackTraceElementArr);
        ArrayList arrayList = new ArrayList();
        TreeMap treeMap = new TreeMap(new C3127yn());
        try {
            map2 = c2531c0.c();
        } catch (SecurityException unused3) {
        }
        if (map2 != null) {
            treeMap.putAll(map2);
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            Thread thread = (Thread) entry.getKey();
            if (thread != a4 && thread != null) {
                arrayList.add((C2997tn) ga.apply(thread, (StackTraceElement[]) entry.getValue()));
            }
        }
        a(new U(c2997tn, arrayList, m6.b()));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportECommerce(@NonNull ECommerceEvent eCommerceEvent) {
        String str;
        this.f38393c.info("E-commerce event received: " + eCommerceEvent.getPublicDescription(), new Object[0]);
        Ji ji = this.f38398h;
        Sh sh = this.f38392b;
        ji.getClass();
        for (Qi qi : eCommerceEvent.toProto()) {
            C2694i4 c2694i4 = new C2694i4(LoggerStorage.getOrCreatePublicLogger(sh.f38818b.getApiKey()));
            EnumC3063wb enumC3063wb = EnumC3063wb.EVENT_TYPE_UNDEFINED;
            c2694i4.f39379d = 41000;
            c2694i4.f39377b = c2694i4.e(Base64Utils.compressBase64(MessageNano.toByteArray((MessageNano) qi.f38171a)));
            c2694i4.f39382g = qi.f38172b.getBytesTruncated();
            Pf pf = new Pf(sh.f38817a);
            CounterConfiguration counterConfiguration = new CounterConfiguration(sh.f38818b);
            W8 w8 = sh.f38256c;
            synchronized (sh) {
                str = sh.f38259f;
            }
            ji.a(new Ih(c2694i4, false, 1, null, new Sh(pf, counterConfiguration, w8, str)));
        }
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, Throwable th) {
        Qg qg = new Qg(str, a(th));
        Ji ji = this.f38398h;
        byte[] byteArray = MessageNano.toByteArray(this.f38395e.fromModel(qg));
        PublicLogger publicLogger = this.f38393c;
        Set set = R9.f38186a;
        EnumC3063wb enumC3063wb = EnumC3063wb.EVENT_TYPE_UNDEFINED;
        C2694i4 c2694i4 = new C2694i4(byteArray, str, 5892, publicLogger);
        Sh sh = this.f38392b;
        ji.getClass();
        ji.a(Ji.a(c2694i4, sh), sh, 1, null);
        this.f38393c.info("Error received: %s", WrapUtils.wrapToTag(str));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str) {
        this.f38393c.info("Event received: " + WrapUtils.wrapToTag(str), new Object[0]);
        Ji ji = this.f38398h;
        PublicLogger publicLogger = this.f38393c;
        Set set = R9.f38186a;
        EnumC3063wb enumC3063wb = EnumC3063wb.EVENT_TYPE_UNDEFINED;
        C2694i4 c2694i4 = new C2694i4("", str, 1, 0, publicLogger);
        Sh sh = this.f38392b;
        ji.getClass();
        ji.a(Ji.a(c2694i4, sh), sh, 1, null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportRevenue(@NonNull Revenue revenue) {
        String str;
        C2496aj c2496aj = U2.f38347a;
        c2496aj.getClass();
        C2843no a4 = c2496aj.a(revenue);
        if (!a4.f39527a) {
            this.f38393c.warning("Passed revenue is not valid. Reason: " + a4.f39528b, new Object[0]);
            return;
        }
        Ji ji = this.f38398h;
        C2523bj c2523bj = new C2523bj(revenue, this.f38393c);
        Sh sh = this.f38392b;
        ji.getClass();
        C2694i4 a5 = C2694i4.a(LoggerStorage.getOrCreatePublicLogger(sh.f38818b.getApiKey()), c2523bj);
        Pf pf = new Pf(sh.f38817a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(sh.f38818b);
        W8 w8 = sh.f38256c;
        synchronized (sh) {
            str = sh.f38259f;
        }
        ji.a(new Ih(a5, false, 1, null, new Sh(pf, counterConfiguration, w8, str)));
        this.f38393c.info("Revenue received for productID: " + WrapUtils.wrapToTag(revenue.productID) + " of quantity: " + WrapUtils.wrapToTag(revenue.quantity) + " with price (in micros): " + revenue.priceMicros + " " + revenue.currency, new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUnhandledException(@NonNull Throwable th) {
        Nn a4 = Qn.a(th, new U(null, null, this.f38400j.b()), null, (String) this.f38401k.f39136b.a(), (Boolean) this.f38401k.f39137c.a());
        Ji ji = this.f38398h;
        ji.a(ji.a(a4, this.f38392b));
        this.f38393c.info("Unhandled exception received: " + a4, new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUserProfile(@NonNull UserProfile userProfile) {
        String str;
        C2501ao c2501ao = new C2501ao(C2501ao.f38684c);
        Iterator<UserProfileUpdate<? extends InterfaceC2528bo>> it = userProfile.getUserProfileUpdates().iterator();
        while (it.hasNext()) {
            InterfaceC2528bo userProfileUpdatePatcher = it.next().getUserProfileUpdatePatcher();
            ((Pd) userProfileUpdatePatcher).f38130e = this.f38393c;
            userProfileUpdatePatcher.a(c2501ao);
        }
        C2635fo c2635fo = new C2635fo();
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < c2501ao.f38685a.size(); i4++) {
            SparseArray sparseArray = c2501ao.f38685a;
            Iterator it2 = ((HashMap) sparseArray.get(sparseArray.keyAt(i4))).values().iterator();
            while (it2.hasNext()) {
                arrayList.add((C2555co) it2.next());
            }
        }
        c2635fo.f39012a = (C2555co[]) arrayList.toArray(new C2555co[arrayList.size()]);
        C2843no a4 = f38390o.a(c2635fo);
        if (!a4.f39527a) {
            this.f38393c.warning("UserInfo wasn't sent because " + a4.f39528b, new Object[0]);
            return;
        }
        Ji ji = this.f38398h;
        Sh sh = this.f38392b;
        ji.getClass();
        C2773l6 a5 = C2694i4.a(c2635fo);
        Pf pf = new Pf(sh.f38817a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(sh.f38818b);
        W8 w8 = sh.f38256c;
        synchronized (sh) {
            str = sh.f38259f;
        }
        ji.a(new Ih(a5, false, 1, null, new Sh(pf, counterConfiguration, w8, str)));
        this.f38393c.info("User profile received", new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void resumeSession() {
        d(null);
        this.f38393c.info("Resume session", new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter, io.appmetrica.analytics.IModuleReporter
    public final void sendEventsBuffer() {
        this.f38393c.info("Send event buffer", new Object[0]);
        Ji ji = this.f38398h;
        EnumC3063wb enumC3063wb = EnumC3063wb.EVENT_TYPE_UNDEFINED;
        PublicLogger publicLogger = this.f38393c;
        Set set = R9.f38186a;
        C2694i4 c2694i4 = new C2694i4("", "", UserVerificationMethods.USER_VERIFY_HANDPRINT, 0, publicLogger);
        Sh sh = this.f38392b;
        ji.getClass();
        ji.a(Ji.a(c2694i4, sh), sh, 1, null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setDataSendingEnabled(boolean z4) {
        this.f38392b.f38818b.setDataSendingEnabled(z4);
        this.f38393c.info("Updated data sending enabled: %s", Boolean.valueOf(z4));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void setSessionExtra(@NonNull String str, byte[] bArr) {
        Ji ji = this.f38398h;
        PublicLogger publicLogger = this.f38393c;
        Set set = R9.f38186a;
        EnumC3063wb enumC3063wb = EnumC3063wb.EVENT_TYPE_UNDEFINED;
        C2694i4 c2694i4 = new C2694i4("", null, 8193, 0, publicLogger);
        if (bArr == null) {
            bArr = new byte[0];
        }
        c2694i4.f39391p = Collections.singletonMap(str, bArr);
        Sh sh = this.f38392b;
        ji.getClass();
        ji.a(Ji.a(c2694i4, sh), sh, 1, null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setUserProfileID(String str) {
        String str2;
        Ji ji = this.f38398h;
        Sh sh = this.f38392b;
        ji.getClass();
        C2694i4 c2694i4 = new C2694i4(LoggerStorage.getOrCreatePublicLogger(sh.f38818b.getApiKey()));
        EnumC3063wb enumC3063wb = EnumC3063wb.EVENT_TYPE_UNDEFINED;
        c2694i4.f39379d = 40962;
        c2694i4.c(str);
        c2694i4.f39377b = c2694i4.e(str);
        Pf pf = new Pf(sh.f38817a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(sh.f38818b);
        W8 w8 = sh.f38256c;
        synchronized (sh) {
            str2 = sh.f38259f;
        }
        ji.a(new Ih(c2694i4, false, 1, null, new Sh(pf, counterConfiguration, w8, str2)));
        this.f38393c.info("Set user profile ID: " + WrapUtils.wrapToTag(str), new Object[0]);
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportAdRevenue(@NonNull AdRevenue adRevenue, boolean z4) {
        String str;
        Ji ji = this.f38398h;
        D d4 = new D(adRevenue, z4, this.f38403m, this.f38393c);
        Sh sh = this.f38392b;
        ji.getClass();
        C2694i4 a4 = C2694i4.a(LoggerStorage.getOrCreatePublicLogger(sh.f38818b.getApiKey()), d4);
        Pf pf = new Pf(sh.f38817a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(sh.f38818b);
        W8 w8 = sh.f38256c;
        synchronized (sh) {
            str = sh.f38259f;
        }
        ji.a(new Ih(a4, false, 1, null, new Sh(pf, counterConfiguration, w8, str)));
        this.f38393c.info("AdRevenue Received: AdRevenue{adRevenue=" + adRevenue.adRevenue + ", currency='" + WrapUtils.wrapToTag(adRevenue.currency.getCurrencyCode()) + "', adType=" + WrapUtils.wrapToTag(adRevenue.adType) + ", adNetwork='" + WrapUtils.wrapToTag(adRevenue.adNetwork) + "', adUnitId='" + WrapUtils.wrapToTag(adRevenue.adUnitId) + "', adUnitName='" + WrapUtils.wrapToTag(adRevenue.adUnitName) + "', adPlacementId='" + WrapUtils.wrapToTag(adRevenue.adPlacementId) + "', adPlacementName='" + WrapUtils.wrapToTag(adRevenue.adPlacementName) + "', precision='" + WrapUtils.wrapToTag(adRevenue.precision) + "', payload=" + Bb.b(adRevenue.payload) + ", autoCollected=" + z4 + "}", new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.Ya
    public final void b(@NonNull String str, String str2) {
        this.f38393c.info("Event received: " + WrapUtils.wrapToTag(str) + ". With value: " + WrapUtils.wrapToTag(str2), new Object[0]);
        Ji ji = this.f38398h;
        PublicLogger publicLogger = this.f38393c;
        Set set = R9.f38186a;
        EnumC3063wb enumC3063wb = EnumC3063wb.EVENT_TYPE_UNDEFINED;
        C2694i4 c2694i4 = new C2694i4(str2, str, 1, 0, publicLogger);
        c2694i4.f39387l = H9.JS;
        Sh sh = this.f38392b;
        ji.getClass();
        ji.a(Ji.a(c2694i4, sh), sh, 1, null);
    }

    public final void a(Map<String, String> map) {
        if (AbstractC2713io.a((Map) map)) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            putAppEnvironmentValue(entry.getKey(), entry.getValue());
        }
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, String str2) {
        reportError(str, str2, (Throwable) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str, String str2) {
        this.f38393c.info("Event received: " + WrapUtils.wrapToTag(str) + ". With value: " + WrapUtils.wrapToTag(str2), new Object[0]);
        Ji ji = this.f38398h;
        PublicLogger publicLogger = this.f38393c;
        Set set = R9.f38186a;
        EnumC3063wb enumC3063wb = EnumC3063wb.EVENT_TYPE_UNDEFINED;
        C2694i4 c2694i4 = new C2694i4(str2, str, 1, 0, publicLogger);
        Sh sh = this.f38392b;
        ji.getClass();
        ji.a(Ji.a(c2694i4, sh), sh, 1, null);
    }

    public final Nn a(Throwable th) {
        Throwable th2;
        StackTraceElement[] stackTraceElementArr;
        if (th == null) {
            stackTraceElementArr = null;
            th2 = null;
        } else if (th instanceof T1) {
            stackTraceElementArr = th.getStackTrace();
            th2 = null;
        } else {
            th2 = th;
            stackTraceElementArr = null;
        }
        return Qn.a(th2, new U(null, null, this.f38400j.b()), stackTraceElementArr != null ? Arrays.asList(stackTraceElementArr) : null, (String) this.f38401k.f39136b.a(), (Boolean) this.f38401k.f39137c.a());
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, String str2, Throwable th) {
        P6 p6 = new P6(new Qg(str2, a(th)), str);
        Ji ji = this.f38398h;
        byte[] byteArray = MessageNano.toByteArray(this.f38396f.fromModel(p6));
        PublicLogger publicLogger = this.f38393c;
        Set set = R9.f38186a;
        EnumC3063wb enumC3063wb = EnumC3063wb.EVENT_TYPE_UNDEFINED;
        C2694i4 c2694i4 = new C2694i4(byteArray, str2, 5896, publicLogger);
        Sh sh = this.f38392b;
        ji.getClass();
        ji.a(Ji.a(c2694i4, sh), sh, 1, null);
        this.f38393c.info("Error received: id: %s, message: %s", WrapUtils.wrapToTag(str), WrapUtils.wrapToTag(str2));
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportUnhandledException(@NonNull PluginErrorDetails pluginErrorDetails) {
        Nn a4 = this.f38402l.a(pluginErrorDetails);
        Ji ji = this.f38398h;
        Dn dn = a4.f38034a;
        String str = dn != null ? (String) WrapUtils.getOrDefault(dn.f37384a, "") : "";
        byte[] byteArray = MessageNano.toByteArray(this.f38394d.fromModel(a4));
        PublicLogger publicLogger = this.f38393c;
        Set set = R9.f38186a;
        EnumC3063wb enumC3063wb = EnumC3063wb.EVENT_TYPE_UNDEFINED;
        C2694i4 c2694i4 = new C2694i4(byteArray, str, 5891, publicLogger);
        Sh sh = this.f38392b;
        ji.getClass();
        ji.a(Ji.a(c2694i4, sh), sh, 1, null);
        this.f38393c.info("Crash from plugin received: %s", WrapUtils.wrapToTag(pluginErrorDetails.getMessage()));
    }

    @Override // io.appmetrica.analytics.impl.Ya
    public final boolean b() {
        return this.f38392b.f();
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str, Map<String, Object> map) {
        Ji ji = this.f38398h;
        PublicLogger publicLogger = this.f38393c;
        Set set = R9.f38186a;
        EnumC3063wb enumC3063wb = EnumC3063wb.EVENT_TYPE_UNDEFINED;
        ji.a(new C2694i4("", str, 1, 0, publicLogger), this.f38392b, 1, map);
        PublicLogger publicLogger2 = this.f38393c;
        StringBuilder sb = new StringBuilder("Event received: ");
        sb.append(WrapUtils.wrapToTag(str));
        sb.append(". With value: ");
        sb.append(WrapUtils.wrapToTag(map == null ? null : map.toString()));
        publicLogger2.info(sb.toString(), new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2804mb, io.appmetrica.analytics.impl.InterfaceC2882pb
    public final void a(@NonNull Nn nn) {
        Ji ji = this.f38398h;
        Ih a4 = ji.a(nn, this.f38392b);
        Sh sh = a4.f37767e;
        Pl pl = ji.f37843e;
        if (pl != null) {
            sh.f38818b.setUuid(((Ol) pl).g());
        } else {
            sh.getClass();
        }
        ji.f37841c.b(a4);
        this.f38393c.info("Unhandled exception received: " + nn, new Object[0]);
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(@NonNull PluginErrorDetails pluginErrorDetails, String str) {
        Nn nn;
        Xe xe = this.f38402l;
        if (pluginErrorDetails != null) {
            nn = xe.a(pluginErrorDetails);
        } else {
            xe.getClass();
            nn = null;
        }
        Qg qg = new Qg(str, nn);
        Ji ji = this.f38398h;
        byte[] byteArray = MessageNano.toByteArray(this.f38395e.fromModel(qg));
        PublicLogger publicLogger = this.f38393c;
        Set set = R9.f38186a;
        EnumC3063wb enumC3063wb = EnumC3063wb.EVENT_TYPE_UNDEFINED;
        C2694i4 c2694i4 = new C2694i4(byteArray, str, 5896, publicLogger);
        Sh sh = this.f38392b;
        ji.getClass();
        ji.a(Ji.a(c2694i4, sh), sh, 1, null);
        this.f38393c.info("Error from plugin received: %s", WrapUtils.wrapToTag(str));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2804mb, io.appmetrica.analytics.impl.InterfaceC2584e0
    public final void a(@NonNull U u4) {
        C2477a0 c2477a0 = new C2477a0(u4, (String) this.f38401k.f39136b.a(), (Boolean) this.f38401k.f39137c.a());
        Ji ji = this.f38398h;
        byte[] byteArray = MessageNano.toByteArray(this.f38397g.fromModel(c2477a0));
        PublicLogger publicLogger = this.f38393c;
        Set set = R9.f38186a;
        EnumC3063wb enumC3063wb = EnumC3063wb.EVENT_TYPE_UNDEFINED;
        C2694i4 c2694i4 = new C2694i4(byteArray, "", 5968, publicLogger);
        Sh sh = this.f38392b;
        ji.getClass();
        String str = null;
        ji.a(Ji.a(c2694i4, sh), sh, 1, null);
        PublicLogger publicLogger2 = this.f38393c;
        StringBuilder sb = new StringBuilder("ANR was reported ");
        C2997tn c2997tn = u4.f38337a;
        if (c2997tn != null) {
            str = "Thread[name=" + c2997tn.f39878a + ",tid={" + c2997tn.f39880c + ", priority=" + c2997tn.f39879b + ", group=" + c2997tn.f39881d + "}] at " + CollectionsKt.joinToString$default(c2997tn.f39883f, "\n", null, null, 0, null, null, 62, null);
        }
        sb.append(str);
        publicLogger2.info(sb.toString(), new Object[0]);
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportEvent(@NonNull ModuleEvent moduleEvent) {
        H9 h9;
        if (f38389n.contains(Integer.valueOf(moduleEvent.getType()))) {
            return;
        }
        PublicLogger publicLogger = this.f38393c;
        Set set = R9.f38186a;
        String value = moduleEvent.getValue();
        String name = moduleEvent.getName();
        EnumC3063wb enumC3063wb = EnumC3063wb.EVENT_TYPE_UNDEFINED;
        C2694i4 c2694i4 = new C2694i4(value, name, 8192, moduleEvent.getType(), publicLogger);
        int i4 = X8.f38517a[moduleEvent.getCategory().ordinal()];
        if (i4 == 1) {
            h9 = H9.NATIVE;
        } else {
            if (i4 != 2) {
                throw new W1.m();
            }
            h9 = H9.SYSTEM;
        }
        c2694i4.f39387l = h9;
        c2694i4.f39378c = Bb.b(moduleEvent.getEnvironment());
        if (moduleEvent.getExtras() != null) {
            c2694i4.f39391p = moduleEvent.getExtras();
        }
        this.f38398h.a(c2694i4, this.f38392b, moduleEvent.getServiceDataReporterType(), moduleEvent.getAttributes());
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(@NonNull String str, String str2, PluginErrorDetails pluginErrorDetails) {
        Nn nn;
        Xe xe = this.f38402l;
        if (pluginErrorDetails != null) {
            nn = xe.a(pluginErrorDetails);
        } else {
            xe.getClass();
            nn = null;
        }
        P6 p6 = new P6(new Qg(str2, nn), str);
        Ji ji = this.f38398h;
        byte[] byteArray = MessageNano.toByteArray(this.f38396f.fromModel(p6));
        PublicLogger publicLogger = this.f38393c;
        Set set = R9.f38186a;
        EnumC3063wb enumC3063wb = EnumC3063wb.EVENT_TYPE_UNDEFINED;
        C2694i4 c2694i4 = new C2694i4(byteArray, str2, 5896, publicLogger);
        Sh sh = this.f38392b;
        ji.getClass();
        ji.a(Ji.a(c2694i4, sh), sh, 1, null);
        this.f38393c.info("Error with identifier: %s from plugin received: %s", str, WrapUtils.wrapToTag(str2));
    }

    @Override // io.appmetrica.analytics.impl.Ya
    public final void a(@NonNull String str) {
        Ji ji = this.f38398h;
        C2773l6 a4 = C2773l6.a(str);
        Sh sh = this.f38392b;
        ji.getClass();
        ji.a(Ji.a(a4, sh), sh, 1, null);
    }
}
