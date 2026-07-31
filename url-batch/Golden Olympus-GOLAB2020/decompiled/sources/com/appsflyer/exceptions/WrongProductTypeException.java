package com.appsflyer.exceptions;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
public final class WrongProductTypeException extends IllegalArgumentException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrongProductTypeException(String str) {
        super(str);
        Intrinsics.checkNotNullParameter(str, "");
    }
}
