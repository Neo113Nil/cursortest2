package com.bytedance.sdk.openadsdk.zg;

import android.app.Application;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.content.pm.ShortcutManager;
import android.os.Build;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.webkit.WebView;
import com.bytedance.adsdk.ugeno.nps.fb;
import com.bytedance.sdk.component.bvs.hhw;
import com.bytedance.sdk.component.bvs.nps;
import com.bytedance.sdk.component.fs;
import com.bytedance.sdk.component.utils.bjh;
import com.bytedance.sdk.component.utils.doe;
import com.bytedance.sdk.component.utils.fs;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.component.utils.nqi;
import com.bytedance.sdk.component.utils.phc;
import com.bytedance.sdk.component.utils.zak;
import com.bytedance.sdk.component.utils.zg;
import com.bytedance.sdk.component.zg.fs.zn;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.InitConfig;
import com.bytedance.sdk.openadsdk.api.bidding.PAGBiddingRequest;
import com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory;
import com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory;
import com.bytedance.sdk.openadsdk.api.factory.SDKTypeConfig;
import com.bytedance.sdk.openadsdk.api.init.PAGBidCallback;
import com.bytedance.sdk.openadsdk.api.init.PAGBidError;
import com.bytedance.sdk.openadsdk.api.init.PAGConfig;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import com.bytedance.sdk.openadsdk.core.bvs;
import com.bytedance.sdk.openadsdk.core.cn;
import com.bytedance.sdk.openadsdk.core.cyb;
import com.bytedance.sdk.openadsdk.core.ev;
import com.bytedance.sdk.openadsdk.core.iv;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.mw;
import com.bytedance.sdk.openadsdk.core.rt;
import com.bytedance.sdk.openadsdk.core.settings.rc;
import com.bytedance.sdk.openadsdk.uqh.btk;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.fkt;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.bytedance.sdk.openadsdk.utils.kjb;
import com.bytedance.sdk.openadsdk.utils.kw;
import com.bytedance.sdk.openadsdk.utils.nu;
import com.bytedance.sdk.openadsdk.utils.olo;
import com.bytedance.sdk.openadsdk.utils.oub;
import com.bytedance.sdk.openadsdk.utils.so;
import com.ironsource.O6;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class zmn {
    public static final List<PAGSdk.PAGInitCallback> zmn = new ArrayList();
    private static long fs = 0;

    public static final void zmn() {
        try {
            fs.zmn(new fs.zmn() { // from class: com.bytedance.sdk.openadsdk.zg.zmn.1
                @Override // com.bytedance.sdk.component.fs.zmn
                public ExecutorService zmn() {
                    return nu.btk();
                }

                @Override // com.bytedance.sdk.component.fs.zmn
                public HandlerThread zmn(String str, int i) {
                    return zg.zmn(str, i);
                }
            });
            nu.zmn(new zn("tt_init_memory_data") { // from class: com.bytedance.sdk.openadsdk.zg.zmn.2
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.phc.zmn.fs.zmn.zmn().zmn(false);
                    ApmHelper.initAPM();
                    zmn.fs();
                }
            });
            cn.zmn(System.currentTimeMillis());
            cn.fs();
            nps.setWebViewProvider(new nps.fb() { // from class: com.bytedance.sdk.openadsdk.zg.zmn.3
                @Override // com.bytedance.sdk.component.bvs.nps.fb
                public WebView zmn(Context context, AttributeSet attributeSet, int i, nps.zn znVar) {
                    if (zak.fs(znVar)) {
                        return zak.fs(context, attributeSet, i, znVar);
                    }
                    if (!(context instanceof MutableContextWrapper)) {
                        context = context.getApplicationContext();
                    }
                    try {
                        return i == 0 ? new hhw(context, attributeSet) : new hhw(context, attributeSet, i);
                    } catch (Exception unused) {
                        return i == 0 ? new hhw(context, attributeSet) : new hhw(context, attributeSet, i);
                    }
                }
            });
        } catch (Throwable th) {
            Log.i("PAGSdk", th.getMessage());
        }
    }

    public static void zmn(Context context) {
        com.bytedance.sdk.openadsdk.core.zmn.zmn.zmn(context);
        fkt.zmn();
        jy.zmn(context);
        fb();
        kgc.btk();
        String zmn2 = mw.zmn(context);
        com.bytedance.sdk.openadsdk.core.klz.zn.fs(zmn2);
        com.bytedance.sdk.openadsdk.fb.zmn.fs.zmn(zmn2, true);
        com.bytedance.sdk.openadsdk.core.iv.mw.fs();
        com.bytedance.sdk.openadsdk.core.cn.zn.zmn.zmn().fs();
    }

    private static void fb() {
        com.bytedance.sdk.openadsdk.core.zn.zmn().zmn(CommonUrlParts.UUID, kjb.zmn());
    }

    public static void fs() {
        kgc.fb();
        com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("sp_compliance_file", "a", 0);
        com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("ttopenadsdk", "a", 0);
        com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("sp_global_file", "a", 0);
        com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("sp_global_app_id", "a", 0);
        com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("tpl_fetch_model", "a", 0);
        com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("tt_sp", "a", 0);
        com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("pag_sp_bad_par", "did");
        com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("pag_sp_bad_par", O6.X0);
    }

    public static void zmn(Context context, InitConfig initConfig, PAGSdk.PAGInitCallback pAGInitCallback) {
        Context applicationContext;
        int pa;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        fs = elapsedRealtime;
        cn.zn = elapsedRealtime;
        kgc.fs(context);
        if (pAGInitCallback != null) {
            List<PAGSdk.PAGInitCallback> list = zmn;
            synchronized (list) {
                if (!list.contains(pAGInitCallback)) {
                    list.add(pAGInitCallback);
                    if (cn.fb() == 3) {
                        return;
                    }
                }
            }
        }
        if (com.bytedance.sdk.openadsdk.common.hhw.zmn()) {
            fs(-1, "DisableSDK is called, interrupt initialization");
            return;
        }
        if (PAGSdk.isInitSuccess()) {
            hhw();
            zn(initConfig);
            return;
        }
        if (initConfig == null) {
            fs(4000, "PAGConfig is null, please check.");
            return;
        }
        cn.zmn(3);
        if (com.bytedance.sdk.openadsdk.core.rc.fs.zmn().rc() && ((pa = initConfig.getPA()) < -1 || pa > 1)) {
            fs(10004, bvs.zmn(10004));
            return;
        }
        if (context == null) {
            fs(4000, "Context is null, please check. ");
            return;
        }
        if (!(context instanceof Application) && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        zn(context, initConfig);
        try {
            ApmHelper.initApm(context, initConfig.getAppId());
            iv.zmn(new rt() { // from class: com.bytedance.sdk.openadsdk.zg.zmn.4
                @Override // com.bytedance.sdk.openadsdk.core.rt
                public void zmn(int i, String str) {
                    zmn.fs(i, str);
                }
            });
            try {
                doe.zmn(kgc.zmn(), "tt_ad_logo_txt");
                if (doe.fb(context, "tt_ad_logo") == 0) {
                    zmn(initConfig, pAGInitCallback);
                    return;
                }
                if (PAGSdk.isInitSuccess()) {
                    if (pAGInitCallback != null) {
                        hhw();
                    }
                } else {
                    final com.bytedance.sdk.openadsdk.btk.zmn zmnVar = new com.bytedance.sdk.openadsdk.btk.zmn();
                    SDKTypeConfig.setSdkTypeFactory(new ISDKTypeFactory() { // from class: com.bytedance.sdk.openadsdk.zg.zmn.5
                        @Override // com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory
                        public IADTypeLoaderFactory createADTypeLoaderFactory(String str) {
                            return com.bytedance.sdk.openadsdk.btk.zmn.this;
                        }
                    });
                    zmn(context, initConfig);
                }
            } catch (Throwable unused) {
                zmn(initConfig, pAGInitCallback);
            }
        } catch (Throwable unused2) {
            fs(4000, "Internal Error, setting exception. ");
        }
    }

    private static void zmn(InitConfig initConfig, PAGSdk.PAGInitCallback pAGInitCallback) {
        cn.zmn(2);
        if (pAGInitCallback != null) {
            if (initConfig instanceof PAGConfig) {
                fs(4000, "resources not found, if you use aab please call PAGConfig.setPackageName");
            } else {
                fs(4000, "resources not found, if you use aab please call TTAdConfig.setPackageName");
            }
        }
    }

    private static void zmn(Context context, InitConfig initConfig) {
        long j;
        try {
        } catch (Throwable th) {
            th.getMessage();
            iqz.zn("PAGSdk", th.getMessage());
            long elapsedRealtime = SystemClock.elapsedRealtime() - fs;
            fs(4000, th.getMessage());
            j = elapsedRealtime;
        }
        if (PAGSdk.isInitSuccess()) {
            hhw();
            return;
        }
        fb(context, initConfig);
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - fs;
        hhw();
        btk(context, initConfig);
        j = elapsedRealtime2;
        zmn(context, PAGSdk.isInitSuccess(), initConfig, SystemClock.elapsedRealtime() - fs, j);
    }

    private static void fs(Context context, InitConfig initConfig) {
        cn.zmn = true;
        ev.zmn().zmn(initConfig.getAppId()).fb(initConfig.getPA()).zn(bjh.zmn(context)).zmn(initConfig.getTitleBarTheme()).zn(initConfig.getAdxId());
        iv.phc();
        if (initConfig instanceof PAGConfig) {
            ev.zmn().fs(((PAGConfig) initConfig).getDebugLog() ? 1 : 0);
        }
        com.bytedance.sdk.component.utils.bvs.zmn();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean fs(InitConfig initConfig) {
        return ((PAGConfig) initConfig).getDebugLog();
    }

    private static void zn(Context context, InitConfig initConfig) {
        if (!TextUtils.isEmpty(initConfig.getPackageName())) {
            doe.zmn(initConfig.getPackageName());
            fb.zmn(initConfig.getPackageName());
        } else {
            doe.zmn((String) null);
            fb.zmn((String) null);
        }
        com.bytedance.sdk.openadsdk.kw.zmn.zmn(context);
        try {
            if (fs(initConfig)) {
                ev.zmn().fs();
                kw.zmn();
            }
        } catch (Throwable unused) {
        }
        kgc.fs(context);
        com.bytedance.sdk.openadsdk.core.iv.mw.zmn();
        com.bytedance.sdk.openadsdk.core.mw.zn.zmn(context);
    }

    private static void fb(Context context, InitConfig initConfig) {
        if (com.bytedance.sdk.openadsdk.core.settings.nps.zmn()) {
            com.bytedance.sdk.openadsdk.nps.fs.zn();
            cn.fs.set(true);
            try {
                com.bytedance.sdk.component.adexpress.zmn.zmn.zmn.zmn().zmn(new com.bytedance.sdk.openadsdk.iv.zmn());
            } catch (Exception e) {
                iqz.zn("PAGSdk", e.getMessage());
            }
            zn(initConfig);
            fs(context, initConfig);
            com.bykv.vk.openvk.zmn.zmn.zmn.zn.zmn(context, null);
            com.bykv.vk.openvk.zmn.zmn.zmn.zn.zmn(2);
            com.bykv.vk.openvk.zmn.zmn.zmn.zn.zmn(com.bytedance.sdk.openadsdk.iqz.fs.fs().zn().zg());
        }
    }

    private static void btk(final Context context, final InitConfig initConfig) {
        nu.zmn(new zn("init_sync") { // from class: com.bytedance.sdk.openadsdk.zg.zmn.6
            @Override // java.lang.Runnable
            public void run() {
                cn.zmn(initConfig.getData());
                btk.zmn(context, initConfig.getAppId());
                btk.fs();
                com.bytedance.sdk.openadsdk.kgc.zn.zmn();
                com.bytedance.sdk.openadsdk.kgc.zn.fs();
                new olo();
                com.bytedance.sdk.component.adexpress.zmn.fs.hhw.zmn(com.bytedance.sdk.openadsdk.utils.doe.zmn() * 10);
                com.bytedance.sdk.openadsdk.fb.zmn.fs.zmn(context);
                cyb.zmn().fs();
                com.bytedance.sdk.openadsdk.core.klz.zn.zmn();
                com.bytedance.sdk.openadsdk.core.mw.zn.zmn();
                rc.btk = rc.zmn(context);
                rc.fb = rc.fs(context);
                com.bytedance.sdk.openadsdk.bjh.fs.nps.fs();
                com.bykv.vk.openvk.zmn.zmn.fs.zmn.zmn((JSONObject) btk.zmn("video_cache_config", (Object) null, com.bytedance.sdk.openadsdk.uqh.fs.zmn));
                com.bykv.vk.openvk.zmn.zmn.fs.zmn.zmn(CacheDirFactory.getICacheDir(0));
                rc fb = kgc.fb();
                if (!fb.xrr()) {
                    synchronized (fb) {
                        try {
                            if (!fb.xrr()) {
                                fb.zn();
                                fb.hgd();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                cn.hhw();
                DeviceUtils.rc();
                zmn.zmn(context);
                DeviceUtils.zmn(context);
                DeviceUtils.rc(context);
                DeviceUtils.klz(context);
                com.bytedance.sdk.openadsdk.cyb.zmn.zmn();
                com.bytedance.sdk.openadsdk.core.settings.fb.zmn();
                com.bytedance.sdk.openadsdk.cyb.fb.fb();
                oub.bvs(context);
                com.bytedance.sdk.openadsdk.fb.zn.zmn();
                zmn.btk();
                com.bytedance.sdk.openadsdk.core.klz.zn.fs();
                com.bytedance.sdk.openadsdk.core.btk.zmn.zmn().fs();
                com.bytedance.sdk.component.zg.fs.fb.zmn(cn.fs());
                if (com.bytedance.sdk.openadsdk.component.nps.zmn.btk()) {
                    com.bytedance.sdk.openadsdk.common.kgc.zmn().fb();
                }
                com.bytedance.sdk.component.utils.fs.zmn(new fs.zmn() { // from class: com.bytedance.sdk.openadsdk.zg.zmn.6.1
                    @Override // com.bytedance.sdk.component.utils.fs.zmn
                    public boolean zmn() {
                        return btk.zmn("start_activity_async", 0) == 1;
                    }

                    @Override // com.bytedance.sdk.component.utils.fs.zmn
                    public boolean fs() {
                        return btk.zmn("start_act_asy", 0) == 1;
                    }

                    @Override // com.bytedance.sdk.component.utils.fs.zmn
                    public ExecutorService zn() {
                        return nu.bvs();
                    }
                });
                oub.zn();
                nqi.zmn(new nqi.fs() { // from class: com.bytedance.sdk.openadsdk.zg.zmn.6.2
                    @Override // com.bytedance.sdk.component.utils.nqi.fs
                    public void zmn(final String str, boolean z, final nqi.zmn zmnVar) {
                        com.bytedance.sdk.openadsdk.cyb.fb.zmn(str, z, new com.bytedance.sdk.openadsdk.cyb.fs() { // from class: com.bytedance.sdk.openadsdk.zg.zmn.6.2.1
                            @Override // com.bytedance.sdk.openadsdk.cyb.fs
                            public com.bytedance.sdk.openadsdk.cyb.zmn.zn zmn() throws Exception {
                                return com.bytedance.sdk.openadsdk.cyb.zmn.fb.fs().zmn(str).fs(zmnVar.fs());
                            }
                        });
                    }
                });
                zak.zmn(btk.zmn("webview_reuse_config", (String) null));
                com.bykv.vk.openvk.zmn.zmn.fs.zmn.zmn(btk.zmn("video_play_config", (String) null));
                com.bytedance.sdk.openadsdk.cyb.zn.zmn();
                com.bytedance.sdk.openadsdk.component.fb.zmn.zmn();
                so.zmn().fs();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void btk() {
        ShortcutManager m;
        boolean isRequestPinShortcutSupported;
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                Context zmn2 = kgc.zmn();
                if (zmn2 == null || (m = zmn$$ExternalSyntheticApiModelOutline1.m(zmn2.getSystemService(zmn$$ExternalSyntheticApiModelOutline0.m()))) == null) {
                    return;
                }
                iv fs2 = iv.fs();
                isRequestPinShortcutSupported = m.isRequestPinShortcutSupported();
                fs2.zmn(isRequestPinShortcutSupported);
            } catch (Throwable unused) {
            }
        }
    }

    private static void zn(InitConfig initConfig) {
        if (initConfig == null) {
            return;
        }
        if (!TextUtils.isEmpty(initConfig.getData())) {
            iv.fs().zn(initConfig.getData());
        }
        iv.fs().zn(fs(initConfig));
    }

    private static void zmn(final Context context, final boolean z, final InitConfig initConfig, final long j, final long j2) {
        com.bytedance.sdk.openadsdk.cyb.fb.zmn("pangle_sdk_init", false, new com.bytedance.sdk.openadsdk.cyb.fs() { // from class: com.bytedance.sdk.openadsdk.zg.zmn.7
            @Override // com.bytedance.sdk.openadsdk.cyb.fs
            public com.bytedance.sdk.openadsdk.cyb.zmn.zn zmn() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    boolean zn = iv.fs().zn();
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, j);
                    jSONObject.put("sdk_init_time", j2);
                    jSONObject.put("is_async", true);
                    jSONObject.put("is_multi_process", true ^ phc.zmn(context));
                    jSONObject.put("is_debug", zmn.fs(initConfig));
                    jSONObject.put("is_use_texture_view", initConfig.isUseTextureView());
                    jSONObject.put("is_activate_init", zn);
                    jSONObject.put("minSdkVersion", oub.nps(context));
                    jSONObject.put("targetSdkVersion", oub.hhw(context));
                    jSONObject.put("apm_is_init", ApmHelper.isIsInit());
                    jSONObject.put("is_success", z);
                    jSONObject.put("support_hevc_levels", com.bykv.vk.openvk.zmn.zmn.zmn.nps.fb.zmn());
                    iv.fs().fs(false);
                } catch (Exception e) {
                    iqz.zmn("PAGSdk", "run: ", e);
                }
                return com.bytedance.sdk.openadsdk.cyb.zmn.fb.fs().zmn("pangle_sdk_init").fs(jSONObject.toString());
            }
        });
    }

    private static void hhw() {
        cn.zmn(1);
        try {
            List<PAGSdk.PAGInitCallback> list = zmn;
            synchronized (list) {
                try {
                    Iterator<PAGSdk.PAGInitCallback> it = list.iterator();
                    while (it.hasNext()) {
                        PAGSdk.PAGInitCallback next = it.next();
                        if (next != null) {
                            it.remove();
                            next.success();
                        }
                    }
                } finally {
                }
            }
            com.bytedance.sdk.openadsdk.kgc.zn.fs(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.zg.zmn.8
                @Override // com.bytedance.sdk.openadsdk.kgc.fb
                public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                    com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                    zmnVar.fs("init");
                    return zmnVar;
                }
            });
        } catch (Throwable th) {
            iqz.zn(th.getMessage(), new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void fs(int i, String str) {
        cn.zmn(2);
        try {
            List<PAGSdk.PAGInitCallback> list = zmn;
            synchronized (list) {
                try {
                    Iterator<PAGSdk.PAGInitCallback> it = list.iterator();
                    while (it.hasNext()) {
                        PAGSdk.PAGInitCallback next = it.next();
                        if (next != null) {
                            it.remove();
                            next.fail(i, str);
                        }
                    }
                    com.bytedance.sdk.openadsdk.kgc.zn.zn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.zg.zmn.9
                        @Override // com.bytedance.sdk.openadsdk.kgc.fb
                        public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                            com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                            zmnVar.fs("init");
                            return zmnVar;
                        }
                    });
                } finally {
                }
            }
        } catch (Throwable th) {
            iqz.zn(th.getMessage(), new Object[0]);
        }
    }

    public static void zmn(PAGBiddingRequest pAGBiddingRequest, PAGBidCallback pAGBidCallback) {
        if (pAGBidCallback == null) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.common.hhw.zmn()) {
            pAGBidCallback.onBiddingTokenFailed(new PAGBidError(10009, bvs.zmn(10009)));
            return;
        }
        if (kgc.zmn() == null) {
            pAGBidCallback.onBiddingTokenFailed(new PAGBidError(10010, "Context is null, please check."));
            return;
        }
        com.bytedance.sdk.openadsdk.core.so zmn2 = ev.zmn();
        if (zmn2 != null) {
            zmn2.zmn(pAGBiddingRequest, pAGBidCallback);
        } else {
            pAGBidCallback.onBiddingTokenFailed(new PAGBidError(10010, "Internal exception"));
        }
    }
}
