package com.squareup.protos.cash.cashface.ui;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GenericProfileElement$CardElement$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GenericProfileElement.CardElement((GenericProfileElement) obj, (GenericProfileElement) obj2, (GenericProfileElement) obj3, (GenericProfileElement) obj4, (GenericProfileElement) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(GenericProfileElement.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(GenericProfileElement.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(GenericProfileElement.ADAPTER, protoReader, obj3);
            } else if (nextTag == 4) {
                obj4 = TransactorKt.decodeMessageOrMerge(GenericProfileElement.ADAPTER, protoReader, obj4);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(GenericProfileElement.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GenericProfileElement.CardElement cardElement = (GenericProfileElement.CardElement) obj;
        reverseProtoWriter.getClass();
        cardElement.getClass();
        reverseProtoWriter.writeBytes(cardElement.unknownFields());
        ProtoAdapter protoAdapter = GenericProfileElement.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, cardElement.footer);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, cardElement.subtext);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, cardElement.body);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, cardElement.title);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, cardElement.header);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GenericProfileElement.CardElement cardElement = (GenericProfileElement.CardElement) obj;
        cardElement.getClass();
        int size$okio = cardElement.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = GenericProfileElement.ADAPTER;
        return protoAdapter.encodedSizeWithTag(5, cardElement.footer) + protoAdapter.encodedSizeWithTag(4, cardElement.subtext) + protoAdapter.encodedSizeWithTag(3, cardElement.body) + protoAdapter.encodedSizeWithTag(2, cardElement.title) + protoAdapter.encodedSizeWithTag(1, cardElement.header) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GenericProfileElement.CardElement cardElement = (GenericProfileElement.CardElement) obj;
        cardElement.getClass();
        GenericProfileElement genericProfileElement = cardElement.header;
        GenericProfileElement genericProfileElement2 = genericProfileElement != null ? (GenericProfileElement) GenericProfileElement.ADAPTER.redact(genericProfileElement) : null;
        GenericProfileElement genericProfileElement3 = cardElement.title;
        GenericProfileElement genericProfileElement4 = genericProfileElement3 != null ? (GenericProfileElement) GenericProfileElement.ADAPTER.redact(genericProfileElement3) : null;
        GenericProfileElement genericProfileElement5 = cardElement.body;
        GenericProfileElement genericProfileElement6 = genericProfileElement5 != null ? (GenericProfileElement) GenericProfileElement.ADAPTER.redact(genericProfileElement5) : null;
        GenericProfileElement genericProfileElement7 = cardElement.subtext;
        GenericProfileElement genericProfileElement8 = genericProfileElement7 != null ? (GenericProfileElement) GenericProfileElement.ADAPTER.redact(genericProfileElement7) : null;
        GenericProfileElement genericProfileElement9 = cardElement.footer;
        GenericProfileElement genericProfileElement10 = genericProfileElement9 != null ? (GenericProfileElement) GenericProfileElement.ADAPTER.redact(genericProfileElement9) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GenericProfileElement.CardElement(genericProfileElement2, genericProfileElement4, genericProfileElement6, genericProfileElement8, genericProfileElement10, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GenericProfileElement.CardElement cardElement = (GenericProfileElement.CardElement) obj;
        cardElement.getClass();
        ProtoAdapter protoAdapter = GenericProfileElement.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, cardElement.header);
        protoAdapter.encodeWithTag(protoWriter, 2, cardElement.title);
        protoAdapter.encodeWithTag(protoWriter, 3, cardElement.body);
        protoAdapter.encodeWithTag(protoWriter, 4, cardElement.subtext);
        protoAdapter.encodeWithTag(protoWriter, 5, cardElement.footer);
        protoWriter.writeBytes(cardElement.unknownFields());
    }
}
