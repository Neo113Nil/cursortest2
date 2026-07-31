package dev.hyo.openiap.store;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OpenIapStore.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Ldev/hyo/openiap/store/IapOperationResult;", "", "<init>", "()V", "Success", "Failure", "Cancelled", "Ldev/hyo/openiap/store/IapOperationResult$Cancelled;", "Ldev/hyo/openiap/store/IapOperationResult$Failure;", "Ldev/hyo/openiap/store/IapOperationResult$Success;", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class IapOperationResult {
    public static final int $stable = 0;

    public /* synthetic */ IapOperationResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: OpenIapStore.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldev/hyo/openiap/store/IapOperationResult$Success;", "Ldev/hyo/openiap/store/IapOperationResult;", "<init>", "()V", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Success extends IapOperationResult {
        public static final int $stable = 0;
        public static final Success INSTANCE = new Success();

        private Success() {
            super(null);
        }
    }

    private IapOperationResult() {
    }

    /* compiled from: OpenIapStore.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Ldev/hyo/openiap/store/IapOperationResult$Failure;", "Ldev/hyo/openiap/store/IapOperationResult;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Failure extends IapOperationResult {
        public static final int $stable = 0;
        private final String message;

        public static /* synthetic */ Failure copy$default(Failure failure, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = failure.message;
            }
            return failure.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final Failure copy(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new Failure(message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Failure) && Intrinsics.areEqual(this.message, ((Failure) other).message);
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return "Failure(message=" + this.message + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(String message) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
        }

        public final String getMessage() {
            return this.message;
        }
    }

    /* compiled from: OpenIapStore.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldev/hyo/openiap/store/IapOperationResult$Cancelled;", "Ldev/hyo/openiap/store/IapOperationResult;", "<init>", "()V", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Cancelled extends IapOperationResult {
        public static final int $stable = 0;
        public static final Cancelled INSTANCE = new Cancelled();

        private Cancelled() {
            super(null);
        }
    }
}
