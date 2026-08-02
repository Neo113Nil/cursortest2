package com.squareup.protos.cash.paychecks.api.v1;

import com.squareup.protos.cash.paychecks.api.v1.SubmitSetPaycheckMultiAllocationRequest;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SubmitSetPaycheckMultiAllocationRequest$Cancel$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SubmitSetPaycheckMultiAllocationRequest.Cancel(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SubmitSetPaycheckMultiAllocationRequest.Cancel cancel = (SubmitSetPaycheckMultiAllocationRequest.Cancel) obj;
        reverseProtoWriter.getClass();
        cancel.getClass();
        reverseProtoWriter.writeBytes(cancel.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SubmitSetPaycheckMultiAllocationRequest.Cancel cancel = (SubmitSetPaycheckMultiAllocationRequest.Cancel) obj;
        cancel.getClass();
        return cancel.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((SubmitSetPaycheckMultiAllocationRequest.Cancel) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SubmitSetPaycheckMultiAllocationRequest.Cancel(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SubmitSetPaycheckMultiAllocationRequest.Cancel cancel = (SubmitSetPaycheckMultiAllocationRequest.Cancel) obj;
        cancel.getClass();
        protoWriter.writeBytes(cancel.unknownFields());
    }
}
