package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class i8 {

    @Metadata
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16700a;

        static {
            int[] iArr = new int[n8.values().length];
            try {
                iArr[n8.Pacing.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n8.ShowCount.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n8.Delivery.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f16700a = iArr;
        }
    }

    public final int a(@NotNull n8 cappingType) {
        Intrinsics.checkNotNullParameter(cappingType, "cappingType");
        int i4 = a.f16700a[cappingType.ordinal()];
        if (i4 == 1 || i4 == 2) {
            return 3000;
        }
        if (i4 == 3) {
            return 3001;
        }
        throw new W1.m();
    }
}
