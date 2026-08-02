package com.squareup.protos.cash.referly.api.incentives.client;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.pools.PoolParticipant;
import com.squareup.protos.cash.ui.Image;
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
public final class AvailablePromotion extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AvailablePromotion> CREATOR;
    public final String action_url;
    public final String call_to_action_text;
    public final String campaign_token;
    public final String campaign_variant_token;
    public final Image image;
    public final String subtitle;
    public final String title;

    static {
        AvailablePromotion$Companion$ADAPTER$1 availablePromotion$Companion$ADAPTER$1 = new AvailablePromotion$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AvailablePromotion.class), "type.googleapis.com/squareup.cash.referly.api.incentives.client.AvailablePromotion", Syntax.PROTO_2, null, "squareup/cash/referly/api/incentives/client/GetPromotionsHomeDataAPI.proto");
        ADAPTER = availablePromotion$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(availablePromotion$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvailablePromotion(String str, String str2, String str3, String str4, Image image, String str5, String str6, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.title = str;
        this.subtitle = str2;
        this.call_to_action_text = str3;
        this.action_url = str4;
        this.image = image;
        this.campaign_token = str5;
        this.campaign_variant_token = str6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AvailablePromotion)) {
            return false;
        }
        AvailablePromotion availablePromotion = (AvailablePromotion) obj;
        return Intrinsics.areEqual(unknownFields(), availablePromotion.unknownFields()) && Intrinsics.areEqual(this.title, availablePromotion.title) && Intrinsics.areEqual(this.subtitle, availablePromotion.subtitle) && Intrinsics.areEqual(this.call_to_action_text, availablePromotion.call_to_action_text) && Intrinsics.areEqual(this.action_url, availablePromotion.action_url) && Intrinsics.areEqual(this.image, availablePromotion.image) && Intrinsics.areEqual(this.campaign_token, availablePromotion.campaign_token) && Intrinsics.areEqual(this.campaign_variant_token, availablePromotion.campaign_variant_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.title;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.subtitle;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.call_to_action_text;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.action_url;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Image image = this.image;
        int hashCode6 = (hashCode5 + (image != null ? image.hashCode() : 0)) * 37;
        String str5 = this.campaign_token;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.campaign_variant_token;
        int hashCode8 = hashCode7 + (str6 != null ? str6.hashCode() : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        PoolParticipant.Builder builder = new PoolParticipant.Builder(16);
        builder.customer_identifier = this.title;
        builder.full_name = this.subtitle;
        builder.profile_photo_url = this.call_to_action_text;
        builder.cashtag = this.action_url;
        builder.added_at = this.image;
        builder.participant_type = this.campaign_token;
        builder.aggregated_contribution_amount = this.campaign_variant_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
        }
        String str2 = this.subtitle;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "subtitle=", arrayList);
        }
        String str3 = this.call_to_action_text;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "call_to_action_text=", arrayList);
        }
        String str4 = this.action_url;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "action_url=", arrayList);
        }
        Image image = this.image;
        if (image != null) {
            SizeMode$EnumUnboxingLocalUtility.m("image=", image, arrayList);
        }
        String str5 = this.campaign_token;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "campaign_token=", arrayList);
        }
        String str6 = this.campaign_variant_token;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "campaign_variant_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AvailablePromotion{", "}", 0, null, null, 56);
    }
}
