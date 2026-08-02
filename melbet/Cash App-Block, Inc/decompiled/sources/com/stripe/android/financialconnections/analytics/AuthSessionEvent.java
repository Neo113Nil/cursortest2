package com.stripe.android.financialconnections.analytics;

import com.datadog.trace.core.util.JsonObjectUtils;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import com.stripe.android.financialconnections.exception.WebAuthFlowFailedException;
import java.util.Date;
import java.util.Map;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public abstract class AuthSessionEvent {
    public final String name;
    public final Map rawEventDetails;

    public final class Cancel extends AuthSessionEvent {
        public final Date timestamp;

        public Cancel(Date date) {
            super("cancel");
            this.timestamp = date;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Cancel) && Intrinsics.areEqual(this.timestamp, ((Cancel) obj).timestamp);
        }

        @Override // com.stripe.android.financialconnections.analytics.AuthSessionEvent
        public final Date getTimestamp() {
            return this.timestamp;
        }

        public final int hashCode() {
            return this.timestamp.hashCode();
        }

        public final String toString() {
            return "Cancel(timestamp=" + this.timestamp + ")";
        }
    }

    public final class Failure extends AuthSessionEvent {
        public final Throwable error;
        public final Date timestamp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(Date date, WebAuthFlowFailedException webAuthFlowFailedException) {
            super("failure", MooncakeHeaderViewKt.filterNotNullValues(JsonObjectUtils.toEventParams(null, webAuthFlowFailedException)));
            webAuthFlowFailedException.getClass();
            this.timestamp = date;
            this.error = webAuthFlowFailedException;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) obj;
            return Intrinsics.areEqual(this.timestamp, failure.timestamp) && Intrinsics.areEqual(this.error, failure.error);
        }

        @Override // com.stripe.android.financialconnections.analytics.AuthSessionEvent
        public final Date getTimestamp() {
            return this.timestamp;
        }

        public final int hashCode() {
            return this.error.hashCode() + (this.timestamp.hashCode() * 31);
        }

        public final String toString() {
            return "Failure(timestamp=" + this.timestamp + ", error=" + this.error + ")";
        }
    }

    public final class Launched extends AuthSessionEvent {
        public final Date timestamp;

        public Launched(Date date) {
            super("launched");
            this.timestamp = date;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Launched) && Intrinsics.areEqual(this.timestamp, ((Launched) obj).timestamp);
        }

        @Override // com.stripe.android.financialconnections.analytics.AuthSessionEvent
        public final Date getTimestamp() {
            return this.timestamp;
        }

        public final int hashCode() {
            return this.timestamp.hashCode();
        }

        public final String toString() {
            return "Launched(timestamp=" + this.timestamp + ")";
        }
    }

    public final class Loaded extends AuthSessionEvent {
        public final Date timestamp;

        public Loaded(Date date) {
            super("loaded");
            this.timestamp = date;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loaded) && Intrinsics.areEqual(this.timestamp, ((Loaded) obj).timestamp);
        }

        @Override // com.stripe.android.financialconnections.analytics.AuthSessionEvent
        public final Date getTimestamp() {
            return this.timestamp;
        }

        public final int hashCode() {
            return this.timestamp.hashCode();
        }

        public final String toString() {
            return "Loaded(timestamp=" + this.timestamp + ")";
        }
    }

    public final class OAuthLaunched extends AuthSessionEvent {
        public final Date timestamp;

        public OAuthLaunched(Date date) {
            super("oauth-launched");
            this.timestamp = date;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OAuthLaunched) && Intrinsics.areEqual(this.timestamp, ((OAuthLaunched) obj).timestamp);
        }

        @Override // com.stripe.android.financialconnections.analytics.AuthSessionEvent
        public final Date getTimestamp() {
            return this.timestamp;
        }

        public final int hashCode() {
            return this.timestamp.hashCode();
        }

        public final String toString() {
            return "OAuthLaunched(timestamp=" + this.timestamp + ")";
        }
    }

    public final class Retry extends AuthSessionEvent {
        public final Date timestamp;

        public Retry(Date date) {
            super("retry");
            this.timestamp = date;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Retry) && Intrinsics.areEqual(this.timestamp, ((Retry) obj).timestamp);
        }

        @Override // com.stripe.android.financialconnections.analytics.AuthSessionEvent
        public final Date getTimestamp() {
            return this.timestamp;
        }

        public final int hashCode() {
            return this.timestamp.hashCode();
        }

        public final String toString() {
            return "Retry(timestamp=" + this.timestamp + ")";
        }
    }

    public final class Success extends AuthSessionEvent {
        public final Date timestamp;

        public Success(Date date) {
            super("success");
            this.timestamp = date;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.areEqual(this.timestamp, ((Success) obj).timestamp);
        }

        @Override // com.stripe.android.financialconnections.analytics.AuthSessionEvent
        public final Date getTimestamp() {
            return this.timestamp;
        }

        public final int hashCode() {
            return this.timestamp.hashCode();
        }

        public final String toString() {
            return "Success(timestamp=" + this.timestamp + ")";
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AuthSessionEvent(String str) {
        this(str, r0);
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
    }

    public abstract Date getTimestamp();

    public AuthSessionEvent(String str, Map map) {
        this.name = str;
        this.rawEventDetails = map;
    }
}
