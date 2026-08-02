package com.squareup.protos.franklin.lending;

import com.squareup.protos.franklin.lending.CreditLine;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CreditLine$FirstTimeBorrowData$PromoContent$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new CreditLine.FirstTimeBorrowData.PromoContent((String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CreditLine.FirstTimeBorrowData.PromoContent promoContent = (CreditLine.FirstTimeBorrowData.PromoContent) obj;
        reverseProtoWriter.getClass();
        promoContent.getClass();
        reverseProtoWriter.writeBytes(promoContent.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, promoContent.button_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, promoContent.button_support_node);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, promoContent.button_title);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, promoContent.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, promoContent.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CreditLine.FirstTimeBorrowData.PromoContent promoContent = (CreditLine.FirstTimeBorrowData.PromoContent) obj;
        promoContent.getClass();
        int size$okio = promoContent.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(5, promoContent.button_url) + protoAdapter.encodedSizeWithTag(4, promoContent.button_support_node) + protoAdapter.encodedSizeWithTag(3, promoContent.button_title) + protoAdapter.encodedSizeWithTag(2, promoContent.subtitle) + protoAdapter.encodedSizeWithTag(1, promoContent.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CreditLine.FirstTimeBorrowData.PromoContent promoContent = (CreditLine.FirstTimeBorrowData.PromoContent) obj;
        promoContent.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = promoContent.title;
        String str2 = promoContent.subtitle;
        String str3 = promoContent.button_title;
        String str4 = promoContent.button_support_node;
        String str5 = promoContent.button_url;
        byteString.getClass();
        return new CreditLine.FirstTimeBorrowData.PromoContent(str, str2, str3, str4, str5, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CreditLine.FirstTimeBorrowData.PromoContent promoContent = (CreditLine.FirstTimeBorrowData.PromoContent) obj;
        promoContent.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, promoContent.title);
        protoAdapter.encodeWithTag(protoWriter, 2, promoContent.subtitle);
        protoAdapter.encodeWithTag(protoWriter, 3, promoContent.button_title);
        protoAdapter.encodeWithTag(protoWriter, 4, promoContent.button_support_node);
        protoAdapter.encodeWithTag(protoWriter, 5, promoContent.button_url);
        protoWriter.writeBytes(promoContent.unknownFields());
    }
}
