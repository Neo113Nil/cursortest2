package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ud2 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final dr0 f33042a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final lo f33043b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final hu f33044c;

    public ud2(@NotNull dr0 link, @NotNull lo clickListenerCreator, @Nullable hu huVar) {
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(clickListenerCreator, "clickListenerCreator");
        this.f33042a = link;
        this.f33043b = clickListenerCreator;
        this.f33044c = huVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f33043b.a(this.f33044c != null ? new dr0(this.f33042a.a(), this.f33042a.c(), this.f33042a.d(), this.f33044c.c(), this.f33042a.b()) : this.f33042a).onClick(view);
    }
}
