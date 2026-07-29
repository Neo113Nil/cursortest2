package com.facebook.share.internal;

/* compiled from: OpenGraphMessageDialogFeature.java */
/* loaded from: classes.dex */
public enum h implements com.facebook.internal.g {
    OG_MESSAGE_DIALOG(20140204);


    /* renamed from: b, reason: collision with root package name */
    private int f6357b;

    @Override // com.facebook.internal.g
    public String a() {
        return "com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG";
    }

    h(int i) {
        this.f6357b = i;
    }

    @Override // com.facebook.internal.g
    public int b() {
        return this.f6357b;
    }
}
