package com.anythink.expressad.video.signal.communication;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.common.d.t;
import com.anythink.core.common.e.g;
import com.anythink.core.common.v.y;
import com.anythink.expressad.atsignalcommon.bridge.CommonJSBridgeImpUtils;
import com.anythink.expressad.atsignalcommon.windvane.AbsFeedBackForH5;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.atsignalcommon.windvane.b;
import com.anythink.expressad.atsignalcommon.windvane.h;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.d.g;
import com.anythink.expressad.foundation.g.a;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.video.bt.a.c;
import com.anythink.expressad.video.signal.a.j;
import com.anythink.expressad.video.signal.factory.IJSFactory;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class BaseVideoBridge extends AbsFeedBackForH5 implements IVideoBridge {

    /* renamed from: a, reason: collision with root package name */
    protected static final String f22003a = "JS-Video-Brigde";

    /* renamed from: j, reason: collision with root package name */
    private static final int f22004j = 1;

    /* renamed from: k, reason: collision with root package name */
    private static final int f22005k = 2;

    /* renamed from: l, reason: collision with root package name */
    private static final String f22006l = "showTransparent";

    /* renamed from: m, reason: collision with root package name */
    private static final String f22007m = "mute";

    /* renamed from: n, reason: collision with root package name */
    private static final String f22008n = "closeType";

    /* renamed from: o, reason: collision with root package name */
    private static final String f22009o = "orientationType";

    /* renamed from: p, reason: collision with root package name */
    private static final String f22010p = "type";

    /* renamed from: q, reason: collision with root package name */
    private static final String f22011q = "h5cbp";

    /* renamed from: r, reason: collision with root package name */
    private static final String f22012r = "webfront";

    /* renamed from: s, reason: collision with root package name */
    private static final String f22013s = "showAlertRole";
    protected IJSFactory i;

    private static String a(int i) {
        switch (i) {
            case 1:
                return ATAdConst.NETWORK_REQUEST_PARAMS_KEY.SDK_INFO;
            case 2:
                return "unit_id";
            case 3:
                return "appSetting";
            case 4:
                return "unitSetting";
            case 5:
                return "device";
            case 6:
                return "sdkSetting";
            default:
                return "";
        }
    }

    private static String b(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            String jSONObject2 = jSONObject.toString();
            return !TextUtils.isEmpty(jSONObject2) ? Base64.encodeToString(jSONObject2.getBytes(), 2) : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void appendSubView(Object obj, String str) {
        a(obj, str);
        try {
            c.a().i(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void appendViewTo(Object obj, String str) {
        a(obj, str);
        try {
            c.a().j(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void bringViewToFront(Object obj, String str) {
        a(obj, str);
        try {
            c.a().m(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void broadcast(Object obj, String str) {
        a(obj, str);
        try {
            c.a().M(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void cai(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            try {
                String optString = new JSONObject(str).optString("packageName");
                if (TextUtils.isEmpty(optString)) {
                    CommonJSBridgeImpUtils.callbackExcep(obj, "packageName is empty");
                }
                int i = v.a(t.b().g(), optString) ? 1 : 2;
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", CommonJSBridgeImpUtils.f18107b);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("result", i);
                    jSONObject.put("data", jSONObject2);
                    h.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e6) {
                    CommonJSBridgeImpUtils.callbackExcep(obj, e6.getMessage());
                    e6.getMessage();
                }
            } catch (JSONException e9) {
                CommonJSBridgeImpUtils.callbackExcep(obj, "exception: " + e9.getLocalizedMessage());
            }
        } catch (Throwable th) {
            CommonJSBridgeImpUtils.callbackExcep(obj, "exception: " + th.getLocalizedMessage());
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void clearAllCache(Object obj, String str) {
        try {
            t.b().g().getSharedPreferences(a.f19254t, 0).edit().clear().apply();
            if (obj != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", 0);
                jSONObject.put("message", "Success");
                h.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            }
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void click(Object obj, String str) {
        String str2;
        int i;
        j jVar;
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                i = jSONObject.optInt("type");
                str2 = jSONObject.optString("pt");
            } catch (JSONException e6) {
                str2 = "";
                e6.printStackTrace();
                i = 1;
            }
            IJSFactory iJSFactory = this.i;
            if (iJSFactory != null) {
                iJSFactory.getJSCommon().click(i, str2);
                return;
            }
            if (obj != null) {
                b bVar = (b) obj;
                if (!(bVar.f18220a.getObject() instanceof j) || (jVar = (j) bVar.f18220a.getObject()) == null) {
                    return;
                }
                jVar.click(i, str2);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void closeAd(Object obj, String str) {
        a(obj, str);
        try {
            c.a().L(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void closeVideoOperte(Object obj, String str) {
        try {
            if (this.i == null || TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            this.i.getJSVideoModule().closeVideoOperate(jSONObject.optInt(d.cs), jSONObject.optInt("view_visible"));
            h.a().a(obj, b(0));
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void closeWeb(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str) || this.i == null || TextUtils.isEmpty(str)) {
                return;
            }
            int optInt = new JSONObject(str).optInt("status");
            this.i.getJSContainerModule().hideAlertWebview();
            this.i.getJSVideoModule().hideAlertView(optInt);
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void createNativeEC(Object obj, String str) {
        a(obj, str);
        try {
            c.a().Q(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void createPlayerView(Object obj, String str) {
        a(obj, str);
        try {
            c.a().c(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void createSubPlayTemplateView(Object obj, String str) {
        a(obj, str);
        try {
            c.a().d(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void createView(Object obj, String str) {
        a(obj, str);
        try {
            c.a().a(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void createWebview(Object obj, String str) {
        a(obj, str);
        try {
            c.a().b(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void destroyComponent(Object obj, String str) {
        a(obj, str);
        try {
            c.a().e(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006b A[Catch: all -> 0x006f, TRY_ENTER, TryCatch #2 {all -> 0x006f, blocks: (B:13:0x0058, B:16:0x006b, B:18:0x0078, B:23:0x0071), top: B:12:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0078 A[Catch: all -> 0x006f, TRY_LEAVE, TryCatch #2 {all -> 0x006f, blocks: (B:13:0x0058, B:16:0x006b, B:18:0x0078, B:23:0x0071), top: B:12:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071 A[Catch: all -> 0x006f, TryCatch #2 {all -> 0x006f, blocks: (B:13:0x0058, B:16:0x006b, B:18:0x0078, B:23:0x0071), top: B:12:0x0058 }] */
    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void getAllCache(Object obj, String str) {
        JSONObject jSONObject;
        Throwable th;
        String str2;
        SharedPreferences sharedPreferences;
        try {
            sharedPreferences = t.b().g().getSharedPreferences(a.f19254t, 0);
            jSONObject = new JSONObject();
        } catch (Throwable th2) {
            jSONObject = null;
            th = th2;
        }
        try {
            for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            str2 = "getAllCache Success";
        } catch (Throwable th3) {
            th = th3;
            th.toString();
            str2 = "getAllCache Error, reason is : " + th.getMessage();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", 0);
            jSONObject2.put("message", str2);
            if (jSONObject == null) {
            }
            if (obj == null) {
            }
        }
        try {
            JSONObject jSONObject22 = new JSONObject();
            jSONObject22.put("code", 0);
            jSONObject22.put("message", str2);
            if (jSONObject == null) {
                jSONObject22.put("data", jSONObject);
            } else {
                jSONObject22.put("data", "{}");
            }
            if (obj == null) {
                h.a().a(obj, Base64.encodeToString(jSONObject22.toString().getBytes(), 2));
            }
        } catch (Throwable th4) {
            th4.toString();
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void getAppSetting(Object obj, String str) {
        JSONObject jSONObject;
        try {
            String optString = new JSONObject(str).optString("appid", "");
            JSONObject jSONObject2 = new JSONObject();
            if (TextUtils.isEmpty(optString)) {
                jSONObject2.put("code", 1);
                jSONObject2.put("message", "Get App Setting error, because must give a appId.");
            } else {
                com.anythink.expressad.f.b.a();
                String a9 = com.anythink.expressad.f.b.a(optString);
                if (TextUtils.isEmpty(a9)) {
                    com.anythink.expressad.f.b.a();
                    jSONObject = new JSONObject(com.anythink.expressad.f.b.c().Q());
                } else {
                    jSONObject = new JSONObject(a9);
                    jSONObject.put("isDefault", 0);
                }
                if (obj != null) {
                    jSONObject2.put("code", 0);
                    jSONObject2.put("message", "Success");
                    jSONObject2.put("data", jSONObject);
                } else {
                    jSONObject2.put("code", 1);
                    jSONObject2.put("message", "Get App Setting error, plz try again later.");
                }
            }
            h.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void getComponentOptions(Object obj, String str) {
        a(obj, str);
        try {
            c.a();
            c.f(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void getCurrentProgress(Object obj, String str) {
        try {
            IJSFactory iJSFactory = this.i;
            if (iJSFactory != null) {
                String currentProgress = iJSFactory.getJSVideoModule().getCurrentProgress();
                if (!TextUtils.isEmpty(currentProgress)) {
                    currentProgress = Base64.encodeToString(currentProgress.getBytes(), 2);
                }
                h.a().a(obj, currentProgress);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void getCutout(Object obj, String str) {
        try {
            String o9 = this.i.getJSCommon().o();
            if (obj != null && !TextUtils.isEmpty(o9)) {
                h.a().a(obj, Base64.encodeToString(o9.getBytes(), 2));
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", 1);
            jSONObject.put("message", "No notch data, plz try again later.");
            h.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void getEncryptPrice(Object obj, String str) {
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void getFileInfo(Object obj, String str) {
        a(obj, str);
        try {
            c.a();
            c.P(obj, new JSONObject(str));
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void getRewardSetting(Object obj, String str) {
        try {
            JSONObject j9 = com.anythink.expressad.videocommon.e.c.a().b().j();
            JSONObject jSONObject = new JSONObject();
            if (obj != null) {
                jSONObject.put("code", 0);
                jSONObject.put("message", "Success");
                jSONObject.put("data", j9);
            } else {
                jSONObject.put("code", 1);
                jSONObject.put("message", "Get Reward Setting error, plz try again later.");
            }
            h.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void getRewardUnitSetting(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("appid", "");
            String optString2 = jSONObject.optString("unitid", "");
            JSONObject jSONObject2 = new JSONObject();
            if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
                jSONObject2.put("code", 1);
                jSONObject2.put("message", "Get reward unit Setting error, because must give appId and unitId.");
            } else {
                JSONObject R8 = com.anythink.expressad.videocommon.e.c.a().a(optString, optString2).R();
                if (obj != null) {
                    jSONObject2.put("code", 0);
                    jSONObject2.put("message", "Success");
                    jSONObject2.put("data", R8);
                } else {
                    jSONObject2.put("code", 1);
                    jSONObject2.put("message", "Get Reward Unit Setting error, plz try again later.");
                }
            }
            h.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void getSDKInfo(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                h.a().b(obj, "params is null");
                return;
            }
            JSONArray jSONArray = new JSONObject(str).getJSONArray("type");
            JSONObject jSONObject = new JSONObject();
            int i = 0;
            if (this.i != null) {
                while (i < jSONArray.length()) {
                    int i4 = jSONArray.getInt(i);
                    jSONObject.put(a(i4), this.i.getJSCommon().h(i4));
                    i++;
                }
            } else if (obj != null) {
                while (i < jSONArray.length()) {
                    int i9 = jSONArray.getInt(i);
                    b bVar = (b) obj;
                    if (bVar.f18220a.getObject() instanceof j) {
                        jSONObject.put(a(i9), ((j) bVar.f18220a.getObject()).h(i9));
                    }
                    i++;
                }
            }
            h.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable unused) {
            h.a().b(obj, g.i);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void getUnitSetting(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", 1);
            jSONObject.put("message", "Get Unit Setting error, RV/IV can not support this method.");
            h.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void gial(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", CommonJSBridgeImpUtils.f18107b);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("packageNameList", "[]");
            jSONObject.put("data", jSONObject2);
            h.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e6) {
            CommonJSBridgeImpUtils.callbackExcep(obj, e6.getMessage());
            e6.getMessage();
        } catch (Throwable th) {
            CommonJSBridgeImpUtils.callbackExcep(obj, th.getMessage());
            th.getMessage();
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void handleNativeObject(Object obj, String str) {
        a(obj, str);
        try {
            com.anythink.expressad.video.bt.a.b.a().a(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void handlerH5Exception(Object obj, String str) {
        try {
            if (this.i == null || TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            this.i.getJSCommon().handlerH5Exception(jSONObject.optInt("code", -999), jSONObject.optString("message", "h5 error"));
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void hideView(Object obj, String str) {
        a(obj, str);
        try {
            c.a().n(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void increaseOfferFrequence(Object obj, String str) {
        a(obj, str);
        try {
            c.a();
            new JSONObject(str);
            c.a(obj);
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void init(Object obj, String str) {
        try {
            IJSFactory iJSFactory = this.i;
            int i = 1;
            if (iJSFactory != null) {
                String i4 = iJSFactory.getJSCommon().i();
                if (!TextUtils.isEmpty(i4)) {
                    i4 = Base64.encodeToString(i4.getBytes(), 2);
                }
                h.a().a(obj, i4);
                this.i.getJSCommon().h();
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject(str);
                int optInt = jSONObject.optInt(f22006l);
                int optInt2 = jSONObject.optInt("mute");
                int optInt3 = jSONObject.optInt(f22008n);
                int optInt4 = jSONObject.optInt(f22009o);
                int optInt5 = jSONObject.optInt(f22011q);
                int optInt6 = jSONObject.optInt(f22012r);
                int optInt7 = jSONObject.optInt(f22013s);
                this.i.getJSCommon().a(optInt == 1);
                this.i.getJSCommon().b(optInt2);
                this.i.getJSCommon().c(optInt3);
                this.i.getJSCommon().d(optInt4);
                this.i.getJSCommon().e(optInt5);
                this.i.getJSCommon().f(optInt6);
                com.anythink.expressad.video.signal.c jSCommon = this.i.getJSCommon();
                if (optInt7 != 0) {
                    i = optInt7;
                }
                jSCommon.i(i);
                return;
            }
            if (obj != null) {
                b bVar = (b) obj;
                if (bVar.f18220a.getObject() instanceof j) {
                    j jVar = (j) bVar.f18220a.getObject();
                    String i9 = jVar.i();
                    if (!TextUtils.isEmpty(str)) {
                        JSONObject jSONObject2 = new JSONObject(str);
                        int optInt8 = jSONObject2.optInt(f22006l);
                        int optInt9 = jSONObject2.optInt("mute");
                        int optInt10 = jSONObject2.optInt(f22008n);
                        int optInt11 = jSONObject2.optInt(f22009o);
                        int optInt12 = jSONObject2.optInt(f22011q);
                        int optInt13 = jSONObject2.optInt(f22012r);
                        int optInt14 = jSONObject2.optInt(f22013s);
                        jVar.a(optInt8 == 1);
                        jVar.b(optInt9);
                        jVar.c(optInt10);
                        jVar.d(optInt11);
                        jVar.e(optInt12);
                        jVar.f(optInt13);
                        if (optInt14 != 0) {
                            i = optInt14;
                        }
                        jVar.i(i);
                    }
                    h.a().a(obj, Base64.encodeToString(i9.getBytes(), 2));
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.j
    public void initialize(Object obj, WindVaneWebView windVaneWebView) {
        super.initialize(obj, windVaneWebView);
        if (obj instanceof IJSFactory) {
            this.i = (IJSFactory) obj;
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void insertViewAbove(Object obj, String str) {
        a(obj, str);
        try {
            c.a().s(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void insertViewBelow(Object obj, String str) {
        a(obj, str);
        try {
            c.a().t(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void isSystemResume(Object obj, String str) {
        try {
            IJSFactory iJSFactory = this.i;
            if (iJSFactory != null) {
                h.a().a(obj, b(iJSFactory.getActivityProxy().h()));
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void ivRewardAdsWithoutVideo(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str) || this.i == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.i.getJSContainerModule().ivRewardAdsWithoutVideo(str);
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void loadads(Object obj, String str) {
        String str2;
        int i;
        int i4;
        try {
            if (TextUtils.isEmpty(str)) {
                str2 = "";
                i = 1;
                i4 = 1;
            } else {
                JSONObject jSONObject = new JSONObject(str);
                str2 = jSONObject.optString("unitId");
                i4 = jSONObject.optInt("type", 1);
                if (i4 > 2) {
                    i4 = 1;
                }
                i = jSONObject.optInt("adtype", 1);
            }
            if (TextUtils.isEmpty(str2)) {
                h.a().a(obj, b(1));
                return;
            }
            if (obj != null) {
                b bVar = (b) obj;
                if (bVar.f18220a != null) {
                    WindVaneWebView windVaneWebView = bVar.f18220a;
                    if (windVaneWebView.getWebViewListener() != null) {
                        ((com.anythink.expressad.atsignalcommon.b.a) windVaneWebView.getWebViewListener()).a(str2, i4, i);
                    }
                }
            }
            h.a().a(obj, b(0));
        } catch (Throwable unused) {
            h.a().a(obj, b(1));
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void loadingResourceStatus(Object obj, String str) {
        a(obj, str);
        if (obj != null) {
            try {
                int optInt = new JSONObject(str).optInt("isReady", 1);
                WindVaneWebView windVaneWebView = ((b) obj).f18220a;
                if (windVaneWebView == null || windVaneWebView.getWebViewListener() == null) {
                    return;
                }
                windVaneWebView.getWebViewListener().loadingResourceStatus(windVaneWebView, optInt);
            } catch (Throwable th) {
                th.toString();
            }
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void notifyCloseBtn(Object obj, String str) {
        try {
            if (this.i == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.i.getJSVideoModule().notifyCloseBtn(new JSONObject(str).optInt(com.anythink.core.express.b.a.f17684b));
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void onlyAppendSubView(Object obj, String str) {
        a(obj, str);
        try {
            c.a().k(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void onlyAppendViewTo(Object obj, String str) {
        a(obj, str);
        try {
            c.a().l(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void onlyInsertViewAbove(Object obj, String str) {
        a(obj, str);
        try {
            c.a().u(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void onlyInsertViewBelow(Object obj, String str) {
        a(obj, str);
        try {
            c.a().v(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void openURL(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("url");
            int optInt = jSONObject.optInt("type");
            if (optInt == 1) {
                y.a(optString);
            } else if (optInt == 2) {
                y.a(this.f18235f, optString);
            }
        } catch (JSONException e6) {
            e6.getMessage();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void playVideoFinishOperate(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str) || this.i == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.i.getJSCommon().g(new JSONObject(str).optInt("type"));
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void playerGetMuteState(Object obj, String str) {
        a(obj, str);
        try {
            c.a().H(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void playerMute(Object obj, String str) {
        a(obj, str);
        try {
            c.a().F(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void playerPause(Object obj, String str) {
        a(obj, str);
        try {
            c.a().B(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void playerPlay(Object obj, String str) {
        a(obj, str);
        try {
            c.a().A(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void playerResume(Object obj, String str) {
        a(obj, str);
        try {
            c.a().C(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void playerSetRenderType(Object obj, String str) {
        a(obj, str);
        try {
            c.a();
            c.J(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void playerSetSource(Object obj, String str) {
        a(obj, str);
        try {
            c.a();
            c.I(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void playerStop(Object obj, String str) {
        a(obj, str);
        try {
            c.a().D(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void playerUnmute(Object obj, String str) {
        a(obj, str);
        try {
            c.a().G(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void playerUpdateFrame(Object obj, String str) {
        a(obj, str);
        try {
            c.a();
            c.E(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void preloadSubPlayTemplateView(Object obj, String str) {
        a(obj, str);
        try {
            if (this.i != null) {
                c.a().K(obj, new JSONObject(str));
                return;
            }
            b bVar = (b) obj;
            if (bVar.f18220a != null) {
                WindVaneWebView windVaneWebView = bVar.f18220a;
                if (windVaneWebView.getWebViewListener() != null) {
                    ((com.anythink.expressad.atsignalcommon.b.a) windVaneWebView.getWebViewListener()).a(obj, str);
                }
            }
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void progressBarOperate(Object obj, String str) {
        try {
            if (this.i == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.i.getJSVideoModule().progressBarOperate(new JSONObject(str).optInt("view_visible"));
            h.a().a(obj, b(0));
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void progressOperate(Object obj, String str) {
        try {
            if (this.i == null || TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            this.i.getJSVideoModule().progressOperate(jSONObject.optInt(g.a.f13106C), jSONObject.optInt("view_visible"));
            h.a().a(obj, b(0));
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void reactDeveloper(Object obj, String str) {
        try {
            if (this.i == null || TextUtils.isEmpty(str)) {
                h.a().b(obj, b(1));
            } else {
                this.i.getJSBTModule().reactDeveloper(obj, str);
            }
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void readyStatus(Object obj, String str) {
        if (obj != null) {
            try {
                b bVar = (b) obj;
                int optInt = new JSONObject(str).optInt("isReady", 1);
                if (bVar.f18220a.getObject() instanceof j) {
                    ((j) bVar.f18220a.getObject()).j(optInt);
                }
                WindVaneWebView windVaneWebView = bVar.f18220a;
                if (windVaneWebView == null || windVaneWebView.getWebViewListener() == null) {
                    return;
                }
                windVaneWebView.getWebViewListener().readyState(windVaneWebView, optInt);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void removeCacheItem(Object obj, String str) {
        String str2;
        int i = 0;
        try {
            SharedPreferences sharedPreferences = t.b().g().getSharedPreferences(a.f19254t, 0);
            if (TextUtils.isEmpty(str)) {
                str2 = "";
            } else {
                String string = new JSONObject(str).getString("key");
                if (!TextUtils.isEmpty(string)) {
                    sharedPreferences.edit().remove(string).apply();
                }
                str2 = "Delete Success";
                i = 1;
            }
        } catch (Throwable th) {
            th.toString();
            str2 = "Delete Error, reason is : " + th.getMessage();
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", 1 ^ i);
            jSONObject.put("message", str2);
            if (obj == null || i == 0) {
                h.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            } else {
                h.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void removeFromSuperView(Object obj, String str) {
        a(obj, str);
        try {
            c.a().h(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void reportData(Object obj, String str) {
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void reportUrls(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                h.a().b(obj, b(1));
                return;
            }
            IJSFactory iJSFactory = this.i;
            if (iJSFactory != null && iJSFactory.getJSBTModule() != null) {
                this.i.getJSBTModule().reportUrls(obj, str);
            } else {
                c.a();
                c.b(obj, str);
            }
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void setCacheItem(Object obj, String str) {
        String str2;
        int i = 0;
        try {
            SharedPreferences sharedPreferences = t.b().g().getSharedPreferences(a.f19254t, 0);
            if (TextUtils.isEmpty(str)) {
                str2 = "";
            } else {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("key");
                String string2 = jSONObject.getString("value");
                if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                    sharedPreferences.edit().putString(string, string2).apply();
                }
                str2 = "Save Success";
                i = 1;
            }
        } catch (Throwable th) {
            th.toString();
            str2 = "Save Error, reason is : " + th.getMessage();
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", 1 ^ i);
            jSONObject2.put("message", str2);
            if (obj == null || i == 0) {
                h.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            } else {
                h.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void setScaleFitXY(Object obj, String str) {
        try {
            if (this.i == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.i.getJSVideoModule().setScaleFitXY(new JSONObject(str).optInt("fitxy"));
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void setSubPlayTemplateInfo(Object obj, String str) {
        a(obj, str);
        try {
            c.a().N(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void setViewAlpha(Object obj, String str) {
        a(obj, str);
        try {
            c.a().q(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void setViewBgColor(Object obj, String str) {
        a(obj, str);
        try {
            c.a().p(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void setViewRect(Object obj, String str) {
        a(obj, str);
        try {
            c.a().g(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void setViewScale(Object obj, String str) {
        a(obj, str);
        try {
            c.a().r(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void showAlertView(Object obj, String str) {
        try {
            if (this.i == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.i.getJSVideoModule().showIVRewardAlertView(str);
            h.a().a(obj, "showAlertView", "");
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void showVideoClickView(Object obj, String str) {
        try {
            if (this.i == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.i.getJSContainerModule().showVideoClickView(new JSONObject(str).optInt("type"));
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void showVideoLocation(Object obj, String str) {
        try {
            if (this.i == null || TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            this.i.getJSVideoModule().showVideoLocation(jSONObject.optInt("margin_top", 0), jSONObject.optInt("margin_left", 0), jSONObject.optInt("view_width", 0), jSONObject.optInt("view_height", 0), jSONObject.optInt("radius", 0), jSONObject.optInt("border_top", 0), jSONObject.optInt("border_left", 0), jSONObject.optInt("border_width", 0), jSONObject.optInt("border_height", 0));
            this.i.getJSCommon().l();
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void showView(Object obj, String str) {
        a(obj, str);
        try {
            c.a().o(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void soundOperate(Object obj, String str) {
        try {
            if (this.i == null || TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("mute");
            int optInt2 = jSONObject.optInt("view_visible");
            String optString = jSONObject.optString("pt", "");
            if (TextUtils.isEmpty(optString)) {
                this.i.getJSVideoModule().soundOperate(optInt, optInt2);
            } else {
                this.i.getJSVideoModule().soundOperate(optInt, optInt2, optString);
            }
            h.a().a(obj, b(0));
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void statistics(Object obj, String str) {
        try {
            if (this.i == null || TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            this.i.getJSCommon().a(jSONObject.optInt("type"), jSONObject.optString("data"));
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void toggleCloseBtn(Object obj, String str) {
        try {
            if (this.i == null || TextUtils.isEmpty(str)) {
                return;
            }
            int optInt = new JSONObject(str).optInt(com.anythink.core.express.b.a.f17684b);
            int i = 2;
            if (optInt != 1) {
                i = optInt == 2 ? 1 : 0;
            }
            this.i.getJSVideoModule().closeVideoOperate(0, i);
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void triggerCloseBtn(Object obj, String str) {
        try {
            if (this.i == null || TextUtils.isEmpty(str) || !new JSONObject(str).optString(com.anythink.core.express.b.a.f17684b).equals("click")) {
                return;
            }
            this.i.getJSVideoModule().closeVideoOperate(1, -1);
            h.a().a(obj, b(0));
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void videoOperate(Object obj, String str) {
        try {
            if (this.i == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.i.getJSVideoModule().videoOperate(new JSONObject(str).optInt("pause_or_resume"));
            h.a().a(obj, b(0));
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void webviewFireEvent(Object obj, String str) {
        a(obj, str);
        try {
            c.a().O(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void webviewGoBack(Object obj, String str) {
        a(obj, str);
        try {
            c.a().y(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void webviewGoForward(Object obj, String str) {
        a(obj, str);
        try {
            c.a().z(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void webviewLoad(Object obj, String str) {
        a(obj, str);
        try {
            c.a().w(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void webviewReload(Object obj, String str) {
        a(obj, str);
        try {
            c.a().x(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    private static void a(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", 1);
                jSONObject.put("message", "params is null");
                h.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            }
        } catch (Exception e6) {
            e6.getMessage();
        }
    }
}
