package com.squareup.protos.cash.local.client.app.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.discover.api.app.v1.model.Text;
import com.squareup.protos.cash.local.client.v1.LocalImage;
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
public final class MarketScreenInformationalContent extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<MarketScreenInformationalContent> CREATOR;
    public final String body;
    public final String button_client_route;
    public final String button_text;
    public final LocalImage image;
    public final String title;

    static {
        MarketScreenInformationalContent$Companion$ADAPTER$1 marketScreenInformationalContent$Companion$ADAPTER$1 = new MarketScreenInformationalContent$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(MarketScreenInformationalContent.class), "type.googleapis.com/squareup.cash.local.client.app.v1.MarketScreenInformationalContent", Syntax.PROTO_2, null, "squareup/cash/local/client/app/v1/model.proto");
        ADAPTER = marketScreenInformationalContent$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(marketScreenInformationalContent$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketScreenInformationalContent(String str, String str2, String str3, String str4, LocalImage localImage, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.title = str;
        this.body = str2;
        this.button_text = str3;
        this.button_client_route = str4;
        this.image = localImage;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MarketScreenInformationalContent)) {
            return false;
        }
        MarketScreenInformationalContent marketScreenInformationalContent = (MarketScreenInformationalContent) obj;
        return Intrinsics.areEqual(unknownFields(), marketScreenInformationalContent.unknownFields()) && Intrinsics.areEqual(this.title, marketScreenInformationalContent.title) && Intrinsics.areEqual(this.body, marketScreenInformationalContent.body) && Intrinsics.areEqual(this.button_text, marketScreenInformationalContent.button_text) && Intrinsics.areEqual(this.button_client_route, marketScreenInformationalContent.button_client_route) && Intrinsics.areEqual(this.image, marketScreenInformationalContent.image);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.title;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.body;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.button_text;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.button_client_route;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        LocalImage localImage = this.image;
        int hashCode6 = hashCode5 + (localImage != null ? localImage.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Text.Builder builder = new Text.Builder(25);
        builder.text = this.title;
        builder.text_style = this.body;
        builder.text_decoration = this.button_text;
        builder.text_color = this.button_client_route;
        builder.icon = this.image;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
        }
        String str2 = this.body;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "body=", arrayList);
        }
        String str3 = this.button_text;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "button_text=", arrayList);
        }
        String str4 = this.button_client_route;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "button_client_route=", arrayList);
        }
        LocalImage localImage = this.image;
        if (localImage != null) {
            SizeMode$EnumUnboxingLocalUtility.m("image=", localImage, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MarketScreenInformationalContent{", "}", 0, null, null, 56);
    }
}
