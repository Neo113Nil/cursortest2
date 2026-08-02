package com.stripe.android.core.utils;

import android.app.Application;
import androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory;
import androidx.lifecycle.viewmodel.CreationExtras;
import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes8.dex */
public abstract class CreationExtrasKtxKt {
    public static final Application requireApplication(CreationExtras creationExtras) {
        creationExtras.getClass();
        Object obj = creationExtras.get(ViewModelProvider$AndroidViewModelFactory.APPLICATION_KEY);
        if (obj != null) {
            return (Application) obj;
        }
        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
        return null;
    }
}
