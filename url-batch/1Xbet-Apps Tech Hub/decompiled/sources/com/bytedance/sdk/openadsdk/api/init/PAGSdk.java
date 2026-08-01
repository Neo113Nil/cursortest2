package com.bytedance.sdk.openadsdk.api.init;

import android.app.Application;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutManager;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.webkit.WebView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.adsdk.ugeno.icD.Jd;
import com.bytedance.sdk.component.icD;
import com.bytedance.sdk.component.so.Mxy;
import com.bytedance.sdk.component.so.sUS;
import com.bytedance.sdk.component.so.so;
import com.bytedance.sdk.component.utils.uc;
import com.bytedance.sdk.component.widget.PangleWebView;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.InitConfig;
import com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory;
import com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory;
import com.bytedance.sdk.openadsdk.api.factory.SDKTypeConfig;
import com.bytedance.sdk.openadsdk.bNS.pvs;
import com.bytedance.sdk.openadsdk.common.vG;
import com.bytedance.sdk.openadsdk.core.Ju;
import com.bytedance.sdk.openadsdk.core.dyT;
import com.bytedance.sdk.openadsdk.core.kj;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.nativeexpress.Wyp;
import com.bytedance.sdk.openadsdk.mnm.pvs.yiw;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.IP;
import com.bytedance.sdk.openadsdk.utils.ae;
import com.bytedance.sdk.openadsdk.utils.jlb;
import com.bytedance.sdk.openadsdk.vG.pvs;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class PAGSdk {
    public static final int INIT_LOCAL_FAIL_CODE = 4000;
    private static long pvs;

    public interface PAGInitCallback {
        void fail(int i, String str);

        void success();
    }

    static {
        try {
            icD.pvs(new icD.pvs() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.1
                @Override // com.bytedance.sdk.component.icD.pvs
                public ExecutorService getExecutorService() {
                    return ae.Jd();
                }
            });
            ae.pvs(new so("tt_init_memory_data") { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.2
                @Override // java.lang.Runnable
                public void run() {
                    PAGInitHelper.initAPM();
                    PAGInitHelper.initMemoryData();
                }
            });
            Ju.pvs(System.currentTimeMillis());
            Ju.icD();
            SSWebView.setWebViewProvider(new SSWebView.vG() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.3
                @Override // com.bytedance.sdk.component.widget.SSWebView.vG
                public WebView createWebView(Context context, AttributeSet attributeSet, int i) {
                    if (!(context instanceof MutableContextWrapper)) {
                        context = context.getApplicationContext();
                    }
                    try {
                        return i == 0 ? new PangleWebView(context, attributeSet) : new PangleWebView(context, attributeSet, i);
                    } catch (Exception unused) {
                        return i == 0 ? new PangleWebView(context, attributeSet) : new PangleWebView(context, attributeSet, i);
                    }
                }
            });
        } catch (Throwable th) {
            Log.i("TTAD.PAGSdk", th.getMessage());
        }
        pvs = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void icD(final Context context, final InitConfig initConfig, PAGInitCallback pAGInitCallback) {
        Context applicationContext;
        pvs = SystemClock.elapsedRealtime();
        mnm.pvs(context);
        if (pAGInitCallback != null) {
            synchronized (PAGInitHelper.CALLBACK_LIST) {
                if (!PAGInitHelper.CALLBACK_LIST.contains(pAGInitCallback)) {
                    PAGInitHelper.CALLBACK_LIST.add(pAGInitCallback);
                    if (Ju.Jd() == 3) {
                        return;
                    }
                }
            }
        }
        if (vG.pvs()) {
            icD(-1, "DisableSDK is called, interrupt initialization");
            return;
        }
        if (isInitSuccess()) {
            Jd();
            return;
        }
        Ju.pvs(3);
        if (context == null) {
            icD(4000, "Context is null, please check. ");
            return;
        }
        if (!(context instanceof Application) && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        if (initConfig == null) {
            icD(4000, "PAGConfig is null, please check.");
            return;
        }
        Jd(context, initConfig);
        ApmHelper.initApm(context, initConfig);
        try {
            com.bytedance.sdk.openadsdk.core.so.pvs(new kj() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.4
                public void success() {
                    PAGSdk.Jd();
                }

                @Override // com.bytedance.sdk.openadsdk.core.kj
                public void fail(int i, String str) {
                    PAGSdk.icD(i, str);
                }
            });
            try {
                uc.pvs(mnm.pvs(), "tt_ad_logo_txt");
                if (uc.Jd(context, "tt_ad_logo") == 0) {
                    pvs(initConfig, pAGInitCallback);
                    return;
                }
                if (isInitSuccess()) {
                    if (pAGInitCallback != null) {
                        Jd();
                        return;
                    }
                    return;
                }
                final pvs pvsVar = new pvs();
                SDKTypeConfig.setSdkTypeFactory(new ISDKTypeFactory() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.5
                    @Override // com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory
                    public IADTypeLoaderFactory createADTypeLoaderFactory(String str) {
                        return pvs.this;
                    }
                });
                if (!initConfig.isSupportMultiProcess()) {
                    icD(context, initConfig);
                } else {
                    com.bytedance.sdk.openadsdk.multipro.aidl.pvs.pvs().pvs(new com.bytedance.sdk.openadsdk.multipro.aidl.icD() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.6
                        @Override // com.bytedance.sdk.openadsdk.multipro.aidl.icD
                        public void onServiceConnected() {
                            Ju.icD().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.6.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    PAGSdk.icD(context, initConfig);
                                }
                            });
                        }
                    });
                    com.bytedance.sdk.openadsdk.multipro.aidl.pvs.pvs().vG();
                }
            } catch (Throwable unused) {
                pvs(initConfig, pAGInitCallback);
            }
        } catch (Throwable unused2) {
            icD(4000, "Internal Error, setting exception. ");
        }
    }

    private static void pvs(InitConfig initConfig, PAGInitCallback pAGInitCallback) {
        Ju.pvs(2);
        if (pAGInitCallback != null) {
            if (initConfig instanceof PAGConfig) {
                icD(4000, "resources not found, if you use aab please call PAGConfig.setPackageName");
            } else {
                icD(4000, "resources not found, if you use aab please call TTAdConfig.setPackageName");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void icD(Context context, InitConfig initConfig) {
        long j;
        try {
        } catch (Throwable th) {
            th.getMessage();
            com.bytedance.sdk.component.utils.Ju.pvs("TTAD.PAGSdk", th.getMessage());
            long elapsedRealtime = SystemClock.elapsedRealtime() - pvs;
            icD(4000, th.getMessage());
            j = elapsedRealtime;
        }
        if (isInitSuccess()) {
            Jd();
            return;
        }
        NB(context, initConfig);
        com.bytedance.sdk.openadsdk.core.settings.mnm.Lxj().OT();
        j = SystemClock.elapsedRealtime() - pvs;
        Jd();
        sUS(context, initConfig);
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - pvs;
        pvs(context, isInitSuccess(), initConfig, elapsedRealtime2, j);
        Object[] objArr = new Object[4];
        Long.valueOf(j);
        Long.valueOf(elapsedRealtime2);
    }

    private static void vG(Context context, InitConfig initConfig) {
        Ju.pvs = true;
        dyT.pvs().pvs(initConfig.getAppId()).icD(initConfig.getCoppa()).vG(initConfig.getGdpr()).Jd(initConfig.getCcpa()).sUS(initConfig.getAppIconId()).pvs(initConfig.getTitleBarTheme());
        com.bytedance.sdk.openadsdk.core.so.ny();
        if (initConfig instanceof PAGConfig) {
            dyT.pvs().NB(((PAGConfig) initConfig).getDebugLog() ? 1 : 0);
        }
        try {
            if (icD(initConfig)) {
                dyT.pvs().pvs();
                IP.pvs();
            }
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.component.utils.so.pvs();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean icD(InitConfig initConfig) {
        return ((PAGConfig) initConfig).getDebugLog();
    }

    private static void Jd(Context context, InitConfig initConfig) {
        if (!TextUtils.isEmpty(initConfig.getPackageName())) {
            uc.pvs(initConfig.getPackageName());
            Jd.pvs(initConfig.getPackageName());
        } else {
            uc.pvs((String) null);
            Jd.pvs((String) null);
        }
        mnm.pvs(context);
        if (initConfig.isSupportMultiProcess()) {
            com.bytedance.sdk.openadsdk.multipro.icD.pvs();
        } else {
            com.bytedance.sdk.openadsdk.multipro.icD.icD();
        }
        Wyp.pvs();
        com.bytedance.sdk.openadsdk.core.ugen.icD.pvs(context);
    }

    private static void NB(Context context, InitConfig initConfig) {
        if (com.bytedance.sdk.openadsdk.core.settings.kj.pvs()) {
            sUS.vG(-1);
            sUS.pvs(new com.bytedance.sdk.component.so.Wyp() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.7
                @Override // com.bytedance.sdk.component.so.Wyp
                public Mxy createThreadFactory(int i, String str) {
                    return new Mxy(i, str) { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.7.1
                        @Override // com.bytedance.sdk.component.so.Mxy, java.util.concurrent.ThreadFactory
                        public Thread newThread(Runnable runnable) {
                            int tQ = com.bytedance.sdk.openadsdk.core.settings.mnm.Lxj().tQ();
                            if (tQ >= -524288 && tQ < 0) {
                                Thread thread = new Thread(this.pvs, runnable, this.icD, tQ);
                                if (thread.isDaemon()) {
                                    thread.setDaemon(false);
                                }
                                if (this.vG > 10 || this.vG <= 0) {
                                    this.vG = 5;
                                }
                                thread.setPriority(this.vG);
                                return thread;
                            }
                            return super.newThread(runnable);
                        }
                    };
                }
            });
            com.bytedance.sdk.openadsdk.multipro.vG.pvs(context);
            com.bytedance.sdk.component.yiw.vG.pvs.pvs(new com.bytedance.sdk.component.yiw.vG.vG() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.8
                @Override // com.bytedance.sdk.component.yiw.vG.vG
                public ExecutorService getThreadPool() {
                    return ae.Jd();
                }
            });
            com.bytedance.sdk.openadsdk.Jd.icD.vG();
            Ju.icD.set(true);
            try {
                com.bytedance.sdk.component.adexpress.pvs.pvs.pvs.pvs().pvs(new com.bytedance.sdk.openadsdk.sUS.pvs());
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.Ju.pvs("TTAD.PAGSdk", e.getMessage());
            }
            vG(initConfig);
            vG(context, initConfig);
            com.bykv.vk.openvk.component.video.api.vG.pvs(context, null);
            com.bykv.vk.openvk.component.video.api.vG.pvs(2);
            com.bykv.vk.openvk.component.video.api.vG.pvs(initConfig.isSupportMultiProcess());
            com.bykv.vk.openvk.component.video.api.vG.pvs(com.bytedance.sdk.openadsdk.qh.vG.pvs().icD().NB());
        }
    }

    private static void sUS(final Context context, final InitConfig initConfig) {
        SystemClock.elapsedRealtime();
        ae.pvs(new so("init_sync") { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.9
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.Ju.pvs.pvs(context, initConfig.getAppId());
                com.bytedance.sdk.openadsdk.Ju.pvs.pvs();
                new com.bytedance.sdk.openadsdk.utils.kj();
                com.bytedance.sdk.component.adexpress.pvs.icD.sUS.pvs(com.bytedance.sdk.openadsdk.utils.mnm.pvs() * 10);
                com.bytedance.sdk.openadsdk.icD.pvs.Jd.pvs(context, initConfig.isSupportMultiProcess());
                com.bytedance.sdk.openadsdk.core.IP.pvs().icD();
                com.bytedance.sdk.openadsdk.core.NB.vG.pvs();
                com.bytedance.sdk.openadsdk.bNS.pvs.pvs(new pvs.InterfaceC0066pvs() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.9.1
                    public void onGdprChanged(int i) {
                        PAGConfig.setGDPRConsent(i);
                    }
                });
                com.bytedance.sdk.openadsdk.core.settings.mnm.pvs = com.bytedance.sdk.openadsdk.core.settings.mnm.vG(context);
                yiw.icD();
                com.bykv.vk.openvk.component.video.pvs.pvs.pvs(mnm.Jd().Ca());
                com.bykv.vk.openvk.component.video.pvs.pvs.pvs(CacheDirFactory.getICacheDir(0));
                com.bytedance.sdk.openadsdk.core.settings.sUS Jd = mnm.Jd();
                if (!Jd.cnN()) {
                    synchronized (Jd) {
                        if (!Jd.cnN()) {
                            Jd.icD();
                            Jd.gA();
                        }
                    }
                }
                DeviceUtils.Wyp();
                PAGInitHelper.maybeAsyncInitTask(context);
                PAGSdk.getBiddingToken();
                sUS.pvs(true);
                sUS.pvs(new com.bytedance.sdk.openadsdk.Wyp.icD.pvs());
                DeviceUtils.pvs(context);
                DeviceUtils.Wyp(context);
                DeviceUtils.qh(context);
                com.com.bytedance.overseas.sdk.pvs.icD.pvs(context);
                com.bytedance.sdk.openadsdk.Wyp.pvs.pvs();
                com.bytedance.sdk.openadsdk.core.settings.Jd.pvs();
                com.bytedance.sdk.openadsdk.Wyp.vG.Jd();
                jlb.Ju(context);
                com.bytedance.sdk.openadsdk.icD.vG.pvs();
                PAGSdk.vG();
                com.bytedance.sdk.openadsdk.core.NB.vG.icD();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void vG() {
        ShortcutManager shortcutManager;
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                Context pvs2 = mnm.pvs();
                if (pvs2 == null || (shortcutManager = (ShortcutManager) pvs2.getSystemService(ShortcutManager.class)) == null) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.so.icD().pvs(shortcutManager.isRequestPinShortcutSupported());
            } catch (Throwable unused) {
            }
        }
    }

    private static void vG(InitConfig initConfig) {
        if (!TextUtils.isEmpty(initConfig.getData())) {
            com.bytedance.sdk.openadsdk.core.so.icD().icD(initConfig.getData());
        }
        com.bytedance.sdk.openadsdk.core.so.icD().vG(icD(initConfig));
    }

    private static void pvs(final Context context, final boolean z, final InitConfig initConfig, final long j, final long j2) {
        com.bytedance.sdk.openadsdk.Wyp.vG.pvs();
        com.bytedance.sdk.openadsdk.Wyp.vG.pvs("pangle_sdk_init", false, new com.bytedance.sdk.openadsdk.Wyp.icD() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.10
            @Override // com.bytedance.sdk.openadsdk.Wyp.icD
            public com.bytedance.sdk.openadsdk.Wyp.pvs.vG getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    boolean vG = com.bytedance.sdk.openadsdk.core.so.icD().vG();
                    jSONObject.put(TypedValues.TransitionType.S_DURATION, j);
                    jSONObject.put("sdk_init_time", j2);
                    jSONObject.put("is_async", true);
                    jSONObject.put("is_multi_process", initConfig.isSupportMultiProcess());
                    jSONObject.put("is_debug", PAGSdk.icD(initConfig));
                    jSONObject.put("is_use_texture_view", initConfig.isUseTextureView());
                    jSONObject.put("is_activate_init", vG);
                    jSONObject.put("minSdkVersion", jlb.qh(context));
                    jSONObject.put("targetSdkVersion", jlb.Wyp(context));
                    jSONObject.put("apm_is_init", ApmHelper.isIsInit());
                    jSONObject.put("is_success", z);
                    com.bytedance.sdk.openadsdk.core.so.icD().icD(false);
                } catch (Exception e) {
                    com.bytedance.sdk.component.utils.Ju.pvs("TTAD.PAGSdk", "run: ", e);
                }
                return com.bytedance.sdk.openadsdk.Wyp.pvs.Jd.icD().pvs("pangle_sdk_init").icD(jSONObject.toString());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Jd() {
        Ju.pvs(1);
        try {
            synchronized (PAGInitHelper.CALLBACK_LIST) {
                Iterator<PAGInitCallback> it = PAGInitHelper.CALLBACK_LIST.iterator();
                while (it.hasNext()) {
                    PAGInitCallback next = it.next();
                    if (next != null) {
                        it.remove();
                        next.success();
                    }
                }
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.Ju.icD(th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void icD(int i, String str) {
        Ju.pvs(2);
        try {
            synchronized (PAGInitHelper.CALLBACK_LIST) {
                Iterator<PAGInitCallback> it = PAGInitHelper.CALLBACK_LIST.iterator();
                while (it.hasNext()) {
                    PAGInitCallback next = it.next();
                    if (next != null) {
                        it.remove();
                        next.fail(i, str);
                    }
                }
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.Ju.icD(th.getMessage());
        }
    }

    public static void init(final Context context, final PAGConfig pAGConfig, final PAGInitCallback pAGInitCallback) {
        Ju.icD().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.11
            @Override // java.lang.Runnable
            public void run() {
                PAGSdk.icD(context, pAGConfig, pAGInitCallback);
            }
        });
    }

    public static boolean isInitSuccess() {
        return Ju.Jd() == 1;
    }

    public static String getSDKVersion() {
        return dyT.pvs() != null ? dyT.pvs().Jd() : "";
    }

    public static String getBiddingToken(Context context, String str) {
        if (vG.pvs()) {
            return null;
        }
        mnm.pvs(context);
        return getBiddingToken(str);
    }

    public static void getBiddingToken(final BiddingTokenCallback biddingTokenCallback) {
        if (biddingTokenCallback == null) {
            return;
        }
        if (vG.pvs()) {
            biddingTokenCallback.onBiddingTokenCollected(null);
        } else {
            ae.NB(new so("getBiddingToken") { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.12
                @Override // java.lang.Runnable
                public void run() {
                    biddingTokenCallback.onBiddingTokenCollected(PAGSdk.getBiddingToken());
                }
            });
        }
    }

    public static void getBiddingToken(final String str, final BiddingTokenCallback biddingTokenCallback) {
        if (biddingTokenCallback == null) {
            return;
        }
        if (vG.pvs()) {
            biddingTokenCallback.onBiddingTokenCollected(null);
        } else {
            ae.NB(new so("getBiddingToken") { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.13
                @Override // java.lang.Runnable
                public void run() {
                    biddingTokenCallback.onBiddingTokenCollected(PAGSdk.getBiddingToken(str));
                }
            });
        }
    }

    public static String getBiddingToken(String str) {
        if (vG.pvs()) {
            return null;
        }
        return (mnm.pvs() == null || dyT.pvs() == null) ? "" : dyT.pvs().vG(str);
    }

    public static String getBiddingToken(Context context) {
        if (vG.pvs()) {
            return null;
        }
        mnm.pvs(context);
        return getBiddingToken();
    }

    public static String getBiddingToken() {
        if (vG.pvs()) {
            return null;
        }
        return (mnm.pvs() == null || dyT.pvs() == null) ? "" : dyT.pvs().NB();
    }

    public static boolean onlyVerityPlayable(String str, int i, String str2, String str3, String str4) {
        if (dyT.pvs() != null) {
            return dyT.pvs().pvs(str, i, str2, str3, str4);
        }
        return false;
    }

    public static String getApplicationName(Context context) {
        try {
            PackageManager packageManager = context.getApplicationContext().getPackageManager();
            return (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(context.getPackageName(), 128));
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    public static void closeMultiWebViewFileLock() {
        com.bytedance.sdk.openadsdk.multipro.vG.pvs();
    }

    public static void addPAGInitCallback(PAGInitCallback pAGInitCallback) {
        if (pAGInitCallback != null && Ju.Jd() == 0) {
            PAGInitHelper.CALLBACK_LIST.add(pAGInitCallback);
        }
    }

    public static void setAabPackageName(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        uc.pvs(str);
        Jd.pvs(str);
    }

    public static void setAdRevenue(JSONObject jSONObject) {
        if (jSONObject != null && mnm.Jd().zM() && isInitSuccess()) {
            com.bytedance.sdk.openadsdk.Wyp.vG.pvs().pvs(jSONObject);
        }
    }

    private static void setSdkDisable(boolean z) {
        vG.pvs(z);
    }
}
