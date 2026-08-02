package com.stripe.android.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.model.SourceParams;
import com.stripe.android.model.Token;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import io.noties.markwon.LinkResolverDef;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.internal.Intrinsics;
import net.idrnd.face.iad.capture.Plane;
import net.idrnd.face.iad.capture.internal.y0;

/* loaded from: classes8.dex */
public interface StripeIntent extends StripeModel {

    public abstract class NextActionData implements StripeModel {

        public final class AlipayRedirect extends NextActionData {
            public static final Parcelable.Creator<AlipayRedirect> CREATOR = new SourceParams.Creator(15);
            public final String authCompleteUrl;
            public final String data;
            public final String returnUrl;
            public final Uri webViewUrl;

            public AlipayRedirect(Uri uri, String str, String str2, String str3) {
                str.getClass();
                uri.getClass();
                this.data = str;
                this.authCompleteUrl = str2;
                this.webViewUrl = uri;
                this.returnUrl = str3;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AlipayRedirect)) {
                    return false;
                }
                AlipayRedirect alipayRedirect = (AlipayRedirect) obj;
                return Intrinsics.areEqual(this.data, alipayRedirect.data) && Intrinsics.areEqual(this.authCompleteUrl, alipayRedirect.authCompleteUrl) && Intrinsics.areEqual(this.webViewUrl, alipayRedirect.webViewUrl) && Intrinsics.areEqual(this.returnUrl, alipayRedirect.returnUrl);
            }

            public final int hashCode() {
                int hashCode = this.data.hashCode() * 31;
                String str = this.authCompleteUrl;
                int hashCode2 = (this.webViewUrl.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
                String str2 = this.returnUrl;
                return hashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AlipayRedirect(data=", this.data, ", authCompleteUrl=", this.authCompleteUrl, ", webViewUrl=");
                m.append(this.webViewUrl);
                m.append(", returnUrl=");
                m.append(this.returnUrl);
                m.append(")");
                return m.toString();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.data);
                parcel.writeString(this.authCompleteUrl);
                parcel.writeParcelable(this.webViewUrl, i);
                parcel.writeString(this.returnUrl);
            }
        }

