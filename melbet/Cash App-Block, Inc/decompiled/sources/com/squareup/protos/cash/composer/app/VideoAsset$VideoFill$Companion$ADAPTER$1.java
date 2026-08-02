package com.squareup.protos.cash.composer.app;

import com.squareup.protos.cash.composer.app.VideoAsset;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class VideoAsset$VideoFill$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new VideoAsset.VideoFill(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        VideoAsset.VideoFill videoFill = (VideoAsset.VideoFill) obj;
        reverseProtoWriter.getClass();
        videoFill.getClass();
        reverseProtoWriter.writeBytes(videoFill.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        VideoAsset.VideoFill videoFill = (VideoAsset.VideoFill) obj;
        videoFill.getClass();
        return videoFill.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((VideoAsset.VideoFill) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new VideoAsset.VideoFill(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        VideoAsset.VideoFill videoFill = (VideoAsset.VideoFill) obj;
        videoFill.getClass();
        protoWriter.writeBytes(videoFill.unknownFields());
    }
}
