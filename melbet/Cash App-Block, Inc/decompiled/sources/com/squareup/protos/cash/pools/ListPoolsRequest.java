package com.squareup.protos.cash.pools;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.datadog.android.rum.model.ErrorEvent;
import com.google.android.gms.internal.mlkit_vision_common.zzkk;
import com.google.android.gms.internal.mlkit_vision_common.zzkl;
import com.google.android.gms.internal.mlkit_vision_common.zzkm;
import com.google.android.gms.internal.mlkit_vision_common.zzko;
import com.google.android.gms.internal.mlkit_vision_common.zzkt;
import com.google.android.gms.internal.mlkit_vision_common.zzkv;
import com.google.android.gms.internal.mlkit_vision_common.zzlc;
import com.google.android.gms.internal.mlkit_vision_common.zzll;
import com.google.android.gms.internal.mlkit_vision_common.zzlm;
import com.google.android.gms.internal.mlkit_vision_common.zzlp;
import com.squareup.protos.cash.plasma.common.InstrumentSelectionOption;
import com.squareup.protos.cash.plasma.common.NewLinkSelectionOption;
import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.protos.cash.postcard.CardModule$HeroNullStateModule$Nux$UhchNux;
import com.squareup.protos.cash.postcard.app.FamilyAccountsLockIssuedCardsResponse;
import com.squareup.protos.cash.postcard.app.FamilyAccountsUnlockIssuedCardsResponse;
import com.squareup.protos.cash.referly.api.incentives.client.GetPromotionsHomeDataResponse;
import com.squareup.protos.cash.referly.api.incentives.client.PromotionsHomeData;
import com.squareup.protos.cash.registrar.api.StatementCoverage;
import com.squareup.protos.cash.semaphore.api.GetFeatureLensResponse;
import com.squareup.protos.cash.semaphore.api.VendedFlagNode;
import com.squareup.protos.cash.semaphore.api.VendedFlags;
import com.squareup.protos.cash.shop.rendering.api.CreditDetail;
import com.squareup.protos.cash.shop.rendering.api.EngagedItemToken;
import com.squareup.protos.cash.shop.rendering.api.HeroSection;
import com.squareup.protos.cash.shop.rendering.api.InfoSheet;
import com.squareup.protos.cash.shop.rendering.api.RowSection;
import com.squareup.protos.cash.shop.rendering.api.StyledText;
import com.squareup.protos.cash.spendinginsights.CardSpendingInsight;
import com.squareup.protos.cash.spendinginsights.appapi.BillsSubscriptionsHomeUiConfig;
import com.squareup.protos.cash.spendinginsights.appapi.GetBillsSubscriptionsHomeUiConfigResponse;
import com.squareup.protos.cash.spendinginsights.appapi.GetCardSpendingInsightResponse;
import com.squareup.protos.cash.staff.syncvalues.CashForWorkAppletV1;
import com.squareup.protos.cash.staff.syncvalues.VersionedCashForWorkApplet;
import com.squareup.protos.cash.sup.api.v1.GetDefaultCreditLineResponse;
import com.squareup.protos.cash.supportal.app.GetChatMessagesRequest;
import com.squareup.protos.cash.supportal.app.GetChatMessagesResponse;
import com.squareup.protos.cash.supportal.app.OpenChatResponse;
import com.squareup.protos.cash.supportal.app.SupportPhoneStatusResponse;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.lending.sync_values.SupOffersTabCreditLine;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class ListPoolsRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ListPoolsRequest> CREATOR;
    public final PoolLifecycleFilter pool_lifecycle_filter;

    /* loaded from: classes7.dex */
    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Object pool_lifecycle_filter;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new ListPoolsRequest((PoolLifecycleFilter) this.pool_lifecycle_filter, buildUnknownFields());
                case 1:
                    return new InstrumentSelectionOption((ErrorEvent.Csp.Companion) this.pool_lifecycle_filter, buildUnknownFields());
                case 2:
                    return new NewLinkSelectionOption((CashInstrumentType) this.pool_lifecycle_filter, buildUnknownFields());
                case 3:
                    return new AdminGetMoneyPoolResponse((MoneyPool) this.pool_lifecycle_filter, buildUnknownFields());
                case 4:
                    return new CardModule.CardElementAction((zzkk) this.pool_lifecycle_filter, buildUnknownFields());
                case 5:
                    return new CardModule.CardElementAction.DoClientScenario((ClientScenario) this.pool_lifecycle_filter, buildUnknownFields());
                case 6:
                    return new CardModule.HeroNullStateModule((CardModule$HeroNullStateModule$Nux$UhchNux) this.pool_lifecycle_filter, buildUnknownFields());
                case 7:
                    return new CardModule.HeroNullStateModule.UnifiedCardHomeNUX.GridConfig.GridItem((zzkl) this.pool_lifecycle_filter, buildUnknownFields());
                case 8:
                    return new CardModule.LineItemModule((CardModule.LineItemElement) this.pool_lifecycle_filter, buildUnknownFields());
                case 9:
                    return new CardModule.StatusElement.Accessory((zzkm) this.pool_lifecycle_filter, buildUnknownFields());
                case 10:
                    return new CardModule.StatusModule((CardModule.StatusElement) this.pool_lifecycle_filter, buildUnknownFields());
                case 11:
                    return new FamilyAccountsLockIssuedCardsResponse((FamilyAccountsLockIssuedCardsResponse.Result) this.pool_lifecycle_filter, buildUnknownFields());
                case 12:
                    return new FamilyAccountsUnlockIssuedCardsResponse((FamilyAccountsUnlockIssuedCardsResponse.Result) this.pool_lifecycle_filter, buildUnknownFields());
                case 13:
                    return new GetPromotionsHomeDataResponse((PromotionsHomeData) this.pool_lifecycle_filter, buildUnknownFields());
                case 14:
                    return new StatementCoverage((zzko) this.pool_lifecycle_filter, buildUnknownFields());
                case 15:
                    VendedFlags vendedFlags = (VendedFlags) this.pool_lifecycle_filter;
                    if (vendedFlags != null) {
                        return new GetFeatureLensResponse(vendedFlags, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(vendedFlags, "flags");
                    throw null;
                case 16:
                    return new VendedFlags((VendedFlagNode) this.pool_lifecycle_filter, buildUnknownFields());
                case 17:
                    return new CreditDetail((StyledText) this.pool_lifecycle_filter, buildUnknownFields());
                case 18:
                    return new EngagedItemToken((ErrorEvent.Meta.Companion) this.pool_lifecycle_filter, buildUnknownFields());
                case 19:
                    return new HeroSection.HeroTile.FooterDetail((zzkt) this.pool_lifecycle_filter, buildUnknownFields());
                case 20:
                    return new InfoSheet.TextContent((zzkv) this.pool_lifecycle_filter, buildUnknownFields());
                case 21:
                    return new RowSection.Row((zzlc) this.pool_lifecycle_filter, buildUnknownFields());
                case 22:
                    return new GetBillsSubscriptionsHomeUiConfigResponse((BillsSubscriptionsHomeUiConfig) this.pool_lifecycle_filter, buildUnknownFields());
                case 23:
                    return new GetCardSpendingInsightResponse((CardSpendingInsight) this.pool_lifecycle_filter, buildUnknownFields());
                case 24:
                    return new VersionedCashForWorkApplet((CashForWorkAppletV1) this.pool_lifecycle_filter, buildUnknownFields());
                case 25:
                    return new GetDefaultCreditLineResponse((SupOffersTabCreditLine) this.pool_lifecycle_filter, buildUnknownFields());
                case 26:
                    return new GetChatMessagesRequest((zzll) this.pool_lifecycle_filter, buildUnknownFields());
                case 27:
                    return new GetChatMessagesResponse.Conversation((GetChatMessagesResponse.Conversation.BotStatus) this.pool_lifecycle_filter, buildUnknownFields());
                case 28:
                    return new OpenChatResponse((zzlm) this.pool_lifecycle_filter, buildUnknownFields());
                default:
                    return new SupportPhoneStatusResponse((zzlp) this.pool_lifecycle_filter, buildUnknownFields());
            }
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ListPoolsRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.pools.ListPoolsRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new ListPoolsRequest((PoolLifecycleFilter) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(PoolLifecycleFilter.ADAPTER, protoReader, obj);
                    } else {
                        protoReader.readUnknownField(nextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                ListPoolsRequest listPoolsRequest = (ListPoolsRequest) obj;
                reverseProtoWriter.getClass();
                listPoolsRequest.getClass();
                reverseProtoWriter.writeBytes(listPoolsRequest.unknownFields());
                PoolLifecycleFilter.ADAPTER.encodeWithTag(reverseProtoWriter, 1, listPoolsRequest.pool_lifecycle_filter);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                ListPoolsRequest listPoolsRequest = (ListPoolsRequest) obj;
                listPoolsRequest.getClass();
                return PoolLifecycleFilter.ADAPTER.encodedSizeWithTag(1, listPoolsRequest.pool_lifecycle_filter) + listPoolsRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                ListPoolsRequest listPoolsRequest = (ListPoolsRequest) obj;
                listPoolsRequest.getClass();
                PoolLifecycleFilter poolLifecycleFilter = listPoolsRequest.pool_lifecycle_filter;
                PoolLifecycleFilter poolLifecycleFilter2 = poolLifecycleFilter != null ? (PoolLifecycleFilter) PoolLifecycleFilter.ADAPTER.redact(poolLifecycleFilter) : null;
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new ListPoolsRequest(poolLifecycleFilter2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                ListPoolsRequest listPoolsRequest = (ListPoolsRequest) obj;
                listPoolsRequest.getClass();
                PoolLifecycleFilter.ADAPTER.encodeWithTag(protoWriter, 1, listPoolsRequest.pool_lifecycle_filter);
                protoWriter.writeBytes(listPoolsRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListPoolsRequest(PoolLifecycleFilter poolLifecycleFilter, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.pool_lifecycle_filter = poolLifecycleFilter;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ListPoolsRequest)) {
            return false;
        }
        ListPoolsRequest listPoolsRequest = (ListPoolsRequest) obj;
        return Intrinsics.areEqual(unknownFields(), listPoolsRequest.unknownFields()) && Intrinsics.areEqual(this.pool_lifecycle_filter, listPoolsRequest.pool_lifecycle_filter);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        PoolLifecycleFilter poolLifecycleFilter = this.pool_lifecycle_filter;
        int hashCode2 = hashCode + (poolLifecycleFilter != null ? poolLifecycleFilter.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.pool_lifecycle_filter = this.pool_lifecycle_filter;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        PoolLifecycleFilter poolLifecycleFilter = this.pool_lifecycle_filter;
        if (poolLifecycleFilter != null) {
            arrayList.add("pool_lifecycle_filter=" + poolLifecycleFilter);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ListPoolsRequest{", "}", 0, null, null, 56);
    }
}
