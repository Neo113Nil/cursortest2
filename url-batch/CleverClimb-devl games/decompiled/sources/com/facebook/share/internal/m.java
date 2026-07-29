package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.internal.ab;
import com.facebook.share.model.GameRequestContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareHashtag;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphContent;
import com.tapjoy.TJAdUnitConstants;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WebDialogParameters.java */
/* loaded from: classes.dex */
public class m {
    public static Bundle a(GameRequestContent gameRequestContent) {
        Bundle bundle = new Bundle();
        ab.a(bundle, TJAdUnitConstants.String.MESSAGE, gameRequestContent.getMessage());
        ab.a(bundle, TJAdUnitConstants.String.SPLIT_VIEW_TRIGGER_TO, gameRequestContent.getRecipients());
        ab.a(bundle, TJAdUnitConstants.String.TITLE, gameRequestContent.getTitle());
        ab.a(bundle, "data", gameRequestContent.getData());
        if (gameRequestContent.getActionType() != null) {
            ab.a(bundle, "action_type", gameRequestContent.getActionType().toString().toLowerCase(Locale.ENGLISH));
        }
        ab.a(bundle, "object_id", gameRequestContent.getObjectId());
        if (gameRequestContent.getFilters() != null) {
            ab.a(bundle, "filters", gameRequestContent.getFilters().toString().toLowerCase(Locale.ENGLISH));
        }
        ab.a(bundle, "suggestions", gameRequestContent.getSuggestions());
        return bundle;
    }

    public static Bundle a(ShareLinkContent shareLinkContent) {
        Bundle a2 = a((ShareContent) shareLinkContent);
        ab.a(a2, "href", shareLinkContent.getContentUrl());
        ab.a(a2, "quote", shareLinkContent.getQuote());
        return a2;
    }

    public static Bundle a(ShareOpenGraphContent shareOpenGraphContent) {
        Bundle a2 = a((ShareContent) shareOpenGraphContent);
        ab.a(a2, "action_type", shareOpenGraphContent.getAction().getActionType());
        try {
            JSONObject a3 = l.a(l.a(shareOpenGraphContent), false);
            if (a3 != null) {
                ab.a(a2, "action_properties", a3.toString());
            }
            return a2;
        } catch (JSONException e) {
            throw new com.facebook.j("Unable to serialize the ShareOpenGraphContent to JSON", e);
        }
    }

    public static Bundle a(ShareContent shareContent) {
        Bundle bundle = new Bundle();
        ShareHashtag shareHashtag = shareContent.getShareHashtag();
        if (shareHashtag != null) {
            ab.a(bundle, "hashtag", shareHashtag.getHashtag());
        }
        return bundle;
    }

    public static Bundle b(ShareLinkContent shareLinkContent) {
        Bundle bundle = new Bundle();
        ab.a(bundle, "name", shareLinkContent.getContentTitle());
        ab.a(bundle, "description", shareLinkContent.getContentDescription());
        ab.a(bundle, "link", ab.a(shareLinkContent.getContentUrl()));
        ab.a(bundle, "picture", ab.a(shareLinkContent.getImageUrl()));
        ab.a(bundle, "quote", shareLinkContent.getQuote());
        if (shareLinkContent.getShareHashtag() != null) {
            ab.a(bundle, "hashtag", shareLinkContent.getShareHashtag().getHashtag());
        }
        return bundle;
    }

    public static Bundle a(ShareFeedContent shareFeedContent) {
        Bundle bundle = new Bundle();
        ab.a(bundle, TJAdUnitConstants.String.SPLIT_VIEW_TRIGGER_TO, shareFeedContent.getToId());
        ab.a(bundle, "link", shareFeedContent.getLink());
        ab.a(bundle, "picture", shareFeedContent.getPicture());
        ab.a(bundle, "source", shareFeedContent.getMediaSource());
        ab.a(bundle, "name", shareFeedContent.getLinkName());
        ab.a(bundle, "caption", shareFeedContent.getLinkCaption());
        ab.a(bundle, "description", shareFeedContent.getLinkDescription());
        return bundle;
    }
}
