package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.SubmitBlockerResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SubmitBlockerResponse$BlockerResponseContext$Dialog$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SubmitBlockerResponse.BlockerResponseContext.Dialog((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        SubmitBlockerResponse.BlockerResponseContext.Dialog dialog = (SubmitBlockerResponse.BlockerResponseContext.Dialog) obj;
        reverseProtoWriter.getClass();
        dialog.getClass();
        reverseProtoWriter.writeBytes(dialog.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, dialog.message);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, dialog.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SubmitBlockerResponse.BlockerResponseContext.Dialog dialog = (SubmitBlockerResponse.BlockerResponseContext.Dialog) obj;
        dialog.getClass();
        int size$okio = dialog.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, dialog.message) + protoAdapter.encodedSizeWithTag(1, dialog.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SubmitBlockerResponse.BlockerResponseContext.Dialog dialog = (SubmitBlockerResponse.BlockerResponseContext.Dialog) obj;
        dialog.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = dialog.title;
        String str2 = dialog.message;
        byteString.getClass();
        return new SubmitBlockerResponse.BlockerResponseContext.Dialog(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SubmitBlockerResponse.BlockerResponseContext.Dialog dialog = (SubmitBlockerResponse.BlockerResponseContext.Dialog) obj;
        dialog.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, dialog.title);
        protoAdapter.encodeWithTag(protoWriter, 2, dialog.message);
        protoWriter.writeBytes(dialog.unknownFields());
    }
}
