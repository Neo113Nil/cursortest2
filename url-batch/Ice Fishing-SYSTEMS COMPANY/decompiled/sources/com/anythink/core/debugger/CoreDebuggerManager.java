package com.anythink.core.debugger;

import android.content.Context;
import com.anythink.core.api.ATSDK;
import com.anythink.core.api.AdError;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.bm;
import com.anythink.core.common.h.v;
import com.anythink.core.common.m.b;
import com.anythink.core.common.m.e;
import com.anythink.core.common.m.q;
import com.anythink.core.common.m.r;
import com.anythink.core.d.c;
import com.anythink.core.d.l;
import com.anythink.core.d.n;
import com.anythink.core.d.o;
import com.anythink.core.debugger.api.DebuggerAdSourceInfo;
import com.anythink.core.debugger.api.DebuggerDeviceInfo;
import com.anythink.core.debugger.api.DebuggerPlacementInfo;
import com.anythink.core.debugger.api.DebuggerSdkInfo;
import com.anythink.core.debugger.api.IDeviceInfoGetter;
import com.anythink.core.debugger.api.IOnlinePlcCfgGetter;
import com.anythink.core.debugger.api.ISdkInfoGetter;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class CoreDebuggerManager {

    /* renamed from: a, reason: collision with root package name */
    public static final String f17656a = "anythink_debug_place_strategy_obj";

    /* renamed from: b, reason: collision with root package name */
    private static volatile CoreDebuggerManager f17657b;

    /* renamed from: c, reason: collision with root package name */
    private final DebuggerDeviceInfo f17658c = new DebuggerDeviceInfo();

    /* renamed from: d, reason: collision with root package name */
    private final DebuggerSdkInfo f17659d = new DebuggerSdkInfo();

    private CoreDebuggerManager() {
    }

    public static CoreDebuggerManager getInstance() {
        if (f17657b == null) {
            synchronized (CoreDebuggerManager.class) {
                try {
                    if (f17657b == null) {
                        f17657b = new CoreDebuggerManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f17657b;
    }

    public DebuggerSdkInfo getSdkInfo() {
        return this.f17659d;
    }

    public void reqPlacementConfig(Context context, String str, final IOnlinePlcCfgGetter iOnlinePlcCfgGetter) {
        this.f17659d.setDebugKey(str);
        v vVar = new v(this.f17659d.getAppId(), this.f17659d.getAppKey());
        vVar.a(str);
        new c().a(context, vVar, new b() { // from class: com.anythink.core.debugger.CoreDebuggerManager.1
            @Override // com.anythink.core.common.m.q
            public final void onLoadError(int i, String str2, AdError adError) {
                IOnlinePlcCfgGetter iOnlinePlcCfgGetter2 = iOnlinePlcCfgGetter;
                if (iOnlinePlcCfgGetter2 != null) {
                    iOnlinePlcCfgGetter2.onOnlinePlcCfgError(str2);
                }
            }

            @Override // com.anythink.core.common.m.q
            public final void onLoadFinish(int i, Object obj) {
                IOnlinePlcCfgGetter iOnlinePlcCfgGetter2 = iOnlinePlcCfgGetter;
                if (iOnlinePlcCfgGetter2 != null) {
                    iOnlinePlcCfgGetter2.onOnlinePlcCfgCallback(DebuggerPlacementInfo.create(obj, null));
                }
            }
        });
    }

    public void reqPlacementGroupInfo(Context context, String str, String str2, final IOnlinePlcCfgGetter iOnlinePlcCfgGetter) {
        new r(context, new bm(this.f17659d.getAppId(), this.f17659d.getAppKey(), str, str2)).a(0, (q) new b() { // from class: com.anythink.core.debugger.CoreDebuggerManager.2
            @Override // com.anythink.core.common.m.q
            public final void onLoadError(int i, String str3, AdError adError) {
                IOnlinePlcCfgGetter iOnlinePlcCfgGetter2 = iOnlinePlcCfgGetter;
                if (iOnlinePlcCfgGetter2 != null) {
                    iOnlinePlcCfgGetter2.onOnlinePlcCfgError(str3);
                }
            }

            @Override // com.anythink.core.common.m.q
            public final void onLoadFinish(int i, Object obj) {
                IOnlinePlcCfgGetter iOnlinePlcCfgGetter2 = iOnlinePlcCfgGetter;
                if (iOnlinePlcCfgGetter2 != null) {
                    iOnlinePlcCfgGetter2.onOnlinePlcCfgCallback(DebuggerPlacementInfo.create(obj));
                }
            }
        });
    }

    public void reqPlacementStrategy(final Context context, final String str, String str2, JSONObject jSONObject, final IOnlinePlcCfgGetter iOnlinePlcCfgGetter) {
        bm bmVar = new bm(this.f17659d.getAppId(), this.f17659d.getAppKey(), str, str2);
        bmVar.a(jSONObject);
        new o().a(context, bmVar, new b() { // from class: com.anythink.core.debugger.CoreDebuggerManager.3
            @Override // com.anythink.core.common.m.q
            public final void onLoadError(int i, String str3, AdError adError) {
                IOnlinePlcCfgGetter iOnlinePlcCfgGetter2 = iOnlinePlcCfgGetter;
                if (iOnlinePlcCfgGetter2 != null) {
                    iOnlinePlcCfgGetter2.onOnlinePlcCfgError(str3);
                }
            }

            @Override // com.anythink.core.common.m.q
            public final void onLoadFinish(int i, Object obj) {
                try {
                    l a9 = l.a(str, (JSONObject) obj);
                    if (a9 != null) {
                        a9.bs();
                        n.a(context).a(str, a9, null, 0);
                        if (iOnlinePlcCfgGetter != null) {
                            DebuggerPlacementInfo create = DebuggerPlacementInfo.create(null, a9);
                            create.setDebuggerAdSourceInfo(new DebuggerAdSourceInfo.Builder().setNormalUnitGroupListStr(a9.az() != null ? a9.az().toString() : "[]").setAdxUnitGroupListStr(a9.Y() != null ? a9.Y().toString() : "[]").setC2sHeadBiddingUnitGroupListStr(a9.aC() != null ? a9.aC().toString() : "[]").setS2sHeadBiddingUnitGroupListStr(a9.aB() != null ? a9.aB().toString() : "[]").setAdxOpenUnitGroupListStr(a9.aJ() != null ? a9.aJ().toString() : "[]").setCustomInHouseHeadBiddingUnitGroupListStr(a9.O() != null ? a9.O().toString() : "[]").setDefaultUnitGroupListStr(a9.J() != null ? a9.J().toString() : "[]").setDirectlyUnitGroupListStr(a9.aI() != null ? a9.aI().toString() : "[]").setC2sDynamicPriceAdSourceListStr(a9.bt() != null ? a9.bt().toString() : "[]").setS2sDynamicPriceAdSourceListStr(a9.bu() != null ? a9.bu().toString() : "[]").setOnlineUnitGroupListStr(a9.aA() != null ? a9.aA().toString() : "[]").setFbInHouseHeadBiddingUnitGroupListStr(a9.W() != null ? a9.W().toString() : "[]").build());
                            iOnlinePlcCfgGetter.onOnlinePlcCfgCallback(create);
                        }
                    }
                } catch (Throwable th) {
                    IOnlinePlcCfgGetter iOnlinePlcCfgGetter2 = iOnlinePlcCfgGetter;
                    if (iOnlinePlcCfgGetter2 != null) {
                        iOnlinePlcCfgGetter2.onOnlinePlcCfgError("request debug place strategy error: " + th.getMessage());
                    }
                }
            }
        });
    }

    public void setDeviceInfoGetter(Context context, IDeviceInfoGetter iDeviceInfoGetter) {
        if (iDeviceInfoGetter != null) {
            if (this.f17658c.getDeviceInfoJsonObj() != null) {
                iDeviceInfoGetter.onDeviceInfoCallback(this.f17658c);
                return;
            }
            try {
                JSONObject a9 = e.a(-1);
                JSONObject b9 = e.b(-1);
                Iterator<String> keys = b9.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    a9.put(next, b9.opt(next));
                }
                this.f17658c.setDeviceInfoJsonObj(a9);
            } catch (Throwable unused) {
            }
            iDeviceInfoGetter.onDeviceInfoCallback(this.f17658c);
        }
    }

    public void setSdkInfoGetter(ISdkInfoGetter iSdkInfoGetter) {
        t b9 = t.b();
        if (iSdkInfoGetter != null) {
            this.f17659d.setInitSdk(b9.V());
            this.f17659d.setAppId(b9.p());
            this.f17659d.setAppKey(b9.q());
            this.f17659d.setDeniedUploadDeviceInfo(b9.f());
            this.f17659d.setHaveLoadAd(b9.f12903c);
            this.f17659d.setHavePreInitNetwork(b9.P());
            this.f17659d.setVersionName(ATSDK.getSDKVersionName());
            iSdkInfoGetter.onSdkInfoCallback(this.f17659d);
        }
    }
}
