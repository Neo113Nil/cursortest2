package com.squareup.protos.cash.appthemes;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.bankingbenefits.api.v1_0.app.BenefitsHub;
import com.squareup.cash.cashcommercebrowser.api.v1.RestrictedItemCheckResponse;
import com.squareup.cash.cashlynxflow.plasma.v3.LinkBankAccountFlowParameters;
import com.squareup.cash.cashreactions.common.v1.AvailableReactions;
import com.squareup.cash.cashsubscriptions.api.v1_0.app.GetSubscriptionsResponse;
import com.squareup.cash.cryptocurrency.SponsorshipCryptoAuthorization;
import com.squareup.cash.devicegrip.service.GetDevicesResponse;
import com.squareup.cash.moneybot.genie.protos.MoneybotScaffold;
import com.squareup.cash.mosaic.resources.api.v2.GetFeaturedMusicResponse;
import com.squareup.cash.supportarticles.app.v1.RecommendSupportArticlesResponse;
import com.squareup.cash.supportarticles.app.v1.SearchSupportArticlesResponse;
import com.squareup.lending.CashCreditScoreEntryPointData;
import com.squareup.protos.access.sync_values.PasskeyOptions;
import com.squareup.protos.cash.aegis.core.BulletPoints;
import com.squareup.protos.cash.aegis.core.PendingRequestsParams;
import com.squareup.protos.cash.aegis.core.Section;
import com.squareup.protos.cash.agentcore.api.v1.GetAgentsResponse;
import com.squareup.protos.cash.badging.api.BadgingData;
import com.squareup.protos.cash.badging.api.BatchClearBadgeClientRequest;
import com.squareup.protos.cash.badging.api.GetBadgeCountsClientRequest;
import com.squareup.protos.cash.blockly.api.AllowlistSearchResponse;
import com.squareup.protos.cash.blockly.api.BlockSearchResponse;
import com.squareup.protos.cash.blockuserjourneys.api.v1.RecordCompletedJourneyBatchRequest;
import com.squareup.protos.cash.btcnetwork.external.GetBitcoinSellerLocationsResponse;
import com.squareup.protos.cash.cardspendinginsights.CardSpendingInsightsHome;
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

/* loaded from: classes7.dex */
public final class Gradient extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Gradient> CREATOR;
    public final List colors;

    static {
        Gradient$Companion$ADAPTER$1 gradient$Companion$ADAPTER$1 = new Gradient$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Gradient.class), "type.googleapis.com/squareup.cash.appthemes.Gradient", Syntax.PROTO_2, null, "squareup/cash/appthemes/app_theme_definitions.proto");
        ADAPTER = gradient$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(gradient$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gradient(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.colors = TransactorKt.immutableCopyOf("colors", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Gradient)) {
            return false;
        }
        Gradient gradient = (Gradient) obj;
        return Intrinsics.areEqual(unknownFields(), gradient.unknownFields()) && Intrinsics.areEqual(this.colors, gradient.colors);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.colors.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0, false);
        builder.colors = this.colors;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.colors;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("colors=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Gradient{", "}", 0, null, null, 56);
    }

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public List colors;

        public Builder(int i) {
            this.$r8$classId = i;
            switch (i) {
                case 22:
                    this.colors = EmptyList.INSTANCE;
                    break;
                case 27:
                    this.colors = EmptyList.INSTANCE;
                    break;
                default:
                    this.colors = EmptyList.INSTANCE;
                    break;
            }
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new Gradient(this.colors, buildUnknownFields());
                case 1:
                    return new BenefitsHub.CommonQuestions(this.colors, buildUnknownFields());
                case 2:
                    return new BenefitsHub.DefaultPerks(this.colors, buildUnknownFields());
                case 3:
                    return new BenefitsHub.Disclosures(this.colors, buildUnknownFields());
                case 4:
                    return new RestrictedItemCheckResponse(this.colors, buildUnknownFields());
                case 5:
                    return new LinkBankAccountFlowParameters(this.colors, buildUnknownFields());
                case 6:
                    return new AvailableReactions(this.colors, buildUnknownFields());
                case 7:
                    return new GetSubscriptionsResponse(this.colors, buildUnknownFields());
                case 8:
                    return new SponsorshipCryptoAuthorization(this.colors, buildUnknownFields());
                case 9:
                    return new GetDevicesResponse(this.colors, buildUnknownFields());
                case 10:
                    return new MoneybotScaffold.Evidence.Breakdown.BarChart(this.colors, buildUnknownFields());
                case 11:
                    return new GetFeaturedMusicResponse(this.colors, buildUnknownFields());
                case 12:
                    return new RecommendSupportArticlesResponse(this.colors, buildUnknownFields());
                case 13:
                    return new SearchSupportArticlesResponse(this.colors, buildUnknownFields());
                case 14:
                    return new CashCreditScoreEntryPointData.InstalledState.Graph(this.colors, buildUnknownFields());
                case 15:
                    return new PasskeyOptions(this.colors, buildUnknownFields());
                case 16:
                    return new BulletPoints(this.colors, buildUnknownFields());
                case 17:
                    return new PendingRequestsParams(this.colors, buildUnknownFields());
                case 18:
                    return new Section.Group(this.colors, buildUnknownFields());
                case 19:
                    return new GetAgentsResponse(this.colors, buildUnknownFields());
                case 20:
                    return new BadgingData(this.colors, buildUnknownFields());
                case 21:
                    return new BatchClearBadgeClientRequest(this.colors, buildUnknownFields());
                case 22:
                    return new GetBadgeCountsClientRequest(this.colors, buildUnknownFields());
                case 23:
                    return new AllowlistSearchResponse.AllowlistSearchResults(this.colors, buildUnknownFields());
                case 24:
                    return new AllowlistSearchResponse.AllowlistSuggestions(this.colors, buildUnknownFields());
                case 25:
                    return new BlockSearchResponse.BlockSearchResults(this.colors, buildUnknownFields());
                case 26:
                    return new BlockSearchResponse.BlockSuggestions(this.colors, buildUnknownFields());
                case 27:
                    return new RecordCompletedJourneyBatchRequest(this.colors, buildUnknownFields());
                case 28:
                    return new GetBitcoinSellerLocationsResponse(this.colors, buildUnknownFields());
                default:
                    return new CardSpendingInsightsHome.InsightsSection(this.colors, buildUnknownFields());
            }
        }

        public /* synthetic */ Builder(int i, boolean z) {
            this.$r8$classId = i;
        }
    }
}
