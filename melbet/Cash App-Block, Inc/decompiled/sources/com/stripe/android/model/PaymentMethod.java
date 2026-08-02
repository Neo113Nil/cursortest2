package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.datadog.android.rum.RumErrorSource$EnumUnboxingLocalUtility;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.Source;
import com.stripe.android.model.wallets.Wallet;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.internal.Intrinsics;
import net.idrnd.face.iad.capture.internal.y0;

/* loaded from: classes8.dex */
public final class PaymentMethod implements StripeModel {
    public static final Parcelable.Creator<PaymentMethod> CREATOR = new PaymentIntent.Creator(28);
    public final AllowRedisplay allowRedisplay;
    public final AuBecsDebit auBecsDebit;
    public final BacsDebit bacsDebit;
    public final BillingDetails billingDetails;
    public final Card card;
    public final CardPresent cardPresent;
    public final String code;
    public final Long created;
    public final String customerId;
    public final Fpx fpx;
    public final String id;
    public final Ideal ideal;
    public final boolean isLinkPassthroughMode;
    public final boolean liveMode;
    public final Netbanking netbanking;
    public final SepaDebit sepaDebit;

    /* renamed from: type, reason: collision with root package name */
    public final Type f1440type;
    public final USBankAccount usBankAccount;

    public interface AfterRedirectAction extends Parcelable {

        public final class None implements AfterRedirectAction {
            public static final None INSTANCE = new None();
            public static final Parcelable.Creator<None> CREATOR = new PaymentIntent.Creator(14);

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.stripe.android.model.PaymentMethod.AfterRedirectAction
            public final long getPollingDuration() {
                return 15000L;
            }

            @Override // com.stripe.android.model.PaymentMethod.AfterRedirectAction
            public final boolean getShouldRefreshOrRetrieve() {
                return false;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeInt(1);
            }
        }

        public final class Poll implements AfterRedirectAction {
            public static final Parcelable.Creator<Poll> CREATOR = new PaymentIntent.Creator(15);
            public final long pollingDuration;

            public Poll(long j) {
                this.pollingDuration = j;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Poll) && this.pollingDuration == ((Poll) obj).pollingDuration;
            }

            @Override // com.stripe.android.model.PaymentMethod.AfterRedirectAction
            public final long getPollingDuration() {
                return this.pollingDuration;
            }

            @Override // com.stripe.android.model.PaymentMethod.AfterRedirectAction
            public final boolean getShouldRefreshOrRetrieve() {
                return true;
            }

            public final int hashCode() {
                return Long.hashCode(this.pollingDuration);
            }

            public final String toString() {
                return Boxes$$ExternalSyntheticOutline1.m(this.pollingDuration, "Poll(pollingDuration=", ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeLong(this.pollingDuration);
            }
        }

        public final class Refresh implements AfterRedirectAction {
            public static final Refresh INSTANCE = new Refresh();
            public static final Parcelable.Creator<Refresh> CREATOR = new PaymentIntent.Creator(16);

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Refresh);
            }

            @Override // com.stripe.android.model.PaymentMethod.AfterRedirectAction
            public final long getPollingDuration() {
                return 0L;
            }

            @Override // com.stripe.android.model.PaymentMethod.AfterRedirectAction
            public final boolean getShouldRefreshOrRetrieve() {
                return true;
            }

            public final int hashCode() {
                return 436825404;
            }

