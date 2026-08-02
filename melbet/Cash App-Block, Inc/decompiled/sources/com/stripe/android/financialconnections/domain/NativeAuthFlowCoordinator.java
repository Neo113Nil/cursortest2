package com.stripe.android.financialconnections.domain;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.stripe.android.financialconnections.navigation.topappbar.TopAppBarStateUpdate;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;

/* loaded from: classes9.dex */
public final class NativeAuthFlowCoordinator {
    public final SharedFlowImpl flow = FlowKt.MutableSharedFlow$default(0, 0, null, 7);

    /* loaded from: classes8.dex */
    public interface Message {

        public final class ClearPartnerWebAuth implements Message {
            public static final ClearPartnerWebAuth INSTANCE = new ClearPartnerWebAuth();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ClearPartnerWebAuth);
            }

            public final int hashCode() {
                return -1111515148;
            }

            public final String toString() {
                return "ClearPartnerWebAuth";
            }
        }

        public final class CloseWithError implements Message {
            public final Throwable cause;

            public CloseWithError(Throwable th) {
                th.getClass();
                this.cause = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CloseWithError) && Intrinsics.areEqual(this.cause, ((CloseWithError) obj).cause);
            }

            public final int hashCode() {
                return this.cause.hashCode();
            }

            public final String toString() {
                return NavAction$$ExternalSyntheticOutline0.m("CloseWithError(cause=", ")", this.cause);
            }
        }

        public final class Complete implements Message {
            public final EarlyTerminationCause cause;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class EarlyTerminationCause {
                public static final /* synthetic */ EarlyTerminationCause[] $VALUES;
                public static final EarlyTerminationCause USER_INITIATED_WITH_CUSTOM_MANUAL_ENTRY;

                static {
                    EarlyTerminationCause earlyTerminationCause = new EarlyTerminationCause("USER_INITIATED_WITH_CUSTOM_MANUAL_ENTRY", 0);
                    USER_INITIATED_WITH_CUSTOM_MANUAL_ENTRY = earlyTerminationCause;
                    $VALUES = new EarlyTerminationCause[]{earlyTerminationCause};
                }

                public static EarlyTerminationCause valueOf(String str) {
                    return (EarlyTerminationCause) Enum.valueOf(EarlyTerminationCause.class, str);
                }

                public static EarlyTerminationCause[] values() {
                    return (EarlyTerminationCause[]) $VALUES.clone();
                }
            }

            public Complete(EarlyTerminationCause earlyTerminationCause) {
                this.cause = earlyTerminationCause;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Complete) && this.cause == ((Complete) obj).cause;
            }

            public final int hashCode() {
                EarlyTerminationCause earlyTerminationCause = this.cause;
                if (earlyTerminationCause == null) {
                    return 0;
                }
                return earlyTerminationCause.hashCode();
            }

            public final String toString() {
                return "Complete(cause=" + this.cause + ")";
            }
        }

        public final class UpdateTopAppBar implements Message {
            public final TopAppBarStateUpdate update;

            public UpdateTopAppBar(TopAppBarStateUpdate topAppBarStateUpdate) {
                this.update = topAppBarStateUpdate;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UpdateTopAppBar) && this.update.equals(((UpdateTopAppBar) obj).update);
            }

            public final int hashCode() {
                return this.update.hashCode();
            }

            public final String toString() {
                return "UpdateTopAppBar(update=" + this.update + ")";
            }
        }
    }
}
