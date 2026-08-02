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
public final class AfterpayAppletActivityHistoryResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AfterpayAppletActivityHistoryResponse((LocalizedString) obj, (Footer) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(Footer.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AfterpayAppletActivityHistoryResponse afterpayAppletActivityHistoryResponse = (AfterpayAppletActivityHistoryResponse) obj;
        reverseProtoWriter.getClass();
        afterpayAppletActivityHistoryResponse.getClass();
        reverseProtoWriter.writeBytes(afterpayAppletActivityHistoryResponse.unknownFields());
        Footer.ADAPTER.encodeWithTag(reverseProtoWriter, 2, afterpayAppletActivityHistoryResponse.footer);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 1, afterpayAppletActivityHistoryResponse.screen_title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AfterpayAppletActivityHistoryResponse afterpayAppletActivityHistoryResponse = (AfterpayAppletActivityHistoryResponse) obj;
        afterpayAppletActivityHistoryResponse.getClass();
        return Footer.ADAPTER.encodedSizeWithTag(2, afterpayAppletActivityHistoryResponse.footer) + LocalizedString.ADAPTER.encodedSizeWithTag(1, afterpayAppletActivityHistoryResponse.screen_title) + afterpayAppletActivityHistoryResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AfterpayAppletActivityHistoryResponse afterpayAppletActivityHistoryResponse = (AfterpayAppletActivityHistoryResponse) obj;
        afterpayAppletActivityHistoryResponse.getClass();
        LocalizedString localizedString = afterpayAppletActivityHistoryResponse.screen_title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        Footer footer = afterpayAppletActivityHistoryResponse.footer;
        Footer footer2 = footer != null ? (Footer) Footer.ADAPTER.redact(footer) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new AfterpayAppletActivityHistoryResponse(localizedString2, footer2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AfterpayAppletActivityHistoryResponse afterpayAppletActivityHistoryResponse = (AfterpayAppletActivityHistoryResponse) obj;
        afterpayAppletActivityHistoryResponse.getClass();
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 1, afterpayAppletActivityHistoryResponse.screen_title);
        Footer.ADAPTER.encodeWithTag(protoWriter, 2, afterpayAppletActivityHistoryResponse.footer);
        protoWriter.writeBytes(afterpayAppletActivityHistoryResponse.unknownFields());
    }
}
