package com.withpersona.sdk2.inquiry.shared.di;

import androidx.lifecycle.AtomicReference;
import androidx.lifecycle.LegacySavedStateHandleController;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.SavedStateHandleController;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelProvider$OnRequeryFactory;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes8.dex */
public final class Factory extends ViewModelProvider$OnRequeryFactory implements ViewModelProvider$Factory {
    public final Function1 create;
    public final Lifecycle lifecycle;
    public final SavedStateRegistry savedStateRegistry;

    public Factory(SavedStateRegistryOwner savedStateRegistryOwner, Function1 function1) {
        savedStateRegistryOwner.getClass();
        function1.getClass();
        this.savedStateRegistry = savedStateRegistryOwner.getSavedStateRegistry();
        this.lifecycle = savedStateRegistryOwner.getLifecycle();
        this.create = function1;
    }

    @Override // androidx.lifecycle.ViewModelProvider$Factory
    public final ViewModel create(Class cls, CreationExtras creationExtras) {
        creationExtras.getClass();
        String str = (String) creationExtras.get(AtomicReference.VIEW_MODEL_KEY);
        if (str == null) {
            a$$ExternalSyntheticBUOutline0.m$1("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        Function1 function1 = this.create;
        SavedStateRegistry savedStateRegistry = this.savedStateRegistry;
        if (savedStateRegistry == null) {
            Object invoke = function1.invoke(SavedStateHandleSupport.createSavedStateHandle(creationExtras));
            invoke.getClass();
            return (ViewModel) invoke;
        }
        savedStateRegistry.getClass();
        Lifecycle lifecycle = this.lifecycle;
        lifecycle.getClass();
        SavedStateHandleController create = LegacySavedStateHandleController.create(savedStateRegistry, lifecycle, str, null);
        Object invoke2 = function1.invoke(create.handle);
        invoke2.getClass();
        ViewModel viewModel = (ViewModel) invoke2;
        viewModel.addCloseable("androidx.lifecycle.savedstate.vm.tag", create);
        return viewModel;
    }

    @Override // androidx.lifecycle.ViewModelProvider$OnRequeryFactory
    public final void onRequery(ViewModel viewModel) {
        SavedStateRegistry savedStateRegistry = this.savedStateRegistry;
        if (savedStateRegistry != null) {
            Lifecycle lifecycle = this.lifecycle;
            lifecycle.getClass();
            LegacySavedStateHandleController.attachHandleIfNeeded(viewModel, savedStateRegistry, lifecycle);
        }
    }

    @Override // androidx.lifecycle.ViewModelProvider$Factory
    public final ViewModel create(Class cls) {
        cls.getClass();
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            Lifecycle lifecycle = this.lifecycle;
            if (lifecycle != null) {
                SavedStateRegistry savedStateRegistry = this.savedStateRegistry;
                savedStateRegistry.getClass();
                lifecycle.getClass();
                SavedStateHandleController create = LegacySavedStateHandleController.create(savedStateRegistry, lifecycle, canonicalName, null);
                Object invoke = this.create.invoke(create.handle);
                invoke.getClass();
                ViewModel viewModel = (ViewModel) invoke;
                viewModel.addCloseable("androidx.lifecycle.savedstate.vm.tag", create);
                return viewModel;
            }
            a$$ExternalSyntheticBUOutline0.m("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }
        a$$ExternalSyntheticBUOutline0.m$3("Local and anonymous classes can not be ViewModels");
        return null;
    }
}
