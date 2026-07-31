package com.onevcat.uniwebview;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class g4 extends Lambda implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(int i, int i2) {
        super(1);
        this.a = i;
        this.b = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        s0 it = (s0) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        int i = this.a;
        int i2 = this.b;
        it.getClass();
        int max = Math.max(0, i);
        int max2 = Math.max(0, i2);
        ViewGroup.LayoutParams layoutParams = it.e.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.width = max;
        layoutParams2.height = max2;
        layoutParams2.gravity = 51;
        it.e.setLayoutParams(layoutParams2);
        b bVar = it.o;
        if (bVar != null) {
            bVar.g = max2;
        }
        return Unit.INSTANCE;
    }
}
