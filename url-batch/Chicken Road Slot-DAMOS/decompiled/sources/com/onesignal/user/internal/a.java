package com.onesignal.user.internal;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a extends d implements fd.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(dd.d dVar) {
        super(dVar);
        dVar.getClass();
    }

    @Override // fd.a
    public String getEmail() {
        return getModel().getAddress();
    }
}
