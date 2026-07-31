package com.onesignal.user.internal;

/* loaded from: classes.dex */
public abstract class i implements y3.e {
    private final w3.d model;

    public i(w3.d model) {
        kotlin.jvm.internal.i.e(model, "model");
        this.model = model;
    }

    @Override // y3.e
    public String getId() {
        return com.onesignal.common.d.INSTANCE.isLocalId(this.model.getId()) ? "" : this.model.getId();
    }

    public final w3.d getModel() {
        return this.model;
    }
}
