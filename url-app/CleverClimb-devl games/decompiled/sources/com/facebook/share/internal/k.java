package com.facebook.share.internal;

/* compiled from: ShareDialogFeature.java */
/* loaded from: classes.dex */
public enum k implements com.facebook.internal.g {
    SHARE_DIALOG(20130618),
    PHOTOS(20140204),
    VIDEO(20141028),
    MULTIMEDIA(20160327),
    HASHTAG(20160327),
    LINK_SHARE_QUOTES(20160327);

    private int g;

    @Override // com.facebook.internal.g
    public String a() {
        return "com.facebook.platform.action.request.FEED_DIALOG";
    }

    k(int i) {
        this.g = i;
    }

    @Override // com.facebook.internal.g
    public int b() {
        return this.g;
    }
}
