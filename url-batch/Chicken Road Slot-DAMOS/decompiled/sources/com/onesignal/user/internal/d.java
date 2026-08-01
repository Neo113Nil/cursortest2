package com.onesignal.user.internal;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class d implements fd.e {
    private final dd.d model;

    public d(dd.d dVar) {
        dVar.getClass();
        this.model = dVar;
    }

    @Override // fd.e
    public String getId() {
        return com.onesignal.common.d.INSTANCE.isLocalId(this.model.getId()) ? "" : this.model.getId();
    }

    public final dd.d getModel() {
        return this.model;
    }
}
