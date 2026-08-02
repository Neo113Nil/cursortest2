package com.squareup.protos.cash.composer.app;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LottieAsset$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LottieAsset((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        LottieAsset lottieAsset = (LottieAsset) obj;
        reverseProtoWriter.getClass();
        lottieAsset.getClass();
        reverseProtoWriter.writeBytes(lottieAsset.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, lottieAsset.accessibility_hint);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, lottieAsset.asset_url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LottieAsset lottieAsset = (LottieAsset) obj;
        lottieAsset.getClass();
        int size$okio = lottieAsset.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, lottieAsset.accessibility_hint) + protoAdapter.encodedSizeWithTag(1, lottieAsset.asset_url) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LottieAsset lottieAsset = (LottieAsset) obj;
        lottieAsset.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = lottieAsset.asset_url;
        String str2 = lottieAsset.accessibility_hint;
        byteString.getClass();
        return new LottieAsset(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LottieAsset lottieAsset = (LottieAsset) obj;
        lottieAsset.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, lottieAsset.asset_url);
        protoAdapter.encodeWithTag(protoWriter, 2, lottieAsset.accessibility_hint);
        protoWriter.writeBytes(lottieAsset.unknownFields());
    }
}
