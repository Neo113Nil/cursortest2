package com.facebook.share.internal;

import com.facebook.internal.ac;
import com.facebook.share.model.GameRequestContent;
import com.tapjoy.TJAdUnitConstants;

/* compiled from: GameRequestValidation.java */
/* loaded from: classes.dex */
public class b {
    public static void a(GameRequestContent gameRequestContent) {
        ac.a((Object) gameRequestContent.getMessage(), TJAdUnitConstants.String.MESSAGE);
        if ((gameRequestContent.getObjectId() != null) ^ (gameRequestContent.getActionType() == GameRequestContent.a.ASKFOR || gameRequestContent.getActionType() == GameRequestContent.a.SEND)) {
            throw new IllegalArgumentException("Object id should be provided if and only if action type is send or askfor");
        }
        int i = gameRequestContent.getRecipients() != null ? 1 : 0;
        if (gameRequestContent.getSuggestions() != null) {
            i++;
        }
        if (gameRequestContent.getFilters() != null) {
            i++;
        }
        if (i > 1) {
            throw new IllegalArgumentException("Parameters to, filters and suggestions are mutually exclusive");
        }
    }
}
