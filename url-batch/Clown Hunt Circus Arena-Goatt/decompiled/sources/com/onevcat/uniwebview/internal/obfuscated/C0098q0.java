package com.onevcat.uniwebview.internal.obfuscated;

import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0098q0 extends Lambda implements Function1 {
    public static final C0098q0 a = new C0098q0();

    public C0098q0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String format = String.format("%02X", Arrays.copyOf(new Object[]{Byte.valueOf(((Number) obj).byteValue())}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(this, *args)");
        return format;
    }
}
