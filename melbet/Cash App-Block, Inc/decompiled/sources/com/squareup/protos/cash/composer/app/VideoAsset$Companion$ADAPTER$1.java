package com.squareup.protos.cash.composer.app;

import com.squareup.protos.cash.composer.app.VideoAsset;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class VideoAsset$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        VideoAsset$FormFactor$VideoFill videoAsset$FormFactor$VideoFill = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new VideoAsset((String) obj, (String) obj2, (String) obj3, (Boolean) obj4, videoAsset$FormFactor$VideoFill, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                videoAsset$FormFactor$VideoFill = new VideoAsset$FormFactor$VideoFill((VideoAsset.VideoFill) VideoAsset.VideoFill.ADAPTER.decode(protoReader));
            } else if (nextTag == 4) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        VideoAsset videoAsset = (VideoAsset) obj;
        reverseProtoWriter.getClass();
        videoAsset.getClass();
        reverseProtoWriter.writeBytes(videoAsset.unknownFields());
        VideoAsset$FormFactor$VideoFill videoAsset$FormFactor$VideoFill = videoAsset.form_factor;
        if (videoAsset$FormFactor$VideoFill != null) {
            VideoAsset.VideoFill.ADAPTER.encodeWithTag(reverseProtoWriter, 3, videoAsset$FormFactor$VideoFill.value);
        } else if (videoAsset$FormFactor$VideoFill != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 5, videoAsset.should_loop);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, videoAsset.fallback_image_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, videoAsset.accessibility_hint);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, videoAsset.asset_url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        VideoAsset videoAsset = (VideoAsset) obj;
        videoAsset.getClass();
        int size$okio = videoAsset.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(5, videoAsset.should_loop) + protoAdapter.encodedSizeWithTag(4, videoAsset.fallback_image_url) + protoAdapter.encodedSizeWithTag(2, videoAsset.accessibility_hint) + protoAdapter.encodedSizeWithTag(1, videoAsset.asset_url) + size$okio;
        VideoAsset$FormFactor$VideoFill videoAsset$FormFactor$VideoFill = videoAsset.form_factor;
        if (videoAsset$FormFactor$VideoFill != null) {
            return VideoAsset.VideoFill.ADAPTER.encodedSizeWithTag(3, videoAsset$FormFactor$VideoFill.value) + encodedSizeWithTag;
        }
        if (videoAsset$FormFactor$VideoFill == null) {
            return encodedSizeWithTag;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        VideoAsset videoAsset = (VideoAsset) obj;
        videoAsset.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = videoAsset.asset_url;
        String str2 = videoAsset.accessibility_hint;
        String str3 = videoAsset.fallback_image_url;
        Boolean bool = videoAsset.should_loop;
        VideoAsset$FormFactor$VideoFill videoAsset$FormFactor$VideoFill = videoAsset.form_factor;
        byteString.getClass();
        return new VideoAsset(str, str2, str3, bool, videoAsset$FormFactor$VideoFill, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        VideoAsset videoAsset = (VideoAsset) obj;
        videoAsset.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, videoAsset.asset_url);
        protoAdapter.encodeWithTag(protoWriter, 2, videoAsset.accessibility_hint);
        protoAdapter.encodeWithTag(protoWriter, 4, videoAsset.fallback_image_url);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, videoAsset.should_loop);
        VideoAsset$FormFactor$VideoFill videoAsset$FormFactor$VideoFill = videoAsset.form_factor;
        if (videoAsset$FormFactor$VideoFill != null) {
            VideoAsset.VideoFill.ADAPTER.encodeWithTag(protoWriter, 3, videoAsset$FormFactor$VideoFill.value);
        } else if (videoAsset$FormFactor$VideoFill != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(videoAsset.unknownFields());
    }
}
