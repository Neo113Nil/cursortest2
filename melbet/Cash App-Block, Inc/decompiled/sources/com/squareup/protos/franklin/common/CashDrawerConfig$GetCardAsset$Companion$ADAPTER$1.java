package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.CashDrawerConfig;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CashDrawerConfig$GetCardAsset$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new CashDrawerConfig.GetCardAsset((String) obj, (String) obj2, (Integer) obj3, (Integer) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.INT32.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashDrawerConfig.GetCardAsset getCardAsset = (CashDrawerConfig.GetCardAsset) obj;
        reverseProtoWriter.getClass();
        getCardAsset.getClass();
        reverseProtoWriter.writeBytes(getCardAsset.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, getCardAsset.height);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, getCardAsset.width);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, getCardAsset.image_url);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, getCardAsset.video_url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashDrawerConfig.GetCardAsset getCardAsset = (CashDrawerConfig.GetCardAsset) obj;
        getCardAsset.getClass();
        int size$okio = getCardAsset.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, getCardAsset.image_url) + protoAdapter.encodedSizeWithTag(1, getCardAsset.video_url) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT32;
        return protoAdapter2.encodedSizeWithTag(4, getCardAsset.height) + protoAdapter2.encodedSizeWithTag(3, getCardAsset.width) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashDrawerConfig.GetCardAsset getCardAsset = (CashDrawerConfig.GetCardAsset) obj;
        getCardAsset.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = getCardAsset.video_url;
        String str2 = getCardAsset.image_url;
        Integer num = getCardAsset.width;
        Integer num2 = getCardAsset.height;
        byteString.getClass();
        return new CashDrawerConfig.GetCardAsset(str, str2, num, num2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashDrawerConfig.GetCardAsset getCardAsset = (CashDrawerConfig.GetCardAsset) obj;
        getCardAsset.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, getCardAsset.video_url);
        protoAdapter.encodeWithTag(protoWriter, 2, getCardAsset.image_url);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT32;
        protoAdapter2.encodeWithTag(protoWriter, 3, getCardAsset.width);
        protoAdapter2.encodeWithTag(protoWriter, 4, getCardAsset.height);
        protoWriter.writeBytes(getCardAsset.unknownFields());
    }
}
