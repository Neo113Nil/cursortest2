package com.squareup.protos.cash.profiles;

import android.os.Parcelable;
import com.squareup.protos.cash.postbank.api.InitiateDirectDepositSetupFlowResponse;
import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.protos.cash.postcard.app.FamilyAccountsLockIssuedCardsRequest;
import com.squareup.protos.cash.postcard.app.FamilyAccountsUnlockIssuedCardsRequest;
import com.squareup.protos.cash.postcard.app.GetAppThemesRequest;
import com.squareup.protos.cash.referly.api.incentives.client.GetPromotionControlsRequest;
import com.squareup.protos.cash.registrar.api.GetStatementDescriptorRequest;
import com.squareup.protos.cash.registrar.api.GetStatementTypesRequest;
import com.squareup.protos.cash.shop.rendering.api.ScrollToAction;
import com.squareup.protos.cash.shop.rendering.api.UrlTapAction;
import com.squareup.protos.cash.sup.api.v1.CancelCheckoutByPaymentTokenRequest;
import com.squareup.protos.cash.sup.api.v1.CancelCheckoutRequest;
import com.squareup.protos.cash.sup.api.v1.RetrievePlanDetailsRequest;
import com.squareup.protos.cash.supportal.app.ChatMessage;
import com.squareup.protos.cash.supportal.app.EndChatResponse;
import com.squareup.protos.cash.supportal.app.GetChatMessagesRequest;
import com.squareup.protos.cash.supportal.app.OutgoingMessage;
import com.squareup.protos.cash.supportal.app.SupportPhoneStatusResponse;
import com.squareup.protos.cash.supportal.app.ValidateEmailRequest;
import com.squareup.protos.cash.taply.app.v1.DeviceMetadata;
import com.squareup.protos.cash.taply.app.v1.FidesmoEncryptionData;
import com.squareup.protos.cash.taply.app.v1.GetCustomerDetailsForDeprovisioningRequest;
import com.squareup.protos.cash.taply.app.v1.UnlockPaymentTokenDeviceRequest;
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
public final class ProfileDetails extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ProfileDetails> CREATOR;
    public final String bio;

    /* loaded from: classes8.dex */
    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public String bio;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new ProfileDetails(this.bio, buildUnknownFields());
                case 1:
                    return new InitiateDirectDepositSetupFlowResponse(this.bio, buildUnknownFields());
                case 2:
                    return new CardModule.CardElementAction.DoClientRoute(this.bio, buildUnknownFields());
                case 3:
                    return new CardModule.HeroNullStateModule.UnifiedCardHomeNUX.UpsellCard(this.bio, buildUnknownFields());
                case 4:
                    return new FamilyAccountsLockIssuedCardsRequest(this.bio, buildUnknownFields());
                case 5:
                    return new FamilyAccountsUnlockIssuedCardsRequest(this.bio, buildUnknownFields());
                case 6:
                    return new GetAppThemesRequest(this.bio, buildUnknownFields());
                case 7:
                    return new GetPromotionControlsRequest(this.bio, buildUnknownFields());
                case 8:
                    return new GetStatementDescriptorRequest(this.bio, buildUnknownFields());
                case 9:
                    return new GetStatementTypesRequest(this.bio, buildUnknownFields());
                case 10:
                    return new ScrollToAction(this.bio, buildUnknownFields());
                case 11:
                    return new UrlTapAction(this.bio, buildUnknownFields());
                case 12:
                    return new CancelCheckoutByPaymentTokenRequest(this.bio, buildUnknownFields());
                case 13:
                    return new CancelCheckoutRequest(this.bio, buildUnknownFields());
                case 14:
                    return new RetrievePlanDetailsRequest(this.bio, buildUnknownFields());
                case 15:
                    return new ChatMessage.Advocate(this.bio, buildUnknownFields());
                case 16:
                    return new ChatMessage.Disclaimer(this.bio, buildUnknownFields());
                case 17:
                    return new ChatMessage.OpenLink(this.bio, buildUnknownFields());
                case 18:
                    return new ChatMessage.TextBody(this.bio, buildUnknownFields());
                case 19:
                    return new ChatMessage.TransactionBody(this.bio, buildUnknownFields());
                case 20:
                    return new EndChatResponse(this.bio, buildUnknownFields());
                case 21:
                    return new GetChatMessagesRequest.After(this.bio, buildUnknownFields());
                case 22:
                    return new GetChatMessagesRequest.Before(this.bio, buildUnknownFields());
                case 23:
                    return new OutgoingMessage.TextBody(this.bio, buildUnknownFields());
                case 24:
                    return new SupportPhoneStatusResponse.Denied(this.bio, buildUnknownFields());
                case 25:
                    return new ValidateEmailRequest(this.bio, buildUnknownFields());
                case 26:
                    return new DeviceMetadata(this.bio, buildUnknownFields());
                case 27:
                    return new FidesmoEncryptionData(this.bio, buildUnknownFields());
                case 28:
                    return new GetCustomerDetailsForDeprovisioningRequest(this.bio, buildUnknownFields());
                default:
                    return new UnlockPaymentTokenDeviceRequest(this.bio, buildUnknownFields());
            }
        }
    }

    static {
        ProfileDetails$Companion$ADAPTER$1 profileDetails$Companion$ADAPTER$1 = new ProfileDetails$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ProfileDetails.class), "type.googleapis.com/squareup.cash.profiles.ProfileDetails", Syntax.PROTO_2, null, "squareup/cash/profiles/ProfileDetails.proto");
        ADAPTER = profileDetails$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(profileDetails$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileDetails(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.bio = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProfileDetails)) {
            return false;
        }
        ProfileDetails profileDetails = (ProfileDetails) obj;
        return Intrinsics.areEqual(unknownFields(), profileDetails.unknownFields()) && Intrinsics.areEqual(this.bio, profileDetails.bio);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.bio;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.bio = this.bio;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.bio != null) {
            arrayList.add("bio=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ProfileDetails{", "}", 0, null, null, 56);
    }
}
