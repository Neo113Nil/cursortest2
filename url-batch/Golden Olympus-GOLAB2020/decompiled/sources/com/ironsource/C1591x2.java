package com.ironsource;

import com.ironsource.ge;
import com.ironsource.mediationsdk.IronSource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.x2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1591x2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C1591x2 f20268a = new C1591x2();

    @Metadata
    /* renamed from: com.ironsource.x2$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20269a;

        static {
            int[] iArr = new int[IronSource.AD_UNIT.values().length];
            try {
                iArr[IronSource.AD_UNIT.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSource.AD_UNIT.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSource.AD_UNIT.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IronSource.AD_UNIT.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f20269a = iArr;
        }
    }

    private C1591x2() {
    }

    @NotNull
    public static final ge.a a(@NotNull IronSource.AD_UNIT adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        int i4 = a.f20269a[adUnit.ordinal()];
        if (i4 == 1) {
            return ge.a.REWARDED_VIDEO;
        }
        if (i4 == 2) {
            return ge.a.INTERSTITIAL;
        }
        if (i4 == 3) {
            return ge.a.BANNER;
        }
        if (i4 == 4) {
            return ge.a.NATIVE_AD;
        }
        throw new W1.m();
    }
}
