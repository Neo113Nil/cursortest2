package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.google.android.gms.internal.mlkit_vision_common.zzlb;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.clientrouting.UtilsKt;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.shop.rendering.api.Button;
import com.squareup.protos.cash.shop.rendering.api.EngagedItemToken;
import com.squareup.protos.cash.shop.rendering.api.RowSection;
import com.squareup.protos.cash.shop.rendering.api.RowSection$AvatarRow$Cta$Btn;
import com.squareup.protos.cash.shop.rendering.api.RowSection$AvatarRow$FeatureMetadata$OfferMetadata;
import com.squareup.protos.cash.shop.rendering.api.StyledText;
import com.squareup.protos.cash.shop.rendering.api.TapAction;
import com.squareup.protos.cash.tax.TaxEnvironment;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.cash.weaver.api.ApStoreList;
import com.squareup.protos.cash.weaver.api.GetRecommendationsResponse;
import com.squareup.protos.cash.weaver.api.GetRecommendationsResponse$RecommendationItem$ItemMetadata$PromoterMessagingMetadata;
import com.squareup.protos.cash.weaver.api.shared.RecommendationType;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.Transfer;
import com.squareup.protos.franklin.app.LinkCardRequest;
import com.squareup.protos.franklin.bankbook.Institution;
import com.squareup.protos.franklin.common.AllowanceRenderData;
import com.squareup.protos.franklin.common.ClientDisplayTheme;
import com.squareup.protos.franklin.common.DirectDepositAccount;
import com.squareup.protos.franklin.common.InvestCorrectionRenderData;
import com.squareup.protos.franklin.common.KeyedCard;
import com.squareup.protos.franklin.common.LendingCardRenderData;
import com.squareup.protos.franklin.common.RecurringPaymentRenderData;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.SyncBusinessGrant;
import com.squareup.protos.franklin.ui.CardOrderData;
import com.squareup.protos.franklin.ui.Timeline;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.protos.lending.sync_values.BorrowAppletLoanHistoryTile;
import com.squareup.protos.timecards.ChangeProposal;
import com.squareup.protos.timecards.OvertimeReportByTimecardForEmployeeResponse;
import com.squareup.protos.timecards.PaidBreakOverageConversionSummary;
import com.squareup.protos.timecards.scheduling.ColorScheme;
import com.squareup.protos.timecards.scheduling.GetShiftSchedulesRequest;
import com.squareup.protos.timecards.scheduling.OpenShiftsFilter;
import com.squareup.protos.timecards.scheduling.ShiftSchedule;
import com.squareup.protos.unicorn.FdicDisclosureCopy;
import com.squareup.protos.unicorn.FdicInsuranceCustomerStatus;
import com.squareup.protos.wire.roster.mds.ImageEntry;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import squareup.cash.overdraft.OverdraftStatus;
import squareup.cash.ui.arcade.elements.ButtonProminence;

