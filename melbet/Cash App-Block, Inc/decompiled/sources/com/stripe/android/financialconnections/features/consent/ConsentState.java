package com.stripe.android.financialconnections.features.consent;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.stripe.android.financialconnections.model.ConsentPane;
import com.stripe.android.financialconnections.presentation.Async;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class ConsentState {
    public final Async acceptConsent;
    public final Async consent;
    public final List merchantLogos;
    public final ConsentState$ViewEffect$OpenUrl viewEffect;

    /* loaded from: classes7.dex */
    public final class Payload {
        public final ConsentPane consent;
        public final List merchantLogos;
        public final boolean shouldShowMerchantLogos;
        public final boolean showAnimatedDots;

        public Payload(ConsentPane consentPane, List list, boolean z, boolean z2) {
            consentPane.getClass();
            list.getClass();
            this.consent = consentPane;
            this.merchantLogos = list;
            this.shouldShowMerchantLogos = z;
            this.showAnimatedDots = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Payload)) {
                return false;
            }
            Payload payload = (Payload) obj;
            return Intrinsics.areEqual(this.consent, payload.consent) && Intrinsics.areEqual(this.merchantLogos, payload.merchantLogos) && this.shouldShowMerchantLogos == payload.shouldShowMerchantLogos && this.showAnimatedDots == payload.showAnimatedDots;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.showAnimatedDots) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(this.consent.hashCode() * 31, 31, this.merchantLogos), 31, this.shouldShowMerchantLogos);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Payload(consent=");
            sb.append(this.consent);
            sb.append(", merchantLogos=");
            sb.append(this.merchantLogos);
            sb.append(", shouldShowMerchantLogos=");
            return Request$Priority$EnumUnboxingLocalUtility.m(sb, this.shouldShowMerchantLogos, ", showAnimatedDots=", this.showAnimatedDots, ")");
        }
    }

    public ConsentState(Async async, List list, Async async2, ConsentState$ViewEffect$OpenUrl consentState$ViewEffect$OpenUrl) {
        async.getClass();
        list.getClass();
        async2.getClass();
        this.consent = async;
        this.merchantLogos = list;
        this.acceptConsent = async2;
        this.viewEffect = consentState$ViewEffect$OpenUrl;
    }

    public static ConsentState copy$default(ConsentState consentState, Async async, Async async2, ConsentState$ViewEffect$OpenUrl consentState$ViewEffect$OpenUrl, int i) {
        if ((i & 1) != 0) {
            async = consentState.consent;
        }
        List list = consentState.merchantLogos;
        if ((i & 4) != 0) {
            async2 = consentState.acceptConsent;
        }
        if ((i & 8) != 0) {
            consentState$ViewEffect$OpenUrl = consentState.viewEffect;
        }
        consentState.getClass();
        async.getClass();
        list.getClass();
        async2.getClass();
        return new ConsentState(async, list, async2, consentState$ViewEffect$OpenUrl);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConsentState)) {
            return false;
        }
        ConsentState consentState = (ConsentState) obj;
        return Intrinsics.areEqual(this.consent, consentState.consent) && Intrinsics.areEqual(this.merchantLogos, consentState.merchantLogos) && Intrinsics.areEqual(this.acceptConsent, consentState.acceptConsent) && Intrinsics.areEqual(this.viewEffect, consentState.viewEffect);
    }

    public final int hashCode() {
        int hashCode = (this.acceptConsent.hashCode() + Recorder$$ExternalSyntheticOutline2.m(this.consent.hashCode() * 31, 31, this.merchantLogos)) * 31;
        ConsentState$ViewEffect$OpenUrl consentState$ViewEffect$OpenUrl = this.viewEffect;
        return hashCode + (consentState$ViewEffect$OpenUrl == null ? 0 : consentState$ViewEffect$OpenUrl.hashCode());
    }

    public final String toString() {
        return "ConsentState(consent=" + this.consent + ", merchantLogos=" + this.merchantLogos + ", acceptConsent=" + this.acceptConsent + ", viewEffect=" + this.viewEffect + ")";
    }
}
