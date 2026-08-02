package com.squareup.protos.common;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.shop.rendering.api.TextLinesSection;
import com.squareup.protos.cash.shop.rendering.api.UpsellCardSection;
import com.squareup.protos.cash.supportal.app.SendChatMessagesRequest;
import com.squareup.protos.cash.supportal.app.SuggestedArticlesResponse;
import com.squareup.protos.cash.treelot.app.TreehouseConfigResponse;
import com.squareup.protos.cash.ui.graphs.LineGraph;
import com.squareup.protos.cash.ui.graphs.VerticalStackedBarGraph;
import com.squareup.protos.cash.weaver.api.ApStoreList;
import com.squareup.protos.cash.whimsicard.syncentity.CardSkinAssets;
import com.squareup.protos.cash.woodrow.syncvalues.PerformanceDetailsUiSections;
import com.squareup.protos.franklin.AvailablePaymentPadThemes;
import com.squareup.protos.franklin.app.BitcoinAppletConfig;
import com.squareup.protos.franklin.app.GetEffectiveCustomerLimitsRequest;
import com.squareup.protos.franklin.app.GetEffectiveCustomerLimitsResponse;
import com.squareup.protos.franklin.app.GetFeatureFlagsResponse;
import com.squareup.protos.franklin.app.ScheduledPaymentsConfig;
import com.squareup.protos.franklin.app.SetFeatureFlagsResponse;
import com.squareup.protos.franklin.app.SubmitBlockerRequest;
import com.squareup.protos.franklin.app.SubmitFormRequest;
import com.squareup.protos.franklin.bankbook.InstitutionsConfig;
import com.squareup.protos.franklin.common.ATMPicker;
import com.squareup.protos.franklin.common.CardModule;
import com.squareup.protos.franklin.common.CardScheme;
import com.squareup.protos.franklin.common.InstrumentLinkingOptions;
import com.squareup.protos.franklin.common.MarketCapabilitiesConfig;
import com.squareup.protos.franklin.common.StampsConfig;
import com.squareup.protos.franklin.common.SyncReactions;
import com.squareup.protos.franklin.common.SyncValueSchemaVersions;
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

/* loaded from: classes8.dex */
public final class Headers extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Headers> CREATOR;
    public final List header;

    static {
        Headers$Companion$ADAPTER$1 headers$Companion$ADAPTER$1 = new Headers$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Headers.class), "type.googleapis.com/squareup.common.Headers", Syntax.PROTO_2, null, "squareup/common/protocols.proto");
        ADAPTER = headers$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(headers$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Headers(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.header = TransactorKt.immutableCopyOf("header", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Headers)) {
            return false;
        }
        Headers headers = (Headers) obj;
        return Intrinsics.areEqual(unknownFields(), headers.unknownFields()) && Intrinsics.areEqual(this.header, headers.header);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.header.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0, false);
        builder.header = this.header;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.header;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("header=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Headers{", "}", 0, null, null, 56);
    }

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public List header;

        public Builder(int i) {
            this.$r8$classId = i;
            switch (i) {
                case 13:
                    this.header = EmptyList.INSTANCE;
                    break;
                default:
                    this.header = EmptyList.INSTANCE;
                    break;
            }
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new Headers(this.header, buildUnknownFields());
                case 1:
                    return new TextLinesSection(this.header, buildUnknownFields());
                case 2:
                    return new UpsellCardSection.AvatarStack(this.header, buildUnknownFields());
                case 3:
                    return new SendChatMessagesRequest(this.header, buildUnknownFields());
                case 4:
                    return new SuggestedArticlesResponse(this.header, buildUnknownFields());
                case 5:
                    return new TreehouseConfigResponse(this.header, buildUnknownFields());
                case 6:
                    return new LineGraph.GraphLegend(this.header, buildUnknownFields());
                case 7:
                    return new VerticalStackedBarGraph.GraphLegend(this.header, buildUnknownFields());
                case 8:
                    return new ApStoreList(this.header, buildUnknownFields());
                case 9:
                    return new CardSkinAssets(this.header, buildUnknownFields());
                case 10:
                    return new PerformanceDetailsUiSections(this.header, buildUnknownFields());
                case 11:
                    return new AvailablePaymentPadThemes(this.header, buildUnknownFields());
                case 12:
                    return new BitcoinAppletConfig(this.header, buildUnknownFields());
                case 13:
                    return new GetEffectiveCustomerLimitsRequest(this.header, buildUnknownFields());
                case 14:
                    return new GetEffectiveCustomerLimitsResponse(this.header, buildUnknownFields());
                case 15:
                    return new GetFeatureFlagsResponse(this.header, buildUnknownFields());
                case 16:
                    return new ScheduledPaymentsConfig(this.header, buildUnknownFields());
                case 17:
                    return new SetFeatureFlagsResponse(this.header, buildUnknownFields());
                case 18:
                    return new SubmitBlockerRequest.AppRequestContext(this.header, buildUnknownFields());
                case 19:
                    return new SubmitFormRequest.ElementResult.MerchantTransactionOptionPickerResult(this.header, buildUnknownFields());
                case 20:
                    return new SubmitFormRequest.ElementResult.TextInputResult(this.header, buildUnknownFields());
                case 21:
                    return new InstitutionsConfig(this.header, buildUnknownFields());
                case 22:
                    return new ATMPicker(this.header, buildUnknownFields());
                case 23:
                    return new CardModule.ListModule(this.header, buildUnknownFields());
                case 24:
                    return new CardScheme(this.header, buildUnknownFields());
                case 25:
                    return new InstrumentLinkingOptions(this.header, buildUnknownFields());
                case 26:
                    return new MarketCapabilitiesConfig(this.header, buildUnknownFields());
                case 27:
                    return new StampsConfig(this.header, buildUnknownFields());
                case 28:
                    return new SyncReactions(this.header, buildUnknownFields());
                default:
                    return new SyncValueSchemaVersions(this.header, buildUnknownFields());
            }
        }

        public /* synthetic */ Builder(int i, boolean z) {
            this.$r8$classId = i;
        }
    }
}
