package com.squareup.protos.cash.pools;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.mosaic.resources.api.v2.Preset;
import com.squareup.protos.cash.aegis.client_routes.DependentDetailsEntryDialog;
import com.squareup.protos.cash.cashlimitsxp.api.v1.GetInlineMessageResponse;
import com.squareup.protos.cash.local.client.v1.GetBuyerInfoRequest;
import com.squareup.protos.cash.local.client.v1.GetEditorialResponse;
import com.squareup.protos.cash.local.client.v1.GetNeighborhoodsTabContentResponse;
import com.squareup.protos.cash.local.client.v1.ShowToast;
import com.squareup.protos.cash.nearby.api.v1.BroadcasterProfileData;
import com.squareup.protos.cash.paychecks.api.v1.CustomerInfo;
import com.squareup.protos.cash.paychecks.api.v1.Payer;
import com.squareup.protos.cash.piggybank.appapi.SavingsConfig;
import com.squareup.protos.cash.supportal.app.ChatMessage;
import com.squareup.protos.cash.taply.app.v1.SuccessScreen;
import com.squareup.protos.cash.usher.api.GetPreSignInDataResponse;
import com.squareup.protos.checkmate.sync.UiCheckDeposit;
import com.squareup.protos.franklin.app.InAppBrowserConfig;
import com.squareup.protos.franklin.app.SubmitLiteRecoveryEmailOtpBlockerRequest;
import com.squareup.protos.franklin.common.TreehouseConfig;
import com.squareup.protos.franklin.investing.resources.EquityDiscoveryAnimationTile;
import com.squareup.protos.invest.ui.Section;
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
public final class PoolOwner extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PoolOwner> CREATOR;
    public final String cashtag;
    public final String customer_token;
    public final String full_name;
    public final String profile_photo_url;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public String cashtag;
        public String customer_token;
        public String full_name;
        public String profile_photo_url;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new PoolOwner(this.customer_token, this.full_name, this.profile_photo_url, this.cashtag, buildUnknownFields());
                case 1:
                    return new Preset(this.customer_token, this.full_name, this.profile_photo_url, this.cashtag, buildUnknownFields());
                case 2:
                    return new DependentDetailsEntryDialog(this.customer_token, this.full_name, this.profile_photo_url, this.cashtag, buildUnknownFields());
                case 3:
                    return new GetInlineMessageResponse.LimitsHubInlineMessage.Illustration(this.customer_token, this.full_name, this.profile_photo_url, this.cashtag, buildUnknownFields());
                case 4:
                    String str = this.customer_token;
                    if (str != null) {
                        return new GetBuyerInfoRequest(str, this.full_name, this.profile_photo_url, this.cashtag, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(str, "brand_token");
                    throw null;
                case 5:
                    return new GetEditorialResponse.ShareLinkInfo(this.customer_token, this.full_name, this.profile_photo_url, this.cashtag, buildUnknownFields());
                case 6:
                    return new GetNeighborhoodsTabContentResponse.EnrollmentIncentive.LegalConsentContent(this.customer_token, this.full_name, this.profile_photo_url, this.cashtag, buildUnknownFields());
                case 7:
                    return new ShowToast(this.customer_token, this.full_name, this.profile_photo_url, this.cashtag, buildUnknownFields());
                case 8:
                    return new BroadcasterProfileData(this.customer_token, this.full_name, this.profile_photo_url, this.cashtag, buildUnknownFields());
                case 9:
                    return new CustomerInfo(this.customer_token, this.full_name, this.profile_photo_url, this.cashtag, buildUnknownFields());
                case 10:
                    return new Payer(this.customer_token, this.full_name, this.profile_photo_url, this.cashtag, buildUnknownFields());
                case 11:
                    return new SavingsConfig.SavingsCopy(this.customer_token, this.full_name, this.profile_photo_url, this.cashtag, buildUnknownFields());
                case 12:
                    return new ChatMessage.FileBody(this.customer_token, this.full_name, this.profile_photo_url, this.cashtag, buildUnknownFields());
                case 13:
                    return new ChatMessage.SunshineFileBody(this.customer_token, this.full_name, this.profile_photo_url, this.cashtag, buildUnknownFields());
                case 14:
                    return new SuccessScreen.Card(this.customer_token, this.full_name, this.profile_photo_url, this.cashtag, buildUnknownFields());
                case 15:
                    return new GetPreSignInDataResponse.InvitationIntroData.CloseScreenDialog(this.customer_token, this.full_name, this.profile_photo_url, this.cashtag, buildUnknownFields());
                case 16:
                    return new UiCheckDeposit(this.customer_token, this.full_name, this.profile_photo_url, this.cashtag, buildUnknownFields());
                case 17:
                    return new InAppBrowserConfig.FillrConfig(this.customer_token, this.full_name, this.profile_photo_url, this.cashtag, buildUnknownFields());
                case 18:
                    return new SubmitLiteRecoveryEmailOtpBlockerRequest.ClientSignature(this.customer_token, this.full_name, this.profile_photo_url, this.cashtag, buildUnknownFields());
                case 19:
                    return new TreehouseConfig.TreehouseApp(this.customer_token, this.full_name, this.profile_photo_url, this.cashtag, buildUnknownFields());
                case 20:
                    return new EquityDiscoveryAnimationTile(this.customer_token, this.full_name, this.profile_photo_url, this.cashtag, buildUnknownFields());
                default:
                    return new Section.Row.MoreInfo(this.customer_token, this.full_name, this.profile_photo_url, this.cashtag, buildUnknownFields());
            }
        }
    }

    static {
        PoolOwner$Companion$ADAPTER$1 poolOwner$Companion$ADAPTER$1 = new PoolOwner$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PoolOwner.class), "type.googleapis.com/squareup.cash.pools.v1beta.PoolOwner", Syntax.PROTO_2, null, "squareup/cash/pools/v1beta/pools.proto");
        ADAPTER = poolOwner$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(poolOwner$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PoolOwner(String str, String str2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.customer_token = str;
        this.full_name = str2;
        this.profile_photo_url = str3;
        this.cashtag = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PoolOwner)) {
            return false;
        }
        PoolOwner poolOwner = (PoolOwner) obj;
        return Intrinsics.areEqual(unknownFields(), poolOwner.unknownFields()) && Intrinsics.areEqual(this.customer_token, poolOwner.customer_token) && Intrinsics.areEqual(this.full_name, poolOwner.full_name) && Intrinsics.areEqual(this.profile_photo_url, poolOwner.profile_photo_url) && Intrinsics.areEqual(this.cashtag, poolOwner.cashtag);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.customer_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.full_name;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.profile_photo_url;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.cashtag;
        int hashCode5 = hashCode4 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.customer_token = this.customer_token;
        builder.full_name = this.full_name;
        builder.profile_photo_url = this.profile_photo_url;
        builder.cashtag = this.cashtag;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.customer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "customer_token=", arrayList);
        }
        if (this.full_name != null) {
            arrayList.add("full_name=██");
        }
        if (this.profile_photo_url != null) {
            arrayList.add("profile_photo_url=██");
        }
        if (this.cashtag != null) {
            arrayList.add("cashtag=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PoolOwner{", "}", 0, null, null, 56);
    }
}
