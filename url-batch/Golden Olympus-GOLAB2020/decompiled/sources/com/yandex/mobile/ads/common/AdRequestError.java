package com.yandex.mobile.ads.common;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class AdRequestError {

    /* renamed from: a, reason: collision with root package name */
    private final int f22421a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f22422b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f22423c;

    @Metadata
    public static final class Code {
        public static final int INTERNAL_ERROR = 1;
        public static final int INVALID_REQUEST = 2;
        public static final int NETWORK_ERROR = 3;
        public static final int NO_FILL = 4;
        public static final int SYSTEM_ERROR = 5;
        public static final int UNKNOWN_ERROR = 0;

        static {
            new Code();
        }

        private Code() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdRequestError(int i4, @NotNull String description) {
        this(i4, description, null, 4, null);
        Intrinsics.checkNotNullParameter(description, "description");
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(AdRequestError.class, obj.getClass())) {
            return false;
        }
        AdRequestError adRequestError = (AdRequestError) obj;
        if (this.f22421a == adRequestError.f22421a && Intrinsics.areEqual(this.f22423c, adRequestError.f22423c)) {
            return Intrinsics.areEqual(this.f22422b, adRequestError.f22422b);
        }
        return false;
    }

    @Nullable
    public final String getAdUnitId() {
        return this.f22423c;
    }

    public final int getCode() {
        return this.f22421a;
    }

    @NotNull
    public final String getDescription() {
        return this.f22422b;
    }

    public int hashCode() {
        int hashCode = ((this.f22422b.hashCode() * 31) + this.f22421a) * 31;
        String str = this.f22423c;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i4 = this.f22421a;
        String str = this.f22422b;
        String str2 = this.f22423c;
        if (str2 == null) {
            str2 = "";
        }
        return "AdRequestError (code: " + i4 + ", description: " + str + ", adUnitId: " + str2 + ")";
    }

    public AdRequestError(int i4, @NotNull String description, @Nullable String str) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.f22421a = i4;
        this.f22422b = description;
        this.f22423c = str;
    }

    public /* synthetic */ AdRequestError(int i4, String str, String str2, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i4, str, (i5 & 4) != 0 ? null : str2);
    }
}
