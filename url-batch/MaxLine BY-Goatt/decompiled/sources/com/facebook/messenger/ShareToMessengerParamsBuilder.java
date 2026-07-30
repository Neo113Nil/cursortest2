package com.facebook.messenger;

import android.net.Uri;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class ShareToMessengerParamsBuilder {
    private Uri mExternalUri;
    private String mMetaData;
    private final String mMimeType;
    private final Uri mUri;

    public ShareToMessengerParamsBuilder(Uri uri, String str) {
        this.mUri = uri;
        this.mMimeType = str;
    }

    public ShareToMessengerParams build() {
        return new ShareToMessengerParams(this);
    }

    public Uri getExternalUri() {
        return this.mExternalUri;
    }

    public String getMetaData() {
        return this.mMetaData;
    }

    public String getMimeType() {
        return this.mMimeType;
    }

    public Uri getUri() {
        return this.mUri;
    }

    public ShareToMessengerParamsBuilder setExternalUri(Uri uri) {
        this.mExternalUri = uri;
        return this;
    }

    public ShareToMessengerParamsBuilder setMetaData(String str) {
        this.mMetaData = str;
        return this;
    }
}
