package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.financialconnections.ElementsSessionContext;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.wallets.Wallet;
import com.stripe.android.payments.PaymentFlowResult$Unvalidated;
import com.stripe.android.payments.bankaccount.CollectBankAccountConfiguration;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountResponse;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountResponseInternal;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountResult;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountResultInternal;
import com.stripe.android.payments.financialconnections.FinancialConnectionsAvailability;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.full.KClasses$$Lambda$1;

/* loaded from: classes8.dex */
public final class Token implements StripeModel, Parcelable {
    public static final Parcelable.Creator<Token> CREATOR = new Creator(0);
    public final BankAccount bankAccount;
    public final Card card;
    public final Date created;
    public final String id;
    public final boolean livemode;

    /* renamed from: type, reason: collision with root package name */
    public final Type f1446type;
    public final boolean used;

    public final class Creator implements Parcelable.Creator {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Creator(int i) {
            this.$r8$classId = i;
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            CollectBankAccountConfiguration collectBankAccountConfiguration;
            boolean z;
            switch (this.$r8$classId) {
                case 0:
                    parcel.getClass();
                    return new Token(parcel.readString(), Type.valueOf(parcel.readString()), (Date) parcel.readSerializable(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : BankAccount.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Card.CREATOR.createFromParcel(parcel));
                case 1:
                    parcel.getClass();
                    return new StripeIntent.NextActionData.VerifyWithMicrodeposits(parcel.readLong(), parcel.readString(), MicrodepositType.valueOf(parcel.readString()));
                case 2:
                    parcel.getClass();
                    return new StripeIntent.NextActionData.WeChatPayRedirect(WeChat.CREATOR.createFromParcel(parcel));
                case 3:
                    int i = 0;
                    parcel.getClass();
                    int readInt = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt);
                    while (i != readInt) {
                        i = CameraState$Type$EnumUnboxingLocalUtility.m(LinkConsumerIncentive.CREATOR, parcel, arrayList, i, 1);
                    }
                    return new UpdateAvailableIncentives(arrayList);
                case 4:
                    parcel.getClass();
                    return new WeChat(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                case 5:
                    parcel.getClass();
                    return new Wallet.AmexExpressCheckoutWallet(parcel.readString());
                case 6:
                    parcel.getClass();
                    return new Wallet.ApplePayWallet(parcel.readString());
                case 7:
                    parcel.getClass();
                    return new Wallet.GooglePayWallet(parcel.readString());
                case 8:
                    parcel.getClass();
                    return new Wallet.LinkWallet(parcel.readString());
                case 9:
                    parcel.getClass();
                    return new Wallet.MasterpassWallet(parcel.readInt() == 0 ? null : Address.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Address.CREATOR.createFromParcel(parcel));
                case 10:
                    parcel.getClass();
                    return new Wallet.SamsungPayWallet(parcel.readString());
                case 11:
                    parcel.getClass();
                    return new Wallet.VisaCheckoutWallet(parcel.readInt() == 0 ? null : Address.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Address.CREATOR.createFromParcel(parcel), parcel.readString());
                case 12:
                    boolean z2 = true;
                    StripeException stripeException = null;
                    parcel.getClass();
                    String readString = parcel.readString();
                    int readInt2 = parcel.readInt();
                    Serializable readSerializable = parcel.readSerializable();
                    if (readSerializable instanceof StripeException) {
                        stripeException = (StripeException) readSerializable;
                    }
                    StripeException stripeException2 = stripeException;
                    if (parcel.readInt() != 1) {
                        z2 = false;
                    }
                    return new PaymentFlowResult$Unvalidated(readString, readInt2, stripeException2, z2, parcel.readString(), (Source) parcel.readParcelable(Source.class.getClassLoader()), parcel.readString());
                case 13:
                    parcel.getClass();
                    return new CollectBankAccountConfiguration.InstantDebits(parcel.readString(), (ElementsSessionContext) parcel.readParcelable(CollectBankAccountConfiguration.InstantDebits.class.getClassLoader()));
                case 14:
                    parcel.getClass();
                    return new CollectBankAccountConfiguration.USBankAccount(parcel.readString(), parcel.readString());
                case 15:
                    parcel.getClass();
                    return new CollectBankAccountConfiguration.USBankAccountInternal(parcel.readString(), parcel.readString(), (ElementsSessionContext) parcel.readParcelable(CollectBankAccountConfiguration.USBankAccountInternal.class.getClassLoader()));
                case 16:
                    parcel.getClass();
                    return new CollectBankAccountContract.Args.ForDeferredPaymentIntent(parcel.readString(), parcel.readString(), (CollectBankAccountConfiguration) parcel.readParcelable(CollectBankAccountContract.Args.ForDeferredPaymentIntent.class.getClassLoader()), parcel.readInt() == 0 ? null : FinancialConnectionsAvailability.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
                case 17:
                    parcel.getClass();
                    return new CollectBankAccountContract.Args.ForDeferredSetupIntent(parcel.readString(), parcel.readString(), (CollectBankAccountConfiguration) parcel.readParcelable(CollectBankAccountContract.Args.ForDeferredSetupIntent.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : FinancialConnectionsAvailability.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString());
                case 18:
                    parcel.getClass();
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    String readString4 = parcel.readString();
                    CollectBankAccountConfiguration collectBankAccountConfiguration2 = (CollectBankAccountConfiguration) parcel.readParcelable(CollectBankAccountContract.Args.ForPaymentIntent.class.getClassLoader());
                    if (parcel.readInt() != 0) {
                        z = true;
                        collectBankAccountConfiguration = collectBankAccountConfiguration2;
                    } else {
                        collectBankAccountConfiguration = collectBankAccountConfiguration2;
                        z = false;
                    }
                    return new CollectBankAccountContract.Args.ForPaymentIntent(readString2, readString3, readString4, collectBankAccountConfiguration, z, parcel.readInt() == 0 ? null : FinancialConnectionsAvailability.valueOf(parcel.readString()), parcel.readString());
                case 19:
                    parcel.getClass();
                    String readString5 = parcel.readString();
                    String readString6 = parcel.readString();
                    boolean z3 = true;
                    String readString7 = parcel.readString();
                    CollectBankAccountConfiguration collectBankAccountConfiguration3 = (CollectBankAccountConfiguration) parcel.readParcelable(CollectBankAccountContract.Args.ForSetupIntent.class.getClassLoader());
                    if (parcel.readInt() == 0) {
                        z3 = false;
                    }
                    return new CollectBankAccountContract.Args.ForSetupIntent(readString5, readString6, readString7, collectBankAccountConfiguration3, z3, parcel.readInt() == 0 ? null : FinancialConnectionsAvailability.valueOf(parcel.readString()), parcel.readString());
                case 20:
                    parcel.getClass();
                    return new CollectBankAccountContract.Result((CollectBankAccountResultInternal) parcel.readParcelable(CollectBankAccountContract.Result.class.getClassLoader()));
                case 21:
                    parcel.getClass();
                    return new CollectBankAccountResponse((StripeIntent) parcel.readParcelable(CollectBankAccountResponse.class.getClassLoader()), (com.stripe.android.financialconnections.model.FinancialConnectionsSession) parcel.readParcelable(CollectBankAccountResponse.class.getClassLoader()));
                case 22:
                    parcel.getClass();
                    return new CollectBankAccountResponseInternal((StripeIntent) parcel.readParcelable(CollectBankAccountResponseInternal.class.getClassLoader()), parcel.readInt() == 0 ? null : CollectBankAccountResponseInternal.USBankAccountData.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? CollectBankAccountResponseInternal.InstantDebitsData.CREATOR.createFromParcel(parcel) : null);
                case 23:
                    parcel.getClass();
                    return new CollectBankAccountResponseInternal.InstantDebitsData(PaymentMethod.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
                case 24:
                    parcel.getClass();
                    return new CollectBankAccountResponseInternal.USBankAccountData((com.stripe.android.financialconnections.model.FinancialConnectionsSession) parcel.readParcelable(CollectBankAccountResponseInternal.USBankAccountData.class.getClassLoader()));
                case 25:
                    parcel.getClass();
                    parcel.readInt();
                    return CollectBankAccountResult.Cancelled.INSTANCE;
                case 26:
                    parcel.getClass();
                    return new CollectBankAccountResult.Completed(CollectBankAccountResponse.CREATOR.createFromParcel(parcel));
                case 27:
                    parcel.getClass();
                    return new CollectBankAccountResult.Failed((Throwable) parcel.readSerializable());
                case 28:
                    parcel.getClass();
                    parcel.readInt();
                    return CollectBankAccountResultInternal.Cancelled.INSTANCE;
                default:
                    parcel.getClass();
                    return new CollectBankAccountResultInternal.Completed(CollectBankAccountResponseInternal.CREATOR.createFromParcel(parcel));
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new Token[i];
                case 1:
                    return new StripeIntent.NextActionData.VerifyWithMicrodeposits[i];
                case 2:
                    return new StripeIntent.NextActionData.WeChatPayRedirect[i];
                case 3:
                    return new UpdateAvailableIncentives[i];
                case 4:
                    return new WeChat[i];
                case 5:
                    return new Wallet.AmexExpressCheckoutWallet[i];
                case 6:
                    return new Wallet.ApplePayWallet[i];
                case 7:
                    return new Wallet.GooglePayWallet[i];
                case 8:
                    return new Wallet.LinkWallet[i];
                case 9:
                    return new Wallet.MasterpassWallet[i];
                case 10:
                    return new Wallet.SamsungPayWallet[i];
                case 11:
                    return new Wallet.VisaCheckoutWallet[i];
                case 12:
                    return new PaymentFlowResult$Unvalidated[i];
                case 13:
                    return new CollectBankAccountConfiguration.InstantDebits[i];
                case 14:
                    return new CollectBankAccountConfiguration.USBankAccount[i];
                case 15:
                    return new CollectBankAccountConfiguration.USBankAccountInternal[i];
                case 16:
                    return new CollectBankAccountContract.Args.ForDeferredPaymentIntent[i];
                case 17:
                    return new CollectBankAccountContract.Args.ForDeferredSetupIntent[i];
                case 18:
                    return new CollectBankAccountContract.Args.ForPaymentIntent[i];
                case 19:
                    return new CollectBankAccountContract.Args.ForSetupIntent[i];
                case 20:
                    return new CollectBankAccountContract.Result[i];
                case 21:
                    return new CollectBankAccountResponse[i];
                case 22:
                    return new CollectBankAccountResponseInternal[i];
                case 23:
                    return new CollectBankAccountResponseInternal.InstantDebitsData[i];
                case 24:
                    return new CollectBankAccountResponseInternal.USBankAccountData[i];
                case 25:
                    return new CollectBankAccountResult.Cancelled[i];
                case 26:
                    return new CollectBankAccountResult.Completed[i];
                case 27:
                    return new CollectBankAccountResult.Failed[i];
                case 28:
                    return new CollectBankAccountResultInternal.Cancelled[i];
                default:
                    return new CollectBankAccountResultInternal.Completed[i];
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Type {
        public static final /* synthetic */ EnumEntriesList $ENTRIES;
        public static final /* synthetic */ Type[] $VALUES;
        public static final Type BankAccount;
        public static final Type Card;
        public static final KClasses$$Lambda$1 Companion;
        public final String code;

        static {
            Type type2 = new Type("Card", 0, "card");
            Card = type2;
            Type type3 = new Type("BankAccount", 1, "bank_account");
            BankAccount = type3;
            Type[] typeArr = {type2, type3, new Type("Pii", 2, "pii"), new Type("Account", 3, "account"), new Type("CvcUpdate", 4, "cvc_update"), new Type("Person", 5, "person")};
            $VALUES = typeArr;
            $ENTRIES = new EnumEntriesList(typeArr);
            Companion = new KClasses$$Lambda$1(14);
        }

        public Type(String str, int i, String str2) {
            this.code = str2;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public Token(String str, Type type2, Date date, boolean z, boolean z2, BankAccount bankAccount, Card card) {
        str.getClass();
        type2.getClass();
        date.getClass();
        this.id = str;
        this.f1446type = type2;
        this.created = date;
        this.livemode = z;
        this.used = z2;
        this.bankAccount = bankAccount;
        this.card = card;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Token)) {
            return false;
        }
        Token token = (Token) obj;
        return Intrinsics.areEqual(this.id, token.id) && this.f1446type == token.f1446type && Intrinsics.areEqual(this.created, token.created) && this.livemode == token.livemode && this.used == token.used && Intrinsics.areEqual(this.bankAccount, token.bankAccount) && Intrinsics.areEqual(this.card, token.card);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.created.hashCode() + ((this.f1446type.hashCode() + (this.id.hashCode() * 31)) * 31)) * 31, 31, this.livemode), 31, this.used);
        BankAccount bankAccount = this.bankAccount;
        int hashCode = (m + (bankAccount == null ? 0 : bankAccount.hashCode())) * 31;
        Card card = this.card;
        return hashCode + (card != null ? card.hashCode() : 0);
    }

    public final String toString() {
        return "Token(id=" + this.id + ", type=" + this.f1446type + ", created=" + this.created + ", livemode=" + this.livemode + ", used=" + this.used + ", bankAccount=" + this.bankAccount + ", card=" + this.card + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.id);
        parcel.writeString(this.f1446type.name());
        parcel.writeSerializable(this.created);
        parcel.writeInt(this.livemode ? 1 : 0);
        parcel.writeInt(this.used ? 1 : 0);
        BankAccount bankAccount = this.bankAccount;
        if (bankAccount == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bankAccount.writeToParcel(parcel, i);
        }
        Card card = this.card;
        if (card == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            card.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ Token(String str, Type type2, Date date, boolean z, boolean z2, BankAccount bankAccount, Card card, int i) {
        this(str, type2, date, z, z2, (i & 32) != 0 ? null : bankAccount, (i & 64) != 0 ? null : card);
    }
}
