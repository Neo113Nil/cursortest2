package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.internal.Utility;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.SharePhotoContent;
import defpackage.ah0;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class LegacyNativeDialogParameters {
    public static final LegacyNativeDialogParameters INSTANCE = new LegacyNativeDialogParameters();

    private LegacyNativeDialogParameters() {
    }

    public static final Bundle create(UUID uuid, ShareContent<?, ?> shareContent, boolean z) {
        uuid.getClass();
        shareContent.getClass();
        if (shareContent instanceof ShareLinkContent) {
            return INSTANCE.create((ShareLinkContent) shareContent, z);
        }
        if (!(shareContent instanceof SharePhotoContent)) {
            return null;
        }
        SharePhotoContent sharePhotoContent = (SharePhotoContent) shareContent;
        List<String> photoUrls = ShareInternalUtility.getPhotoUrls(sharePhotoContent, uuid);
        if (photoUrls == null) {
            photoUrls = ah0.m;
        }
        return INSTANCE.create(sharePhotoContent, photoUrls, z);
    }

    private final Bundle createBaseParameters(ShareContent<?, ?> shareContent, boolean z) {
        Bundle bundle = new Bundle();
        Utility.putUri(bundle, ShareConstants.LEGACY_LINK, shareContent.getContentUrl());
        Utility.putNonEmptyString(bundle, ShareConstants.LEGACY_PLACE_TAG, shareContent.getPlaceId());
        Utility.putNonEmptyString(bundle, ShareConstants.LEGACY_REF, shareContent.getRef());
        bundle.putBoolean(ShareConstants.LEGACY_DATA_FAILURES_FATAL, z);
        List<String> peopleIds = shareContent.getPeopleIds();
        if (peopleIds != null && !peopleIds.isEmpty()) {
            bundle.putStringArrayList(ShareConstants.LEGACY_FRIEND_TAGS, new ArrayList<>(peopleIds));
        }
        return bundle;
    }

    private final Bundle create(ShareLinkContent shareLinkContent, boolean z) {
        return createBaseParameters(shareLinkContent, z);
    }

    private final Bundle create(SharePhotoContent sharePhotoContent, List<String> list, boolean z) {
        Bundle createBaseParameters = createBaseParameters(sharePhotoContent, z);
        createBaseParameters.putStringArrayList(ShareConstants.LEGACY_PHOTOS, new ArrayList<>(list));
        return createBaseParameters;
    }
}
