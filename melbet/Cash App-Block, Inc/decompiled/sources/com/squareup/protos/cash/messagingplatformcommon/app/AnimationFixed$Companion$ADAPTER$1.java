package com.squareup.protos.cash.messagingplatformcommon.app;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AnimationFixed$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new AnimationFixed((com.squareup.protos.cash.ui.Image) obj, (Integer) obj2, (Integer) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(com.squareup.protos.cash.ui.Image.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.INT32.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AnimationFixed animationFixed = (AnimationFixed) obj;
        reverseProtoWriter.getClass();
        animationFixed.getClass();
        reverseProtoWriter.writeBytes(animationFixed.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, animationFixed.height);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, animationFixed.width);
        com.squareup.protos.cash.ui.Image.ADAPTER.encodeWithTag(reverseProtoWriter, 1, animationFixed.lottie_asset);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AnimationFixed animationFixed = (AnimationFixed) obj;
        animationFixed.getClass();
        int encodedSizeWithTag = com.squareup.protos.cash.ui.Image.ADAPTER.encodedSizeWithTag(1, animationFixed.lottie_asset) + animationFixed.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        return protoAdapter.encodedSizeWithTag(3, animationFixed.height) + protoAdapter.encodedSizeWithTag(2, animationFixed.width) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AnimationFixed animationFixed = (AnimationFixed) obj;
        animationFixed.getClass();
        com.squareup.protos.cash.ui.Image image = animationFixed.lottie_asset;
        com.squareup.protos.cash.ui.Image image2 = image != null ? (com.squareup.protos.cash.ui.Image) com.squareup.protos.cash.ui.Image.ADAPTER.redact(image) : null;
        ByteString byteString = ByteString.EMPTY;
        Integer num = animationFixed.width;
        Integer num2 = animationFixed.height;
        byteString.getClass();
        return new AnimationFixed(image2, num, num2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AnimationFixed animationFixed = (AnimationFixed) obj;
        animationFixed.getClass();
        com.squareup.protos.cash.ui.Image.ADAPTER.encodeWithTag(protoWriter, 1, animationFixed.lottie_asset);
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 2, animationFixed.width);
        protoAdapter.encodeWithTag(protoWriter, 3, animationFixed.height);
        protoWriter.writeBytes(animationFixed.unknownFields());
    }
}
