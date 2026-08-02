package com.squareup.protos.cash.messagingplatformcommon.app;

import com.squareup.protos.cash.messagingplatformcommon.app.Video;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes.dex */
public final class Video$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new Video((String) obj, (String) obj2, (Boolean) obj3, (Video.AudioPreference) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj4 = Video.AudioPreference.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Video video = (Video) obj;
        reverseProtoWriter.getClass();
        video.getClass();
        reverseProtoWriter.writeBytes(video.unknownFields());
        Video.AudioPreference.ADAPTER.encodeWithTag(reverseProtoWriter, 4, video.audio_preference);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 3, video.should_loop);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, video.video_accessibility_hint);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, video.asset_url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Video video = (Video) obj;
        video.getClass();
        int size$okio = video.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return Video.AudioPreference.ADAPTER.encodedSizeWithTag(4, video.audio_preference) + ProtoAdapter.BOOL.encodedSizeWithTag(3, video.should_loop) + protoAdapter.encodedSizeWithTag(2, video.video_accessibility_hint) + protoAdapter.encodedSizeWithTag(1, video.asset_url) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Video video = (Video) obj;
        video.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = video.asset_url;
        String str2 = video.video_accessibility_hint;
        Boolean bool = video.should_loop;
        Video.AudioPreference audioPreference = video.audio_preference;
        byteString.getClass();
        return new Video(str, str2, bool, audioPreference, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Video video = (Video) obj;
        video.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, video.asset_url);
        protoAdapter.encodeWithTag(protoWriter, 2, video.video_accessibility_hint);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, video.should_loop);
        Video.AudioPreference.ADAPTER.encodeWithTag(protoWriter, 4, video.audio_preference);
        protoWriter.writeBytes(video.unknownFields());
    }
}
