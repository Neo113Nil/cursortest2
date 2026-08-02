package com.squareup.protos.cash.grantly.api;

import android.os.Parcelable;
import com.squareup.protos.cash.favorites.Favorite;
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
public final class DeliveryInstructions extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DeliveryInstructions> CREATOR;
    public final String note;

    static {
        DeliveryInstructions$Companion$ADAPTER$1 deliveryInstructions$Companion$ADAPTER$1 = new DeliveryInstructions$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DeliveryInstructions.class), "type.googleapis.com/squareup.cash.grantly.api.DeliveryInstructions", Syntax.PROTO_2, null, "squareup/cash/grantly/api/shipping_address.proto");
        ADAPTER = deliveryInstructions$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(deliveryInstructions$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryInstructions(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.note = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DeliveryInstructions)) {
            return false;
        }
        DeliveryInstructions deliveryInstructions = (DeliveryInstructions) obj;
        return Intrinsics.areEqual(unknownFields(), deliveryInstructions.unknownFields()) && Intrinsics.areEqual(this.note, deliveryInstructions.note);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.note;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Favorite.Builder builder = new Favorite.Builder(15);
        builder.favorite_customer_token = this.note;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.note != null) {
            arrayList.add("note=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DeliveryInstructions{", "}", 0, null, null, 56);
    }
}
