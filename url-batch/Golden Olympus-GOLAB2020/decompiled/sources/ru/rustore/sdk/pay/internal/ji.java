package ru.rustore.sdk.pay.internal;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.user.profile.UserProfileProvider;

/* loaded from: classes3.dex */
public final class ji {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f44388a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final UserProfileProvider f44389b;

    public ji(@NotNull Context context, @NotNull UserProfileProvider provider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f44388a = context;
        this.f44389b = provider;
    }
}
