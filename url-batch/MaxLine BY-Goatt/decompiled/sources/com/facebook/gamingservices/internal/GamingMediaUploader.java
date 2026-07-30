package com.facebook.gamingservices.internal;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.GraphRequestAsyncTask;
import com.facebook.HttpMethod;
import com.facebook.internal.Utility;
import com.facebook.share.internal.ShareConstants;
import java.io.File;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class GamingMediaUploader {
    public static final GamingMediaUploader INSTANCE = new GamingMediaUploader();
    private static final String photoUploadEdge = "me/photos";

    private GamingMediaUploader() {
    }

    public static final GraphRequestAsyncTask uploadToGamingServices(String str, Uri uri, Bundle bundle, GraphRequest.Callback callback) {
        uri.getClass();
        if (Utility.isFileUri(uri) || Utility.isContentUri(uri)) {
            return GraphRequest.Companion.newUploadPhotoRequest(AccessToken.Companion.getCurrentAccessToken(), photoUploadEdge, uri, str, bundle, callback).executeAsync();
        }
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putString("url", uri.toString());
        if (str != null && str.length() != 0) {
            bundle2.putString(ShareConstants.FEED_CAPTION_PARAM, str);
        }
        return new GraphRequest(AccessToken.Companion.getCurrentAccessToken(), photoUploadEdge, bundle2, HttpMethod.POST, callback, null, 32, null).executeAsync();
    }

    public static final GraphRequestAsyncTask uploadToGamingServices(String str, File file, Bundle bundle, GraphRequest.Callback callback) {
        file.getClass();
        return GraphRequest.Companion.newUploadPhotoRequest(AccessToken.Companion.getCurrentAccessToken(), photoUploadEdge, file, str, bundle, callback).executeAsync();
    }

    public static final GraphRequestAsyncTask uploadToGamingServices(String str, Bitmap bitmap, Bundle bundle, GraphRequest.Callback callback) {
        bitmap.getClass();
        return GraphRequest.Companion.newUploadPhotoRequest(AccessToken.Companion.getCurrentAccessToken(), photoUploadEdge, bitmap, str, bundle, callback).executeAsync();
    }
}
