package com.squareup.cash.ui;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.internal.SavedStateRegistryImpl;
import coil3.ImageLoader$Builder$$ExternalSyntheticLambda1;

/* loaded from: classes.dex */
public final class ContainerLifecycle implements LifecycleOwner, SavedStateRegistryOwner {
    public final LifecycleRegistry lifecycleRegistry;
    public final SavedStateRegistryController savedStateRegistryController;

    public ContainerLifecycle(Bundle bundle) {
        LifecycleRegistry lifecycleRegistry = new LifecycleRegistry(this, true);
        this.lifecycleRegistry = lifecycleRegistry;
        SavedStateRegistryController savedStateRegistryController = new SavedStateRegistryController(new SavedStateRegistryImpl(this, new ImageLoader$Builder$$ExternalSyntheticLambda1(this, 18)));
        savedStateRegistryController.performRestore(bundle);
        this.savedStateRegistryController = savedStateRegistryController;
        lifecycleRegistry.setCurrentState(Lifecycle.State.RESUMED);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.lifecycleRegistry;
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.savedStateRegistryController.savedStateRegistry;
    }
}
