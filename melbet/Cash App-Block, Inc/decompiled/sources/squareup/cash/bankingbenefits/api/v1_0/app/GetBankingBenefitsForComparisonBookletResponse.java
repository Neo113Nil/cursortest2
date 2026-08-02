package squareup.cash.bankingbenefits.api.v1_0.app;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.advertising.views.FullscreenAdViewKt;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.mosaic.personalization.api.v1.Entity;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.BalanceImpact;
import com.squareup.protos.franklin.ui.UiAppLock;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.bills.BillsConfig;
import squareup.cash.overdraft.OverdraftUsage;
import xyz.block.protos.genie.Collection;
import xyz.block.protos.genie.OpenURL;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lsquareup/cash/bankingbenefits/api/v1_0/app/GetBankingBenefitsForComparisonBookletResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lxyz/block/protos/genie/Collection$Builder;", "Builder", "BenefitForComparisonBooklet", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class GetBankingBenefitsForComparisonBookletResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetBankingBenefitsForComparisonBookletResponse> CREATOR;
    public final List benefits;

    public final class BenefitForComparisonBooklet extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<BenefitForComparisonBooklet> CREATOR;
        public final FullscreenAdViewKt benefit_data;
        public final String name;

        public final class AtmFees extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<AtmFees> CREATOR;
            public final String best_offer_label;
            public final Money common_withdrawal_fee;

            static {
                GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$AtmFees$Companion$ADAPTER$1 getBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$AtmFees$Companion$ADAPTER$1 = new GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$AtmFees$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AtmFees.class), "type.googleapis.com/squareup.cash.bankingbenefits.api.v1_0.app.GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.AtmFees", Syntax.PROTO_2, null, "squareup/cash/bankingbenefits/api/v1_0/app/GetBankingBenefitsForComparisonBooklet.proto");
                ADAPTER = getBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$AtmFees$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(getBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$AtmFees$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AtmFees(Money money, String str, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.common_withdrawal_fee = money;
                this.best_offer_label = str;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof AtmFees)) {
                    return false;
                }
                AtmFees atmFees = (AtmFees) obj;
                return Intrinsics.areEqual(unknownFields(), atmFees.unknownFields()) && Intrinsics.areEqual(this.common_withdrawal_fee, atmFees.common_withdrawal_fee) && Intrinsics.areEqual(this.best_offer_label, atmFees.best_offer_label);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                Money money = this.common_withdrawal_fee;
                int hashCode2 = (hashCode + (money != null ? money.hashCode() : 0)) * 37;
                String str = this.best_offer_label;
                int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                BalanceImpact.Builder builder = new BalanceImpact.Builder(9);
                builder.amount = this.common_withdrawal_fee;
                builder.balance_name = this.best_offer_label;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                Money money = this.common_withdrawal_fee;
                if (money != null) {
                    Matcher$$ExternalSyntheticOutline0.m("common_withdrawal_fee=", money, arrayList);
                }
                String str = this.best_offer_label;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "best_offer_label=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "AtmFees{", "}", 0, null, null, 56);
            }
        }

        public final class Borrow extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Borrow> CREATOR;
            public final Money maximum_amount;
            public final Money minimum_amount;

            static {
                GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$Borrow$Companion$ADAPTER$1 getBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$Borrow$Companion$ADAPTER$1 = new GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$Borrow$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Borrow.class), "type.googleapis.com/squareup.cash.bankingbenefits.api.v1_0.app.GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.Borrow", Syntax.PROTO_2, null, "squareup/cash/bankingbenefits/api/v1_0/app/GetBankingBenefitsForComparisonBooklet.proto");
                ADAPTER = getBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$Borrow$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(getBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$Borrow$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Borrow(Money money, Money money2, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.minimum_amount = money;
                this.maximum_amount = money2;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Borrow)) {
                    return false;
                }
                Borrow borrow = (Borrow) obj;
                return Intrinsics.areEqual(unknownFields(), borrow.unknownFields()) && Intrinsics.areEqual(this.minimum_amount, borrow.minimum_amount) && Intrinsics.areEqual(this.maximum_amount, borrow.maximum_amount);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                Money money = this.minimum_amount;
                int hashCode2 = (hashCode + (money != null ? money.hashCode() : 0)) * 37;
                Money money2 = this.maximum_amount;
                int hashCode3 = hashCode2 + (money2 != null ? money2.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                OverdraftUsage.Builder builder = new OverdraftUsage.Builder(6);
                builder.limit = this.minimum_amount;
                builder.usage = this.maximum_amount;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                Money money = this.minimum_amount;
                if (money != null) {
                    Matcher$$ExternalSyntheticOutline0.m("minimum_amount=", money, arrayList);
                }
                Money money2 = this.maximum_amount;
                if (money2 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("maximum_amount=", money2, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Borrow{", "}", 0, null, null, 56);
            }
        }

        public final class FraudProtection extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<FraudProtection> CREATOR;
            public final Boolean available;

            static {
                GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$FraudProtection$Companion$ADAPTER$1 getBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$FraudProtection$Companion$ADAPTER$1 = new GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$FraudProtection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(FraudProtection.class), "type.googleapis.com/squareup.cash.bankingbenefits.api.v1_0.app.GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.FraudProtection", Syntax.PROTO_2, null, "squareup/cash/bankingbenefits/api/v1_0/app/GetBankingBenefitsForComparisonBooklet.proto");
                ADAPTER = getBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$FraudProtection$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(getBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$FraudProtection$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FraudProtection(Boolean bool, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.available = bool;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof FraudProtection)) {
                    return false;
                }
                FraudProtection fraudProtection = (FraudProtection) obj;
                return Intrinsics.areEqual(unknownFields(), fraudProtection.unknownFields()) && Intrinsics.areEqual(this.available, fraudProtection.available);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                Boolean bool = this.available;
                int hashCode2 = hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
                this.hashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                UiAppLock.Builder builder = new UiAppLock.Builder(27);
                builder.activated = this.available;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                Boolean bool = this.available;
                if (bool != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("available=", bool, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "FraudProtection{", "}", 0, null, null, 56);
            }
        }

        public final class Overdraft extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Overdraft> CREATOR;
            public final Money maximum_amount;

            static {
                GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$Overdraft$Companion$ADAPTER$1 getBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$Overdraft$Companion$ADAPTER$1 = new GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$Overdraft$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Overdraft.class), "type.googleapis.com/squareup.cash.bankingbenefits.api.v1_0.app.GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.Overdraft", Syntax.PROTO_2, null, "squareup/cash/bankingbenefits/api/v1_0/app/GetBankingBenefitsForComparisonBooklet.proto");
                ADAPTER = getBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$Overdraft$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(getBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$Overdraft$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Overdraft(Money money, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.maximum_amount = money;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Overdraft)) {
                    return false;
                }
                Overdraft overdraft = (Overdraft) obj;
                return Intrinsics.areEqual(unknownFields(), overdraft.unknownFields()) && Intrinsics.areEqual(this.maximum_amount, overdraft.maximum_amount);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                Money money = this.maximum_amount;
                int hashCode2 = hashCode + (money != null ? money.hashCode() : 0);
                this.hashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Entity.Payment.Builder builder = new Entity.Payment.Builder(9);
                builder.amount = this.maximum_amount;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                Money money = this.maximum_amount;
                if (money != null) {
                    Matcher$$ExternalSyntheticOutline0.m("maximum_amount=", money, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Overdraft{", "}", 0, null, null, 56);
            }
        }

        public final class PaperMoneyDeposit extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<PaperMoneyDeposit> CREATOR;
            public final Money best_deposit_fee;
            public final Money inactive_deposit_fee;

            static {
                GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$PaperMoneyDeposit$Companion$ADAPTER$1 getBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$PaperMoneyDeposit$Companion$ADAPTER$1 = new GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$PaperMoneyDeposit$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PaperMoneyDeposit.class), "type.googleapis.com/squareup.cash.bankingbenefits.api.v1_0.app.GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.PaperMoneyDeposit", Syntax.PROTO_2, null, "squareup/cash/bankingbenefits/api/v1_0/app/GetBankingBenefitsForComparisonBooklet.proto");
                ADAPTER = getBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$PaperMoneyDeposit$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(getBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$PaperMoneyDeposit$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PaperMoneyDeposit(Money money, Money money2, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.inactive_deposit_fee = money;
                this.best_deposit_fee = money2;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof PaperMoneyDeposit)) {
                    return false;
                }
                PaperMoneyDeposit paperMoneyDeposit = (PaperMoneyDeposit) obj;
                return Intrinsics.areEqual(unknownFields(), paperMoneyDeposit.unknownFields()) && Intrinsics.areEqual(this.inactive_deposit_fee, paperMoneyDeposit.inactive_deposit_fee) && Intrinsics.areEqual(this.best_deposit_fee, paperMoneyDeposit.best_deposit_fee);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                Money money = this.inactive_deposit_fee;
                int hashCode2 = (hashCode + (money != null ? money.hashCode() : 0)) * 37;
                Money money2 = this.best_deposit_fee;
                int hashCode3 = hashCode2 + (money2 != null ? money2.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                OverdraftUsage.Builder builder = new OverdraftUsage.Builder(7);
                builder.limit = this.inactive_deposit_fee;
                builder.usage = this.best_deposit_fee;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                Money money = this.inactive_deposit_fee;
                if (money != null) {
                    Matcher$$ExternalSyntheticOutline0.m("inactive_deposit_fee=", money, arrayList);
                }
                Money money2 = this.best_deposit_fee;
                if (money2 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("best_deposit_fee=", money2, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "PaperMoneyDeposit{", "}", 0, null, null, 56);
            }
        }

        public final class PhoneSupport extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<PhoneSupport> CREATOR;
            public final String best_offer_label;

            static {
                GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$PhoneSupport$Companion$ADAPTER$1 getBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$PhoneSupport$Companion$ADAPTER$1 = new GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$PhoneSupport$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PhoneSupport.class), "type.googleapis.com/squareup.cash.bankingbenefits.api.v1_0.app.GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.PhoneSupport", Syntax.PROTO_2, null, "squareup/cash/bankingbenefits/api/v1_0/app/GetBankingBenefitsForComparisonBooklet.proto");
                ADAPTER = getBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$PhoneSupport$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(getBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$PhoneSupport$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PhoneSupport(String str, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.best_offer_label = str;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof PhoneSupport)) {
                    return false;
                }
                PhoneSupport phoneSupport = (PhoneSupport) obj;
                return Intrinsics.areEqual(unknownFields(), phoneSupport.unknownFields()) && Intrinsics.areEqual(this.best_offer_label, phoneSupport.best_offer_label);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.best_offer_label;
                int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
                this.hashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                OpenURL.Builder builder = new OpenURL.Builder(2);
                builder.url = this.best_offer_label;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.best_offer_label;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "best_offer_label=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "PhoneSupport{", "}", 0, null, null, 56);
            }
        }

        public final class SavingsYield extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<SavingsYield> CREATOR;
            public final Float maximum_interest_percent;
            public final Float minimum_interest_percent;

            static {
                GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$SavingsYield$Companion$ADAPTER$1 getBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$SavingsYield$Companion$ADAPTER$1 = new GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$SavingsYield$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SavingsYield.class), "type.googleapis.com/squareup.cash.bankingbenefits.api.v1_0.app.GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.SavingsYield", Syntax.PROTO_2, null, "squareup/cash/bankingbenefits/api/v1_0/app/GetBankingBenefitsForComparisonBooklet.proto");
                ADAPTER = getBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$SavingsYield$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(getBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$SavingsYield$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SavingsYield(Float f, Float f2, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.minimum_interest_percent = f;
                this.maximum_interest_percent = f2;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof SavingsYield)) {
                    return false;
                }
                SavingsYield savingsYield = (SavingsYield) obj;
                return Intrinsics.areEqual(unknownFields(), savingsYield.unknownFields()) && Intrinsics.areEqual(this.minimum_interest_percent, savingsYield.minimum_interest_percent) && Intrinsics.areEqual(this.maximum_interest_percent, savingsYield.maximum_interest_percent);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                Float f = this.minimum_interest_percent;
                int hashCode2 = (hashCode + (f != null ? Float.hashCode(f.floatValue()) : 0)) * 37;
                Float f2 = this.maximum_interest_percent;
                int hashCode3 = hashCode2 + (f2 != null ? Float.hashCode(f2.floatValue()) : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                BillsConfig.Builder builder = new BillsConfig.Builder(8);
                builder.bills_applet_default_action = this.minimum_interest_percent;
                builder.half_applet_content = this.maximum_interest_percent;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                Float f = this.minimum_interest_percent;
                if (f != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("minimum_interest_percent=", f, arrayList);
                }
                Float f2 = this.maximum_interest_percent;
                if (f2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("maximum_interest_percent=", f2, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "SavingsYield{", "}", 0, null, null, 56);
            }
        }

        static {
            GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$Companion$ADAPTER$1 getBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$Companion$ADAPTER$1 = new GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BenefitForComparisonBooklet.class), "type.googleapis.com/squareup.cash.bankingbenefits.api.v1_0.app.GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet", Syntax.PROTO_2, null, "squareup/cash/bankingbenefits/api/v1_0/app/GetBankingBenefitsForComparisonBooklet.proto");
            ADAPTER = getBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(getBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BenefitForComparisonBooklet(String str, FullscreenAdViewKt fullscreenAdViewKt, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.name = str;
            this.benefit_data = fullscreenAdViewKt;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BenefitForComparisonBooklet)) {
                return false;
            }
            BenefitForComparisonBooklet benefitForComparisonBooklet = (BenefitForComparisonBooklet) obj;
            return Intrinsics.areEqual(unknownFields(), benefitForComparisonBooklet.unknownFields()) && Intrinsics.areEqual(this.name, benefitForComparisonBooklet.name) && Intrinsics.areEqual(this.benefit_data, benefitForComparisonBooklet.benefit_data);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.name;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            FullscreenAdViewKt fullscreenAdViewKt = this.benefit_data;
            int hashCode3 = hashCode2 + (fullscreenAdViewKt != null ? fullscreenAdViewKt.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            BillsConfig.Builder builder = new BillsConfig.Builder(7);
            builder.bills_applet_default_action = this.name;
            builder.half_applet_content = this.benefit_data;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.name;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "name=", arrayList);
            }
            FullscreenAdViewKt fullscreenAdViewKt = this.benefit_data;
            if (fullscreenAdViewKt != null) {
                arrayList.add("benefit_data=" + fullscreenAdViewKt);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "BenefitForComparisonBooklet{", "}", 0, null, null, 56);
        }
    }

    static {
        GetBankingBenefitsForComparisonBookletResponse$Companion$ADAPTER$1 getBankingBenefitsForComparisonBookletResponse$Companion$ADAPTER$1 = new GetBankingBenefitsForComparisonBookletResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetBankingBenefitsForComparisonBookletResponse.class), "type.googleapis.com/squareup.cash.bankingbenefits.api.v1_0.app.GetBankingBenefitsForComparisonBookletResponse", Syntax.PROTO_2, null, "squareup/cash/bankingbenefits/api/v1_0/app/GetBankingBenefitsForComparisonBooklet.proto");
        ADAPTER = getBankingBenefitsForComparisonBookletResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getBankingBenefitsForComparisonBookletResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetBankingBenefitsForComparisonBookletResponse(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.benefits = TransactorKt.immutableCopyOf("benefits", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetBankingBenefitsForComparisonBookletResponse)) {
            return false;
        }
        GetBankingBenefitsForComparisonBookletResponse getBankingBenefitsForComparisonBookletResponse = (GetBankingBenefitsForComparisonBookletResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getBankingBenefitsForComparisonBookletResponse.unknownFields()) && Intrinsics.areEqual(this.benefits, getBankingBenefitsForComparisonBookletResponse.benefits);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.benefits.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Collection.Builder builder = new Collection.Builder(20, false);
        builder.items = this.benefits;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.benefits;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("benefits=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetBankingBenefitsForComparisonBookletResponse{", "}", 0, null, null, 56);
    }
}
