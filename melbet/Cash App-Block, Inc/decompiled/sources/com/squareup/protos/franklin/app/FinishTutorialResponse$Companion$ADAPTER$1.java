package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class FinishTutorialResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new FinishTutorialResponse((ResponseContext) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        FinishTutorialResponse finishTutorialResponse = (FinishTutorialResponse) obj;
        reverseProtoWriter.getClass();
        finishTutorialResponse.getClass();
        reverseProtoWriter.writeBytes(finishTutorialResponse.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, finishTutorialResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        FinishTutorialResponse finishTutorialResponse = (FinishTutorialResponse) obj;
        finishTutorialResponse.getClass();
        return ResponseContext.ADAPTER.encodedSizeWithTag(1, finishTutorialResponse.response_context) + finishTutorialResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        FinishTutorialResponse finishTutorialResponse = (FinishTutorialResponse) obj;
        finishTutorialResponse.getClass();
        ResponseContext responseContext = finishTutorialResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new FinishTutorialResponse(responseContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        FinishTutorialResponse finishTutorialResponse = (FinishTutorialResponse) obj;
        finishTutorialResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, finishTutorialResponse.response_context);
        protoWriter.writeBytes(finishTutorialResponse.unknownFields());
    }
}
