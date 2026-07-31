package ru.rustore.sdk.reactive.subject;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public final class SubjectExtensionsKt {
    @NotNull
    public static final <T> StateSubject<T> asStateSubject(@NotNull MutableStateSubject<T> mutableStateSubject) {
        Intrinsics.checkNotNullParameter(mutableStateSubject, "<this>");
        return new ReadOnlyStateSubject(mutableStateSubject);
    }

    @NotNull
    public static final <T> Subject<T> asSubject(@NotNull MutableSubject<T> mutableSubject) {
        Intrinsics.checkNotNullParameter(mutableSubject, "<this>");
        return new ReadOnlySubject(mutableSubject);
    }

    @NotNull
    public static final <T> Subject<T> asSubject(@NotNull MutableStateSubject<T> mutableStateSubject) {
        Intrinsics.checkNotNullParameter(mutableStateSubject, "<this>");
        return new ReadOnlySubject(mutableStateSubject);
    }
}
