package com.stripe.android.payments.bankaccount.ui;

import com.stripe.android.financialconnections.ElementsSessionContext;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountResultInternal;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public abstract class CollectBankAccountViewEffect {

    public final class FinishWithResult extends CollectBankAccountViewEffect {
        public final CollectBankAccountResultInternal result;

        public FinishWithResult(CollectBankAccountResultInternal collectBankAccountResultInternal) {
            collectBankAccountResultInternal.getClass();
            this.result = collectBankAccountResultInternal;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FinishWithResult) && Intrinsics.areEqual(this.result, ((FinishWithResult) obj).result);
        }

        public final int hashCode() {
            return this.result.hashCode();
        }

        public final String toString() {
            return "FinishWithResult(result=" + this.result + ")";
        }
    }

    public final class OpenConnectionsFlow extends CollectBankAccountViewEffect {
        public final ElementsSessionContext elementsSessionContext;
        public final String financialConnectionsSessionSecret;
        public final String publishableKey;
        public final String stripeAccountId;

        public OpenConnectionsFlow(String str, String str2, String str3, ElementsSessionContext elementsSessionContext) {
            str.getClass();
            str2.getClass();
            this.publishableKey = str;
            this.financialConnectionsSessionSecret = str2;
            this.stripeAccountId = str3;
            this.elementsSessionContext = elementsSessionContext;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenConnectionsFlow)) {
                return false;
            }
            OpenConnectionsFlow openConnectionsFlow = (OpenConnectionsFlow) obj;
            return Intrinsics.areEqual(this.publishableKey, openConnectionsFlow.publishableKey) && Intrinsics.areEqual(this.financialConnectionsSessionSecret, openConnectionsFlow.financialConnectionsSessionSecret) && Intrinsics.areEqual(this.stripeAccountId, openConnectionsFlow.stripeAccountId) && Intrinsics.areEqual(this.elementsSessionContext, openConnectionsFlow.elementsSessionContext);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.publishableKey.hashCode() * 31, 31, this.financialConnectionsSessionSecret);
            String str = this.stripeAccountId;
            int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
            ElementsSessionContext elementsSessionContext = this.elementsSessionContext;
            return hashCode + (elementsSessionContext != null ? elementsSessionContext.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OpenConnectionsFlow(publishableKey=", this.publishableKey, ", financialConnectionsSessionSecret=", this.financialConnectionsSessionSecret, ", stripeAccountId=");
            m.append(this.stripeAccountId);
            m.append(", elementsSessionContext=");
            m.append(this.elementsSessionContext);
            m.append(")");
            return m.toString();
        }
    }
}
