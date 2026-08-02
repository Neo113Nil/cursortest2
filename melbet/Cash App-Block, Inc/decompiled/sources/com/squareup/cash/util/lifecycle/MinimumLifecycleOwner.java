package com.squareup.cash.util.lifecycle;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class MinimumLifecycleOwner implements LifecycleOwner, LifecycleEventObserver {
    public final LifecycleRegistry lifecycleRegistry;
    public final List owners;

    public MinimumLifecycleOwner(List list) {
        list.getClass();
        this.owners = list;
        this.lifecycleRegistry = new LifecycleRegistry(this, true);
        if (list.isEmpty()) {
            a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
            throw null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((LifecycleOwner) it.next()).getLifecycle().addObserver(this);
        }
        updateState$1$1();
    }

    public final String debugLog() {
        List<LifecycleOwner> list = this.owners;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (LifecycleOwner lifecycleOwner : list) {
            arrayList.add(lifecycleOwner instanceof MinimumLifecycleOwner ? ((MinimumLifecycleOwner) lifecycleOwner).debugLog() : lifecycleOwner + " " + lifecycleOwner.getLifecycle().getCurrentState());
        }
        return arrayList.toString();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.lifecycleRegistry;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        updateState$1$1();
    }

    public final void updateState$1$1() {
        List list = this.owners;
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            a$$ExternalSyntheticBUOutline0.m();
            return;
        }
        Lifecycle.State currentState = ((LifecycleOwner) it.next()).getLifecycle().getCurrentState();
        while (it.hasNext()) {
            Lifecycle.State currentState2 = ((LifecycleOwner) it.next()).getLifecycle().getCurrentState();
            if (currentState.compareTo(currentState2) > 0) {
                currentState = currentState2;
            }
        }
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        LifecycleRegistry lifecycleRegistry = this.lifecycleRegistry;
        if (currentState == state) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((LifecycleOwner) it2.next()).getLifecycle().removeObserver(this);
            }
            if (lifecycleRegistry.state == Lifecycle.State.INITIALIZED) {
                Timber.Forest.e(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Making an invalid transition from INITIALIZED to DESTROYED. Key: null. Current owners: ", debugLog(), "."), new Object[0]);
            }
        }
        lifecycleRegistry.setCurrentState(currentState);
    }
}
