package com.squareup.protos.cash.messagingplatformcommon.templates.detail;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class DetailsPageText$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DetailsPageText((String) obj, (Boolean) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        DetailsPageText detailsPageText = (DetailsPageText) obj;
        reverseProtoWriter.getClass();
        detailsPageText.getClass();
        reverseProtoWriter.writeBytes(detailsPageText.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, detailsPageText.render_as_markdown);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, detailsPageText.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DetailsPageText detailsPageText = (DetailsPageText) obj;
        detailsPageText.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(2, detailsPageText.render_as_markdown) + ProtoAdapter.STRING.encodedSizeWithTag(1, detailsPageText.text) + detailsPageText.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DetailsPageText detailsPageText = (DetailsPageText) obj;
        detailsPageText.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = detailsPageText.text;
        Boolean bool = detailsPageText.render_as_markdown;
        byteString.getClass();
        return new DetailsPageText(str, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DetailsPageText detailsPageText = (DetailsPageText) obj;
        detailsPageText.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, detailsPageText.text);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, detailsPageText.render_as_markdown);
        protoWriter.writeBytes(detailsPageText.unknownFields());
    }
}
