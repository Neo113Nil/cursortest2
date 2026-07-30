package com.onesignal.user.internal;

import a4.InterfaceC0178b;
import a4.InterfaceC0179c;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class g extends i implements InterfaceC0178b {
    private final com.onesignal.common.events.b changeHandlersNotifier;
    private a4.g savedState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Y3.d model) {
        super(model);
        Intrinsics.checkNotNullParameter(model, "model");
        this.changeHandlersNotifier = new com.onesignal.common.events.b();
        this.savedState = fetchState();
    }

    private final a4.g fetchState() {
        return new a4.g(getId(), getToken(), getOptedIn());
    }

    @Override // a4.InterfaceC0178b
    public void addObserver(InterfaceC0179c observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.changeHandlersNotifier.subscribe(observer);
    }

    public final com.onesignal.common.events.b getChangeHandlersNotifier() {
        return this.changeHandlersNotifier;
    }

    @Override // a4.InterfaceC0178b
    public boolean getOptedIn() {
        return getModel().getOptedIn() && getModel().getStatus() != Y3.f.NO_PERMISSION;
    }

    public final a4.g getSavedState() {
        return this.savedState;
    }

    @Override // a4.InterfaceC0178b
    public String getToken() {
        return getModel().getAddress();
    }

    @Override // a4.InterfaceC0178b
    public void optIn() {
        com.onesignal.common.modeling.i.setBooleanProperty$default(getModel(), "optedIn", true, null, true, 4, null);
    }

    @Override // a4.InterfaceC0178b
    public void optOut() {
        getModel().setOptedIn(false);
    }

    public final a4.g refreshState() {
        a4.g fetchState = fetchState();
        this.savedState = fetchState;
        return fetchState;
    }

    @Override // a4.InterfaceC0178b
    public void removeObserver(InterfaceC0179c observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.changeHandlersNotifier.unsubscribe(observer);
    }
}
