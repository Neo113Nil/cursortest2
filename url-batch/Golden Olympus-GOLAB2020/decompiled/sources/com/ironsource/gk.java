package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class gk {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final gk f16528a = new gk();

    private gk() {
    }

    public static final <T> T a(@Nullable T t4, T t5) {
        return t4 == null ? t5 : t4;
    }

    public static final boolean a(@Nullable Object obj) {
        return a(obj, null, false, 6, null);
    }

    public static final boolean a(@Nullable Object obj, @NotNull String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        return a(obj, errorMessage, false, 4, null);
    }

    public static final boolean a(@Nullable Object obj, @NotNull String errorMessage, boolean z4) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        if (obj != null) {
            return true;
        }
        if (z4) {
            throw new NullPointerException(errorMessage);
        }
        if (z4) {
            throw new W1.m();
        }
        IronLog.API.error(errorMessage);
        return false;
    }

    public static /* synthetic */ boolean a(Object obj, String str, boolean z4, int i4, Object obj2) {
        if ((i4 & 2) != 0) {
            str = "reference is null";
        }
        if ((i4 & 4) != 0) {
            z4 = false;
        }
        return a(obj, str, z4);
    }
}
