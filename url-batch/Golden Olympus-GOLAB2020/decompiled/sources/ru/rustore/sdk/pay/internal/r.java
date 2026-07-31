package ru.rustore.sdk.pay.internal;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final e8 f44858a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final o f44859b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final w f44860c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final Context f44861d;

    public r(@NotNull e8 requestFactory, @NotNull o anonymousSessionHostProvider, @NotNull w appSignatureFactory, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(requestFactory, "requestFactory");
        Intrinsics.checkNotNullParameter(anonymousSessionHostProvider, "anonymousSessionHostProvider");
        Intrinsics.checkNotNullParameter(appSignatureFactory, "appSignatureFactory");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f44858a = requestFactory;
        this.f44859b = anonymousSessionHostProvider;
        this.f44860c = appSignatureFactory;
        this.f44861d = context;
    }
}
