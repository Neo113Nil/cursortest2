package com.onesignal.user.internal;

/* loaded from: classes.dex */
public final class h extends i implements y3.d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(w3.d model) {
        super(model);
        kotlin.jvm.internal.i.e(model, "model");
    }

    @Override // y3.d
    public String getNumber() {
        String address = getModel().getAddress();
        return com.onesignal.common.j.INSTANCE.isHashed(address) ? "" : address;
    }
}
