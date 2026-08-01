package com.onesignal.user.internal;

import com.onesignal.common.modeling.i;
import fd.g;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class b extends d implements fd.b {
    private final com.onesignal.common.events.b changeHandlersNotifier;
    private g savedState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(dd.d dVar) {
        super(dVar);
        dVar.getClass();
        this.changeHandlersNotifier = new com.onesignal.common.events.b();
        this.savedState = fetchState();
    }

    private final g fetchState() {
        return new g(getId(), getToken(), getOptedIn());
    }

    @Override // fd.b
    public void addObserver(fd.c cVar) {
        cVar.getClass();
        this.changeHandlersNotifier.subscribe(cVar);
    }

    public final com.onesignal.common.events.b getChangeHandlersNotifier() {
        return this.changeHandlersNotifier;
    }

    @Override // fd.b
    public boolean getOptedIn() {
        return getModel().getOptedIn() && getModel().getStatus() != dd.f.NO_PERMISSION;
    }

    public final g getSavedState() {
        return this.savedState;
    }

    @Override // fd.b
    public String getToken() {
        return getModel().getAddress();
    }

    @Override // fd.b
    public void optIn() {
        i.setBooleanProperty$default(getModel(), "optedIn", true, null, true, 4, null);
    }

    @Override // fd.b
    public void optOut() {
        getModel().setOptedIn(false);
    }

    public final g refreshState() {
        g fetchState = fetchState();
        this.savedState = fetchState;
        return fetchState;
    }

    @Override // fd.b
    public void removeObserver(fd.c cVar) {
        cVar.getClass();
        this.changeHandlersNotifier.unsubscribe(cVar);
    }
}
