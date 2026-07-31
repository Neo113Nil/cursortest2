package com.yandex.mobile.ads.impl;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class l70 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<k70> f28445a;

    public /* synthetic */ l70(jb2 jb2Var) {
        this(jb2Var, jb2Var.a());
    }

    public final boolean a() {
        Intrinsics.checkNotNullParameter("ad_system", "type");
        Intrinsics.checkNotNullParameter("adfox", "value");
        List<k70> list = this.f28445a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (k70 k70Var : list) {
            if (Intrinsics.areEqual(k70Var.a(), "ad_system") && Intrinsics.areEqual(k70Var.b(), "adfox")) {
                return true;
            }
        }
        return false;
    }

    public l70(@NotNull jb2 videoAdExtensions, @NotNull List<k70> extensions) {
        Intrinsics.checkNotNullParameter(videoAdExtensions, "videoAdExtensions");
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        this.f28445a = extensions;
    }
}
