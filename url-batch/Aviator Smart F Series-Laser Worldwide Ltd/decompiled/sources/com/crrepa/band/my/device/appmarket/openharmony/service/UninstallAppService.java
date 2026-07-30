package com.crrepa.band.my.device.appmarket.openharmony.service;

import android.annotation.SuppressLint;
import android.util.Log;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.google.gson.JsonObject;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class UninstallAppService {
    private static final String TAG = "tagWatchConnectApp";

    public interface UninstallAppListener {
        void onUninstallAppResult(int i8, String str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$uninstallApp$0(String str, UninstallAppListener uninstallAppListener, Long l8) {
        uninstallAppListener.onUninstallAppResult(0, "uninstall app(" + str + ") success.");
    }

    @SuppressLint({"CheckResult"})
    public void uninstallApp(JsonObject jsonObject, final UninstallAppListener uninstallAppListener) {
        Log.i(TAG, "UninstallAppService::uninstallApp in");
        final String asString = jsonObject.get("appName").getAsString();
        String asString2 = jsonObject.get("packageName").getAsString();
        if (asString.isEmpty() || asString2.isEmpty()) {
            Log.e(TAG, "UninstallAppService::uninstallApp, appName/packageName is not set!!!");
            if (uninstallAppListener != null) {
                uninstallAppListener.onUninstallAppResult(1, "appName/packageName is not set!!!");
                return;
            }
            return;
        }
        i4.getInstance().uninstallApp(asString2);
        if (uninstallAppListener != null) {
            Observable.timer(2L, TimeUnit.SECONDS).subscribe(new Consumer() { // from class: com.crrepa.band.my.device.appmarket.openharmony.service.j
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    UninstallAppService.lambda$uninstallApp$0(asString, uninstallAppListener, (Long) obj);
                }
            });
        }
        Log.i(TAG, "UninstallAppService::uninstallApp out");
    }
}
