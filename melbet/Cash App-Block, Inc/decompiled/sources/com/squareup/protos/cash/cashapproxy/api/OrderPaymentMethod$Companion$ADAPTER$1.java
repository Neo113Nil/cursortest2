package com.squareup.protos.cash.cashapproxy.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class OrderPaymentMethod$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new OrderPaymentMethod((Image) obj, (Text) obj2, (Text) obj3, (Text) obj4, (Text) obj5, (String) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        OrderPaymentMethod orderPaymentMethod = (OrderPaymentMethod) obj;
        reverseProtoWriter.getClass();
        orderPaymentMethod.getClass();
        reverseProtoWriter.writeBytes(orderPaymentMethod.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 6, orderPaymentMethod.payment_method_id);
        ProtoAdapter protoAdapter = Text.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, orderPaymentMethod.extra_info_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, orderPaymentMethod.extra_info_title);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, orderPaymentMethod.method_details);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, orderPaymentMethod.method_name);
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 1, orderPaymentMethod.image);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        OrderPaymentMethod orderPaymentMethod = (OrderPaymentMethod) obj;
        orderPaymentMethod.getClass();
        int encodedSizeWithTag = Image.ADAPTER.encodedSizeWithTag(1, orderPaymentMethod.image) + orderPaymentMethod.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Text.ADAPTER;
        return ProtoAdapter.STRING.encodedSizeWithTag(6, orderPaymentMethod.payment_method_id) + protoAdapter.encodedSizeWithTag(5, orderPaymentMethod.extra_info_text) + protoAdapter.encodedSizeWithTag(4, orderPaymentMethod.extra_info_title) + protoAdapter.encodedSizeWithTag(3, orderPaymentMethod.method_details) + protoAdapter.encodedSizeWithTag(2, orderPaymentMethod.method_name) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        OrderPaymentMethod orderPaymentMethod = (OrderPaymentMethod) obj;
        orderPaymentMethod.getClass();
        Image image = orderPaymentMethod.image;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        Text text = orderPaymentMethod.method_name;
        Text text2 = text != null ? (Text) Text.ADAPTER.redact(text) : null;
        Text text3 = orderPaymentMethod.method_details;
        Text text4 = text3 != null ? (Text) Text.ADAPTER.redact(text3) : null;
        Text text5 = orderPaymentMethod.extra_info_title;
        Text text6 = text5 != null ? (Text) Text.ADAPTER.redact(text5) : null;
        Text text7 = orderPaymentMethod.extra_info_text;
        Text text8 = text7 != null ? (Text) Text.ADAPTER.redact(text7) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = orderPaymentMethod.payment_method_id;
        byteString.getClass();
        return new OrderPaymentMethod(image2, text2, text4, text6, text8, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OrderPaymentMethod orderPaymentMethod = (OrderPaymentMethod) obj;
        orderPaymentMethod.getClass();
        Image.ADAPTER.encodeWithTag(protoWriter, 1, orderPaymentMethod.image);
        ProtoAdapter protoAdapter = Text.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, orderPaymentMethod.method_name);
        protoAdapter.encodeWithTag(protoWriter, 3, orderPaymentMethod.method_details);
        protoAdapter.encodeWithTag(protoWriter, 4, orderPaymentMethod.extra_info_title);
        protoAdapter.encodeWithTag(protoWriter, 5, orderPaymentMethod.extra_info_text);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, orderPaymentMethod.payment_method_id);
        protoWriter.writeBytes(orderPaymentMethod.unknownFields());
    }
}
