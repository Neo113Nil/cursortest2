package com.unity3d.mediation;

import android.content.Context;
import com.ironsource.C1462f3;
import com.ironsource.C1502l1;
import com.ironsource.mediationsdk.l;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class LevelPlayAdSize {

    /* renamed from: f, reason: collision with root package name */
    private static final int f21950f = 320;

    /* renamed from: g, reason: collision with root package name */
    private static final int f21951g = 50;

    /* renamed from: h, reason: collision with root package name */
    private static final int f21952h = 320;

    /* renamed from: i, reason: collision with root package name */
    private static final int f21953i = 90;

    /* renamed from: k, reason: collision with root package name */
    private static final int f21955k = 250;

    /* renamed from: m, reason: collision with root package name */
    private static final int f21957m = 90;

    /* renamed from: a, reason: collision with root package name */
    private int f21958a;

    /* renamed from: b, reason: collision with root package name */
    private int f21959b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f21960c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f21961d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private final LevelPlayAdSize f21962e;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final LevelPlayAdSize BANNER = new LevelPlayAdSize(320, 50, l.f17627a, false, null, 16, null);

    /* renamed from: j, reason: collision with root package name */
    private static final int f21954j = 300;

    @NotNull
    public static final LevelPlayAdSize MEDIUM_RECTANGLE = new LevelPlayAdSize(f21954j, 250, l.f17633g, false, null, 16, null);

    /* renamed from: l, reason: collision with root package name */
    private static final int f21956l = 728;

    @NotNull
    public static final LevelPlayAdSize LEADERBOARD = new LevelPlayAdSize(f21956l, 90, l.f17630d, false, null, 16, null);

    @NotNull
    public static final LevelPlayAdSize LARGE = new LevelPlayAdSize(320, 90, l.f17628b, false, null, 16, null);

    @Metadata
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ LevelPlayAdSize createAdaptiveAdSize$default(Companion companion, Context context, Integer num, int i4, Object obj) {
            if ((i4 & 2) != 0) {
                num = null;
            }
            return companion.createAdaptiveAdSize(context, num);
        }

        @NotNull
        public final LevelPlayAdSize createAdSize$mediationsdk_release(@NotNull String adSize) {
            Intrinsics.checkNotNullParameter(adSize, "adSize");
            int hashCode = adSize.hashCode();
            if (hashCode != -96588539) {
                if (hashCode != 72205083) {
                    if (hashCode != 446888797) {
                        if (hashCode == 1951953708 && adSize.equals(l.f17627a)) {
                            return LevelPlayAdSize.BANNER;
                        }
                    } else if (adSize.equals(l.f17630d)) {
                        return LevelPlayAdSize.LEADERBOARD;
                    }
                } else if (adSize.equals(l.f17628b)) {
                    return LevelPlayAdSize.LARGE;
                }
            } else if (adSize.equals(l.f17633g)) {
                return LevelPlayAdSize.MEDIUM_RECTANGLE;
            }
            throw new IllegalArgumentException("Wrong Ad Size");
        }

        @Nullable
        public final LevelPlayAdSize createAdaptiveAdSize(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return createAdaptiveAdSize$default(this, context, null, 2, null);
        }

        @NotNull
        public final LevelPlayAdSize createCustomBanner(int i4, int i5) {
            return createCustomSize(i4, i5);
        }

        @NotNull
        public final LevelPlayAdSize createCustomSize(int i4, int i5) {
            return new LevelPlayAdSize(i4, i5, l.f17632f, false, null, 16, null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final LevelPlayAdSize createAdaptiveAdSize(@NotNull Context context, @Nullable Integer num) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new C1462f3(new C1502l1()).a(context, num);
        }
    }

    public LevelPlayAdSize(int i4, int i5, @Nullable String str, boolean z4, @Nullable LevelPlayAdSize levelPlayAdSize) {
        this.f21958a = i4;
        this.f21959b = i5;
        this.f21960c = str;
        this.f21961d = z4;
        this.f21962e = levelPlayAdSize;
    }

    @Nullable
    public static final LevelPlayAdSize createAdaptiveAdSize(@NotNull Context context) {
        return Companion.createAdaptiveAdSize(context);
    }

    @NotNull
    public static final LevelPlayAdSize createCustomBanner(int i4, int i5) {
        return Companion.createCustomBanner(i4, i5);
    }

    @NotNull
    public static final LevelPlayAdSize createCustomSize(int i4, int i5) {
        return Companion.createCustomSize(i4, i5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(LevelPlayAdSize.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.unity3d.mediation.LevelPlayAdSize");
        LevelPlayAdSize levelPlayAdSize = (LevelPlayAdSize) obj;
        return this.f21958a == levelPlayAdSize.f21958a && this.f21959b == levelPlayAdSize.f21959b && Intrinsics.areEqual(this.f21960c, levelPlayAdSize.f21960c);
    }

    @NotNull
    public final String getDescription() {
        return String.valueOf(this.f21960c);
    }

    @Nullable
    public final LevelPlayAdSize getFallbackAdSize$mediationsdk_release() {
        return this.f21962e;
    }

    public final int getHeight() {
        return this.f21959b;
    }

    public final int getWidth() {
        return this.f21958a;
    }

    public int hashCode() {
        int i4 = ((this.f21958a * 31) + this.f21959b) * 31;
        String str = this.f21960c;
        return i4 + (str != null ? str.hashCode() : 0);
    }

    public final boolean isAdaptive() {
        return this.f21961d;
    }

    @NotNull
    public String toString() {
        return this.f21960c + ' ' + this.f21958a + 'x' + this.f21959b;
    }

    public /* synthetic */ LevelPlayAdSize(int i4, int i5, String str, boolean z4, LevelPlayAdSize levelPlayAdSize, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(i4, i5, (i6 & 4) != 0 ? null : str, z4, (i6 & 16) != 0 ? null : levelPlayAdSize);
    }

    @Nullable
    public static final LevelPlayAdSize createAdaptiveAdSize(@NotNull Context context, @Nullable Integer num) {
        return Companion.createAdaptiveAdSize(context, num);
    }
}
