package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class bs {

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private static Boolean f15649b;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final bs f15648a = new bs();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static as f15650c = as.NOT_INIT;

    private bs() {
    }

    @NotNull
    public final synchronized as a() {
        return f15650c;
    }

    @NotNull
    public final as b() {
        Boolean bool = f15649b;
        if (bool == null ? true : Intrinsics.areEqual(bool, Boolean.FALSE)) {
            return as.NOT_INIT;
        }
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            return f15650c;
        }
        throw new W1.m();
    }

    public final synchronized void a(@NotNull as asVar) {
        Intrinsics.checkNotNullParameter(asVar, "<set-?>");
        f15650c = asVar;
    }

    public final void a(boolean z4) {
        f15649b = Boolean.valueOf(z4);
    }
}
