package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class tk {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final zn f45045a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final bk f45046b;

    public tk(@NotNull zn webSessionFactory, @NotNull bk sessionManager) {
        Intrinsics.checkNotNullParameter(webSessionFactory, "webSessionFactory");
        Intrinsics.checkNotNullParameter(sessionManager, "sessionManager");
        this.f45045a = webSessionFactory;
        this.f45046b = sessionManager;
    }
}
