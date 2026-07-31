package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.pay.model.Url;

/* loaded from: classes3.dex */
public final class vm extends Throwable {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Url f45145a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vm(@NotNull Url authUrl) {
        super("Unauthorized user can not purchase subscription", null);
        Intrinsics.checkNotNullParameter(authUrl, "authUrl");
        this.f45145a = authUrl;
    }
}
