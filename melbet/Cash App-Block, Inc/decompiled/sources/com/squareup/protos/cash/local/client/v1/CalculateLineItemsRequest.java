package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.LocalCart;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class CalculateLineItemsRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CalculateLineItemsRequest> CREATOR;
    public final String brand_token;
    public final List cart_line_selections;
    public final List discount_codes;
    public final LocalFulfillment fulfillment;
    public final String location_token;

    /* loaded from: classes7.dex */
    public final class Builder extends Message.Builder {
        public String brand_token;
        public List cart_line_selections;
        public List discount_codes;
        public LocalFulfillment fulfillment;
        public String location_token;

        public Builder() {
            EmptyList emptyList = EmptyList.INSTANCE;
            this.cart_line_selections = emptyList;
            this.discount_codes = emptyList;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            return new CalculateLineItemsRequest(this.brand_token, this.location_token, this.cart_line_selections, this.fulfillment, this.discount_codes, buildUnknownFields());
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CalculateLineItemsRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.local.client.v1.CalculateLineItemsRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                ArrayList arrayList = new ArrayList();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new CalculateLineItemsRequest((String) obj, (String) obj2, m, (LocalFulfillment) obj3, arrayList, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        m.add(LocalCart.Line.Selection.ADAPTER.decode(protoReader));
                    } else if (nextTag == 4) {
                        obj3 = TransactorKt.decodeMessageOrMerge(LocalFulfillment.ADAPTER, protoReader, obj3);
                    } else if (nextTag != 5) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        arrayList.add(ProtoAdapter.STRING.decode(protoReader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                CalculateLineItemsRequest calculateLineItemsRequest = (CalculateLineItemsRequest) obj;
                reverseProtoWriter.getClass();
                calculateLineItemsRequest.getClass();
                reverseProtoWriter.writeBytes(calculateLineItemsRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 5, calculateLineItemsRequest.discount_codes);
                LocalFulfillment.ADAPTER.encodeWithTag(reverseProtoWriter, 4, calculateLineItemsRequest.fulfillment);
                LocalCart.Line.Selection.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, calculateLineItemsRequest.cart_line_selections);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, calculateLineItemsRequest.location_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, calculateLineItemsRequest.brand_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                CalculateLineItemsRequest calculateLineItemsRequest = (CalculateLineItemsRequest) obj;
                calculateLineItemsRequest.getClass();
                int size$okio = calculateLineItemsRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.asRepeated().encodedSizeWithTag(5, calculateLineItemsRequest.discount_codes) + LocalFulfillment.ADAPTER.encodedSizeWithTag(4, calculateLineItemsRequest.fulfillment) + LocalCart.Line.Selection.ADAPTER.asRepeated().encodedSizeWithTag(3, calculateLineItemsRequest.cart_line_selections) + protoAdapter2.encodedSizeWithTag(2, calculateLineItemsRequest.location_token) + protoAdapter2.encodedSizeWithTag(1, calculateLineItemsRequest.brand_token) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                CalculateLineItemsRequest calculateLineItemsRequest = (CalculateLineItemsRequest) obj;
                calculateLineItemsRequest.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(calculateLineItemsRequest.cart_line_selections, LocalCart.Line.Selection.ADAPTER);
                LocalFulfillment localFulfillment = calculateLineItemsRequest.fulfillment;
                LocalFulfillment localFulfillment2 = localFulfillment != null ? (LocalFulfillment) LocalFulfillment.ADAPTER.redact(localFulfillment) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = calculateLineItemsRequest.brand_token;
                String str2 = calculateLineItemsRequest.location_token;
                List list = calculateLineItemsRequest.discount_codes;
                list.getClass();
                byteString.getClass();
                return new CalculateLineItemsRequest(str, str2, m1169redactElements, localFulfillment2, list, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                CalculateLineItemsRequest calculateLineItemsRequest = (CalculateLineItemsRequest) obj;
                calculateLineItemsRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, calculateLineItemsRequest.brand_token);
                protoAdapter2.encodeWithTag(protoWriter, 2, calculateLineItemsRequest.location_token);
                LocalCart.Line.Selection.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, calculateLineItemsRequest.cart_line_selections);
                LocalFulfillment.ADAPTER.encodeWithTag(protoWriter, 4, calculateLineItemsRequest.fulfillment);
                protoAdapter2.asRepeated().encodeWithTag(protoWriter, 5, calculateLineItemsRequest.discount_codes);
                protoWriter.writeBytes(calculateLineItemsRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalculateLineItemsRequest(String str, String str2, List list, LocalFulfillment localFulfillment, List list2, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.brand_token = str;
        this.location_token = str2;
        this.fulfillment = localFulfillment;
        this.cart_line_selections = TransactorKt.immutableCopyOf("cart_line_selections", list);
        this.discount_codes = TransactorKt.immutableCopyOf("discount_codes", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CalculateLineItemsRequest)) {
            return false;
        }
        CalculateLineItemsRequest calculateLineItemsRequest = (CalculateLineItemsRequest) obj;
        return Intrinsics.areEqual(unknownFields(), calculateLineItemsRequest.unknownFields()) && Intrinsics.areEqual(this.brand_token, calculateLineItemsRequest.brand_token) && Intrinsics.areEqual(this.location_token, calculateLineItemsRequest.location_token) && Intrinsics.areEqual(this.cart_line_selections, calculateLineItemsRequest.cart_line_selections) && Intrinsics.areEqual(this.fulfillment, calculateLineItemsRequest.fulfillment) && Intrinsics.areEqual(this.discount_codes, calculateLineItemsRequest.discount_codes);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.brand_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.location_token;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37, 37, this.cart_line_selections);
        LocalFulfillment localFulfillment = this.fulfillment;
        int hashCode3 = this.discount_codes.hashCode() + ((m + (localFulfillment != null ? localFulfillment.hashCode() : 0)) * 37);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.brand_token = this.brand_token;
        builder.location_token = this.location_token;
        builder.cart_line_selections = this.cart_line_selections;
        builder.fulfillment = this.fulfillment;
        builder.discount_codes = this.discount_codes;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.brand_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "brand_token=", arrayList);
        }
        String str2 = this.location_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "location_token=", arrayList);
        }
        List list = this.cart_line_selections;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("cart_line_selections=", arrayList, list);
        }
        LocalFulfillment localFulfillment = this.fulfillment;
        if (localFulfillment != null) {
            arrayList.add("fulfillment=" + localFulfillment);
        }
        List list2 = this.discount_codes;
        if (!list2.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("discount_codes=", arrayList, list2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CalculateLineItemsRequest{", "}", 0, null, null, 56);
    }
}
