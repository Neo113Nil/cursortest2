package com.monetization.ads.mediation.base.initialize;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public interface MediatedAdapterInitializationResult {

    @Metadata
    public static final class Failure implements MediatedAdapterInitializationResult {
        private final int errorCode;

        @NotNull
        private final String errorMessage;

        public Failure(int i4, @NotNull String errorMessage) {
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            this.errorCode = i4;
            this.errorMessage = errorMessage;
        }

        public static /* synthetic */ Failure copy$default(Failure failure, int i4, String str, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                i4 = failure.errorCode;
            }
            if ((i5 & 2) != 0) {
                str = failure.errorMessage;
            }
            return failure.copy(i4, str);
        }

        public final int component1() {
            return this.errorCode;
        }

        @NotNull
        public final String component2() {
            return this.errorMessage;
        }

        @NotNull
        public final Failure copy(int i4, @NotNull String errorMessage) {
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            return new Failure(i4, errorMessage);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) obj;
            return this.errorCode == failure.errorCode && Intrinsics.areEqual(this.errorMessage, failure.errorMessage);
        }

        public final int getErrorCode() {
            return this.errorCode;
        }

        @NotNull
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public int hashCode() {
            return this.errorMessage.hashCode() + (Integer.hashCode(this.errorCode) * 31);
        }

        @NotNull
        public String toString() {
            return "Failure(errorCode=" + this.errorCode + ", errorMessage=" + this.errorMessage + ")";
        }
    }

    @Metadata
    public static final class Success implements MediatedAdapterInitializationResult {

        @NotNull
        public static final Success INSTANCE = new Success();

        private Success() {
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof Success);
        }

        public int hashCode() {
            return 287796421;
        }

        @NotNull
        public String toString() {
            return "Success";
        }
    }
}
