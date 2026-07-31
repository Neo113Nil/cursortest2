package com.yandex.div.core.resources;

import W1.h;
import W1.i;
import android.content.Context;
import android.content.res.Resources;
import androidx.appcompat.view.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class ContextThemeWrapperWithResourceCache extends d {

    @NotNull
    private final h resourceCache$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextThemeWrapperWithResourceCache(@NotNull Context baseContext, int i4) {
        super(baseContext, i4);
        Intrinsics.checkNotNullParameter(baseContext, "baseContext");
        this.resourceCache$delegate = i.b(new ContextThemeWrapperWithResourceCache$resourceCache$2(this));
    }

    private final Resources getResourceCache() {
        return (Resources) this.resourceCache$delegate.getValue();
    }

    @Override // androidx.appcompat.view.d, android.content.ContextWrapper, android.content.Context
    @NotNull
    public Resources getResources() {
        return getResourceCache();
    }
}
