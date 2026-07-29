package com.facebook.share.internal;

/* compiled from: OpenGraphActionDialogFeature.java */
/* loaded from: classes.dex */
public enum f implements com.facebook.internal.g {
    OG_ACTION_DIALOG(20130618);


    /* renamed from: b, reason: collision with root package name */
    private int f6354b;

    @Override // com.facebook.internal.g
    public String a() {
        return "com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG";
    }

    f(int i) {
        this.f6354b = i;
    }

    @Override // com.facebook.internal.g
    public int b() {
        return this.f6354b;
    }
}
