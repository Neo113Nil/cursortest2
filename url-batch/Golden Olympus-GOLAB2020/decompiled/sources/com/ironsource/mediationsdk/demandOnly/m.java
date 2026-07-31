package com.ironsource.mediationsdk.demandOnly;

import android.text.TextUtils;
import com.ironsource.C1441c3;
import com.ironsource.adapters.ironsource.IronSourceLoadParameters;
import com.ironsource.gk;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.o9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    protected AbstractAdapter f17522a;

    /* renamed from: b, reason: collision with root package name */
    protected C1441c3 f17523b;

    /* renamed from: c, reason: collision with root package name */
    protected JSONObject f17524c;

    /* renamed from: d, reason: collision with root package name */
    private a f17525d;

    /* renamed from: e, reason: collision with root package name */
    private Timer f17526e;

    /* renamed from: f, reason: collision with root package name */
    long f17527f;

    /* renamed from: g, reason: collision with root package name */
    protected String f17528g;

    /* renamed from: h, reason: collision with root package name */
    protected JSONObject f17529h;

    /* renamed from: i, reason: collision with root package name */
    protected List<String> f17530i;

    /* renamed from: j, reason: collision with root package name */
    protected String f17531j;

    /* renamed from: k, reason: collision with root package name */
    private final Object f17532k = new Object();

    /* renamed from: l, reason: collision with root package name */
    private final Object f17533l = new Object();

    /* renamed from: m, reason: collision with root package name */
    protected final IronSource.AD_UNIT f17534m;

    protected enum a {
        NOT_LOADED,
        LOAD_IN_PROGRESS,
        LOADED,
        SHOW_IN_PROGRESS
    }

    public m(C1441c3 c1441c3, AbstractAdapter abstractAdapter) {
        this.f17523b = c1441c3;
        this.f17534m = c1441c3.b();
        this.f17522a = abstractAdapter;
        JSONObject c4 = c1441c3.c();
        this.f17524c = c4;
        try {
            c4.put(IronSourceLoadParameters.Constants.DEMAND_ONLY, true);
        } catch (JSONException e4) {
            o9.d().a(e4);
        }
        this.f17525d = a.NOT_LOADED;
        this.f17526e = null;
        this.f17528g = "";
        this.f17529h = null;
        this.f17530i = new ArrayList();
    }

    a a(a[] aVarArr, a aVar) {
        a aVar2;
        synchronized (this.f17532k) {
            try {
                aVar2 = this.f17525d;
                if (Arrays.asList(aVarArr).contains(this.f17525d)) {
                    b(aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar2;
    }

    void b(a aVar) {
        IronLog.INTERNAL.verbose("DemandOnlySmash " + this.f17523b.f() + ": current state=" + this.f17525d + ", new state=" + aVar);
        synchronized (this.f17532k) {
            this.f17525d = aVar;
        }
    }

    public C1441c3 f() {
        return this.f17523b;
    }

    public String g() {
        return this.f17528g;
    }

    public String h() {
        return this.f17523b.f();
    }

    public int i() {
        return this.f17523b.d();
    }

    public Map<String, Object> j() {
        HashMap hashMap = new HashMap();
        try {
            AbstractAdapter abstractAdapter = this.f17522a;
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, abstractAdapter != null ? abstractAdapter.getVersion() : "");
            AbstractAdapter abstractAdapter2 = this.f17522a;
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, abstractAdapter2 != null ? abstractAdapter2.getCoreSDKVersion() : "");
            hashMap.put("spId", this.f17523b.i());
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER, this.f17523b.a());
            hashMap.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
            hashMap.put("instanceType", Integer.valueOf(this.f17523b.d()));
            if (!TextUtils.isEmpty(this.f17528g)) {
                hashMap.put("auctionId", this.f17528g);
            }
            JSONObject jSONObject = this.f17529h;
            if (jSONObject != null && jSONObject.length() > 0) {
                hashMap.put("genericParams", this.f17529h);
            }
            if (!TextUtils.isEmpty(this.f17531j)) {
                hashMap.put("dynamicDemandSource", this.f17531j);
            }
            if (o()) {
                hashMap.put("isOneFlow", 1);
                return hashMap;
            }
        } catch (Exception e4) {
            o9.d().a(e4);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getProviderEventData " + h() + ")", e4);
        }
        return hashMap;
    }

    String k() {
        a aVar = this.f17525d;
        return aVar == null ? "null" : aVar.toString();
    }

    public String l() {
        return this.f17523b.i();
    }

    public List<String> m() {
        return this.f17530i;
    }

    public boolean n() {
        return this.f17523b.j();
    }

    public boolean o() {
        return this.f17524c.optBoolean("isOneFlow", false);
    }

    void p() {
        synchronized (this.f17533l) {
            try {
                Timer timer = this.f17526e;
                if (timer != null) {
                    timer.cancel();
                    this.f17526e = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(String str) {
        this.f17528g = str;
    }

    public void b(String str) {
        this.f17531j = com.ironsource.mediationsdk.d.b().c(str);
    }

    protected void a(List<String> list, String str, int i4, String str2, String str3) {
        Iterator it = ((List) gk.a((ArrayList) list, new ArrayList())).iterator();
        while (it.hasNext()) {
            String str4 = str;
            int i5 = i4;
            com.ironsource.mediationsdk.d.b().a(str3, str4, com.ironsource.mediationsdk.d.b().a((String) it.next(), str4, i5, str2, "", "", "", ""));
            str = str4;
            i4 = i5;
        }
    }

    void a(TimerTask timerTask) {
        synchronized (this.f17533l) {
            p();
            Timer timer = new Timer();
            this.f17526e = timer;
            timer.schedule(timerTask, this.f17527f);
        }
    }

    public void a(JSONObject jSONObject) {
        this.f17529h = jSONObject;
    }

    public void a(boolean z4) {
        try {
            this.f17524c.put("isOneFlow", z4);
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.verbose("Can't set isOneFlow = " + z4 + ". Error: " + e4.getMessage());
        }
    }

    boolean a(a aVar) {
        boolean z4;
        synchronized (this.f17532k) {
            z4 = this.f17525d == aVar;
        }
        return z4;
    }

    boolean a(a aVar, a aVar2) {
        synchronized (this.f17532k) {
            try {
                if (this.f17525d != aVar) {
                    return false;
                }
                b(aVar2);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
