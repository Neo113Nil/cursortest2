package com.squareup.protos.cash.blockstable.api.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Chain$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Chain((String) obj, (String) obj2, (Image) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Chain chain = (Chain) obj;
        reverseProtoWriter.getClass();
        chain.getClass();
        reverseProtoWriter.writeBytes(chain.unknownFields());
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 3, chain.icon);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, chain.display_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, chain.chain);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Chain chain = (Chain) obj;
        chain.getClass();
        int size$okio = chain.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return Image.ADAPTER.encodedSizeWithTag(3, chain.icon) + protoAdapter.encodedSizeWithTag(2, chain.display_name) + protoAdapter.encodedSizeWithTag(1, chain.chain) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Chain chain = (Chain) obj;
        chain.getClass();
        Image image = chain.icon;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = chain.chain;
        String str2 = chain.display_name;
        byteString.getClass();
        return new Chain(str, str2, image2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Chain chain = (Chain) obj;
        chain.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, chain.chain);
        protoAdapter.encodeWithTag(protoWriter, 2, chain.display_name);
        Image.ADAPTER.encodeWithTag(protoWriter, 3, chain.icon);
        protoWriter.writeBytes(chain.unknownFields());
    }
}
