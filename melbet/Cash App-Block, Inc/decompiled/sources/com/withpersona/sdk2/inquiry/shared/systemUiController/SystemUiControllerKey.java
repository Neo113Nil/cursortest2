package com.withpersona.sdk2.inquiry.shared.systemUiController;

import com.squareup.workflow1.ui.ViewEnvironmentKey;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes9.dex */
public final class SystemUiControllerKey extends ViewEnvironmentKey {
    public static final SystemUiControllerKey INSTANCE = new SystemUiControllerKey(Reflection.factory.getOrCreateKotlinClass(SystemUiController.class));

    @Override // com.squareup.workflow1.ui.ViewEnvironmentKey
    public final Object getDefault() {
        throw new IllegalStateException("Unset");
    }
}
