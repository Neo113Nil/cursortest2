package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.C1441c3;
import com.ironsource.ai;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.o9;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class y implements ai.b {

    /* renamed from: a, reason: collision with root package name */
    protected AbstractAdapter f18019a;

    /* renamed from: b, reason: collision with root package name */
    protected C1441c3 f18020b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f18021c;

    /* renamed from: d, reason: collision with root package name */
    protected JSONObject f18022d;

    /* renamed from: e, reason: collision with root package name */
    protected String f18023e;

    /* renamed from: f, reason: collision with root package name */
    protected int f18024f;

    /* renamed from: g, reason: collision with root package name */
    protected Long f18025g = null;

    y(C1441c3 c1441c3, AbstractAdapter abstractAdapter) {
        this.f18020b = c1441c3;
        this.f18019a = abstractAdapter;
        this.f18022d = c1441c3.c();
    }

    public void a(String str) {
        a(str, 0);
    }

    @Override // com.ironsource.ai.b
    public int b() {
        return this.f18020b.e();
    }

    @Override // com.ironsource.ai.b
    public String c() {
        return this.f18020b.f();
    }

    public abstract IronSource.AD_UNIT d();

    public Long e() {
        return this.f18025g;
    }

    public String f() {
        return String.format("%s %s", i(), Integer.valueOf(hashCode()));
    }

    public int g() {
        return this.f18020b.d();
    }

    public boolean h() {
        return this.f18021c;
    }

    public String i() {
        return this.f18020b.h().isMultipleInstances() ? this.f18020b.h().getProviderTypeForReflection() : this.f18020b.h().getProviderName();
    }

    public String j() {
        return this.f18020b.g();
    }

    public abstract String k();

    public int l() {
        return 1;
    }

    public Map<String, Object> m() {
        HashMap hashMap = new HashMap();
        try {
            AbstractAdapter abstractAdapter = this.f18019a;
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, abstractAdapter != null ? abstractAdapter.getVersion() : "");
            AbstractAdapter abstractAdapter2 = this.f18019a;
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, abstractAdapter2 != null ? abstractAdapter2.getCoreSDKVersion() : "");
            hashMap.put("spId", this.f18020b.i());
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER, this.f18020b.a());
            hashMap.put("instanceType", Integer.valueOf(p() ? 2 : 1));
            hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(l()));
            if (!TextUtils.isEmpty(this.f18023e)) {
                hashMap.put("dynamicDemandSource", this.f18023e);
                return hashMap;
            }
        } catch (Throwable th) {
            o9.d().a(th);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getProviderEventData " + c() + ")", th);
        }
        return hashMap;
    }

    public int n() {
        return this.f18024f;
    }

    public boolean o() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        try {
            if (ContextProvider.getInstance().getCurrentActiveActivity() != null || !this.f18019a.isUsingActivityBeforeImpression(d())) {
                return false;
            }
            ironLog.verbose(c() + " - is using activity before impression and activity is null");
            return true;
        } catch (Throwable th) {
            o9.d().a(th);
            b("Exception while calling adapter.isUsingActivityBeforeImpression() - " + th.getLocalizedMessage());
            return true;
        }
    }

    public boolean p() {
        return this.f18020b.j();
    }

    public void q() {
        try {
            AbstractAdapter abstractAdapter = this.f18019a;
            if (abstractAdapter != null) {
                abstractAdapter.releaseMemory(this.f18020b.b(), this.f18022d);
            }
        } catch (Throwable th) {
            o9.d().a(th);
            IronLog.INTERNAL.error("exception - " + th.getMessage());
        }
        this.f18019a = null;
    }

    public boolean r() {
        if (o()) {
            return false;
        }
        return p() || s();
    }

    public boolean s() {
        return this.f18020b.k();
    }

    private void a(String str, int i4) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, k() + " " + c() + " : " + str, i4);
    }

    public void b(String str) {
        a(str, 3);
    }

    public void c(String str) {
        this.f18023e = d.b().c(str);
    }

    public void a(boolean z4) {
        this.f18021c = z4;
    }
}
