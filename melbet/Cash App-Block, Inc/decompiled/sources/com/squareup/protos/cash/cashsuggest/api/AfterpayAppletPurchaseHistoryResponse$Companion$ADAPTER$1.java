package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.shop.rendering.api.Footer;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AfterpayAppletPurchaseHistoryResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AfterpayAppletPurchaseHistoryResponse((LocalizedString) obj, (Footer) obj2, (LocalizedString) obj3, (LocalizedString) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(Footer.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AfterpayAppletPurchaseHistoryResponse afterpayAppletPurchaseHistoryResponse = (AfterpayAppletPurchaseHistoryResponse) obj;
        reverseProtoWriter.getClass();
        afterpayAppletPurchaseHistoryResponse.getClass();
        reverseProtoWriter.writeBytes(afterpayAppletPurchaseHistoryResponse.unknownFields());
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, afterpayAppletPurchaseHistoryResponse.completed_title);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, afterpayAppletPurchaseHistoryResponse.upcoming_title);
        Footer.ADAPTER.encodeWithTag(reverseProtoWriter, 2, afterpayAppletPurchaseHistoryResponse.footer);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, afterpayAppletPurchaseHistoryResponse.screen_title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AfterpayAppletPurchaseHistoryResponse afterpayAppletPurchaseHistoryResponse = (AfterpayAppletPurchaseHistoryResponse) obj;
        afterpayAppletPurchaseHistoryResponse.getClass();
        int size$okio = afterpayAppletPurchaseHistoryResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return protoAdapter.encodedSizeWithTag(4, afterpayAppletPurchaseHistoryResponse.completed_title) + protoAdapter.encodedSizeWithTag(3, afterpayAppletPurchaseHistoryResponse.upcoming_title) + Footer.ADAPTER.encodedSizeWithTag(2, afterpayAppletPurchaseHistoryResponse.footer) + protoAdapter.encodedSizeWithTag(1, afterpayAppletPurchaseHistoryResponse.screen_title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AfterpayAppletPurchaseHistoryResponse afterpayAppletPurchaseHistoryResponse = (AfterpayAppletPurchaseHistoryResponse) obj;
        afterpayAppletPurchaseHistoryResponse.getClass();
        LocalizedString localizedString = afterpayAppletPurchaseHistoryResponse.screen_title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        Footer footer = afterpayAppletPurchaseHistoryResponse.footer;
        Footer footer2 = footer != null ? (Footer) Footer.ADAPTER.redact(footer) : null;
        LocalizedString localizedString3 = afterpayAppletPurchaseHistoryResponse.upcoming_title;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        LocalizedString localizedString5 = afterpayAppletPurchaseHistoryResponse.completed_title;
        LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new AfterpayAppletPurchaseHistoryResponse(localizedString2, footer2, localizedString4, localizedString6, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AfterpayAppletPurchaseHistoryResponse afterpayAppletPurchaseHistoryResponse = (AfterpayAppletPurchaseHistoryResponse) obj;
        afterpayAppletPurchaseHistoryResponse.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, afterpayAppletPurchaseHistoryResponse.screen_title);
        Footer.ADAPTER.encodeWithTag(protoWriter, 2, afterpayAppletPurchaseHistoryResponse.footer);
        protoAdapter.encodeWithTag(protoWriter, 3, afterpayAppletPurchaseHistoryResponse.upcoming_title);
        protoAdapter.encodeWithTag(protoWriter, 4, afterpayAppletPurchaseHistoryResponse.completed_title);
        protoWriter.writeBytes(afterpayAppletPurchaseHistoryResponse.unknownFields());
    }
}
