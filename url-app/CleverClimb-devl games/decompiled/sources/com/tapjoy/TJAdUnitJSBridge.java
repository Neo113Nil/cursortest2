package com.tapjoy;

import android.R;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.provider.FontsContractCompat;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.moat.analytics.mobile.tjy.MoatAdEvent;
import com.moat.analytics.mobile.tjy.MoatAdEventType;
import com.moat.analytics.mobile.tjy.MoatFactory;
import com.moat.analytics.mobile.tjy.ReactiveVideoTracker;
import com.moat.analytics.mobile.tjy.ReactiveVideoTrackerPlugin;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyErrorMessage;
import com.tapjoy.TapjoyLog;
import com.tapjoy.internal.al;
import com.tapjoy.internal.er;
import com.tapjoy.internal.jr;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressLint({"SetJavaScriptEnabled"})
/* loaded from: classes2.dex */
public class TJAdUnitJSBridge implements TJWebViewJSInterfaceListener {

    /* renamed from: a, reason: collision with root package name */
    public TJAdUnit f7626a;
    public boolean allowRedirect;

    /* renamed from: b, reason: collision with root package name */
    public WebView f7627b;

    /* renamed from: c, reason: collision with root package name */
    final ConcurrentLinkedQueue f7628c;
    public boolean closeRequested;
    public boolean customClose;

    /* renamed from: d, reason: collision with root package name */
    private TJWebViewJSInterface f7629d;
    public boolean didLaunchOtherActivity;
    private TJAdUnitJSBridge e;
    private Context f;
    private TJAdUnitActivity g;
    private TJSplitWebView h;
    private ProgressDialog i;
    private View j;
    private boolean k;
    private ReactiveVideoTracker l;
    private HashMap m;
    private Handler n;
    private er o;
    public String otherActivityCallbackID;
    public String splitWebViewCallbackID;

    public interface AdUnitAsyncTaskListner {
        void onComplete(boolean z);
    }

    public void destroy() {
    }

    public TJAdUnitJSBridge(Context context, TJAdUnit tJAdUnit) {
        this(context, tJAdUnit.getWebView());
        this.f7626a = tJAdUnit;
    }

