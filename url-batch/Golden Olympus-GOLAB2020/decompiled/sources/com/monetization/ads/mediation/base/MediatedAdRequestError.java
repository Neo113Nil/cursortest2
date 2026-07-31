package com.monetization.ads.mediation.base;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class MediatedAdRequestError {

    /* renamed from: a, reason: collision with root package name */
    private final int f20735a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f20736b;

    @Metadata
    public static final class Code {

        @NotNull
        public static final Code INSTANCE = new Code();
        public static final int INTERNAL_ERROR = 1;
        public static final int INVALID_REQUEST = 2;
        public static final int NETWORK_ERROR = 3;
        public static final int NO_FILL = 4;
        public static final int SYSTEM_ERROR = 5;
        public static final int UNKNOWN_ERROR = 0;

        private Code() {
        }
    }

    public MediatedAdRequestError(int i4, @NotNull String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.f20735a = i4;
        this.f20736b = description;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(MediatedAdRequestError.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.monetization.ads.mediation.base.MediatedAdRequestError");
        MediatedAdRequestError mediatedAdRequestError = (MediatedAdRequestError) obj;
        if (this.f20735a != mediatedAdRequestError.f20735a) {
            return false;
        }
        return Intrinsics.areEqual(this.f20736b, mediatedAdRequestError.f20736b);
    }

    public final int getCode() {
        return this.f20735a;
    }

    @NotNull
    public final String getDescription() {
        return this.f20736b;
    }

    public int hashCode() {
        return this.f20736b.hashCode() + (this.f20735a * 31);
    }

    @NotNull
    public String toString() {
        return "AdRequestError (code: " + this.f20735a + ", description: " + this.f20736b + ")";
    }
}
