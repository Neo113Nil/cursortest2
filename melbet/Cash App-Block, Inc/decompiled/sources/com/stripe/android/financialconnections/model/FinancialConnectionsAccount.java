package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.core.model.serializers.EnumIgnoreUnknownSerializer;
import com.stripe.android.financialconnections.model.Cta;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;
import okhttp3.internal.Tags;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@Serializable
/* loaded from: classes8.dex */
public final class FinancialConnectionsAccount extends PaymentAccount implements StripeModel {
    public static final Lazy[] $childSerializers;
    public final Balance balance;
    public final BalanceRefresh balanceRefresh;
    public final Category category;
    public final int created;
    public final String displayName;
    public final String id;
    public final String institutionName;
    public final String last4;
    public final boolean livemode;
    public final String object;
    public final String ownership;
    public final OwnershipRefresh ownershipRefresh;
    public final List permissions;
    public final Status status;
    public final Subcategory subcategory;
    public final List supportedPaymentMethodTypes;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<FinancialConnectionsAccount> CREATOR = new Cta.Creator(15);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000b\nB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"com/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category", "", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "Serializer", "CASH", "CREDIT", "INVESTMENT", "OTHER", "UNKNOWN", "financial-connections-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @Serializable(with = Serializer.class)
    public final class Category {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Category[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String value;

        @SerialName("cash")
        public static final Category CASH = new Category("CASH", 0, "cash");

        @SerialName("credit")
        public static final Category CREDIT = new Category("CREDIT", 1, "credit");

        @SerialName("investment")
        public static final Category INVESTMENT = new Category("INVESTMENT", 2, "investment");

        @SerialName("other")
        public static final Category OTHER = new Category("OTHER", 3, "other");
        public static final Category UNKNOWN = new Category("UNKNOWN", 4, "unknown");

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer serializer() {
                return Serializer.INSTANCE;
            }
        }

        public final class Serializer extends EnumIgnoreUnknownSerializer {
            public static final Serializer INSTANCE = new Serializer((Enum[]) Category.getEntries().toArray(new Category[0]), Category.UNKNOWN);
        }

        private static final /* synthetic */ Category[] $values() {
            return new Category[]{CASH, CREDIT, INVESTMENT, OTHER, UNKNOWN};
        }

