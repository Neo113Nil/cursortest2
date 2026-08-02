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
public final class AfterpayAppletActivityResponse$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new AfterpayAppletActivityResponse((LocalizedString) obj, (LocalizedString) obj2, (LocalizedString) obj3, (LocalizedString) obj4, (LocalizedString) obj5, (Footer) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(Footer.ADAPTER, protoReader, obj6);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AfterpayAppletActivityResponse afterpayAppletActivityResponse = (AfterpayAppletActivityResponse) obj;
        reverseProtoWriter.getClass();
        afterpayAppletActivityResponse.getClass();
        reverseProtoWriter.writeBytes(afterpayAppletActivityResponse.unknownFields());
        Footer.ADAPTER.encodeWithTag(reverseProtoWriter, 6, afterpayAppletActivityResponse.footer);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, afterpayAppletActivityResponse.empty_history_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, afterpayAppletActivityResponse.completed_title);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, afterpayAppletActivityResponse.upcoming_title);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, afterpayAppletActivityResponse.header_subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, afterpayAppletActivityResponse.screen_title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AfterpayAppletActivityResponse afterpayAppletActivityResponse = (AfterpayAppletActivityResponse) obj;
        afterpayAppletActivityResponse.getClass();
        int size$okio = afterpayAppletActivityResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return Footer.ADAPTER.encodedSizeWithTag(6, afterpayAppletActivityResponse.footer) + protoAdapter.encodedSizeWithTag(5, afterpayAppletActivityResponse.empty_history_text) + protoAdapter.encodedSizeWithTag(4, afterpayAppletActivityResponse.completed_title) + protoAdapter.encodedSizeWithTag(3, afterpayAppletActivityResponse.upcoming_title) + protoAdapter.encodedSizeWithTag(2, afterpayAppletActivityResponse.header_subtitle) + protoAdapter.encodedSizeWithTag(1, afterpayAppletActivityResponse.screen_title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AfterpayAppletActivityResponse afterpayAppletActivityResponse = (AfterpayAppletActivityResponse) obj;
        afterpayAppletActivityResponse.getClass();
        LocalizedString localizedString = afterpayAppletActivityResponse.screen_title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = afterpayAppletActivityResponse.header_subtitle;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        LocalizedString localizedString5 = afterpayAppletActivityResponse.upcoming_title;
        LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null;
        LocalizedString localizedString7 = afterpayAppletActivityResponse.completed_title;
        LocalizedString localizedString8 = localizedString7 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString7) : null;
        LocalizedString localizedString9 = afterpayAppletActivityResponse.empty_history_text;
        LocalizedString localizedString10 = localizedString9 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString9) : null;
        Footer footer = afterpayAppletActivityResponse.footer;
        Footer footer2 = footer != null ? (Footer) Footer.ADAPTER.redact(footer) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new AfterpayAppletActivityResponse(localizedString2, localizedString4, localizedString6, localizedString8, localizedString10, footer2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AfterpayAppletActivityResponse afterpayAppletActivityResponse = (AfterpayAppletActivityResponse) obj;
        afterpayAppletActivityResponse.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, afterpayAppletActivityResponse.screen_title);
        protoAdapter.encodeWithTag(protoWriter, 2, afterpayAppletActivityResponse.header_subtitle);
        protoAdapter.encodeWithTag(protoWriter, 3, afterpayAppletActivityResponse.upcoming_title);
        protoAdapter.encodeWithTag(protoWriter, 4, afterpayAppletActivityResponse.completed_title);
        protoAdapter.encodeWithTag(protoWriter, 5, afterpayAppletActivityResponse.empty_history_text);
        Footer.ADAPTER.encodeWithTag(protoWriter, 6, afterpayAppletActivityResponse.footer);
        protoWriter.writeBytes(afterpayAppletActivityResponse.unknownFields());
    }
}
