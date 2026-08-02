package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.datadog.android.rum.RumErrorSource$EnumUnboxingLocalUtility;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.SourceOrder;
import com.stripe.android.model.StripeIntent;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class Source implements StripeModel, Parcelable {
    public static final Parcelable.Creator<Source> CREATOR = new Creator(0);
    public final Long amount;
    public final String clientSecret;
    public final Long created;
    public final String currency;
    public final String id;
    public final Boolean isLiveMode;
    public final Owner owner;
    public final SourceOrder sourceOrder;
    public final Map sourceTypeData;
    public final String statementDescriptor;
    public final Status status;

    /* renamed from: type, reason: collision with root package name */
    public final String f1443type;
    public final String typeRaw;
    public final Usage usage;

    public final class Creator implements Parcelable.Creator {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Creator(int i) {
            this.$r8$classId = i;
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            LinkedHashSet linkedHashSet;
            LinkedHashMap linkedHashMap2;
            boolean z;
            ClientAttributionMetadata clientAttributionMetadata;
            LinkedHashMap linkedHashMap3;
            LinkedHashSet linkedHashSet2;
            int i = 0;
            switch (this.$r8$classId) {
                case 0:
                    parcel.getClass();
                    String readString = parcel.readString();
                    Long valueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                    String readString2 = parcel.readString();
                    Long valueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                    String readString3 = parcel.readString();
                    Boolean valueOf3 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                    Owner createFromParcel = parcel.readInt() == 0 ? null : Owner.CREATOR.createFromParcel(parcel);
                    Status valueOf4 = parcel.readInt() == 0 ? null : Status.valueOf(parcel.readString());
                    if (parcel.readInt() == 0) {
                        linkedHashMap = null;
                    } else {
                        int readInt = parcel.readInt();
                        LinkedHashMap linkedHashMap4 = new LinkedHashMap(readInt);
                        for (int i2 = 0; i2 != readInt; i2++) {
                            linkedHashMap4.put(parcel.readString(), parcel.readValue(Source.class.getClassLoader()));
                        }
                        linkedHashMap = linkedHashMap4;
                    }
                    if (parcel.readParcelable(Source.class.getClassLoader()) == null) {
                        return new Source(readString, valueOf, readString2, valueOf2, readString3, valueOf3, createFromParcel, valueOf4, linkedHashMap, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Usage.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : SourceOrder.CREATOR.createFromParcel(parcel), parcel.readString());
                    }
                    a$$ExternalSyntheticBUOutline0.m$1();
                    return null;
                case 1:
                    parcel.getClass();
                    return new PaymentMethod.Ideal(parcel.readString(), parcel.readString());
                case 2:
                    parcel.getClass();
                    return new PaymentMethod.Netbanking(parcel.readString());
                case 3:
                    parcel.getClass();
                    return new PaymentMethod.SepaDebit(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                case 4:
                    parcel.getClass();
                    return PaymentMethod.Type.valueOf(parcel.readString());
                case 5:
                    parcel.getClass();
                    return new PaymentMethod.USBankAccount(PaymentMethod.USBankAccount.USBankAccountHolderType.CREATOR.createFromParcel(parcel), PaymentMethod.USBankAccount.USBankAccountType.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : PaymentMethod.USBankAccount.USBankNetworks.CREATOR.createFromParcel(parcel), parcel.readString());
                case 6:
                    parcel.getClass();
                    return PaymentMethod.USBankAccount.USBankAccountHolderType.valueOf(parcel.readString());
                case 7:
                    parcel.getClass();
                    return PaymentMethod.USBankAccount.USBankAccountType.valueOf(parcel.readString());
                case 8:
                    parcel.getClass();
                    return new PaymentMethod.USBankAccount.USBankNetworks(parcel.readString(), parcel.createStringArrayList());
                case 9:
                    parcel.getClass();
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    readString4.getClass();
                    readString5.getClass();
                    PaymentMethodCreateParams.AuBecsDebit auBecsDebit = new PaymentMethodCreateParams.AuBecsDebit();
                    auBecsDebit.bsbNumber = readString4;
                    auBecsDebit.accountNumber = readString5;
                    return auBecsDebit;
                case 10:
                    parcel.getClass();
                    String readString6 = parcel.readString();
                    String readString7 = parcel.readString();
                    readString6.getClass();
                    readString7.getClass();
                    PaymentMethodCreateParams.BacsDebit bacsDebit = new PaymentMethodCreateParams.BacsDebit();
                    bacsDebit.accountNumber = readString6;
                    bacsDebit.sortCode = readString7;
                    return bacsDebit;
                case 11:
                    parcel.getClass();
                    String readString8 = parcel.readString();
                    Integer valueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                    Integer valueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                    String readString9 = parcel.readString();
                    String readString10 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        linkedHashSet = null;
                    } else {
                        int readInt2 = parcel.readInt();
                        LinkedHashSet linkedHashSet3 = new LinkedHashSet(readInt2);
                        for (int i3 = 0; i3 != readInt2; i3++) {
                            linkedHashSet3.add(parcel.readString());
                        }
                        linkedHashSet = linkedHashSet3;
                    }
                    return new PaymentMethodCreateParams.Card(readString8, valueOf5, valueOf6, readString9, readString10, linkedHashSet, parcel.readInt() == 0 ? null : PaymentMethodCreateParams.Card.Networks.CREATOR.createFromParcel(parcel));
                case 12:
                    parcel.getClass();
                    return new PaymentMethodCreateParams.Card.Networks(parcel.readString());
                case 13:
                    parcel.getClass();
                    parcel.readInt();
                    return new PaymentMethodCreateParams.CashAppPay();
                case 14:
                    parcel.getClass();
                    String readString11 = parcel.readString();
                    boolean z2 = parcel.readInt() != 0;
                    PaymentMethodCreateParams.Card createFromParcel2 = parcel.readInt() == 0 ? null : PaymentMethodCreateParams.Card.CREATOR.createFromParcel(parcel);
                    PaymentMethodCreateParams.Ideal createFromParcel3 = parcel.readInt() == 0 ? null : PaymentMethodCreateParams.Ideal.CREATOR.createFromParcel(parcel);
                    PaymentMethodCreateParams.Fpx createFromParcel4 = parcel.readInt() == 0 ? null : PaymentMethodCreateParams.Fpx.CREATOR.createFromParcel(parcel);
                    PaymentMethodCreateParams.SepaDebit createFromParcel5 = parcel.readInt() == 0 ? null : PaymentMethodCreateParams.SepaDebit.CREATOR.createFromParcel(parcel);
                    PaymentMethodCreateParams.AuBecsDebit createFromParcel6 = parcel.readInt() == 0 ? null : PaymentMethodCreateParams.AuBecsDebit.CREATOR.createFromParcel(parcel);
                    PaymentMethodCreateParams.BacsDebit createFromParcel7 = parcel.readInt() == 0 ? null : PaymentMethodCreateParams.BacsDebit.CREATOR.createFromParcel(parcel);
                    PaymentMethodCreateParams.Netbanking createFromParcel8 = parcel.readInt() == 0 ? null : PaymentMethodCreateParams.Netbanking.CREATOR.createFromParcel(parcel);
                    PaymentMethodCreateParams.USBankAccount createFromParcel9 = parcel.readInt() == 0 ? null : PaymentMethodCreateParams.USBankAccount.CREATOR.createFromParcel(parcel);
                    PaymentMethodCreateParams.Link createFromParcel10 = parcel.readInt() == 0 ? null : PaymentMethodCreateParams.Link.CREATOR.createFromParcel(parcel);
                    PaymentMethodCreateParams.CashAppPay createFromParcel11 = parcel.readInt() == 0 ? null : PaymentMethodCreateParams.CashAppPay.CREATOR.createFromParcel(parcel);
                    PaymentMethodCreateParams.Swish createFromParcel12 = parcel.readInt() == 0 ? null : PaymentMethodCreateParams.Swish.CREATOR.createFromParcel(parcel);
                    PaymentMethodCreateParams.ShopPay createFromParcel13 = parcel.readInt() != 0 ? PaymentMethodCreateParams.ShopPay.CREATOR.createFromParcel(parcel) : null;
                    PaymentMethod.BillingDetails createFromParcel14 = parcel.readInt() == 0 ? null : PaymentMethod.BillingDetails.CREATOR.createFromParcel(parcel);
                    PaymentMethod.AllowRedisplay createFromParcel15 = parcel.readInt() == 0 ? null : PaymentMethod.AllowRedisplay.CREATOR.createFromParcel(parcel);
                    RadarOptions createFromParcel16 = parcel.readInt() == 0 ? null : RadarOptions.CREATOR.createFromParcel(parcel);
                    if (parcel.readInt() == 0) {
                        z = z2;
                        linkedHashMap2 = null;
                    } else {
                        int readInt3 = parcel.readInt();
                        linkedHashMap2 = new LinkedHashMap(readInt3);
                        z = z2;
                        int i4 = 0;
                        while (i4 != readInt3) {
                            linkedHashMap2.put(parcel.readString(), parcel.readString());
                            i4++;
                            readInt3 = readInt3;
                        }
                    }
                    int readInt4 = parcel.readInt();
                    LinkedHashSet linkedHashSet4 = new LinkedHashSet(readInt4);
                    int i5 = 0;
                    while (i5 != readInt4) {
                        linkedHashSet4.add(parcel.readString());
                        i5++;
                        readInt4 = readInt4;
                    }
                    ClientAttributionMetadata createFromParcel17 = parcel.readInt() == 0 ? null : ClientAttributionMetadata.CREATOR.createFromParcel(parcel);
                    if (parcel.readInt() == 0) {
                        clientAttributionMetadata = createFromParcel17;
                        linkedHashSet2 = linkedHashSet4;
                        linkedHashMap3 = null;
                    } else {
                        int readInt5 = parcel.readInt();
                        clientAttributionMetadata = createFromParcel17;
                        linkedHashMap3 = new LinkedHashMap(readInt5);
                        linkedHashSet2 = linkedHashSet4;
                        int i6 = 0;
                        while (i6 != readInt5) {
                            linkedHashMap3.put(parcel.readString(), parcel.readValue(PaymentMethodCreateParams.class.getClassLoader()));
                            i6++;
                            readInt5 = readInt5;
                        }
                    }
                    return new PaymentMethodCreateParams(readString11, z, createFromParcel2, createFromParcel3, createFromParcel4, createFromParcel5, createFromParcel6, createFromParcel7, createFromParcel8, createFromParcel9, createFromParcel10, createFromParcel11, createFromParcel12, createFromParcel13, createFromParcel14, createFromParcel15, createFromParcel16, linkedHashMap2, linkedHashSet2, clientAttributionMetadata, linkedHashMap3);
                case 15:
                    parcel.getClass();
                    String readString12 = parcel.readString();
                    PaymentMethodCreateParams.Fpx fpx = new PaymentMethodCreateParams.Fpx();
                    fpx.bank = readString12;
                    return fpx;
                case 16:
                    parcel.getClass();
                    String readString13 = parcel.readString();
                    PaymentMethodCreateParams.Ideal ideal = new PaymentMethodCreateParams.Ideal();
                    ideal.bank = readString13;
                    return ideal;
                case 17:
                    LinkedHashMap linkedHashMap5 = null;
                    parcel.getClass();
                    String readString14 = parcel.readString();
                    String readString15 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        int readInt6 = parcel.readInt();
                        LinkedHashMap linkedHashMap6 = new LinkedHashMap(readInt6);
                        while (i != readInt6) {
                            linkedHashMap6.put(parcel.readString(), parcel.readValue(PaymentMethodCreateParams.Link.class.getClassLoader()));
                            i++;
                        }
                        linkedHashMap5 = linkedHashMap6;
                    }
                    return new PaymentMethodCreateParams.Link(readString14, readString15, linkedHashMap5, parcel.readString());
                case 18:
                    parcel.getClass();
                    String readString16 = parcel.readString();
                    readString16.getClass();
                    PaymentMethodCreateParams.Netbanking netbanking = new PaymentMethodCreateParams.Netbanking();
                    netbanking.bank = readString16;
                    return netbanking;
                case 19:
                    parcel.getClass();
                    String readString17 = parcel.readString();
                    PaymentMethodCreateParams.SepaDebit sepaDebit = new PaymentMethodCreateParams.SepaDebit();
                    sepaDebit.iban = readString17;
                    return sepaDebit;
                case 20:
                    parcel.getClass();
                    String readString18 = parcel.readString();
                    readString18.getClass();
                    PaymentMethodCreateParams.ShopPay shopPay = new PaymentMethodCreateParams.ShopPay();
                    shopPay.externalSourceId = readString18;
                    return shopPay;
                case 21:
                    parcel.getClass();
                    parcel.readInt();
                    return new PaymentMethodCreateParams.Swish();
                case 22:
                    parcel.getClass();
                    String readString19 = parcel.readString();
                    String readString20 = parcel.readString();
                    String readString21 = parcel.readString();
                    PaymentMethod.USBankAccount.USBankAccountType createFromParcel18 = parcel.readInt() == 0 ? null : PaymentMethod.USBankAccount.USBankAccountType.CREATOR.createFromParcel(parcel);
                    PaymentMethod.USBankAccount.USBankAccountHolderType createFromParcel19 = parcel.readInt() != 0 ? PaymentMethod.USBankAccount.USBankAccountHolderType.CREATOR.createFromParcel(parcel) : null;
                    PaymentMethodCreateParams.USBankAccount uSBankAccount = new PaymentMethodCreateParams.USBankAccount();
                    uSBankAccount.linkAccountSessionId = readString19;
                    uSBankAccount.accountNumber = readString20;
                    uSBankAccount.routingNumber = readString21;
                    uSBankAccount.accountType = createFromParcel18;
                    uSBankAccount.accountHolderType = createFromParcel19;
                    return uSBankAccount;
                case 23:
                    parcel.getClass();
                    return new PaymentMethodOptionsParams$Card(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ConfirmPaymentIntentParams.SetupFutureUsage.valueOf(parcel.readString()), parcel.readInt() != 0 ? Boolean.valueOf(parcel.readInt() != 0) : null);
                case 24:
                    parcel.getClass();
                    return new RadarOptions(parcel.readString(), parcel.readInt() == 0 ? null : AndroidVerificationObject.CREATOR.createFromParcel(parcel));
                case 25:
                    parcel.getClass();
                    return new SetupIntent(parcel.readString(), parcel.readInt() == 0 ? null : SetupIntent.CancellationReason.valueOf(parcel.readString()), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : PaymentMethod.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : StripeIntent.Status.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : StripeIntent.Usage.valueOf(parcel.readString()), parcel.readInt() != 0 ? SetupIntent.Error.CREATOR.createFromParcel(parcel) : null, parcel.createStringArrayList(), parcel.createStringArrayList(), (StripeIntent.NextActionData) parcel.readParcelable(SetupIntent.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
                case 26:
                    parcel.getClass();
                    return new SetupIntent.Error(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : PaymentMethod.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SetupIntent.Error.Type.valueOf(parcel.readString()) : null);
                case 27:
                    parcel.getClass();
                    return new SharePaymentDetails(parcel.readString(), parcel.readString());
                case 28:
                    parcel.getClass();
                    return new Owner(parcel.readInt() == 0 ? null : Address.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), (Address) (parcel.readInt() != 0 ? Address.CREATOR.createFromParcel(parcel) : null), parcel.readString(), parcel.readString(), parcel.readString());
                default:
                    parcel.getClass();
                    Integer valueOf7 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                    String readString22 = parcel.readString();
                    String readString23 = parcel.readString();
                    int readInt7 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt7);
                    while (i != readInt7) {
                        i = CameraState$Type$EnumUnboxingLocalUtility.m(SourceOrder.Item.CREATOR, parcel, arrayList, i, 1);
                    }
                    return new SourceOrder(valueOf7, readString22, readString23, arrayList, (SourceOrder.Shipping) (parcel.readInt() != 0 ? SourceOrder.Shipping.CREATOR.createFromParcel(parcel) : null));
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new Source[i];
                case 1:
                    return new PaymentMethod.Ideal[i];
                case 2:
                    return new PaymentMethod.Netbanking[i];
                case 3:
                    return new PaymentMethod.SepaDebit[i];
                case 4:
                    return new PaymentMethod.Type[i];
                case 5:
                    return new PaymentMethod.USBankAccount[i];
                case 6:
                    return new PaymentMethod.USBankAccount.USBankAccountHolderType[i];
                case 7:
                    return new PaymentMethod.USBankAccount.USBankAccountType[i];
                case 8:
                    return new PaymentMethod.USBankAccount.USBankNetworks[i];
                case 9:
                    return new PaymentMethodCreateParams.AuBecsDebit[i];
                case 10:
                    return new PaymentMethodCreateParams.BacsDebit[i];
                case 11:
                    return new PaymentMethodCreateParams.Card[i];
                case 12:
                    return new PaymentMethodCreateParams.Card.Networks[i];
                case 13:
                    return new PaymentMethodCreateParams.CashAppPay[i];
                case 14:
                    return new PaymentMethodCreateParams[i];
                case 15:
                    return new PaymentMethodCreateParams.Fpx[i];
                case 16:
                    return new PaymentMethodCreateParams.Ideal[i];
                case 17:
                    return new PaymentMethodCreateParams.Link[i];
                case 18:
                    return new PaymentMethodCreateParams.Netbanking[i];
                case 19:
                    return new PaymentMethodCreateParams.SepaDebit[i];
                case 20:
                    return new PaymentMethodCreateParams.ShopPay[i];
                case 21:
                    return new PaymentMethodCreateParams.Swish[i];
                case 22:
                    return new PaymentMethodCreateParams.USBankAccount[i];
                case 23:
                    return new PaymentMethodOptionsParams$Card[i];
                case 24:
                    return new RadarOptions[i];
                case 25:
                    return new SetupIntent[i];
                case 26:
                    return new SetupIntent.Error[i];
                case 27:
                    return new SharePaymentDetails[i];
                case 28:
                    return new Owner[i];
                default:
                    return new SourceOrder[i];
            }
        }
    }

    public final class Owner implements StripeModel {
        public static final Parcelable.Creator<Owner> CREATOR = new Creator(28);
        public final Address address;
        public final String email;
        public final String name;
        public final String phone;
        public final Address verifiedAddress;
        public final String verifiedEmail;
        public final String verifiedName;
        public final String verifiedPhone;

        public Owner(Address address, String str, String str2, String str3, Address address2, String str4, String str5, String str6) {
            this.address = address;
            this.email = str;
            this.name = str2;
            this.phone = str3;
            this.verifiedAddress = address2;
            this.verifiedEmail = str4;
            this.verifiedName = str5;
            this.verifiedPhone = str6;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Owner)) {
                return false;
            }
            Owner owner = (Owner) obj;
            return Intrinsics.areEqual(this.address, owner.address) && Intrinsics.areEqual(this.email, owner.email) && Intrinsics.areEqual(this.name, owner.name) && Intrinsics.areEqual(this.phone, owner.phone) && Intrinsics.areEqual(this.verifiedAddress, owner.verifiedAddress) && Intrinsics.areEqual(this.verifiedEmail, owner.verifiedEmail) && Intrinsics.areEqual(this.verifiedName, owner.verifiedName) && Intrinsics.areEqual(this.verifiedPhone, owner.verifiedPhone);
        }

        public final int hashCode() {
            Address address = this.address;
            int hashCode = (address == null ? 0 : address.hashCode()) * 31;
            String str = this.email;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.name;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.phone;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Address address2 = this.verifiedAddress;
            int hashCode5 = (hashCode4 + (address2 == null ? 0 : address2.hashCode())) * 31;
            String str4 = this.verifiedEmail;
            int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.verifiedName;
            int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.verifiedPhone;
            return hashCode7 + (str6 != null ? str6.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Owner(address=");
            sb.append(this.address);
            sb.append(", email=");
            sb.append(this.email);
            sb.append(", name=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.name, ", phone=", this.phone, ", verifiedAddress=");
            sb.append(this.verifiedAddress);
            sb.append(", verifiedEmail=");
            sb.append(this.verifiedEmail);
            sb.append(", verifiedName=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.verifiedName, ", verifiedPhone=", this.verifiedPhone, ")");
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
            Address address2 = this.verifiedAddress;
            if (address2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                address2.writeToParcel(parcel, i);
            }
            parcel.writeString(this.verifiedEmail);
            parcel.writeString(this.verifiedName);
            parcel.writeString(this.verifiedPhone);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/model/Source$Status", "", "Lcom/stripe/android/model/Source$Status;", "", "toString", "()Ljava/lang/String;", "payments-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum Status {
        /* JADX INFO: Fake field, exist only in values array */
        Canceled("canceled"),
        /* JADX INFO: Fake field, exist only in values array */
        Chargeable("chargeable"),
        /* JADX INFO: Fake field, exist only in values array */
        Consumed("consumed"),
        /* JADX INFO: Fake field, exist only in values array */
        Failed("failed"),
        /* JADX INFO: Fake field, exist only in values array */
        Pending("pending");

        public final String code;

        Status(String str) {
            this.code = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.code;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/model/Source$Usage", "", "Lcom/stripe/android/model/Source$Usage;", "", "toString", "()Ljava/lang/String;", "payments-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum Usage {
        /* JADX INFO: Fake field, exist only in values array */
        Reusable("reusable"),
        /* JADX INFO: Fake field, exist only in values array */
        SingleUse("single_use");

        public final String code;

        Usage(String str) {
            this.code = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.code;
        }
    }

    public Source(String str, Long l, String str2, Long l2, String str3, Boolean bool, Owner owner, Status status, LinkedHashMap linkedHashMap, String str4, String str5, Usage usage, SourceOrder sourceOrder, String str6) {
        str4.getClass();
        str5.getClass();
        this.id = str;
        this.amount = l;
        this.clientSecret = str2;
        this.created = l2;
        this.currency = str3;
        this.isLiveMode = bool;
        this.owner = owner;
        this.status = status;
        this.sourceTypeData = linkedHashMap;
        this.f1443type = str4;
        this.typeRaw = str5;
        this.usage = usage;
        this.sourceOrder = sourceOrder;
        this.statementDescriptor = str6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Source)) {
            return false;
        }
        Source source = (Source) obj;
        return Intrinsics.areEqual(this.id, source.id) && Intrinsics.areEqual(this.amount, source.amount) && Intrinsics.areEqual(this.clientSecret, source.clientSecret) && Intrinsics.areEqual(this.created, source.created) && Intrinsics.areEqual(this.currency, source.currency) && Intrinsics.areEqual(this.isLiveMode, source.isLiveMode) && Intrinsics.areEqual(this.owner, source.owner) && this.status == source.status && Intrinsics.areEqual(this.sourceTypeData, source.sourceTypeData) && Intrinsics.areEqual(this.f1443type, source.f1443type) && Intrinsics.areEqual(this.typeRaw, source.typeRaw) && this.usage == source.usage && Intrinsics.areEqual(this.sourceOrder, source.sourceOrder) && Intrinsics.areEqual(this.statementDescriptor, source.statementDescriptor);
    }

    public final int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.amount;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.clientSecret;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l2 = this.created;
        int hashCode4 = (hashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str3 = this.currency;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isLiveMode;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Owner owner = this.owner;
        int hashCode7 = (hashCode6 + (owner == null ? 0 : owner.hashCode())) * 31;
        Status status = this.status;
        int hashCode8 = (hashCode7 + (status == null ? 0 : status.hashCode())) * 31;
        Map map = this.sourceTypeData;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode8 + (map == null ? 0 : map.hashCode())) * 961, 31, this.f1443type), 31, this.typeRaw);
        Usage usage = this.usage;
        int hashCode9 = (m + (usage == null ? 0 : usage.hashCode())) * 31;
        SourceOrder sourceOrder = this.sourceOrder;
        int hashCode10 = (hashCode9 + (sourceOrder == null ? 0 : sourceOrder.hashCode())) * 31;
        String str4 = this.statementDescriptor;
        return hashCode10 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = RumErrorSource$EnumUnboxingLocalUtility.m(this.amount, "Source(id=", this.id, ", amount=", ", clientSecret=");
        Request$Priority$EnumUnboxingLocalUtility.m(this.created, this.clientSecret, ", created=", ", currency=", m);
        Thread$State$EnumUnboxingLocalUtility.m(m, this.currency, ", isLiveMode=", this.isLiveMode, ", owner=");
        m.append(this.owner);
        m.append(", status=");
        m.append(this.status);
        m.append(", sourceTypeData=");
        m.append(this.sourceTypeData);
        m.append(", sourceTypeModel=null, type=");
        m.append(this.f1443type);
        m.append(", typeRaw=");
        m.append(this.typeRaw);
        m.append(", usage=");
        m.append(this.usage);
        m.append(", sourceOrder=");
        m.append(this.sourceOrder);
        m.append(", statementDescriptor=");
        m.append(this.statementDescriptor);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.id);
        Long l = this.amount;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            Request$Priority$EnumUnboxingLocalUtility.m(parcel, 1, l);
        }
        parcel.writeString(this.clientSecret);
        Long l2 = this.created;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            Request$Priority$EnumUnboxingLocalUtility.m(parcel, 1, l2);
        }
        parcel.writeString(this.currency);
        Boolean bool = this.isLiveMode;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            CameraState$Type$EnumUnboxingLocalUtility.m(parcel, 1, bool);
        }
        Owner owner = this.owner;
        if (owner == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            owner.writeToParcel(parcel, i);
        }
        Status status = this.status;
        if (status == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(status.name());
        }
        Map map = this.sourceTypeData;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            Iterator m = Matcher$$ExternalSyntheticOutline0.m(parcel, 1, map);
            while (m.hasNext()) {
                Map.Entry entry = (Map.Entry) m.next();
                parcel.writeString((String) entry.getKey());
                parcel.writeValue(entry.getValue());
            }
        }
        parcel.writeParcelable(null, i);
        parcel.writeString(this.f1443type);
        parcel.writeString(this.typeRaw);
        Usage usage = this.usage;
        if (usage == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(usage.name());
        }
        SourceOrder sourceOrder = this.sourceOrder;
        if (sourceOrder == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sourceOrder.writeToParcel(parcel, i);
        }
        parcel.writeString(this.statementDescriptor);
    }
}
