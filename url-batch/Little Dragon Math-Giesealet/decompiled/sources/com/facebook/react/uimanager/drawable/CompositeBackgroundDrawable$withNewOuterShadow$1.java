package com.facebook.react.uimanager.drawable;

import android.graphics.drawable.LayerDrawable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.KMutableProperty0;

/* compiled from: CompositeBackgroundDrawable.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
/* synthetic */ class CompositeBackgroundDrawable$withNewOuterShadow$1 extends FunctionReferenceImpl implements Function1<LayerDrawable, Unit> {
    CompositeBackgroundDrawable$withNewOuterShadow$1(Object obj) {
        super(1, obj, KMutableProperty0.class, "set", "set(Ljava/lang/Object;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LayerDrawable layerDrawable) {
        invoke2(layerDrawable);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(LayerDrawable layerDrawable) {
        ((KMutableProperty0) this.receiver).set(layerDrawable);
    }
}
