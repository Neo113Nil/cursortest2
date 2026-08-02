package com.squareup.protos.cash.messagingplatformcommon.app;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AnimationInset$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AnimationInset((com.squareup.protos.cash.ui.Image) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(com.squareup.protos.cash.ui.Image.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AnimationInset animationInset = (AnimationInset) obj;
        reverseProtoWriter.getClass();
        animationInset.getClass();
        reverseProtoWriter.writeBytes(animationInset.unknownFields());
        com.squareup.protos.cash.ui.Image.ADAPTER.encodeWithTag(reverseProtoWriter, 1, animationInset.lottie_asset);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AnimationInset animationInset = (AnimationInset) obj;
        animationInset.getClass();
        return com.squareup.protos.cash.ui.Image.ADAPTER.encodedSizeWithTag(1, animationInset.lottie_asset) + animationInset.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AnimationInset animationInset = (AnimationInset) obj;
        animationInset.getClass();
        com.squareup.protos.cash.ui.Image image = animationInset.lottie_asset;
        com.squareup.protos.cash.ui.Image image2 = image != null ? (com.squareup.protos.cash.ui.Image) com.squareup.protos.cash.ui.Image.ADAPTER.redact(image) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new AnimationInset(image2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AnimationInset animationInset = (AnimationInset) obj;
        animationInset.getClass();
        com.squareup.protos.cash.ui.Image.ADAPTER.encodeWithTag(protoWriter, 1, animationInset.lottie_asset);
        protoWriter.writeBytes(animationInset.unknownFields());
    }
}
