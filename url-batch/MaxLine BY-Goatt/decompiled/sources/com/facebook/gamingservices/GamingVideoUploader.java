package com.facebook.gamingservices;

import android.content.Context;
import android.net.Uri;
import com.facebook.GraphRequest;
import com.facebook.share.internal.VideoUploader;
import com.facebook.share.model.ShareVideo;
import com.facebook.share.model.ShareVideoContent;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class GamingVideoUploader {
    private Context context;

    public GamingVideoUploader(Context context) {
        this.context = context;
    }

    public void uploadToMediaLibrary(String str, Uri uri, boolean z, GraphRequest.OnProgressCallback onProgressCallback) {
        ShareVideoContent build = new ShareVideoContent.Builder().setVideo(new ShareVideo.Builder().setLocalUrl(uri).build()).setContentDescription(str).build();
        if (z) {
            onProgressCallback = new OpenGamingMediaDialog(this.context, onProgressCallback);
        }
        VideoUploader.uploadAsyncWithProgressCallback(build, onProgressCallback);
    }

    public void uploadToMediaLibrary(String str, Uri uri, GraphRequest.OnProgressCallback onProgressCallback) {
        uploadToMediaLibrary(str, uri, false, onProgressCallback);
    }

    public void uploadToMediaLibrary(String str, Uri uri) {
        uploadToMediaLibrary(str, uri, null);
    }
}
