package com.squareup.cash.wallet.views.lifecycle;

import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.ValueInsets;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class WindowBoundLifecycleOwner extends LifecycleRegistry implements LifecycleOwner, DefaultLifecycleObserver, Function1 {
    public boolean boundsInWindow;
    public final WindowBoundLifecycleOwner lifecycle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowBoundLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super(lifecycleOwner, true);
        lifecycleOwner.getClass();
        lifecycleOwner.getClass();
        this.lifecycle = this;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.lifecycle;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
        layoutCoordinates.getClass();
        boolean isEmpty = ValueInsets.boundsInWindow(layoutCoordinates, true).isEmpty();
        this.boundsInWindow = !isEmpty;
        setCurrentState(!isEmpty ? Lifecycle.State.RESUMED : Lifecycle.State.STARTED);
        return Unit.INSTANCE;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
        setCurrentState(Lifecycle.State.STARTED);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        if (this.boundsInWindow) {
            setCurrentState(Lifecycle.State.RESUMED);
        }
    }
}
