package com.squareup.workflow1.ui.androidx;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.internal.SavedStateRegistryImpl;
import coil3.ImageLoader$Builder$$ExternalSyntheticLambda1;

/* loaded from: classes9.dex */
public final class KeyedSavedStateRegistryOwner implements SavedStateRegistryOwner, LifecycleOwner {
    public final /* synthetic */ LifecycleOwner $$delegate_0;
    public final SavedStateRegistryController controller = new SavedStateRegistryController(new SavedStateRegistryImpl(this, new ImageLoader$Builder$$ExternalSyntheticLambda1(this, 18)));
    public final String key;

    public KeyedSavedStateRegistryOwner(String str, LifecycleOwner lifecycleOwner) {
        this.key = str;
        this.$$delegate_0 = lifecycleOwner;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.$$delegate_0.getLifecycle();
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    public final SavedStateRegistry getSavedStateRegistry() {
        SavedStateRegistry savedStateRegistry = this.controller.savedStateRegistry;
        savedStateRegistry.getClass();
        return savedStateRegistry;
    }
}
