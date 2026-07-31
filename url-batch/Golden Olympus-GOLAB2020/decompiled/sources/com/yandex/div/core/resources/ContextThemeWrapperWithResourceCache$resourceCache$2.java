package com.yandex.div.core.resources;

import android.content.res.Resources;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class ContextThemeWrapperWithResourceCache$resourceCache$2 extends s implements Function0<PrimitiveResourceCache> {
    final /* synthetic */ ContextThemeWrapperWithResourceCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContextThemeWrapperWithResourceCache$resourceCache$2(ContextThemeWrapperWithResourceCache contextThemeWrapperWithResourceCache) {
        super(0);
        this.this$0 = contextThemeWrapperWithResourceCache;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final PrimitiveResourceCache invoke() {
        Resources resources;
        resources = super/*androidx.appcompat.view.d*/.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "super.getResources()");
        return new PrimitiveResourceCache(resources);
    }
}
