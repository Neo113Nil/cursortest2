package com.cmplay.base.util.webview.ipc.data;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.cmplay.base.util.h;
import com.cmplay.base.util.x;

/* loaded from: classes.dex */
public class WebConfigManager implements IWebConfigManager {
    public static final String LOADING_ID = "sharepic_loading";
    public static final String WEB_SHAREPREFERENCES_NAME = "com.cmplay.base.util.webview.web";
    private static WebConfigManager sInstance;
    private IWebConfigManager mIPCInvoker;
    private SharedPreferences mShardPreferences;
    private String mStrSharedPreferenceName;

    private WebConfigManager(Context context) {
        h.c("ly", "WebConfigManager\u3000RuntimeCheck.IsWebProcess() = " + x.d());
        if (x.d()) {
            this.mStrSharedPreferenceName = new String(WEB_SHAREPREFERENCES_NAME);
            this.mShardPreferences = context.getSharedPreferences(this.mStrSharedPreferenceName, 0);
        }
        this.mIPCInvoker = new WebConfigMgrIPCInvoker();
    }

    public static WebConfigManager getInstanse(Context context) {
        if (sInstance == null) {
            synchronized (WebConfigManager.class) {
                if (sInstance == null) {
                    sInstance = new WebConfigManager(context);
                }
            }
        }
        return sInstance;
    }

    private SharedPreferences getSharedPreference() {
        x.f();
        return this.mShardPreferences;
    }

    @Override // com.cmplay.base.util.webview.ipc.data.IWebConfigManager
    public long getLongValue(String str, long j) {
        if (x.d()) {
            return getSharedPreference().getLong(str, j);
        }
        return this.mIPCInvoker.getLongValue(str, j);
    }

    @Override // com.cmplay.base.util.webview.ipc.data.IWebConfigManager
    public boolean getBooleanValue(String str, boolean z) {
        if (x.d()) {
            return getSharedPreference().getBoolean(str, z);
        }
        return this.mIPCInvoker.getBooleanValue(str, z);
    }

    @Override // com.cmplay.base.util.webview.ipc.data.IWebConfigManager
    public int getIntValue(String str, int i) {
        if (x.d()) {
            return getSharedPreference().getInt(str, i);
        }
        return this.mIPCInvoker.getIntValue(str, i);
    }

    @Override // com.cmplay.base.util.webview.ipc.data.IWebConfigManager
    public String getStringValue(String str, String str2) {
        if (x.d()) {
            return getSharedPreference().getString(str, str2);
        }
        return this.mIPCInvoker.getStringValue(str, str2);
    }

    @Override // com.cmplay.base.util.webview.ipc.data.IWebConfigManager
    public void setBooleanValue(String str, boolean z) {
        if (x.d()) {
            SharedPreferences.Editor edit = getSharedPreference().edit();
            edit.putBoolean(str, z);
            applyToEditor(edit);
            return;
        }
        this.mIPCInvoker.setBooleanValue(str, z);
    }

    @Override // com.cmplay.base.util.webview.ipc.data.IWebConfigManager
    public void setLongValue(String str, long j) {
        if (x.d()) {
            SharedPreferences.Editor edit = getSharedPreference().edit();
            edit.putLong(str, j);
            applyToEditor(edit);
            return;
        }
        this.mIPCInvoker.setLongValue(str, j);
    }

    @Override // com.cmplay.base.util.webview.ipc.data.IWebConfigManager
    public void setIntValue(String str, int i) {
        if (x.d()) {
            SharedPreferences.Editor edit = getSharedPreference().edit();
            edit.putInt(str, i);
            applyToEditor(edit);
            return;
        }
        this.mIPCInvoker.setIntValue(str, i);
    }

    @Override // com.cmplay.base.util.webview.ipc.data.IWebConfigManager
    public void setStringValue(String str, String str2) {
        if (x.d()) {
            SharedPreferences.Editor edit = getSharedPreference().edit();
            edit.putString(str, str2);
            applyToEditor(edit);
            return;
        }
        this.mIPCInvoker.setStringValue(str, str2);
    }

    @SuppressLint({"NewApi"})
    public static void applyToEditor(SharedPreferences.Editor editor) {
        if (Build.VERSION.SDK_INT >= 9) {
            editor.apply();
        } else {
            editor.commit();
        }
    }
}
