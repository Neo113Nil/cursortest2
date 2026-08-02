package com.squareup.wire.internal;

import androidx.room.TransactorKt;
import com.squareup.util.cash.Countries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes8.dex */
public final /* synthetic */ class Internal__InternalKt$sanitize$2 extends FunctionReferenceImpl implements Function1 {
    public static final Internal__InternalKt$sanitize$2 INSTANCE = new Internal__InternalKt$sanitize$2(1, Countries.class, "sanitize", "sanitize(Ljava/lang/String;)Ljava/lang/String;", 1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str = (String) obj;
        str.getClass();
        return TransactorKt.sanitize(str);
    }
}
