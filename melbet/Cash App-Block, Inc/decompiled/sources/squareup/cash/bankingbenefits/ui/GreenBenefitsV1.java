package squareup.cash.bankingbenefits.ui;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.bankingbenefits.api.v1_0.app.BenefitsHub;
import com.squareup.cash.bankingbenefits.api.v1_0.app.GetBenefitLeafletResponse;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.money.booklet.DisclosureSectionKt;
import com.squareup.cash.mosaic.personalization.api.v1.Entity;
import com.squareup.lending.sync_values.CashCreditScoreSyncData;
import com.squareup.lending.sync_values.PrepurchaseCashCardData;
import com.squareup.protos.cash.blockuserjourneys.api.v1.JourneySignals;
import com.squareup.protos.cash.cashbusinesspayments.api.v1beta1.GetListingResourcesResponse;
import com.squareup.protos.cash.cashsuggest.api.OrderListSection;
import com.squareup.protos.cash.cashsuggest.api.RetroOrderSelectionResponse;
import com.squareup.protos.cash.contacts.app.ContactsPatch;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.marketdata.GetDiscoveryResponse;
import com.squareup.protos.cash.messagingplatformcommon.ondemand.GetInAppMessagesRequest;
import com.squareup.protos.cash.syncentitygateway.api.BatchSyncTopicEntitiesClientRequest;
import com.squareup.protos.cash.syncentitygateway.api.BatchSyncTopicEntitiesClientResponse;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.ClientRoutingConfig;
import com.squareup.protos.franklin.common.InvestDefaultNotificationSettings;
import com.squareup.protos.franklin.common.LendingCardRenderData;
import com.squareup.protos.franklin.common.SuggestedRecipientsData;
import com.squareup.protos.franklin.ui.UiAppLock;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.bills.BillsApplet;
import squareup.cash.bills.BillsConfig;
import squareup.cash.earnings.EarningTool;
import squareup.cash.earnings.EarningsYearToDate;

