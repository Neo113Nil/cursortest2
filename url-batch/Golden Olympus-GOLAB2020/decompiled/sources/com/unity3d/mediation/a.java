package com.unity3d.mediation;

import W1.m;
import com.ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.LevelPlay;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f21972a = new a();

    @Metadata
    /* renamed from: com.unity3d.mediation.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0179a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21973a;

        static {
            int[] iArr = new int[LevelPlay.AdFormat.values().length];
            try {
                iArr[LevelPlay.AdFormat.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LevelPlay.AdFormat.REWARDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LevelPlay.AdFormat.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f21973a = iArr;
        }
    }

    private a() {
    }

    @NotNull
    public static final IronSource.AD_UNIT a(@NotNull LevelPlay.AdFormat adFormat) {
        Intrinsics.checkNotNullParameter(adFormat, "<this>");
        int i4 = C0179a.f21973a[adFormat.ordinal()];
        if (i4 == 1) {
            return IronSource.AD_UNIT.BANNER;
        }
        if (i4 == 2) {
            return IronSource.AD_UNIT.INTERSTITIAL;
        }
        if (i4 == 3) {
            return IronSource.AD_UNIT.REWARDED_VIDEO;
        }
        if (i4 == 4) {
            return IronSource.AD_UNIT.NATIVE_AD;
        }
        throw new m();
    }
}
