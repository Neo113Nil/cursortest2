package ru.rustore.sdk.pay.internal;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class fi {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f44130a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final x0 f44131b;

    public fi(@NotNull Context context, @NotNull d1 authorizedSessionProvider, @NotNull x0 authorizedSessionDeserializer) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(authorizedSessionProvider, "authorizedSessionProvider");
        Intrinsics.checkNotNullParameter(authorizedSessionDeserializer, "authorizedSessionDeserializer");
        this.f44130a = context;
        this.f44131b = authorizedSessionDeserializer;
    }
}
