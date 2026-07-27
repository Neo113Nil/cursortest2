package com.appsflyer.internal.components.queue.exceptions;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
public final class CreateHttpCallException extends NoSuchElementException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateHttpCallException(String str) {
        super(str);
        Intrinsics.checkNotNullParameter(str, "");
    }
}
