package com.squareup.util;

import coil3.ImageLoader$Builder$$ExternalSyntheticLambda1;
import kotlin.Lazy;
import kotlin.LazyKt;

/* loaded from: classes.dex */
public final class ForcedLazyKt$forcedLazy$1 implements Lazy {
    public final /* synthetic */ Lazy $$delegate_0;

    public ForcedLazyKt$forcedLazy$1(ImageLoader$Builder$$ExternalSyntheticLambda1 imageLoader$Builder$$ExternalSyntheticLambda1) {
        this.$$delegate_0 = LazyKt.lazy(imageLoader$Builder$$ExternalSyntheticLambda1);
    }

    @Override // kotlin.Lazy
    public final Object getValue() {
        return this.$$delegate_0.getValue();
    }

    @Override // kotlin.Lazy
    public final boolean isInitialized() {
        return this.$$delegate_0.isInitialized();
    }
}
