package com.onesignal.user.internal;

import a4.InterfaceC0181e;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class i implements InterfaceC0181e {
    private final Y3.d model;

    public i(Y3.d model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.model = model;
    }

    @Override // a4.InterfaceC0181e
    public String getId() {
        return com.onesignal.common.d.INSTANCE.isLocalId(this.model.getId()) ? "" : this.model.getId();
    }

    public final Y3.d getModel() {
        return this.model;
    }
}
