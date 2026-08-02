package com.squareup.protos.cash.cashapproxy.api;

import android.os.Parcelable;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.api.Error;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
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
public final class SingleUsePaymentSummary extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SingleUsePaymentSummary> CREATOR;
    public final Text footer_text;
    public final Image image;
    public final Money limit;
    public final Text subtitle;
    public final Text title;
    public final Money usage;

    static {
        SingleUsePaymentSummary$Companion$ADAPTER$1 singleUsePaymentSummary$Companion$ADAPTER$1 = new SingleUsePaymentSummary$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SingleUsePaymentSummary.class), "type.googleapis.com/squareup.cash.cashapproxy.api.v1.SingleUsePaymentSummary", Syntax.PROTO_2, null, "squareup/cash/cashapproxy/api/v1/order_details.proto");
        ADAPTER = singleUsePaymentSummary$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(singleUsePaymentSummary$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleUsePaymentSummary(Text text, Money money, Money money2, Text text2, Text text3, Image image, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.title = text;
        this.usage = money;
        this.limit = money2;
        this.subtitle = text2;
        this.footer_text = text3;
        this.image = image;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SingleUsePaymentSummary)) {
            return false;
        }
        SingleUsePaymentSummary singleUsePaymentSummary = (SingleUsePaymentSummary) obj;
        return Intrinsics.areEqual(unknownFields(), singleUsePaymentSummary.unknownFields()) && Intrinsics.areEqual(this.title, singleUsePaymentSummary.title) && Intrinsics.areEqual(this.usage, singleUsePaymentSummary.usage) && Intrinsics.areEqual(this.limit, singleUsePaymentSummary.limit) && Intrinsics.areEqual(this.subtitle, singleUsePaymentSummary.subtitle) && Intrinsics.areEqual(this.footer_text, singleUsePaymentSummary.footer_text) && Intrinsics.areEqual(this.image, singleUsePaymentSummary.image);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Text text = this.title;
        int hashCode2 = (hashCode + (text != null ? text.hashCode() : 0)) * 37;
        Money money = this.usage;
        int hashCode3 = (hashCode2 + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.limit;
        int hashCode4 = (hashCode3 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Text text2 = this.subtitle;
        int hashCode5 = (hashCode4 + (text2 != null ? text2.hashCode() : 0)) * 37;
        Text text3 = this.footer_text;
        int hashCode6 = (hashCode5 + (text3 != null ? text3.hashCode() : 0)) * 37;
        Image image = this.image;
        int hashCode7 = hashCode6 + (image != null ? image.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Error.Builder builder = new Error.Builder(14, false);
        builder.category = this.title;
        builder.code = this.usage;
        builder.description = this.limit;
        builder.field = this.subtitle;
        builder.retryable = this.footer_text;
        builder.metadata = this.image;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Text text = this.title;
        if (text != null) {
            SizeMode$EnumUnboxingLocalUtility.m("title=", text, arrayList);
        }
        if (this.usage != null) {
            arrayList.add("usage=██");
        }
        if (this.limit != null) {
            arrayList.add("limit=██");
        }
        Text text2 = this.subtitle;
        if (text2 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("subtitle=", text2, arrayList);
        }
        Text text3 = this.footer_text;
        if (text3 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("footer_text=", text3, arrayList);
        }
        Image image = this.image;
        if (image != null) {
            SizeMode$EnumUnboxingLocalUtility.m("image=", image, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SingleUsePaymentSummary{", "}", 0, null, null, 56);
    }
}
