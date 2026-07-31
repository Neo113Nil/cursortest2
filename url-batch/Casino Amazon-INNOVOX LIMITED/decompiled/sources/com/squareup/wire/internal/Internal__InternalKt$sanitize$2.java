package com.squareup.wire.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Internal.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class Internal__InternalKt$sanitize$2 extends FunctionReferenceImpl implements Function1<String, String> {
    public static final Internal__InternalKt$sanitize$2 INSTANCE = new Internal__InternalKt$sanitize$2();

    Internal__InternalKt$sanitize$2() {
        super(1, Internal__InternalKt.class, "sanitize", "sanitize(Ljava/lang/String;)Ljava/lang/String;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(String p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return Internal.sanitize(p0);
    }
}
