package com.unity3d.player;

import android.app.Activity;
import android.app.ActivityManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.da;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ApplicationExitInfoProvider {
    public static String getANRRecordsJson(int i4) {
        ApplicationExitInfoBase[] historicalProcessExitReasons;
        Activity activity = UnityPlayer.currentActivity;
        return (activity == null || (historicalProcessExitReasons = getHistoricalProcessExitReasons(activity, UnityPlayer.currentContext.getPackageName(), 0, i4)) == null) ? "" : toJson(historicalProcessExitReasons).toString();
    }

    public static ApplicationExitInfoBase[] getHistoricalProcessExitReasons(Activity activity, String str, int i4, int i5) {
        List historicalProcessExitReasons;
        ActivityManager activityManager = (ActivityManager) activity.getSystemService(ActivityManager.class);
        if (!PlatformSupport.RED_VELVET_CAKE_SUPPORT) {
            h1.T.a(5, "ApplicationExitInfoProvider: ApplicationExitInfo is only available from api 30 (Android 11)");
            return null;
        }
        historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(str, i4, i5);
        int size = historicalProcessExitReasons.size();
        ApplicationExitInfoBase[] applicationExitInfoBaseArr = new ApplicationExitInfoBase[size];
        for (int i6 = 0; i6 < size; i6++) {
            applicationExitInfoBaseArr[i6] = new ApplicationExitInfoWrapper(AbstractC1742f1.a(historicalProcessExitReasons.get(i6)));
        }
        return applicationExitInfoBaseArr;
    }

    public static void setProcessStateSummary(Activity activity, byte[] bArr) {
        if (PlatformSupport.RED_VELVET_CAKE_SUPPORT) {
            ((ActivityManager) activity.getSystemService(ActivityManager.class)).setProcessStateSummary(bArr);
        }
    }

    public static JSONArray toJson(ApplicationExitInfoBase[] applicationExitInfoBaseArr) {
        JSONArray jSONArray = new JSONArray();
        int i4 = -1;
        for (ApplicationExitInfoBase applicationExitInfoBase : applicationExitInfoBaseArr) {
            i4++;
            if (applicationExitInfoBase.getReason() == 6) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("description", applicationExitInfoBase.getDescription());
                jSONObject.put("trace", applicationExitInfoBase.getTraceString());
                jSONObject.put(da.a.f15878d, applicationExitInfoBase.getTimestamp() * 1000000);
                jSONObject.put(FirebaseAnalytics.Param.INDEX, i4);
                jSONArray.put(jSONObject);
            }
        }
        return jSONArray;
    }
}
