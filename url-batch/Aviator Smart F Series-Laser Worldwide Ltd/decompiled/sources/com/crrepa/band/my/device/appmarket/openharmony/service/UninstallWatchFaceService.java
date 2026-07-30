package com.crrepa.band.my.device.appmarket.openharmony.service;

import android.util.Log;
import com.google.android.exoplayer2.C;
import com.google.gson.JsonObject;

/* loaded from: classes2.dex */
public class UninstallWatchFaceService {
    private static final String TAG = "tagWatchConnectApp";

    public interface UninstallWatchFaceCallback {
        void onUninstallWatchFaceResult(int i8, String str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$uninstallWatchFace$0(JsonObject jsonObject, UninstallWatchFaceCallback uninstallWatchFaceCallback) {
        String asString = jsonObject.get("uuid").getAsString();
        String asString2 = jsonObject.get("name").getAsString();
        if (asString.isEmpty() || asString2.isEmpty()) {
            Log.e(TAG, "uninstallWatchFace, uuid/name is not set!!!");
            if (uninstallWatchFaceCallback != null) {
                uninstallWatchFaceCallback.onUninstallWatchFaceResult(1, "uuid/name is not set!!!");
                return;
            }
            return;
        }
        String str = "uninstall watch face(" + asString2 + ") success.";
        try {
            Thread.sleep(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
            if (uninstallWatchFaceCallback != null) {
                uninstallWatchFaceCallback.onUninstallWatchFaceResult(0, str);
            }
        } catch (InterruptedException e8) {
            throw new RuntimeException(e8);
        }
    }

    public void uninstallWatchFace(final JsonObject jsonObject, final UninstallWatchFaceCallback uninstallWatchFaceCallback) {
        Log.i(TAG, "UninstallWatchFaceService::uninstallWatchFace in");
        new Thread(new Runnable() { // from class: com.crrepa.band.my.device.appmarket.openharmony.service.k
            @Override // java.lang.Runnable
            public final void run() {
                UninstallWatchFaceService.lambda$uninstallWatchFace$0(JsonObject.this, uninstallWatchFaceCallback);
            }
        }).start();
        Log.i(TAG, "UninstallWatchFaceService::uninstallWatchFace out");
    }
}
