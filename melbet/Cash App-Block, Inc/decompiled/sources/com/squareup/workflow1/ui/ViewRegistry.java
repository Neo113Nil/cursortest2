package com.squareup.workflow1.ui;

import kotlin.jvm.internal.Reflection;

/* loaded from: classes8.dex */
public interface ViewRegistry {
    public static final Companion Companion = Companion.$$INSTANCE;

    public final class Companion extends ViewEnvironmentKey {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion(Reflection.factory.getOrCreateKotlinClass(ViewRegistry.class));

        @Override // com.squareup.workflow1.ui.ViewEnvironmentKey
        public final Object getDefault() {
            return new TypedViewRegistry(new ViewFactory[0]);
        }
    }
}
