package com.facebook.gamingservices.cloudgaming;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.GraphRequest;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.gamingservices.internal.GamingMediaUploader;
import java.io.File;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class AppToUserNotificationSender {
    private static Bundle getParameters() {
        Bundle bundle = new Bundle();
        bundle.putString("upload_source", "A2U");
        return bundle;
    }

    public static void scheduleAppToUserNotification(String str, String str2, Bitmap bitmap, int i, String str3, GraphRequest.Callback callback) {
        GamingMediaUploader.uploadToGamingServices(SDKConstants.PARAM_A2U_CAPTION, bitmap, getParameters(), new MediaUploadCallback(str, str2, i, str3, callback));
    }

    public static void scheduleAppToUserNotification(String str, String str2, File file, int i, String str3, GraphRequest.Callback callback) {
        GamingMediaUploader.uploadToGamingServices(SDKConstants.PARAM_A2U_CAPTION, file, getParameters(), new MediaUploadCallback(str, str2, i, str3, callback));
    }

    public static void scheduleAppToUserNotification(String str, String str2, Uri uri, int i, String str3, GraphRequest.Callback callback) {
        GamingMediaUploader.uploadToGamingServices(SDKConstants.PARAM_A2U_CAPTION, uri, getParameters(), new MediaUploadCallback(str, str2, i, str3, callback));
    }
}
