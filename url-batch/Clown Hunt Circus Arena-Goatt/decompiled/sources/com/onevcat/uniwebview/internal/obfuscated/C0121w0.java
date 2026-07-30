package com.onevcat.uniwebview.internal.obfuscated;

import android.graphics.RectF;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0121w0 extends Lambda implements Function1 {
    public static final C0121w0 a = new C0121w0();

    public C0121w0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        RectF rect = (RectF) obj;
        Intrinsics.checkNotNullParameter(rect, "rect");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, "(l=%.2f, t=%.2f, r=%.2f, b=%.2f)", Arrays.copyOf(new Object[]{Float.valueOf(rect.left), Float.valueOf(rect.top), Float.valueOf(rect.right), Float.valueOf(rect.bottom)}, 4));
        Intrinsics.checkNotNullExpressionValue(format, "format(locale, format, *args)");
        return format;
    }
}
