package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.stripe.android.core.model.CountryCode;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.financialconnections.ui.TextResource;
import com.stripe.android.model.AccountRange;
import com.stripe.android.model.BankAccount;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConsentUi;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.ConsumerSession;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class Card implements StripeModel, Parcelable {
    public static final Parcelable.Creator<Card> CREATOR = new Creator(0);
    public final String addressCity;
    public final String addressCountry;
    public final String addressLine1;
    public final String addressLine1Check;
    public final String addressLine2;
    public final String addressState;
    public final String addressZip;
    public final String addressZipCheck;
    public final CardBrand brand;
    public final String country;
    public final String currency;
    public final String customerId;
    public final String cvcCheck;
    public final Integer expMonth;
    public final Integer expYear;
    public final String fingerprint;
    public final CardFunding funding;
    public final String id;
    public final String last4;
    public final String name;
    public final TokenizationMethod tokenizationMethod;

    public final class Creator implements Parcelable.Creator {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Creator(int i) {
            this.$r8$classId = i;
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            Boolean valueOf;
            ConfirmPaymentIntentParams.Shipping shipping;
            RadarOptions createFromParcel;
            RadarOptions radarOptions;
            ClientAttributionMetadata createFromParcel2;
            LinkedHashMap linkedHashMap;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            switch (this.$r8$classId) {
                case 0:
                    parcel.getClass();
                    return new Card(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), CardBrand.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : CardFunding.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : TokenizationMethod.valueOf(parcel.readString()));
                case 1:
                    parcel.getClass();
                    return new TextResource.Text((CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel));
                case 2:
                    parcel.getClass();
                    return new AccountRange(BinRange.CREATOR.createFromParcel(parcel), parcel.readInt(), AccountRange.BrandInfo.valueOf(parcel.readString()), CardFunding.valueOf(parcel.readString()), parcel.readString());
                case 3:
                    parcel.getClass();
                    return new Address(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                case 4:
                    parcel.getClass();
                    return new AndroidVerificationObject(parcel.readString(), parcel.readString());
                case 5:
                    parcel.getClass();
                    return new AttachConsumerToLinkAccountSession(parcel.readString(), parcel.readString());
                case 6:
                    parcel.getClass();
                    return new BankAccount(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : BankAccount.Type.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : BankAccount.Status.valueOf(parcel.readString()));
                case 7:
                    parcel.getClass();
                    return new BinRange(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
                case 8:
                    parcel.getClass();
                    return new CancelCaptchaChallengeParams(parcel.readString());
                case 9:
                    parcel.getClass();
                    return new ClientAttributionMetadata(parcel.readString(), parcel.readInt() == 0 ? null : PaymentIntentCreationFlow.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : PaymentMethodSelectionFlow.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
                case 10:
                    parcel.getClass();
                    PaymentMethodCreateParams createFromParcel3 = parcel.readInt() == 0 ? null : PaymentMethodCreateParams.CREATOR.createFromParcel(parcel);
                    String readString = parcel.readString();
                    SourceParams createFromParcel4 = parcel.readInt() == 0 ? null : SourceParams.CREATOR.createFromParcel(parcel);
                    String readString2 = parcel.readString();
                    boolean z2 = true;
                    String readString3 = parcel.readString();
                    String readString4 = parcel.readString();
                    Boolean valueOf2 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                    if (parcel.readInt() != 0) {
                        z = true;
                    } else {
                        z = true;
                        z2 = false;
                    }
                    PaymentMethodOptionsParams$Card paymentMethodOptionsParams$Card = (PaymentMethodOptionsParams$Card) parcel.readParcelable(ConfirmPaymentIntentParams.class.getClassLoader());
                    Boolean bool = valueOf2;
                    String readString5 = parcel.readString();
                    MandateDataParams createFromParcel5 = parcel.readInt() == 0 ? null : MandateDataParams.CREATOR.createFromParcel(parcel);
                    ConfirmPaymentIntentParams.SetupFutureUsage valueOf3 = parcel.readInt() == 0 ? null : ConfirmPaymentIntentParams.SetupFutureUsage.valueOf(parcel.readString());
                    ConfirmPaymentIntentParams.Shipping createFromParcel6 = parcel.readInt() != 0 ? ConfirmPaymentIntentParams.Shipping.CREATOR.createFromParcel(parcel) : null;
                    boolean z3 = z;
                    String readString6 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        valueOf = null;
                    } else {
                        if (parcel.readInt() == 0) {
                            z3 = false;
                        }
                        valueOf = Boolean.valueOf(z3);
                    }
                    String readString7 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        shipping = createFromParcel6;
                        createFromParcel = null;
                    } else {
                        shipping = createFromParcel6;
                        createFromParcel = RadarOptions.CREATOR.createFromParcel(parcel);
                    }
                    RadarOptions radarOptions2 = createFromParcel;
                    if (parcel.readInt() == 0) {
                        radarOptions = radarOptions2;
                        createFromParcel2 = null;
                    } else {
                        radarOptions = radarOptions2;
                        createFromParcel2 = ClientAttributionMetadata.CREATOR.createFromParcel(parcel);
                    }
                    return new ConfirmPaymentIntentParams(createFromParcel3, readString, createFromParcel4, readString2, readString3, readString4, bool, z2, paymentMethodOptionsParams$Card, readString5, createFromParcel5, valueOf3, shipping, readString6, valueOf, readString7, radarOptions, createFromParcel2, parcel.readString());
                case 11:
                    parcel.getClass();
                    return new ConfirmPaymentIntentParams.Shipping(Address.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                case 12:
                    parcel.getClass();
                    return new ConfirmSetupIntentParams(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : PaymentMethodCreateParams.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : MandateDataParams.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), (PaymentMethodOptionsParams$Card) parcel.readParcelable(ConfirmSetupIntentParams.class.getClassLoader()), parcel.readInt() == 0 ? null : RadarOptions.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ClientAttributionMetadata.CREATOR.createFromParcel(parcel), parcel.readString());
                case 13:
                    parcel.getClass();
                    return new ConsentUi.ConsentPane(parcel.readString(), ConsentUi.ConsentPane.ScopesSection.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
                case 14:
                    parcel.getClass();
                    String readString8 = parcel.readString();
                    int readInt = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt);
                    while (i3 != readInt) {
                        i3 = CameraState$Type$EnumUnboxingLocalUtility.m(ConsentUi.ConsentPane.ScopesSection.Scope.CREATOR, parcel, arrayList, i3, 1);
                    }
                    return new ConsentUi.ConsentPane.ScopesSection(readString8, arrayList);
                case 15:
                    parcel.getClass();
                    return new ConsentUi.ConsentPane.ScopesSection.Scope(ConsentUi.Icon.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
                case 16:
                    parcel.getClass();
                    return new ConsentUi.ConsentSection(parcel.readString());
                case 17:
                    parcel.getClass();
                    return new ConsentUi(parcel.readInt() == 0 ? null : ConsentUi.ConsentPane.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ConsentUi.ConsentSection.CREATOR.createFromParcel(parcel));
                case 18:
                    parcel.getClass();
                    return new ConsentUi.Icon(parcel.readString());
                case 19:
                    parcel.getClass();
                    return new ConsumerPaymentDetails.BankAccount(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ConsumerPaymentDetails.BillingAddress.CREATOR.createFromParcel(parcel), parcel.readString());
                case 20:
                    parcel.getClass();
                    return new ConsumerPaymentDetails.BillingAddress(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (CountryCode) parcel.readParcelable(ConsumerPaymentDetails.BillingAddress.class.getClassLoader()));
                case 21:
                    parcel.getClass();
                    return new ConsumerPaymentDetails.Card(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : ConsumerPaymentDetails.BillingAddress.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt(), parcel.readInt(), CardBrand.valueOf(parcel.readString()), parcel.createStringArrayList(), CvcCheck.valueOf(parcel.readString()), ConsumerPaymentDetails.Card.Funding.valueOf(parcel.readString()));
                case 22:
                    parcel.getClass();
                    int readInt2 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt2);
                    while (i2 != readInt2) {
                        i2 = CameraState$Type$EnumUnboxingLocalUtility.m(ConsumerPaymentDetails.class, parcel, arrayList2, i2, 1);
                    }
                    return new ConsumerPaymentDetails(arrayList2);
                case 23:
                    parcel.getClass();
                    String readString9 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        linkedHashMap = null;
                    } else {
                        int readInt3 = parcel.readInt();
                        linkedHashMap = new LinkedHashMap(readInt3);
                        for (int i4 = 0; i4 != readInt3; i4++) {
                            linkedHashMap.put(parcel.readString(), parcel.readValue(ConsumerPaymentDetailsCreateParams$BankAccount.class.getClassLoader()));
                        }
                    }
                    String readString10 = parcel.readString();
                    int readInt4 = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt4);
                    for (int i5 = 0; i5 != readInt4; i5++) {
                        linkedHashMap2.put(parcel.readString(), parcel.readValue(ConsumerPaymentDetailsCreateParams$BankAccount.class.getClassLoader()));
                    }
                    return new ConsumerPaymentDetailsCreateParams$BankAccount(readString9, linkedHashMap, readString10, linkedHashMap2);
                case 24:
                    parcel.getClass();
                    return ConsumerSession.AuthenticationLevel.valueOf(parcel.readString());
                case 25:
                    parcel.getClass();
                    String readString11 = parcel.readString();
                    String readString12 = parcel.readString();
                    String readString13 = parcel.readString();
                    String readString14 = parcel.readString();
                    String readString15 = parcel.readString();
                    String readString16 = parcel.readString();
                    int readInt5 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(readInt5);
                    while (i != readInt5) {
                        i = CameraState$Type$EnumUnboxingLocalUtility.m(ConsumerSession.VerificationSession.CREATOR, parcel, arrayList3, i, 1);
                    }
                    return new ConsumerSession(readString11, readString12, readString13, readString14, readString15, readString16, arrayList3, parcel.readInt() == 0 ? null : MobileFallbackWebviewParams.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ConsumerSession.AuthenticationLevel.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ConsumerSession.AuthenticationLevel.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? LinkBrand.valueOf(parcel.readString()) : null);
                case 26:
                    parcel.getClass();
                    return new ConsumerSession.VerificationSession(ConsumerSession.VerificationSession.SessionType.CREATOR.createFromParcel(parcel), ConsumerSession.VerificationSession.SessionState.CREATOR.createFromParcel(parcel));
                case 27:
                    parcel.getClass();
                    return ConsumerSession.VerificationSession.SessionState.valueOf(parcel.readString());
                case 28:
                    parcel.getClass();
                    return ConsumerSession.VerificationSession.SessionType.valueOf(parcel.readString());
                default:
                    parcel.getClass();
                    return new ConsumerSessionLookup(parcel.readInt() != 0, parcel.readInt() == 0 ? null : ConsumerSession.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : DisplayablePaymentDetails.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ConsentUi.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0 ? LinkBrand.valueOf(parcel.readString()) : null);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new Card[i];
                case 1:
                    return new TextResource.Text[i];
                case 2:
                    return new AccountRange[i];
                case 3:
                    return new Address[i];
                case 4:
                    return new AndroidVerificationObject[i];
                case 5:
                    return new AttachConsumerToLinkAccountSession[i];
                case 6:
                    return new BankAccount[i];
                case 7:
                    return new BinRange[i];
                case 8:
                    return new CancelCaptchaChallengeParams[i];
                case 9:
                    return new ClientAttributionMetadata[i];
                case 10:
                    return new ConfirmPaymentIntentParams[i];
                case 11:
                    return new ConfirmPaymentIntentParams.Shipping[i];
                case 12:
                    return new ConfirmSetupIntentParams[i];
                case 13:
                    return new ConsentUi.ConsentPane[i];
                case 14:
                    return new ConsentUi.ConsentPane.ScopesSection[i];
                case 15:
                    return new ConsentUi.ConsentPane.ScopesSection.Scope[i];
                case 16:
                    return new ConsentUi.ConsentSection[i];
                case 17:
                    return new ConsentUi[i];
                case 18:
                    return new ConsentUi.Icon[i];
                case 19:
                    return new ConsumerPaymentDetails.BankAccount[i];
                case 20:
                    return new ConsumerPaymentDetails.BillingAddress[i];
                case 21:
                    return new ConsumerPaymentDetails.Card[i];
                case 22:
                    return new ConsumerPaymentDetails[i];
                case 23:
                    return new ConsumerPaymentDetailsCreateParams$BankAccount[i];
                case 24:
                    return new ConsumerSession.AuthenticationLevel[i];
                case 25:
                    return new ConsumerSession[i];
                case 26:
                    return new ConsumerSession.VerificationSession[i];
                case 27:
                    return new ConsumerSession.VerificationSession.SessionState[i];
                case 28:
                    return new ConsumerSession.VerificationSession.SessionType[i];
                default:
                    return new ConsumerSessionLookup[i];
            }
        }
    }

    public Card(Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, CardBrand cardBrand, CardFunding cardFunding, String str11, String str12, String str13, String str14, String str15, String str16, TokenizationMethod tokenizationMethod) {
        cardBrand.getClass();
        this.expMonth = num;
        this.expYear = num2;
        this.name = str;
        this.addressLine1 = str2;
        this.addressLine1Check = str3;
        this.addressLine2 = str4;
        this.addressCity = str5;
        this.addressState = str6;
        this.addressZip = str7;
        this.addressZipCheck = str8;
        this.addressCountry = str9;
        this.last4 = str10;
        this.brand = cardBrand;
        this.funding = cardFunding;
        this.fingerprint = str11;
        this.country = str12;
        this.currency = str13;
        this.customerId = str14;
        this.cvcCheck = str15;
        this.id = str16;
        this.tokenizationMethod = tokenizationMethod;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Card)) {
            return false;
        }
        Card card = (Card) obj;
        return Intrinsics.areEqual(this.expMonth, card.expMonth) && Intrinsics.areEqual(this.expYear, card.expYear) && Intrinsics.areEqual(this.name, card.name) && Intrinsics.areEqual(this.addressLine1, card.addressLine1) && Intrinsics.areEqual(this.addressLine1Check, card.addressLine1Check) && Intrinsics.areEqual(this.addressLine2, card.addressLine2) && Intrinsics.areEqual(this.addressCity, card.addressCity) && Intrinsics.areEqual(this.addressState, card.addressState) && Intrinsics.areEqual(this.addressZip, card.addressZip) && Intrinsics.areEqual(this.addressZipCheck, card.addressZipCheck) && Intrinsics.areEqual(this.addressCountry, card.addressCountry) && Intrinsics.areEqual(this.last4, card.last4) && this.brand == card.brand && this.funding == card.funding && Intrinsics.areEqual(this.fingerprint, card.fingerprint) && Intrinsics.areEqual(this.country, card.country) && Intrinsics.areEqual(this.currency, card.currency) && Intrinsics.areEqual(this.customerId, card.customerId) && Intrinsics.areEqual(this.cvcCheck, card.cvcCheck) && Intrinsics.areEqual(this.id, card.id) && this.tokenizationMethod == card.tokenizationMethod;
    }

    public final int hashCode() {
        Integer num = this.expMonth;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.expYear;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.name;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.addressLine1;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.addressLine1Check;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.addressLine2;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.addressCity;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.addressState;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.addressZip;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.addressZipCheck;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.addressCountry;
        int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.last4;
        int hashCode12 = (this.brand.hashCode() + ((hashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31)) * 31;
        CardFunding cardFunding = this.funding;
        int hashCode13 = (hashCode12 + (cardFunding == null ? 0 : cardFunding.hashCode())) * 31;
        String str11 = this.fingerprint;
        int hashCode14 = (hashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.country;
        int hashCode15 = (hashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.currency;
        int hashCode16 = (hashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.customerId;
        int hashCode17 = (hashCode16 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.cvcCheck;
        int hashCode18 = (hashCode17 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.id;
        int hashCode19 = (hashCode18 + (str16 == null ? 0 : str16.hashCode())) * 31;
        TokenizationMethod tokenizationMethod = this.tokenizationMethod;
        return hashCode19 + (tokenizationMethod != null ? tokenizationMethod.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Card(expMonth=");
        sb.append(this.expMonth);
        sb.append(", expYear=");
        sb.append(this.expYear);
        sb.append(", name=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.name, ", addressLine1=", this.addressLine1, ", addressLine1Check=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.addressLine1Check, ", addressLine2=", this.addressLine2, ", addressCity=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.addressCity, ", addressState=", this.addressState, ", addressZip=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.addressZip, ", addressZipCheck=", this.addressZipCheck, ", addressCountry=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.addressCountry, ", last4=", this.last4, ", brand=");
        sb.append(this.brand);
        sb.append(", funding=");
        sb.append(this.funding);
        sb.append(", fingerprint=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.fingerprint, ", country=", this.country, ", currency=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.currency, ", customerId=", this.customerId, ", cvcCheck=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.cvcCheck, ", id=", this.id, ", tokenizationMethod=");
        sb.append(this.tokenizationMethod);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Integer num = this.expMonth;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num);
        }
        Integer num2 = this.expYear;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num2);
        }
        parcel.writeString(this.name);
        parcel.writeString(this.addressLine1);
        parcel.writeString(this.addressLine1Check);
        parcel.writeString(this.addressLine2);
        parcel.writeString(this.addressCity);
        parcel.writeString(this.addressState);
        parcel.writeString(this.addressZip);
        parcel.writeString(this.addressZipCheck);
        parcel.writeString(this.addressCountry);
        parcel.writeString(this.last4);
        parcel.writeString(this.brand.name());
        CardFunding cardFunding = this.funding;
        if (cardFunding == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(cardFunding.name());
        }
        parcel.writeString(this.fingerprint);
        parcel.writeString(this.country);
        parcel.writeString(this.currency);
        parcel.writeString(this.customerId);
        parcel.writeString(this.cvcCheck);
        parcel.writeString(this.id);
        TokenizationMethod tokenizationMethod = this.tokenizationMethod;
        if (tokenizationMethod == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(tokenizationMethod.name());
        }
    }
}
