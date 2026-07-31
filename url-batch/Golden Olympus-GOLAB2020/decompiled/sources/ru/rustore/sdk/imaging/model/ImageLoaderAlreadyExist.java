package ru.rustore.sdk.imaging.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes3.dex */
public final class ImageLoaderAlreadyExist extends Throwable {
    private final Throwable cause;
    private final String message;

    public /* synthetic */ ImageLoaderAlreadyExist(String str, Throwable th, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i4 & 2) != 0 ? null : th);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageLoaderAlreadyExist(String message, Throwable th) {
        super(message, th);
        Intrinsics.checkNotNullParameter(message, "message");
        this.message = message;
        this.cause = th;
    }
}
