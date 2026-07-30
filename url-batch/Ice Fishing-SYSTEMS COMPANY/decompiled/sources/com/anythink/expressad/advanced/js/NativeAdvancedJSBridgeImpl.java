package com.anythink.expressad.advanced.js;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.common.d.t;
import com.anythink.expressad.advanced.a.c;
import com.anythink.expressad.advanced.d.a;
import com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp;
import com.anythink.expressad.atsignalcommon.bridge.CommonJSBridgeImpUtils;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.atsignalcommon.windvane.h;
import com.anythink.expressad.f.b;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.g.a.f;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.h.v;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class NativeAdvancedJSBridgeImpl extends CommonBannerJSBridgeImp {

    /* renamed from: c, reason: collision with root package name */
    private WeakReference<Context> f18042c;

    /* renamed from: d, reason: collision with root package name */
    private List<d> f18043d;

    /* renamed from: e, reason: collision with root package name */
    private String f18044e;

    /* renamed from: f, reason: collision with root package name */
    private String f18045f;

    /* renamed from: g, reason: collision with root package name */
    private int f18046g;

    /* renamed from: h, reason: collision with root package name */
    private int f18047h;

    /* renamed from: j, reason: collision with root package name */
    private a f18048j;

    /* renamed from: k, reason: collision with root package name */
    private NativeAdvancedExpandDialog f18049k;

    /* renamed from: b, reason: collision with root package name */
    private String f18041b = "NativeAdvancedJSBridgeImpl";
    private int i = 5;

    public NativeAdvancedJSBridgeImpl(Context context, String str, String str2) {
        this.f18045f = str;
        this.f18044e = str2;
        this.f18042c = new WeakReference<>(context);
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void click(Object obj, String str) {
        try {
            List<d> list = this.f18043d;
            d dVar = (list == null || list.size() <= 0) ? null : this.f18043d.get(0);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                JSONObject a9 = d.a(dVar);
                JSONObject jSONObject = new JSONObject(str).getJSONObject("pt");
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    a9.put(next, jSONObject.getString(next));
                }
                d b9 = d.b(a9);
                String optString = a9.optString("unitId");
                if (!TextUtils.isEmpty(optString)) {
                    b9.l(optString);
                }
                dVar = b9;
            } catch (JSONException e6) {
                e6.printStackTrace();
            }
            a aVar = this.f18048j;
            if (aVar != null) {
                aVar.a(dVar);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.core.express.b.b
    public void close() {
        try {
            a aVar = this.f18048j;
            if (aVar != null) {
                aVar.e();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.core.express.b.b
    public void expand(String str, boolean z8) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("url", str);
            bundle.putBoolean("shouldUseCustomClose", z8);
            WeakReference<Context> weakReference = this.f18042c;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            NativeAdvancedExpandDialog nativeAdvancedExpandDialog = this.f18049k;
            if (nativeAdvancedExpandDialog == null || !nativeAdvancedExpandDialog.isShowing()) {
                NativeAdvancedExpandDialog nativeAdvancedExpandDialog2 = new NativeAdvancedExpandDialog(this.f18042c.get(), bundle, this.f18048j);
                this.f18049k = nativeAdvancedExpandDialog2;
                nativeAdvancedExpandDialog2.setCampaignList(this.f18044e, this.f18043d);
                this.f18049k.show();
                a aVar = this.f18048j;
                if (aVar != null) {
                    aVar.a(true);
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void getFileInfo(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            CommonJSBridgeImpUtils.callbackExcep(obj, "params is empty");
            return;
        }
        try {
            NativeAdvancedJsUtils.getFileInfo(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public d getMraidCampaign() {
        List<d> list = this.f18043d;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return this.f18043d.get(0);
    }

    public List<d> getmCampaignList() {
        return this.f18043d;
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void init(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            c cVar = new c(t.b().g());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("dev_close_state", this.f18046g);
            jSONObject2.put("customURLScheme", 1);
            jSONObject.put("sdkSetting", jSONObject2);
            jSONObject.put("device", cVar.a());
            jSONObject.put("campaignList", d.b(this.f18043d));
            b.a();
            com.anythink.expressad.f.c d2 = b.d(com.anythink.expressad.foundation.b.a.c().f(), this.f18044e);
            if (d2 == null) {
                d2 = com.anythink.expressad.f.c.y();
            }
            if (!TextUtils.isEmpty(this.f18045f)) {
                d2.e(this.f18045f);
            }
            d2.a(this.f18044e);
            d2.b(this.i);
            d2.a(this.f18047h);
            jSONObject.put("unitSetting", d2.s());
            jSONObject.put("appSetting", new JSONObject());
            jSONObject.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.SDK_INFO, com.anythink.expressad.atsignalcommon.a.a.f18091a);
            jSONObject.toString();
            h.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void install(Object obj, String str) {
        try {
            List<d> list = this.f18043d;
            d dVar = (list == null || list.size() <= 0) ? null : this.f18043d.get(0);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                JSONObject a9 = d.a(dVar);
                JSONObject jSONObject = new JSONObject(str).getJSONObject("pt");
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    a9.put(next, jSONObject.getString(next));
                }
                d b9 = d.b(a9);
                String optString = a9.optString("unitId");
                if (!TextUtils.isEmpty(optString)) {
                    b9.l(optString);
                }
                dVar = b9;
            } catch (JSONException e6) {
                e6.printStackTrace();
            }
            a aVar = this.f18048j;
            if (aVar != null) {
                aVar.a(dVar);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void onJSBridgeConnect(Object obj, String str) {
        try {
            if (obj instanceof com.anythink.expressad.atsignalcommon.windvane.b) {
                h.a();
                com.anythink.core.express.d.a.a(((com.anythink.expressad.atsignalcommon.windvane.b) obj).f18220a);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.core.express.b.b
    public void open(String str) {
        a aVar = this.f18048j;
        if (aVar != null) {
            aVar.a(str);
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void readyStatus(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        try {
            if (!(obj instanceof com.anythink.expressad.atsignalcommon.windvane.b) || (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.b) obj).f18220a) == null) {
                return;
            }
            try {
                windVaneWebView.getWebViewListener().readyState(windVaneWebView, new JSONObject(str).getInt("isReady"));
            } catch (Exception unused) {
                windVaneWebView.getWebViewListener().readyState(windVaneWebView, 2);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void release() {
        if (this.f18048j != null) {
            this.f18048j = null;
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void reportUrls(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            CommonJSBridgeImpUtils.callbackExcep(obj, "params is null");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                int optInt = jSONObject.optInt("type");
                String optString = jSONObject.optString("url");
                StringBuilder sb = new StringBuilder();
                sb.append(n.k());
                String a9 = v.a(optString, "&tun=", sb.toString());
                int optInt2 = jSONObject.optInt("report");
                boolean z8 = true;
                if (optInt2 == 0) {
                    Context g9 = t.b().g();
                    List<d> list = this.f18043d;
                    d dVar = list != null ? list.get(0) : null;
                    if (optInt == 0) {
                        z8 = false;
                    }
                    com.anythink.expressad.b.a.a(g9, dVar, "", a9, z8);
                } else {
                    Context g10 = t.b().g();
                    List<d> list2 = this.f18043d;
                    com.anythink.expressad.b.a.a(g10, list2 != null ? list2.get(0) : null, "", a9, false, optInt != 0, optInt2);
                }
            }
            h.a().a(obj, CommonJSBridgeImpUtils.codeToJsonString(0));
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void resetCountdown(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            new JSONObject(str).getInt(com.anythink.expressad.f.a.b.dl);
            a aVar = this.f18048j;
            if (aVar != null) {
                aVar.c();
            }
        } catch (JSONException e6) {
            e6.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void sendImpressions(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                String string = jSONArray.getString(i);
                for (d dVar : this.f18043d) {
                    if (dVar.bh().equals(string)) {
                        f.a(this.f18044e, dVar, f.f19283g);
                        arrayList.add(string);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public void setAllowSkip(int i) {
        this.f18047h = i;
    }

    public void setCampaignList(List<d> list) {
        this.f18043d = list;
    }

    public void setCountdownS(int i) {
        this.i = i;
    }

    public void setDevCloseBtnStatus(int i) {
        this.f18046g = i;
    }

    public void setNativeAdvancedBridgeListener(a aVar) {
        if (aVar != null) {
            this.f18048j = aVar;
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void toggleCloseBtn(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            int optInt = new JSONObject(str).optInt(com.anythink.core.express.b.a.f17684b);
            a aVar = this.f18048j;
            if (aVar != null) {
                aVar.a(optInt);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void triggerCloseBtn(Object obj, String str) {
        if (this.f18048j != null) {
            NativeAdvancedJsUtils.callbackSuccess(obj);
            this.f18048j.a();
        }
    }

    @Override // com.anythink.core.express.b.b
    public void unload() {
        close();
    }

    public void updateContext(Context context) {
        this.f18042c = new WeakReference<>(context);
    }

    @Override // com.anythink.core.express.b.b
    public void useCustomClose(boolean z8) {
        try {
            if (this.f18047h == -1) {
                int i = z8 ? 2 : 1;
                a aVar = this.f18048j;
                if (aVar != null) {
                    aVar.a(i);
                }
            }
        } catch (Throwable unused) {
        }
    }
}
