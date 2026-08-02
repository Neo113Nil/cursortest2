package com.squareup.protos.document;

import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_common.zzkq;
import com.google.android.gms.internal.mlkit_vision_common.zzlu;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.activity.api.v1.ActivityItemGlobalId;
import com.squareup.protos.cash.activity.api.v1.ActivityItemType;
import com.squareup.protos.cash.activity.api.v1.ActivityRowSection;
import com.squareup.protos.cash.activity.api.v1.ActivitySection;
import com.squareup.protos.cash.data.Expiration;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.money.elements.BookletTile;
import com.squareup.protos.cash.recipientsuggestion.CustomerData;
import com.squareup.protos.cash.referly.api.incentives.client.ActivePromotion;
import com.squareup.protos.cash.security.mri.api.v1.IosSignals;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.shop.rendering.api.CategoryTileSection;
import com.squareup.protos.cash.shop.rendering.api.FormattedDetail;
import com.squareup.protos.cash.shop.rendering.api.MultiOffersSheet;
import com.squareup.protos.cash.shop.rendering.api.OfferType;
import com.squareup.protos.cash.shop.rendering.api.StyledText;
import com.squareup.protos.cash.shop.rendering.api.TapAction;
import com.squareup.protos.cash.taply.app.v1.SuccessScreen;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.cash.whimsicard.syncentity.PresentationEntry;
import com.squareup.protos.cash.whimsicard.syncentity.StatusDisplay;
import com.squareup.protos.cash.whimsicard.syncentity.Timeline;
import com.squareup.protos.cash.woodrow.syncvalues.PerformanceDetailsUiSection;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.signing.AndroidKeyStoreException;
import com.squareup.protos.employeejobs.Wage;
import com.squareup.protos.franklin.api.CashtagStatus;
import com.squareup.protos.franklin.api.DepositPreference;
import com.squareup.protos.franklin.api.Instrument;
import com.squareup.protos.franklin.api.InstrumentSelection;
import com.squareup.protos.franklin.app.ClientSecurityContext;
import com.squareup.protos.franklin.app.ConfirmPasscodeRequest;
import com.squareup.protos.franklin.app.GetCashtagStatusResponse;
import com.squareup.protos.franklin.app.InitiateSessionRequest;
import com.squareup.protos.franklin.app.SelectSponsorsRequest;
import com.squareup.protos.franklin.app.SetCashtagResponse;
import com.squareup.protos.franklin.app.VerifyPasscodeResponse;
import com.squareup.protos.franklin.common.ActivityRowRenderData;
import com.squareup.protos.franklin.common.AfterPayRenderData;
import com.squareup.protos.franklin.common.BitcoinLightningRenderData;
import com.squareup.protos.franklin.common.ClientRoutingConfig;
import com.squareup.protos.franklin.common.ConfirmationSheetData;
import com.squareup.protos.franklin.common.CustomerAdjustmentRenderData;
import com.squareup.protos.franklin.common.DepositFeeData;
import com.squareup.protos.franklin.common.DepositPreferenceData;
import com.squareup.protos.franklin.common.DepositPreferenceOption;
import com.squareup.protos.franklin.common.ExchangeRate;
import com.squareup.protos.franklin.common.FeatureInvitationRenderData;
import com.squareup.protos.franklin.common.FeeData;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.ui.UiCustomer;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes.dex */
public final class Document extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Document> CREATOR;
    public final String category;
    public final Long document_date;
    public final String owner_token;
    public final String title;
    public final String token;
    public final String url;

    static {
        Document$Companion$ADAPTER$1 document$Companion$ADAPTER$1 = new Document$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Document.class), "type.googleapis.com/squareup.document.Document", Syntax.PROTO_2, null, "squareup/document/document.proto");
        ADAPTER = document$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(document$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Document(String str, String str2, String str3, String str4, String str5, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.category = str;
        this.token = str2;
        this.title = str3;
        this.url = str4;
        this.owner_token = str5;
        this.document_date = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Document)) {
            return false;
        }
        Document document = (Document) obj;
        return Intrinsics.areEqual(unknownFields(), document.unknownFields()) && Intrinsics.areEqual(this.category, document.category) && Intrinsics.areEqual(this.token, document.token) && Intrinsics.areEqual(this.title, document.title) && Intrinsics.areEqual(this.url, document.url) && Intrinsics.areEqual(this.owner_token, document.owner_token) && Intrinsics.areEqual(this.document_date, document.document_date);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.category;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.token;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.title;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.url;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.owner_token;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
        Long l = this.document_date;
        int hashCode7 = hashCode6 + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0, false);
        builder.category = this.category;
        builder.token = this.token;
        builder.title = this.title;
        builder.url = this.url;
        builder.owner_token = this.owner_token;
        builder.document_date = this.document_date;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.category;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "category=", arrayList);
        }
        String str2 = this.token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "token=", arrayList);
        }
        String str3 = this.title;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "title=", arrayList);
        }
        String str4 = this.url;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "url=", arrayList);
        }
        String str5 = this.owner_token;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "owner_token=", arrayList);
        }
        Long l = this.document_date;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("document_date=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Document{", "}", 0, null, null, 56);
    }

    /* loaded from: classes8.dex */
    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Serializable category;
        public Object document_date;
        public Object owner_token;
        public Object title;
        public Object token;
        public Object url;

        public Builder(int i) {
            this.$r8$classId = i;
            switch (i) {
                case 15:
                    EmptyList emptyList = EmptyList.INSTANCE;
                    this.title = emptyList;
                    this.document_date = emptyList;
                    break;
                case 24:
                    this.document_date = EmptyList.INSTANCE;
                    break;
                case 26:
                    EmptyList emptyList2 = EmptyList.INSTANCE;
                    this.token = emptyList2;
                    this.title = emptyList2;
                    break;
                default:
                    this.owner_token = EmptyList.INSTANCE;
                    break;
            }
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new Document((String) this.category, (String) this.token, (String) this.title, (String) this.url, (String) this.owner_token, (Long) this.document_date, buildUnknownFields());
                case 1:
                    return new CustomerData((String) this.category, (String) this.token, (String) this.title, (Image) this.url, (Boolean) this.owner_token, (Boolean) this.document_date, buildUnknownFields());
                case 2:
                    return new ActivePromotion((Icon) this.document_date, (String) this.category, (String) this.token, (String) this.title, (String) this.url, (String) this.owner_token, buildUnknownFields());
                case 3:
                    return new IosSignals((Boolean) this.category, (Boolean) this.token, (Boolean) this.title, (Boolean) this.url, (Boolean) this.owner_token, (Boolean) this.document_date, buildUnknownFields());
                case 4:
                    return new CategoryTileSection.CategoryTile((AnalyticsEvent) this.category, (TapAction) this.token, (LocalizedString) this.title, (zzkq) this.url, (StyledText) this.owner_token, (Image) this.document_date, buildUnknownFields());
                case 5:
                    return new FormattedDetail.CreditInfoCheck((String) this.category, (LocalizedString) this.token, (LocalizedString) this.title, (Money) this.url, (StyledText) this.owner_token, (StyledText) this.document_date, buildUnknownFields());
                case 6:
                    return new MultiOffersSheet.OfferPreview((OfferType) this.owner_token, (String) this.category, (String) this.token, (String) this.title, (String) this.url, (TapAction) this.document_date, buildUnknownFields());
                case 7:
                    return new SuccessScreen((String) this.category, (String) this.token, (String) this.title, (BookletTile) this.owner_token, (List) this.document_date, (String) this.url, buildUnknownFields());
                case 8:
                    return new PresentationEntry((PresentationEntry.EntryType) this.title, (PresentationEntry.Category) this.url, (StatusDisplay) this.owner_token, (Timeline) this.document_date, (String) this.category, (String) this.token, buildUnknownFields());
                case 9:
                    return new PerformanceDetailsUiSection.Row((String) this.category, (PerformanceDetailsUiSection.Row.MoreInfo) this.title, (String) this.token, (zzlu) this.url, (LocalizableString) this.owner_token, (LocalizableString) this.document_date, buildUnknownFields());
                case 10:
                    return new AndroidKeyStoreException((Integer) this.category, (Integer) this.token, (Boolean) this.title, (Boolean) this.url, (Integer) this.owner_token, (Boolean) this.document_date, buildUnknownFields());
                case 11:
                    return new Wage((Wage.WageType) this.category, (Money) this.token, (Money) this.title, (Integer) this.url, (Boolean) this.owner_token, (Boolean) this.document_date, buildUnknownFields());
                case 12:
                    return new ConfirmPasscodeRequest((RequestContext) this.url, (String) this.category, (List) this.owner_token, (String) this.token, (InstrumentSelection) this.document_date, (String) this.title, buildUnknownFields());
                case 13:
                    return new GetCashtagStatusResponse((GetCashtagStatusResponse.Status) this.owner_token, (String) this.category, (CashtagStatus) this.document_date, (String) this.token, (String) this.title, (String) this.url, buildUnknownFields());
                case 14:
                    return new InitiateSessionRequest((ByteString) this.url, (String) this.category, (ClientSecurityContext) this.owner_token, (String) this.token, (String) this.title, (RequestContext) this.document_date, buildUnknownFields());
                case 15:
                    return new SelectSponsorsRequest((RequestContext) this.token, (List) this.title, (SelectSponsorsRequest.Action) this.url, (String) this.category, (Boolean) this.owner_token, (List) this.document_date, buildUnknownFields());
                case 16:
                    return new SelectSponsorsRequest.SelectedSponsor((UiCustomer) this.token, (Boolean) this.title, (Boolean) this.url, (Boolean) this.owner_token, (String) this.category, (Boolean) this.document_date, buildUnknownFields());
                case 17:
                    return new SetCashtagResponse((ResponseContext) this.title, (SetCashtagResponse.Status) this.url, (String) this.category, (String) this.token, (CashtagStatus) this.owner_token, (SetCashtagResponse.FailureReason) this.document_date, buildUnknownFields());
                case 18:
                    return new VerifyPasscodeResponse((ResponseContext) this.title, (VerifyPasscodeResponse.Status) this.url, (String) this.category, (String) this.token, (Instrument) this.owner_token, (VerifyPasscodeResponse.ProtectedData) this.document_date, buildUnknownFields());
                case 19:
                    return new VerifyPasscodeResponse.ProtectedData.CashCardInfo((String) this.category, (String) this.token, (String) this.title, (String) this.url, (Expiration) this.document_date, (String) this.owner_token, buildUnknownFields());
                case 20:
                    return new ActivityRowRenderData((ActivitySection) this.category, (List) this.token, (ActivityItemType) this.title, (ActivityItemGlobalId) this.url, (ActivityRowSection) this.owner_token, (ActivityItemGlobalId) this.document_date, buildUnknownFields());
                case 21:
                    return new AfterPayRenderData.Installment((String) this.category, (Money) this.title, (Long) this.document_date, (Long) this.url, (Boolean) this.owner_token, (String) this.token, buildUnknownFields());
                case 22:
                    return new AfterPayRenderData.Summary((List) this.title, (Long) this.document_date, (Money) this.url, (String) this.category, (AfterPayRenderData.Summary.Status) this.owner_token, (String) this.token, buildUnknownFields());
                case 23:
                    return new BitcoinLightningRenderData((String) this.category, (String) this.token, (String) this.title, (BitcoinLightningRenderData.FundingSource) this.document_date, (String) this.url, (String) this.owner_token, buildUnknownFields());
                case 24:
                    String str = (String) this.category;
                    return new ClientRoutingConfig.DeepLinkRule((Boolean) this.title, (Boolean) this.url, (Boolean) this.owner_token, str, (String) this.token, (List) this.document_date, buildUnknownFields());
                case 25:
                    return new CustomerAdjustmentRenderData((CustomerAdjustmentRenderData.Product) this.title, (CustomerAdjustmentRenderData.Action) this.url, (String) this.category, (String) this.token, (Long) this.document_date, (CustomerAdjustmentRenderData.AdditionalAchContext) this.owner_token, buildUnknownFields());
                case 26:
                    return new DepositPreferenceData((String) this.category, (List) this.token, (List) this.title, (DepositPreference) this.url, (DepositFeeData) this.owner_token, (Boolean) this.document_date, buildUnknownFields());
                case 27:
                    return new DepositPreferenceOption((DepositPreference) this.title, (FeeData) this.url, (String) this.category, (String) this.token, (ConfirmationSheetData) this.owner_token, (Boolean) this.document_date, buildUnknownFields());
                case 28:
                    return new ExchangeRate((Money) this.category, (Long) this.document_date, (Long) this.token, (Long) this.title, (CurrencyCode) this.url, (Long) this.owner_token, buildUnknownFields());
                default:
                    return new FeatureInvitationRenderData((FeatureInvitationRenderData.Status) this.owner_token, (FeatureInvitationRenderData.Feature) this.document_date, (String) this.category, (String) this.token, (String) this.title, (String) this.url, buildUnknownFields());
            }
        }

        public /* synthetic */ Builder(int i, boolean z) {
            this.$r8$classId = i;
        }
    }
}
