package com.stripe.android.payments.core.authentication.threeds2;

import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.payments.PaymentFlowResult$Unvalidated;
import com.stripe.android.stripe3ds2.transaction.InitChallengeArgs;

/* loaded from: classes8.dex */
public abstract class NextStep {

    public final class Complete extends NextStep {
        public final PaymentFlowResult$Unvalidated result;

        public Complete(PaymentFlowResult$Unvalidated paymentFlowResult$Unvalidated) {
            this.result = paymentFlowResult$Unvalidated;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Complete) && this.result.equals(((Complete) obj).result);
        }

        public final int hashCode() {
            return this.result.hashCode();
        }

        public final String toString() {
            return "Complete(result=" + this.result + ")";
        }
    }

    public final class StartChallenge extends NextStep {
        public final InitChallengeArgs args;

        public StartChallenge(InitChallengeArgs initChallengeArgs) {
            this.args = initChallengeArgs;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StartChallenge) && this.args.equals(((StartChallenge) obj).args);
        }

        public final int hashCode() {
            return this.args.hashCode();
        }

        public final String toString() {
            return "StartChallenge(args=" + this.args + ")";
        }
    }

    public final class StartFallback extends NextStep {
        public final PaymentBrowserAuthContract.Args args;

        public StartFallback(PaymentBrowserAuthContract.Args args) {
            this.args = args;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StartFallback) && this.args.equals(((StartFallback) obj).args);
        }

        public final int hashCode() {
            return this.args.hashCode();
        }

        public final String toString() {
            return "StartFallback(args=" + this.args + ")";
        }
    }
}
