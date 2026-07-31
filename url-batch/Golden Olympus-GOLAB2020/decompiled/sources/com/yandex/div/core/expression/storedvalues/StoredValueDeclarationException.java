package com.yandex.div.core.expression.storedvalues;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class StoredValueDeclarationException extends RuntimeException {
    public /* synthetic */ StoredValueDeclarationException(String str, Throwable th, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : str, (i4 & 2) != 0 ? null : th);
    }

    public StoredValueDeclarationException(@Nullable String str, @Nullable Throwable th) {
        super(str, th);
    }
}
