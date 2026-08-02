package com.stripe.android.financialconnections.features.networkinglinksignup;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.stripe.android.financialconnections.model.LegalDetailsNotice;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.model.ConsumerSessionLookup;
import com.stripe.android.uicore.elements.PhoneNumberController;
import com.stripe.android.uicore.elements.SimpleTextFieldController;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class NetworkingLinkSignupState {
    public final boolean isInstantDebits;
    public final Async lookupAccount;
    public final Async payload;
    public final Async saveAccountToLink;
    public final String validEmail;
    public final String validPhone;
    public final NetworkingLinkSignupState$ViewEffect$OpenUrl viewEffect;

    public final class Content {
        public final String aboveCta;
        public final List bullets;
        public final String cta;
        public final LegalDetailsNotice legalDetailsNotice;
        public final String message;
        public final String skipCta;
        public final String title;

        public Content(String str, String str2, List list, String str3, String str4, String str5, LegalDetailsNotice legalDetailsNotice) {
            str.getClass();
            list.getClass();
            str3.getClass();
            str4.getClass();
            this.title = str;
            this.message = str2;
            this.bullets = list;
            this.aboveCta = str3;
            this.cta = str4;
            this.skipCta = str5;
            this.legalDetailsNotice = legalDetailsNotice;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return Intrinsics.areEqual(this.title, content.title) && Intrinsics.areEqual(this.message, content.message) && Intrinsics.areEqual(this.bullets, content.bullets) && Intrinsics.areEqual(this.aboveCta, content.aboveCta) && Intrinsics.areEqual(this.cta, content.cta) && Intrinsics.areEqual(this.skipCta, content.skipCta) && Intrinsics.areEqual(this.legalDetailsNotice, content.legalDetailsNotice);
        }

        public final int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            String str = this.message;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.bullets), 31, this.aboveCta), 31, this.cta);
            String str2 = this.skipCta;
            int hashCode2 = (m + (str2 == null ? 0 : str2.hashCode())) * 31;
            LegalDetailsNotice legalDetailsNotice = this.legalDetailsNotice;
            return hashCode2 + (legalDetailsNotice != null ? legalDetailsNotice.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Content(title=", this.title, ", message=", this.message, ", bullets=");
            Recorder$$ExternalSyntheticOutline2.m(", aboveCta=", this.aboveCta, ", cta=", m, this.bullets);
            Boxes$$ExternalSyntheticOutline1.m(m, this.cta, ", skipCta=", this.skipCta, ", legalDetailsNotice=");
            m.append(this.legalDetailsNotice);
            m.append(")");
            return m.toString();
        }
    }

    public final class Payload {
        public final boolean appVerificationEnabled;
        public final Content content;
        public final SimpleTextFieldController emailController;
        public final boolean isInstantDebits;
        public final String merchantName;
        public final PhoneNumberController phoneController;
        public final String prefilledEmail;
        public final String sessionId;

        public Payload(String str, SimpleTextFieldController simpleTextFieldController, boolean z, String str2, PhoneNumberController phoneNumberController, boolean z2, Content content, String str3) {
            str3.getClass();
            this.merchantName = str;
            this.emailController = simpleTextFieldController;
            this.appVerificationEnabled = z;
            this.prefilledEmail = str2;
            this.phoneController = phoneNumberController;
            this.isInstantDebits = z2;
            this.content = content;
            this.sessionId = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Payload) {
                Payload payload = (Payload) obj;
                if (Intrinsics.areEqual(this.merchantName, payload.merchantName) && this.emailController == payload.emailController && this.appVerificationEnabled == payload.appVerificationEnabled && Intrinsics.areEqual(this.prefilledEmail, payload.prefilledEmail) && this.phoneController == payload.phoneController && this.isInstantDebits == payload.isInstantDebits && this.content.equals(payload.content) && Intrinsics.areEqual(this.sessionId, payload.sessionId)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            String str = this.merchantName;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.emailController.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31, this.appVerificationEnabled);
            String str2 = this.prefilledEmail;
            return this.sessionId.hashCode() + ((this.content.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.phoneController.hashCode() + ((m + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31, 31, this.isInstantDebits)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Payload(merchantName=");
            sb.append(this.merchantName);
            sb.append(", emailController=");
            sb.append(this.emailController);
            sb.append(", appVerificationEnabled=");
            NavAction$$ExternalSyntheticOutline0.m(sb, this.appVerificationEnabled, ", prefilledEmail=", this.prefilledEmail, ", phoneController=");
            sb.append(this.phoneController);
            sb.append(", isInstantDebits=");
            sb.append(this.isInstantDebits);
            sb.append(", content=");
            sb.append(this.content);
            sb.append(", sessionId=");
            sb.append(this.sessionId);
            sb.append(")");
            return sb.toString();
        }
    }

    public NetworkingLinkSignupState(Async async, String str, String str2, Async async2, Async async3, NetworkingLinkSignupState$ViewEffect$OpenUrl networkingLinkSignupState$ViewEffect$OpenUrl, boolean z) {
        async.getClass();
        async2.getClass();
        async3.getClass();
        this.payload = async;
        this.validEmail = str;
        this.validPhone = str2;
        this.saveAccountToLink = async2;
        this.lookupAccount = async3;
        this.viewEffect = networkingLinkSignupState$ViewEffect$OpenUrl;
        this.isInstantDebits = z;
    }

    public static NetworkingLinkSignupState copy$default(NetworkingLinkSignupState networkingLinkSignupState, Async async, String str, String str2, Async async2, Async async3, NetworkingLinkSignupState$ViewEffect$OpenUrl networkingLinkSignupState$ViewEffect$OpenUrl, int i) {
        if ((i & 1) != 0) {
            async = networkingLinkSignupState.payload;
        }
        Async async4 = async;
        if ((i & 2) != 0) {
            str = networkingLinkSignupState.validEmail;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = networkingLinkSignupState.validPhone;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            async2 = networkingLinkSignupState.saveAccountToLink;
        }
        Async async5 = async2;
        if ((i & 16) != 0) {
            async3 = networkingLinkSignupState.lookupAccount;
        }
        Async async6 = async3;
        if ((i & 32) != 0) {
            networkingLinkSignupState$ViewEffect$OpenUrl = networkingLinkSignupState.viewEffect;
        }
        boolean z = networkingLinkSignupState.isInstantDebits;
        networkingLinkSignupState.getClass();
        async4.getClass();
        async5.getClass();
        async6.getClass();
        return new NetworkingLinkSignupState(async4, str3, str4, async5, async6, networkingLinkSignupState$ViewEffect$OpenUrl, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkingLinkSignupState)) {
            return false;
        }
        NetworkingLinkSignupState networkingLinkSignupState = (NetworkingLinkSignupState) obj;
        return Intrinsics.areEqual(this.payload, networkingLinkSignupState.payload) && Intrinsics.areEqual(this.validEmail, networkingLinkSignupState.validEmail) && Intrinsics.areEqual(this.validPhone, networkingLinkSignupState.validPhone) && Intrinsics.areEqual(this.saveAccountToLink, networkingLinkSignupState.saveAccountToLink) && Intrinsics.areEqual(this.lookupAccount, networkingLinkSignupState.lookupAccount) && Intrinsics.areEqual(this.viewEffect, networkingLinkSignupState.viewEffect) && this.isInstantDebits == networkingLinkSignupState.isInstantDebits;
    }

    public final boolean getValid() {
        ConsumerSessionLookup consumerSessionLookup = (ConsumerSessionLookup) this.lookupAccount.invoke();
        return this.validEmail != null && ((consumerSessionLookup != null && consumerSessionLookup.exists) || this.validPhone != null);
    }

    public final int hashCode() {
        int hashCode = this.payload.hashCode() * 31;
        String str = this.validEmail;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.validPhone;
        int hashCode3 = (this.lookupAccount.hashCode() + ((this.saveAccountToLink.hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31)) * 31;
        NetworkingLinkSignupState$ViewEffect$OpenUrl networkingLinkSignupState$ViewEffect$OpenUrl = this.viewEffect;
        return Boolean.hashCode(this.isInstantDebits) + ((hashCode3 + (networkingLinkSignupState$ViewEffect$OpenUrl != null ? networkingLinkSignupState$ViewEffect$OpenUrl.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkingLinkSignupState(payload=");
        sb.append(this.payload);
        sb.append(", validEmail=");
        sb.append(this.validEmail);
        sb.append(", validPhone=");
        sb.append(this.validPhone);
        sb.append(", saveAccountToLink=");
        sb.append(this.saveAccountToLink);
        sb.append(", lookupAccount=");
        sb.append(this.lookupAccount);
        sb.append(", viewEffect=");
        sb.append(this.viewEffect);
        sb.append(", isInstantDebits=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.isInstantDebits, ")");
    }
}
