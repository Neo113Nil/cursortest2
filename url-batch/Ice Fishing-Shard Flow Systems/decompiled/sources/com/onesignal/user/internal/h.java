package com.onesignal.user.internal;

import a4.InterfaceC0180d;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h extends i implements InterfaceC0180d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Y3.d model) {
        super(model);
        Intrinsics.checkNotNullParameter(model, "model");
    }

    @Override // a4.InterfaceC0180d
    public String getNumber() {
        String address = getModel().getAddress();
        return com.onesignal.common.j.INSTANCE.isHashed(address) ? "" : address;
    }
}
