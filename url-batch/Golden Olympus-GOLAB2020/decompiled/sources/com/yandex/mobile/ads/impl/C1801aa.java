package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.aa, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1801aa {
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        if (r1 == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
    
        if (r3 <= r1) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean a(@NotNull Context context, @NotNull vy1 sizeInfo, @NotNull vy1 containerSizeInfo) {
        boolean z4;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sizeInfo, "sizeInfo");
        Intrinsics.checkNotNullParameter(containerSizeInfo, "containerSizeInfo");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sizeInfo, "sizeInfo");
        Intrinsics.checkNotNullParameter(containerSizeInfo, "containerSizeInfo");
        int c4 = containerSizeInfo.c(context);
        int a4 = containerSizeInfo.a(context);
        int c5 = sizeInfo.c(context);
        int a5 = sizeInfo.a(context);
        int ordinal = containerSizeInfo.a().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        throw new W1.m();
                    }
                }
                z4 = true;
            }
            if (c5 <= c4) {
                if (c4 > 0) {
                    if (a5 > a4) {
                    }
                    z4 = true;
                }
            }
            z4 = false;
        } else {
            if (c5 <= c4) {
                if (c4 > 0) {
                }
            }
            z4 = false;
        }
        return z4 && b(context, sizeInfo);
    }

    public static final boolean b(@NotNull Context context, @NotNull vy1 adSize) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        return adSize.c(context) <= lh2.d(context) && adSize.a(context) <= lh2.b(context);
    }

    public static final boolean a(@NotNull Context context, @NotNull vy1 adSize) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        return adSize.c(context) <= lh2.b(context) && adSize.a(context) <= lh2.d(context);
    }
}
