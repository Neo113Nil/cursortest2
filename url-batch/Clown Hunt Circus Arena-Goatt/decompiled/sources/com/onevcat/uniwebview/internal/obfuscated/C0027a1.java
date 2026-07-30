package com.onevcat.uniwebview.internal.obfuscated;

import android.graphics.Bitmap;
import android.graphics.Rect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.a1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0027a1 extends Lambda implements Function1 {
    public final /* synthetic */ Rect a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0027a1(Rect rect) {
        super(1);
        this.a = rect;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Bitmap a;
        com.onevcat.uniwebview.d it = (com.onevcat.uniwebview.d) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        Rect rect = this.a;
        if (it.z.getHeight() > 0 && it.z.getWidth() > 0 && (a = it.a(rect)) != null) {
            it.n = a;
        }
        return Unit.INSTANCE;
    }
}
