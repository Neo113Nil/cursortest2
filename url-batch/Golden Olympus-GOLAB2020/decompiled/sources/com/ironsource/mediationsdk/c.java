package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.environment.StringUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.AdapterDebugInterface;
import com.ironsource.mediationsdk.adunit.adapter.BaseAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAPSDataInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mn;
import com.ironsource.o9;
import com.ironsource.pj;
import com.ironsource.z8;
import com.ironsource.zb;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: k, reason: collision with root package name */
    private static final String f17296k = "IronSource";

    /* renamed from: l, reason: collision with root package name */
    private static final String f17297l = "com.ironsource.adapters";

    /* renamed from: m, reason: collision with root package name */
    private static final String f17298m = "aps";

    /* renamed from: n, reason: collision with root package name */
    private static final c f17299n = new c();

    /* renamed from: o, reason: collision with root package name */
    private static final Object f17300o = new Object();

    /* renamed from: c, reason: collision with root package name */
    private String f17303c;

    /* renamed from: d, reason: collision with root package name */
    private String f17304d;

    /* renamed from: e, reason: collision with root package name */
    private Boolean f17305e;

    /* renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f17308h = new AtomicBoolean(false);

    /* renamed from: i, reason: collision with root package name */
    private z8 f17309i = new z8();

    /* renamed from: j, reason: collision with root package name */
    private final mn f17310j = new mn();

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, AbstractAdapter> f17301a = new ConcurrentHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap<String, AdapterBaseWrapper> f17302b = new ConcurrentHashMap<>();

    /* renamed from: f, reason: collision with root package name */
    private final ConcurrentHashMap<String, List<String>> f17306f = new ConcurrentHashMap<>();

    /* renamed from: g, reason: collision with root package name */
    private final ConcurrentHashMap<IronSource.AD_UNIT, JSONObject> f17307g = new ConcurrentHashMap<>();

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f17311a;

        static {
            int[] iArr = new int[IronSource.AD_UNIT.values().length];
            f17311a = iArr;
            try {
                iArr[IronSource.AD_UNIT.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17311a[IronSource.AD_UNIT.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17311a[IronSource.AD_UNIT.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17311a[IronSource.AD_UNIT.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private String c(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit, UUID uuid) {
        return (uuid != null ? uuid.toString() : "") + "-" + ad_unit.toString() + "-" + networkSettings.getProviderName();
    }

    public AbstractAdapter a(NetworkSettings networkSettings) {
        return a(b(networkSettings), networkSettings.getProviderTypeForReflection());
    }

    public AdapterBaseInterface b(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit, UUID uuid) {
        String b4 = networkSettings.isCustomNetwork() ? b(networkSettings) : c(networkSettings, ad_unit, uuid);
        if (this.f17302b.containsKey(b4)) {
            return this.f17302b.get(b4).getAdapterBaseInterface();
        }
        AdapterBaseInterface a4 = a(b4, networkSettings.isCustomNetwork() ? networkSettings.getCustomNetworkAdapterName(null) : networkSettings.getProviderTypeForReflection(), networkSettings);
        if (a4 != null || networkSettings.isCustomNetwork()) {
            this.f17310j.a(this.f17302b.put(b4, new AdapterBaseWrapper(a4, networkSettings)));
            return a4;
        }
        int i4 = a.f17311a[ad_unit.ordinal()];
        AbstractAdapter a5 = a(networkSettings, i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? null : networkSettings.getNativeAdSettings() : networkSettings.getBannerSettings() : networkSettings.getInterstitialSettings() : networkSettings.getRewardedVideoSettings(), false);
        if (a5 != null) {
            u uVar = new u(a5);
            this.f17302b.put(b4, new AdapterBaseWrapper(uVar, networkSettings));
            return uVar;
        }
        String str = "error creating network adapter " + networkSettings.getProviderName();
        a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
        IronLog.INTERNAL.error(str);
        return null;
    }

    public ConcurrentHashMap<String, AdapterBaseWrapper> d() {
        return this.f17302b;
    }

    public void e() {
        this.f17301a.clear();
        this.f17302b.clear();
    }

    public static c b() {
        return f17299n;
    }

    public AbstractAdapter a(NetworkSettings networkSettings, JSONObject jSONObject, boolean z4) {
        String str;
        String b4 = b(networkSettings);
        String providerTypeForReflection = z4 ? "IronSource" : networkSettings.getProviderTypeForReflection();
        synchronized (f17300o) {
            try {
                if (this.f17301a.containsKey(b4)) {
                    return this.f17301a.get(b4);
                }
                AbstractAdapter a4 = a(b4, providerTypeForReflection);
                if (a4 == null) {
                    a(b4 + " adapter was not loaded");
                    return null;
                }
                a4.setProviderNetworkKey(networkSettings.getProviderNetworkKey());
                try {
                    str = a4.getCoreSDKVersion();
                } catch (Throwable th) {
                    o9.d().a(th);
                    String str2 = "error while retrieving coreSDKVersion " + a4.getProviderName() + ": " + th.getLocalizedMessage();
                    a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2);
                    IronLog.INTERNAL.error(str2);
                    str = "Unknown";
                }
                b(b4 + " was allocated (adapter version: " + a4.getVersion() + ", sdk version: " + str + ")");
                c(a4);
                this.f17310j.a(a4);
                a(a4);
                this.f17309i.a(a4, networkSettings);
                b(a4);
                a(jSONObject, a4, providerTypeForReflection);
                this.f17301a.put(b4, a4);
                return a4;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public ConcurrentHashMap<String, List<String>> c() {
        return this.f17306f;
    }

    private AbstractAdapter a(String str, String str2) {
        try {
            Class<?> cls = Class.forName("com.ironsource.adapters." + StringUtils.toLowerCase(str2) + "." + str2 + "Adapter");
            return (AbstractAdapter) cls.getMethod(IronSourceConstants.START_ADAPTER, String.class).invoke(cls, str);
        } catch (Exception e4) {
            String str3 = "Error while loading adapter - exception = " + e4.getLocalizedMessage();
            a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str3);
            a(str3);
            return null;
        }
    }

    private String b(NetworkSettings networkSettings) {
        return networkSettings.isMultipleInstances() ? networkSettings.getProviderDefaultInstance() : networkSettings.getProviderName();
    }

    private void c(AbstractAdapter abstractAdapter) {
        for (String str : this.f17306f.keySet()) {
            try {
                List<String> list = this.f17306f.get(str);
                IronSourceUtils.sendAutomationLog(abstractAdapter.getProviderName() + "Adapter setMetaData key = " + str + ", values = " + list);
                if (list != null) {
                    abstractAdapter.setMetaData(str, list);
                }
            } catch (Throwable th) {
                o9.d().a(th);
                String str2 = "error while setting metadata of " + abstractAdapter.getProviderName() + ": " + th.getLocalizedMessage();
                a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2);
                b(str2);
            }
        }
    }

    private AdapterBaseInterface a(String str, String str2, NetworkSettings networkSettings) {
        if (networkSettings.isCustomNetwork() && TextUtils.isEmpty(networkSettings.getCustomNetworkPackage())) {
            IronLog.INTERNAL.error("missing package definition for " + str);
            return null;
        }
        String str3 = (networkSettings.isCustomNetwork() ? networkSettings.getCustomNetworkPackage() : f17297l) + "." + str2;
        try {
            BaseAdapter baseAdapter = (BaseAdapter) Class.forName(str3).newInstance();
            IronLog.INTERNAL.info(str3 + " was allocated (adapter version: " + baseAdapter.getAdapterVersion() + ", sdk version: " + baseAdapter.getNetworkSDKVersion() + ")");
            a(baseAdapter);
            this.f17309i.a(baseAdapter, networkSettings);
            this.f17302b.put(str, new AdapterBaseWrapper(baseAdapter, networkSettings));
            return baseAdapter;
        } catch (Exception unused) {
            if (networkSettings.isCustomNetwork()) {
                String str4 = "failed to load " + str3;
                IronLog.INTERNAL.error(str4);
                a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str4);
            }
            return null;
        }
    }

    private void b(AbstractAdapter abstractAdapter) {
        Boolean bool = this.f17305e;
        if (bool != null) {
            try {
                abstractAdapter.setAdapterDebug(bool);
            } catch (Throwable th) {
                o9.d().a(th);
                String str = "error while setting adapterDebug of " + abstractAdapter.getProviderName() + ": " + th.getLocalizedMessage();
                a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
                b(str);
            }
        }
    }

    private BaseAdAdapter<?, ?> a(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit) {
        if (networkSettings.isCustomNetwork() && TextUtils.isEmpty(networkSettings.getCustomNetworkPackage())) {
            IronLog.INTERNAL.error("missing package definition for " + networkSettings.getProviderTypeForReflection());
            return null;
        }
        String str = (networkSettings.isCustomNetwork() ? networkSettings.getCustomNetworkPackage() : f17297l) + "." + (networkSettings.isCustomNetwork() ? networkSettings.getCustomNetworkAdapterName(ad_unit) : networkSettings.getProviderTypeForReflection());
        try {
            return (BaseAdAdapter) Class.forName(str).getConstructor(NetworkSettings.class).newInstance(networkSettings);
        } catch (Exception unused) {
            if (networkSettings.isCustomNetwork()) {
                String str2 = "failed to load " + str;
                IronLog.INTERNAL.error(str2);
                a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2);
            }
            return null;
        }
    }

    private void b(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "AdapterRepository: " + str, 0);
    }

    public BaseAdAdapter<?, ?> a(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit, UUID uuid) {
        BaseAdAdapter<?, ?> a4 = a(networkSettings, ad_unit);
        if (a4 != null || networkSettings.isCustomNetwork()) {
            return a4;
        }
        AbstractAdapter a5 = a(networkSettings);
        if (a5 != null) {
            return AbstractC1514a.a(a5, networkSettings, ad_unit, uuid);
        }
        String str = "error creating ad adapter " + networkSettings.getProviderName();
        a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
        IronLog.INTERNAL.error(str);
        return null;
    }

    public void b(String str, String str2) {
        this.f17303c = str;
        this.f17304d = str2;
    }

    private String a(IronSource.AD_UNIT ad_unit) {
        if (ad_unit == null || TextUtils.isEmpty(ad_unit.toString())) {
            return "";
        }
        return ad_unit.toString().substring(0, 1).toUpperCase(Locale.getDefault()) + ad_unit.toString().substring(1);
    }

    public void b(boolean z4) {
        synchronized (f17300o) {
            this.f17309i.a(z4);
            this.f17309i.a(this.f17301a, this.f17302b);
        }
    }

    public ConcurrentHashMap<String, AbstractAdapter> a() {
        return this.f17301a;
    }

    private void a(int i4, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("reason", str);
            }
            pj.i().a(new zb(i4, jSONObject));
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(AbstractAdapter abstractAdapter) {
        if (!StringUtils.toLowerCase(abstractAdapter.getProviderName()).equals(f17298m) || this.f17307g.size() == 0) {
            return;
        }
        for (IronSource.AD_UNIT ad_unit : this.f17307g.keySet()) {
            try {
                JSONObject jSONObject = this.f17307g.get(ad_unit);
                if (jSONObject != null && jSONObject.length() > 0 && (abstractAdapter instanceof SetAPSInterface)) {
                    ((SetAPSInterface) abstractAdapter).setAPSData(ad_unit, jSONObject);
                }
            } catch (Exception e4) {
                o9.d().a(e4);
                String str = "error while setting aps data: " + e4.getLocalizedMessage();
                a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_SET_NETWORK_DATA_INTERNAL_ERROR, str);
                b(str);
            }
        }
        this.f17307g.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(IronSource.AD_UNIT ad_unit, JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_SET_NETWORK_DATA_INTERNAL_ERROR, "APSData is empty");
            a("APSData is empty");
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
            if (!this.f17301a.isEmpty()) {
                for (AbstractAdapter abstractAdapter : this.f17301a.values()) {
                    if (StringUtils.toLowerCase(abstractAdapter.getProviderName()).equals(f17298m) && (abstractAdapter instanceof SetAPSInterface)) {
                        ((SetAPSInterface) abstractAdapter).setAPSData(ad_unit, jSONObject2);
                        return;
                    }
                }
            }
            for (AdapterBaseWrapper adapterBaseWrapper : this.f17302b.values()) {
                if (StringUtils.toLowerCase(adapterBaseWrapper.getSettings().getProviderTypeForReflection()).equals(f17298m)) {
                    AdapterBaseInterface adapterBaseInterface = adapterBaseWrapper.getAdapterBaseInterface();
                    if (adapterBaseInterface != null) {
                        ((AdapterAPSDataInterface) adapterBaseInterface).setAPSData(ad_unit, jSONObject2);
                        return;
                    }
                    return;
                }
            }
            synchronized (f17300o) {
                this.f17307g.put(ad_unit, jSONObject2);
            }
        } catch (Exception e4) {
            o9.d().a(e4);
            String str = "error while setting APSData: " + e4.getLocalizedMessage();
            a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_SET_NETWORK_DATA_INTERNAL_ERROR, str);
            a(str);
        }
    }

    private void a(AdapterBaseInterface adapterBaseInterface) {
        Boolean bool = this.f17305e;
        if (bool == null || !(adapterBaseInterface instanceof AdapterDebugInterface)) {
            return;
        }
        try {
            ((AdapterDebugInterface) adapterBaseInterface).setAdapterDebug(bool.booleanValue());
        } catch (Exception e4) {
            o9.d().a(e4);
            String str = "error while setting adapterDebug of " + adapterBaseInterface.getClass().getSimpleName() + ": " + e4.getLocalizedMessage();
            a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
            b(str);
        }
    }

    public void a(@NotNull v vVar) {
        if (vVar.allData().length() == 0) {
            a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_SET_NETWORK_DATA_INTERNAL_ERROR, "empty network data");
            a("empty network data");
        } else {
            if (TextUtils.isEmpty(vVar.a())) {
                a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_SET_NETWORK_DATA_INTERNAL_ERROR, "empty network key");
                a("empty network key");
                return;
            }
            this.f17310j.a(vVar);
            vVar.a(this.f17301a.values(), this.f17302b.values());
            vVar.b();
            if (StringUtils.toLowerCase(vVar.a()).equals(f17298m)) {
                a(vVar.allData());
            }
        }
    }

    private void a(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "AdapterRepository: " + str, 3);
    }

    public void a(String str, List<String> list) {
        synchronized (f17300o) {
            try {
                this.f17306f.put(str, list);
                if (!this.f17301a.isEmpty()) {
                    IronSourceUtils.sendAutomationLog("setMetaData key = " + str + ", values = " + list);
                    for (AbstractAdapter abstractAdapter : this.f17301a.values()) {
                        try {
                            abstractAdapter.setMetaData(str, list);
                        } catch (Throwable th) {
                            o9.d().a(th);
                            String str2 = "error while setting metadata of " + abstractAdapter.getProviderName() + ": " + th.getLocalizedMessage();
                            a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2);
                            b(str2);
                        }
                    }
                }
                for (AdapterBaseWrapper adapterBaseWrapper : this.f17302b.values()) {
                    AdapterBaseInterface adapterBaseInterface = adapterBaseWrapper.getAdapterBaseInterface();
                    if (!adapterBaseWrapper.getSettings().isCustomNetwork() && (adapterBaseInterface instanceof AdapterMetaDataInterface)) {
                        try {
                            ((AdapterMetaDataInterface) adapterBaseInterface).setMetaData(str, list);
                        } catch (Exception e4) {
                            o9.d().a(e4);
                            String str3 = "error while setting metadata of " + adapterBaseInterface.getClass().getSimpleName() + ": " + e4.getLocalizedMessage();
                            a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str3);
                            b(str3);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void a(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            JSONObject optJSONObject = jSONObject.optJSONObject(next);
            IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
            if (!next.equalsIgnoreCase(ad_unit.toString())) {
                ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
                if (!next.equalsIgnoreCase(ad_unit.toString())) {
                    ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
                    if (next.equalsIgnoreCase(ad_unit.toString())) {
                    }
                }
            }
            a(ad_unit, optJSONObject);
        }
    }

    private void a(JSONObject jSONObject, AbstractAdapter abstractAdapter, String str) {
        if (str.equalsIgnoreCase("IronSource") && this.f17308h.compareAndSet(false, true)) {
            b("SDK5 earlyInit  <" + str + ">");
            try {
                abstractAdapter.earlyInit(this.f17303c, this.f17304d, jSONObject);
            } catch (Exception e4) {
                o9.d().a(e4);
                String str2 = "error while calling early init for " + abstractAdapter.getProviderName() + ": " + e4.getLocalizedMessage();
                a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2);
                IronLog.INTERNAL.error(str2);
            }
        }
    }

    public void a(boolean z4) {
        synchronized (f17300o) {
            try {
                this.f17305e = Boolean.valueOf(z4);
                Iterator<AbstractAdapter> it = this.f17301a.values().iterator();
                while (it.hasNext()) {
                    b(it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean a(String str, AbstractAdapter abstractAdapter) {
        return (abstractAdapter == null || abstractAdapter.getProviderNetworkKey() == null || !abstractAdapter.getProviderNetworkKey().equalsIgnoreCase(str)) ? false : true;
    }

    public static boolean a(String str, AdapterBaseWrapper adapterBaseWrapper) {
        return (adapterBaseWrapper == null || adapterBaseWrapper.getSettings().getProviderNetworkKey() == null || !adapterBaseWrapper.getSettings().getProviderNetworkKey().equalsIgnoreCase(str)) ? false : true;
    }
}
