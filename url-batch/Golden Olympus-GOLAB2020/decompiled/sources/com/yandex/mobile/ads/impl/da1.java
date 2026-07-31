package com.yandex.mobile.ads.impl;

import a2.AbstractC1241b;
import android.content.Context;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o2.C3345o;
import o2.InterfaceC3343n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class da1 {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final qa2 f24528a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ca1 f24529b;

    public static final class a implements ra2 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3343n f24530a;

        a(C3345o c3345o) {
            this.f24530a = c3345o;
        }

        @Override // com.yandex.mobile.ads.impl.ra2
        public final void a() {
            InterfaceC3343n interfaceC3343n = this.f24530a;
            Result.Companion companion = Result.Companion;
            interfaceC3343n.resumeWith(Result.m243constructorimpl(Unit.f41027a));
        }
    }

    public /* synthetic */ da1(Context context, sa2 sa2Var) {
        this(context, sa2Var, sa2Var.a(context), new ca1());
    }

    public final void a() {
        qa2 qa2Var = this.f24528a;
        if (qa2Var != null) {
            qa2Var.a();
        }
    }

    @Nullable
    public final Object a(@NotNull h41 h41Var, @NotNull kotlin.coroutines.d dVar) {
        C3345o c3345o = new C3345o(AbstractC1241b.c(dVar), 1);
        c3345o.E();
        if (this.f24528a == null || !this.f24529b.a(h41Var)) {
            Result.Companion companion = Result.Companion;
            c3345o.resumeWith(Result.m243constructorimpl(Unit.f41027a));
        } else {
            this.f24528a.a(new a(c3345o));
        }
        Object y4 = c3345o.y();
        if (y4 == AbstractC1241b.f()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y4 == AbstractC1241b.f() ? y4 : Unit.f41027a;
    }

    public da1(@NotNull Context context, @NotNull sa2 verificationResourcesLoaderProvider, @Nullable qa2 qa2Var, @NotNull ca1 verificationPresenceValidator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(verificationResourcesLoaderProvider, "verificationResourcesLoaderProvider");
        Intrinsics.checkNotNullParameter(verificationPresenceValidator, "verificationPresenceValidator");
        this.f24528a = qa2Var;
        this.f24529b = verificationPresenceValidator;
    }
}
