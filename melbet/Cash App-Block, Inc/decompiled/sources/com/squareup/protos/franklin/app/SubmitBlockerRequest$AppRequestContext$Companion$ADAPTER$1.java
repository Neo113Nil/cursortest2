package com.squareup.protos.franklin.app;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.app.SubmitBlockerRequest;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SubmitBlockerRequest$AppRequestContext$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SubmitBlockerRequest.AppRequestContext(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(ProtoAdapter.BYTES.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SubmitBlockerRequest.AppRequestContext appRequestContext = (SubmitBlockerRequest.AppRequestContext) obj;
        reverseProtoWriter.getClass();
        appRequestContext.getClass();
        reverseProtoWriter.writeBytes(appRequestContext.unknownFields());
        ProtoAdapter.BYTES.asRepeated().encodeWithTag(reverseProtoWriter, 1, appRequestContext.all_known_ranges);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SubmitBlockerRequest.AppRequestContext appRequestContext = (SubmitBlockerRequest.AppRequestContext) obj;
        appRequestContext.getClass();
        return ProtoAdapter.BYTES.asRepeated().encodedSizeWithTag(1, appRequestContext.all_known_ranges) + appRequestContext.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SubmitBlockerRequest.AppRequestContext appRequestContext = (SubmitBlockerRequest.AppRequestContext) obj;
        appRequestContext.getClass();
        ByteString byteString = ByteString.EMPTY;
        List list = appRequestContext.all_known_ranges;
        list.getClass();
        byteString.getClass();
        return new SubmitBlockerRequest.AppRequestContext(list, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SubmitBlockerRequest.AppRequestContext appRequestContext = (SubmitBlockerRequest.AppRequestContext) obj;
        appRequestContext.getClass();
        ProtoAdapter.BYTES.asRepeated().encodeWithTag(protoWriter, 1, appRequestContext.all_known_ranges);
        protoWriter.writeBytes(appRequestContext.unknownFields());
    }
}
