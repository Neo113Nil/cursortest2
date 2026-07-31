package com.onesignal.user.internal;

/* loaded from: classes.dex */
public final class c extends i implements y3.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(w3.d model) {
        super(model);
        kotlin.jvm.internal.i.e(model, "model");
    }

    @Override // y3.a
    public String getEmail() {
        String address = getModel().getAddress();
        return com.onesignal.common.j.INSTANCE.isHashed(address) ? "" : address;
    }
}
