package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class rl {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f44935a;

    public rl(@NotNull String emailValue) {
        Intrinsics.checkNotNullParameter(emailValue, "emailValue");
        this.f44935a = emailValue;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rl) && Intrinsics.areEqual(this.f44935a, ((rl) obj).f44935a);
    }

    public final int hashCode() {
        return this.f44935a.hashCode();
    }

    @NotNull
    public final String toString() {
        return i1.a(new StringBuilder("SuccessReceiptSendingState(emailValue="), this.f44935a, ')');
    }
}
