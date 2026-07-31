package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public abstract class cl {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1525o1 f15779a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private String f15780b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f15781c;

    public cl(@NotNull C1525o1 adTools) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        this.f15779a = adTools;
        this.f15780b = "";
    }

    @NotNull
    public final C1525o1 a() {
        return this.f15779a;
    }

    @NotNull
    public final String b() {
        return this.f15780b;
    }

    protected final boolean c() {
        return this.f15781c;
    }

    public abstract boolean d();

    public final void a(@NotNull C1460f1 adProperties) {
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        this.f15779a.e().a(new C1440c2(this.f15779a, adProperties, null, 4, null));
    }

    public final void b(@NotNull Runnable callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f15779a.e(callback);
    }

    public final void a(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.f15779a.d(runnable);
    }

    public final void a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f15780b = str;
    }

    protected final void a(boolean z4) {
        this.f15781c = z4;
    }
}
