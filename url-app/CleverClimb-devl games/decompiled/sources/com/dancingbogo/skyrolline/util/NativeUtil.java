package com.dancingbogo.skyrolline.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.os.Vibrator;
import android.support.v4.app.ActivityCompat;
import android.support.v4.view.PointerIconCompat;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.widget.Toast;
import com.cmplay.base.util.webview.broadcast.GameBroadcast;
import com.cmplay.internalpush.p;
import com.cmplay.kinfoc.report.KInfocReportManager;
import com.dancingbogo.skyrolline.AppActivity;
import com.dancingbogo.skyrolline.GameApp;
import com.dancingbogo.skyrolline.ad.interstitial.admob.AdmobAdsTestUtil;
import com.dancingbogo.skyrolline.webview.broadcast.WebBroadcast;
import com.dancingbogo.skyrolline.webview.ui.WebViewActivity;
import com.unity3d.player.UnityPlayer;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class NativeUtil {
    private static NativeUtil sInstance;
    public boolean mIsOpenDialog = false;
    private String sAppVersionCode;
    private String sAppVersionName;

    public boolean IsTapTapChannel() {
        return false;
    }

    public void ReportAdShowChance(int i, int i2, int i3, int i4, int i5, int i6) {
    }

    public boolean getBuildConfig() {
        return false;
    }

    public static NativeUtil getInstance() {
        if (sInstance == null) {
            synchronized (NativeUtil.class) {
                if (sInstance == null) {
                    sInstance = new NativeUtil();
                }
            }
        }
        return sInstance;
    }

    public String getModel() {
        return h.f(GameApp.f4485a).t;
    }

    public String getVersionCode() {
        if (TextUtils.isEmpty(this.sAppVersionCode)) {
            this.sAppVersionCode = h.a(GameApp.f4485a);
        }
        return this.sAppVersionCode;
    }

    public String getVersionName() {
        if (TextUtils.isEmpty(this.sAppVersionName)) {
            this.sAppVersionName = h.b(GameApp.f4485a);
        }
        return this.sAppVersionName;
    }

    public String getOSVersion() {
        Context context = GameApp.f4485a;
        return String.valueOf(Build.VERSION.SDK_INT);
    }

    public long getSdCardMem() {
        return com.cmplay.internalpush.a.b.a();
    }

    public long getInnerMem() {
        return com.cmplay.internalpush.a.b.a(GameApp.f4485a);
    }

    public String getRollingSky() {
        try {
            return GameApp.f4485a.getPackageName();
        } catch (Exception unused) {
            return "";
        }
    }

    public long getPathMemory(String str) {
        if (str.contains(com.umeng.analytics.pro.c.f8856a)) {
            return getInnerMem();
        }
        if (!Environment.getExternalStorageState().equals("mounted")) {
            return -1L;
        }
        StatFs statFs = new StatFs(str);
        if (Build.VERSION.SDK_INT >= 18) {
            return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
        }
        return statFs.getBlockSize() * statFs.getAvailableBlocks();
    }

    public String getAndroidId() {
        return d.a(GameApp.f4485a);
    }

    public void SetLeaderboardID(String str) {
        com.dancingbogo.skyrolline.b.b.a(GameApp.f4485a).b("my_leaderboard_id", str);
    }

    public String GetLeaderboardId() {
        return com.dancingbogo.skyrolline.b.b.a(GameApp.f4485a).a("my_leaderboard_id", "0000");
    }

    public String getUUID() {
        return h.c(GameApp.f4485a);
    }

    public String getLanguageCode() {
        return com.dancingbogo.skyrolline.b.d.b("key_language_selected", "en");
    }

    public String getSystemLanguage() {
        return GameApp.f4485a.getResources().getConfiguration().locale.getCountry().toLowerCase();
    }

    public String getCountryCode() {
        return com.dancingbogo.skyrolline.b.d.b("key_country_selected", "");
    }

    public String getChannel() {
        String b2 = com.dancingbogo.skyrolline.b.d.b("key_channel_id", "");
        return !TextUtils.isEmpty(b2) ? b2 : h.d(GameApp.f4485a);
    }

    public String getChildChannel() {
        String b2 = com.dancingbogo.skyrolline.b.d.b("key_app_child_channel_id", "");
        return !TextUtils.isEmpty(b2) ? b2 : h.d(GameApp.f4485a);
    }

    public String getDevice() {
        return Build.DEVICE;
    }

    public String getBrand() {
        return h.f(GameApp.f4485a).j;
    }

    public String getDisplay() {
        return Build.DISPLAY;
    }

    public String getProduct() {
        return Build.PRODUCT;
    }

    public String getCodeName() {
        return Build.VERSION.CODENAME;
    }

    public String getHardware() {
        return Build.HARDWARE;
    }

    public String getID() {
        return Build.ID;
    }

    public String getBoard() {
        return Build.BOARD;
    }

    public String getManufacturer() {
        return Build.MANUFACTURER;
    }

    public String getMCC() {
        String simOperator = ((TelephonyManager) GameApp.f4485a.getSystemService("phone")).getSimOperator();
        if (simOperator == null || simOperator.length() < 3) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) simOperator, 0, 3);
        return sb.toString();
    }

    public boolean isInstalled(String str) {
        return d.b(str);
    }

    public void openApp(String str) {
        m.e(GameApp.f4485a, str);
    }

    public void jumpToGp(String str) {
        k.a(GameApp.f4485a, str);
    }

    public void startWebView(String str) {
        WebViewActivity.a(GameApp.f4485a, str, 0);
    }

    public void jumpToBrowser(String str) {
        k.b(GameApp.f4485a, str);
    }

    public String getData(int i, String str) {
        return com.dancingbogo.skyrolline.cloud.a.a().b(i, str);
    }

    public String[] getDatas(int i, String str) {
        List<String> a2 = com.dancingbogo.skyrolline.cloud.a.a().a(i, str);
        if (a2 != null && a2.size() > 0) {
            return (String[]) a2.toArray(new String[a2.size()]);
        }
        return new String[0];
    }

    public String getStringValue(int i, String str, String str2, String str3) {
        return com.dancingbogo.skyrolline.cloud.a.a().a(i, str, str2, str3);
    }

    public int getIntValue(int i, String str, String str2, int i2) {
        return com.dancingbogo.skyrolline.cloud.a.a().a(i, str, str2, i2);
    }

    public long getLongValue(int i, String str, String str2, long j) {
        return com.dancingbogo.skyrolline.cloud.a.a().a(i, str, str2, j);
    }

    public boolean getBooleanValue(int i, String str, String str2, boolean z) {
        return com.dancingbogo.skyrolline.cloud.a.a().a(i, str, str2, z);
    }

    public double getDoubleValue(int i, String str, String str2, double d2) {
        return com.dancingbogo.skyrolline.cloud.a.a().a(i, str, str2, d2);
    }

    public void onLanguageInitOver() {
        com.dancingbogo.skyrolline.cloud.a.a().a((Context) null);
    }

    public void setLanguage(String str, String str2) {
        b.b("deep_link", "NativeUtil.setLanguage language:" + str + "  country:" + str2);
        d.a(GameApp.f4485a, str, str2);
        com.dancingbogo.skyrolline.b.d.a("key_language_selected", str);
        com.dancingbogo.skyrolline.b.d.a("key_country_selected", str2);
        if (!TextUtils.isEmpty(str2)) {
            str = str + "_" + str2.toLowerCase();
        }
        com.cmplay.internalpush.a.a(str);
        b.b("internal_push", "NativeUtil.setLanguage CMPCloudConfigUtils.pullCloudConfigData language:" + str);
    }

    public boolean showOpenScreenAd(int i, int i2) {
        final Activity activityRef = AppActivity.getActivityRef();
        if (activityRef == null) {
            return false;
        }
        final boolean a2 = com.cmplay.internalpush.n.a().a(activityRef, i2, i <= 1);
        activityRef.runOnUiThread(new Runnable() { // from class: com.dancingbogo.skyrolline.util.NativeUtil.1
            @Override // java.lang.Runnable
            public void run() {
                if (a2) {
                    com.cmplay.internalpush.n.a().b(activityRef);
                }
            }
        });
        return a2;
    }

    public String getResultPageInfoForShow(int i) {
        if (p.a().a(GameApp.f4485a, 0, i <= 1)) {
            return p.a().a(GameApp.f4485a);
        }
        return null;
    }

    public void onResultPageClickAd(String str) {
        p.a().a(GameApp.f4485a, new com.cmplay.internalpush.data.g(str));
    }

    public boolean adCanShow(int i, int i2) {
        boolean a2 = com.dancingbogo.skyrolline.ad.a.a(i, i2);
        b.b("NativeUtil", "adCanShow = " + a2 + "adType = " + i2 + "sence = " + i);
        return a2;
    }

    public void prepareAd(final int i) {
        GameApp.a().a(new Runnable() { // from class: com.dancingbogo.skyrolline.util.NativeUtil.2
            @Override // java.lang.Runnable
            public void run() {
                com.dancingbogo.skyrolline.ad.a.b(i);
            }
        });
    }

    public void showAd(final int i, final int i2) {
        b.b("NativeUtil", "showAd = " + i);
        Activity activityRef = AppActivity.getActivityRef();
        if (activityRef == null) {
            return;
        }
        activityRef.runOnUiThread(new Runnable() { // from class: com.dancingbogo.skyrolline.util.NativeUtil.3
            @Override // java.lang.Runnable
            public void run() {
                boolean z;
                for (Integer num : com.dancingbogo.skyrolline.ad.a.a()) {
                    int intValue = num.intValue();
                    if (com.dancingbogo.skyrolline.ad.a.a(intValue) == i && intValue != 1009) {
                        com.dancingbogo.skyrolline.ad.a.c a2 = com.dancingbogo.skyrolline.ad.a.a(intValue, new com.dancingbogo.skyrolline.ad.b.a(intValue, i2));
                        if (a2 == null || !a2.canShow(i2)) {
                            z = false;
                        } else {
                            z = a2.show(i2);
                            b.b("NativeUtil", "showAd = " + i + "id = " + intValue + "isShow = " + z);
                        }
                        if (z) {
                            return;
                        }
                    }
                }
            }
        });
    }

    public boolean adInnerPushCanShow(int i, boolean z) {
        if (i == 2 || i == 3 || i == 4 || i == 7) {
            return false;
        }
        com.dancingbogo.skyrolline.ad.a.k = z;
        com.dancingbogo.skyrolline.ad.c.e.a.a().a(false);
        return com.dancingbogo.skyrolline.ad.a.a(PointerIconCompat.TYPE_VERTICAL_TEXT, (com.dancingbogo.skyrolline.ad.a.b) null).canShow(i);
    }

    public void showInnerPush(int i) {
        if (i == 2 || i == 3 || i == 4 || i == 7) {
            return;
        }
        com.dancingbogo.skyrolline.ad.a.k = false;
        com.dancingbogo.skyrolline.ad.a.c a2 = com.dancingbogo.skyrolline.ad.a.a(PointerIconCompat.TYPE_VERTICAL_TEXT, new com.dancingbogo.skyrolline.ad.b.a(PointerIconCompat.TYPE_VERTICAL_TEXT, i));
        if (a2.canShow(i)) {
            a2.show(i);
        }
    }

    public boolean canShowHitTopRewardedVideo(int i, boolean z) {
        com.cmplay.base.util.h.a("internal_push", "canShowHitTopRewardedVideo  sence:" + i);
        if (i == 2 || i == 3 || i == 4 || i == 7) {
            return false;
        }
        com.dancingbogo.skyrolline.ad.a.k = z;
        com.dancingbogo.skyrolline.ad.c.e.a.a().a(true);
        boolean canShow = com.dancingbogo.skyrolline.ad.a.a(PointerIconCompat.TYPE_VERTICAL_TEXT, (com.dancingbogo.skyrolline.ad.a.b) null).canShow(i);
        com.cmplay.base.util.h.a("internal_push", "canShowHitTopRewardedVideo:" + canShow);
        return canShow;
    }

    public void showHitTopRewardedVideo(int i) {
        com.cmplay.base.util.h.a("internal_push", "showHitTopRewardedVideo  sence:" + i);
        if (i == 2 || i == 3 || i == 4 || i == 7) {
            return;
        }
        com.dancingbogo.skyrolline.ad.a.k = false;
        com.dancingbogo.skyrolline.ad.a.c a2 = com.dancingbogo.skyrolline.ad.a.a(PointerIconCompat.TYPE_VERTICAL_TEXT, new com.dancingbogo.skyrolline.ad.b.a(PointerIconCompat.TYPE_VERTICAL_TEXT, i));
        if (a2.canShow(i)) {
            a2.show(i);
        }
    }

    public void callbackAdShowStatues(int i, int i2, int i3) {
        b.b("NativeUtil", "callbackAdShowStatues = " + i + "," + i2 + "," + i3);
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(",");
        sb.append(i2);
        sb.append(",");
        sb.append(i3);
        UnityPlayer.UnitySendMessage("ADManager", "OnADCallbackMessage", sb.toString());
    }

    public boolean IsSignedIn() {
        if (AppActivity.getActivityRef() == null) {
            return false;
        }
        return ((AppActivity) AppActivity.getActivityRef()).IsSignedIn();
    }

    public void showLeaderboards() {
        if (AppActivity.getActivityRef() != null) {
            ((AppActivity) AppActivity.getActivityRef()).showLeaderboards();
        }
    }

    public void authenticate() {
        if (AppActivity.getActivityRef() != null) {
            ((AppActivity) AppActivity.getActivityRef()).authenticate();
        }
    }

    public void showAchievements() {
        if (AppActivity.getActivityRef() != null) {
            ((AppActivity) AppActivity.getActivityRef()).showAchievements();
        }
    }

    public void submitScore(String str, long j, String str2) {
        if (AppActivity.getActivityRef() != null) {
            ((AppActivity) AppActivity.getActivityRef()).submitScore(str, j, str2);
        }
    }

    public void unlockAchievement(String str, boolean z) {
        if (AppActivity.getActivityRef() != null) {
            ((AppActivity) AppActivity.getActivityRef()).unlockAchievement(str);
        }
    }

    public void sendUnityMessage(String str, String str2, String str3) {
        UnityPlayer.UnitySendMessage(str, str2, str3);
    }

    public void reportInfoc(String str, String str2, boolean z) {
        i.b(str, str2, z);
    }

    public void reportCheckInfoc(int i) {
        KInfocReportManager.getInstance().reportEvent(i);
    }

    public int openNewLevel() {
        if (AppActivity.getActivityRef() != null) {
            return ((AppActivity) AppActivity.getActivityRef()).getOpenNewLevel();
        }
        return -1;
    }

    public void onGameExit() {
        KInfocReportManager.getInstance().onGameExit();
    }

    public int getABTest() {
        return g.a();
    }

    public void shakePhone() {
        ((Vibrator) ((AppActivity) AppActivity.getActivityRef()).getSystemService("vibrator")).vibrate(new long[]{100, 300}, -1);
    }

    public void openFacebookMain(String str) {
        if (AdmobAdsTestUtil.DEBUG.booleanValue()) {
            AppActivity.getActivityRef().runOnUiThread(new Runnable() { // from class: com.dancingbogo.skyrolline.util.NativeUtil.4
                @Override // java.lang.Runnable
                public void run() {
                    AdmobAdsTestUtil.getInstance().chooseAd();
                }
            });
        } else {
            g.a(str);
        }
    }

    public void openFeedback(String str) {
        if (AdmobAdsTestUtil.DEBUG.booleanValue()) {
            AppActivity.getActivityRef().runOnUiThread(new Runnable() { // from class: com.dancingbogo.skyrolline.util.NativeUtil.5
                @Override // java.lang.Runnable
                public void run() {
                    AdmobAdsTestUtil.getInstance().showInterstitialAd();
                }
            });
        } else {
            WebViewActivity.a(AppActivity.getActivityRef(), str, 0);
        }
    }

    public void refreshProductPrice(String str) {
        b.b("Nativeutil", "into refreshProductPrice:" + str);
    }

    public void refreshNoConsumeProductPrice(String str) {
        b.b("Nativeutil", "into refreshNoConsumeProductPrice:" + str);
    }

    public boolean initPay(String str, String str2) {
        b.b("Nativeutil", "into productId_all:" + str);
        b.b("Nativeutil", "into productId_noConsume:" + str2);
        Activity activityRef = AppActivity.getActivityRef();
        if (activityRef == null) {
            return false;
        }
        com.dancingbogo.skyrolline.a.a.a().a(activityRef, str, str2);
        return true;
    }

    public void getProductInfos() {
        b.b("Nativeutil", "into getProductInfos");
        com.dancingbogo.skyrolline.a.a.a().b();
    }

    public void payProduct(String str) {
        b.b("Nativeutil", "into payProduct:" + str);
        com.dancingbogo.skyrolline.a.a.a().a(str);
    }

    public void restoreNoConsumeProducts() {
        b.b("Nativeutil", "into restoreNoConsumeProducts");
        com.dancingbogo.skyrolline.a.a.a().c();
    }

    public void refreshProductInfos() {
        b.b("Nativeutil", "into refreshProductInfos");
    }

    public void jumpToLevel(int i) {
        sendUnityMessage("NativeUtils", GameBroadcast.JUMP_TO_LEVEL, i + "");
    }

    public void sendPrize(int i, int i2, int i3) {
        b.b("lottery_NativeUtils", "sendPrize id= " + i2 + " count = " + i3);
        sendUnityMessage("NativeUtils", "sendPrize", i + "|" + i2 + "|" + i3);
    }

    public void showToast(final String str) {
        final Activity activityRef = AppActivity.getActivityRef();
        if (activityRef != null) {
            activityRef.runOnUiThread(new Runnable() { // from class: com.dancingbogo.skyrolline.util.NativeUtil.6
                @Override // java.lang.Runnable
                public void run() {
                    Toast.makeText(activityRef, str, 0).show();
                }
            });
        }
    }

    public void postFeedbackJson(String str) {
        String str2;
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.put("model", getModel());
            jSONObject.put("sysversion", getOSVersion());
            jSONObject.put("uuid", getUUID());
            jSONObject.put("version", getVersionCode());
            str2 = jSONObject.toString();
        } catch (Exception e) {
            e.printStackTrace();
            str2 = "";
        }
        b.b("NativeUtils", "postFeedbackJson json = " + str2);
        sendUnityMessage("NativeUtils", "SendFeedbackMessage", str2);
    }

    public void reportGamePlaying(String str) {
        com.cmplay.a.a.a(GameApp.f4485a, str);
        b.b("NativeUtils", "reportGamePlaying = " + str);
    }

    public void appsflyerTrackEvent(String str, String str2) {
        com.cmplay.a.a.a(GameApp.f4485a, str, str2);
    }

    public boolean checkSelfPermission() {
        Activity activityRef;
        boolean z = true;
        if (Build.VERSION.SDK_INT >= 23 && ((activityRef = AppActivity.getActivityRef()) == null || ActivityCompat.checkSelfPermission(activityRef, "android.permission.READ_EXTERNAL_STORAGE") != 0 || ActivityCompat.checkSelfPermission(activityRef, "android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
            z = false;
        }
        b.b("NativeUtils", "checkSelfPermission = " + z);
        return z;
    }

    public void showDialog(final String str, final String str2, final String str3, final String str4) {
        final Activity activityRef;
        if (this.mIsOpenDialog || (activityRef = AppActivity.getActivityRef()) == null) {
            return;
        }
        activityRef.runOnUiThread(new Runnable() { // from class: com.dancingbogo.skyrolline.util.NativeUtil.7
            @Override // java.lang.Runnable
            public void run() {
                AlertDialog.Builder builder = new AlertDialog.Builder(activityRef, 5);
                builder.setTitle(str);
                builder.setMessage(str2);
                builder.setCancelable(false);
                builder.setPositiveButton(str3, new DialogInterface.OnClickListener() { // from class: com.dancingbogo.skyrolline.util.NativeUtil.7.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        NativeUtil.this.sendUnityMessage("NativeUtils", "CallDialog", str4);
                        NativeUtil.this.mIsOpenDialog = false;
                        dialogInterface.dismiss();
                    }
                });
                builder.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.dancingbogo.skyrolline.util.NativeUtil.7.2
                    @Override // android.content.DialogInterface.OnCancelListener
                    public void onCancel(DialogInterface dialogInterface) {
                        NativeUtil.this.sendUnityMessage("NativeUtils", "CallDialog", str4);
                    }
                });
                builder.create().show();
                NativeUtil.this.mIsOpenDialog = true;
            }
        });
    }

    public int getUserID() {
        return Process.myUid();
    }

    public String getResumeUserId() {
        String model = getModel();
        String device = getDevice();
        TextUtils.isEmpty(model);
        TextUtils.isEmpty(device);
        return d.a(GameApp.f4485a) + "_" + getModel() + "_" + getDevice();
    }

    public void SharePicture(String str, String str2) {
        b.b("ShareHelper", "SharePicture");
        com.cmplay.b.g.a().a(Integer.parseInt(str), str2);
    }

    public String getGoogleUserName() {
        AppActivity appActivity = (AppActivity) AppActivity.getActivityRef();
        return appActivity != null ? appActivity.getUserName() : "";
    }

    public void clickShareBtn(int i, int i2, String str, String str2, String str3, String str4) {
        b.b("NativeUtil", "clickShareBtn");
        com.cmplay.b.g.a().a(i, i2, str, str2, str3, str4);
    }

    public void getProp(int i) {
        String b2 = com.dancingbogo.skyrolline.b.d.b("key_lottery_prop_data", "");
        b.b("lottery", "NativeUtil.getProp  id:" + i + "  jsonData:" + b2);
        getProps(b2);
    }

    public void getProps() {
        b.b("lottery", "NativeUtil.getProps");
        sendUnityMessage("NativeUtils", "getProps", "");
    }

    public void getItemsInfo() {
        String b2 = com.dancingbogo.skyrolline.b.d.b("key_lottery_prop_data", "");
        b.b("lottery", "NativeUtil.getItemsInfo json:" + b2);
        WebBroadcast.b(GameApp.f4485a, b2);
    }

    public void getProp(int i, int i2) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("id", i);
            jSONObject2.put("count", i2);
            jSONObject.put("data", jSONObject2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        b.b("lottery", "NativeUtil.getProp json= " + jSONObject.toString());
        WebBroadcast.a(GameApp.f4485a, jSONObject2.toString());
    }

    public void getProps(String str) {
        b.b("lottery", "NativeUtil.getProps json:" + str);
        WebBroadcast.a(GameApp.f4485a, str);
    }

    public void canShowAd(int i) {
        b.b("lottery", "NativeUtil.canShowAd  sence:" + i);
        canShowAd(i, adCanShow(i, 1) ? 1 : 0);
    }

    public void canShowAd(int i, int i2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sence", i);
            jSONObject.put("isCanShow", i2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        b.b("lottery", "NativeUtil.canShowAd json= " + jSONObject.toString());
        WebBroadcast.c(GameApp.f4485a, jSONObject.toString());
    }

    public void showAd(int i) {
        b.b("lottery", "NativeUtil.showAd  sence:" + i);
        showAd(1, i);
    }

    public void callbackAd(int i, int i2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sence", i);
            jSONObject.put("isSuccess", i2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        b.b("lottery", "callbackAd json= " + jSONObject.toString());
        WebBroadcast.d(GameApp.f4485a, jSONObject.toString());
    }

    public void jumpToLottery(String str, String str2) {
        b.b("lottery", "NativeUtil.jumpToLottery jsonData:" + str2);
        com.dancingbogo.skyrolline.b.d.a("key_lottery_prop_data", str2);
        startWebView(str);
    }

    public void setLevelData(String str) {
        b.b("lottery", "NativeUtil.setLevelData");
        sendUnityMessage("NativeUtils", "setLevelData", str);
    }

    public void setAddPropNumberData(String str) {
        b.b("lottery", "NativeUtil.setAddPropNumberData");
        sendUnityMessage("NativeUtils", "setAddPropNumberData", str);
    }

    public String GetWebConfigKey(String str) {
        return com.dancingbogo.skyrolline.b.b.a(GameApp.f4485a).a(str, "");
    }

    public boolean canShowSettingSmallVideo(int i, boolean z) {
        return com.cmplay.internalpush.d.a(i, z);
    }

    public boolean showSettingSmallVideo(int i, int i2, int i3, int i4, int i5) {
        if (AppActivity.getActivityRef() == null) {
            return false;
        }
        return com.cmplay.internalpush.d.a(AppActivity.getActivityRef(), i, i2, i3, i4, i5);
    }

    public void hideSettingSmallVideo() {
        if (AppActivity.getActivityRef() == null) {
            return;
        }
        com.cmplay.internalpush.d.a(AppActivity.getActivityRef());
    }

    public boolean canShowResultSmallVideo(int i, boolean z) {
        return com.cmplay.internalpush.d.b(i, z);
    }

    public boolean showResultSmallVideo(int i, int i2, int i3, int i4, int i5) {
        if (AppActivity.getActivityRef() == null) {
            return false;
        }
        return com.cmplay.internalpush.d.b(AppActivity.getActivityRef(), i, i2, i3, i4, i5);
    }

    public void hideResultSmallVideo() {
        if (AppActivity.getActivityRef() == null) {
            return;
        }
        com.cmplay.internalpush.d.b(AppActivity.getActivityRef());
    }

    public int getScreenWidth() {
        if (AppActivity.getActivityRef() == null) {
            return -1;
        }
        WindowManager windowManager = AppActivity.getActivityRef().getWindowManager();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    public int getScreenHeight() {
        if (AppActivity.getActivityRef() == null) {
            return -1;
        }
        WindowManager windowManager = AppActivity.getActivityRef().getWindowManager();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }
}
