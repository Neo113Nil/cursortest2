package com.squareup.protos.cash.composer.app;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import app.cash.sqldelight.db.QueryResult;
import app.cash.trifle.delegates.EndEntity$Factory;
import app.cash.versioned.VersionedKt;
import app.cash.zipline.internal.bridge.ZiplineServiceAdapterKt;
import app.cash.zipline.loader.FastCodeUpdatesKt;
import app.cash.zipline.loader.LoaderJniKt;
import app.cash.zipline.loader.ZiplineFile;
import coil3.intercept.EngineInterceptorKt;
import coil3.network.CacheNetworkResponse;
import coil3.request.ViewTargetRequestManagerKt;
import com.squareup.protos.cash.cashsuggest.api.OfferSheetKey;
import com.squareup.protos.cash.cashsuggest.api.OffersSheetRequest;
import com.squareup.protos.cash.cashsuggest.api.OffersTabCollectionResponse;
import com.squareup.protos.cash.composer.app.CardTabNullStateSwipeConfig;
import com.squareup.protos.cash.customersearch.api.ProfileDirectorySearchResponse;
import com.squareup.protos.cash.customersearch.api.RecipientSelectorSearchResponse;
import com.squareup.protos.cash.customersearch.api.SearchCommonPlaceholderSection;
import com.squareup.protos.cash.customersurveyor.app.GetSupportSurveyResponse;
import com.squareup.protos.cash.deviceintegritly.api.PlayIntegrityVerdict;
import com.squareup.protos.cash.deviceintegritly.api.SendMRIContextRequest;
import com.squareup.protos.cash.discover.api.app.v1.message.GetDetailsPageResponse;
import com.squareup.protos.cash.discover.api.app.v1.model.AvatarOverlayCardSection;
import com.squareup.protos.cash.discover.api.app.v1.model.DetailsPage;
import com.squareup.protos.cash.discover.api.app.v2.api.AiSearchResponse;
import com.squareup.protos.cash.discover.api.app.v2.api.SectionPageResponse;
import com.squareup.protos.cash.discover.api.app.v2.api.SectionPageResponse$Page$RowSection;
import com.squareup.protos.cash.discover.api.app.v2.api.Summary;
import com.squareup.protos.cash.discover.api.app.v2.model.Section;
import com.squareup.protos.cash.discover.api.app.v2.model.Section$Content$RowSection;
import com.squareup.protos.cash.familynotifications.api.v1.NotificationSetting;
import com.squareup.protos.cash.familynotifications.api.v1.NotificationSetting$Setting$RealtimeNotificationSetting;
import com.squareup.protos.cash.fiatly.api.v1.InitiatePersonalizedPaymentResponse;
import com.squareup.protos.cash.fiatly.api.v1.P2PControls;
import com.squareup.protos.cash.fiatly.api.v1.SetP2PControlsResponse;
import com.squareup.protos.cash.fiatly.api.v2.GetPaymentUpdatesBySessionResponse;
import com.squareup.protos.cash.fx.app.StreamExchangeRateResponse;
import com.squareup.protos.cash.genericelements.ui.BaseElement;
import com.squareup.protos.cash.genericelements.ui.BetweenSectionSpacer;
import com.squareup.protos.cash.genericelements.ui.BlankDividerComponent;
import com.squareup.protos.cash.genericelements.ui.BlankDividerElement;
import com.squareup.protos.cash.genericelements.ui.FullWidthComponent;
import com.squareup.protos.cash.genericelements.ui.RefreshTrigger;
import com.squareup.protos.cash.genericelements.ui.RefreshTrigger$Trigger$BoostContentUpdate;
import com.squareup.protos.cash.genericelements.ui.WithinSectionSpacer;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.protos.cash.security.mri.api.v1.MRIContext;
import com.squareup.protos.cash.shop.rendering.api.TapAction;
import com.squareup.protos.franklin.app.InitiatePaymentResponse;
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

