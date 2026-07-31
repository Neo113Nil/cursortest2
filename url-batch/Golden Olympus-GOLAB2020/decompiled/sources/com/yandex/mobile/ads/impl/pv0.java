package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class pv0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final nv0 f30585a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C1956gl f30586b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ pv0(Context context) {
        this(context, r0, new C1956gl(r0));
        nv0 a4 = new co1(context).a();
    }

    @Nullable
    public final mv0 a(@NotNull hu creative) {
        Intrinsics.checkNotNullParameter(creative, "creative");
        double d4 = -1.0d;
        mv0 mv0Var = null;
        for (mv0 mv0Var2 : creative.h()) {
            double d5 = Intrinsics.areEqual("video/mp4", mv0Var2.e()) ? 1.5d : 1.0d;
            int a4 = this.f30586b.a(mv0Var2);
            int a5 = this.f30585a.a();
            double abs = d5 / ((((int) Math.max(0.0d, a4)) < 100 ? 10.0d : ((int) Math.abs(a5 - r4)) / a5) + 1.0d);
            if (abs > d4) {
                mv0Var = mv0Var2;
                d4 = abs;
            }
        }
        return mv0Var;
    }

    public pv0(@NotNull Context context, @NotNull nv0 referenceMediaFileInfo, @NotNull C1956gl bitrateProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(referenceMediaFileInfo, "referenceMediaFileInfo");
        Intrinsics.checkNotNullParameter(bitrateProvider, "bitrateProvider");
        this.f30585a = referenceMediaFileInfo;
        this.f30586b = bitrateProvider;
    }
}
