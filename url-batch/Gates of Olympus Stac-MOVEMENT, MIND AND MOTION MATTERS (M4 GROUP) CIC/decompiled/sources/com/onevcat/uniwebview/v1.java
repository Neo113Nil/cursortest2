package com.onevcat.uniwebview;

import android.graphics.Rect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class v1 extends Lambda implements Function1 {
    public final /* synthetic */ Rect a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(Rect rect) {
        super(1);
        this.a = rect;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        s0 it = (s0) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        Rect rect = this.a;
        if (it.e.getHeight() > 0 && it.e.getWidth() > 0) {
            it.n = it.a(rect);
        }
        return Unit.INSTANCE;
    }
}