    public TJAdUnitJSBridge(Context context, WebView webView) {
        this.j = null;
        this.didLaunchOtherActivity = false;
        this.allowRedirect = true;
        this.otherActivityCallbackID = null;
        this.customClose = false;
        this.closeRequested = false;
        this.splitWebViewCallbackID = null;
        this.o = new er(this);
        this.f7628c = new ConcurrentLinkedQueue();
        TapjoyLog.i("TJAdUnitJSBridge", "creating AdUnit/JS Bridge");
        this.f = context;
        this.f7627b = webView;
        this.e = this;
        if (this.f7627b == null) {
            TapjoyLog.e("TJAdUnitJSBridge", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SDK_ERROR, "Cannot create AdUnitJSBridge -- webview is NULL"));
            return;
        }
        this.f7629d = new TJWebViewJSInterface(this.f7627b, this);
        this.f7627b.addJavascriptInterface(this.f7629d, TJAdUnitConstants.JAVASCRIPT_INTERFACE_ID);
        setEnabled(true);
    }

    @Override // com.tapjoy.TJWebViewJSInterfaceListener
    public void onDispatchMethod(String str, JSONObject jSONObject) {
        String str2;
        if (this.k) {
            try {
                str2 = jSONObject.optString(TJAdUnitConstants.String.CALLBACK_ID, null);
            } catch (Exception e) {
                e = e;
                str2 = null;
            }
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                Method method = TJAdUnitJSBridge.class.getMethod(str, JSONObject.class, String.class);
                TapjoyLog.d("TJAdUnitJSBridge", "Dispatching method: " + method + " with data=" + jSONObject2 + "; callbackID=" + str2);
                method.invoke(this.e, jSONObject2, str2);
                return;
            } catch (Exception e2) {
                e = e2;
                e.printStackTrace();
                invokeJSCallback(str2, Boolean.FALSE);
                return;
            }
        }
        TapjoyLog.d("TJAdUnitJSBridge", "Bridge currently disabled. Adding " + str + " to message queue");
        this.f7628c.add(new Pair(str, jSONObject));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void alert(JSONObject jSONObject, final String str) {
        String str2;
        String str3;
        JSONArray jSONArray;
        TJAdUnitActivity tJAdUnitActivity;
        AlertDialog create;
        int i;
        TapjoyLog.d("TJAdUnitJSBridge", "alert_method: " + jSONObject);
        try {
            str2 = jSONObject.getString(TJAdUnitConstants.String.TITLE);
        } catch (Exception e) {
            e = e;
            str2 = "";
        }
        try {
            str3 = jSONObject.getString(TJAdUnitConstants.String.MESSAGE);
        } catch (Exception e2) {
            e = e2;
            str3 = "";
            invokeJSCallback(str, Boolean.FALSE);
            e.printStackTrace();
            jSONArray = null;
            tJAdUnitActivity = this.g;
            if (tJAdUnitActivity != null) {
            }
        }
        try {
            jSONArray = jSONObject.getJSONArray(TJAdUnitConstants.String.BUTTONS);
        } catch (Exception e3) {
            e = e3;
            invokeJSCallback(str, Boolean.FALSE);
            e.printStackTrace();
            jSONArray = null;
            tJAdUnitActivity = this.g;
            if (tJAdUnitActivity != null) {
            }
        }
        tJAdUnitActivity = this.g;
        if (tJAdUnitActivity != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                create = new AlertDialog.Builder(tJAdUnitActivity, R.style.Theme.Material.Light.Dialog.Alert).setTitle(str2).setMessage(str3).create();
            } else {
                create = new AlertDialog.Builder(tJAdUnitActivity).setTitle(str2).setMessage(str3).create();
            }
            if (jSONArray == null || jSONArray.length() == 0) {
                invokeJSCallback(str, Boolean.FALSE);
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                switch (i2) {
                    case 0:
                        i = -2;
                        break;
                    case 1:
                        i = -3;
                        break;
                    default:
                        i = -1;
                        break;
                }
                try {
                    arrayList.add(jSONArray.getString(i2));
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
                create.setButton(i, (CharSequence) arrayList.get(i2), new DialogInterface.OnClickListener() { // from class: com.tapjoy.TJAdUnitJSBridge.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        int i4;
                        switch (i3) {
                            case FontsContractCompat.FontRequestCallback.FAIL_REASON_FONT_LOAD_ERROR /* -3 */:
                                i4 = 1;
                                break;
                            case -2:
                            default:
                                i4 = 0;
                                break;
                            case -1:
                                i4 = 2;
                                break;
                        }
                        try {
                            TJAdUnitJSBridge.this.invokeJSCallback(str, Integer.valueOf(i4));
                        } catch (Exception e5) {
                            e5.printStackTrace();
                        }
                    }
                });
            }
            create.setCancelable(false);
            create.setCanceledOnTouchOutside(false);
            create.show();
            return;
        }
        TapjoyLog.d("TJAdUnitJSBridge", "Cannot alert -- TJAdUnitActivity is null");
    }

    public void checkAppInstalled(JSONObject jSONObject, String str) {
        String str2;
        try {
            str2 = jSONObject.getString(TJAdUnitConstants.String.BUNDLE);
        } catch (Exception e) {
            e.printStackTrace();
            str2 = "";
        }
        if (str2 != null && str2.length() > 0) {
            Iterator<ApplicationInfo> it = this.f.getPackageManager().getInstalledApplications(0).iterator();
            while (it.hasNext()) {
                if (it.next().packageName.equals(str2)) {
                    invokeJSCallback(str, Boolean.TRUE);
                    return;
                }
            }
        }
        invokeJSCallback(str, Boolean.FALSE);
    }

    public void getInstalledAppData(JSONObject jSONObject, String str) {
        PackageManager packageManager = this.f.getPackageManager();
        List<ApplicationInfo> installedApplications = packageManager.getInstalledApplications(0);
        JSONArray jSONArray = new JSONArray();
        for (ApplicationInfo applicationInfo : installedApplications) {
            if ((applicationInfo.flags & 1) != 1) {
                HashMap hashMap = new HashMap();
                String str2 = applicationInfo.packageName;
                hashMap.put("packageName", str2);
                hashMap.put("targetSdk", Integer.valueOf(applicationInfo.targetSdkVersion));
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(str2, 4096);
                    hashMap.put("installTime", new Date(packageInfo.firstInstallTime));
                    hashMap.put("updateTime", new Date(packageInfo.lastUpdateTime));
                    hashMap.put("versionName", packageInfo.versionName);
                    hashMap.put("versionCode", Integer.valueOf(packageInfo.versionCode));
                    jSONArray.put(new JSONObject(hashMap));
                } catch (Exception unused) {
                }
            }
        }
        invokeJSCallback(str, jSONArray);
    }

    public void closeRequested(Boolean bool) {
        this.closeRequested = true;
        HashMap hashMap = new HashMap();
        hashMap.put(TJAdUnitConstants.String.FORCE_CLOSE, bool);
        invokeJSAdunitMethod(TJAdUnitConstants.String.CLOSE_REQUESTED, hashMap);
    }

    public void getVolume(JSONObject jSONObject, String str) {
        HashMap volumeArgs = getVolumeArgs();
        if (volumeArgs != null) {
            invokeJSCallback(str, volumeArgs);
        } else {
            invokeJSCallback(str, false);
        }
    }

    public void onVolumeChanged() {
        invokeJSAdunitMethod(TJAdUnitConstants.String.VOLUME_CHANGED, getVolumeArgs());
    }

    public HashMap getVolumeArgs() {
        if (this.f7626a == null) {
            TapjoyLog.d("TJAdUnitJSBridge", "No ad unit provided");
            return null;
        }
        String format = String.format("%.2f", Float.valueOf(this.f7626a.getVolume()));
        boolean isMuted = this.f7626a.isMuted();
        TapjoyLog.d("TJAdUnitJSBridge", "getVolumeArgs: volume=" + format + "; isMuted=" + isMuted);
        HashMap hashMap = new HashMap();
        hashMap.put(TJAdUnitConstants.String.CURRENT_VOLUME, format);
        hashMap.put(TJAdUnitConstants.String.IS_MUTED, Boolean.valueOf(isMuted));
        return hashMap;
    }

    public void dismiss(JSONObject jSONObject, String str) {
        TJAdUnitActivity tJAdUnitActivity = this.g;
        if (tJAdUnitActivity != null) {
            invokeJSCallback(str, true);
            tJAdUnitActivity.finish();
        } else {
            TapjoyLog.d("TJAdUnitJSBridge", "Cannot dismiss -- TJAdUnitActivity is null");
            invokeJSCallback(str, false);
        }
    }

    public void display() {
        invokeJSAdunitMethod(TJAdUnitConstants.String.DISPLAY, new Object[0]);
    }

    public void displayStoreURL(JSONObject jSONObject, String str) {
        displayURL(jSONObject, str);
    }

    public void dismissStoreView(JSONObject jSONObject, String str) {
        dismissSplitView(jSONObject, str);
    }

    public void displayURL(JSONObject jSONObject, final String str) {
        final String str2;
        final String str3;
        try {
            String optString = jSONObject.optString("style");
            final String string = jSONObject.getString("url");
            final JSONObject optJSONObject = jSONObject.optJSONObject(TJAdUnitConstants.String.SPLIT_VIEW_LAYOUT);
            final JSONArray optJSONArray = jSONObject.optJSONArray(TJAdUnitConstants.String.SPLIT_VIEW_EXIT_HOSTS);
            JSONObject optJSONObject2 = jSONObject.optJSONObject(TJAdUnitConstants.String.SPLIT_VIEW_TRIGGER);
            if (optJSONObject2 != null) {
                String optString2 = optJSONObject2.optString(TJAdUnitConstants.String.SPLIT_VIEW_TRIGGER_ON, null);
                str3 = optJSONObject2.optString(TJAdUnitConstants.String.SPLIT_VIEW_TRIGGER_TO, null);
                str2 = optString2;
            } else {
                str2 = null;
                str3 = null;
            }
            if (TJAdUnitConstants.String.STYLE_SPLIT.equals(optString)) {
                TapjoyUtil.runOnMainThread(new Runnable() { // from class: com.tapjoy.TJAdUnitJSBridge.7
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (TJAdUnitJSBridge.this.f7627b != null) {
                            if (TJAdUnitJSBridge.this.h != null) {
                                TJAdUnitJSBridge.this.h.setExitHosts(optJSONArray);
                                TJAdUnitJSBridge.this.h.applyLayoutOption(optJSONObject);
                            } else {
                                ViewParent parent = TJAdUnitJSBridge.this.f7627b.getParent();
                                if (parent instanceof ViewGroup) {
                                    TJAdUnitJSBridge.this.h = new TJSplitWebView(TJAdUnitJSBridge.this.f, optJSONObject, optJSONArray, TJAdUnitJSBridge.this);
                                    ((ViewGroup) parent).addView(TJAdUnitJSBridge.this.h, new RelativeLayout.LayoutParams(-1, -1));
                                }
                            }
                            if (TJAdUnitJSBridge.this.h != null) {
                                TJAdUnitJSBridge.this.h.setTrigger(str2, str3);
                                TJAdUnitJSBridge.this.splitWebViewCallbackID = str;
                                TJAdUnitJSBridge.this.h.loadUrl(string);
                                return;
                            }
                        }
                        TJAdUnitJSBridge.this.h = null;
                        TJAdUnitJSBridge.this.splitWebViewCallbackID = null;
                        TJAdUnitJSBridge.this.invokeJSCallback(str, Boolean.FALSE);
                    }
                });
                return;
            }
            this.didLaunchOtherActivity = true;
            this.otherActivityCallbackID = str;
            this.f.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(string)));
        } catch (Exception e) {
            invokeJSCallback(str, Boolean.TRUE);
            e.printStackTrace();
        }
    }

    public void clearCache(JSONObject jSONObject, String str) {
        if (TapjoyCache.getInstance() != null) {
            TapjoyCache.getInstance().clearTapjoyCache();
            invokeJSCallback(str, Boolean.TRUE);
        } else {
            invokeJSCallback(str, Boolean.FALSE);
        }
    }

    public void setPrerenderLimit(JSONObject jSONObject, String str) {
        try {
            TJPlacementManager.setPreRenderedPlacementLimit(jSONObject.getInt(TJAdUnitConstants.String.TJC_PLACEMENT_PRE_RENDERED_LIMIT));
            invokeJSCallback(str, Boolean.TRUE);
        } catch (Exception unused) {
            TapjoyLog.w("TJAdUnitJSBridge", "Unable to set Tapjoy placement pre-render limit. Invalid parameters.");
            invokeJSCallback(str, Boolean.FALSE);
        }
    }

    public void setEventPreloadLimit(JSONObject jSONObject, String str) {
        if (TapjoyCache.getInstance() != null) {
            try {
                TJPlacementManager.setCachedPlacementLimit(jSONObject.getInt(TJAdUnitConstants.String.TJC_PLACEMENT_CACHE_LIMIT));
                invokeJSCallback(str, Boolean.TRUE);
                return;
            } catch (Exception unused) {
                TapjoyLog.w("TJAdUnitJSBridge", "Unable to set Tapjoy cache's event preload limit. Invalid parameters.");
                invokeJSCallback(str, Boolean.FALSE);
                return;
            }
        }
        invokeJSCallback(str, Boolean.FALSE);
    }

    public void removeAssetFromCache(JSONObject jSONObject, String str) {
        try {
            String string = jSONObject.getString("url");
            if (TapjoyCache.getInstance() != null) {
                invokeJSCallback(str, Boolean.valueOf(TapjoyCache.getInstance().removeAssetFromCache(string)));
            } else {
                invokeJSCallback(str, Boolean.FALSE);
            }
        } catch (Exception unused) {
            TapjoyLog.w("TJAdUnitJSBridge", "Unable to cache video. Invalid parameters.");
            invokeJSCallback(str, Boolean.FALSE);
        }
    }

    public void cacheAsset(JSONObject jSONObject, String str) {
        Long l;
        String str2 = "";
        try {
            String string = jSONObject.getString("url");
            try {
                str2 = jSONObject.getString(TapjoyConstants.TJC_PLACEMENT_OFFER_ID);
            } catch (Exception unused) {
            }
            try {
                l = Long.valueOf(jSONObject.getLong(TapjoyConstants.TJC_TIME_TO_LIVE));
            } catch (Exception unused2) {
                l = 0L;
            }
            if (TapjoyCache.getInstance() != null) {
                invokeJSCallback(str, TapjoyCache.getInstance().cacheAssetFromURL(string, str2, l.longValue()));
            } else {
                invokeJSCallback(str, Boolean.FALSE);
            }
        } catch (Exception unused3) {
            TapjoyLog.w("TJAdUnitJSBridge", "Unable to cache video. Invalid parameters.");
            invokeJSCallback(str, Boolean.FALSE);
        }
    }

    public void cachePathForURL(JSONObject jSONObject, String str) {
        try {
            String string = jSONObject.getString("url");
            if (TapjoyCache.getInstance() != null) {
                invokeJSCallback(str, TapjoyCache.getInstance().getPathOfCachedURL(string));
            } else {
                invokeJSCallback(str, "");
            }
        } catch (Exception unused) {
            invokeJSCallback(str, "");
        }
    }

    public void getCachedAssets(JSONObject jSONObject, String str) {
        if (TapjoyCache.getInstance() != null) {
            invokeJSCallback(str, TapjoyCache.getInstance().cachedAssetsToJSON());
        } else {
            invokeJSCallback(str, "");
        }
    }

    public void contentReady(JSONObject jSONObject, String str) {
        if (this.f7626a != null) {
            this.f7626a.fireContentReady();
            invokeJSCallback(str, true);
        } else {
            invokeJSCallback(str, false);
        }
    }

    public void getOrientation(JSONObject jSONObject, String str) {
        if (this.f7626a == null) {
            TapjoyLog.d("TJAdUnitJSBridge", "No ad unit provided");
            invokeJSCallback(str, JSONObject.NULL);
            return;
        }
        String screenOrientationString = this.f7626a.getScreenOrientationString();
        HashMap hashMap = new HashMap();
        hashMap.put("orientation", screenOrientationString);
        hashMap.put("width", Integer.valueOf(this.f7626a.getScreenWidth()));
        hashMap.put("height", Integer.valueOf(this.f7626a.getScreenHeight()));
        invokeJSCallback(str, hashMap);
    }

    public void setOrientation(JSONObject jSONObject, String str) {
        int i;
        if (this.f7626a == null) {
            TapjoyLog.d("TJAdUnitJSBridge", "No ad unit provided");
            invokeJSCallback(str, false);
            return;
        }
        try {
            String string = jSONObject.getString("orientation");
            if (!string.equals(TJAdUnitConstants.String.LANDSCAPE) && !string.equals(TJAdUnitConstants.String.LANDSCAPE_LEFT)) {
                i = string.equals(TJAdUnitConstants.String.LANDSCAPE_RIGHT) ? 8 : 1;
                this.f7626a.setOrientation(i);
                invokeJSCallback(str, true);
            }
            i = 0;
            this.f7626a.setOrientation(i);
            invokeJSCallback(str, true);
        } catch (Exception unused) {
            invokeJSCallback(str, false);
        }
    }

    public void unsetOrientation(JSONObject jSONObject, String str) {
        if (this.f7626a == null) {
            TapjoyLog.d("TJAdUnitJSBridge", "No ad unit provided");
            invokeJSCallback(str, false);
        } else {
            try {
                this.f7626a.unsetOrientation();
                invokeJSCallback(str, true);
            } catch (Exception unused) {
                invokeJSCallback(str, false);
            }
        }
    }

    public void setBackgroundColor(JSONObject jSONObject, final String str) {
        try {
            String string = jSONObject.getString(TJAdUnitConstants.String.BACKGROUND_COLOR);
            if (this.f7626a != null) {
                this.f7626a.setBackgroundColor(string, new AdUnitAsyncTaskListner() { // from class: com.tapjoy.TJAdUnitJSBridge.8
                    @Override // com.tapjoy.TJAdUnitJSBridge.AdUnitAsyncTaskListner
                    public final void onComplete(boolean z) {
                        TJAdUnitJSBridge.this.invokeJSCallback(str, Boolean.valueOf(z));
                    }
                });
            } else {
                invokeJSCallback(str, false);
            }
        } catch (Exception unused) {
            TapjoyLog.w("TJAdUnitJSBridge", "Unable to set background color. Invalid parameters.");
            invokeJSCallback(str, false);
        }
    }

    public void setBackgroundWebViewContent(JSONObject jSONObject, final String str) {
        TapjoyLog.d("TJAdUnitJSBridge", "setBackgroundWebViewContent");
        try {
            String string = jSONObject.getString(TJAdUnitConstants.String.BACKGROUND_CONTENT);
            if (this.f7626a != null) {
                this.f7626a.setBackgroundContent(string, new AdUnitAsyncTaskListner() { // from class: com.tapjoy.TJAdUnitJSBridge.9
                    @Override // com.tapjoy.TJAdUnitJSBridge.AdUnitAsyncTaskListner
                    public final void onComplete(boolean z) {
                        TJAdUnitJSBridge.this.invokeJSCallback(str, Boolean.valueOf(z));
                    }
                });
            } else {
                invokeJSCallback(str, false);
            }
        } catch (Exception unused) {
            TapjoyLog.w("TJAdUnitJSBridge", "Unable to set background content. Invalid parameters.");
            invokeJSCallback(str, false);
        }
    }

    public void displayVideo(JSONObject jSONObject, final String str) {
        try {
            String string = jSONObject.getString("url");
            if (string.length() > 0 && string != "") {
                this.f7626a.loadVideoUrl(string, new AdUnitAsyncTaskListner() { // from class: com.tapjoy.TJAdUnitJSBridge.10
                    @Override // com.tapjoy.TJAdUnitJSBridge.AdUnitAsyncTaskListner
                    public final void onComplete(boolean z) {
                        TJAdUnitJSBridge.this.invokeJSCallback(str, Boolean.valueOf(z));
                    }
                });
            } else {
                invokeJSCallback(str, Boolean.FALSE);
            }
        } catch (Exception e) {
            invokeJSCallback(str, Boolean.FALSE);
            e.printStackTrace();
        }
    }

    public void playVideo(JSONObject jSONObject, String str) {
        if (this.f7626a != null) {
            invokeJSCallback(str, Boolean.valueOf(this.f7626a.playVideo()));
        }
    }

    public void pauseVideo(JSONObject jSONObject, String str) {
        if (this.f7626a != null) {
            invokeJSCallback(str, Boolean.valueOf(this.f7626a.pauseVideo()));
        }
    }

    public void clearVideo(JSONObject jSONObject, final String str) {
        if (this.f7626a != null) {
            this.f7626a.clearVideo(new AdUnitAsyncTaskListner() { // from class: com.tapjoy.TJAdUnitJSBridge.11
                @Override // com.tapjoy.TJAdUnitJSBridge.AdUnitAsyncTaskListner
                public final void onComplete(boolean z) {
                    TJAdUnitJSBridge.this.invokeJSCallback(str, Boolean.valueOf(z));
                }
            }, jSONObject.optBoolean(TJAdUnitConstants.String.VISIBLE, false));
        }
    }

    public void setVideoMute(JSONObject jSONObject, String str) {
        try {
            this.f7626a.a(jSONObject.getBoolean(TJAdUnitConstants.String.ENABLED));
            invokeJSCallback(str, Boolean.TRUE);
        } catch (JSONException unused) {
            TapjoyLog.d("TJAdUnitJSBridge", "Failed to parse 'enabled' from json params.");
            invokeJSCallback(str, Boolean.FALSE);
        }
    }

    public void log(JSONObject jSONObject, String str) {
        try {
            TapjoyLog.d("TJAdUnitJSBridge", "Logging message=" + jSONObject.getString(TJAdUnitConstants.String.MESSAGE));
            invokeJSCallback(str, Boolean.TRUE);
        } catch (Exception e) {
            invokeJSCallback(str, Boolean.FALSE);
            e.printStackTrace();
        }
    }

    public void openApp(JSONObject jSONObject, String str) {
        try {
            this.f.startActivity(this.f.getPackageManager().getLaunchIntentForPackage(jSONObject.getString(TJAdUnitConstants.String.BUNDLE)));
            invokeJSCallback(str, Boolean.TRUE);
        } catch (Exception e) {
            invokeJSCallback(str, Boolean.FALSE);
            e.printStackTrace();
        }
    }

    @TargetApi(19)
    public void nativeEval(final JSONObject jSONObject, final String str) {
        TapjoyUtil.runOnMainThread(new Runnable() { // from class: com.tapjoy.TJAdUnitJSBridge.12
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (Build.VERSION.SDK_INT >= 19) {
                        TJAdUnitJSBridge.this.f7627b.evaluateJavascript(jSONObject.getString(TJAdUnitConstants.String.COMMAND), null);
                    } else {
                        TJAdUnitJSBridge.this.f7627b.loadUrl("javascript:" + jSONObject.getString(TJAdUnitConstants.String.COMMAND));
                    }
                    TJAdUnitJSBridge.this.invokeJSCallback(str, Boolean.TRUE);
                } catch (Exception unused) {
                    TJAdUnitJSBridge.this.invokeJSCallback(str, Boolean.FALSE);
                }
            }
        });
    }

    public void present(JSONObject jSONObject, String str) {
        try {
            Boolean.valueOf(false);
            Boolean bool = false;
            Boolean valueOf = Boolean.valueOf(jSONObject.getString(TJAdUnitConstants.String.VISIBLE));
            try {
                bool = Boolean.valueOf(jSONObject.getString(TJAdUnitConstants.String.TRANSPARENT));
            } catch (Exception unused) {
            }
            try {
                this.customClose = Boolean.valueOf(jSONObject.getString(TJAdUnitConstants.String.CUSTOM_CLOSE)).booleanValue();
            } catch (Exception unused2) {
            }
            new a(this.f7627b).execute(valueOf, bool);
            invokeJSCallback(str, Boolean.TRUE);
        } catch (Exception e) {
            invokeJSCallback(str, Boolean.FALSE);
            e.printStackTrace();
        }
    }

    public void triggerEvent(JSONObject jSONObject, String str) {
        if (this.f7626a != null) {
            try {
                String string = jSONObject.getString("eventName");
                if (string.equals("start")) {
                    this.f7626a.fireOnVideoStart();
                    return;
                }
                if (string.equals("complete")) {
                    this.f7626a.fireOnVideoComplete();
                } else if (string.equals("error")) {
                    this.f7626a.fireOnVideoError("Error while trying to play video.");
                } else if (string.equals("click")) {
                    this.f7626a.fireOnClick();
                }
            } catch (Exception unused) {
                TapjoyLog.w("TJAdUnitJSBridge", "Unable to triggerEvent. No event name.");
            }
        }
    }

    public void invokeJSAdunitMethod(String str, Object... objArr) {
        this.f7629d.callback(new ArrayList(Arrays.asList(objArr)), str, (String) null);
    }

    public void invokeJSAdunitMethod(String str, Map map) {
        this.f7629d.callback(map, str, (String) null);
    }

    public void invokeJSCallback(String str, Object... objArr) {
        if (jr.c(str)) {
            TapjoyLog.d("TJAdUnitJSBridge", "invokeJSCallback -- no callbackID provided");
        } else {
            this.f7629d.callback(new ArrayList(Arrays.asList(objArr)), "", str);
        }
    }

    public void invokeJSCallback(String str, Map map) {
        this.f7629d.callback(map, "", str);
    }

    public void flushBacklogMessageQueue() {
        while (true) {
            Pair pair = (Pair) this.f7628c.poll();
            if (pair == null) {
                return;
            } else {
                onDispatchMethod((String) pair.first, (JSONObject) pair.second);
            }
        }
    }

    public void flushMessageQueue() {
        this.f7629d.flushMessageQueue();
    }

    public void setAllowRedirect(JSONObject jSONObject, String str) {
        boolean z;
        try {
            z = jSONObject.getBoolean(TJAdUnitConstants.String.ENABLED);
        } catch (Exception unused) {
            z = true;
        }
        this.allowRedirect = z;
        invokeJSCallback(str, Boolean.TRUE);
    }

    public void setAdUnitActivity(TJAdUnitActivity tJAdUnitActivity) {
        this.g = tJAdUnitActivity;
    }

    public void setSpinnerVisible(JSONObject jSONObject, String str) {
        try {
            boolean z = jSONObject.getBoolean(TJAdUnitConstants.String.VISIBLE);
            String optString = jSONObject.optString(TJAdUnitConstants.String.TITLE);
            String optString2 = jSONObject.optString(TJAdUnitConstants.String.MESSAGE);
            TJAdUnitActivity tJAdUnitActivity = this.g;
            if (tJAdUnitActivity != null) {
                if (z) {
                    this.i = ProgressDialog.show(tJAdUnitActivity, optString, optString2);
                } else if (this.i != null) {
                    this.i.dismiss();
                }
                invokeJSCallback(str, Boolean.TRUE);
                return;
            }
            TapjoyLog.d("TJAdUnitJSBridge", "Cannot setSpinnerVisible -- TJAdUnitActivity is null");
            invokeJSCallback(str, Boolean.FALSE);
        } catch (Exception e) {
            invokeJSCallback(str, Boolean.FALSE);
            e.printStackTrace();
        }
    }

    public void setCloseButtonVisible(JSONObject jSONObject, String str) {
        try {
            final boolean z = jSONObject.getBoolean(TJAdUnitConstants.String.VISIBLE);
            TapjoyUtil.runOnMainThread(new Runnable() { // from class: com.tapjoy.TJAdUnitJSBridge.13
                @Override // java.lang.Runnable
                public final void run() {
                    TJAdUnitActivity tJAdUnitActivity = TJAdUnitJSBridge.this.g;
                    if (tJAdUnitActivity != null) {
                        tJAdUnitActivity.setCloseButtonVisibility(z);
                    } else {
                        TapjoyLog.d("TJAdUnitJSBridge", "Cannot setCloseButtonVisible -- TJAdUnitActivity is null");
                    }
                }
            });
            invokeJSCallback(str, true);
        } catch (Exception e) {
            invokeJSCallback(str, false);
            e.printStackTrace();
        }
    }

    public void setCloseButtonClickable(JSONObject jSONObject, String str) {
        try {
            final boolean optBoolean = jSONObject.optBoolean(TJAdUnitConstants.String.CLICKABLE);
            TapjoyUtil.runOnMainThread(new Runnable() { // from class: com.tapjoy.TJAdUnitJSBridge.14
                @Override // java.lang.Runnable
                public final void run() {
                    TJAdUnitActivity tJAdUnitActivity = TJAdUnitJSBridge.this.g;
                    if (tJAdUnitActivity != null) {
                        tJAdUnitActivity.setCloseButtonClickable(optBoolean);
                    } else {
                        TapjoyLog.d("TJAdUnitJSBridge", "Cannot setCloseButtonClickable -- TJAdUnitActivity is null");
                    }
                }
            });
            invokeJSCallback(str, true);
        } catch (Exception e) {
            invokeJSCallback(str, false);
            e.printStackTrace();
        }
    }

    public void shouldClose(JSONObject jSONObject, String str) {
        TJAdUnitActivity tJAdUnitActivity = this.g;
        try {
            Boolean.valueOf(false);
            if (Boolean.valueOf(jSONObject.getString("close")).booleanValue() && tJAdUnitActivity != null) {
                tJAdUnitActivity.finish();
            }
            invokeJSCallback(str, Boolean.TRUE);
        } catch (Exception e) {
            invokeJSCallback(str, Boolean.FALSE);
            if (tJAdUnitActivity != null) {
                tJAdUnitActivity.finish();
            }
            e.printStackTrace();
        }
        this.closeRequested = false;
    }

    public void setLoggingLevel(JSONObject jSONObject, String str) {
        try {
            TapjoyAppSettings.getInstance().saveLoggingLevel(String.valueOf(jSONObject.getString(TJAdUnitConstants.String.LOGGING_LEVEL)));
        } catch (Exception e) {
            TapjoyLog.d("TJAdUnitJSBridge", "setLoggingLevel exception " + e.getLocalizedMessage());
            invokeJSCallback(str, false);
            e.printStackTrace();
        }
    }

    public void clearLoggingLevel(JSONObject jSONObject, String str) {
        TapjoyAppSettings.getInstance().clearLoggingLevel();
    }

    public void attachVolumeListener(JSONObject jSONObject, String str) {
        try {
            boolean z = jSONObject.getBoolean(TJAdUnitConstants.String.ATTACH);
            int optInt = jSONObject.optInt("interval", TJAdUnitConstants.DEFAULT_VOLUME_CHECK_INTERVAL);
            if (optInt > 0) {
                this.f7626a.attachVolumeListener(z, optInt);
                invokeJSCallback(str, true);
            } else {
                TapjoyLog.d("TJAdUnitJSBridge", "Invalid `interval` value passed to attachVolumeListener(): interval=" + optInt);
                invokeJSCallback(str, false);
            }
        } catch (Exception e) {
            TapjoyLog.d("TJAdUnitJSBridge", "attachVolumeListener exception " + e.toString());
            invokeJSCallback(str, false);
            e.printStackTrace();
        }
    }

    public void initMoatVideoTracker(JSONObject jSONObject, String str) {
        TJAdUnitActivity tJAdUnitActivity = this.g;
        if (tJAdUnitActivity == null) {
            TapjoyLog.d("TJAdUnitJSBridge", "Error from initMoatVideoTracker -- TJAdUnitActivity is null");
            invokeJSCallback(str, false);
            return;
        }
        try {
            this.l = (ReactiveVideoTracker) MoatFactory.create(tJAdUnitActivity).createCustomTracker(new ReactiveVideoTrackerPlugin(jSONObject.getString(TJAdUnitConstants.String.PARTNER_CODE)));
            if (this.m == null) {
                TapjoyLog.d("TJAdUnitJSBridge", "Initializing MOAT tracking events map");
                this.m = new HashMap();
                this.m.put("firstQuartile", MoatAdEventType.AD_EVT_FIRST_QUARTILE);
                this.m.put("midpoint", MoatAdEventType.AD_EVT_MID_POINT);
                this.m.put("thirdQuartile", MoatAdEventType.AD_EVT_THIRD_QUARTILE);
                this.m.put("complete", MoatAdEventType.AD_EVT_COMPLETE);
                this.m.put(TJAdUnitConstants.String.VIDEO_PAUSED, MoatAdEventType.AD_EVT_PAUSED);
                this.m.put(TJAdUnitConstants.String.VIDEO_PLAYING, MoatAdEventType.AD_EVT_PLAYING);
                this.m.put("start", MoatAdEventType.AD_EVT_START);
                this.m.put(TJAdUnitConstants.String.VIDEO_STOPPED, MoatAdEventType.AD_EVT_STOPPED);
                this.m.put(TJAdUnitConstants.String.VIDEO_SKIPPED, MoatAdEventType.AD_EVT_SKIPPED);
                this.m.put(TJAdUnitConstants.String.VOLUME_CHANGED, MoatAdEventType.AD_EVT_VOLUME_CHANGE);
                this.m.put(TJAdUnitConstants.String.ENTER_FULL_SCREEN, MoatAdEventType.AD_EVT_ENTER_FULLSCREEN);
                this.m.put(TJAdUnitConstants.String.EXIT_FULL_SCREEN, MoatAdEventType.AD_EVT_EXIT_FULLSCREEN);
            }
            this.n = new Handler(Looper.getMainLooper());
            invokeJSCallback(str, true);
        } catch (Exception e) {
            TapjoyLog.d("TJAdUnitJSBridge", "initMoatVideoTracker exception " + e.toString());
            invokeJSCallback(str, false);
        }
    }

    public void startMoatVideoTracker(JSONObject jSONObject, final String str) {
        try {
            final Integer valueOf = Integer.valueOf(jSONObject.getInt(TJAdUnitConstants.String.VIDEO_LENGTH));
            final HashMap hashMap = new HashMap();
            JSONObject jSONObject2 = jSONObject.getJSONObject(TJAdUnitConstants.String.AD_IDS);
            if (jSONObject2 != null) {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject2.getString(next));
                }
            }
            this.n.post(new Runnable() { // from class: com.tapjoy.TJAdUnitJSBridge.2
                @Override // java.lang.Runnable
                public final void run() {
                    TJAdUnitJSBridge.this.invokeJSCallback(str, Boolean.valueOf(TJAdUnitJSBridge.this.l != null ? TJAdUnitJSBridge.this.l.trackVideoAd(hashMap, valueOf, TJAdUnitJSBridge.this.f7627b) : false));
                }
            });
        } catch (Exception e) {
            TapjoyLog.d("TJAdUnitJSBridge", "startMoatVideoTracker exception " + e.toString());
            invokeJSCallback(str, false);
        }
    }

    public void triggerMoatVideoEvent(JSONObject jSONObject, String str) {
        try {
            Integer valueOf = Integer.valueOf(jSONObject.getInt(TJAdUnitConstants.String.CURRENT_VIDEO_TIME));
            String string = jSONObject.getString("eventName");
            MoatAdEventType moatAdEventType = this.m != null ? (MoatAdEventType) this.m.get(string) : null;
            if (moatAdEventType == null) {
                TapjoyLog.d("TJAdUnitJSBridge", "eventName:" + string + " has no matching MOAT event");
                invokeJSCallback(str, false);
                return;
            }
            TapjoyLog.d("TJAdUnitJSBridge", "Sending MOAT event: " + moatAdEventType);
            final MoatAdEvent moatAdEvent = new MoatAdEvent(moatAdEventType, valueOf);
            this.n.post(new Runnable() { // from class: com.tapjoy.TJAdUnitJSBridge.3
                @Override // java.lang.Runnable
                public final void run() {
                    if (TJAdUnitJSBridge.this.l != null) {
                        TJAdUnitJSBridge.this.l.dispatchEvent(moatAdEvent);
                    }
                }
            });
            invokeJSCallback(str, true);
        } catch (Exception e) {
            TapjoyLog.d("TJAdUnitJSBridge", "triggerMoatVideoEvent exception " + e.toString());
            invokeJSCallback(str, false);
        }
    }

    public void initViewabilityTracker(final JSONObject jSONObject, final String str) {
        final er erVar = this.o;
        if (!erVar.a(jSONObject)) {
            erVar.f8016a.invokeJSCallback(str, false);
            return;
        }
        er.b(jSONObject);
        if (al.a(er.f8015b)) {
            erVar.f8016a.invokeJSCallback(str, false);
        } else {
            TapjoyUtil.runOnMainThread(new Runnable() { // from class: com.tapjoy.internal.er.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        if (!er.this.f8017c) {
                            er.this.f8017c = ck.a(ck.a(), er.this.f8016a.f7627b.getContext());
                        }
                        if (er.this.f8017c) {
                            TapjoyLog.d("TJOMViewabilityAgent", "initialized");
                            er.this.e = cs.a(ct.a(cw.NATIVE, cw.NATIVE), cu.a(er.this.f, er.f8015b, er.b(jSONObject.optJSONArray(TJAdUnitConstants.String.VENDORS)), ""));
                            er.this.e.a(er.this.f8016a.f7626a.getWebView());
                            er.this.g = dc.a(er.this.e);
                            er.this.f8018d = cr.a(er.this.e);
                            er.this.f8016a.invokeJSCallback(str, true);
                            return;
                        }
                        TapjoyLog.d("TJOMViewabilityAgent", "Failed to initialize");
                        er.this.f8016a.invokeJSCallback(str, false);
                    } catch (Exception e) {
                        TapjoyLog.d("TJOMViewabilityAgent", "Failed to init with exception: " + e.getMessage());
                        er.this.f8016a.invokeJSCallback(str, false);
                    }
                }
            });
        }
    }

    public void startViewabilityTracker(JSONObject jSONObject, String str) {
        final er erVar = this.o;
        if (!erVar.f8017c) {
            TapjoyLog.d("TJOMViewabilityAgent", "Can not start -- TJOMViewabilityAgent is not initialized");
            erVar.f8016a.invokeJSCallback(str, false);
        } else {
            erVar.f8016a.invokeJSCallback(str, true);
            TapjoyUtil.runOnMainThread(new Runnable() { // from class: com.tapjoy.internal.er.2
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        er.this.e.a();
                    } catch (Exception e) {
                        TapjoyLog.d("TJOMViewabilityAgent", "Failed to start with exception: " + e.getMessage());
                    }
                }
            });
        }
    }

    public void triggerViewabilityEvent(JSONObject jSONObject, final String str) {
        final er erVar = this.o;
        if (!erVar.f8017c) {
            TapjoyLog.d("TJOMViewabilityAgent", "Can not triggerEvent -- TJOMViewabilityAgent is not initialized");
            erVar.f8016a.invokeJSCallback(str, false);
        } else {
            if (jSONObject == null) {
                TapjoyLog.d("TJOMViewabilityAgent", "Can not triggerEvent -- json parameter is null");
                erVar.f8016a.invokeJSCallback(str, false);
                return;
            }
            final String optString = jSONObject.optString("eventName", null);
            if (optString == null) {
                TapjoyLog.d("TJOMViewabilityAgent", "triggerEvent: params json did not contain 'eventName'");
                erVar.f8016a.invokeJSCallback(str, false);
            } else {
                TapjoyUtil.runOnMainThread(new Runnable() { // from class: com.tapjoy.internal.er.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            if (optString.equals(TJAdUnitConstants.String.VIDEO_RENDERED)) {
                                er.this.g.a(db.a(da.STANDALONE));
                                er.this.f8018d.a();
                            } else if (optString.equals(TJAdUnitConstants.String.VIDEO_BUFFER_START)) {
                                er.this.g.g();
                            } else if (optString.equals(TJAdUnitConstants.String.VIDEO_BUFFER_END)) {
                                er.this.g.h();
                            } else if (optString.equals("start")) {
                                er.this.g.a(er.this.f8016a.f7626a.getVideoView().getDuration(), er.this.f8016a.f7626a.getVolume());
                            } else if (optString.equals("firstQuartile")) {
                                er.this.g.a();
                            } else if (optString.equals("midpoint")) {
                                er.this.g.b();
                            } else if (optString.equals("thirdQuartile")) {
                                er.this.g.c();
                            } else if (optString.equals(TJAdUnitConstants.String.VIDEO_PAUSED)) {
                                er.this.g.e();
                            } else if (optString.equals(TJAdUnitConstants.String.VIDEO_PLAYING)) {
                                er.this.g.f();
                            } else if (optString.equals(TJAdUnitConstants.String.VIDEO_SKIPPED)) {
                                er.this.g.i();
                            } else if (optString.equals(TJAdUnitConstants.String.VOLUME_CHANGED)) {
                                er.this.g.a(er.this.f8016a.f7626a.getVolume());
                            } else if (optString.equals("complete")) {
                                er.this.g.d();
                                er.this.e.b();
                                er.this.e = null;
                            } else {
                                TapjoyLog.d("TJOMViewabilityAgent", "triggerEvent: event name '" + optString + "' not found");
                                er.this.f8016a.invokeJSCallback(str, false);
                                return;
                            }
                            TapjoyLog.d("TJOMViewabilityAgent", "triggerEvent: event name '" + optString + "'");
                            er.this.f8016a.invokeJSCallback(str, true);
                        } catch (Exception e) {
                            TapjoyLog.d("TJOMViewabilityAgent", "triggerEvent exception:" + e.getMessage());
                            er.this.f8016a.invokeJSCallback(str, false);
                        }
                    }
                });
            }
        }
    }

    public void startUsageTrackingEvent(JSONObject jSONObject, String str) {
        String string;
        try {
            string = jSONObject.getString("name");
        } catch (JSONException e) {
            TapjoyLog.w("TJAdUnitJSBridge", "Unable to startUsageTrackingEvent. Invalid parameters: " + e);
        }
        if (string.isEmpty()) {
            TapjoyLog.d("TJAdUnitJSBridge", "Empty name for startUsageTrackingEvent");
            invokeJSCallback(str, false);
            return;
        }
        if (this.f7626a != null) {
            this.f7626a.startAdContentTracking(string, jSONObject);
            invokeJSCallback(str, true);
            return;
        }
        invokeJSCallback(str, false);
    }

    public void endUsageTrackingEvent(JSONObject jSONObject, String str) {
        String string;
        try {
            string = jSONObject.getString("name");
        } catch (JSONException e) {
            TapjoyLog.w("TJAdUnitJSBridge", "Unable to endUsageTrackingEvent. Invalid parameters: " + e);
        }
        if (string.isEmpty()) {
            TapjoyLog.d("TJAdUnitJSBridge", "Empty name for endUsageTrackingEvent");
            invokeJSCallback(str, false);
            return;
        }
        if (this.f7626a != null) {
            this.f7626a.endAdContentTracking(string, jSONObject);
            invokeJSCallback(str, true);
            return;
        }
        invokeJSCallback(str, false);
    }

    public void sendUsageTrackingEvent(JSONObject jSONObject, String str) {
        String string;
        try {
            string = jSONObject.getString("name");
        } catch (JSONException e) {
            TapjoyLog.w("TJAdUnitJSBridge", "Unable to sendUsageTrackingEvent. Invalid parameters: " + e);
        }
        if (string.isEmpty()) {
            TapjoyLog.d("TJAdUnitJSBridge", "Empty name for sendUsageTrackingEvent");
            invokeJSCallback(str, false);
            return;
        }
        if (this.f7626a != null) {
            this.f7626a.sendAdContentTracking(string, jSONObject);
            invokeJSCallback(str, true);
            return;
        }
        invokeJSCallback(str, false);
    }

    public void hasSplitView(JSONObject jSONObject, final String str) {
        TapjoyUtil.runOnMainThread(new Runnable() { // from class: com.tapjoy.TJAdUnitJSBridge.4
            @Override // java.lang.Runnable
            public final void run() {
                if (TJAdUnitJSBridge.this.h != null) {
                    TJAdUnitJSBridge.this.invokeJSCallback(str, Boolean.TRUE);
                } else {
                    TJAdUnitJSBridge.this.invokeJSCallback(str, Boolean.FALSE);
                }
            }
        });
    }

    public void dismissSplitView(JSONObject jSONObject, final String str) {
        TapjoyUtil.runOnMainThread(new Runnable() { // from class: com.tapjoy.TJAdUnitJSBridge.5
            @Override // java.lang.Runnable
            public final void run() {
                if (TJAdUnitJSBridge.this.h != null) {
                    if (str != null) {
                        TJAdUnitJSBridge.this.invokeJSCallback(str, Boolean.TRUE);
                    }
                    if (TJAdUnitJSBridge.this.splitWebViewCallbackID != null) {
                        TJAdUnitJSBridge.this.invokeJSCallback(TJAdUnitJSBridge.this.splitWebViewCallbackID, Boolean.TRUE);
                        TJAdUnitJSBridge.this.splitWebViewCallbackID = null;
                    }
                    ((ViewGroup) TJAdUnitJSBridge.this.h.getParent()).removeView(TJAdUnitJSBridge.this.h);
                    TJAdUnitJSBridge.this.h = null;
                    return;
                }
                if (str != null) {
                    TJAdUnitJSBridge.this.invokeJSCallback(str, Boolean.FALSE);
                }
            }
        });
    }

    public void getSplitViewURL(JSONObject jSONObject, final String str) {
        TapjoyUtil.runOnMainThread(new Runnable() { // from class: com.tapjoy.TJAdUnitJSBridge.6
            @Override // java.lang.Runnable
            public final void run() {
                if (TJAdUnitJSBridge.this.h != null) {
                    TJAdUnitJSBridge.this.invokeJSCallback(str, TJAdUnitJSBridge.this.h.getLastUrl());
                } else {
                    TJAdUnitJSBridge.this.invokeJSCallback(str, JSONObject.NULL);
                }
            }
        });
    }

    public void isNetworkAvailable(JSONObject jSONObject, String str) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f.getSystemService("connectivity")).getActiveNetworkInfo();
            invokeJSCallback(str, Boolean.valueOf(activeNetworkInfo != null && activeNetworkInfo.isAvailable() && activeNetworkInfo.isConnected()));
        } catch (Exception unused) {
            invokeJSCallback(str, Boolean.FALSE);
        }
    }

    public void setEnabled(boolean z) {
        this.k = z;
        if (this.k) {
            flushBacklogMessageQueue();
        }
    }

    @TargetApi(11)
    class a extends AsyncTask {

        /* renamed from: a, reason: collision with root package name */
        WebView f7663a;

        @Override // android.os.AsyncTask
        protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
            return (Boolean[]) objArr;
        }

        @Override // android.os.AsyncTask
        protected final /* synthetic */ void onPostExecute(Object obj) {
            Boolean[] boolArr = (Boolean[]) obj;
            final boolean booleanValue = boolArr[0].booleanValue();
            final boolean booleanValue2 = boolArr[1].booleanValue();
            if (TJAdUnitJSBridge.this.f instanceof Activity) {
                TapjoyUtil.runOnMainThread(new Runnable() { // from class: com.tapjoy.TJAdUnitJSBridge.a.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (booleanValue) {
                            a.this.f7663a.setVisibility(0);
                            if (booleanValue2) {
                                if (a.this.f7663a.getParent() instanceof RelativeLayout) {
                                    ((RelativeLayout) a.this.f7663a.getParent()).getBackground().setAlpha(0);
                                    ((RelativeLayout) a.this.f7663a.getParent()).setBackgroundColor(0);
                                }
                                if (Build.VERSION.SDK_INT >= 11) {
                                    a.this.f7663a.setLayerType(1, null);
                                    return;
                                }
                                return;
                            }
                            if (a.this.f7663a.getParent() instanceof RelativeLayout) {
                                ((RelativeLayout) a.this.f7663a.getParent()).getBackground().setAlpha(255);
                                ((RelativeLayout) a.this.f7663a.getParent()).setBackgroundColor(-1);
                            }
                            if (Build.VERSION.SDK_INT >= 11) {
                                a.this.f7663a.setLayerType(0, null);
                                return;
                            }
                            return;
                        }
                        a.this.f7663a.setVisibility(4);
                        if (a.this.f7663a.getParent() instanceof RelativeLayout) {
                            ((RelativeLayout) a.this.f7663a.getParent()).getBackground().setAlpha(0);
                            ((RelativeLayout) a.this.f7663a.getParent()).setBackgroundColor(0);
                        }
                    }
                });
            } else {
                TapjoyLog.e("TJAdUnitJSBridge", "Unable to present offerwall. No Activity context provided.");
            }
        }

        public a(WebView webView) {
            this.f7663a = webView;
        }
    }

    public void onVideoReady(int i, int i2, int i3) {
        HashMap hashMap = new HashMap();
        hashMap.put(TJAdUnitConstants.String.VIDEO_EVENT_NAME, TJAdUnitConstants.String.VIDEO_READY_EVENT);
        hashMap.put(TJAdUnitConstants.String.VIDEO_DURATION, Integer.valueOf(i));
        hashMap.put(TJAdUnitConstants.String.VIDEO_WIDTH, Integer.valueOf(i2));
        hashMap.put(TJAdUnitConstants.String.VIDEO_HEIGHT, Integer.valueOf(i3));
        invokeJSAdunitMethod(TJAdUnitConstants.String.VIDEO_EVENT, hashMap);
    }

    public void onVideoStarted(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put(TJAdUnitConstants.String.VIDEO_EVENT_NAME, TJAdUnitConstants.String.VIDEO_START_EVENT);
        hashMap.put(TJAdUnitConstants.String.VIDEO_CURRENT_TIME, Integer.valueOf(i));
        invokeJSAdunitMethod(TJAdUnitConstants.String.VIDEO_EVENT, hashMap);
    }

    public void onVideoProgress(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put(TJAdUnitConstants.String.VIDEO_EVENT_NAME, TJAdUnitConstants.String.VIDEO_PROGRESS_EVENT);
        hashMap.put(TJAdUnitConstants.String.VIDEO_CURRENT_TIME, Integer.valueOf(i));
        invokeJSAdunitMethod(TJAdUnitConstants.String.VIDEO_EVENT, hashMap);
    }

    public void onVideoPaused(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put(TJAdUnitConstants.String.VIDEO_EVENT_NAME, TJAdUnitConstants.String.VIDEO_PAUSE_EVENT);
        hashMap.put(TJAdUnitConstants.String.VIDEO_CURRENT_TIME, Integer.valueOf(i));
        invokeJSAdunitMethod(TJAdUnitConstants.String.VIDEO_EVENT, hashMap);
    }

    public void onVideoCompletion() {
        HashMap hashMap = new HashMap();
        hashMap.put(TJAdUnitConstants.String.VIDEO_EVENT_NAME, TJAdUnitConstants.String.VIDEO_COMPLETE_EVENT);
        invokeJSAdunitMethod(TJAdUnitConstants.String.VIDEO_EVENT, hashMap);
    }

    public void onVideoInfo(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(TJAdUnitConstants.String.VIDEO_EVENT_NAME, TJAdUnitConstants.String.VIDEO_INFO_EVENT);
        hashMap.put(TJAdUnitConstants.String.VIDEO_INFO, str);
        invokeJSAdunitMethod(TJAdUnitConstants.String.VIDEO_EVENT, hashMap);
    }

    public void onVideoError(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(TJAdUnitConstants.String.VIDEO_EVENT_NAME, TJAdUnitConstants.String.VIDEO_ERROR_EVENT);
        hashMap.put("error", str);
        invokeJSAdunitMethod(TJAdUnitConstants.String.VIDEO_EVENT, hashMap);
    }

    public void notifyOrientationChanged(String str, int i, int i2) {
        HashMap hashMap = new HashMap();
        hashMap.put("orientation", str);
        hashMap.put("width", Integer.valueOf(i));
        hashMap.put("height", Integer.valueOf(i2));
        invokeJSAdunitMethod(TJAdUnitConstants.String.ORIENTATION_CHANGED_EVENT, hashMap);
    }
}