/* loaded from: classes10.dex */
public final class GreenBenefitsV1 extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GreenBenefitsV1> CREATOR;
    public final List card_holder_benefits;
    public final List green_status_benefits;

    public final class Benefit extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Benefit> CREATOR;
        public final DisclosureSectionKt element;

        public final class ATMBenefit extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<ATMBenefit> CREATOR;
            public final Money fees;

            static {
                GreenBenefitsV1$Benefit$ATMBenefit$Companion$ADAPTER$1 greenBenefitsV1$Benefit$ATMBenefit$Companion$ADAPTER$1 = new GreenBenefitsV1$Benefit$ATMBenefit$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ATMBenefit.class), "type.googleapis.com/squareup.cash.bankingbenefits.ui.GreenBenefitsV1.Benefit.ATMBenefit", Syntax.PROTO_2, null, "squareup/cash/bankingbenefits/ui/GreenBenefits.proto");
                ADAPTER = greenBenefitsV1$Benefit$ATMBenefit$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(greenBenefitsV1$Benefit$ATMBenefit$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ATMBenefit(Money money, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.fees = money;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof ATMBenefit)) {
                    return false;
                }
                ATMBenefit aTMBenefit = (ATMBenefit) obj;
                return Intrinsics.areEqual(unknownFields(), aTMBenefit.unknownFields()) && Intrinsics.areEqual(this.fees, aTMBenefit.fees);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                Money money = this.fees;
                int hashCode2 = hashCode + (money != null ? money.hashCode() : 0);
                this.hashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Entity.Payment.Builder builder = new Entity.Payment.Builder(10);
                builder.amount = this.fees;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                Money money = this.fees;
                if (money != null) {
                    Matcher$$ExternalSyntheticOutline0.m("fees=", money, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "ATMBenefit{", "}", 0, null, null, 56);
            }
        }

        public final class BorrowBenefit extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<BorrowBenefit> CREATOR;
            public final Boolean higher_borrow_limit_enabled;
            public final Money limit;

            static {
                GreenBenefitsV1$Benefit$BorrowBenefit$Companion$ADAPTER$1 greenBenefitsV1$Benefit$BorrowBenefit$Companion$ADAPTER$1 = new GreenBenefitsV1$Benefit$BorrowBenefit$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BorrowBenefit.class), "type.googleapis.com/squareup.cash.bankingbenefits.ui.GreenBenefitsV1.Benefit.BorrowBenefit", Syntax.PROTO_2, null, "squareup/cash/bankingbenefits/ui/GreenBenefits.proto");
                ADAPTER = greenBenefitsV1$Benefit$BorrowBenefit$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(greenBenefitsV1$Benefit$BorrowBenefit$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BorrowBenefit(Money money, Boolean bool, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.limit = money;
                this.higher_borrow_limit_enabled = bool;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof BorrowBenefit)) {
                    return false;
                }
                BorrowBenefit borrowBenefit = (BorrowBenefit) obj;
                return Intrinsics.areEqual(unknownFields(), borrowBenefit.unknownFields()) && Intrinsics.areEqual(this.limit, borrowBenefit.limit) && Intrinsics.areEqual(this.higher_borrow_limit_enabled, borrowBenefit.higher_borrow_limit_enabled);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                Money money = this.limit;
                int hashCode2 = (hashCode + (money != null ? money.hashCode() : 0)) * 37;
                Boolean bool = this.higher_borrow_limit_enabled;
                int hashCode3 = hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                BillsConfig.Builder builder = new BillsConfig.Builder(9);
                builder.bills_applet_default_action = this.limit;
                builder.half_applet_content = this.higher_borrow_limit_enabled;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                Money money = this.limit;
                if (money != null) {
                    Matcher$$ExternalSyntheticOutline0.m("limit=", money, arrayList);
                }
                Boolean bool = this.higher_borrow_limit_enabled;
                if (bool != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("higher_borrow_limit_enabled=", bool, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "BorrowBenefit{", "}", 0, null, null, 56);
            }
        }

        public final class OverdraftBenefit extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<OverdraftBenefit> CREATOR;
            public final LocalizedString disclosure;
            public final Money limit;
            public final Boolean requires_disclosure;

            static {
                GreenBenefitsV1$Benefit$OverdraftBenefit$Companion$ADAPTER$1 greenBenefitsV1$Benefit$OverdraftBenefit$Companion$ADAPTER$1 = new GreenBenefitsV1$Benefit$OverdraftBenefit$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OverdraftBenefit.class), "type.googleapis.com/squareup.cash.bankingbenefits.ui.GreenBenefitsV1.Benefit.OverdraftBenefit", Syntax.PROTO_2, null, "squareup/cash/bankingbenefits/ui/GreenBenefits.proto");
                ADAPTER = greenBenefitsV1$Benefit$OverdraftBenefit$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(greenBenefitsV1$Benefit$OverdraftBenefit$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OverdraftBenefit(Money money, Boolean bool, LocalizedString localizedString, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.limit = money;
                this.requires_disclosure = bool;
                this.disclosure = localizedString;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof OverdraftBenefit)) {
                    return false;
                }
                OverdraftBenefit overdraftBenefit = (OverdraftBenefit) obj;
                return Intrinsics.areEqual(unknownFields(), overdraftBenefit.unknownFields()) && Intrinsics.areEqual(this.limit, overdraftBenefit.limit) && Intrinsics.areEqual(this.requires_disclosure, overdraftBenefit.requires_disclosure) && Intrinsics.areEqual(this.disclosure, overdraftBenefit.disclosure);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                Money money = this.limit;
                int hashCode2 = (hashCode + (money != null ? money.hashCode() : 0)) * 37;
                Boolean bool = this.requires_disclosure;
                int hashCode3 = (hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
                LocalizedString localizedString = this.disclosure;
                int hashCode4 = hashCode3 + (localizedString != null ? localizedString.hashCode() : 0);
                this.hashCode = hashCode4;
                return hashCode4;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                BillsApplet.Builder builder = new BillsApplet.Builder(13);
                builder.action = this.limit;
                builder.full_applet = this.requires_disclosure;
                builder.half_applet = this.disclosure;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                Money money = this.limit;
                if (money != null) {
                    Matcher$$ExternalSyntheticOutline0.m("limit=", money, arrayList);
                }
                Boolean bool = this.requires_disclosure;
                if (bool != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("requires_disclosure=", bool, arrayList);
                }
                LocalizedString localizedString = this.disclosure;
                if (localizedString != null) {
                    Matcher$$ExternalSyntheticOutline0.m("disclosure=", localizedString, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "OverdraftBenefit{", "}", 0, null, null, 56);
            }
        }

        public final class PaperMoneyDepositBenefit extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<PaperMoneyDepositBenefit> CREATOR;
            public final Money fees;

            static {
                GreenBenefitsV1$Benefit$PaperMoneyDepositBenefit$Companion$ADAPTER$1 greenBenefitsV1$Benefit$PaperMoneyDepositBenefit$Companion$ADAPTER$1 = new GreenBenefitsV1$Benefit$PaperMoneyDepositBenefit$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PaperMoneyDepositBenefit.class), "type.googleapis.com/squareup.cash.bankingbenefits.ui.GreenBenefitsV1.Benefit.PaperMoneyDepositBenefit", Syntax.PROTO_2, null, "squareup/cash/bankingbenefits/ui/GreenBenefits.proto");
                ADAPTER = greenBenefitsV1$Benefit$PaperMoneyDepositBenefit$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(greenBenefitsV1$Benefit$PaperMoneyDepositBenefit$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PaperMoneyDepositBenefit(Money money, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.fees = money;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof PaperMoneyDepositBenefit)) {
                    return false;
                }
                PaperMoneyDepositBenefit paperMoneyDepositBenefit = (PaperMoneyDepositBenefit) obj;
                return Intrinsics.areEqual(unknownFields(), paperMoneyDepositBenefit.unknownFields()) && Intrinsics.areEqual(this.fees, paperMoneyDepositBenefit.fees);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                Money money = this.fees;
                int hashCode2 = hashCode + (money != null ? money.hashCode() : 0);
                this.hashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Entity.Payment.Builder builder = new Entity.Payment.Builder(11);
                builder.amount = this.fees;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                Money money = this.fees;
                if (money != null) {
                    Matcher$$ExternalSyntheticOutline0.m("fees=", money, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "PaperMoneyDepositBenefit{", "}", 0, null, null, 56);
            }
        }

        public final class PrioritySupportBenefit extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<PrioritySupportBenefit> CREATOR;
            public final Boolean enabled;

            static {
                GreenBenefitsV1$Benefit$PrioritySupportBenefit$Companion$ADAPTER$1 greenBenefitsV1$Benefit$PrioritySupportBenefit$Companion$ADAPTER$1 = new GreenBenefitsV1$Benefit$PrioritySupportBenefit$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PrioritySupportBenefit.class), "type.googleapis.com/squareup.cash.bankingbenefits.ui.GreenBenefitsV1.Benefit.PrioritySupportBenefit", Syntax.PROTO_2, null, "squareup/cash/bankingbenefits/ui/GreenBenefits.proto");
                ADAPTER = greenBenefitsV1$Benefit$PrioritySupportBenefit$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(greenBenefitsV1$Benefit$PrioritySupportBenefit$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PrioritySupportBenefit(Boolean bool, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.enabled = bool;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof PrioritySupportBenefit)) {
                    return false;
                }
                PrioritySupportBenefit prioritySupportBenefit = (PrioritySupportBenefit) obj;
                return Intrinsics.areEqual(unknownFields(), prioritySupportBenefit.unknownFields()) && Intrinsics.areEqual(this.enabled, prioritySupportBenefit.enabled);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                Boolean bool = this.enabled;
                int hashCode2 = hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
                this.hashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                UiAppLock.Builder builder = new UiAppLock.Builder(28);
                builder.activated = this.enabled;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                Boolean bool = this.enabled;
                if (bool != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("enabled=", bool, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "PrioritySupportBenefit{", "}", 0, null, null, 56);
            }
        }

        public final class SavingsBenefit extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<SavingsBenefit> CREATOR;
            public final Integer apy_bips;

            static {
                GreenBenefitsV1$Benefit$SavingsBenefit$Companion$ADAPTER$1 greenBenefitsV1$Benefit$SavingsBenefit$Companion$ADAPTER$1 = new GreenBenefitsV1$Benefit$SavingsBenefit$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SavingsBenefit.class), "type.googleapis.com/squareup.cash.bankingbenefits.ui.GreenBenefitsV1.Benefit.SavingsBenefit", Syntax.PROTO_2, null, "squareup/cash/bankingbenefits/ui/GreenBenefits.proto");
                ADAPTER = greenBenefitsV1$Benefit$SavingsBenefit$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(greenBenefitsV1$Benefit$SavingsBenefit$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SavingsBenefit(Integer num, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.apy_bips = num;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof SavingsBenefit)) {
                    return false;
                }
                SavingsBenefit savingsBenefit = (SavingsBenefit) obj;
                return Intrinsics.areEqual(unknownFields(), savingsBenefit.unknownFields()) && Intrinsics.areEqual(this.apy_bips, savingsBenefit.apy_bips);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                Integer num = this.apy_bips;
                int hashCode2 = hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0);
                this.hashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                EarningsYearToDate.Builder builder = new EarningsYearToDate.Builder(8);
                builder.year = this.apy_bips;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                Integer num = this.apy_bips;
                if (num != null) {
                    re$$ExternalSyntheticOutline0.m("apy_bips=", num, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "SavingsBenefit{", "}", 0, null, null, 56);
            }
        }

        public final class WeeklyOffersBenefit extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<WeeklyOffersBenefit> CREATOR;
            public final Integer limit;

            static {
                GreenBenefitsV1$Benefit$WeeklyOffersBenefit$Companion$ADAPTER$1 greenBenefitsV1$Benefit$WeeklyOffersBenefit$Companion$ADAPTER$1 = new GreenBenefitsV1$Benefit$WeeklyOffersBenefit$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(WeeklyOffersBenefit.class), "type.googleapis.com/squareup.cash.bankingbenefits.ui.GreenBenefitsV1.Benefit.WeeklyOffersBenefit", Syntax.PROTO_2, null, "squareup/cash/bankingbenefits/ui/GreenBenefits.proto");
                ADAPTER = greenBenefitsV1$Benefit$WeeklyOffersBenefit$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(greenBenefitsV1$Benefit$WeeklyOffersBenefit$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public WeeklyOffersBenefit(Integer num, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.limit = num;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof WeeklyOffersBenefit)) {
                    return false;
                }
                WeeklyOffersBenefit weeklyOffersBenefit = (WeeklyOffersBenefit) obj;
                return Intrinsics.areEqual(unknownFields(), weeklyOffersBenefit.unknownFields()) && Intrinsics.areEqual(this.limit, weeklyOffersBenefit.limit);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                Integer num = this.limit;
                int hashCode2 = hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0);
                this.hashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                EarningsYearToDate.Builder builder = new EarningsYearToDate.Builder(9);
                builder.year = this.limit;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                Integer num = this.limit;
                if (num != null) {
                    re$$ExternalSyntheticOutline0.m("limit=", num, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "WeeklyOffersBenefit{", "}", 0, null, null, 56);
            }
        }

        static {
            GreenBenefitsV1$Benefit$Companion$ADAPTER$1 greenBenefitsV1$Benefit$Companion$ADAPTER$1 = new GreenBenefitsV1$Benefit$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Benefit.class), "type.googleapis.com/squareup.cash.bankingbenefits.ui.GreenBenefitsV1.Benefit", Syntax.PROTO_2, null, "squareup/cash/bankingbenefits/ui/GreenBenefits.proto");
            ADAPTER = greenBenefitsV1$Benefit$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(greenBenefitsV1$Benefit$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Benefit(DisclosureSectionKt disclosureSectionKt, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.element = disclosureSectionKt;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Benefit)) {
                return false;
            }
            Benefit benefit = (Benefit) obj;
            return Intrinsics.areEqual(unknownFields(), benefit.unknownFields()) && Intrinsics.areEqual(this.element, benefit.element);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            DisclosureSectionKt disclosureSectionKt = this.element;
            int hashCode2 = hashCode + (disclosureSectionKt != null ? disclosureSectionKt.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            EarningTool.Builder builder = new EarningTool.Builder(7);
            builder.tool = this.element;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            DisclosureSectionKt disclosureSectionKt = this.element;
            if (disclosureSectionKt != null) {
                arrayList.add("element=" + disclosureSectionKt);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Benefit{", "}", 0, null, null, 56);
        }
    }

    static {
        GreenBenefitsV1$Companion$ADAPTER$1 greenBenefitsV1$Companion$ADAPTER$1 = new GreenBenefitsV1$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GreenBenefitsV1.class), "type.googleapis.com/squareup.cash.bankingbenefits.ui.GreenBenefitsV1", Syntax.PROTO_2, null, "squareup/cash/bankingbenefits/ui/GreenBenefits.proto");
        ADAPTER = greenBenefitsV1$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(greenBenefitsV1$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GreenBenefitsV1(List list, List list2, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.card_holder_benefits = TransactorKt.immutableCopyOf("card_holder_benefits", list);
        this.green_status_benefits = TransactorKt.immutableCopyOf("green_status_benefits", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GreenBenefitsV1)) {
            return false;
        }
        GreenBenefitsV1 greenBenefitsV1 = (GreenBenefitsV1) obj;
        return Intrinsics.areEqual(unknownFields(), greenBenefitsV1.unknownFields()) && Intrinsics.areEqual(this.card_holder_benefits, greenBenefitsV1.card_holder_benefits) && Intrinsics.areEqual(this.green_status_benefits, greenBenefitsV1.green_status_benefits);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.green_status_benefits.hashCode() + Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.card_holder_benefits);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0, false);
        builder.card_holder_benefits = this.card_holder_benefits;
        builder.green_status_benefits = this.green_status_benefits;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.card_holder_benefits;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("card_holder_benefits=", arrayList, list);
        }
        List list2 = this.green_status_benefits;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("green_status_benefits=", arrayList, list2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GreenBenefitsV1{", "}", 0, null, null, 56);
    }

    /* loaded from: classes7.dex */
    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public List card_holder_benefits;
        public List green_status_benefits;

        public Builder(int i) {
            this.$r8$classId = i;
            switch (i) {
                case 12:
                    EmptyList emptyList = EmptyList.INSTANCE;
                    this.card_holder_benefits = emptyList;
                    this.green_status_benefits = emptyList;
                    break;
                case 13:
                    EmptyList emptyList2 = EmptyList.INSTANCE;
                    this.card_holder_benefits = emptyList2;
                    this.green_status_benefits = emptyList2;
                    break;
                case 18:
                    EmptyList emptyList3 = EmptyList.INSTANCE;
                    this.card_holder_benefits = emptyList3;
                    this.green_status_benefits = emptyList3;
                    break;
                default:
                    EmptyList emptyList4 = EmptyList.INSTANCE;
                    this.card_holder_benefits = emptyList4;
                    this.green_status_benefits = emptyList4;
                    break;
            }
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new GreenBenefitsV1(this.card_holder_benefits, this.green_status_benefits, buildUnknownFields());
                case 1:
                    return new BenefitsHub.Insights(this.card_holder_benefits, this.green_status_benefits, buildUnknownFields());
                case 2:
                    return new GetBenefitLeafletResponse(this.card_holder_benefits, this.green_status_benefits, buildUnknownFields());
                case 3:
                    return new CashCreditScoreSyncData(this.card_holder_benefits, this.green_status_benefits, buildUnknownFields());
                case 4:
                    return new PrepurchaseCashCardData(this.card_holder_benefits, this.green_status_benefits, buildUnknownFields());
                case 5:
                    return new JourneySignals(this.card_holder_benefits, this.green_status_benefits, buildUnknownFields());
                case 6:
                    return new GetListingResourcesResponse(this.card_holder_benefits, this.green_status_benefits, buildUnknownFields());
                case 7:
                    return new OrderListSection.EligibleRetroOrders(this.card_holder_benefits, this.green_status_benefits, buildUnknownFields());
                case 8:
                    return new RetroOrderSelectionResponse.EligibleRetroOrdersSection(this.card_holder_benefits, this.green_status_benefits, buildUnknownFields());
                case 9:
                    return new ContactsPatch(this.card_holder_benefits, this.green_status_benefits, buildUnknownFields());
                case 10:
                    return new Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.LimitedAccountTypes(this.card_holder_benefits, this.green_status_benefits, buildUnknownFields());
                case 11:
                    return new GetDiscoveryResponse(this.card_holder_benefits, this.green_status_benefits, buildUnknownFields());
                case 12:
                    return new GetInAppMessagesRequest(this.card_holder_benefits, this.green_status_benefits, buildUnknownFields());
                case 13:
                    return new BatchSyncTopicEntitiesClientRequest(this.card_holder_benefits, this.green_status_benefits, buildUnknownFields());
                case 14:
                    return new BatchSyncTopicEntitiesClientResponse(this.card_holder_benefits, this.green_status_benefits, buildUnknownFields());
                case 15:
                    return new ClientRoutingConfig(this.card_holder_benefits, this.green_status_benefits, buildUnknownFields());
                case 16:
                    return new InvestDefaultNotificationSettings(this.card_holder_benefits, this.green_status_benefits, buildUnknownFields());
                case 17:
                    return new LendingCardRenderData(this.card_holder_benefits, this.green_status_benefits, buildUnknownFields());
                default:
                    return new SuggestedRecipientsData(this.card_holder_benefits, this.green_status_benefits, buildUnknownFields());
            }
        }

        public /* synthetic */ Builder(int i, boolean z) {
            this.$r8$classId = i;
        }
    }
}
