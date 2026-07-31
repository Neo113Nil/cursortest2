package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.e4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1891e4 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final String f25085a = "yandex_ad_info";

    @Nullable
    public static String a(@NotNull jb2 videoAdExtensions) {
        Object obj;
        Intrinsics.checkNotNullParameter(videoAdExtensions, "videoAdExtensions");
        Iterator<T> it = videoAdExtensions.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((k70) obj).a(), f25085a)) {
                break;
            }
        }
        k70 k70Var = (k70) obj;
        if (k70Var != null) {
            return k70Var.b();
        }
        return null;
    }
}
