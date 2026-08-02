package com.squareup.protos.cash.cashapproxy.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.api.Error;
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
public final class OrderPaymentMethod extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<OrderPaymentMethod> CREATOR;
    public final Text extra_info_text;
    public final Text extra_info_title;
    public final Image image;
    public final Text method_details;
    public final Text method_name;
    public final String payment_method_id;

    static {
        OrderPaymentMethod$Companion$ADAPTER$1 orderPaymentMethod$Companion$ADAPTER$1 = new OrderPaymentMethod$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OrderPaymentMethod.class), "type.googleapis.com/squareup.cash.cashapproxy.api.v1.OrderPaymentMethod", Syntax.PROTO_2, null, "squareup/cash/cashapproxy/api/v1/order_details.proto");
        ADAPTER = orderPaymentMethod$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(orderPaymentMethod$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderPaymentMethod(Image image, Text text, Text text2, Text text3, Text text4, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.image = image;
        this.method_name = text;
        this.method_details = text2;
        this.extra_info_title = text3;
        this.extra_info_text = text4;
        this.payment_method_id = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OrderPaymentMethod)) {
            return false;
        }
        OrderPaymentMethod orderPaymentMethod = (OrderPaymentMethod) obj;
        return Intrinsics.areEqual(unknownFields(), orderPaymentMethod.unknownFields()) && Intrinsics.areEqual(this.image, orderPaymentMethod.image) && Intrinsics.areEqual(this.method_name, orderPaymentMethod.method_name) && Intrinsics.areEqual(this.method_details, orderPaymentMethod.method_details) && Intrinsics.areEqual(this.extra_info_title, orderPaymentMethod.extra_info_title) && Intrinsics.areEqual(this.extra_info_text, orderPaymentMethod.extra_info_text) && Intrinsics.areEqual(this.payment_method_id, orderPaymentMethod.payment_method_id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Image image = this.image;
        int hashCode2 = (hashCode + (image != null ? image.hashCode() : 0)) * 37;
        Text text = this.method_name;
        int hashCode3 = (hashCode2 + (text != null ? text.hashCode() : 0)) * 37;
        Text text2 = this.method_details;
        int hashCode4 = (hashCode3 + (text2 != null ? text2.hashCode() : 0)) * 37;
        Text text3 = this.extra_info_title;
        int hashCode5 = (hashCode4 + (text3 != null ? text3.hashCode() : 0)) * 37;
        Text text4 = this.extra_info_text;
        int hashCode6 = (hashCode5 + (text4 != null ? text4.hashCode() : 0)) * 37;
        String str = this.payment_method_id;
        int hashCode7 = hashCode6 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Error.Builder builder = new Error.Builder(13, false);
        builder.category = this.image;
        builder.code = this.method_name;
        builder.field = this.method_details;
        builder.retryable = this.extra_info_title;
        builder.metadata = this.extra_info_text;
        builder.description = this.payment_method_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Image image = this.image;
        if (image != null) {
            SizeMode$EnumUnboxingLocalUtility.m("image=", image, arrayList);
        }
        Text text = this.method_name;
        if (text != null) {
            SizeMode$EnumUnboxingLocalUtility.m("method_name=", text, arrayList);
        }
        Text text2 = this.method_details;
        if (text2 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("method_details=", text2, arrayList);
        }
        Text text3 = this.extra_info_title;
        if (text3 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("extra_info_title=", text3, arrayList);
        }
        Text text4 = this.extra_info_text;
        if (text4 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("extra_info_text=", text4, arrayList);
        }
        String str = this.payment_method_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "payment_method_id=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OrderPaymentMethod{", "}", 0, null, null, 56);
    }
}
