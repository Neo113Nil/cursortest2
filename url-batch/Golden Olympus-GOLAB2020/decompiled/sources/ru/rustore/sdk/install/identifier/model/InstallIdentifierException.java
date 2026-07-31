package ru.rustore.sdk.install.identifier.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public abstract class InstallIdentifierException extends Throwable {

    @Nullable
    private final Throwable cause;

    @NotNull
    private final String message;

    @Metadata
    public static final class ClientAlreadyExist extends InstallIdentifierException {

        @Nullable
        private final Throwable cause;

        @NotNull
        private final String message;

        public /* synthetic */ ClientAlreadyExist(String str, Throwable th, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i4 & 2) != 0 ? null : th);
        }

        public static /* synthetic */ ClientAlreadyExist copy$default(ClientAlreadyExist clientAlreadyExist, String str, Throwable th, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = clientAlreadyExist.message;
            }
            if ((i4 & 2) != 0) {
                th = clientAlreadyExist.cause;
            }
            return clientAlreadyExist.copy(str, th);
        }

        @NotNull
        public final String component1() {
            return this.message;
        }

        @Nullable
        public final Throwable component2() {
            return this.cause;
        }

        @NotNull
        public final ClientAlreadyExist copy(@NotNull String message, @Nullable Throwable th) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new ClientAlreadyExist(message, th);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClientAlreadyExist)) {
                return false;
            }
            ClientAlreadyExist clientAlreadyExist = (ClientAlreadyExist) obj;
            return Intrinsics.areEqual(this.message, clientAlreadyExist.message) && Intrinsics.areEqual(this.cause, clientAlreadyExist.cause);
        }

        @Override // ru.rustore.sdk.install.identifier.model.InstallIdentifierException, java.lang.Throwable
        @Nullable
        public Throwable getCause() {
            return this.cause;
        }

        @Override // ru.rustore.sdk.install.identifier.model.InstallIdentifierException, java.lang.Throwable
        @NotNull
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            int hashCode = this.message.hashCode() * 31;
            Throwable th = this.cause;
            return hashCode + (th == null ? 0 : th.hashCode());
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "ClientAlreadyExist(message=" + this.message + ", cause=" + this.cause + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClientAlreadyExist(@NotNull String message, @Nullable Throwable th) {
            super(message, th, null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
            this.cause = th;
        }
    }

    @Metadata
    public static final class ClientNotCreated extends InstallIdentifierException {

        @Nullable
        private final Throwable cause;

        @NotNull
        private final String message;

        public /* synthetic */ ClientNotCreated(String str, Throwable th, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i4 & 2) != 0 ? null : th);
        }

        public static /* synthetic */ ClientNotCreated copy$default(ClientNotCreated clientNotCreated, String str, Throwable th, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = clientNotCreated.message;
            }
            if ((i4 & 2) != 0) {
                th = clientNotCreated.cause;
            }
            return clientNotCreated.copy(str, th);
        }

        @NotNull
        public final String component1() {
            return this.message;
        }

        @Nullable
        public final Throwable component2() {
            return this.cause;
        }

        @NotNull
        public final ClientNotCreated copy(@NotNull String message, @Nullable Throwable th) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new ClientNotCreated(message, th);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClientNotCreated)) {
                return false;
            }
            ClientNotCreated clientNotCreated = (ClientNotCreated) obj;
            return Intrinsics.areEqual(this.message, clientNotCreated.message) && Intrinsics.areEqual(this.cause, clientNotCreated.cause);
        }

        @Override // ru.rustore.sdk.install.identifier.model.InstallIdentifierException, java.lang.Throwable
        @Nullable
        public Throwable getCause() {
            return this.cause;
        }

        @Override // ru.rustore.sdk.install.identifier.model.InstallIdentifierException, java.lang.Throwable
        @NotNull
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            int hashCode = this.message.hashCode() * 31;
            Throwable th = this.cause;
            return hashCode + (th == null ? 0 : th.hashCode());
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "ClientNotCreated(message=" + this.message + ", cause=" + this.cause + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClientNotCreated(@NotNull String message, @Nullable Throwable th) {
            super(message, th, null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
            this.cause = th;
        }
    }

    public /* synthetic */ InstallIdentifierException(String str, Throwable th, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, th);
    }

    @Override // java.lang.Throwable
    @Nullable
    public Throwable getCause() {
        return this.cause;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String getMessage() {
        return this.message;
    }

    public /* synthetic */ InstallIdentifierException(String str, Throwable th, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i4 & 2) != 0 ? null : th, null);
    }

    private InstallIdentifierException(String str, Throwable th) {
        super(str, th);
        this.message = str;
        this.cause = th;
    }
}
