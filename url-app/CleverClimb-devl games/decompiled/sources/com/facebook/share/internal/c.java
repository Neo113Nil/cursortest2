package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.internal.ab;
import com.facebook.internal.ac;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareVideoContent;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: LegacyNativeDialogParameters.java */
/* loaded from: classes.dex */
public class c {
    private static Bundle a(ShareVideoContent shareVideoContent, boolean z) {
        return null;
    }

    public static Bundle a(UUID uuid, ShareContent shareContent, boolean z) {
        ac.a(shareContent, "shareContent");
        ac.a(uuid, "callId");
        if (shareContent instanceof ShareLinkContent) {
            return a((ShareLinkContent) shareContent, z);
        }
        if (shareContent instanceof SharePhotoContent) {
            SharePhotoContent sharePhotoContent = (SharePhotoContent) shareContent;
            return a(sharePhotoContent, l.a(sharePhotoContent, uuid), z);
        }
        if (shareContent instanceof ShareVideoContent) {
            return a((ShareVideoContent) shareContent, z);
        }
        if (!(shareContent instanceof ShareOpenGraphContent)) {
            return null;
        }
        ShareOpenGraphContent shareOpenGraphContent = (ShareOpenGraphContent) shareContent;
        try {
            return a(shareOpenGraphContent, l.a(uuid, shareOpenGraphContent), z);
        } catch (JSONException e) {
            throw new com.facebook.j("Unable to create a JSON Object from the provided ShareOpenGraphContent: " + e.getMessage());
        }
    }

    private static Bundle a(ShareLinkContent shareLinkContent, boolean z) {
        Bundle a2 = a((ShareContent) shareLinkContent, z);
        ab.a(a2, "com.facebook.platform.extra.TITLE", shareLinkContent.getContentTitle());
        ab.a(a2, "com.facebook.platform.extra.DESCRIPTION", shareLinkContent.getContentDescription());
        ab.a(a2, "com.facebook.platform.extra.IMAGE", shareLinkContent.getImageUrl());
        return a2;
    }

    private static Bundle a(SharePhotoContent sharePhotoContent, List<String> list, boolean z) {
        Bundle a2 = a(sharePhotoContent, z);
        a2.putStringArrayList("com.facebook.platform.extra.PHOTOS", new ArrayList<>(list));
        return a2;
    }

    private static Bundle a(ShareOpenGraphContent shareOpenGraphContent, JSONObject jSONObject, boolean z) {
        Bundle a2 = a(shareOpenGraphContent, z);
        ab.a(a2, "com.facebook.platform.extra.PREVIEW_PROPERTY_NAME", shareOpenGraphContent.getPreviewPropertyName());
        ab.a(a2, "com.facebook.platform.extra.ACTION_TYPE", shareOpenGraphContent.getAction().getActionType());
        ab.a(a2, "com.facebook.platform.extra.ACTION", jSONObject.toString());
        return a2;
    }

    private static Bundle a(ShareContent shareContent, boolean z) {
        Bundle bundle = new Bundle();
        ab.a(bundle, "com.facebook.platform.extra.LINK", shareContent.getContentUrl());
        ab.a(bundle, "com.facebook.platform.extra.PLACE", shareContent.getPlaceId());
        ab.a(bundle, "com.facebook.platform.extra.REF", shareContent.getRef());
        bundle.putBoolean("com.facebook.platform.extra.DATA_FAILURES_FATAL", z);
        List<String> peopleIds = shareContent.getPeopleIds();
        if (!ab.a(peopleIds)) {
            bundle.putStringArrayList("com.facebook.platform.extra.FRIENDS", new ArrayList<>(peopleIds));
        }
        return bundle;
    }
}
