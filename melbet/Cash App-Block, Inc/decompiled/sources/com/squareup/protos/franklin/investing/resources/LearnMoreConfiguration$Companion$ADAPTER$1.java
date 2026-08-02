package com.squareup.protos.franklin.investing.resources;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes.dex */
public final class LearnMoreConfiguration$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LearnMoreConfiguration((String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LearnMoreConfiguration learnMoreConfiguration = (LearnMoreConfiguration) obj;
        reverseProtoWriter.getClass();
        learnMoreConfiguration.getClass();
        reverseProtoWriter.writeBytes(learnMoreConfiguration.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, learnMoreConfiguration.body_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, learnMoreConfiguration.title_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, learnMoreConfiguration.image_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, learnMoreConfiguration.link_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, learnMoreConfiguration.link_text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LearnMoreConfiguration learnMoreConfiguration = (LearnMoreConfiguration) obj;
        learnMoreConfiguration.getClass();
        int size$okio = learnMoreConfiguration.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(5, learnMoreConfiguration.body_text) + protoAdapter.encodedSizeWithTag(4, learnMoreConfiguration.title_text) + protoAdapter.encodedSizeWithTag(3, learnMoreConfiguration.image_url) + protoAdapter.encodedSizeWithTag(2, learnMoreConfiguration.link_url) + protoAdapter.encodedSizeWithTag(1, learnMoreConfiguration.link_text) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LearnMoreConfiguration learnMoreConfiguration = (LearnMoreConfiguration) obj;
        learnMoreConfiguration.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = learnMoreConfiguration.link_text;
        String str2 = learnMoreConfiguration.link_url;
        String str3 = learnMoreConfiguration.image_url;
        String str4 = learnMoreConfiguration.title_text;
        String str5 = learnMoreConfiguration.body_text;
        byteString.getClass();
        return new LearnMoreConfiguration(str, str2, str3, str4, str5, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LearnMoreConfiguration learnMoreConfiguration = (LearnMoreConfiguration) obj;
        learnMoreConfiguration.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, learnMoreConfiguration.link_text);
        protoAdapter.encodeWithTag(protoWriter, 2, learnMoreConfiguration.link_url);
        protoAdapter.encodeWithTag(protoWriter, 3, learnMoreConfiguration.image_url);
        protoAdapter.encodeWithTag(protoWriter, 4, learnMoreConfiguration.title_text);
        protoAdapter.encodeWithTag(protoWriter, 5, learnMoreConfiguration.body_text);
        protoWriter.writeBytes(learnMoreConfiguration.unknownFields());
    }
}
