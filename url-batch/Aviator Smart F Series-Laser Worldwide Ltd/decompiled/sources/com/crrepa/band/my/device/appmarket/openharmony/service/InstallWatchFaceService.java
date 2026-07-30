package com.crrepa.band.my.device.appmarket.openharmony.service;

import android.os.Environment;
import android.util.Log;
import com.google.android.exoplayer2.C;
import com.google.gson.JsonObject;
import java.io.File;

/* loaded from: classes2.dex */
public class InstallWatchFaceService {
    private static final String TAG = "tagWatchConnectApp";

    public interface InstallWatchFaceCallback {
        void onInstallWatchFaceResult(int i8, String str);
    }

    private boolean isFileExist(String str) {
        return new File(str).exists();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$installWatchFace$0(JsonObject jsonObject, InstallWatchFaceCallback installWatchFaceCallback) {
        String asString = jsonObject.get("uuid").getAsString();
        String asString2 = jsonObject.get("name").getAsString();
        String asString3 = jsonObject.get("fileName").getAsString();
        if (asString.isEmpty() || asString2.isEmpty() || asString3.isEmpty()) {
            Log.e(TAG, "installWatchFace, uuid/name/fileName is not set!!!");
            if (installWatchFaceCallback != null) {
                installWatchFaceCallback.onInstallWatchFaceResult(1, "uuid/name/fileName is not set!!!");
                return;
            }
            return;
        }
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        if (!externalStoragePublicDirectory.exists()) {
            externalStoragePublicDirectory = com.moyoung.dafit.module.common.utils.d.get().getCacheDir();
        }
        String format = String.format("%s/%s", externalStoragePublicDirectory, asString3);
        Log.i(TAG, "save file path:" + format);
        if (!isFileExist(format)) {
            Log.e(TAG, "installWatchFace, app install file is not exist!!!");
            if (installWatchFaceCallback != null) {
                installWatchFaceCallback.onInstallWatchFaceResult(2, "app install file is not exist!!!");
                return;
            }
            return;
        }
        String str = "install app(" + asString2 + ") success.";
        try {
            Thread.sleep(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
            Log.i(TAG, str);
            if (installWatchFaceCallback != null) {
                installWatchFaceCallback.onInstallWatchFaceResult(0, str);
            }
        } catch (InterruptedException e8) {
            throw new RuntimeException(e8);
        }
    }

    public void installWatchFace(final JsonObject jsonObject, final InstallWatchFaceCallback installWatchFaceCallback) {
        Log.i(TAG, "InstallWatchFaceService::installWatchFace in");
        new Thread(new Runnable() { // from class: com.crrepa.band.my.device.appmarket.openharmony.service.h
            @Override // java.lang.Runnable
            public final void run() {
                InstallWatchFaceService.this.lambda$installWatchFace$0(jsonObject, installWatchFaceCallback);
            }
        }).start();
        Log.i(TAG, "InstallWatchFaceService::installWatchFace out");
    }
}
