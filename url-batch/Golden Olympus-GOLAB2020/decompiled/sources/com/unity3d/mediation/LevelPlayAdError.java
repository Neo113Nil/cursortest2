package com.unity3d.mediation;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class LevelPlayAdError {

    @NotNull
    public static final a Companion = new a(null);
    public static final int ERROR_CODE_INVALID_AD_UNIT_ID = 626;
    public static final int ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK = 625;
    public static final int ERROR_CODE_LOAD_FAILED_ALREADY_CALLED = 627;
    public static final int ERROR_CODE_LOAD_WHILE_SHOW = 629;
    public static final int ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED = 624;
    public static final int ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK = 628;
    public static final int ERROR_CODE_SHOW_WHILE_LOAD = 631;
    public static final int ERROR_CODE_SHOW_WHILE_SHOW = 630;

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final IronSourceError f21940a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f21941b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f21942c;

    @Metadata
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public LevelPlayAdError(@Nullable IronSourceError ironSourceError, @NotNull String adId, @Nullable String str) {
        Intrinsics.checkNotNullParameter(adId, "adId");
        this.f21940a = ironSourceError;
        this.f21941b = adId;
        this.f21942c = str;
    }

    @NotNull
    public final String getAdId() {
        return this.f21941b;
    }

    @Nullable
    public final String getAdUnitId() {
        return this.f21942c;
    }

    public final int getErrorCode() {
        IronSourceError ironSourceError = this.f21940a;
        if (ironSourceError != null) {
            return ironSourceError.getErrorCode();
        }
        return 0;
    }

    @NotNull
    public final String getErrorMessage() {
        IronSourceError ironSourceError = this.f21940a;
        String errorMessage = ironSourceError != null ? ironSourceError.getErrorMessage() : null;
        return errorMessage == null ? "" : errorMessage;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("adUnitId: ");
        sb.append(this.f21942c);
        sb.append(' ');
        IronSourceError ironSourceError = this.f21940a;
        sb.append(ironSourceError != null ? ironSourceError.toString() : null);
        return sb.toString();
    }

    public /* synthetic */ LevelPlayAdError(IronSourceError ironSourceError, String str, String str2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(ironSourceError, str, (i4 & 4) != 0 ? null : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayAdError(@NotNull String adId, @NotNull String adUnitId, int i4, @NotNull String errorMessage) {
        this(new IronSourceError(i4, errorMessage), adId, adUnitId);
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
    }
}
