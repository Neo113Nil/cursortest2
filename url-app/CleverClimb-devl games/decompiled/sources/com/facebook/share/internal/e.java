package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.internal.ab;
import com.facebook.internal.ac;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareHashtag;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareVideoContent;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: NativeDialogParameters.java */
/* loaded from: classes.dex */
public class e {
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
            ShareVideoContent shareVideoContent = (ShareVideoContent) shareContent;
            return a(shareVideoContent, l.a(shareVideoContent, uuid), z);
        }
        if (shareContent instanceof ShareOpenGraphContent) {
            ShareOpenGraphContent shareOpenGraphContent = (ShareOpenGraphContent) shareContent;
            try {
                return a(shareOpenGraphContent, l.a(l.a(uuid, shareOpenGraphContent), false), z);
            } catch (JSONException e) {
                throw new com.facebook.j("Unable to create a JSON Object from the provided ShareOpenGraphContent: " + e.getMessage());
            }
        }
        if (!(shareContent instanceof ShareMediaContent)) {
            return null;
        }
        ShareMediaContent shareMediaContent = (ShareMediaContent) shareContent;
        return a(shareMediaContent, l.a(shareMediaContent, uuid), z);
    }

    private static Bundle a(ShareLinkContent shareLinkContent, boolean z) {
        Bundle a2 = a((ShareContent) shareLinkContent, z);
        ab.a(a2, "TITLE", shareLinkContent.getContentTitle());
        ab.a(a2, "DESCRIPTION", shareLinkContent.getContentDescription());
        ab.a(a2, "IMAGE", shareLinkContent.getImageUrl());
        ab.a(a2, "QUOTE", shareLinkContent.getQuote());
        return a2;
    }

    private static Bundle a(SharePhotoContent sharePhotoContent, List<String> list, boolean z) {
        Bundle a2 = a(sharePhotoContent, z);
        a2.putStringArrayList("PHOTOS", new ArrayList<>(list));
        return a2;
    }

    private static Bundle a(ShareVideoContent shareVideoContent, String str, boolean z) {
        Bundle a2 = a(shareVideoContent, z);
        ab.a(a2, "TITLE", shareVideoContent.getContentTitle());
        ab.a(a2, "DESCRIPTION", shareVideoContent.getContentDescription());
        ab.a(a2, "VIDEO", str);
        return a2;
    }

    private static Bundle a(ShareMediaContent shareMediaContent, List<Bundle> list, boolean z) {
        Bundle a2 = a(shareMediaContent, z);
        a2.putParcelableArrayList("MEDIA", new ArrayList<>(list));
        return a2;
    }

    private static Bundle a(ShareOpenGraphContent shareOpenGraphContent, JSONObject jSONObject, boolean z) {
        Bundle a2 = a(shareOpenGraphContent, z);
        ab.a(a2, "PREVIEW_PROPERTY_NAME", (String) l.a(shareOpenGraphContent.getPreviewPropertyName()).second);
        ab.a(a2, "ACTION_TYPE", shareOpenGraphContent.getAction().getActionType());
        ab.a(a2, "ACTION", jSONObject.toString());
        return a2;
    }

    private static Bundle a(ShareContent shareContent, boolean z) {
        Bundle bundle = new Bundle();
        ab.a(bundle, "LINK", shareContent.getContentUrl());
        ab.a(bundle, "PLACE", shareContent.getPlaceId());
        ab.a(bundle, "REF", shareContent.getRef());
        bundle.putBoolean("DATA_FAILURES_FATAL", z);
        List<String> peopleIds = shareContent.getPeopleIds();
        if (!ab.a(peopleIds)) {
            bundle.putStringArrayList("FRIENDS", new ArrayList<>(peopleIds));
        }
        ShareHashtag shareHashtag = shareContent.getShareHashtag();
        if (shareHashtag != null) {
            ab.a(bundle, "HASHTAG", shareHashtag.getHashtag());
        }
        return bundle;
    }
}
