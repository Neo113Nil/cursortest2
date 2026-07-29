package com.facebook.share.internal;

/* compiled from: AppInviteDialogFeature.java */
/* loaded from: classes.dex */
public enum a implements com.facebook.internal.g {
    APP_INVITES_DIALOG(20140701);


    /* renamed from: b, reason: collision with root package name */
    private int f6347b;

    @Override // com.facebook.internal.g
    public String a() {
        return "com.facebook.platform.action.request.APPINVITES_DIALOG";
    }

    a(int i) {
        this.f6347b = i;
    }

    @Override // com.facebook.internal.g
    public int b() {
        return this.f6347b;
    }
}
