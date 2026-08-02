package com.squareup.protos.cash.cashface.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashbusinessaccounts.api.v1.GetC4bEligibilityRequest;
import com.squareup.protos.cash.cashbusinesspayments.api.v1beta1.GetSecureTokenResponse;
import com.squareup.protos.cash.cashcustomergateway.api.v1.LookupCashtagRequest;
import com.squareup.protos.cash.cashface.delegates.ContextWrapper;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import com.squareup.protos.cash.cashfileuploads.app.DeleteFileRequest;
import com.squareup.protos.cash.cashfileuploads.app.UploadFileResponse;
import com.squareup.protos.cash.cashliteflow.api.v1.VerifyRecoveryOtpResponse;
import com.squareup.protos.cash.cashliteorchestrator.api.v1.RegisterLiteP2pPaymentResponse;
import com.squareup.protos.cash.cashsuggest.api.AfterpayMerchantSheetRequest;
import com.squareup.protos.cash.cashsuggest.api.OffersTabCollectionRequest;
import com.squareup.protos.cash.cashsuggest.api.TapAction;
import com.squareup.protos.cash.cashtaxgateway.sync_values.UiEfileInfo;
import com.squareup.protos.cash.cashtes.app.v1beta1.UserData2Request;
import com.squareup.protos.cash.cashtes.app.v1beta1.UserDataRequest;
import com.squareup.protos.cash.cashvoice.syncentity.v1.SupportPhoneConfirmation;
import com.squareup.protos.cash.cashvoice.verification.app.v1.ConfirmPhoneSupportAttemptFlowParameters;
import com.squareup.protos.cash.contacts.app.ImageExifData;
import com.squareup.protos.cash.cryptocurrency.Wallet;
import com.squareup.protos.cash.customersearch.api.ProfileDirectorySearchResponse;
import com.squareup.protos.cash.customersearch.api.RecipientSelectorCustomer;
import com.squareup.protos.cash.customersearch.api.SearchCommonTextRowItem;
import com.squareup.protos.cash.customersurveyor.app.GetSupportSurveyRequest;
import com.squareup.protos.cash.customersurveyor.app.GetSupportSurveyResponse;
import com.squareup.protos.cash.discover.api.app.v1.message.GetDetailsPageRequest;
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
public final class Banner extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Banner> CREATOR;
    public final String banner_color;

    static {
        Banner$Companion$ADAPTER$1 banner$Companion$ADAPTER$1 = new Banner$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Banner.class), "type.googleapis.com/squareup.cash.cashface.api.Banner", Syntax.PROTO_2, null, "squareup/cash/cashface/api/CommerceProfileData.proto");
        ADAPTER = banner$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(banner$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Banner(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.banner_color = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Banner)) {
            return false;
        }
        Banner banner = (Banner) obj;
        return Intrinsics.areEqual(unknownFields(), banner.unknownFields()) && Intrinsics.areEqual(this.banner_color, banner.banner_color);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.banner_color;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.banner_color = this.banner_color;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.banner_color;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "banner_color=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Banner{", "}", 0, null, null, 56);
    }

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public String banner_color;

        public Builder() {
            this.$r8$classId = 9;
            this.banner_color = "";
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new Banner(this.banner_color, buildUnknownFields());
                case 1:
                    return new GetC4bEligibilityRequest(this.banner_color, buildUnknownFields());
                case 2:
                    return new GetSecureTokenResponse(this.banner_color, buildUnknownFields());
                case 3:
                    return new LookupCashtagRequest(this.banner_color, buildUnknownFields());
                case 4:
                    return new AnalyticsData(this.banner_color, buildUnknownFields());
                case 5:
                    return new Category(this.banner_color, buildUnknownFields());
                case 6:
                    return new Location(this.banner_color, buildUnknownFields());
                case 7:
                    return new ContextWrapper.Origin.AccountLink(this.banner_color, buildUnknownFields());
                case 8:
                    return new GenericProfileElement.ButtonElement.ViewChangeAction(this.banner_color, buildUnknownFields());
                case 9:
                    return new DeleteFileRequest(this.banner_color, buildUnknownFields());
                case 10:
                    return new UploadFileResponse(this.banner_color, buildUnknownFields());
                case 11:
                    return new VerifyRecoveryOtpResponse(this.banner_color, buildUnknownFields());
                case 12:
                    return new RegisterLiteP2pPaymentResponse(this.banner_color, buildUnknownFields());
                case 13:
                    return new AfterpayMerchantSheetRequest(this.banner_color, buildUnknownFields());
                case 14:
                    return new OffersTabCollectionRequest(this.banner_color, buildUnknownFields());
                case 15:
                    return new TapAction(this.banner_color, buildUnknownFields());
                case 16:
                    return new UiEfileInfo(this.banner_color, buildUnknownFields());
                case 17:
                    return new UserData2Request(this.banner_color, buildUnknownFields());
                case 18:
                    return new UserDataRequest(this.banner_color, buildUnknownFields());
                case 19:
                    return new SupportPhoneConfirmation(this.banner_color, buildUnknownFields());
                case 20:
                    return new ConfirmPhoneSupportAttemptFlowParameters(this.banner_color, buildUnknownFields());
                case 21:
                    return new ImageExifData(this.banner_color, buildUnknownFields());
                case 22:
                    return new Wallet(this.banner_color, buildUnknownFields());
                case 23:
                    return new ProfileDirectorySearchResponse.DefaultUiElements.SeeMoreRow.Metadata(this.banner_color, buildUnknownFields());
                case 24:
                    return new RecipientSelectorCustomer.C4bInfo(this.banner_color, buildUnknownFields());
                case 25:
                    return new SearchCommonTextRowItem.Metadata(this.banner_color, buildUnknownFields());
                case 26:
                    return new com.squareup.protos.cash.customersearch.api.TapAction(this.banner_color, buildUnknownFields());
                case 27:
                    return new GetSupportSurveyRequest(this.banner_color, buildUnknownFields());
                case 28:
                    return new GetSupportSurveyResponse.Survey.SatisfactionQuestion(this.banner_color, buildUnknownFields());
                default:
                    return new GetDetailsPageRequest(this.banner_color, buildUnknownFields());
            }
        }

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }
    }
}
