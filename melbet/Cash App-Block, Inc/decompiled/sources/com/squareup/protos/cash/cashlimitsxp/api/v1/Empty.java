package com.squareup.protos.cash.cashlimitsxp.api.v1;

import android.os.Parcelable;
import com.squareup.protos.cash.cashface.delegates.ContextWrapper;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import com.squareup.protos.cash.cashfileuploads.app.DeleteFileResponse;
import com.squareup.protos.cash.cashliteflow.api.v1.GetWalletAddressesRequest;
import com.squareup.protos.cash.cashsessionrecorder.app.v1.SubmitScreenshotBundleResponse;
import com.squareup.protos.cash.cashsuggest.api.OffersTabHomeRequest;
import com.squareup.protos.cash.compass.api.WriteGpsDataResponse;
import com.squareup.protos.cash.composer.app.VideoAsset;
import com.squareup.protos.cash.cryptoinvestflow.service.GetCryptoTaxStatementsClientRequest;
import com.squareup.protos.cash.customersearch.api.ProfileDirectorySearchResponse;
import com.squareup.protos.cash.customersearch.api.RecipientSelectorSearchResponse;
import com.squareup.protos.cash.customersearch.api.privacy.GetSearchPrivacySettingsRequest;
import com.squareup.protos.cash.customersearch.api.privacy.SetSearchPrivacySettingsResponse;
import com.squareup.protos.cash.customersurveyor.app.GetSupportSurveyResponse;
import com.squareup.protos.cash.customersurveyor.app.SubmitSupportSurveyResponse;
import com.squareup.protos.cash.deviceintegritly.api.PublishClientTrustSignalsResponse;
import com.squareup.protos.cash.discover.api.app.v1.model.EmptyPrimaryContent;
import com.squareup.protos.cash.discover.api.app.v1.model.ShopBrowseRequest;
import com.squareup.protos.cash.discover.api.app.v2.api.GetMoneyTabAppletsRequest;
import com.squareup.protos.cash.disputron.core.GetClaimResolutionStatisticsRequest;
import com.squareup.protos.cash.genericelements.ui.Action;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Empty extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Empty> CREATOR;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new Empty(buildUnknownFields());
                case 1:
                    return new ContextWrapper.Origin.BlockedBusinesses(buildUnknownFields());
                case 2:
                    return new ContextWrapper.Origin.DiscoverSearch(buildUnknownFields());
                case 3:
                    return new ContextWrapper.Origin.DiscoverTab(buildUnknownFields());
                case 4:
                    return new ContextWrapper.Origin.OfferDeepLink(buildUnknownFields());
                case 5:
                    return new GenericProfileElement.ActivityElement(buildUnknownFields());
                case 6:
                    return new GenericProfileElement.ButtonElement.ReportAction(buildUnknownFields());
                case 7:
                    return new DeleteFileResponse(buildUnknownFields());
                case 8:
                    return new GetCustomerLimitsRequest(buildUnknownFields());
                case 9:
                    return new GetInlineMessageRequest(buildUnknownFields());
                case 10:
                    return new GetWalletAddressesRequest(buildUnknownFields());
                case 11:
                    return new SubmitScreenshotBundleResponse(buildUnknownFields());
                case 12:
                    return new OffersTabHomeRequest(buildUnknownFields());
                case 13:
                    return new WriteGpsDataResponse(buildUnknownFields());
                case 14:
                    return new VideoAsset.VideoFill(buildUnknownFields());
                case 15:
                    return new GetCryptoTaxStatementsClientRequest(buildUnknownFields());
                case 16:
                    return new ProfileDirectorySearchResponse.LocalAddressBookResults(buildUnknownFields());
                case 17:
                    return new ProfileDirectorySearchResponse.LocalFavoriteResults(buildUnknownFields());
                case 18:
                    return new RecipientSelectorSearchResponse.LocalAddressBookResults(buildUnknownFields());
                case 19:
                    return new GetSearchPrivacySettingsRequest(buildUnknownFields());
                case 20:
                    return new SetSearchPrivacySettingsResponse(buildUnknownFields());
                case 21:
                    return new GetSupportSurveyResponse.AlreadySubmitted(buildUnknownFields());
                case 22:
                    return new SubmitSupportSurveyResponse(buildUnknownFields());
                case 23:
                    return new PublishClientTrustSignalsResponse(buildUnknownFields());
                case 24:
                    return new EmptyPrimaryContent(buildUnknownFields());
                case 25:
                    return new ShopBrowseRequest(buildUnknownFields());
                case 26:
                    return new GetMoneyTabAppletsRequest(buildUnknownFields());
                case 27:
                    return new GetClaimResolutionStatisticsRequest(buildUnknownFields());
                case 28:
                    return new Action.DismissAction(buildUnknownFields());
                default:
                    return new Action.CheckingBalance(buildUnknownFields());
            }
        }
    }

    static {
        Empty$Companion$ADAPTER$1 empty$Companion$ADAPTER$1 = new Empty$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Empty.class), "type.googleapis.com/squareup.cash.cashlimitsxp.api.v1.Empty", Syntax.PROTO_2, null, "squareup/cash/cashlimitsxp/api/v1/inline_message.proto");
        ADAPTER = empty$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(empty$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Empty(ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof Empty) && Intrinsics.areEqual(unknownFields(), ((Empty) obj).unknownFields());
    }

    public final int hashCode() {
        return unknownFields().hashCode();
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        return "Empty{}";
    }
}
