package com.squareup.workflow1.ui.androidx;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class RealWorkflowLifecycleOwner implements LifecycleOwner, View.OnAttachStateChangeListener, LifecycleEventObserver {
    public boolean destroyOnDetach;
    public final Function1 findParentLifecycle;
    public boolean hasBeenDestroyed;
    public final LifecycleRegistry localLifecycle;
    public Lifecycle parentLifecycle;
    public View view;

    public RealWorkflowLifecycleOwner(Function1 function1) {
        function1.getClass();
        this.findParentLifecycle = function1;
        this.localLifecycle = new LifecycleRegistry(this, true);
    }

    public final void destroyOnDetach() {
        if (this.destroyOnDetach) {
            return;
        }
        this.destroyOnDetach = true;
        View view = this.view;
        updateLifecycle$wf1_core_android(view == null ? false : view.isAttachedToWindow());
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.localLifecycle;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        View view = this.view;
        updateLifecycle$wf1_core_android(view == null ? false : view.isAttachedToWindow());
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getClass();
        if (this.localLifecycle.state == Lifecycle.State.DESTROYED || this.hasBeenDestroyed) {
            return;
        }
        this.view = view;
        Lifecycle lifecycle = this.parentLifecycle;
        Lifecycle lifecycle2 = (Lifecycle) this.findParentLifecycle.invoke(view);
        this.parentLifecycle = lifecycle2;
        if (lifecycle2 != lifecycle) {
            if (lifecycle != null) {
                lifecycle.removeObserver(this);
            }
            Lifecycle lifecycle3 = this.parentLifecycle;
            if (lifecycle3 != null) {
                lifecycle3.addObserver(this);
            }
        }
        updateLifecycle$wf1_core_android(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getClass();
        updateLifecycle$wf1_core_android(false);
    }

    public final void updateLifecycle$wf1_core_android(boolean z) {
        Lifecycle lifecycle = this.parentLifecycle;
        Lifecycle.State currentState = lifecycle == null ? null : lifecycle.getCurrentState();
        LifecycleRegistry lifecycleRegistry = this.localLifecycle;
        Lifecycle.State state = lifecycleRegistry.state;
        state.getClass();
        Lifecycle.State state2 = Lifecycle.State.DESTROYED;
        if (state == state2 || this.hasBeenDestroyed) {
            this.view = null;
            return;
        }
        if (this.destroyOnDetach && !z) {
            currentState = state2;
        } else if (currentState == null && state != (currentState = Lifecycle.State.INITIALIZED)) {
            a$$ExternalSyntheticBUOutline0.m$1((Object) "Must have a parent lifecycle after attaching and until being destroyed.");
            return;
        }
        if (currentState == state2) {
            this.hasBeenDestroyed = true;
            Lifecycle lifecycle2 = this.parentLifecycle;
            if (lifecycle2 != null) {
                lifecycle2.removeObserver(this);
            }
            this.parentLifecycle = null;
            View view = this.view;
            if (view != null) {
                this.view = null;
                view.removeOnAttachStateChangeListener(this);
            }
            Lifecycle.State state3 = Lifecycle.State.INITIALIZED;
            if (state == state3) {
                state2 = state3;
            }
        } else {
            state2 = currentState;
        }
        lifecycleRegistry.setCurrentState(state2);
    }
}
