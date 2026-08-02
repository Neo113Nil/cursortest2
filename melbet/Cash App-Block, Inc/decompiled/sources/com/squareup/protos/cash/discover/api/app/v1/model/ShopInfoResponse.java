package com.squareup.protos.cash.discover.api.app.v1.model;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.decode.ImageSourceKt;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.lending.PrepurchaseCashCardAppletData;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ShopInfoResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ShopInfoResponse> CREATOR;
    public final Button action_button;
    public final List bullets;
    public final ImageSourceKt content;
    public final DisplayCriteria display_criteria;
    public final Text footer;
    public final HorizontalAlignment image_horizontal_alignment;
    public final Integer image_max_px_height;
    public final Text subtitle;
    public final Text title;

    static {
        ShopInfoResponse$Companion$ADAPTER$1 shopInfoResponse$Companion$ADAPTER$1 = new ShopInfoResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ShopInfoResponse.class), "type.googleapis.com/squareup.cash.discover.api.app.v1.model.ShopInfoResponse", Syntax.PROTO_2, null, "squareup/cash/discover/api/app/v1/model/shop_info.proto");
        ADAPTER = shopInfoResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(shopInfoResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopInfoResponse(ImageSourceKt imageSourceKt, Integer num, HorizontalAlignment horizontalAlignment, Text text, Text text2, List list, Button button, Text text3, DisplayCriteria displayCriteria, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.content = imageSourceKt;
        this.image_max_px_height = num;
        this.image_horizontal_alignment = horizontalAlignment;
        this.title = text;
        this.subtitle = text2;
        this.action_button = button;
        this.footer = text3;
        this.display_criteria = displayCriteria;
        this.bullets = TransactorKt.immutableCopyOf("bullets", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ShopInfoResponse)) {
            return false;
        }
        ShopInfoResponse shopInfoResponse = (ShopInfoResponse) obj;
        return Intrinsics.areEqual(unknownFields(), shopInfoResponse.unknownFields()) && Intrinsics.areEqual(this.content, shopInfoResponse.content) && Intrinsics.areEqual(this.image_max_px_height, shopInfoResponse.image_max_px_height) && this.image_horizontal_alignment == shopInfoResponse.image_horizontal_alignment && Intrinsics.areEqual(this.title, shopInfoResponse.title) && Intrinsics.areEqual(this.subtitle, shopInfoResponse.subtitle) && Intrinsics.areEqual(this.bullets, shopInfoResponse.bullets) && Intrinsics.areEqual(this.action_button, shopInfoResponse.action_button) && Intrinsics.areEqual(this.footer, shopInfoResponse.footer) && this.display_criteria == shopInfoResponse.display_criteria;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ImageSourceKt imageSourceKt = this.content;
        int hashCode2 = (hashCode + (imageSourceKt != null ? imageSourceKt.hashCode() : 0)) * 37;
        Integer num = this.image_max_px_height;
        int hashCode3 = (hashCode2 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        HorizontalAlignment horizontalAlignment = this.image_horizontal_alignment;
        int hashCode4 = (hashCode3 + (horizontalAlignment != null ? horizontalAlignment.hashCode() : 0)) * 37;
        Text text = this.title;
        int hashCode5 = (hashCode4 + (text != null ? text.hashCode() : 0)) * 37;
        Text text2 = this.subtitle;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode5 + (text2 != null ? text2.hashCode() : 0)) * 37, 37, this.bullets);
        Button button = this.action_button;
        int hashCode6 = (m + (button != null ? button.hashCode() : 0)) * 37;
        Text text3 = this.footer;
        int hashCode7 = (hashCode6 + (text3 != null ? text3.hashCode() : 0)) * 37;
        DisplayCriteria displayCriteria = this.display_criteria;
        int hashCode8 = hashCode7 + (displayCriteria != null ? displayCriteria.hashCode() : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        PrepurchaseCashCardAppletData.Builder builder = new PrepurchaseCashCardAppletData.Builder(16, false);
        builder.locale = this.content;
        builder.title = this.image_max_px_height;
        builder.info_rows_header = this.image_horizontal_alignment;
        builder.footer_text = this.title;
        builder.loadable_subtitle = this.subtitle;
        builder.info_rows = this.bullets;
        builder.primary_footer_button_state = this.action_button;
        builder.secondary_footer_button_state = this.footer;
        builder.payment_plans_data = this.display_criteria;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ImageSourceKt imageSourceKt = this.content;
        if (imageSourceKt != null) {
            arrayList.add("content=" + imageSourceKt);
        }
        Integer num = this.image_max_px_height;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("image_max_px_height=", num, arrayList);
        }
        HorizontalAlignment horizontalAlignment = this.image_horizontal_alignment;
        if (horizontalAlignment != null) {
            arrayList.add("image_horizontal_alignment=" + horizontalAlignment);
        }
        Text text = this.title;
        if (text != null) {
            SizeMode$EnumUnboxingLocalUtility.m("title=", text, arrayList);
        }
        Text text2 = this.subtitle;
        if (text2 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("subtitle=", text2, arrayList);
        }
        List list = this.bullets;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("bullets=", arrayList, list);
        }
        Button button = this.action_button;
        if (button != null) {
            arrayList.add("action_button=" + button);
        }
        Text text3 = this.footer;
        if (text3 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("footer=", text3, arrayList);
        }
        DisplayCriteria displayCriteria = this.display_criteria;
        if (displayCriteria != null) {
            arrayList.add("display_criteria=" + displayCriteria);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ShopInfoResponse{", "}", 0, null, null, 56);
    }
}
