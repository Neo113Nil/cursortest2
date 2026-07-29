package com.facebook.share.internal;

/* compiled from: MessageDialogFeature.java */
/* loaded from: classes.dex */
public enum d implements com.facebook.internal.g {
    MESSAGE_DIALOG(20140204),
    PHOTOS(20140324),
    VIDEO(20141218);


    /* renamed from: d, reason: collision with root package name */
    private int f6351d;

    @Override // com.facebook.internal.g
    public String a() {
        return "com.facebook.platform.action.request.MESSAGE_DIALOG";
    }

    d(int i) {
        this.f6351d = i;
    }

    @Override // com.facebook.internal.g
    public int b() {
        return this.f6351d;
    }
}
