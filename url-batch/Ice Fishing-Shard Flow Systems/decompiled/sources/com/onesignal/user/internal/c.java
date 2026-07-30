package com.onesignal.user.internal;

import a4.InterfaceC0177a;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c extends i implements InterfaceC0177a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Y3.d model) {
        super(model);
        Intrinsics.checkNotNullParameter(model, "model");
    }

    @Override // a4.InterfaceC0177a
    public String getEmail() {
        String address = getModel().getAddress();
        return com.onesignal.common.j.INSTANCE.isHashed(address) ? "" : address;
    }
}
