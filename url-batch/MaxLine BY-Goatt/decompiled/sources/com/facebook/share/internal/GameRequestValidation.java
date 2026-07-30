package com.facebook.share.internal;

import com.facebook.internal.Validate;
import com.facebook.share.model.GameRequestContent;
import defpackage.lh;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class GameRequestValidation {
    public static void validate(GameRequestContent gameRequestContent) {
        Validate.notNull(gameRequestContent.getMessage(), "message");
        if ((gameRequestContent.getObjectId() != null) ^ (gameRequestContent.getActionType() == GameRequestContent.ActionType.ASKFOR || gameRequestContent.getActionType() == GameRequestContent.ActionType.SEND)) {
            lh.e("Object id should be provided if and only if action type is send or askfor");
            return;
        }
        int i = gameRequestContent.getRecipients() != null ? 1 : 0;
        if (gameRequestContent.getSuggestions() != null) {
            i++;
        }
        if (gameRequestContent.getFilters() != null) {
            i++;
        }
        if (i <= 1) {
            return;
        }
        lh.e("Parameters to, filters and suggestions are mutually exclusive");
    }
}