/* loaded from: classes7.dex */
public final class Asset extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Asset> CREATOR;
    public final QueryResult.DefaultImpls asset_type;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Object asset_type;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new Asset((QueryResult.DefaultImpls) this.asset_type, buildUnknownFields());
                case 1:
                    return new OffersSheetRequest((OfferSheetKey) this.asset_type, buildUnknownFields());
                case 2:
                    return new OffersTabCollectionResponse.InStoreBoostMetadata((TapAction) this.asset_type, buildUnknownFields());
                case 3:
                    return new CardTabNullStateSwipeConfig.SwipePage.SwipePageElement((EndEntity$Factory) this.asset_type, buildUnknownFields());
                case 4:
                    return new CardTabNullStateSwipeConfig.VisualElement((VersionedKt) this.asset_type, buildUnknownFields());
                case 5:
                    return new ProfileDirectorySearchResponse.DefaultUiElements((ProfileDirectorySearchResponse.DefaultUiElements.SeeMoreRow) this.asset_type, buildUnknownFields());
                case 6:
                    return new ProfileDirectorySearchResponse.ResultSource((ZiplineServiceAdapterKt) this.asset_type, buildUnknownFields());
                case 7:
                    return new RecipientSelectorSearchResponse.ResultSource((FastCodeUpdatesKt) this.asset_type, buildUnknownFields());
                case 8:
                    return new SearchCommonPlaceholderSection((SearchCommonPlaceholderSection.Identifier) this.asset_type, buildUnknownFields());
                case 9:
                    return new GetSupportSurveyResponse((LoaderJniKt) this.asset_type, buildUnknownFields());
                case 10:
                    return new PlayIntegrityVerdict.AccountDetails((PlayIntegrityVerdict.AccountDetails.AppLicensingVerdict) this.asset_type, buildUnknownFields());
                case 11:
                    MRIContext mRIContext = (MRIContext) this.asset_type;
                    if (mRIContext != null) {
                        return new SendMRIContextRequest(mRIContext, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(mRIContext, "mri_context");
                    throw null;
                case 12:
                    return new GetDetailsPageResponse((DetailsPage) this.asset_type, buildUnknownFields());
                case 13:
                    return new AvatarOverlayCardSection.OverlayCardItem((ZiplineFile.Companion) this.asset_type, buildUnknownFields());
                case 14:
                    return new AiSearchResponse((Summary) this.asset_type, buildUnknownFields());
                case 15:
                    return new SectionPageResponse((SectionPageResponse$Page$RowSection) this.asset_type, buildUnknownFields());
                case 16:
                    return new Section((Section$Content$RowSection) this.asset_type, buildUnknownFields());
                case 17:
                    return new NotificationSetting((NotificationSetting$Setting$RealtimeNotificationSetting) this.asset_type, buildUnknownFields());
                case 18:
                    return new InitiatePersonalizedPaymentResponse((InitiatePaymentResponse) this.asset_type, buildUnknownFields());
                case 19:
                    return new SetP2PControlsResponse((P2PControls) this.asset_type, buildUnknownFields());
                case 20:
                    return new GetPaymentUpdatesBySessionResponse((EngineInterceptorKt) this.asset_type, buildUnknownFields());
                case 21:
                    return new StreamExchangeRateResponse((CacheNetworkResponse) this.asset_type, buildUnknownFields());
                case 22:
                    return new BaseElement((ViewTargetRequestManagerKt) this.asset_type, buildUnknownFields());
                case 23:
                    return new BetweenSectionSpacer((BetweenSectionSpacer.Size) this.asset_type, buildUnknownFields());
                case 24:
                    return new BlankDividerComponent((BlankDividerComponent.Size) this.asset_type, buildUnknownFields());
                case 25:
                    return new BlankDividerElement((BlankDividerElement.Size) this.asset_type, buildUnknownFields());
                case 26:
                    return new FullWidthComponent((BaseElement) this.asset_type, buildUnknownFields());
                case 27:
                    return new RefreshTrigger((RefreshTrigger$Trigger$BoostContentUpdate) this.asset_type, buildUnknownFields());
                case 28:
                    return new WithinSectionSpacer((WithinSectionSpacer.Size) this.asset_type, buildUnknownFields());
                default:
                    return new Action.OnFilePayment.CheckoutOptions((Action.ScopeOptions) this.asset_type, buildUnknownFields());
            }
        }
    }

    static {
        Asset$Companion$ADAPTER$1 asset$Companion$ADAPTER$1 = new Asset$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Asset.class), "type.googleapis.com/squareup.cash.composer.app.Asset", Syntax.PROTO_2, null, "squareup/cash/composer/app/AppService.proto");
        ADAPTER = asset$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(asset$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Asset(QueryResult.DefaultImpls defaultImpls, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.asset_type = defaultImpls;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Asset)) {
            return false;
        }
        Asset asset = (Asset) obj;
        return Intrinsics.areEqual(unknownFields(), asset.unknownFields()) && Intrinsics.areEqual(this.asset_type, asset.asset_type);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        QueryResult.DefaultImpls defaultImpls = this.asset_type;
        int hashCode2 = hashCode + (defaultImpls != null ? defaultImpls.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.asset_type = this.asset_type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        QueryResult.DefaultImpls defaultImpls = this.asset_type;
        if (defaultImpls != null) {
            arrayList.add("asset_type=" + defaultImpls);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Asset{", "}", 0, null, null, 56);
    }
}
