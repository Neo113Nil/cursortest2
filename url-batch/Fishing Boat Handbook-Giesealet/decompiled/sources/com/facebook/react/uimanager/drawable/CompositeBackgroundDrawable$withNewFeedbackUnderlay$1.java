package com.facebook.react.uimanager.drawable;

import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.KMutableProperty0;

/* compiled from: CompositeBackgroundDrawable.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
/* synthetic */ class CompositeBackgroundDrawable$withNewFeedbackUnderlay$1 extends FunctionReferenceImpl implements Function1<Drawable, Unit> {
    CompositeBackgroundDrawable$withNewFeedbackUnderlay$1(Object obj) {
        super(1, obj, KMutableProperty0.class, "set", "set(Ljava/lang/Object;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Drawable drawable) {
        invoke2(drawable);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Drawable drawable) {
        ((KMutableProperty0) this.receiver).set(drawable);
    }
}
