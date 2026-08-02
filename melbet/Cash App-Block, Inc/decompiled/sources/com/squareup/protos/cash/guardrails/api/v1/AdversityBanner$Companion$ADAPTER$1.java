package com.squareup.protos.cash.guardrails.api.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.guardrails.api.v1.AdversityBanner;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AdversityBanner$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new AdversityBanner((String) obj, (AdversityBanner.Style) obj2, (String) obj3, (String) obj4, (LocalizableString) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                try {
                    obj2 = AdversityBanner.Style.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AdversityBanner adversityBanner = (AdversityBanner) obj;
        reverseProtoWriter.getClass();
        adversityBanner.getClass();
        reverseProtoWriter.writeBytes(adversityBanner.unknownFields());
        LocalizableString.ADAPTER.encodeWithTag(reverseProtoWriter, 5, adversityBanner.localizable_message);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, adversityBanner.f1277type);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, adversityBanner.client_route_url);
        AdversityBanner.Style.ADAPTER.encodeWithTag(reverseProtoWriter, 2, adversityBanner.style);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, adversityBanner.message);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AdversityBanner adversityBanner = (AdversityBanner) obj;
        adversityBanner.getClass();
        int size$okio = adversityBanner.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return LocalizableString.ADAPTER.encodedSizeWithTag(5, adversityBanner.localizable_message) + protoAdapter.encodedSizeWithTag(4, adversityBanner.f1277type) + protoAdapter.encodedSizeWithTag(3, adversityBanner.client_route_url) + AdversityBanner.Style.ADAPTER.encodedSizeWithTag(2, adversityBanner.style) + protoAdapter.encodedSizeWithTag(1, adversityBanner.message) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AdversityBanner adversityBanner = (AdversityBanner) obj;
        adversityBanner.getClass();
        ByteString byteString = ByteString.EMPTY;
        AdversityBanner.Style style = adversityBanner.style;
        String str = adversityBanner.client_route_url;
        String str2 = adversityBanner.f1277type;
        byteString.getClass();
        return new AdversityBanner(null, style, str, str2, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AdversityBanner adversityBanner = (AdversityBanner) obj;
        adversityBanner.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, adversityBanner.message);
        AdversityBanner.Style.ADAPTER.encodeWithTag(protoWriter, 2, adversityBanner.style);
        protoAdapter.encodeWithTag(protoWriter, 3, adversityBanner.client_route_url);
        protoAdapter.encodeWithTag(protoWriter, 4, adversityBanner.f1277type);
        LocalizableString.ADAPTER.encodeWithTag(protoWriter, 5, adversityBanner.localizable_message);
        protoWriter.writeBytes(adversityBanner.unknownFields());
    }
}
