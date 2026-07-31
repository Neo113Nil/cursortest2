package com.onesignal.user.internal;

/* loaded from: classes.dex */
public class g extends i implements y3.b {
    private final com.onesignal.common.events.b changeHandlersNotifier;
    private y3.g savedState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(w3.d model) {
        super(model);
        kotlin.jvm.internal.i.e(model, "model");
        this.changeHandlersNotifier = new com.onesignal.common.events.b();
        this.savedState = fetchState();
    }

    private final y3.g fetchState() {
        return new y3.g(getId(), getToken(), getOptedIn());
    }

    @Override // y3.b
    public void addObserver(y3.c observer) {
        kotlin.jvm.internal.i.e(observer, "observer");
        this.changeHandlersNotifier.subscribe(observer);
    }

    public final com.onesignal.common.events.b getChangeHandlersNotifier() {
        return this.changeHandlersNotifier;
    }

    @Override // y3.b
    public boolean getOptedIn() {
        return getModel().getOptedIn() && getModel().getStatus() != w3.f.NO_PERMISSION;
    }

    public final y3.g getSavedState() {
        return this.savedState;
    }

    @Override // y3.b
    public String getToken() {
        return getModel().getAddress();
    }

    @Override // y3.b
    public void optIn() {
        com.onesignal.common.modeling.i.setBooleanProperty$default(getModel(), "optedIn", true, null, true, 4, null);
    }

    @Override // y3.b
    public void optOut() {
        getModel().setOptedIn(false);
    }

    public final y3.g refreshState() {
        y3.g fetchState = fetchState();
        this.savedState = fetchState;
        return fetchState;
    }

    @Override // y3.b
    public void removeObserver(y3.c observer) {
        kotlin.jvm.internal.i.e(observer, "observer");
        this.changeHandlersNotifier.unsubscribe(observer);
    }
}
