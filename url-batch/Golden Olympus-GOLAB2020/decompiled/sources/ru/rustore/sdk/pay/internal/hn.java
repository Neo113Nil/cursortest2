package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class hn {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final bk f44295a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final en f44296b;

    public hn(@NotNull bk sessionManager, @NotNull en mapper) {
        Intrinsics.checkNotNullParameter(sessionManager, "sessionManager");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f44295a = sessionManager;
        this.f44296b = mapper;
    }
}
