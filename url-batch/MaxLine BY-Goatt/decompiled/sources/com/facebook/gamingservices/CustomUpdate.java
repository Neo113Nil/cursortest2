package com.facebook.gamingservices;

import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.gamingservices.model.CustomUpdateContent;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class CustomUpdate {
    public static final CustomUpdate INSTANCE = new CustomUpdate();

    private CustomUpdate() {
    }

    public static final GraphRequest newCustomUpdateRequest(CustomUpdateContent customUpdateContent, GraphRequest.Callback callback) {
        customUpdateContent.getClass();
        return GraphRequest.Companion.newPostRequest(AccessToken.Companion.getCurrentAccessToken(), "me/custom_update", customUpdateContent.toGraphRequestContent(), callback);
    }
}
