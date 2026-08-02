package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import androidx.lifecycle.SavedStateHandle;
import com.squareup.scannerview.TextSetter;
import com.withpersona.sdk2.inquiry.FallbackMode;
import com.withpersona.sdk2.inquiry.internal.Environment;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes9.dex */
public final class FallbackModeModule_EnvironmentFactory implements Factory {
    public final /* synthetic */ int $r8$classId;
    public final TextSetter module;

    public /* synthetic */ FallbackModeModule_EnvironmentFactory(TextSetter textSetter, int i) {
        this.$r8$classId = i;
        this.module = textSetter;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i = this.$r8$classId;
        TextSetter textSetter = this.module;
        switch (i) {
            case 0:
                return (Environment) textSetter.textSwitcher;
            case 1:
                FallbackMode fallbackMode = (FallbackMode) textSetter.textView;
                Preconditions.checkNotNullFromProvides(fallbackMode);
                return fallbackMode;
            default:
                SavedStateHandle savedStateHandle = (SavedStateHandle) textSetter.scannerText;
                Preconditions.checkNotNullFromProvides(savedStateHandle);
                return savedStateHandle;
        }
    }
}
