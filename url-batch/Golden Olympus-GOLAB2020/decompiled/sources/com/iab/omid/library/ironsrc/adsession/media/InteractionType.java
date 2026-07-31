package com.iab.omid.library.ironsrc.adsession.media;

import com.ironsource.c9;

/* loaded from: classes.dex */
public enum InteractionType {
    CLICK(c9.f15700d),
    INVITATION_ACCEPTED("invitationAccept");

    String interactionType;

    InteractionType(String str) {
        this.interactionType = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.interactionType;
    }
}
