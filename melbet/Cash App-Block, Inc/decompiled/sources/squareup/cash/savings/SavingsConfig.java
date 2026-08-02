package squareup.cash.savings;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.lending.CashCreditScoreHomeData;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletEntrypoint;
import com.squareup.protos.cash.cashsuggest.api.HeroUpsellSection;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.protos.cash.ui.Animation;
import com.squareup.protos.franklin.api.DirectDepositBlockerBenefitsIcon;
import com.squareup.protos.lending.sync_values.BorrowAppletLoanHistoryTile;
import com.squareup.protos.lending.sync_values.BorrowLimitHubData;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.bills.BillsConfig;
import squareup.cash.earnings.EarningHeaderSection;
import squareup.cash.earnings.EarningTool;
import squareup.cash.overdraft.OverdraftStatus;
import squareup.cash.savings.action.Card;
import xyz.block.protos.genie.Action;

/* loaded from: classes10.dex */
public final class SavingsConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SavingsConfig> CREATOR;
    public final SavingsAppletUi applet;
    public final DirectDepositSavingsBenefit direct_deposit_savings_benefit;
    public final Card get_cash_card_to_start_earning_card;
    public final squareup.cash.savings.bespoke_elements.Card get_cash_card_to_start_earning_card_element;
    public final Animation goal_celebration_animation;
    public final Yield yield;

    public final class DirectDepositSavingsBenefit extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<DirectDepositSavingsBenefit> CREATOR;
        public final DirectDepositBlockerBenefitsIcon icon;
        public final LocalizedString text;

        static {
            SavingsConfig$DirectDepositSavingsBenefit$Companion$ADAPTER$1 savingsConfig$DirectDepositSavingsBenefit$Companion$ADAPTER$1 = new SavingsConfig$DirectDepositSavingsBenefit$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DirectDepositSavingsBenefit.class), "type.googleapis.com/squareup.cash.savings.SavingsConfig.DirectDepositSavingsBenefit", Syntax.PROTO_2, null, "squareup/cash/savings/SavingsConfig.proto");
            ADAPTER = savingsConfig$DirectDepositSavingsBenefit$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(savingsConfig$DirectDepositSavingsBenefit$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DirectDepositSavingsBenefit(LocalizedString localizedString, DirectDepositBlockerBenefitsIcon directDepositBlockerBenefitsIcon, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.text = localizedString;
            this.icon = directDepositBlockerBenefitsIcon;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DirectDepositSavingsBenefit)) {
                return false;
            }
            DirectDepositSavingsBenefit directDepositSavingsBenefit = (DirectDepositSavingsBenefit) obj;
            return Intrinsics.areEqual(unknownFields(), directDepositSavingsBenefit.unknownFields()) && Intrinsics.areEqual(this.text, directDepositSavingsBenefit.text) && this.icon == directDepositSavingsBenefit.icon;
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalizedString localizedString = this.text;
            int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            DirectDepositBlockerBenefitsIcon directDepositBlockerBenefitsIcon = this.icon;
            int hashCode3 = hashCode2 + (directDepositBlockerBenefitsIcon != null ? directDepositBlockerBenefitsIcon.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            BillsConfig.Builder builder = new BillsConfig.Builder(22);
            builder.bills_applet_default_action = this.text;
            builder.half_applet_content = this.icon;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalizedString localizedString = this.text;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("text=", localizedString, arrayList);
            }
            DirectDepositBlockerBenefitsIcon directDepositBlockerBenefitsIcon = this.icon;
            if (directDepositBlockerBenefitsIcon != null) {
                arrayList.add("icon=" + directDepositBlockerBenefitsIcon);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "DirectDepositSavingsBenefit{", "}", 0, null, null, 56);
        }
    }

    public final class SavingsAppletUi extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<SavingsAppletUi> CREATOR;
        public final FolderSubtitles subtitles;

        public final class FolderSubtitles extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<FolderSubtitles> CREATOR;
            public final Yield yield;

            public final class Yield extends AndroidMessage {
                public static final ProtoAdapter ADAPTER;
                public static final Parcelable.Creator<Yield> CREATOR;
                public final LocalizedString yield_current_rate_enhanced;
                public final LocalizedString yield_current_rate_standard;
                public final LocalizedString yield_earn_up_to_enhanced;
                public final LocalizedString yield_subtitle_earn_enhanced;

                public final class Builder extends Message.Builder {
                    public final /* synthetic */ int $r8$classId;
                    public LocalizedString yield_current_rate_enhanced;
                    public LocalizedString yield_current_rate_standard;
                    public LocalizedString yield_earn_up_to_enhanced;
                    public LocalizedString yield_subtitle_earn_enhanced;

                    public /* synthetic */ Builder(int i) {
                        this.$r8$classId = i;
                    }

                    @Override // com.squareup.wire.Message.Builder
                    public final Message build() {
                        switch (this.$r8$classId) {
                            case 0:
                                return new Yield(this.yield_earn_up_to_enhanced, this.yield_subtitle_earn_enhanced, this.yield_current_rate_standard, this.yield_current_rate_enhanced, buildUnknownFields());
                            default:
                                return new BorrowAppletLoanHistoryTile.Data.ExpandedLoanListViewData(this.yield_earn_up_to_enhanced, this.yield_subtitle_earn_enhanced, this.yield_current_rate_standard, this.yield_current_rate_enhanced, buildUnknownFields());
                        }
                    }
                }

                static {
                    SavingsConfig$SavingsAppletUi$FolderSubtitles$Yield$Companion$ADAPTER$1 savingsConfig$SavingsAppletUi$FolderSubtitles$Yield$Companion$ADAPTER$1 = new SavingsConfig$SavingsAppletUi$FolderSubtitles$Yield$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Yield.class), "type.googleapis.com/squareup.cash.savings.SavingsConfig.SavingsAppletUi.FolderSubtitles.Yield", Syntax.PROTO_2, null, "squareup/cash/savings/SavingsConfig.proto");
                    ADAPTER = savingsConfig$SavingsAppletUi$FolderSubtitles$Yield$Companion$ADAPTER$1;
                    AndroidMessage.Companion.getClass();
                    CREATOR = new AndroidMessage.ProtoAdapterCreator(savingsConfig$SavingsAppletUi$FolderSubtitles$Yield$Companion$ADAPTER$1);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Yield(LocalizedString localizedString, LocalizedString localizedString2, LocalizedString localizedString3, LocalizedString localizedString4, ByteString byteString) {
                    super(ADAPTER, byteString);
                    byteString.getClass();
                    this.yield_earn_up_to_enhanced = localizedString;
                    this.yield_subtitle_earn_enhanced = localizedString2;
                    this.yield_current_rate_standard = localizedString3;
                    this.yield_current_rate_enhanced = localizedString4;
                }

                public final boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof Yield)) {
                        return false;
                    }
                    Yield yield = (Yield) obj;
                    return Intrinsics.areEqual(unknownFields(), yield.unknownFields()) && Intrinsics.areEqual(this.yield_earn_up_to_enhanced, yield.yield_earn_up_to_enhanced) && Intrinsics.areEqual(this.yield_subtitle_earn_enhanced, yield.yield_subtitle_earn_enhanced) && Intrinsics.areEqual(this.yield_current_rate_standard, yield.yield_current_rate_standard) && Intrinsics.areEqual(this.yield_current_rate_enhanced, yield.yield_current_rate_enhanced);
                }

                public final int hashCode() {
                    int i = this.hashCode;
                    if (i != 0) {
                        return i;
                    }
                    int hashCode = unknownFields().hashCode() * 37;
                    LocalizedString localizedString = this.yield_earn_up_to_enhanced;
                    int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
                    LocalizedString localizedString2 = this.yield_subtitle_earn_enhanced;
                    int hashCode3 = (hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
                    LocalizedString localizedString3 = this.yield_current_rate_standard;
                    int hashCode4 = (hashCode3 + (localizedString3 != null ? localizedString3.hashCode() : 0)) * 37;
                    LocalizedString localizedString4 = this.yield_current_rate_enhanced;
                    int hashCode5 = hashCode4 + (localizedString4 != null ? localizedString4.hashCode() : 0);
                    this.hashCode = hashCode5;
                    return hashCode5;
                }

                @Override // com.squareup.wire.Message
                public final Message.Builder newBuilder() {
                    Builder builder = new Builder(0);
                    builder.yield_earn_up_to_enhanced = this.yield_earn_up_to_enhanced;
                    builder.yield_subtitle_earn_enhanced = this.yield_subtitle_earn_enhanced;
                    builder.yield_current_rate_standard = this.yield_current_rate_standard;
                    builder.yield_current_rate_enhanced = this.yield_current_rate_enhanced;
                    builder.addUnknownFields(unknownFields());
                    return builder;
                }

                public final String toString() {
                    ArrayList arrayList = new ArrayList();
                    LocalizedString localizedString = this.yield_earn_up_to_enhanced;
                    if (localizedString != null) {
                        Matcher$$ExternalSyntheticOutline0.m("yield_earn_up_to_enhanced=", localizedString, arrayList);
                    }
                    LocalizedString localizedString2 = this.yield_subtitle_earn_enhanced;
                    if (localizedString2 != null) {
                        Matcher$$ExternalSyntheticOutline0.m("yield_subtitle_earn_enhanced=", localizedString2, arrayList);
                    }
                    LocalizedString localizedString3 = this.yield_current_rate_standard;
                    if (localizedString3 != null) {
                        Matcher$$ExternalSyntheticOutline0.m("yield_current_rate_standard=", localizedString3, arrayList);
                    }
                    LocalizedString localizedString4 = this.yield_current_rate_enhanced;
                    if (localizedString4 != null) {
                        Matcher$$ExternalSyntheticOutline0.m("yield_current_rate_enhanced=", localizedString4, arrayList);
                    }
                    return CollectionsKt.joinToString$default(arrayList, ", ", "Yield{", "}", 0, null, null, 56);
                }
            }

            static {
                SavingsConfig$SavingsAppletUi$FolderSubtitles$Companion$ADAPTER$1 savingsConfig$SavingsAppletUi$FolderSubtitles$Companion$ADAPTER$1 = new SavingsConfig$SavingsAppletUi$FolderSubtitles$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(FolderSubtitles.class), "type.googleapis.com/squareup.cash.savings.SavingsConfig.SavingsAppletUi.FolderSubtitles", Syntax.PROTO_2, null, "squareup/cash/savings/SavingsConfig.proto");
                ADAPTER = savingsConfig$SavingsAppletUi$FolderSubtitles$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(savingsConfig$SavingsAppletUi$FolderSubtitles$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FolderSubtitles(Yield yield, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.yield = yield;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof FolderSubtitles)) {
                    return false;
                }
                FolderSubtitles folderSubtitles = (FolderSubtitles) obj;
                return Intrinsics.areEqual(unknownFields(), folderSubtitles.unknownFields()) && Intrinsics.areEqual(this.yield, folderSubtitles.yield);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                Yield yield = this.yield;
                int hashCode2 = hashCode + (yield != null ? yield.hashCode() : 0);
                this.hashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                EarningTool.Builder builder = new EarningTool.Builder(25);
                builder.tool = this.yield;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                Yield yield = this.yield;
                if (yield != null) {
                    arrayList.add("yield=" + yield);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "FolderSubtitles{", "}", 0, null, null, 56);
            }
        }

        static {
            SavingsConfig$SavingsAppletUi$Companion$ADAPTER$1 savingsConfig$SavingsAppletUi$Companion$ADAPTER$1 = new SavingsConfig$SavingsAppletUi$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SavingsAppletUi.class), "type.googleapis.com/squareup.cash.savings.SavingsConfig.SavingsAppletUi", Syntax.PROTO_2, null, "squareup/cash/savings/SavingsConfig.proto");
            ADAPTER = savingsConfig$SavingsAppletUi$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(savingsConfig$SavingsAppletUi$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavingsAppletUi(FolderSubtitles folderSubtitles, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.subtitles = folderSubtitles;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SavingsAppletUi)) {
                return false;
            }
            SavingsAppletUi savingsAppletUi = (SavingsAppletUi) obj;
            return Intrinsics.areEqual(unknownFields(), savingsAppletUi.unknownFields()) && Intrinsics.areEqual(this.subtitles, savingsAppletUi.subtitles);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            FolderSubtitles folderSubtitles = this.subtitles;
            int hashCode2 = hashCode + (folderSubtitles != null ? folderSubtitles.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            EarningTool.Builder builder = new EarningTool.Builder(24);
            builder.tool = this.subtitles;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            FolderSubtitles folderSubtitles = this.subtitles;
            if (folderSubtitles != null) {
                arrayList.add("subtitles=" + folderSubtitles);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "SavingsAppletUi{", "}", 0, null, null, 56);
        }
    }

    public final class Yield extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Yield> CREATOR;
        public final LocalizedString yield_current_rate_enhanced;

        /* loaded from: classes7.dex */
        public final class Builder extends Message.Builder {
            public final /* synthetic */ int $r8$classId;
            public LocalizedString yield_current_rate_enhanced;

            public /* synthetic */ Builder(int i) {
                this.$r8$classId = i;
            }

            @Override // com.squareup.wire.Message.Builder
            public final Message build() {
                switch (this.$r8$classId) {
                    case 0:
                        return new Yield(this.yield_current_rate_enhanced, buildUnknownFields());
                    case 1:
                        return new CashCreditScoreHomeData.TitleBar(this.yield_current_rate_enhanced, buildUnknownFields());
                    case 2:
                        return new AfterpayAppletEntrypoint.Ineligible(this.yield_current_rate_enhanced, buildUnknownFields());
                    case 3:
                        return new AfterpayAppletEntrypoint.Overdue(this.yield_current_rate_enhanced, buildUnknownFields());
                    case 4:
                        return new AfterpayAppletEntrypoint.V3Uninstalled(this.yield_current_rate_enhanced, buildUnknownFields());
                    case 5:
                        return new HeroUpsellSection.SectionCTA(this.yield_current_rate_enhanced, buildUnknownFields());
                    case 6:
                        return new CardModule.HeaderModule(this.yield_current_rate_enhanced, buildUnknownFields());
                    case 7:
                        return new BorrowLimitHubData.LimitDisclaimerSection(this.yield_current_rate_enhanced, buildUnknownFields());
                    case 8:
                        return new EarningHeaderSection(this.yield_current_rate_enhanced, buildUnknownFields());
                    default:
                        return new OverdraftStatus.Upsell(this.yield_current_rate_enhanced, buildUnknownFields());
                }
            }
        }

        static {
            SavingsConfig$Yield$Companion$ADAPTER$1 savingsConfig$Yield$Companion$ADAPTER$1 = new SavingsConfig$Yield$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Yield.class), "type.googleapis.com/squareup.cash.savings.SavingsConfig.Yield", Syntax.PROTO_2, null, "squareup/cash/savings/SavingsConfig.proto");
            ADAPTER = savingsConfig$Yield$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(savingsConfig$Yield$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Yield(LocalizedString localizedString, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.yield_current_rate_enhanced = localizedString;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Yield)) {
                return false;
            }
            Yield yield = (Yield) obj;
            return Intrinsics.areEqual(unknownFields(), yield.unknownFields()) && Intrinsics.areEqual(this.yield_current_rate_enhanced, yield.yield_current_rate_enhanced);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalizedString localizedString = this.yield_current_rate_enhanced;
            int hashCode2 = hashCode + (localizedString != null ? localizedString.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Builder builder = new Builder(0);
            builder.yield_current_rate_enhanced = this.yield_current_rate_enhanced;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalizedString localizedString = this.yield_current_rate_enhanced;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("yield_current_rate_enhanced=", localizedString, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Yield{", "}", 0, null, null, 56);
        }
    }

    static {
        SavingsConfig$Companion$ADAPTER$1 savingsConfig$Companion$ADAPTER$1 = new SavingsConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SavingsConfig.class), "type.googleapis.com/squareup.cash.savings.SavingsConfig", Syntax.PROTO_2, null, "squareup/cash/savings/SavingsConfig.proto");
        ADAPTER = savingsConfig$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(savingsConfig$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsConfig(Animation animation, Card card, SavingsAppletUi savingsAppletUi, DirectDepositSavingsBenefit directDepositSavingsBenefit, Yield yield, squareup.cash.savings.bespoke_elements.Card card2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.goal_celebration_animation = animation;
        this.get_cash_card_to_start_earning_card = card;
        this.applet = savingsAppletUi;
        this.direct_deposit_savings_benefit = directDepositSavingsBenefit;
        this.yield = yield;
        this.get_cash_card_to_start_earning_card_element = card2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SavingsConfig)) {
            return false;
        }
        SavingsConfig savingsConfig = (SavingsConfig) obj;
        return Intrinsics.areEqual(unknownFields(), savingsConfig.unknownFields()) && Intrinsics.areEqual(this.goal_celebration_animation, savingsConfig.goal_celebration_animation) && Intrinsics.areEqual(this.get_cash_card_to_start_earning_card, savingsConfig.get_cash_card_to_start_earning_card) && Intrinsics.areEqual(this.applet, savingsConfig.applet) && Intrinsics.areEqual(this.direct_deposit_savings_benefit, savingsConfig.direct_deposit_savings_benefit) && Intrinsics.areEqual(this.yield, savingsConfig.yield) && Intrinsics.areEqual(this.get_cash_card_to_start_earning_card_element, savingsConfig.get_cash_card_to_start_earning_card_element);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Animation animation = this.goal_celebration_animation;
        int hashCode2 = (hashCode + (animation != null ? animation.hashCode() : 0)) * 37;
        Card card = this.get_cash_card_to_start_earning_card;
        int hashCode3 = (hashCode2 + (card != null ? card.hashCode() : 0)) * 37;
        SavingsAppletUi savingsAppletUi = this.applet;
        int hashCode4 = (hashCode3 + (savingsAppletUi != null ? savingsAppletUi.hashCode() : 0)) * 37;
        DirectDepositSavingsBenefit directDepositSavingsBenefit = this.direct_deposit_savings_benefit;
        int hashCode5 = (hashCode4 + (directDepositSavingsBenefit != null ? directDepositSavingsBenefit.hashCode() : 0)) * 37;
        Yield yield = this.yield;
        int hashCode6 = (hashCode5 + (yield != null ? yield.hashCode() : 0)) * 37;
        squareup.cash.savings.bespoke_elements.Card card2 = this.get_cash_card_to_start_earning_card_element;
        int hashCode7 = hashCode6 + (card2 != null ? card2.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Action.Builder builder = new Action.Builder(10);
        builder.navigate = this.goal_celebration_animation;
        builder.set_view_state_value = this.get_cash_card_to_start_earning_card;
        builder.open_url = this.applet;
        builder.compound_action = this.direct_deposit_savings_benefit;
        builder.submit = this.yield;
        builder.collection_mutation = this.get_cash_card_to_start_earning_card_element;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Animation animation = this.goal_celebration_animation;
        if (animation != null) {
            arrayList.add("goal_celebration_animation=" + animation);
        }
        Card card = this.get_cash_card_to_start_earning_card;
        if (card != null) {
            arrayList.add("get_cash_card_to_start_earning_card=" + card);
        }
        SavingsAppletUi savingsAppletUi = this.applet;
        if (savingsAppletUi != null) {
            arrayList.add("applet=" + savingsAppletUi);
        }
        DirectDepositSavingsBenefit directDepositSavingsBenefit = this.direct_deposit_savings_benefit;
        if (directDepositSavingsBenefit != null) {
            arrayList.add("direct_deposit_savings_benefit=" + directDepositSavingsBenefit);
        }
        Yield yield = this.yield;
        if (yield != null) {
            arrayList.add("yield=" + yield);
        }
        squareup.cash.savings.bespoke_elements.Card card2 = this.get_cash_card_to_start_earning_card_element;
        if (card2 != null) {
            arrayList.add("get_cash_card_to_start_earning_card_element=" + card2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SavingsConfig{", "}", 0, null, null, 56);
    }
}