            public final String toString() {
                return "Refresh";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeInt(1);
            }
        }

        long getPollingDuration();

        boolean getShouldRefreshOrRetrieve();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class AllowRedisplay implements StripeModel {
        public static final /* synthetic */ EnumEntriesList $ENTRIES;
        public static final /* synthetic */ AllowRedisplay[] $VALUES;
        public static final Parcelable.Creator<AllowRedisplay> CREATOR;
        public final String value;

        static {
            AllowRedisplay[] allowRedisplayArr = {new AllowRedisplay("UNSPECIFIED", 0, "unspecified"), new AllowRedisplay("LIMITED", 1, "limited"), new AllowRedisplay("ALWAYS", 2, "always")};
            $VALUES = allowRedisplayArr;
            $ENTRIES = new EnumEntriesList(allowRedisplayArr);
            CREATOR = new PaymentIntent.Creator(17);
        }

        public AllowRedisplay(String str, int i, String str2) {
            this.value = str2;
        }

        public static AllowRedisplay valueOf(String str) {
            return (AllowRedisplay) Enum.valueOf(AllowRedisplay.class, str);
        }

        public static AllowRedisplay[] values() {
            return (AllowRedisplay[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(name());
        }
    }

    public final class AuBecsDebit extends TypeData {
        public static final Parcelable.Creator<AuBecsDebit> CREATOR = new PaymentIntent.Creator(18);
        public final String bsbNumber;
        public final String fingerprint;
        public final String last4;

        public AuBecsDebit(String str, String str2, String str3) {
            this.bsbNumber = str;
            this.fingerprint = str2;
            this.last4 = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AuBecsDebit)) {
                return false;
            }
            AuBecsDebit auBecsDebit = (AuBecsDebit) obj;
            return Intrinsics.areEqual(this.bsbNumber, auBecsDebit.bsbNumber) && Intrinsics.areEqual(this.fingerprint, auBecsDebit.fingerprint) && Intrinsics.areEqual(this.last4, auBecsDebit.last4);
        }

        public final int hashCode() {
            String str = this.bsbNumber;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.fingerprint;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.last4;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AuBecsDebit(bsbNumber=", this.bsbNumber, ", fingerprint=", this.fingerprint, ", last4="), this.last4, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.bsbNumber);
            parcel.writeString(this.fingerprint);
            parcel.writeString(this.last4);
        }
    }

    public final class BacsDebit extends TypeData {
        public static final Parcelable.Creator<BacsDebit> CREATOR = new PaymentIntent.Creator(19);
        public final String fingerprint;
        public final String last4;
        public final String sortCode;

        public BacsDebit(String str, String str2, String str3) {
            this.fingerprint = str;
            this.last4 = str2;
            this.sortCode = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BacsDebit)) {
                return false;
            }
            BacsDebit bacsDebit = (BacsDebit) obj;
            return Intrinsics.areEqual(this.fingerprint, bacsDebit.fingerprint) && Intrinsics.areEqual(this.last4, bacsDebit.last4) && Intrinsics.areEqual(this.sortCode, bacsDebit.sortCode);
        }

        public final int hashCode() {
            String str = this.fingerprint;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.last4;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.sortCode;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BacsDebit(fingerprint=", this.fingerprint, ", last4=", this.last4, ", sortCode="), this.sortCode, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.fingerprint);
            parcel.writeString(this.last4);
            parcel.writeString(this.sortCode);
        }
    }

    public final class Card extends TypeData {
        public static final Parcelable.Creator<Card> CREATOR = new PaymentIntent.Creator(24);
        public final CardBrand brand;
        public final CardArt cardArt;
        public final Checks checks;
        public final String country;
        public final String displayBrand;
        public final Integer expiryMonth;
        public final Integer expiryYear;
        public final String fingerprint;
        public final String funding;
        public final String last4;
        public final Networks networks;
        public final ThreeDSecureUsage threeDSecureUsage;
        public final Wallet wallet;

        public final class CardArt implements StripeModel {
            public static final Parcelable.Creator<CardArt> CREATOR = new PaymentIntent.Creator(22);
            public final ArtImage artImage;
            public final String programName;

            public final class ArtImage implements StripeModel {
                public static final Parcelable.Creator<ArtImage> CREATOR = new PaymentIntent.Creator(21);

                /* renamed from: format, reason: collision with root package name */
                public final String f1441format;
                public final String url;

                public ArtImage(String str, String str2) {
                    str.getClass();
                    str2.getClass();
                    this.f1441format = str;
                    this.url = str2;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof ArtImage)) {
                        return false;
                    }
                    ArtImage artImage = (ArtImage) obj;
                    return Intrinsics.areEqual(this.f1441format, artImage.f1441format) && Intrinsics.areEqual(this.url, artImage.url);
                }

                public final int hashCode() {
                    return this.url.hashCode() + (this.f1441format.hashCode() * 31);
                }

                public final String toString() {
                    return Boxes$$ExternalSyntheticOutline1.m("ArtImage(format=", this.f1441format, ", url=", this.url, ")");
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeString(this.f1441format);
                    parcel.writeString(this.url);
                }
            }

            public CardArt(ArtImage artImage, String str) {
                this.artImage = artImage;
                this.programName = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CardArt)) {
                    return false;
                }
                CardArt cardArt = (CardArt) obj;
                return Intrinsics.areEqual(this.artImage, cardArt.artImage) && Intrinsics.areEqual(this.programName, cardArt.programName);
            }

            public final int hashCode() {
                ArtImage artImage = this.artImage;
                int hashCode = (artImage == null ? 0 : artImage.hashCode()) * 31;
                String str = this.programName;
                return hashCode + (str != null ? str.hashCode() : 0);
            }

            public final String toString() {
                return "CardArt(artImage=" + this.artImage + ", programName=" + this.programName + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                ArtImage artImage = this.artImage;
                if (artImage == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    artImage.writeToParcel(parcel, i);
                }
                parcel.writeString(this.programName);
            }
        }

        public final class Checks implements StripeModel {
            public static final Parcelable.Creator<Checks> CREATOR = new PaymentIntent.Creator(23);
            public final String addressLine1Check;
            public final String addressPostalCodeCheck;
            public final String cvcCheck;

            public Checks(String str, String str2, String str3) {
                this.addressLine1Check = str;
                this.addressPostalCodeCheck = str2;
                this.cvcCheck = str3;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Checks)) {
                    return false;
                }
                Checks checks = (Checks) obj;
                return Intrinsics.areEqual(this.addressLine1Check, checks.addressLine1Check) && Intrinsics.areEqual(this.addressPostalCodeCheck, checks.addressPostalCodeCheck) && Intrinsics.areEqual(this.cvcCheck, checks.cvcCheck);
            }

            public final int hashCode() {
                String str = this.addressLine1Check;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.addressPostalCodeCheck;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.cvcCheck;
                return hashCode2 + (str3 != null ? str3.hashCode() : 0);
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Checks(addressLine1Check=", this.addressLine1Check, ", addressPostalCodeCheck=", this.addressPostalCodeCheck, ", cvcCheck="), this.cvcCheck, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.addressLine1Check);
                parcel.writeString(this.addressPostalCodeCheck);
                parcel.writeString(this.cvcCheck);
            }
        }

        public final class Networks implements StripeModel {
            public static final Parcelable.Creator<Networks> CREATOR = new PaymentIntent.Creator(25);
            public final Set available;
            public final String preferred;
            public final boolean selectionMandatory;

            public Networks(String str, Set set, boolean z) {
                set.getClass();
                this.available = set;
                this.selectionMandatory = z;
                this.preferred = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Networks)) {
                    return false;
                }
                Networks networks = (Networks) obj;
                return Intrinsics.areEqual(this.available, networks.available) && this.selectionMandatory == networks.selectionMandatory && Intrinsics.areEqual(this.preferred, networks.preferred);
            }

            public final int hashCode() {
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.available.hashCode() * 31, 31, this.selectionMandatory);
                String str = this.preferred;
                return m + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Networks(available=");
                sb.append(this.available);
                sb.append(", selectionMandatory=");
                sb.append(this.selectionMandatory);
                sb.append(", preferred=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.preferred, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                Set set = this.available;
                parcel.writeInt(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    parcel.writeString((String) it.next());
                }
                parcel.writeInt(this.selectionMandatory ? 1 : 0);
                parcel.writeString(this.preferred);
            }
        }

        public final class ThreeDSecureUsage implements StripeModel {
            public static final Parcelable.Creator<ThreeDSecureUsage> CREATOR = new PaymentIntent.Creator(26);
            public final boolean isSupported;

            public ThreeDSecureUsage(boolean z) {
                this.isSupported = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ThreeDSecureUsage) && this.isSupported == ((ThreeDSecureUsage) obj).isSupported;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.isSupported);
            }

            public final String toString() {
                return Fragment$5$$ExternalSyntheticOutline0.m("ThreeDSecureUsage(isSupported=", ")", this.isSupported);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeInt(this.isSupported ? 1 : 0);
            }
        }

        public Card(CardBrand cardBrand, Checks checks, String str, Integer num, Integer num2, String str2, String str3, String str4, ThreeDSecureUsage threeDSecureUsage, Wallet wallet, Networks networks, String str5, CardArt cardArt) {
            cardBrand.getClass();
            this.brand = cardBrand;
            this.checks = checks;
            this.country = str;
            this.expiryMonth = num;
            this.expiryYear = num2;
            this.fingerprint = str2;
            this.funding = str3;
            this.last4 = str4;
            this.threeDSecureUsage = threeDSecureUsage;
            this.wallet = wallet;
            this.networks = networks;
            this.displayBrand = str5;
            this.cardArt = cardArt;
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
            return this.brand == card.brand && Intrinsics.areEqual(this.checks, card.checks) && Intrinsics.areEqual(this.country, card.country) && Intrinsics.areEqual(this.expiryMonth, card.expiryMonth) && Intrinsics.areEqual(this.expiryYear, card.expiryYear) && Intrinsics.areEqual(this.fingerprint, card.fingerprint) && Intrinsics.areEqual(this.funding, card.funding) && Intrinsics.areEqual(this.last4, card.last4) && Intrinsics.areEqual(this.threeDSecureUsage, card.threeDSecureUsage) && Intrinsics.areEqual(this.wallet, card.wallet) && Intrinsics.areEqual(this.networks, card.networks) && Intrinsics.areEqual(this.displayBrand, card.displayBrand) && Intrinsics.areEqual(this.cardArt, card.cardArt);
        }

        public final int hashCode() {
            int hashCode = this.brand.hashCode() * 31;
            Checks checks = this.checks;
            int hashCode2 = (hashCode + (checks == null ? 0 : checks.hashCode())) * 31;
            String str = this.country;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.expiryMonth;
            int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.expiryYear;
            int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str2 = this.fingerprint;
            int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.funding;
            int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.last4;
            int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
            ThreeDSecureUsage threeDSecureUsage = this.threeDSecureUsage;
            int hashCode9 = (hashCode8 + (threeDSecureUsage == null ? 0 : Boolean.hashCode(threeDSecureUsage.isSupported))) * 31;
            Wallet wallet = this.wallet;
            int hashCode10 = (hashCode9 + (wallet == null ? 0 : wallet.hashCode())) * 31;
            Networks networks = this.networks;
            int hashCode11 = (hashCode10 + (networks == null ? 0 : networks.hashCode())) * 31;
            String str5 = this.displayBrand;
            int hashCode12 = (hashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
            CardArt cardArt = this.cardArt;
            return hashCode12 + (cardArt != null ? cardArt.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Card(brand=");
            sb.append(this.brand);
            sb.append(", checks=");
            sb.append(this.checks);
            sb.append(", country=");
            NavAction$$ExternalSyntheticOutline0.m(sb, this.country, ", expiryMonth=", this.expiryMonth, ", expiryYear=");
            NavAction$$ExternalSyntheticOutline0.m(sb, this.expiryYear, ", fingerprint=", this.fingerprint, ", funding=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.funding, ", last4=", this.last4, ", threeDSecureUsage=");
            sb.append(this.threeDSecureUsage);
            sb.append(", wallet=");
            sb.append(this.wallet);
            sb.append(", networks=");
            sb.append(this.networks);
            sb.append(", displayBrand=");
            sb.append(this.displayBrand);
            sb.append(", cardArt=");
            sb.append(this.cardArt);
            sb.append(")");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.brand.name());
            Checks checks = this.checks;
            if (checks == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                checks.writeToParcel(parcel, i);
            }
            parcel.writeString(this.country);
            Integer num = this.expiryMonth;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num);
            }
            Integer num2 = this.expiryYear;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num2);
            }
            parcel.writeString(this.fingerprint);
            parcel.writeString(this.funding);
            parcel.writeString(this.last4);
            ThreeDSecureUsage threeDSecureUsage = this.threeDSecureUsage;
            if (threeDSecureUsage == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(threeDSecureUsage.isSupported ? 1 : 0);
            }
            parcel.writeParcelable(this.wallet, i);
            Networks networks = this.networks;
            if (networks == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                networks.writeToParcel(parcel, i);
            }
            parcel.writeString(this.displayBrand);
            CardArt cardArt = this.cardArt;
            if (cardArt == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                cardArt.writeToParcel(parcel, i);
            }
        }
    }

    public final class CardPresent extends TypeData {
        public static final Parcelable.Creator<CardPresent> CREATOR = new PaymentIntent.Creator(27);
        public static final /* synthetic */ CardPresent EMPTY = new CardPresent(true);
        public final boolean ignore;

        public CardPresent(boolean z) {
            this.ignore = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CardPresent) && this.ignore == ((CardPresent) obj).ignore;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.ignore);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("CardPresent(ignore=", ")", this.ignore);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.ignore ? 1 : 0);
        }
    }

    public final class Fpx extends TypeData {
        public static final Parcelable.Creator<Fpx> CREATOR = new PaymentIntent.Creator(29);
        public final String accountHolderType;
        public final String bank;

        public Fpx(String str, String str2) {
            this.bank = str;
            this.accountHolderType = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Fpx)) {
                return false;
            }
            Fpx fpx = (Fpx) obj;
            return Intrinsics.areEqual(this.bank, fpx.bank) && Intrinsics.areEqual(this.accountHolderType, fpx.accountHolderType);
        }

        public final int hashCode() {
            String str = this.bank;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.accountHolderType;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("Fpx(bank=", this.bank, ", accountHolderType=", this.accountHolderType, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.bank);
            parcel.writeString(this.accountHolderType);
        }
    }

    public final class Ideal extends TypeData {
        public static final Parcelable.Creator<Ideal> CREATOR = new Source.Creator(1);
        public final String bank;
        public final String bankIdentifierCode;

        public Ideal(String str, String str2) {
            this.bank = str;
            this.bankIdentifierCode = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Ideal)) {
                return false;
            }
            Ideal ideal = (Ideal) obj;
            return Intrinsics.areEqual(this.bank, ideal.bank) && Intrinsics.areEqual(this.bankIdentifierCode, ideal.bankIdentifierCode);
        }

        public final int hashCode() {
            String str = this.bank;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.bankIdentifierCode;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("Ideal(bank=", this.bank, ", bankIdentifierCode=", this.bankIdentifierCode, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.bank);
            parcel.writeString(this.bankIdentifierCode);
        }
    }

    public final class Netbanking extends TypeData {
        public static final Parcelable.Creator<Netbanking> CREATOR = new Source.Creator(2);
        public final String bank;

        public Netbanking(String str) {
            this.bank = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Netbanking) && Intrinsics.areEqual(this.bank, ((Netbanking) obj).bank);
        }

        public final int hashCode() {
            String str = this.bank;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Netbanking(bank=", this.bank, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.bank);
        }
    }

    public final class SepaDebit extends TypeData {
        public static final Parcelable.Creator<SepaDebit> CREATOR = new Source.Creator(3);
        public final String bankCode;
        public final String branchCode;
        public final String country;
        public final String fingerprint;
        public final String last4;

        public SepaDebit(String str, String str2, String str3, String str4, String str5) {
            this.bankCode = str;
            this.branchCode = str2;
            this.country = str3;
            this.fingerprint = str4;
            this.last4 = str5;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SepaDebit)) {
                return false;
            }
            SepaDebit sepaDebit = (SepaDebit) obj;
            return Intrinsics.areEqual(this.bankCode, sepaDebit.bankCode) && Intrinsics.areEqual(this.branchCode, sepaDebit.branchCode) && Intrinsics.areEqual(this.country, sepaDebit.country) && Intrinsics.areEqual(this.fingerprint, sepaDebit.fingerprint) && Intrinsics.areEqual(this.last4, sepaDebit.last4);
        }

        public final int hashCode() {
            String str = this.bankCode;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.branchCode;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.country;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.fingerprint;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.last4;
            return hashCode4 + (str5 != null ? str5.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SepaDebit(bankCode=", this.bankCode, ", branchCode=", this.branchCode, ", country=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.country, ", fingerprint=", this.fingerprint, ", last4=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.last4, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.bankCode);
            parcel.writeString(this.branchCode);
            parcel.writeString(this.country);
            parcel.writeString(this.fingerprint);
            parcel.writeString(this.last4);
        }
    }

    public abstract class TypeData implements StripeModel {
    }

    public final class USBankAccount extends TypeData {
        public static final Parcelable.Creator<USBankAccount> CREATOR = new Source.Creator(5);
        public final USBankAccountHolderType accountHolderType;
        public final USBankAccountType accountType;
        public final String bankName;
        public final String financialConnectionsAccount;
        public final String fingerprint;
        public final String last4;
        public final USBankNetworks networks;
        public final String routingNumber;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class USBankAccountHolderType implements StripeModel {
            public static final /* synthetic */ EnumEntriesList $ENTRIES;
            public static final /* synthetic */ USBankAccountHolderType[] $VALUES;
            public static final Parcelable.Creator<USBankAccountHolderType> CREATOR;
            public static final USBankAccountHolderType UNKNOWN;
            public final String value;

            static {
                USBankAccountHolderType uSBankAccountHolderType = new USBankAccountHolderType("UNKNOWN", 0, "unknown");
                UNKNOWN = uSBankAccountHolderType;
                USBankAccountHolderType[] uSBankAccountHolderTypeArr = {uSBankAccountHolderType, new USBankAccountHolderType("INDIVIDUAL", 1, "individual"), new USBankAccountHolderType("COMPANY", 2, "company")};
                $VALUES = uSBankAccountHolderTypeArr;
                $ENTRIES = new EnumEntriesList(uSBankAccountHolderTypeArr);
                CREATOR = new Source.Creator(6);
            }

            public USBankAccountHolderType(String str, int i, String str2) {
                this.value = str2;
            }

            public static USBankAccountHolderType valueOf(String str) {
                return (USBankAccountHolderType) Enum.valueOf(USBankAccountHolderType.class, str);
            }

            public static USBankAccountHolderType[] values() {
                return (USBankAccountHolderType[]) $VALUES.clone();
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(name());
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class USBankAccountType implements StripeModel {
            public static final /* synthetic */ EnumEntriesList $ENTRIES;
            public static final /* synthetic */ USBankAccountType[] $VALUES;
            public static final Parcelable.Creator<USBankAccountType> CREATOR;
            public static final USBankAccountType UNKNOWN;
            public final String value;

            static {
                USBankAccountType uSBankAccountType = new USBankAccountType("UNKNOWN", 0, "unknown");
                UNKNOWN = uSBankAccountType;
                USBankAccountType[] uSBankAccountTypeArr = {uSBankAccountType, new USBankAccountType("CHECKING", 1, "checking"), new USBankAccountType("SAVINGS", 2, "savings")};
                $VALUES = uSBankAccountTypeArr;
                $ENTRIES = new EnumEntriesList(uSBankAccountTypeArr);
                CREATOR = new Source.Creator(7);
            }

            public USBankAccountType(String str, int i, String str2) {
                this.value = str2;
            }

            public static USBankAccountType valueOf(String str) {
                return (USBankAccountType) Enum.valueOf(USBankAccountType.class, str);
            }

            public static USBankAccountType[] values() {
                return (USBankAccountType[]) $VALUES.clone();
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(name());
            }
        }

        public final class USBankNetworks implements StripeModel {
            public static final Parcelable.Creator<USBankNetworks> CREATOR = new Source.Creator(8);
            public final String preferred;
            public final List supported;

            public USBankNetworks(String str, ArrayList arrayList) {
                arrayList.getClass();
                this.preferred = str;
                this.supported = arrayList;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof USBankNetworks)) {
                    return false;
                }
                USBankNetworks uSBankNetworks = (USBankNetworks) obj;
                return Intrinsics.areEqual(this.preferred, uSBankNetworks.preferred) && Intrinsics.areEqual(this.supported, uSBankNetworks.supported);
            }

            public final int hashCode() {
                String str = this.preferred;
                return this.supported.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
            }

            public final String toString() {
                return CameraState$Type$EnumUnboxingLocalUtility.m("USBankNetworks(preferred=", this.preferred, ", supported=", ")", this.supported);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.preferred);
                parcel.writeStringList(this.supported);
            }
        }

        public USBankAccount(USBankAccountHolderType uSBankAccountHolderType, USBankAccountType uSBankAccountType, String str, String str2, String str3, String str4, USBankNetworks uSBankNetworks, String str5) {
            uSBankAccountHolderType.getClass();
            uSBankAccountType.getClass();
            this.accountHolderType = uSBankAccountHolderType;
            this.accountType = uSBankAccountType;
            this.bankName = str;
            this.fingerprint = str2;
            this.last4 = str3;
            this.financialConnectionsAccount = str4;
            this.networks = uSBankNetworks;
            this.routingNumber = str5;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof USBankAccount)) {
                return false;
            }
            USBankAccount uSBankAccount = (USBankAccount) obj;
            return this.accountHolderType == uSBankAccount.accountHolderType && this.accountType == uSBankAccount.accountType && Intrinsics.areEqual(this.bankName, uSBankAccount.bankName) && Intrinsics.areEqual(this.fingerprint, uSBankAccount.fingerprint) && Intrinsics.areEqual(this.last4, uSBankAccount.last4) && Intrinsics.areEqual(this.financialConnectionsAccount, uSBankAccount.financialConnectionsAccount) && Intrinsics.areEqual(this.networks, uSBankAccount.networks) && Intrinsics.areEqual(this.routingNumber, uSBankAccount.routingNumber);
        }

        public final int hashCode() {
            int hashCode = (this.accountType.hashCode() + (this.accountHolderType.hashCode() * 31)) * 31;
            String str = this.bankName;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.fingerprint;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.last4;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.financialConnectionsAccount;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            USBankNetworks uSBankNetworks = this.networks;
            int hashCode6 = (hashCode5 + (uSBankNetworks == null ? 0 : uSBankNetworks.hashCode())) * 31;
            String str5 = this.routingNumber;
            return hashCode6 + (str5 != null ? str5.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("USBankAccount(accountHolderType=");
            sb.append(this.accountHolderType);
            sb.append(", accountType=");
            sb.append(this.accountType);
            sb.append(", bankName=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.bankName, ", fingerprint=", this.fingerprint, ", last4=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.last4, ", financialConnectionsAccount=", this.financialConnectionsAccount, ", networks=");
            sb.append(this.networks);
            sb.append(", routingNumber=");
            sb.append(this.routingNumber);
            sb.append(")");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.accountHolderType.writeToParcel(parcel, i);
            this.accountType.writeToParcel(parcel, i);
            parcel.writeString(this.bankName);
            parcel.writeString(this.fingerprint);
            parcel.writeString(this.last4);
            parcel.writeString(this.financialConnectionsAccount);
            USBankNetworks uSBankNetworks = this.networks;
            if (uSBankNetworks == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                uSBankNetworks.writeToParcel(parcel, i);
            }
            parcel.writeString(this.routingNumber);
        }
    }

    public PaymentMethod(String str, Long l, boolean z, String str2, Type type2, BillingDetails billingDetails, String str3, Card card, CardPresent cardPresent, Fpx fpx, Ideal ideal, SepaDebit sepaDebit, AuBecsDebit auBecsDebit, BacsDebit bacsDebit, Netbanking netbanking, USBankAccount uSBankAccount, boolean z2, AllowRedisplay allowRedisplay) {
        str.getClass();
        this.id = str;
        this.created = l;
        this.liveMode = z;
        this.code = str2;
        this.f1440type = type2;
        this.billingDetails = billingDetails;
        this.customerId = str3;
        this.card = card;
        this.cardPresent = cardPresent;
        this.fpx = fpx;
        this.ideal = ideal;
        this.sepaDebit = sepaDebit;
        this.auBecsDebit = auBecsDebit;
        this.bacsDebit = bacsDebit;
        this.netbanking = netbanking;
        this.usBankAccount = uSBankAccount;
        this.isLinkPassthroughMode = z2;
        this.allowRedisplay = allowRedisplay;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentMethod)) {
            return false;
        }
        PaymentMethod paymentMethod = (PaymentMethod) obj;
        return Intrinsics.areEqual(this.id, paymentMethod.id) && Intrinsics.areEqual(this.created, paymentMethod.created) && this.liveMode == paymentMethod.liveMode && Intrinsics.areEqual(this.code, paymentMethod.code) && this.f1440type == paymentMethod.f1440type && Intrinsics.areEqual(this.billingDetails, paymentMethod.billingDetails) && Intrinsics.areEqual(this.customerId, paymentMethod.customerId) && Intrinsics.areEqual(this.card, paymentMethod.card) && Intrinsics.areEqual(this.cardPresent, paymentMethod.cardPresent) && Intrinsics.areEqual(this.fpx, paymentMethod.fpx) && Intrinsics.areEqual(this.ideal, paymentMethod.ideal) && Intrinsics.areEqual(this.sepaDebit, paymentMethod.sepaDebit) && Intrinsics.areEqual(this.auBecsDebit, paymentMethod.auBecsDebit) && Intrinsics.areEqual(this.bacsDebit, paymentMethod.bacsDebit) && Intrinsics.areEqual(this.netbanking, paymentMethod.netbanking) && Intrinsics.areEqual(this.usBankAccount, paymentMethod.usBankAccount) && this.isLinkPassthroughMode == paymentMethod.isLinkPassthroughMode && this.allowRedisplay == paymentMethod.allowRedisplay;
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        Long l = this.created;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (l == null ? 0 : l.hashCode())) * 31, 31, this.liveMode);
        String str = this.code;
        int hashCode2 = (m + (str == null ? 0 : str.hashCode())) * 31;
        Type type2 = this.f1440type;
        int hashCode3 = (hashCode2 + (type2 == null ? 0 : type2.hashCode())) * 31;
        BillingDetails billingDetails = this.billingDetails;
        int hashCode4 = (hashCode3 + (billingDetails == null ? 0 : billingDetails.hashCode())) * 31;
        String str2 = this.customerId;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Card card = this.card;
        int hashCode6 = (hashCode5 + (card == null ? 0 : card.hashCode())) * 31;
        CardPresent cardPresent = this.cardPresent;
        int hashCode7 = (hashCode6 + (cardPresent == null ? 0 : Boolean.hashCode(cardPresent.ignore))) * 31;
        Fpx fpx = this.fpx;
        int hashCode8 = (hashCode7 + (fpx == null ? 0 : fpx.hashCode())) * 31;
        Ideal ideal = this.ideal;
        int hashCode9 = (hashCode8 + (ideal == null ? 0 : ideal.hashCode())) * 31;
        SepaDebit sepaDebit = this.sepaDebit;
        int hashCode10 = (hashCode9 + (sepaDebit == null ? 0 : sepaDebit.hashCode())) * 31;
        AuBecsDebit auBecsDebit = this.auBecsDebit;
        int hashCode11 = (hashCode10 + (auBecsDebit == null ? 0 : auBecsDebit.hashCode())) * 31;
        BacsDebit bacsDebit = this.bacsDebit;
        int hashCode12 = (hashCode11 + (bacsDebit == null ? 0 : bacsDebit.hashCode())) * 31;
        Netbanking netbanking = this.netbanking;
        int hashCode13 = (hashCode12 + (netbanking == null ? 0 : netbanking.hashCode())) * 31;
        USBankAccount uSBankAccount = this.usBankAccount;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode13 + (uSBankAccount == null ? 0 : uSBankAccount.hashCode())) * 961, 31, this.isLinkPassthroughMode);
        AllowRedisplay allowRedisplay = this.allowRedisplay;
        return m2 + (allowRedisplay != null ? allowRedisplay.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = RumErrorSource$EnumUnboxingLocalUtility.m(this.created, "PaymentMethod(id=", this.id, ", created=", ", liveMode=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.liveMode, ", code=", this.code, ", type=");
        m.append(this.f1440type);
        m.append(", billingDetails=");
        m.append(this.billingDetails);
        m.append(", customerId=");
        m.append(this.customerId);
        m.append(", card=");
        m.append(this.card);
        m.append(", cardPresent=");
        m.append(this.cardPresent);
        m.append(", fpx=");
        m.append(this.fpx);
        m.append(", ideal=");
        m.append(this.ideal);
        m.append(", sepaDebit=");
        m.append(this.sepaDebit);
        m.append(", auBecsDebit=");
        m.append(this.auBecsDebit);
        m.append(", bacsDebit=");
        m.append(this.bacsDebit);
        m.append(", netbanking=");
        m.append(this.netbanking);
        m.append(", usBankAccount=");
        m.append(this.usBankAccount);
        m.append(", linkPaymentDetails=null, isLinkPassthroughMode=");
        m.append(this.isLinkPassthroughMode);
        m.append(", allowRedisplay=");
        m.append(this.allowRedisplay);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.id);
        Long l = this.created;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            Request$Priority$EnumUnboxingLocalUtility.m(parcel, 1, l);
        }
        parcel.writeInt(this.liveMode ? 1 : 0);
        parcel.writeString(this.code);
        Type type2 = this.f1440type;
        if (type2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            type2.writeToParcel(parcel, i);
        }
        BillingDetails billingDetails = this.billingDetails;
        if (billingDetails == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            billingDetails.writeToParcel(parcel, i);
        }
        parcel.writeString(this.customerId);
        Card card = this.card;
        if (card == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            card.writeToParcel(parcel, i);
        }
        CardPresent cardPresent = this.cardPresent;
        if (cardPresent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(cardPresent.ignore ? 1 : 0);
        }
        Fpx fpx = this.fpx;
        if (fpx == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fpx.writeToParcel(parcel, i);
        }
        Ideal ideal = this.ideal;
        if (ideal == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ideal.writeToParcel(parcel, i);
        }
        SepaDebit sepaDebit = this.sepaDebit;
        if (sepaDebit == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sepaDebit.writeToParcel(parcel, i);
        }
        AuBecsDebit auBecsDebit = this.auBecsDebit;
        if (auBecsDebit == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            auBecsDebit.writeToParcel(parcel, i);
        }
        BacsDebit bacsDebit = this.bacsDebit;
        if (bacsDebit == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bacsDebit.writeToParcel(parcel, i);
        }
        Netbanking netbanking = this.netbanking;
        if (netbanking == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(netbanking.bank);
        }
        USBankAccount uSBankAccount = this.usBankAccount;
        if (uSBankAccount == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            uSBankAccount.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(null, i);
        parcel.writeInt(this.isLinkPassthroughMode ? 1 : 0);
        AllowRedisplay allowRedisplay = this.allowRedisplay;
        if (allowRedisplay == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            allowRedisplay.writeToParcel(parcel, i);
        }
    }

    public final class BillingDetails implements StripeModel, Parcelable {
        public static final Parcelable.Creator<BillingDetails> CREATOR = new PaymentIntent.Creator(20);
        public final Address address;
        public final String email;
        public final String name;
        public final String phone;

        public BillingDetails(Address address, String str, String str2, String str3) {
            this.address = address;
            this.email = str;
            this.name = str2;
            this.phone = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BillingDetails)) {
                return false;
            }
            BillingDetails billingDetails = (BillingDetails) obj;
            return Intrinsics.areEqual(this.address, billingDetails.address) && Intrinsics.areEqual(this.email, billingDetails.email) && Intrinsics.areEqual(this.name, billingDetails.name) && Intrinsics.areEqual(this.phone, billingDetails.phone);
        }

        public final int hashCode() {
            Address address = this.address;
            int hashCode = (address == null ? 0 : address.hashCode()) * 31;
            String str = this.email;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.name;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.phone;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BillingDetails(address=");
            sb.append(this.address);
            sb.append(", email=");
            sb.append(this.email);
            sb.append(", name=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.name, ", phone=", this.phone, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            Address address = this.address;
            if (address == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                address.writeToParcel(parcel, i);
            }
            parcel.writeString(this.email);
            parcel.writeString(this.name);
            parcel.writeString(this.phone);
        }

        public /* synthetic */ BillingDetails(String str, String str2, int i) {
            this(null, str, (i & 4) != 0 ? null : str2, null);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Type implements Parcelable {
        public static final /* synthetic */ EnumEntriesList $ENTRIES;
        public static final /* synthetic */ Type[] $VALUES;
        public static final Parcelable.Creator<Type> CREATOR;
        public static final Type Card;
        public static final y0 Companion;
        public static final Type Link;
        public static final Type USBankAccount;
        public static final Type WeChatPay;
        public final AfterRedirectAction afterRedirectAction;
        public final String code;
        public final boolean hasDelayedSettlement;
        public final boolean isVoucher;
        public final boolean requiresMandate;

        static {
            boolean z = false;
            Type type2 = new Type(0, "Link", "link", false, true, z);
            Link = type2;
            boolean z2 = false;
            Type type3 = new Type(1, "Card", "card", false, z, z2);
            Card = type3;
            boolean z3 = false;
            Type type4 = new Type(2, "CardPresent", "card_present", z, z2, z3);
            Type type5 = new Type(3, "Fpx", "fpx", z2, z3, false);
            Type type6 = new Type(4, "Ideal", "ideal", z3, true, false);
            boolean z4 = true;
            Type type7 = new Type(5, "SepaDebit", "sepa_debit", false, true, z4);
            boolean z5 = true;
            Type type8 = new Type(6, "AuBecsDebit", "au_becs_debit", false, z4, z5);
            Type type9 = new Type(7, "BacsDebit", "bacs_debit", false, z5, true);
            Type type10 = new Type("P24", 8, "p24", false, false, false, new AfterRedirectAction.Poll(5000L));
            boolean z6 = false;
            Type type11 = new Type(9, "Bancontact", "bancontact", false, true, z6);
            boolean z7 = false;
            Type type12 = new Type(10, "Eps", "eps", false, z6, z7);
            Type type13 = new Type(11, "Oxxo", "oxxo", true, z7, true);
            boolean z8 = false;
            boolean z9 = false;
            Type type14 = new Type(12, "Alipay", "alipay", false, z8, z9);
            Type type15 = new Type(13, "GrabPay", "grabpay", z8, z9, false);
            boolean z10 = false;
            Type type16 = new Type(14, "PayPal", "paypal", z9, true, z10);
            boolean z11 = false;
            boolean z12 = false;
            Type type17 = new Type(15, "AfterpayClearpay", "afterpay_clearpay", z12, z10, z11);
            Type type18 = new Type(16, "Netbanking", "netbanking", z12, z10, z11);
            Type type19 = new Type(17, "Blik", "blik", z12, z10, z11);
            Type type20 = new Type("WeChatPay", 18, "wechat_pay", false, false, false, new AfterRedirectAction.Poll(15000L));
            WeChatPay = type20;
            AfterRedirectAction.Refresh refresh = AfterRedirectAction.Refresh.INSTANCE;
            Type type21 = new Type("Klarna", 19, "klarna", false, true, false, refresh);
            boolean z13 = false;
            boolean z14 = false;
            Type type22 = new Type(20, "Affirm", "affirm", z14, false, z13);
            Type type23 = new Type("RevolutPay", 21, "revolut_pay", false, true, false, new AfterRedirectAction.Poll(5000L));
            boolean z15 = false;
            Type type24 = new Type(22, "Sunbit", "sunbit", z14, z15, z13);
            Type type25 = new Type(23, "Billie", "billie", z14, z15, z13);
            Type type26 = new Type(24, "Satispay", "satispay", z14, true, z13);
            Type type27 = new Type(25, "Crypto", "crypto", z14, false, z13);
            Type type28 = new Type("AmazonPay", 26, "amazon_pay", false, true, false, new AfterRedirectAction.Poll(5000L));
            boolean z16 = false;
            Type type29 = new Type(27, "Alma", "alma", z14, z16, z13);
            Type type30 = new Type(28, "MobilePay", "mobilepay", z14, z16, z13);
            Type type31 = new Type(29, "Multibanco", "multibanco", true, z16, true);
            boolean z17 = false;
            Type type32 = new Type(30, "Zip", "zip", z17, z16, false);
            Type type33 = new Type(31, "USBankAccount", "us_bank_account", z17, true, true);
            USBankAccount = type33;
            boolean z18 = false;
            boolean z19 = false;
            boolean z20 = false;
            boolean z21 = false;
            Type[] typeArr = {type2, type3, type4, type5, type6, type7, type8, type9, type10, type11, type12, type13, type14, type15, type16, type17, type18, type19, type20, type21, type22, type23, type24, type25, type26, type27, type28, type29, type30, type31, type32, type33, new Type("CashAppPay", 32, "cashapp", false, true, false, refresh), new Type(33, "Boleto", "boleto", true, false, true), new Type(34, "Konbini", "konbini", true, false, true), new Type("Swish", 35, "swish", false, false, false, new AfterRedirectAction.Poll(5000L)), new Type("Twint", 36, "twint", false, true, false, new AfterRedirectAction.Poll(5000L)), new Type(37, "ShopPay", "shop_pay", false, z19, z18), new Type(38, "PayNow", "paynow", true, z19, z18), new Type("PayPay", 39, "paypay", false, false, false, new AfterRedirectAction.Poll(5000L)), new Type(40, "PromptPay", "promptpay", true, z18, z20), new Type(41, "Wero", "wero", z18, z20, z21), new Type(42, "PayByBank", "pay_by_bank", z20, z21, false)};
            $VALUES = typeArr;
            $ENTRIES = new EnumEntriesList(typeArr);
            Companion = new y0();
            CREATOR = new Source.Creator(4);
        }

        public Type(String str, int i, String str2, boolean z, boolean z2, boolean z3, AfterRedirectAction afterRedirectAction) {
            this.code = str2;
            this.isVoucher = z;
            this.requiresMandate = z2;
            this.hasDelayedSettlement = z3;
            this.afterRedirectAction = afterRedirectAction;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.code;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(name());
        }

        public /* synthetic */ Type(int i, String str, String str2, boolean z, boolean z2, boolean z3) {
            this(str, i, str2, z, z2, z3, AfterRedirectAction.None.INSTANCE);
        }
    }
}
