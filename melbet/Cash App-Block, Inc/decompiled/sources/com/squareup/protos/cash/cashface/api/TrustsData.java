package com.squareup.protos.cash.cashface.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashapproxy.api.GetAfterpayCheckoutTokensResponse;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import com.squareup.protos.cash.cashlimitsxp.api.v1.GetCustomerLimitsResponse;
import com.squareup.protos.cash.cashliteflow.api.v1.PrepareRecoveryActivitiesResponse;
import com.squareup.protos.cash.cashliteorchestrator.api.v1.GetAddressesResponse;
import com.squareup.protos.cash.cashliteorchestrator.api.v1.GetFeedResponse;
import com.squareup.protos.cash.cashstorefronts.api.GetBusinessProfileResponse;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletEntrypoint;
import com.squareup.protos.cash.cashsuggest.api.AfterpayMerchantSheet;
import com.squareup.protos.cash.cashsuggest.api.AppletCardSection;
import com.squareup.protos.cash.cashsuggest.api.AvatarSection;
import com.squareup.protos.cash.cashsuggest.api.CardSection;
import com.squareup.protos.cash.cashsuggest.api.CreditLineSnapshot;
import com.squareup.protos.cash.cashsuggest.api.Experiments;
import com.squareup.protos.cash.cashsuggest.api.OrderListSection;
import com.squareup.protos.cash.cashsuggest.api.RowSection;
import com.squareup.protos.cash.compass.api.CellTowerContext;
import com.squareup.protos.cash.cryptoinvestflow.service.GetCryptoTaxStatementsResponse;
import com.squareup.protos.cash.customersearch.api.ProfileDirectorySearchResponse;
import com.squareup.protos.cash.customersearch.api.RecipientSelectorSearchResponse;
import com.squareup.protos.cash.customersearch.api.SearchCommonAvatarSection;
import com.squareup.protos.cash.customersearch.api.SearchCommonCardSection;
import com.squareup.protos.cash.customersearch.api.SearchCommonRowSection;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class TrustsData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TrustsData> CREATOR;
    public final List trust;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public List trust;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new TrustsData(this.trust, buildUnknownFields());
                case 1:
                    return new GetAfterpayCheckoutTokensResponse(this.trust, buildUnknownFields());
                case 2:
                    return new SocialAccounts(this.trust, buildUnknownFields());
                case 3:
                    return new GenericProfileElement.TrustElements(this.trust, buildUnknownFields());
                case 4:
                    return new GetCustomerLimitsResponse.GroupedLimits(this.trust, buildUnknownFields());
                case 5:
                    return new PrepareRecoveryActivitiesResponse(this.trust, buildUnknownFields());
                case 6:
                    return new GetAddressesResponse(this.trust, buildUnknownFields());
                case 7:
                    return new GetFeedResponse(this.trust, buildUnknownFields());
                case 8:
                    return new GetBusinessProfileResponse(this.trust, buildUnknownFields());
                case 9:
                    return new AfterpayAppletEntrypoint.CreditDetails(this.trust, buildUnknownFields());
                case 10:
                    return new AfterpayMerchantSheet.PasteboardTextLines(this.trust, buildUnknownFields());
                case 11:
                    return new AppletCardSection.TileCarousel(this.trust, buildUnknownFields());
                case 12:
                    return new AppletCardSection.TransactionList(this.trust, buildUnknownFields());
                case 13:
                    return new AvatarSection(this.trust, buildUnknownFields());
                case 14:
                    return new CardSection(this.trust, buildUnknownFields());
                case 15:
                    return new CreditLineSnapshot(this.trust, buildUnknownFields());
                case 16:
                    return new Experiments.BNPLAssistantExperiment(this.trust, buildUnknownFields());
                case 17:
                    return new OrderListSection.TextLineItems(this.trust, buildUnknownFields());
                case 18:
                    return new RowSection(this.trust, buildUnknownFields());
                case 19:
                    return new CellTowerContext(this.trust, buildUnknownFields());
                case 20:
                    return new GetCryptoTaxStatementsResponse(this.trust, buildUnknownFields());
                case 21:
                    return new ProfileDirectorySearchResponse.LocalSyncedCustomerResults(this.trust, buildUnknownFields());
                case 22:
                    return new ProfileDirectorySearchResponse.ServerResults(this.trust, buildUnknownFields());
                case 23:
                    return new RecipientSelectorSearchResponse(this.trust, buildUnknownFields());
                case 24:
                    return new RecipientSelectorSearchResponse.LocalFavoriteResults(this.trust, buildUnknownFields());
                case 25:
                    return new RecipientSelectorSearchResponse.LocalSyncedCustomerResults(this.trust, buildUnknownFields());
                case 26:
                    return new RecipientSelectorSearchResponse.ServerResults(this.trust, buildUnknownFields());
                case 27:
                    return new SearchCommonAvatarSection(this.trust, buildUnknownFields());
                case 28:
                    return new SearchCommonCardSection(this.trust, buildUnknownFields());
                default:
                    return new SearchCommonRowSection(this.trust, buildUnknownFields());
            }
        }
    }

    static {
        TrustsData$Companion$ADAPTER$1 trustsData$Companion$ADAPTER$1 = new TrustsData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TrustsData.class), "type.googleapis.com/squareup.cash.cashface.api.TrustsData", Syntax.PROTO_2, null, "squareup/cash/cashface/api/CommerceProfileData.proto");
        ADAPTER = trustsData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(trustsData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrustsData(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.trust = TransactorKt.immutableCopyOf("trust", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TrustsData)) {
            return false;
        }
        TrustsData trustsData = (TrustsData) obj;
        return Intrinsics.areEqual(unknownFields(), trustsData.unknownFields()) && Intrinsics.areEqual(this.trust, trustsData.trust);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.trust.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.trust = this.trust;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.trust;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("trust=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TrustsData{", "}", 0, null, null, 56);
    }
}
