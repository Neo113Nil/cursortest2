package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.CheckDepositConfig;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CheckDepositConfig$Image$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CheckDepositConfig.Image((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CheckDepositConfig.Image image = (CheckDepositConfig.Image) obj;
        reverseProtoWriter.getClass();
        image.getClass();
        reverseProtoWriter.writeBytes(image.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, image.dark_image_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, image.light_image_url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CheckDepositConfig.Image image = (CheckDepositConfig.Image) obj;
        image.getClass();
        int size$okio = image.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, image.dark_image_url) + protoAdapter.encodedSizeWithTag(1, image.light_image_url) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CheckDepositConfig.Image image = (CheckDepositConfig.Image) obj;
        image.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = image.light_image_url;
        String str2 = image.dark_image_url;
        byteString.getClass();
        return new CheckDepositConfig.Image(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CheckDepositConfig.Image image = (CheckDepositConfig.Image) obj;
        image.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, image.light_image_url);
        protoAdapter.encodeWithTag(protoWriter, 2, image.dark_image_url);
        protoWriter.writeBytes(image.unknownFields());
    }
}
