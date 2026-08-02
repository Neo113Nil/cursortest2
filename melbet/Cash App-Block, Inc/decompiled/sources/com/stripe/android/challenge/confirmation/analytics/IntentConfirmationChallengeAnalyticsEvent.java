package com.stripe.android.challenge.confirmation.analytics;

import com.stripe.android.core.networking.AnalyticsEvent;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;

/* loaded from: classes8.dex */
public interface IntentConfirmationChallengeAnalyticsEvent extends AnalyticsEvent {

    public final class Cancel implements IntentConfirmationChallengeAnalyticsEvent {
        public final /* synthetic */ int $r8$classId;
        public final String captchaVendorName;
        public final float duration;

        public /* synthetic */ Cancel(float f, int i, String str) {
            this.$r8$classId = i;
            this.duration = f;
            this.captchaVendorName = str;
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public final String getEventName() {
            switch (this.$r8$classId) {
                case 0:
                    return "elements.intent_confirmation_challenge.cancel";
                case 1:
                    return "elements.intent_confirmation_challenge.success";
                default:
                    return "elements.intent_confirmation_challenge.web_view_loaded";
            }
        }

        @Override // com.stripe.android.challenge.confirmation.analytics.IntentConfirmationChallengeAnalyticsEvent
        public final Map getParams() {
            int i = this.$r8$classId;
            String str = this.captchaVendorName;
            float f = this.duration;
            switch (i) {
                case 0:
                    return MapsKt__MapsKt.mapOf(new Pair("duration", Float.valueOf(f)), new Pair("captcha_vendor_name", str));
                case 1:
                    return MapsKt__MapsKt.mapOf(new Pair("duration", Float.valueOf(f)), new Pair("captcha_vendor_name", str));
                default:
                    return MapsKt__MapsKt.mapOf(new Pair("duration", Float.valueOf(f)), new Pair("captcha_vendor_name", str));
            }
        }
    }

    public final class Error implements IntentConfirmationChallengeAnalyticsEvent {
        public final String captchaVendorName;
        public final float duration;
        public final String errorCode;
        public final String errorType;
        public final boolean fromBridge;

        public Error(float f, String str, String str2, String str3, boolean z) {
            this.duration = f;
            this.errorType = str;
            this.errorCode = str2;
            this.fromBridge = z;
            this.captchaVendorName = str3;
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public final String getEventName() {
            return "elements.intent_confirmation_challenge.error";
        }

        @Override // com.stripe.android.challenge.confirmation.analytics.IntentConfirmationChallengeAnalyticsEvent
        public final Map getParams() {
            return MapsKt__MapsKt.mapOf(new Pair("duration", Float.valueOf(this.duration)), new Pair("error_type", this.errorType), new Pair("error_code", this.errorCode), new Pair("from_bridge", Boolean.valueOf(this.fromBridge)), new Pair("captcha_vendor_name", this.captchaVendorName));
        }
    }

    Map getParams();
}
