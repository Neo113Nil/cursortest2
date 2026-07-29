package com.xsj.crasheye;

import android.content.Context;
import android.content.SharedPreferences;
import com.cmplay.base.util.webview.util.WebUtils;
import com.xsj.crasheye.Properties;
import com.xsj.crasheye.log.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class RemoteSettings {
    RemoteSettings() {
    }

    protected static final RemoteSettingsData convertJsonToRemoteSettings(String str) {
        if (str == null || str.length() < 1) {
            return null;
        }
        RemoteSettingsData remoteSettingsData = new RemoteSettingsData();
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject optJSONObject = jSONObject.optJSONObject("remSetVer1");
            if (optJSONObject != null) {
                remoteSettingsData.logLevel = Integer.valueOf(optJSONObject.optInt("logLevel"));
                remoteSettingsData.eventLevel = Integer.valueOf(optJSONObject.getInt("eventLevel"));
                remoteSettingsData.netMonitoring = Boolean.valueOf(optJSONObject.optBoolean("netMonitoring"));
                remoteSettingsData.sessionTime = Integer.valueOf(optJSONObject.optInt("sessionTime"));
                remoteSettingsData.devSettings = optJSONObject.optJSONObject("devSettings").toString();
                remoteSettingsData.hashCode = optJSONObject.optString("hash");
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
            if (optJSONObject2 != null) {
                remoteSettingsData.actionSpan = Integer.valueOf(optJSONObject2.optInt("st"));
                remoteSettingsData.actionCounts = Integer.valueOf(optJSONObject2.optInt(WebUtils.SC));
                remoteSettingsData.actionHost = Integer.valueOf(optJSONObject2.optInt("sr"));
            }
            return remoteSettingsData;
        } catch (JSONException unused) {
            Logger.logError("Could not convert json to remote data");
            return null;
        } catch (Exception unused2) {
            Logger.logError("convert Json To Remote Settings Error");
            return null;
        }
    }

    protected static final boolean saveAndLoadRemoteSettings(Context context, RemoteSettingsData remoteSettingsData) {
        SharedPreferences.Editor edit;
        SharedPreferences sharedPreferences = context.getSharedPreferences("REMOTESETTINGSSETTINGS", 0);
        if (sharedPreferences == null || (edit = sharedPreferences.edit()) == null) {
            return false;
        }
        if (remoteSettingsData.logLevel != null && remoteSettingsData.logLevel.intValue() > 0) {
            edit.putInt("logLevel", remoteSettingsData.logLevel.intValue());
            Properties.RemoteSettingsProps.logLevel = remoteSettingsData.logLevel;
        }
        if (remoteSettingsData.eventLevel != null && remoteSettingsData.eventLevel.intValue() > 0) {
            edit.putInt("eventLevel", remoteSettingsData.eventLevel.intValue());
            Properties.RemoteSettingsProps.eventLevel = remoteSettingsData.eventLevel;
        }
        if (remoteSettingsData.netMonitoring != null) {
            edit.putBoolean("netMonitoring", remoteSettingsData.netMonitoring.booleanValue());
            Properties.RemoteSettingsProps.netMonitoringEnabled = remoteSettingsData.netMonitoring;
        }
        if (remoteSettingsData.sessionTime != null && remoteSettingsData.sessionTime.intValue() > 0) {
            edit.putInt("sessionTime", remoteSettingsData.sessionTime.intValue());
            Properties.RemoteSettingsProps.sessionTime = remoteSettingsData.sessionTime;
        }
        if (remoteSettingsData.devSettings != null) {
            edit.putString("devSettings", remoteSettingsData.devSettings);
            try {
                Properties.RemoteSettingsProps.devSettings = new JSONObject(remoteSettingsData.devSettings);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        if (remoteSettingsData.hashCode != null && remoteSettingsData.hashCode.length() > 1) {
            edit.putString("hashCode", remoteSettingsData.hashCode);
            Properties.RemoteSettingsProps.hashCode = remoteSettingsData.hashCode;
        }
        if (remoteSettingsData.actionSpan != null && remoteSettingsData.actionSpan.intValue() >= 1 && remoteSettingsData.actionSpan.intValue() <= 23) {
            edit.putInt("actionSpan", remoteSettingsData.actionSpan.intValue());
            Properties.RemoteSettingsProps.actionSpan = remoteSettingsData.actionSpan;
        }
        if (remoteSettingsData.actionCounts != null && remoteSettingsData.actionCounts.intValue() > 0) {
            edit.putInt("actionCounts", remoteSettingsData.actionCounts.intValue());
            Properties.RemoteSettingsProps.actionCounts = remoteSettingsData.actionCounts;
        }
        if (remoteSettingsData.actionHost != null && remoteSettingsData.actionHost.intValue() >= 0 && remoteSettingsData.actionHost.intValue() <= 99) {
            edit.putInt("actionHost", remoteSettingsData.actionHost.intValue());
            Properties.RemoteSettingsProps.actionHost = remoteSettingsData.actionHost;
        }
        return edit.commit();
    }

    protected static final boolean revertAndLoadSendReoprtHost(Context context) {
        SharedPreferences.Editor edit;
        SharedPreferences sharedPreferences = context.getSharedPreferences("REMOTESETTINGSSETTINGS", 0);
        if (sharedPreferences == null || (edit = sharedPreferences.edit()) == null) {
            return false;
        }
        edit.putInt("actionHost", -1);
        Properties.RemoteSettingsProps.actionHost = -1;
        return edit.commit();
    }

    protected static final RemoteSettingsData loadRemoteSettings(Context context) {
        if (context == null) {
            return null;
        }
        RemoteSettingsData remoteSettingsData = new RemoteSettingsData();
        SharedPreferences sharedPreferences = context.getSharedPreferences("REMOTESETTINGSSETTINGS", 0);
        if (sharedPreferences == null) {
            return null;
        }
        try {
            remoteSettingsData.logLevel = Integer.valueOf(sharedPreferences.getInt("logLevel", Properties.RemoteSettingsProps.logLevel.intValue()));
            remoteSettingsData.eventLevel = Integer.valueOf(sharedPreferences.getInt("eventLevel", Properties.RemoteSettingsProps.eventLevel.intValue()));
            remoteSettingsData.actionSpan = Integer.valueOf(sharedPreferences.getInt("actionSpan", Properties.RemoteSettingsProps.actionSpan.intValue()));
            remoteSettingsData.actionCounts = Integer.valueOf(sharedPreferences.getInt("actionCounts", Properties.RemoteSettingsProps.actionCounts.intValue()));
            remoteSettingsData.actionHost = Integer.valueOf(sharedPreferences.getInt("actionHost", Properties.RemoteSettingsProps.actionHost.intValue()));
            remoteSettingsData.netMonitoring = Boolean.valueOf(sharedPreferences.getBoolean("netMonitoring", Properties.RemoteSettingsProps.netMonitoringEnabled.booleanValue()));
            remoteSettingsData.sessionTime = Integer.valueOf(sharedPreferences.getInt("sessionTime", Properties.RemoteSettingsProps.sessionTime.intValue()));
            remoteSettingsData.devSettings = sharedPreferences.getString("devSettings", Properties.RemoteSettingsProps.devSettings.toString());
            remoteSettingsData.hashCode = sharedPreferences.getString("hashCode", Properties.RemoteSettingsProps.hashCode);
        } catch (Exception e) {
            Logger.logInfo("load remote settings error:" + e.getMessage());
        }
        return remoteSettingsData;
    }
}
