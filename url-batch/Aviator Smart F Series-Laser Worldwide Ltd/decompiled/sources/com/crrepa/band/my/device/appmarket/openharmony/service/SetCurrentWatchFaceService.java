package com.crrepa.band.my.device.appmarket.openharmony.service;

import android.util.Log;
import com.google.android.exoplayer2.C;
import com.google.gson.JsonObject;

/* loaded from: classes2.dex */
public class SetCurrentWatchFaceService {
    private static final String TAG = "tagWatchConnectApp";

    public interface SetCurrentWatchFaceCallback {
        void onSetCurrentWatchFaceResult(int i8, String str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setCurrentWatchFace$0(JsonObject jsonObject, SetCurrentWatchFaceCallback setCurrentWatchFaceCallback) {
        String asString = jsonObject.get("uuid").getAsString();
        String asString2 = jsonObject.get("name").getAsString();
        if (asString.isEmpty() || asString2.isEmpty()) {
            Log.e(TAG, "setCurrentWatchFace, uuid/name is not set!!!");
            if (setCurrentWatchFaceCallback != null) {
                setCurrentWatchFaceCallback.onSetCurrentWatchFaceResult(1, "uuid/name is not set!!!");
                return;
            }
            return;
        }
        String str = "set current watch face(" + asString2 + ") success.";
        try {
            Thread.sleep(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
            if (setCurrentWatchFaceCallback != null) {
                setCurrentWatchFaceCallback.onSetCurrentWatchFaceResult(0, str);
            }
        } catch (InterruptedException e8) {
            throw new RuntimeException(e8);
        }
    }

    public void setCurrentWatchFace(final JsonObject jsonObject, final SetCurrentWatchFaceCallback setCurrentWatchFaceCallback) {
        Log.i(TAG, "SetCurrentWatchFaceService::setCurrentWatchFace in");
        new Thread(new Runnable() { // from class: com.crrepa.band.my.device.appmarket.openharmony.service.i
            @Override // java.lang.Runnable
            public final void run() {
                SetCurrentWatchFaceService.lambda$setCurrentWatchFace$0(JsonObject.this, setCurrentWatchFaceCallback);
            }
        }).start();
        Log.i(TAG, "SetCurrentWatchFaceService::setCurrentWatchFace out");
    }
}
