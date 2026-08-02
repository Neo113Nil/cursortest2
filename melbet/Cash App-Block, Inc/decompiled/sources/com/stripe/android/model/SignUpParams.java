package com.stripe.android.model;

import com.appsflyer.AdRevenueScheme;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes8.dex */
public final class SignUpParams {
    public final Long amount;
    public final String appId;
    public final String country;
    public final String currency;
    public final String email;
    public final Locale locale;
    public final String phoneNumber;
    public final String requestSurface;
    public final String verificationToken;

    public SignUpParams(String str, String str2, String str3, Locale locale, Long l, String str4, String str5, String str6, String str7) {
        ConsumerSignUpConsentAction consumerSignUpConsentAction = ConsumerSignUpConsentAction.EnteredPhoneNumberClickedSaveToLink;
        str.getClass();
        str5.getClass();
        this.email = str;
        this.phoneNumber = str2;
        this.country = str3;
        this.locale = locale;
        this.amount = l;
        this.currency = str4;
        this.requestSurface = str5;
        this.verificationToken = str6;
        this.appId = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignUpParams)) {
            return false;
        }
        SignUpParams signUpParams = (SignUpParams) obj;
        if (!Intrinsics.areEqual(this.email, signUpParams.email) || !Intrinsics.areEqual(this.phoneNumber, signUpParams.phoneNumber) || !Intrinsics.areEqual(this.country, signUpParams.country) || !Intrinsics.areEqual(this.locale, signUpParams.locale) || !Intrinsics.areEqual(this.amount, signUpParams.amount) || !Intrinsics.areEqual(this.currency, signUpParams.currency) || !Intrinsics.areEqual(this.requestSurface, signUpParams.requestSurface)) {
            return false;
        }
        ConsumerSignUpConsentAction consumerSignUpConsentAction = ConsumerSignUpConsentAction.EnteredPhoneNumberClickedSaveToLink;
        return Intrinsics.areEqual(this.verificationToken, signUpParams.verificationToken) && Intrinsics.areEqual(this.appId, signUpParams.appId);
    }

    public final int hashCode() {
        int hashCode = this.email.hashCode() * 31;
        String str = this.phoneNumber;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.country;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + 40276826) * 961;
        Locale locale = this.locale;
        int hashCode4 = (hashCode3 + (locale == null ? 0 : locale.hashCode())) * 31;
        Long l = this.amount;
        int hashCode5 = (hashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.currency;
        int hashCode6 = (ConsumerSignUpConsentAction.EnteredPhoneNumberClickedSaveToLink.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 961, 31, this.requestSurface)) * 31;
        String str4 = this.verificationToken;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.appId;
        return hashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    public final Map toParamMap() {
        String lowerCase = this.email.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        Pair pair = new Pair("email_address", lowerCase);
        Pair pair2 = new Pair("amount", this.amount);
        Pair pair3 = new Pair("currency", this.currency);
        ConsumerSignUpConsentAction consumerSignUpConsentAction = ConsumerSignUpConsentAction.EnteredPhoneNumberClickedSaveToLink;
        LinkedHashMap mutableMapOf = MapsKt__MapsKt.mutableMapOf(pair, pair2, pair3, new Pair("consent_action", "entered_phone_number_clicked_save_to_link"), new Pair("request_surface", this.requestSurface), new Pair("country_inferring_method", "PHONE_NUMBER"));
        Locale locale = this.locale;
        if (locale != null) {
            mutableMapOf.put("locale", locale.toLanguageTag());
        }
        String str = this.phoneNumber;
        if (str != null) {
            if (StringsKt.isBlank(str)) {
                str = null;
            }
            if (str != null) {
                mutableMapOf.put("phone_number", str);
            }
        }
        String str2 = this.country;
        if (str2 != null) {
            String str3 = StringsKt.isBlank(str2) ? null : str2;
            if (str3 != null) {
                mutableMapOf.put(AdRevenueScheme.COUNTRY, str3);
            }
        }
        String str4 = this.verificationToken;
        if (str4 != null) {
            mutableMapOf.put("android_verification_token", str4);
        }
        String str5 = this.appId;
        if (str5 != null) {
            mutableMapOf.put("app_id", str5);
        }
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        mutableMapOf.putAll(emptyMap);
        return MapsKt__MapsKt.toMap(mutableMapOf);
    }

    public final String toString() {
        ConsumerSignUpConsentAction consumerSignUpConsentAction = ConsumerSignUpConsentAction.EnteredPhoneNumberClickedSaveToLink;
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SignUpParams(email=", this.email, ", phoneNumber=", this.phoneNumber, ", country=");
        m.append(this.country);
        m.append(", countryInferringMethod=PHONE_NUMBER, name=null, locale=");
        m.append(this.locale);
        m.append(", amount=");
        ViewEvent$State$EnumUnboxingLocalUtility.m(this.amount, ", currency=", this.currency, ", incentiveEligibilitySession=null, requestSurface=", m);
        m.append(this.requestSurface);
        m.append(", consentAction=");
        m.append(consumerSignUpConsentAction);
        m.append(", verificationToken=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.verificationToken, ", appId=", this.appId, ")");
    }
}
