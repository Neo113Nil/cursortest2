package com.squareup.protos.cash.cashinstrumentstore.api.v1.cards.common;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class NavigationUrl$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new NavigationUrl((Platform) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = Platform.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        NavigationUrl navigationUrl = (NavigationUrl) obj;
        reverseProtoWriter.getClass();
        navigationUrl.getClass();
        reverseProtoWriter.writeBytes(navigationUrl.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, navigationUrl.url);
        Platform.ADAPTER.encodeWithTag(reverseProtoWriter, 1, navigationUrl.platform);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        NavigationUrl navigationUrl = (NavigationUrl) obj;
        navigationUrl.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, navigationUrl.url) + Platform.ADAPTER.encodedSizeWithTag(1, navigationUrl.platform) + navigationUrl.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        NavigationUrl navigationUrl = (NavigationUrl) obj;
        navigationUrl.getClass();
        ByteString byteString = ByteString.EMPTY;
        Platform platform = navigationUrl.platform;
        String str = navigationUrl.url;
        byteString.getClass();
        return new NavigationUrl(platform, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        NavigationUrl navigationUrl = (NavigationUrl) obj;
        navigationUrl.getClass();
        Platform.ADAPTER.encodeWithTag(protoWriter, 1, navigationUrl.platform);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, navigationUrl.url);
        protoWriter.writeBytes(navigationUrl.unknownFields());
    }
}
