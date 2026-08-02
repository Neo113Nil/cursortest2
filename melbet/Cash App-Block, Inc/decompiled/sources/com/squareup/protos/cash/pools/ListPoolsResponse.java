package com.squareup.protos.cash.pools;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.paychecks.api.v1.SetPayersForCustomerResponse;
import com.squareup.protos.cash.paychecks.api.v1.UpdatePayersForCustomerRequest;
import com.squareup.protos.cash.paymenttemplate.v1.PaymentOptions;
import com.squareup.protos.cash.plasma.ui.inputs.WebViewCallbackInputs;
import com.squareup.protos.cash.portfolios.BalanceEventList;
import com.squareup.protos.cash.portfolios.GetHoldingsHistoricalDataResponse;
import com.squareup.protos.cash.postcard.CardHomeActions;
import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.protos.cash.postcard.app.GetAppThemesResponse;
import com.squareup.protos.cash.recipientsuggestion.RecipientSuggestions;
import com.squareup.protos.cash.registrar.api.GetAvailableStatementsForStatementTypeResponse;
import com.squareup.protos.cash.registrar.api.GetStatementTypesResponse;
import com.squareup.protos.cash.semaphore.api.GetOnboardingConfigResponse;
import com.squareup.protos.cash.shop.rendering.api.AvatarCarousel;
import com.squareup.protos.cash.shop.rendering.api.AvatarCarouselSection;
import com.squareup.protos.cash.shop.rendering.api.CategoryTileSection;
import com.squareup.protos.cash.shop.rendering.api.FilterGroupSection;
import com.squareup.protos.cash.shop.rendering.api.HeroSection;
import com.squareup.protos.cash.shop.rendering.api.InfoSheet;
import com.squareup.protos.cash.shop.rendering.api.PillSection;
import com.squareup.protos.cash.shop.rendering.api.RecentlyViewedSection;
import com.squareup.protos.cash.shop.rendering.api.RowSection;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/pools/ListPoolsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/pools/ListPoolsResponse$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ListPoolsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ListPoolsResponse> CREATOR;
    public final List pools;

    static {
        ListPoolsResponse$Companion$ADAPTER$1 listPoolsResponse$Companion$ADAPTER$1 = new ListPoolsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ListPoolsResponse.class), "type.googleapis.com/squareup.cash.pools.v1beta.ListPoolsResponse", Syntax.PROTO_2, null, "squareup/cash/pools/v1beta/pools.proto");
        ADAPTER = listPoolsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(listPoolsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListPoolsResponse(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.pools = TransactorKt.immutableCopyOf("pools", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ListPoolsResponse)) {
            return false;
        }
        ListPoolsResponse listPoolsResponse = (ListPoolsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), listPoolsResponse.unknownFields()) && Intrinsics.areEqual(this.pools, listPoolsResponse.pools);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.pools.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0, false);
        builder.pools = this.pools;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.pools;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("pools=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ListPoolsResponse{", "}", 0, null, null, 56);
    }

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public List pools;

        public Builder(int i) {
            this.$r8$classId = i;
            switch (i) {
                case 12:
                    this.pools = EmptyList.INSTANCE;
                    break;
                case 19:
                    this.pools = EmptyList.INSTANCE;
                    break;
                default:
                    this.pools = EmptyList.INSTANCE;
                    break;
            }
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new ListPoolsResponse(this.pools, buildUnknownFields());
                case 1:
                    return new SetPayersForCustomerResponse(this.pools, buildUnknownFields());
                case 2:
                    return new UpdatePayersForCustomerRequest(this.pools, buildUnknownFields());
                case 3:
                    return new PaymentOptions(this.pools, buildUnknownFields());
                case 4:
                    return new WebViewCallbackInputs(this.pools, buildUnknownFields());
                case 5:
                    return new AddCustomersToPoolResponse(this.pools, buildUnknownFields());
                case 6:
                    return new ListJoinedMoneyPoolsResponse(this.pools, buildUnknownFields());
                case 7:
                    return new ListOwnedMoneyPoolsResponse(this.pools, buildUnknownFields());
                case 8:
                    return new PoolLifecycleFilter(this.pools, buildUnknownFields());
                case 9:
                    return new RemoveCustomersFromPoolResponse(this.pools, buildUnknownFields());
                case 10:
                    return new BalanceEventList(this.pools, buildUnknownFields());
                case 11:
                    return new GetHoldingsHistoricalDataResponse(this.pools, buildUnknownFields());
                case 12:
                    return new CardHomeActions(this.pools, buildUnknownFields());
                case 13:
                    return new CardModule.HeroNullStateModule.UnifiedCardHomeNUX.GridConfig(this.pools, buildUnknownFields());
                case 14:
                    return new CardModule.UpsellModule(this.pools, buildUnknownFields());
                case 15:
                    return new GetAppThemesResponse(this.pools, buildUnknownFields());
                case 16:
                    return new RecipientSuggestions(this.pools, buildUnknownFields());
                case 17:
                    return new GetAvailableStatementsForStatementTypeResponse(this.pools, buildUnknownFields());
                case 18:
                    return new GetStatementTypesResponse(this.pools, buildUnknownFields());
                case 19:
                    return new GetOnboardingConfigResponse(this.pools, buildUnknownFields());
                case 20:
                    return new AvatarCarousel(this.pools, buildUnknownFields());
                case 21:
                    return new AvatarCarouselSection(this.pools, buildUnknownFields());
                case 22:
                    return new CategoryTileSection(this.pools, buildUnknownFields());
                case 23:
                    return new FilterGroupSection(this.pools, buildUnknownFields());
                case 24:
                    return new HeroSection(this.pools, buildUnknownFields());
                case 25:
                    return new InfoSheet.NumberedList(this.pools, buildUnknownFields());
                case 26:
                    return new InfoSheet.TextBulletList(this.pools, buildUnknownFields());
                case 27:
                    return new PillSection(this.pools, buildUnknownFields());
                case 28:
                    return new RecentlyViewedSection(this.pools, buildUnknownFields());
                default:
                    return new RowSection(this.pools, buildUnknownFields());
            }
        }

        public /* synthetic */ Builder(int i, boolean z) {
            this.$r8$classId = i;
        }
    }
}
