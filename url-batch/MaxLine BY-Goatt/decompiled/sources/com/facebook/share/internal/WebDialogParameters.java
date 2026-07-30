package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.internal.Utility;
import com.facebook.share.model.AppGroupCreationContent;
import com.facebook.share.model.GameRequestContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareHashtag;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import defpackage.ah0;
import defpackage.rv;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class WebDialogParameters {
    public static final WebDialogParameters INSTANCE = new WebDialogParameters();

    private WebDialogParameters() {
    }

    public static final Bundle create(GameRequestContent gameRequestContent) {
        String str;
        String obj;
        String obj2;
        gameRequestContent.getClass();
        Bundle bundle = new Bundle();
        Utility.putNonEmptyString(bundle, "message", gameRequestContent.getMessage());
        Utility.putCommaSeparatedStringList(bundle, "to", gameRequestContent.getRecipients());
        Utility.putNonEmptyString(bundle, "title", gameRequestContent.getTitle());
        Utility.putNonEmptyString(bundle, "data", gameRequestContent.getData());
        GameRequestContent.ActionType actionType = gameRequestContent.getActionType();
        String str2 = null;
        if (actionType == null || (obj2 = actionType.toString()) == null) {
            str = null;
        } else {
            Locale locale = Locale.ENGLISH;
            locale.getClass();
            str = obj2.toLowerCase(locale);
            str.getClass();
        }
        Utility.putNonEmptyString(bundle, ShareConstants.WEB_DIALOG_PARAM_ACTION_TYPE, str);
        Utility.putNonEmptyString(bundle, "object_id", gameRequestContent.getObjectId());
        GameRequestContent.Filters filters = gameRequestContent.getFilters();
        if (filters != null && (obj = filters.toString()) != null) {
            Locale locale2 = Locale.ENGLISH;
            locale2.getClass();
            str2 = obj.toLowerCase(locale2);
            str2.getClass();
        }
        Utility.putNonEmptyString(bundle, "filters", str2);
        Utility.putCommaSeparatedStringList(bundle, ShareConstants.WEB_DIALOG_PARAM_SUGGESTIONS, gameRequestContent.getSuggestions());
        return bundle;
    }

    public static final Bundle createBaseParameters(ShareContent<?, ?> shareContent) {
        shareContent.getClass();
        Bundle bundle = new Bundle();
        ShareHashtag shareHashtag = shareContent.getShareHashtag();
        Utility.putNonEmptyString(bundle, ShareConstants.WEB_DIALOG_PARAM_HASHTAG, shareHashtag != null ? shareHashtag.getHashtag() : null);
        return bundle;
    }

    public static final Bundle createForFeed(ShareFeedContent shareFeedContent) {
        shareFeedContent.getClass();
        Bundle bundle = new Bundle();
        Utility.putNonEmptyString(bundle, "to", shareFeedContent.getToId());
        Utility.putNonEmptyString(bundle, "link", shareFeedContent.getLink());
        Utility.putNonEmptyString(bundle, "picture", shareFeedContent.getPicture());
        Utility.putNonEmptyString(bundle, "source", shareFeedContent.getMediaSource());
        Utility.putNonEmptyString(bundle, "name", shareFeedContent.getLinkName());
        Utility.putNonEmptyString(bundle, ShareConstants.FEED_CAPTION_PARAM, shareFeedContent.getLinkCaption());
        Utility.putNonEmptyString(bundle, "description", shareFeedContent.getLinkDescription());
        return bundle;
    }

    public static final Bundle createForFeed(ShareLinkContent shareLinkContent) {
        shareLinkContent.getClass();
        Bundle bundle = new Bundle();
        Utility.putNonEmptyString(bundle, "link", Utility.getUriString(shareLinkContent.getContentUrl()));
        Utility.putNonEmptyString(bundle, ShareConstants.WEB_DIALOG_PARAM_QUOTE, shareLinkContent.getQuote());
        ShareHashtag shareHashtag = shareLinkContent.getShareHashtag();
        Utility.putNonEmptyString(bundle, ShareConstants.WEB_DIALOG_PARAM_HASHTAG, shareHashtag != null ? shareHashtag.getHashtag() : null);
        return bundle;
    }

    public static final Bundle create(AppGroupCreationContent appGroupCreationContent) {
        String str;
        String obj;
        appGroupCreationContent.getClass();
        Bundle bundle = new Bundle();
        Utility.putNonEmptyString(bundle, "name", appGroupCreationContent.getName());
        Utility.putNonEmptyString(bundle, "description", appGroupCreationContent.getDescription());
        AppGroupCreationContent.AppGroupPrivacy appGroupPrivacy = appGroupCreationContent.getAppGroupPrivacy();
        if (appGroupPrivacy == null || (obj = appGroupPrivacy.toString()) == null) {
            str = null;
        } else {
            Locale locale = Locale.ENGLISH;
            locale.getClass();
            str = obj.toLowerCase(locale);
            str.getClass();
        }
        Utility.putNonEmptyString(bundle, ShareConstants.WEB_DIALOG_PARAM_PRIVACY, str);
        return bundle;
    }

    public static final Bundle create(ShareLinkContent shareLinkContent) {
        shareLinkContent.getClass();
        Bundle createBaseParameters = createBaseParameters(shareLinkContent);
        Utility.putUri(createBaseParameters, ShareConstants.WEB_DIALOG_PARAM_HREF, shareLinkContent.getContentUrl());
        Utility.putNonEmptyString(createBaseParameters, ShareConstants.WEB_DIALOG_PARAM_QUOTE, shareLinkContent.getQuote());
        return createBaseParameters;
    }

    public static final Bundle create(SharePhotoContent sharePhotoContent) {
        sharePhotoContent.getClass();
        Bundle createBaseParameters = createBaseParameters(sharePhotoContent);
        List<SharePhoto> photos = sharePhotoContent.getPhotos();
        if (photos == null) {
            photos = ah0.m;
        }
        ArrayList arrayList = new ArrayList(rv.l(photos, 10));
        Iterator<T> it = photos.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((SharePhoto) it.next()).getImageUrl()));
        }
        createBaseParameters.putStringArray(ShareConstants.WEB_DIALOG_PARAM_MEDIA, (String[]) arrayList.toArray(new String[0]));
        return createBaseParameters;
    }
}
