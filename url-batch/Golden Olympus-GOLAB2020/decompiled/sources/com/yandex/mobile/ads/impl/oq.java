package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class oq implements r00 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final r00[] f30151a;

    public oq(@NotNull r00... designConstraints) {
        Intrinsics.checkNotNullParameter(designConstraints, "designConstraints");
        this.f30151a = designConstraints;
    }

    @Override // com.yandex.mobile.ads.impl.r00
    public final boolean a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        for (r00 r00Var : this.f30151a) {
            if (!r00Var.a(context)) {
                return false;
            }
        }
        return true;
    }
}
