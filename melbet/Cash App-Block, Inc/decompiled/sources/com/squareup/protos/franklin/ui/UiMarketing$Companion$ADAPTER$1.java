package com.squareup.protos.franklin.ui;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class UiMarketing$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UiMarketing((Boolean) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UiMarketing uiMarketing = (UiMarketing) obj;
        reverseProtoWriter.getClass();
        uiMarketing.getClass();
        reverseProtoWriter.writeBytes(uiMarketing.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, uiMarketing.suppress_review_prompt);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UiMarketing uiMarketing = (UiMarketing) obj;
        uiMarketing.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(1, uiMarketing.suppress_review_prompt) + uiMarketing.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UiMarketing uiMarketing = (UiMarketing) obj;
        uiMarketing.getClass();
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = uiMarketing.suppress_review_prompt;
        byteString.getClass();
        return new UiMarketing(bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UiMarketing uiMarketing = (UiMarketing) obj;
        uiMarketing.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, uiMarketing.suppress_review_prompt);
        protoWriter.writeBytes(uiMarketing.unknownFields());
    }
}
