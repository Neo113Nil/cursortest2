package com.unity3d.ironsourceads;

import com.ironsource.mediationsdk.l;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class AdSize {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f21883a;

    /* renamed from: b, reason: collision with root package name */
    private final int f21884b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f21885c;

    @Metadata
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final AdSize banner() {
            return new AdSize(320, 50, l.f17627a, null);
        }

        @NotNull
        public final AdSize large() {
            return new AdSize(320, 90, l.f17628b, null);
        }

        @NotNull
        public final AdSize leaderboard() {
            return new AdSize(728, 90, l.f17630d, null);
        }

        @NotNull
        public final AdSize mediumRectangle() {
            return new AdSize(300, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED, l.f17633g, null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private AdSize(int i4, int i5, String str) {
        this.f21883a = i4;
        this.f21884b = i5;
        this.f21885c = str;
    }

    @NotNull
    public static final AdSize banner() {
        return Companion.banner();
    }

    @NotNull
    public static final AdSize large() {
        return Companion.large();
    }

    @NotNull
    public static final AdSize leaderboard() {
        return Companion.leaderboard();
    }

    @NotNull
    public static final AdSize mediumRectangle() {
        return Companion.mediumRectangle();
    }

    public final int getHeight() {
        return this.f21884b;
    }

    @NotNull
    public final String getSizeDescription() {
        return this.f21885c;
    }

    public final int getWidth() {
        return this.f21883a;
    }

    public /* synthetic */ AdSize(int i4, int i5, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(i4, i5, str);
    }
}
