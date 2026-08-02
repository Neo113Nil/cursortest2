package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.lynx.api.v1_0.model.CardBankDetails;
import com.squareup.protos.cash.cash3dsauthentication.api.v1.ThreeDsAuthenticationRequest;
import com.squareup.protos.cash.cashsuggest.api.InAppBrowserMetadata;
import com.squareup.protos.cash.contacts.app.SocialProfile;
import com.squareup.protos.cash.local.activity.CashAppLocalOrderRenderData;
import com.squareup.protos.cash.local.client.v1.SignupOrEnrollUpsell;
import com.squareup.protos.cash.moneta.api.v1_0.SelectInstrumentRequest;
import com.squareup.protos.cash.plasma.common.DigitalWalletSelectionOption;
import com.squareup.protos.franklin.app.ActivateDigitalWalletRequest;
import com.squareup.protos.franklin.investing.resources.LearnMoreConfiguration;
import com.squareup.protos.franklin.lending.CreditLine;
import com.squareup.protos.timecards.scheduling.TeamMember;
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

/* loaded from: classes.dex */
public final class ProfileRow extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ProfileRow> CREATOR;
    public final String call_to_action;
    public final String client_route;
    public final String icon_id;
    public final String subtitle;
    public final String title;

    /* loaded from: classes7.dex */
    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public String call_to_action;
        public String client_route;
        public String icon_id;
        public String subtitle;
        public String title;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new ProfileRow(this.client_route, this.icon_id, this.title, this.subtitle, this.call_to_action, buildUnknownFields());
                case 1:
                    return new CardBankDetails(this.client_route, this.icon_id, this.title, this.subtitle, this.call_to_action, buildUnknownFields());
                case 2:
                    return new ThreeDsAuthenticationRequest.SdkInfo(this.client_route, this.icon_id, this.title, this.subtitle, this.call_to_action, buildUnknownFields());
                case 3:
                    return new InAppBrowserMetadata.EntityInformation(this.client_route, this.icon_id, this.title, this.subtitle, this.call_to_action, buildUnknownFields());
                case 4:
                    return new SocialProfile(this.client_route, this.icon_id, this.title, this.subtitle, this.call_to_action, buildUnknownFields());
                case 5:
                    return new CashAppLocalOrderRenderData.Actions(this.client_route, this.icon_id, this.title, this.subtitle, this.call_to_action, buildUnknownFields());
                case 6:
                    return new SignupOrEnrollUpsell(this.client_route, this.icon_id, this.title, this.subtitle, this.call_to_action, buildUnknownFields());
                case 7:
                    return new SelectInstrumentRequest.ApplePayPayload.Header(this.client_route, this.icon_id, this.title, this.subtitle, this.call_to_action, buildUnknownFields());
                case 8:
                    return new DigitalWalletSelectionOption.ApplePayPayload.Header(this.client_route, this.icon_id, this.title, this.subtitle, this.call_to_action, buildUnknownFields());
                case 9:
                    return new ActivateDigitalWalletRequest.DigitalWalletCardData(this.client_route, this.icon_id, this.title, this.subtitle, this.call_to_action, buildUnknownFields());
                case 10:
                    return new ConfirmationSheetData(this.client_route, this.icon_id, this.title, this.subtitle, this.call_to_action, buildUnknownFields());
                case 11:
                    return new LearnMoreConfiguration(this.client_route, this.icon_id, this.title, this.subtitle, this.call_to_action, buildUnknownFields());
                case 12:
                    return new CreditLine.FirstTimeBorrowData.PromoContent(this.client_route, this.icon_id, this.title, this.subtitle, this.call_to_action, buildUnknownFields());
                default:
                    return new TeamMember(this.client_route, this.icon_id, this.title, this.subtitle, this.call_to_action, buildUnknownFields());
            }
        }
    }

    static {
        ProfileRow$Companion$ADAPTER$1 profileRow$Companion$ADAPTER$1 = new ProfileRow$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ProfileRow.class), "type.googleapis.com/squareup.franklin.common.ProfileRow", Syntax.PROTO_2, null, "squareup/franklin/common/reward_status.proto");
        ADAPTER = profileRow$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(profileRow$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileRow(String str, String str2, String str3, String str4, String str5, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.client_route = str;
        this.icon_id = str2;
        this.title = str3;
        this.subtitle = str4;
        this.call_to_action = str5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProfileRow)) {
            return false;
        }
        ProfileRow profileRow = (ProfileRow) obj;
        return Intrinsics.areEqual(unknownFields(), profileRow.unknownFields()) && Intrinsics.areEqual(this.client_route, profileRow.client_route) && Intrinsics.areEqual(this.icon_id, profileRow.icon_id) && Intrinsics.areEqual(this.title, profileRow.title) && Intrinsics.areEqual(this.subtitle, profileRow.subtitle) && Intrinsics.areEqual(this.call_to_action, profileRow.call_to_action);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.client_route;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.icon_id;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.title;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.subtitle;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.call_to_action;
        int hashCode6 = hashCode5 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.client_route = this.client_route;
        builder.icon_id = this.icon_id;
        builder.title = this.title;
        builder.subtitle = this.subtitle;
        builder.call_to_action = this.call_to_action;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.client_route;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "client_route=", arrayList);
        }
        String str2 = this.icon_id;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "icon_id=", arrayList);
        }
        String str3 = this.title;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "title=", arrayList);
        }
        String str4 = this.subtitle;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "subtitle=", arrayList);
        }
        String str5 = this.call_to_action;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "call_to_action=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ProfileRow{", "}", 0, null, null, 56);
    }
}
