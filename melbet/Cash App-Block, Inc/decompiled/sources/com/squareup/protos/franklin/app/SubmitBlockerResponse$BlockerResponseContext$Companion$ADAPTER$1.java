package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.app.SubmitBlockerResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SubmitBlockerResponse$BlockerResponseContext$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SubmitBlockerResponse.BlockerResponseContext((SubmitBlockerResponse.BlockerResponseContext.Dialog) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(SubmitBlockerResponse.BlockerResponseContext.Dialog.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SubmitBlockerResponse.BlockerResponseContext blockerResponseContext = (SubmitBlockerResponse.BlockerResponseContext) obj;
        reverseProtoWriter.getClass();
        blockerResponseContext.getClass();
        reverseProtoWriter.writeBytes(blockerResponseContext.unknownFields());
        SubmitBlockerResponse.BlockerResponseContext.Dialog.ADAPTER.encodeWithTag(reverseProtoWriter, 1, blockerResponseContext.dialog);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SubmitBlockerResponse.BlockerResponseContext blockerResponseContext = (SubmitBlockerResponse.BlockerResponseContext) obj;
        blockerResponseContext.getClass();
        return SubmitBlockerResponse.BlockerResponseContext.Dialog.ADAPTER.encodedSizeWithTag(1, blockerResponseContext.dialog) + blockerResponseContext.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SubmitBlockerResponse.BlockerResponseContext blockerResponseContext = (SubmitBlockerResponse.BlockerResponseContext) obj;
        blockerResponseContext.getClass();
        SubmitBlockerResponse.BlockerResponseContext.Dialog dialog = blockerResponseContext.dialog;
        SubmitBlockerResponse.BlockerResponseContext.Dialog dialog2 = dialog != null ? (SubmitBlockerResponse.BlockerResponseContext.Dialog) SubmitBlockerResponse.BlockerResponseContext.Dialog.ADAPTER.redact(dialog) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SubmitBlockerResponse.BlockerResponseContext(dialog2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SubmitBlockerResponse.BlockerResponseContext blockerResponseContext = (SubmitBlockerResponse.BlockerResponseContext) obj;
        blockerResponseContext.getClass();
        SubmitBlockerResponse.BlockerResponseContext.Dialog.ADAPTER.encodeWithTag(protoWriter, 1, blockerResponseContext.dialog);
        protoWriter.writeBytes(blockerResponseContext.unknownFields());
    }
}