/* loaded from: classes.dex */
public final class Transfer extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Transfer> CREATOR;
    public final Money amount;
    public final Long completed_at;
    public final Long created_at;
    public final Long failed_at;
    public final Money push_amount;
    public final Instrument source;
    public final State state;
    public final Instrument target;
    public final String token;

    /* loaded from: classes8.dex */
    public enum State implements WireEnum {
        FAILED(1),
        PROCESSING(2),
        COMPLETE(3),
        WAITING_ON_CUSTOMER(4);

        public final int value;
        public static final TaxEnvironment.Companion Companion = new TaxEnvironment.Companion();
        public static final Transfer$State$Companion$ADAPTER$1 ADAPTER = new Transfer$State$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(State.class), Syntax.PROTO_2, null);

        State(int i) {
            this.value = i;
        }

        public static final State fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return FAILED;
            }
            if (i == 2) {
                return PROCESSING;
            }
            if (i == 3) {
                return COMPLETE;
            }
            if (i != 4) {
                return null;
            }
            return WAITING_ON_CUSTOMER;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Transfer.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.api.Transfer$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                Object obj;
                Object obj2;
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                Object obj6 = null;
                Object obj7 = null;
                Object obj8 = null;
                Object obj9 = null;
                Object obj10 = null;
                Object obj11 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new Transfer((String) obj3, (Instrument) obj4, (Instrument) obj5, (Transfer.State) obj6, (Money) obj7, (Long) obj8, (Long) obj9, (Long) obj10, (Money) obj11, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj3 = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 2:
                            obj4 = TransactorKt.decodeMessageOrMerge(Instrument.ADAPTER, protoReader, obj4);
                            continue;
                        case 3:
                            obj5 = TransactorKt.decodeMessageOrMerge(Instrument.ADAPTER, protoReader, obj5);
                            continue;
                        case 4:
                            try {
                                obj6 = Transfer.State.ADAPTER.decode(protoReader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                obj = obj6;
                                obj2 = obj7;
                                protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 5:
                            obj7 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj7);
                            continue;
                        case 6:
                            obj8 = ProtoAdapter.INT64.decode(protoReader);
                            continue;
                        case 7:
                            obj9 = ProtoAdapter.INT64.decode(protoReader);
                            continue;
                        case 8:
                            obj10 = ProtoAdapter.INT64.decode(protoReader);
                            continue;
                        case 9:
                            obj11 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj11);
                            continue;
                        default:
                            protoReader.readUnknownField(nextTag);
                            obj = obj6;
                            obj2 = obj7;
                            break;
                    }
                    obj7 = obj2;
                    obj6 = obj;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                Transfer transfer = (Transfer) obj;
                reverseProtoWriter.getClass();
                transfer.getClass();
                reverseProtoWriter.writeBytes(transfer.unknownFields());
                ProtoAdapter protoAdapter2 = Money.ADAPTER;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 9, transfer.push_amount);
                ProtoAdapter protoAdapter3 = ProtoAdapter.INT64;
                protoAdapter3.encodeWithTag(reverseProtoWriter, 8, transfer.failed_at);
                protoAdapter3.encodeWithTag(reverseProtoWriter, 7, transfer.completed_at);
                protoAdapter3.encodeWithTag(reverseProtoWriter, 6, transfer.created_at);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 5, transfer.amount);
                Transfer.State.ADAPTER.encodeWithTag(reverseProtoWriter, 4, transfer.state);
                ProtoAdapter protoAdapter4 = Instrument.ADAPTER;
                protoAdapter4.encodeWithTag(reverseProtoWriter, 3, transfer.target);
                protoAdapter4.encodeWithTag(reverseProtoWriter, 2, transfer.source);
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, transfer.token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                Transfer transfer = (Transfer) obj;
                transfer.getClass();
                int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, transfer.token) + transfer.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = Instrument.ADAPTER;
                int encodedSizeWithTag2 = Transfer.State.ADAPTER.encodedSizeWithTag(4, transfer.state) + protoAdapter2.encodedSizeWithTag(3, transfer.target) + protoAdapter2.encodedSizeWithTag(2, transfer.source) + encodedSizeWithTag;
                ProtoAdapter protoAdapter3 = Money.ADAPTER;
                int encodedSizeWithTag3 = protoAdapter3.encodedSizeWithTag(5, transfer.amount) + encodedSizeWithTag2;
                ProtoAdapter protoAdapter4 = ProtoAdapter.INT64;
                return protoAdapter3.encodedSizeWithTag(9, transfer.push_amount) + protoAdapter4.encodedSizeWithTag(8, transfer.failed_at) + protoAdapter4.encodedSizeWithTag(7, transfer.completed_at) + protoAdapter4.encodedSizeWithTag(6, transfer.created_at) + encodedSizeWithTag3;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                Transfer transfer = (Transfer) obj;
                transfer.getClass();
                Instrument instrument = transfer.source;
                Instrument instrument2 = instrument != null ? (Instrument) Instrument.ADAPTER.redact(instrument) : null;
                Instrument instrument3 = transfer.target;
                Instrument instrument4 = instrument3 != null ? (Instrument) Instrument.ADAPTER.redact(instrument3) : null;
                Money money = transfer.amount;
                Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
                Money money3 = transfer.push_amount;
                Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = transfer.token;
                Transfer.State state = transfer.state;
                Long l = transfer.created_at;
                Long l2 = transfer.completed_at;
                Long l3 = transfer.failed_at;
                byteString.getClass();
                return new Transfer(str, instrument2, instrument4, state, money2, l, l2, l3, money4, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                Transfer transfer = (Transfer) obj;
                transfer.getClass();
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, transfer.token);
                ProtoAdapter protoAdapter2 = Instrument.ADAPTER;
                protoAdapter2.encodeWithTag(protoWriter, 2, transfer.source);
                protoAdapter2.encodeWithTag(protoWriter, 3, transfer.target);
                Transfer.State.ADAPTER.encodeWithTag(protoWriter, 4, transfer.state);
                ProtoAdapter protoAdapter3 = Money.ADAPTER;
                protoAdapter3.encodeWithTag(protoWriter, 5, transfer.amount);
                ProtoAdapter protoAdapter4 = ProtoAdapter.INT64;
                protoAdapter4.encodeWithTag(protoWriter, 6, transfer.created_at);
                protoAdapter4.encodeWithTag(protoWriter, 7, transfer.completed_at);
                protoAdapter4.encodeWithTag(protoWriter, 8, transfer.failed_at);
                protoAdapter3.encodeWithTag(protoWriter, 9, transfer.push_amount);
                protoWriter.writeBytes(transfer.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transfer(String str, Instrument instrument, Instrument instrument2, State state, Money money, Long l, Long l2, Long l3, Money money2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.token = str;
        this.source = instrument;
        this.target = instrument2;
        this.state = state;
        this.amount = money;
        this.created_at = l;
        this.completed_at = l2;
        this.failed_at = l3;
        this.push_amount = money2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Transfer)) {
            return false;
        }
        Transfer transfer = (Transfer) obj;
        return Intrinsics.areEqual(unknownFields(), transfer.unknownFields()) && Intrinsics.areEqual(this.token, transfer.token) && Intrinsics.areEqual(this.source, transfer.source) && Intrinsics.areEqual(this.target, transfer.target) && this.state == transfer.state && Intrinsics.areEqual(this.amount, transfer.amount) && Intrinsics.areEqual(this.created_at, transfer.created_at) && Intrinsics.areEqual(this.completed_at, transfer.completed_at) && Intrinsics.areEqual(this.failed_at, transfer.failed_at) && Intrinsics.areEqual(this.push_amount, transfer.push_amount);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Instrument instrument = this.source;
        int hashCode3 = (hashCode2 + (instrument != null ? instrument.hashCode() : 0)) * 37;
        Instrument instrument2 = this.target;
        int hashCode4 = (hashCode3 + (instrument2 != null ? instrument2.hashCode() : 0)) * 37;
        State state = this.state;
        int hashCode5 = (hashCode4 + (state != null ? state.hashCode() : 0)) * 37;
        Money money = this.amount;
        int hashCode6 = (hashCode5 + (money != null ? money.hashCode() : 0)) * 37;
        Long l = this.created_at;
        int hashCode7 = (hashCode6 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.completed_at;
        int hashCode8 = (hashCode7 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        Long l3 = this.failed_at;
        int hashCode9 = (hashCode8 + (l3 != null ? Long.hashCode(l3.longValue()) : 0)) * 37;
        Money money2 = this.push_amount;
        int hashCode10 = hashCode9 + (money2 != null ? money2.hashCode() : 0);
        this.hashCode = hashCode10;
        return hashCode10;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0, false);
        builder.token = this.token;
        builder.source = this.source;
        builder.target = this.target;
        builder.state = this.state;
        builder.amount = this.amount;
        builder.created_at = this.created_at;
        builder.completed_at = this.completed_at;
        builder.failed_at = this.failed_at;
        builder.push_amount = this.push_amount;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        Instrument instrument = this.source;
        if (instrument != null) {
            arrayList.add("source=" + instrument);
        }
        Instrument instrument2 = this.target;
        if (instrument2 != null) {
            arrayList.add("target=" + instrument2);
        }
        State state = this.state;
        if (state != null) {
            arrayList.add("state=" + state);
        }
        Money money = this.amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
        }
        Long l = this.created_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("created_at=", l, arrayList);
        }
        Long l2 = this.completed_at;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("completed_at=", l2, arrayList);
        }
        Long l3 = this.failed_at;
        if (l3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("failed_at=", l3, arrayList);
        }
        Money money2 = this.push_amount;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("push_amount=", money2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Transfer{", "}", 0, null, null, 56);
    }

    /* loaded from: classes8.dex */
    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Serializable amount;
        public Object completed_at;
        public Object created_at;
        public Object failed_at;
        public Object push_amount;
        public Object source;
        public Object state;
        public Object target;
        public Serializable token;

        public Builder(int i) {
            this.$r8$classId = i;
            switch (i) {
                case 17:
                    EmptyList emptyList = EmptyList.INSTANCE;
                    this.source = emptyList;
                    this.target = emptyList;
                    this.state = emptyList;
                    break;
                default:
                    this.state = EmptyList.INSTANCE;
                    break;
            }
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new Transfer((String) this.token, (Instrument) this.source, (Instrument) this.target, (State) this.state, (Money) this.amount, (Long) this.created_at, (Long) this.completed_at, (Long) this.failed_at, (Money) this.push_amount, buildUnknownFields());
                case 1:
                    return new Button((TapAction) this.source, (Button.Prominence) this.target, (LocalizedString) this.state, (Icon) this.amount, (Image) this.push_amount, (StyledText) this.created_at, (String) this.token, (Color) this.completed_at, (ButtonProminence) this.failed_at, buildUnknownFields());
                case 2:
                    return new RowSection.AvatarRow((AnalyticsEvent) this.token, (UiAvatar) this.source, (LocalizedString) this.target, (LocalizedString) this.state, (TapAction) this.amount, (EngagedItemToken) this.push_amount, (RowSection$AvatarRow$Cta$Btn) this.created_at, (RowSection$AvatarRow$FeatureMetadata$OfferMetadata) this.completed_at, (zzlb) this.failed_at, buildUnknownFields());
                case 3:
                    return new GetRecommendationsResponse.RecommendationItem((String) this.token, (Double) this.source, (String) this.target, (String) this.state, (Boolean) this.amount, (Boolean) this.push_amount, (Long) this.created_at, (ApStoreList) this.completed_at, (GetRecommendationsResponse$RecommendationItem$ItemMetadata$PromoterMessagingMetadata) this.failed_at, buildUnknownFields());
                case 4:
                    return new GetRecommendationsResponse.RecommendationSet((RecommendationType) this.source, (String) this.token, (List) this.target, (Boolean) this.state, (String) this.amount, (String) this.push_amount, (List) this.created_at, (Boolean) this.completed_at, (String) this.failed_at, buildUnknownFields());
                case 5:
                    return new LinkCardRequest((RequestContext) this.source, (KeyedCard) this.target, (List) this.state, (String) this.token, (CashInstrumentType) this.amount, (String) this.push_amount, (Boolean) this.created_at, (String) this.completed_at, (String) this.failed_at, buildUnknownFields());
                case 6:
                    return new Institution.DisplayInformation((String) this.token, (String) this.source, (String) this.target, (ClientDisplayTheme) this.state, (String) this.amount, (String) this.push_amount, (String) this.created_at, (String) this.completed_at, (String) this.failed_at, buildUnknownFields());
                case 7:
                    return new AllowanceRenderData((String) this.token, (String) this.source, (AllowanceRenderData.AllowanceState) this.target, (AllowanceRenderData.AllowanceStateReason) this.state, (Long) this.created_at, (String) this.amount, (String) this.push_amount, (AllowanceRenderData.Role) this.completed_at, (Boolean) this.failed_at, buildUnknownFields());
                case 8:
                    return new DirectDepositAccount((String) this.token, (String) this.source, (String) this.target, (Boolean) this.state, (String) this.amount, (LocalizableString) this.push_amount, (Boolean) this.created_at, (String) this.completed_at, (DirectDepositAccount.DirectDepositAccountState) this.failed_at, buildUnknownFields());
                case 9:
                    return new InvestCorrectionRenderData((String) this.token, (String) this.source, (Money) this.amount, (Money) this.push_amount, (Money) this.target, (Money) this.state, (Money) this.completed_at, (Long) this.created_at, (String) this.failed_at, buildUnknownFields());
                case 10:
                    return new LendingCardRenderData.Loan((String) this.token, (Integer) this.source, (Money) this.amount, (Money) this.push_amount, (Money) this.target, (Money) this.state, (Money) this.created_at, (String) this.completed_at, (String) this.failed_at, buildUnknownFields());
                case 11:
                    return new RecurringPaymentRenderData((String) this.token, (String) this.source, (String) this.target, (RecurringPaymentRenderData.State) this.state, (Long) this.created_at, (String) this.amount, (String) this.push_amount, (Boolean) this.completed_at, (String) this.failed_at, buildUnknownFields());
                case 12:
                    return new SyncBusinessGrant((String) this.token, (String) this.source, (Long) this.created_at, (Long) this.completed_at, (Long) this.failed_at, (String) this.target, (SyncBusinessGrant.ActionType) this.state, (String) this.amount, (SyncBusinessGrant.RenderingBehavior) this.push_amount, buildUnknownFields());
                case 13:
                    return new CardOrderData((CardOrderData.State) this.source, (CardOrderData.StateReason) this.target, (Long) this.created_at, (Long) this.completed_at, (String) this.token, (Long) this.failed_at, (String) this.state, (String) this.amount, (CardOrderData.OrderScenarioType) this.push_amount, buildUnknownFields());
                case 14:
                    return new BorrowAppletLoanHistoryTile.Data.Loan.Details((LocalizedString) this.source, (LocalizedString) this.target, (List) this.state, (Timeline) this.amount, (LocalizedString) this.push_amount, (LocalizedString) this.created_at, (BorrowAppletLoanHistoryTile.Data.Loan.Details.ButtonData) this.completed_at, (Color) this.failed_at, (String) this.token, buildUnknownFields());
                case 15:
                    return new ChangeProposal((String) this.token, (String) this.source, (String) this.target, (ChangeProposal.State) this.state, (String) this.amount, (List) this.push_amount, (UtilsKt) this.created_at, (String) this.completed_at, (String) this.failed_at, buildUnknownFields());
                case 16:
                    return new OvertimeReportByTimecardForEmployeeResponse.ByEmployee((String) this.token, (List) this.source, (List) this.target, (PaidBreakOverageConversionSummary) this.state, (Money) this.amount, (Money) this.push_amount, (Money) this.created_at, (List) this.completed_at, (Money) this.failed_at, buildUnknownFields());
                case 17:
                    return build();
                case 18:
                    return new ShiftSchedule((String) this.token, (String) this.source, (String) this.target, (ColorScheme) this.state, (ShiftSchedule.Version) this.amount, (ShiftSchedule.Version) this.push_amount, (Boolean) this.created_at, (String) this.completed_at, (String) this.failed_at, buildUnknownFields());
                case 19:
                    Boolean bool = (Boolean) this.token;
                    if (bool != null) {
                        return new FdicInsuranceCustomerStatus(bool.booleanValue(), (FdicDisclosureCopy) this.source, (FdicDisclosureCopy) this.target, (FdicDisclosureCopy) this.state, (FdicDisclosureCopy) this.amount, (FdicDisclosureCopy) this.push_amount, (FdicDisclosureCopy) this.created_at, (FdicDisclosureCopy) this.completed_at, (FdicDisclosureCopy) this.failed_at, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(bool, "is_fdic_insured");
                    throw null;
                case 20:
                    return new ImageEntry((List) this.source, (String) this.token, (String) this.target, (String) this.state, (String) this.amount, (Integer) this.push_amount, (Integer) this.created_at, (Integer) this.completed_at, (Integer) this.failed_at, buildUnknownFields());
                default:
                    return new OverdraftStatus.Disabled((LocalizedString) this.token, (Money) this.amount, (LocalizedString) this.source, (OverdraftStatus.Button) this.target, (OverdraftStatus.ToggleButton) this.state, (LocalizedString) this.push_amount, (Boolean) this.created_at, (LocalizedString) this.completed_at, (OverdraftStatus.Disabled.Reason) this.failed_at, buildUnknownFields());
            }
        }

        public /* synthetic */ Builder(int i, boolean z) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public GetShiftSchedulesRequest build() {
            return new GetShiftSchedulesRequest((String) this.token, (List) this.source, (List) this.target, (List) this.state, (String) this.amount, (String) this.push_amount, (String) this.created_at, (OpenShiftsFilter) this.completed_at, (String) this.failed_at, buildUnknownFields());
        }
    }
}
