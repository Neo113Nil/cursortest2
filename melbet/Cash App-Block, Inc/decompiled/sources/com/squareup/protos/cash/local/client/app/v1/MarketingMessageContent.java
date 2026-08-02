package com.squareup.protos.cash.local.client.app.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.discover.api.app.v1.model.Text;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.cash.local.client.v1.Offer;
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
public final class MarketingMessageContent extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<MarketingMessageContent> CREATOR;
    public final LocalImage image;
    public final String image_url;
    public final Offer offer;
    public final String subtitle;
    public final String title;

    static {
        MarketingMessageContent$Companion$ADAPTER$1 marketingMessageContent$Companion$ADAPTER$1 = new MarketingMessageContent$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(MarketingMessageContent.class), "type.googleapis.com/squareup.cash.local.client.app.v1.MarketingMessageContent", Syntax.PROTO_2, null, "squareup/cash/local/client/app/v1/cash_app_local_client_app_service.proto");
        ADAPTER = marketingMessageContent$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(marketingMessageContent$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketingMessageContent(String str, String str2, String str3, LocalImage localImage, Offer offer, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.title = str;
        this.subtitle = str2;
        this.image_url = str3;
        this.image = localImage;
        this.offer = offer;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MarketingMessageContent)) {
            return false;
        }
        MarketingMessageContent marketingMessageContent = (MarketingMessageContent) obj;
        return Intrinsics.areEqual(unknownFields(), marketingMessageContent.unknownFields()) && Intrinsics.areEqual(this.title, marketingMessageContent.title) && Intrinsics.areEqual(this.subtitle, marketingMessageContent.subtitle) && Intrinsics.areEqual(this.image_url, marketingMessageContent.image_url) && Intrinsics.areEqual(this.image, marketingMessageContent.image) && Intrinsics.areEqual(this.offer, marketingMessageContent.offer);
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
        String str3 = this.image_url;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        LocalImage localImage = this.image;
        int hashCode5 = (hashCode4 + (localImage != null ? localImage.hashCode() : 0)) * 37;
        Offer offer = this.offer;
        int hashCode6 = hashCode5 + (offer != null ? offer.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Text.Builder builder = new Text.Builder(26);
        builder.text = this.title;
        builder.text_style = this.subtitle;
        builder.text_decoration = this.image_url;
        builder.text_color = this.image;
        builder.icon = this.offer;
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
        String str3 = this.image_url;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "image_url=", arrayList);
        }
        LocalImage localImage = this.image;
        if (localImage != null) {
            SizeMode$EnumUnboxingLocalUtility.m("image=", localImage, arrayList);
        }
        Offer offer = this.offer;
        if (offer != null) {
            arrayList.add("offer=" + offer);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MarketingMessageContent{", "}", 0, null, null, 56);
    }
}
