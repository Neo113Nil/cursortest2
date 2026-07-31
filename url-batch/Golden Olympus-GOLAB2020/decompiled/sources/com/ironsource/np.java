package com.ironsource;

import com.ironsource.ag;
import com.unity3d.mediation.LevelPlay;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class np implements ag, ag.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final j8 f18401a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final pa f18402b;

    @Metadata
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18403a;

        static {
            int[] iArr = new int[n8.values().length];
            try {
                iArr[n8.Delivery.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n8.Pacing.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n8.ShowCount.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f18403a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public np() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.ironsource.ag
    @NotNull
    public synchronized l8 a(@NotNull String placementName, @NotNull LevelPlay.AdFormat adFormat) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        String a4 = new sp(placementName, adFormat).a();
        l8 a5 = this.f18402b.a(a4);
        if (a5.d()) {
            return a5;
        }
        return this.f18401a.a(a4);
    }

    @Override // com.ironsource.ag.a
    public synchronized void b(@NotNull String placementName, @NotNull LevelPlay.AdFormat adFormat) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        String a4 = new sp(placementName, adFormat).a();
        if (!this.f18402b.a(a4).d()) {
            this.f18401a.b(a4);
        }
    }

    public np(@NotNull j8 cappingService, @NotNull pa deliveryHandler) {
        Intrinsics.checkNotNullParameter(cappingService, "cappingService");
        Intrinsics.checkNotNullParameter(deliveryHandler, "deliveryHandler");
        this.f18401a = cappingService;
        this.f18402b = deliveryHandler;
    }

    @Override // com.ironsource.ag.a
    @NotNull
    public synchronized Object a(@NotNull String placementName, @NotNull LevelPlay.AdFormat adFormat, @NotNull n8 cappingType, @NotNull ef cappingConfig) {
        Object a4;
        try {
            Intrinsics.checkNotNullParameter(placementName, "placementName");
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            Intrinsics.checkNotNullParameter(cappingType, "cappingType");
            Intrinsics.checkNotNullParameter(cappingConfig, "cappingConfig");
            String a5 = new sp(placementName, adFormat).a();
            int i4 = a.f18403a[cappingType.ordinal()];
            if (i4 != 1) {
                if (i4 != 2 && i4 != 3) {
                    throw new W1.m();
                }
                a4 = this.f18401a.a(a5, cappingType, cappingConfig);
            } else {
                a4 = this.f18402b.a(a5, cappingType, cappingConfig);
            }
        } catch (Throwable th) {
            throw th;
        }
        return a4;
    }

    public /* synthetic */ np(j8 j8Var, pa paVar, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? new j8(null, null, null, 7, null) : j8Var, (i4 & 2) != 0 ? new pa() : paVar);
    }
}