        static {
            Category[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion();
        }

        private Category(String str, int i, String str2) {
            this.value = str2;
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static Category valueOf(String str) {
            return (Category) Enum.valueOf(Category.class, str);
        }

        public static Category[] values() {
            return (Category[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0087T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"com/stripe/android/financialconnections/model/FinancialConnectionsAccount$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "OBJECT_OLD", "Ljava/lang/String;", "OBJECT_NEW", "financial-connections-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return FinancialConnectionsAccount$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000b\nB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"com/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions", "", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "Serializer", "BALANCES", "OWNERSHIP", "PAYMENT_METHOD", "TRANSACTIONS", "ACCOUNT_NUMBERS", "UNKNOWN", "financial-connections-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @Serializable(with = Serializer.class)
    public final class Permissions {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Permissions[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String value;

        @SerialName("balances")
        public static final Permissions BALANCES = new Permissions("BALANCES", 0, "balances");

        @SerialName("ownership")
        public static final Permissions OWNERSHIP = new Permissions("OWNERSHIP", 1, "ownership");

        @SerialName("payment_method")
        public static final Permissions PAYMENT_METHOD = new Permissions("PAYMENT_METHOD", 2, "payment_method");

        @SerialName("transactions")
        public static final Permissions TRANSACTIONS = new Permissions("TRANSACTIONS", 3, "transactions");

        @SerialName("account_numbers")
        public static final Permissions ACCOUNT_NUMBERS = new Permissions("ACCOUNT_NUMBERS", 4, "account_numbers");
        public static final Permissions UNKNOWN = new Permissions("UNKNOWN", 5, "unknown");

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer serializer() {
                return Serializer.INSTANCE;
            }
        }

        public final class Serializer extends EnumIgnoreUnknownSerializer {
            public static final Serializer INSTANCE = new Serializer((Enum[]) Permissions.getEntries().toArray(new Permissions[0]), Permissions.UNKNOWN);
        }

        private static final /* synthetic */ Permissions[] $values() {
            return new Permissions[]{BALANCES, OWNERSHIP, PAYMENT_METHOD, TRANSACTIONS, ACCOUNT_NUMBERS, UNKNOWN};
        }

        static {
            Permissions[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion();
        }

        private Permissions(String str, int i, String str2) {
            this.value = str2;
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static Permissions valueOf(String str) {
            return (Permissions) Enum.valueOf(Permissions.class, str);
        }

        public static Permissions[] values() {
            return (Permissions[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000b\nB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"com/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status", "", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "Serializer", "ACTIVE", "DISCONNECTED", "INACTIVE", "UNKNOWN", "financial-connections-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @Serializable(with = Serializer.class)
    public final class Status {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String value;

        @SerialName("active")
        public static final Status ACTIVE = new Status("ACTIVE", 0, "active");

        @SerialName("disconnected")
        public static final Status DISCONNECTED = new Status("DISCONNECTED", 1, "disconnected");

        @SerialName("inactive")
        public static final Status INACTIVE = new Status("INACTIVE", 2, "inactive");
        public static final Status UNKNOWN = new Status("UNKNOWN", 3, "unknown");

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer serializer() {
                return Serializer.INSTANCE;
            }
        }

        public final class Serializer extends EnumIgnoreUnknownSerializer {
            public static final Serializer INSTANCE = new Serializer((Enum[]) Status.getEntries().toArray(new Status[0]), Status.UNKNOWN);
        }

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{ACTIVE, DISCONNECTED, INACTIVE, UNKNOWN};
        }

        static {
            Status[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion();
        }

        private Status(String str, int i, String str2) {
            this.value = str2;
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000b\nB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"com/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory", "", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "Serializer", "CHECKING", "CREDIT_CARD", "LINE_OF_CREDIT", "MORTGAGE", "OTHER", "SAVINGS", "UNKNOWN", "financial-connections-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @Serializable(with = Serializer.class)
    public final class Subcategory {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Subcategory[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String value;

        @SerialName("checking")
        public static final Subcategory CHECKING = new Subcategory("CHECKING", 0, "checking");

        @SerialName("credit_card")
        public static final Subcategory CREDIT_CARD = new Subcategory("CREDIT_CARD", 1, "credit_card");

        @SerialName("line_of_credit")
        public static final Subcategory LINE_OF_CREDIT = new Subcategory("LINE_OF_CREDIT", 2, "line_of_credit");

        @SerialName("mortgage")
        public static final Subcategory MORTGAGE = new Subcategory("MORTGAGE", 3, "mortgage");

        @SerialName("other")
        public static final Subcategory OTHER = new Subcategory("OTHER", 4, "other");

        @SerialName("savings")
        public static final Subcategory SAVINGS = new Subcategory("SAVINGS", 5, "savings");
        public static final Subcategory UNKNOWN = new Subcategory("UNKNOWN", 6, "unknown");

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer serializer() {
                return Serializer.INSTANCE;
            }
        }

        public final class Serializer extends EnumIgnoreUnknownSerializer {
            public static final Serializer INSTANCE = new Serializer((Enum[]) Subcategory.getEntries().toArray(new Subcategory[0]), Subcategory.UNKNOWN);
        }

        private static final /* synthetic */ Subcategory[] $values() {
            return new Subcategory[]{CHECKING, CREDIT_CARD, LINE_OF_CREDIT, MORTGAGE, OTHER, SAVINGS, UNKNOWN};
        }

        static {
            Subcategory[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion();
        }

        private Subcategory(String str, int i, String str2) {
            this.value = str2;
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static Subcategory valueOf(String str) {
            return (Subcategory) Enum.valueOf(Subcategory.class, str);
        }

        public static Subcategory[] values() {
            return (Subcategory[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000b\nB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"com/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes", "", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "Serializer", "LINK", "US_BANK_ACCOUNT", "UNKNOWN", "financial-connections-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @Serializable(with = Serializer.class)
    public final class SupportedPaymentMethodTypes {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SupportedPaymentMethodTypes[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String value;

        @SerialName("link")
        public static final SupportedPaymentMethodTypes LINK = new SupportedPaymentMethodTypes("LINK", 0, "link");

        @SerialName("us_bank_account")
        public static final SupportedPaymentMethodTypes US_BANK_ACCOUNT = new SupportedPaymentMethodTypes("US_BANK_ACCOUNT", 1, "us_bank_account");
        public static final SupportedPaymentMethodTypes UNKNOWN = new SupportedPaymentMethodTypes("UNKNOWN", 2, "unknown");

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer serializer() {
                return Serializer.INSTANCE;
            }
        }

        public final class Serializer extends EnumIgnoreUnknownSerializer {
            public static final Serializer INSTANCE = new Serializer((Enum[]) SupportedPaymentMethodTypes.getEntries().toArray(new SupportedPaymentMethodTypes[0]), SupportedPaymentMethodTypes.UNKNOWN);
        }

        private static final /* synthetic */ SupportedPaymentMethodTypes[] $values() {
            return new SupportedPaymentMethodTypes[]{LINK, US_BANK_ACCOUNT, UNKNOWN};
        }

        static {
            SupportedPaymentMethodTypes[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion();
        }

        private SupportedPaymentMethodTypes(String str, int i, String str2) {
            this.value = str2;
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static SupportedPaymentMethodTypes valueOf(String str) {
            return (SupportedPaymentMethodTypes) Enum.valueOf(SupportedPaymentMethodTypes.class, str);
        }

        public static SupportedPaymentMethodTypes[] values() {
            return (SupportedPaymentMethodTypes[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        $childSerializers = new Lazy[]{null, null, null, null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Body$$ExternalSyntheticLambda0(25)), null, null, null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Body$$ExternalSyntheticLambda0(26)), null};
    }

    public FinancialConnectionsAccount(int i, Category category, int i2, String str, String str2, boolean z, Status status, Subcategory subcategory, List list, Balance balance, BalanceRefresh balanceRefresh, String str3, String str4, String str5, OwnershipRefresh ownershipRefresh, List list2, String str6) {
        if (32926 != (i & 32926)) {
            TuplesKt.throwMissingFieldException(i, 32926, FinancialConnectionsAccount$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.category = (i & 1) == 0 ? Category.UNKNOWN : category;
        this.created = i2;
        this.id = str;
        this.institutionName = str2;
        this.livemode = z;
        if ((i & 32) == 0) {
            this.status = Status.UNKNOWN;
        } else {
            this.status = status;
        }
        if ((i & 64) == 0) {
            this.subcategory = Subcategory.UNKNOWN;
        } else {
            this.subcategory = subcategory;
        }
        this.supportedPaymentMethodTypes = list;
        if ((i & 256) == 0) {
            this.balance = null;
        } else {
            this.balance = balance;
        }
        if ((i & 512) == 0) {
            this.balanceRefresh = null;
        } else {
            this.balanceRefresh = balanceRefresh;
        }
        if ((i & 1024) == 0) {
            this.displayName = null;
        } else {
            this.displayName = str3;
        }
        if ((i & 2048) == 0) {
            this.last4 = null;
        } else {
            this.last4 = str4;
        }
        if ((i & 4096) == 0) {
            this.ownership = null;
        } else {
            this.ownership = str5;
        }
        if ((i & PKIFailureInfo.certRevoked) == 0) {
            this.ownershipRefresh = null;
        } else {
            this.ownershipRefresh = ownershipRefresh;
        }
        if ((i & 16384) == 0) {
            this.permissions = null;
        } else {
            this.permissions = list2;
        }
        this.object = str6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FinancialConnectionsAccount)) {
            return false;
        }
        FinancialConnectionsAccount financialConnectionsAccount = (FinancialConnectionsAccount) obj;
        return this.category == financialConnectionsAccount.category && this.created == financialConnectionsAccount.created && Intrinsics.areEqual(this.id, financialConnectionsAccount.id) && Intrinsics.areEqual(this.institutionName, financialConnectionsAccount.institutionName) && this.livemode == financialConnectionsAccount.livemode && this.status == financialConnectionsAccount.status && this.subcategory == financialConnectionsAccount.subcategory && Intrinsics.areEqual(this.supportedPaymentMethodTypes, financialConnectionsAccount.supportedPaymentMethodTypes) && Intrinsics.areEqual(this.balance, financialConnectionsAccount.balance) && Intrinsics.areEqual(this.balanceRefresh, financialConnectionsAccount.balanceRefresh) && Intrinsics.areEqual(this.displayName, financialConnectionsAccount.displayName) && Intrinsics.areEqual(this.last4, financialConnectionsAccount.last4) && Intrinsics.areEqual(this.ownership, financialConnectionsAccount.ownership) && Intrinsics.areEqual(this.ownershipRefresh, financialConnectionsAccount.ownershipRefresh) && Intrinsics.areEqual(this.permissions, financialConnectionsAccount.permissions);
    }

    @Override // com.stripe.android.financialconnections.model.PaymentAccount
    public final String getId() {
        return this.id;
    }

    public final int hashCode() {
        int m = Recorder$$ExternalSyntheticOutline2.m((this.subcategory.hashCode() + ((this.status.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.created, this.category.hashCode() * 31, 31), 31, this.id), 31, this.institutionName), 31, this.livemode)) * 31)) * 31, 31, this.supportedPaymentMethodTypes);
        Balance balance = this.balance;
        int hashCode = (m + (balance == null ? 0 : balance.hashCode())) * 31;
        BalanceRefresh balanceRefresh = this.balanceRefresh;
        int hashCode2 = (hashCode + (balanceRefresh == null ? 0 : balanceRefresh.hashCode())) * 31;
        String str = this.displayName;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.last4;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ownership;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        OwnershipRefresh ownershipRefresh = this.ownershipRefresh;
        int hashCode6 = (hashCode5 + (ownershipRefresh == null ? 0 : ownershipRefresh.hashCode())) * 31;
        List list = this.permissions;
        return hashCode6 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FinancialConnectionsAccount(category=");
        sb.append(this.category);
        sb.append(", created=");
        sb.append(this.created);
        sb.append(", id=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.id, ", institutionName=", this.institutionName, ", livemode=");
        sb.append(this.livemode);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", subcategory=");
        sb.append(this.subcategory);
        sb.append(", supportedPaymentMethodTypes=");
        sb.append(this.supportedPaymentMethodTypes);
        sb.append(", balance=");
        sb.append(this.balance);
        sb.append(", balanceRefresh=");
        sb.append(this.balanceRefresh);
        sb.append(", displayName=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.displayName, ", last4=", this.last4, ", ownership=");
        sb.append(this.ownership);
        sb.append(", ownershipRefresh=");
        sb.append(this.ownershipRefresh);
        sb.append(", permissions=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.permissions, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.category.name());
        parcel.writeInt(this.created);
        parcel.writeString(this.id);
        parcel.writeString(this.institutionName);
        parcel.writeInt(this.livemode ? 1 : 0);
        parcel.writeString(this.status.name());
        parcel.writeString(this.subcategory.name());
        Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.supportedPaymentMethodTypes, parcel);
        while (m.hasNext()) {
            parcel.writeString(((SupportedPaymentMethodTypes) m.next()).name());
        }
        Balance balance = this.balance;
        if (balance == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            balance.writeToParcel(parcel, i);
        }
        BalanceRefresh balanceRefresh = this.balanceRefresh;
        if (balanceRefresh == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            balanceRefresh.writeToParcel(parcel, i);
        }
        parcel.writeString(this.displayName);
        parcel.writeString(this.last4);
        parcel.writeString(this.ownership);
        OwnershipRefresh ownershipRefresh = this.ownershipRefresh;
        if (ownershipRefresh == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ownershipRefresh.writeToParcel(parcel, i);
        }
        List list = this.permissions;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator m2 = SVG$Unit$EnumUnboxingLocalUtility.m(parcel, 1, list);
        while (m2.hasNext()) {
            parcel.writeString(((Permissions) m2.next()).name());
        }
    }

    public FinancialConnectionsAccount(Category category, int i, String str, String str2, boolean z, Status status, Subcategory subcategory, ArrayList arrayList, Balance balance, BalanceRefresh balanceRefresh, String str3, String str4, String str5, OwnershipRefresh ownershipRefresh, ArrayList arrayList2) {
        category.getClass();
        str.getClass();
        str2.getClass();
        status.getClass();
        subcategory.getClass();
        this.category = category;
        this.created = i;
        this.id = str;
        this.institutionName = str2;
        this.livemode = z;
        this.status = status;
        this.subcategory = subcategory;
        this.supportedPaymentMethodTypes = arrayList;
        this.balance = balance;
        this.balanceRefresh = balanceRefresh;
        this.displayName = str3;
        this.last4 = str4;
        this.ownership = str5;
        this.ownershipRefresh = ownershipRefresh;
        this.permissions = arrayList2;
        this.object = "financial_connections.account";
    }
}
