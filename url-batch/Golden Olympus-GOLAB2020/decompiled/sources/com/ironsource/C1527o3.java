package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.o3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1527o3 implements InterfaceC1534p3 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final IronSource.AD_UNIT f18466a;

    @Metadata
    /* renamed from: com.ironsource.o3$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18467a;

        static {
            int[] iArr = new int[IronSource.AD_UNIT.values().length];
            try {
                iArr[IronSource.AD_UNIT.INTERSTITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSource.AD_UNIT.REWARDED_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSource.AD_UNIT.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f18467a = iArr;
        }
    }

    public C1527o3(@NotNull IronSource.AD_UNIT adFormat) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        this.f18466a = adFormat;
    }

    @Override // com.ironsource.InterfaceC1534p3
    @NotNull
    public InterfaceC1541q3 a(@NotNull InterfaceC1504l3 eventBaseData) {
        Intrinsics.checkNotNullParameter(eventBaseData, "eventBaseData");
        int i4 = a.f18467a[this.f18466a.ordinal()];
        if (i4 == 1) {
            return new mj(eventBaseData);
        }
        if (i4 == 2) {
            return new yq(eventBaseData);
        }
        if (i4 == 3) {
            return new r6(eventBaseData);
        }
        throw new IllegalArgumentException("Unsupported ad format: " + this.f18466a);
    }
}
