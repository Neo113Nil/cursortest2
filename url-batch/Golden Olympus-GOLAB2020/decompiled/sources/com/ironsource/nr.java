package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class nr {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f18415c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f18416d = 2070;

    /* renamed from: e, reason: collision with root package name */
    public static final int f18417e = 2080;

    /* renamed from: f, reason: collision with root package name */
    public static final int f18418f = 2090;

    /* renamed from: g, reason: collision with root package name */
    public static final int f18419g = 2100;

    /* renamed from: h, reason: collision with root package name */
    public static final int f18420h = 2110;

    /* renamed from: a, reason: collision with root package name */
    private final int f18421a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f18422b;

    @Metadata
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public nr(int i4, @NotNull String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        this.f18421a = i4;
        this.f18422b = errorMessage;
    }

    public final int a() {
        return this.f18421a;
    }

    @NotNull
    public final String b() {
        return this.f18422b;
    }

    public final int c() {
        return this.f18421a;
    }

    @NotNull
    public final String d() {
        return this.f18422b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nr)) {
            return false;
        }
        nr nrVar = (nr) obj;
        return this.f18421a == nrVar.f18421a && Intrinsics.areEqual(this.f18422b, nrVar.f18422b);
    }

    public int hashCode() {
        return (Integer.hashCode(this.f18421a) * 31) + this.f18422b.hashCode();
    }

    @NotNull
    public String toString() {
        return "SdkError(errorCode=" + this.f18421a + ", errorMessage=" + this.f18422b + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public nr(@NotNull IronSourceError error) {
        this(r0, r3);
        Intrinsics.checkNotNullParameter(error, "error");
        int errorCode = error.getErrorCode();
        String errorMessage = error.getErrorMessage();
        Intrinsics.checkNotNullExpressionValue(errorMessage, "error.errorMessage");
    }

    @NotNull
    public final nr a(int i4, @NotNull String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        return new nr(i4, errorMessage);
    }

    public static /* synthetic */ nr a(nr nrVar, int i4, String str, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = nrVar.f18421a;
        }
        if ((i5 & 2) != 0) {
            str = nrVar.f18422b;
        }
        return nrVar.a(i4, str);
    }
}
