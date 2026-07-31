package com.huawei.hms.ads.installreferrer.api;

import C0.a;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.appsflyer.AppsFlyerProperties;
import com.huawei.hms.ads.installreferrer.commons.LogUtil;
import java.io.IOException;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class a extends InstallReferrerClient {

    /* renamed from: a, reason: collision with root package name */
    private int f13904a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final Context f13905b;

    /* renamed from: c, reason: collision with root package name */
    private C0.a f13906c;

    /* renamed from: d, reason: collision with root package name */
    private ServiceConnection f13907d;

    private final class b implements ServiceConnection {

        /* renamed from: a, reason: collision with root package name */
        private final InstallReferrerStateListener f13908a;

        private b(InstallReferrerStateListener installReferrerStateListener) {
            if (installReferrerStateListener == null) {
                throw new RuntimeException(" InstallReferrerServiceConnection listener is null");
            }
            this.f13908a = installReferrerStateListener;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                LogUtil.logInfo("ReferrerClientImpl", "onServiceConnected");
                a.this.f13906c = a.AbstractC0004a.a(iBinder);
                a.this.f13904a = 2;
                this.f13908a.onInstallReferrerSetupFinished(0);
            } catch (Throwable unused) {
                LogUtil.logWarn("ReferrerClientImpl", "service err");
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            LogUtil.logWarn("ReferrerClientImpl", "onServiceDisconnected");
            a.this.f13906c = null;
            a.this.f13904a = 0;
            this.f13908a.onInstallReferrerServiceDisconnected();
        }
    }

    public a(Context context) {
        this.f13905b = context.getApplicationContext();
    }

    private ReferrerDetails c(String str) {
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("channelInfo");
        long optLong = jSONObject.optLong("installTimestamp", 0L);
        long optLong2 = jSONObject.optLong("clickTimestamp", 0L);
        String optString2 = jSONObject.optString("grsCountryCode");
        String optString3 = jSONObject.optString(AppsFlyerProperties.CHANNEL);
        ReferrerDetails referrerDetails = new ReferrerDetails(optString, optLong2, optLong);
        referrerDetails.setGrsCountryCode(optString2);
        referrerDetails.setInstallChannel(optString3);
        return referrerDetails;
    }

    @Override // com.huawei.hms.ads.installreferrer.api.InstallReferrerClient
    public void endConnection() {
        String str;
        this.f13904a = 3;
        if (this.f13907d != null) {
            LogUtil.logInfo("ReferrerClientImpl", "endConnection unbinding from service");
            try {
                this.f13905b.unbindService(this.f13907d);
            } catch (IllegalArgumentException unused) {
                str = "endConnection service not binding";
                LogUtil.logWarn("ReferrerClientImpl", str);
                this.f13907d = null;
                this.f13906c = null;
            } catch (Exception unused2) {
                str = "endConnection Exception";
                LogUtil.logWarn("ReferrerClientImpl", str);
                this.f13907d = null;
                this.f13906c = null;
            }
            this.f13907d = null;
        }
        this.f13906c = null;
    }

    @Override // com.huawei.hms.ads.installreferrer.api.InstallReferrerClient
    public ReferrerDetails getInstallReferrer() {
        if (!isReady()) {
            throw new IOException("getInstallReferrer service not connected");
        }
        try {
            String c4 = this.f13906c.c();
            if (TextUtils.isEmpty(c4)) {
                throw new IOException("getInstallReferrer not found installreferrer");
            }
            return c(c4);
        } catch (RemoteException e4) {
            LogUtil.logWarn("ReferrerClientImpl", "getInstallReferrer RemoteException");
            this.f13904a = 0;
            throw e4;
        } catch (JSONException unused) {
            LogUtil.logWarn("ReferrerClientImpl", "getInstallReferrer JSONException");
            this.f13904a = 0;
            throw new IOException("getInstallReferrer JSONException");
        }
    }

    @Override // com.huawei.hms.ads.installreferrer.api.InstallReferrerClient
    public boolean isReady() {
        return (this.f13904a != 2 || this.f13906c == null || this.f13907d == null) ? false : true;
    }

    @Override // com.huawei.hms.ads.installreferrer.api.InstallReferrerClient
    public int setInstallReferrer(String str, String str2, long j4, long j5) {
        String str3;
        if (TextUtils.isEmpty(str)) {
            str3 = "setInstallReferrer pkgName is empty";
        } else {
            if (!TextUtils.isEmpty(str2)) {
                if (!isReady()) {
                    LogUtil.logWarn("ReferrerClientImpl", "setInstallReferrer Service not connected");
                    throw new IOException("setInstallReferrer Service not connected");
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("channelId", str2);
                    jSONObject.put("clickTimestamp", j4);
                    jSONObject.put("installTimestamp", j5);
                    this.f13906c.f(str, jSONObject.toString(), 0);
                    return 0;
                } catch (RemoteException e4) {
                    LogUtil.logWarn("ReferrerClientImpl", "setInstallReferrer RemoteException");
                    this.f13904a = 0;
                    throw e4;
                } catch (JSONException unused) {
                    LogUtil.logWarn("ReferrerClientImpl", "setInstallReferrer JSONException");
                    throw new IOException("Parse json exception");
                }
            }
            str3 = "setInstallReferrer referrer  is empty";
        }
        LogUtil.logWarn("ReferrerClientImpl", str3);
        return -1;
    }

    @Override // com.huawei.hms.ads.installreferrer.api.InstallReferrerClient
    public void startConnection(InstallReferrerStateListener installReferrerStateListener) {
        ServiceInfo serviceInfo;
        if (isReady()) {
            LogUtil.logInfo("ReferrerClientImpl", "startConnection service connection is conneted");
            installReferrerStateListener.onInstallReferrerSetupFinished(0);
            return;
        }
        int i4 = this.f13904a;
        if (i4 == 1) {
            LogUtil.logWarn("ReferrerClientImpl", "startConnection is connecting");
            installReferrerStateListener.onInstallReferrerSetupFinished(3);
            return;
        }
        if (i4 == 3) {
            LogUtil.logWarn("ReferrerClientImpl", "startConnection is closed");
            installReferrerStateListener.onInstallReferrerSetupFinished(3);
            return;
        }
        String str = this.isTest ? "com.huawei.pps.hms.test" : "com.huawei.hwid";
        LogUtil.logInfo("ReferrerClientImpl", "startConnection starting service setup");
        this.f13907d = new b(installReferrerStateListener);
        Intent intent = new Intent("com.huawei.android.hms.CHANNEL_SERVICE");
        intent.setPackage(str);
        List<ResolveInfo> queryIntentServices = this.f13905b.getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty() || (serviceInfo = queryIntentServices.get(0).serviceInfo) == null) {
            this.f13904a = 0;
            LogUtil.logWarn("ReferrerClientImpl", "query service not found");
            installReferrerStateListener.onInstallReferrerSetupFinished(2);
            return;
        }
        String str2 = serviceInfo.packageName;
        String str3 = serviceInfo.name;
        if (!str.equals(str2) || str3 == null) {
            LogUtil.logWarn("ReferrerClientImpl", "bind service invalid, service not found");
            this.f13904a = 0;
            installReferrerStateListener.onInstallReferrerSetupFinished(2);
        } else {
            if (this.f13905b.bindService(new Intent(intent), this.f13907d, 1)) {
                LogUtil.logInfo("ReferrerClientImpl", "bind service success");
                return;
            }
            LogUtil.logWarn("ReferrerClientImpl", "bind service fail");
            this.f13904a = 0;
            installReferrerStateListener.onInstallReferrerSetupFinished(1);
        }
    }
}