        public final class BlikAuthorize extends NextActionData {
            public static final BlikAuthorize INSTANCE = new BlikAuthorize();
            public static final Parcelable.Creator<BlikAuthorize> CREATOR = new SourceParams.Creator(16);

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof BlikAuthorize);
            }

            public final int hashCode() {
                return 1031794127;
            }

            public final String toString() {
                return "BlikAuthorize";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeInt(1);
            }
        }

        public final class CashAppRedirect extends NextActionData {
            public static final Parcelable.Creator<CashAppRedirect> CREATOR = new SourceParams.Creator(17);
            public final String mobileAuthUrl;

            public CashAppRedirect(String str) {
                str.getClass();
                this.mobileAuthUrl = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CashAppRedirect) && Intrinsics.areEqual(this.mobileAuthUrl, ((CashAppRedirect) obj).mobileAuthUrl);
            }

            public final int hashCode() {
                return this.mobileAuthUrl.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CashAppRedirect(mobileAuthUrl=", this.mobileAuthUrl, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.mobileAuthUrl);
            }
        }

        public final class DisplayBoletoDetails extends NextActionData implements DisplayVoucherDetails {
            public static final Parcelable.Creator<DisplayBoletoDetails> CREATOR = new SourceParams.Creator(18);
            public final String hostedVoucherUrl;

            public DisplayBoletoDetails(String str) {
                this.hostedVoucherUrl = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof DisplayBoletoDetails) && Intrinsics.areEqual(this.hostedVoucherUrl, ((DisplayBoletoDetails) obj).hostedVoucherUrl);
            }

            @Override // com.stripe.android.model.StripeIntent.NextActionData.DisplayVoucherDetails
            public final String getHostedVoucherUrl() {
                return this.hostedVoucherUrl;
            }

            public final int hashCode() {
                String str = this.hostedVoucherUrl;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DisplayBoletoDetails(hostedVoucherUrl=", this.hostedVoucherUrl, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.hostedVoucherUrl);
            }
        }

        public final class DisplayKonbiniDetails extends NextActionData implements DisplayVoucherDetails {
            public static final Parcelable.Creator<DisplayKonbiniDetails> CREATOR = new SourceParams.Creator(19);
            public final String hostedVoucherUrl;

            public DisplayKonbiniDetails(String str) {
                this.hostedVoucherUrl = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof DisplayKonbiniDetails) && Intrinsics.areEqual(this.hostedVoucherUrl, ((DisplayKonbiniDetails) obj).hostedVoucherUrl);
            }

            @Override // com.stripe.android.model.StripeIntent.NextActionData.DisplayVoucherDetails
            public final String getHostedVoucherUrl() {
                return this.hostedVoucherUrl;
            }

            public final int hashCode() {
                String str = this.hostedVoucherUrl;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DisplayKonbiniDetails(hostedVoucherUrl=", this.hostedVoucherUrl, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.hostedVoucherUrl);
            }
        }

        public final class DisplayMultibancoDetails extends NextActionData implements DisplayVoucherDetails {
            public static final Parcelable.Creator<DisplayMultibancoDetails> CREATOR = new SourceParams.Creator(20);
            public final String hostedVoucherUrl;

            public DisplayMultibancoDetails(String str) {
                this.hostedVoucherUrl = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof DisplayMultibancoDetails) && Intrinsics.areEqual(this.hostedVoucherUrl, ((DisplayMultibancoDetails) obj).hostedVoucherUrl);
            }

            @Override // com.stripe.android.model.StripeIntent.NextActionData.DisplayVoucherDetails
            public final String getHostedVoucherUrl() {
                return this.hostedVoucherUrl;
            }

            public final int hashCode() {
                String str = this.hostedVoucherUrl;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DisplayMultibancoDetails(hostedVoucherUrl=", this.hostedVoucherUrl, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.hostedVoucherUrl);
            }
        }

        public final class DisplayOxxoDetails extends NextActionData implements DisplayVoucherDetails {
            public static final Parcelable.Creator<DisplayOxxoDetails> CREATOR = new SourceParams.Creator(21);
            public final int expiresAfter;
            public final String hostedVoucherUrl;
            public final String number;

            public DisplayOxxoDetails(int i, String str, String str2) {
                this.expiresAfter = i;
                this.number = str;
                this.hostedVoucherUrl = str2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DisplayOxxoDetails)) {
                    return false;
                }
                DisplayOxxoDetails displayOxxoDetails = (DisplayOxxoDetails) obj;
                return this.expiresAfter == displayOxxoDetails.expiresAfter && Intrinsics.areEqual(this.number, displayOxxoDetails.number) && Intrinsics.areEqual(this.hostedVoucherUrl, displayOxxoDetails.hostedVoucherUrl);
            }

            @Override // com.stripe.android.model.StripeIntent.NextActionData.DisplayVoucherDetails
            public final String getHostedVoucherUrl() {
                return this.hostedVoucherUrl;
            }

            public final int hashCode() {
                int hashCode = Integer.hashCode(this.expiresAfter) * 31;
                String str = this.number;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.hostedVoucherUrl;
                return hashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(re$$ExternalSyntheticOutline0.m("DisplayOxxoDetails(expiresAfter=", this.expiresAfter, ", number=", this.number, ", hostedVoucherUrl="), this.hostedVoucherUrl, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeInt(this.expiresAfter);
                parcel.writeString(this.number);
                parcel.writeString(this.hostedVoucherUrl);
            }
        }

        public final class DisplayPayNowDetails extends NextActionData {
            public static final Parcelable.Creator<DisplayPayNowDetails> CREATOR = new SourceParams.Creator(22);
            public final String qrCodeUrl;

            public DisplayPayNowDetails(String str) {
                this.qrCodeUrl = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof DisplayPayNowDetails) && Intrinsics.areEqual(this.qrCodeUrl, ((DisplayPayNowDetails) obj).qrCodeUrl);
            }

            public final int hashCode() {
                String str = this.qrCodeUrl;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DisplayPayNowDetails(qrCodeUrl=", this.qrCodeUrl, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.qrCodeUrl);
            }
        }

        public final class DisplayPromptPayDetails extends NextActionData {
            public static final Parcelable.Creator<DisplayPromptPayDetails> CREATOR = new SourceParams.Creator(23);
            public final String qrCodeUrl;

            public DisplayPromptPayDetails(String str) {
                this.qrCodeUrl = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof DisplayPromptPayDetails) && Intrinsics.areEqual(this.qrCodeUrl, ((DisplayPromptPayDetails) obj).qrCodeUrl);
            }

            public final int hashCode() {
                String str = this.qrCodeUrl;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DisplayPromptPayDetails(qrCodeUrl=", this.qrCodeUrl, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.qrCodeUrl);
            }
        }

        public interface DisplayVoucherDetails {
            String getHostedVoucherUrl();
        }

        public final class RedirectToUrl extends NextActionData {
            public static final Parcelable.Creator<RedirectToUrl> CREATOR = new SourceParams.Creator(24);
            public final String returnUrl;
            public final Uri url;

            public RedirectToUrl(Uri uri, String str) {
                uri.getClass();
                this.url = uri;
                this.returnUrl = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RedirectToUrl)) {
                    return false;
                }
                RedirectToUrl redirectToUrl = (RedirectToUrl) obj;
                return Intrinsics.areEqual(this.url, redirectToUrl.url) && Intrinsics.areEqual(this.returnUrl, redirectToUrl.returnUrl);
            }

            public final int hashCode() {
                int hashCode = this.url.hashCode() * 31;
                String str = this.returnUrl;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                return "RedirectToUrl(url=" + this.url + ", returnUrl=" + this.returnUrl + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeParcelable(this.url, i);
                parcel.writeString(this.returnUrl);
            }
        }

        public abstract class SdkData extends NextActionData {

            public final class IntentConfirmationChallenge extends SdkData {
                public static final Parcelable.Creator<IntentConfirmationChallenge> CREATOR = new SourceParams.Creator(25);
                public final StripeJs stripeJs;

                public final class StripeJs implements Parcelable {
                    public static final Parcelable.Creator<StripeJs> CREATOR = new SourceParams.Creator(26);
                    public final String captchaVendorName;

                    public StripeJs(String str) {
                        this.captchaVendorName = str;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof StripeJs) && Intrinsics.areEqual(this.captchaVendorName, ((StripeJs) obj).captchaVendorName);
                    }

                    public final int hashCode() {
                        String str = this.captchaVendorName;
                        if (str == null) {
                            return 0;
                        }
                        return str.hashCode();
                    }

                    public final String toString() {
                        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("StripeJs(captchaVendorName=", this.captchaVendorName, ")");
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel, int i) {
                        parcel.getClass();
                        parcel.writeString(this.captchaVendorName);
                    }
                }

                public IntentConfirmationChallenge(StripeJs stripeJs) {
                    stripeJs.getClass();
                    this.stripeJs = stripeJs;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof IntentConfirmationChallenge) && Intrinsics.areEqual(this.stripeJs, ((IntentConfirmationChallenge) obj).stripeJs);
                }

                public final int hashCode() {
                    return this.stripeJs.hashCode();
                }

                public final String toString() {
                    return "IntentConfirmationChallenge(stripeJs=" + this.stripeJs + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    this.stripeJs.writeToParcel(parcel, i);
                }
            }

            public final class Use3DS2 extends SdkData {
                public static final Parcelable.Creator<Use3DS2> CREATOR = new SourceParams.Creator(27);
                public final String publishableKey;
                public final DirectoryServerEncryption serverEncryption;
                public final String serverName;
                public final String source;
                public final String threeDS2IntentId;
                public final String transactionId;

                public final class DirectoryServerEncryption implements Parcelable {
                    public static final Parcelable.Creator<DirectoryServerEncryption> CREATOR = new SourceParams.Creator(28);
                    public final String directoryServerId;
                    public final String dsCertificateData;
                    public final String keyId;
                    public final List rootCertsData;

                    public DirectoryServerEncryption(String str, String str2, String str3, List list) {
                        Request$Priority$EnumUnboxingLocalUtility.m(str, str2, list);
                        this.directoryServerId = str;
                        this.dsCertificateData = str2;
                        this.rootCertsData = list;
                        this.keyId = str3;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof DirectoryServerEncryption)) {
                            return false;
                        }
                        DirectoryServerEncryption directoryServerEncryption = (DirectoryServerEncryption) obj;
                        return Intrinsics.areEqual(this.directoryServerId, directoryServerEncryption.directoryServerId) && Intrinsics.areEqual(this.dsCertificateData, directoryServerEncryption.dsCertificateData) && Intrinsics.areEqual(this.rootCertsData, directoryServerEncryption.rootCertsData) && Intrinsics.areEqual(this.keyId, directoryServerEncryption.keyId);
                    }

                    public final int hashCode() {
                        int m = Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.directoryServerId.hashCode() * 31, 31, this.dsCertificateData), 31, this.rootCertsData);
                        String str = this.keyId;
                        return m + (str == null ? 0 : str.hashCode());
                    }

                    public final String toString() {
                        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DirectoryServerEncryption(directoryServerId=", this.directoryServerId, ", dsCertificateData=", this.dsCertificateData, ", rootCertsData=");
                        m.append(this.rootCertsData);
                        m.append(", keyId=");
                        m.append(this.keyId);
                        m.append(")");
                        return m.toString();
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel, int i) {
                        parcel.getClass();
                        parcel.writeString(this.directoryServerId);
                        parcel.writeString(this.dsCertificateData);
                        parcel.writeStringList(this.rootCertsData);
                        parcel.writeString(this.keyId);
                    }
                }

                public Use3DS2(String str, String str2, String str3, DirectoryServerEncryption directoryServerEncryption, String str4, String str5) {
                    str.getClass();
                    str2.getClass();
                    str3.getClass();
                    directoryServerEncryption.getClass();
                    this.source = str;
                    this.serverName = str2;
                    this.transactionId = str3;
                    this.serverEncryption = directoryServerEncryption;
                    this.threeDS2IntentId = str4;
                    this.publishableKey = str5;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Use3DS2)) {
                        return false;
                    }
                    Use3DS2 use3DS2 = (Use3DS2) obj;
                    return Intrinsics.areEqual(this.source, use3DS2.source) && Intrinsics.areEqual(this.serverName, use3DS2.serverName) && Intrinsics.areEqual(this.transactionId, use3DS2.transactionId) && Intrinsics.areEqual(this.serverEncryption, use3DS2.serverEncryption) && Intrinsics.areEqual(this.threeDS2IntentId, use3DS2.threeDS2IntentId) && Intrinsics.areEqual(this.publishableKey, use3DS2.publishableKey);
                }

                public final int hashCode() {
                    int hashCode = (this.serverEncryption.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.source.hashCode() * 31, 31, this.serverName), 31, this.transactionId)) * 31;
                    String str = this.threeDS2IntentId;
                    int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                    String str2 = this.publishableKey;
                    return hashCode2 + (str2 != null ? str2.hashCode() : 0);
                }

                public final String toString() {
                    StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Use3DS2(source=", this.source, ", serverName=", this.serverName, ", transactionId=");
                    m.append(this.transactionId);
                    m.append(", serverEncryption=");
                    m.append(this.serverEncryption);
                    m.append(", threeDS2IntentId=");
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.threeDS2IntentId, ", publishableKey=", this.publishableKey, ")");
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeString(this.source);
                    parcel.writeString(this.serverName);
                    parcel.writeString(this.transactionId);
                    this.serverEncryption.writeToParcel(parcel, i);
                    parcel.writeString(this.threeDS2IntentId);
                    parcel.writeString(this.publishableKey);
                }
            }
        }

        public final class SwishRedirect extends NextActionData {
            public static final Parcelable.Creator<SwishRedirect> CREATOR = new SourceParams.Creator(29);
            public final String mobileAuthUrl;

            public SwishRedirect(String str) {
                str.getClass();
                this.mobileAuthUrl = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SwishRedirect) && Intrinsics.areEqual(this.mobileAuthUrl, ((SwishRedirect) obj).mobileAuthUrl);
            }

            public final int hashCode() {
                return this.mobileAuthUrl.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SwishRedirect(mobileAuthUrl=", this.mobileAuthUrl, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.mobileAuthUrl);
            }
        }

        public final class VerifyWithMicrodeposits extends NextActionData {
            public static final Parcelable.Creator<VerifyWithMicrodeposits> CREATOR = new Token.Creator(1);
            public final long arrivalDate;
            public final String hostedVerificationUrl;
            public final MicrodepositType microdepositType;

            public VerifyWithMicrodeposits(long j, String str, MicrodepositType microdepositType) {
                str.getClass();
                microdepositType.getClass();
                this.arrivalDate = j;
                this.hostedVerificationUrl = str;
                this.microdepositType = microdepositType;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof VerifyWithMicrodeposits)) {
                    return false;
                }
                VerifyWithMicrodeposits verifyWithMicrodeposits = (VerifyWithMicrodeposits) obj;
                return this.arrivalDate == verifyWithMicrodeposits.arrivalDate && Intrinsics.areEqual(this.hostedVerificationUrl, verifyWithMicrodeposits.hostedVerificationUrl) && this.microdepositType == verifyWithMicrodeposits.microdepositType;
            }

            public final int hashCode() {
                return this.microdepositType.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Long.hashCode(this.arrivalDate) * 31, 31, this.hostedVerificationUrl);
            }

            public final String toString() {
                StringBuilder m = re$$ExternalSyntheticOutline0.m("VerifyWithMicrodeposits(arrivalDate=", this.arrivalDate, ", hostedVerificationUrl=", this.hostedVerificationUrl);
                m.append(", microdepositType=");
                m.append(this.microdepositType);
                m.append(")");
                return m.toString();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeLong(this.arrivalDate);
                parcel.writeString(this.hostedVerificationUrl);
                parcel.writeString(this.microdepositType.name());
            }
        }

        public final class WeChatPayRedirect extends NextActionData {
            public static final Parcelable.Creator<WeChatPayRedirect> CREATOR = new Token.Creator(2);
            public final WeChat weChat;

            public WeChatPayRedirect(WeChat weChat) {
                weChat.getClass();
                this.weChat = weChat;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof WeChatPayRedirect) && Intrinsics.areEqual(this.weChat, ((WeChatPayRedirect) obj).weChat);
            }

            public final int hashCode() {
                return this.weChat.hashCode();
            }

            public final String toString() {
                return "WeChatPayRedirect(weChat=" + this.weChat + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                this.weChat.writeToParcel(parcel, i);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006J\u000f\u0010\u0004\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"com/stripe/android/model/StripeIntent$NextActionType", "", "Lcom/stripe/android/model/StripeIntent$NextActionType;", "", "toString", "()Ljava/lang/String;", "net/idrnd/face/iad/capture/Plane", "payments-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class NextActionType {
        public static final /* synthetic */ EnumEntriesList $ENTRIES;
        public static final /* synthetic */ NextActionType[] $VALUES;
        public static final NextActionType BlikAuthorize;
        public static final NextActionType CashAppRedirect;
        public static final Plane Companion;
        public static final NextActionType DisplayBoletoDetails;
        public static final NextActionType DisplayKonbiniDetails;
        public static final NextActionType DisplayMultibancoDetails;
        public static final NextActionType DisplayOxxoDetails;
        public static final NextActionType DisplayPayNowDetails;
        public static final NextActionType DisplayPromptPayDetails;
        public static final NextActionType RedirectToUrl;
        public static final NextActionType SwishRedirect;
        public static final NextActionType UseStripeSdk;
        public static final NextActionType VerifyWithMicrodeposits;
        public final String code;

        static {
            NextActionType nextActionType = new NextActionType("RedirectToUrl", 0, "redirect_to_url");
            RedirectToUrl = nextActionType;
            NextActionType nextActionType2 = new NextActionType("UseStripeSdk", 1, "use_stripe_sdk");
            UseStripeSdk = nextActionType2;
            NextActionType nextActionType3 = new NextActionType("DisplayOxxoDetails", 2, "oxxo_display_details");
            DisplayOxxoDetails = nextActionType3;
            NextActionType nextActionType4 = new NextActionType("AlipayRedirect", 3, "alipay_handle_redirect");
            NextActionType nextActionType5 = new NextActionType("BlikAuthorize", 4, "blik_authorize");
            BlikAuthorize = nextActionType5;
            NextActionType nextActionType6 = new NextActionType("WeChatPayRedirect", 5, "wechat_pay_redirect_to_android_app");
            NextActionType nextActionType7 = new NextActionType("VerifyWithMicrodeposits", 6, "verify_with_microdeposits");
            VerifyWithMicrodeposits = nextActionType7;
            NextActionType nextActionType8 = new NextActionType("CashAppRedirect", 7, "cashapp_handle_redirect_or_display_qr_code");
            CashAppRedirect = nextActionType8;
            NextActionType nextActionType9 = new NextActionType("DisplayBoletoDetails", 8, "boleto_display_details");
            DisplayBoletoDetails = nextActionType9;
            NextActionType nextActionType10 = new NextActionType("DisplayKonbiniDetails", 9, "konbini_display_details");
            DisplayKonbiniDetails = nextActionType10;
            NextActionType nextActionType11 = new NextActionType("DisplayMultibancoDetails", 10, "multibanco_display_details");
            DisplayMultibancoDetails = nextActionType11;
            NextActionType nextActionType12 = new NextActionType("DisplayPayNowDetails", 11, "paynow_display_qr_code");
            DisplayPayNowDetails = nextActionType12;
            NextActionType nextActionType13 = new NextActionType("DisplayPromptPayDetails", 12, "promptpay_display_qr_code");
            DisplayPromptPayDetails = nextActionType13;
            NextActionType nextActionType14 = new NextActionType("SwishRedirect", 13, "swish_handle_redirect_or_display_qr_code");
            SwishRedirect = nextActionType14;
            NextActionType[] nextActionTypeArr = {nextActionType, nextActionType2, nextActionType3, nextActionType4, nextActionType5, nextActionType6, nextActionType7, nextActionType8, nextActionType9, nextActionType10, nextActionType11, nextActionType12, nextActionType13, nextActionType14};
            $VALUES = nextActionTypeArr;
            $ENTRIES = new EnumEntriesList(nextActionTypeArr);
            Companion = new Plane(14);
        }

        public NextActionType(String str, int i, String str2) {
            this.code = str2;
        }

        public static NextActionType valueOf(String str) {
            return (NextActionType) Enum.valueOf(NextActionType.class, str);
        }

        public static NextActionType[] values() {
            return (NextActionType[]) $VALUES.clone();
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.code;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006J\u000f\u0010\u0004\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"com/stripe/android/model/StripeIntent$Status", "", "Lcom/stripe/android/model/StripeIntent$Status;", "", "toString", "()Ljava/lang/String;", "io/noties/markwon/LinkResolverDef", "payments-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Status {
        public static final /* synthetic */ EnumEntriesList $ENTRIES;
        public static final /* synthetic */ Status[] $VALUES;
        public static final LinkResolverDef Companion;
        public static final Status Processing;
        public static final Status RequiresAction;
        public static final Status RequiresCapture;
        public static final Status RequiresConfirmation;
        public static final Status RequiresPaymentMethod;
        public static final Status Succeeded;
        public final String code;

        static {
            Status status = new Status("Canceled", 0, "canceled");
            Status status2 = new Status("Processing", 1, "processing");
            Processing = status2;
            Status status3 = new Status("RequiresAction", 2, "requires_action");
            RequiresAction = status3;
            Status status4 = new Status("RequiresConfirmation", 3, "requires_confirmation");
            RequiresConfirmation = status4;
            Status status5 = new Status("RequiresPaymentMethod", 4, "requires_payment_method");
            RequiresPaymentMethod = status5;
            Status status6 = new Status("Succeeded", 5, "succeeded");
            Succeeded = status6;
            Status status7 = new Status("RequiresCapture", 6, "requires_capture");
            RequiresCapture = status7;
            Status[] statusArr = {status, status2, status3, status4, status5, status6, status7};
            $VALUES = statusArr;
            $ENTRIES = new EnumEntriesList(statusArr);
            Companion = new LinkResolverDef(14);
        }

        public Status(String str, int i, String str2) {
            this.code = str2;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.code;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006J\u000f\u0010\u0004\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"com/stripe/android/model/StripeIntent$Usage", "", "Lcom/stripe/android/model/StripeIntent$Usage;", "", "toString", "()Ljava/lang/String;", "net/idrnd/face/iad/capture/internal/y0", "payments-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Usage {
        public static final /* synthetic */ EnumEntriesList $ENTRIES;
        public static final /* synthetic */ Usage[] $VALUES;
        public static final y0 Companion;
        public final String code;

        static {
            Usage[] usageArr = {new Usage("OnSession", 0, "on_session"), new Usage("OffSession", 1, "off_session"), new Usage("OneTime", 2, "one_time")};
            $VALUES = usageArr;
            $ENTRIES = new EnumEntriesList(usageArr);
            Companion = new y0();
        }

        public Usage(String str, int i, String str2) {
            this.code = str2;
        }

        public static Usage valueOf(String str) {
            return (Usage) Enum.valueOf(Usage.class, str);
        }

        public static Usage[] values() {
            return (Usage[]) $VALUES.clone();
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.code;
        }
    }

    String getClientSecret();

    String getId();

    NextActionData getNextActionData();

    NextActionType getNextActionType();

    PaymentMethod getPaymentMethod();

    String getPaymentMethodId();

    Status getStatus();

    boolean isLiveMode();

    boolean requiresAction();
}
