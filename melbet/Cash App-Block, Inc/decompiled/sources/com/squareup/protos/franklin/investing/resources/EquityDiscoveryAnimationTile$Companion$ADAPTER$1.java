package com.squareup.protos.franklin.investing.resources;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes.dex */
public final class EquityDiscoveryAnimationTile$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new EquityDiscoveryAnimationTile((String) obj, (String) obj2, (String) obj3, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        EquityDiscoveryAnimationTile equityDiscoveryAnimationTile = (EquityDiscoveryAnimationTile) obj;
        reverseProtoWriter.getClass();
        equityDiscoveryAnimationTile.getClass();
        reverseProtoWriter.writeBytes(equityDiscoveryAnimationTile.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, equityDiscoveryAnimationTile.name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, equityDiscoveryAnimationTile.accent_color);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, equityDiscoveryAnimationTile.image_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, equityDiscoveryAnimationTile.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        EquityDiscoveryAnimationTile equityDiscoveryAnimationTile = (EquityDiscoveryAnimationTile) obj;
        equityDiscoveryAnimationTile.getClass();
        int size$okio = equityDiscoveryAnimationTile.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(4, equityDiscoveryAnimationTile.name) + protoAdapter.encodedSizeWithTag(3, equityDiscoveryAnimationTile.accent_color) + protoAdapter.encodedSizeWithTag(2, equityDiscoveryAnimationTile.image_url) + protoAdapter.encodedSizeWithTag(1, equityDiscoveryAnimationTile.token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        EquityDiscoveryAnimationTile equityDiscoveryAnimationTile = (EquityDiscoveryAnimationTile) obj;
        equityDiscoveryAnimationTile.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = equityDiscoveryAnimationTile.token;
        String str2 = equityDiscoveryAnimationTile.image_url;
        String str3 = equityDiscoveryAnimationTile.accent_color;
        String str4 = equityDiscoveryAnimationTile.name;
        byteString.getClass();
        return new EquityDiscoveryAnimationTile(str, str2, str3, str4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        EquityDiscoveryAnimationTile equityDiscoveryAnimationTile = (EquityDiscoveryAnimationTile) obj;
        equityDiscoveryAnimationTile.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, equityDiscoveryAnimationTile.token);
        protoAdapter.encodeWithTag(protoWriter, 2, equityDiscoveryAnimationTile.image_url);
        protoAdapter.encodeWithTag(protoWriter, 3, equityDiscoveryAnimationTile.accent_color);
        protoAdapter.encodeWithTag(protoWriter, 4, equityDiscoveryAnimationTile.name);
        protoWriter.writeBytes(equityDiscoveryAnimationTile.unknownFields());
    }
}
