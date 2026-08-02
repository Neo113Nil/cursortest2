package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SetDateRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SetDateRequest((RequestContext) obj, (Boolean) obj3, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SetDateRequest setDateRequest = (SetDateRequest) obj;
        reverseProtoWriter.getClass();
        setDateRequest.getClass();
        reverseProtoWriter.writeBytes(setDateRequest.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 3, setDateRequest.disabling_toggle_enabled);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, setDateRequest.date);
        RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, setDateRequest.request_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SetDateRequest setDateRequest = (SetDateRequest) obj;
        setDateRequest.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(3, setDateRequest.disabling_toggle_enabled) + ProtoAdapter.STRING.encodedSizeWithTag(2, setDateRequest.date) + RequestContext.ADAPTER.encodedSizeWithTag(1, setDateRequest.request_context) + setDateRequest.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SetDateRequest setDateRequest = (SetDateRequest) obj;
        setDateRequest.getClass();
        RequestContext requestContext = setDateRequest.request_context;
        RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = setDateRequest.date;
        Boolean bool = setDateRequest.disabling_toggle_enabled;
        byteString.getClass();
        return new SetDateRequest(requestContext2, bool, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SetDateRequest setDateRequest = (SetDateRequest) obj;
        setDateRequest.getClass();
        RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, setDateRequest.request_context);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, setDateRequest.date);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, setDateRequest.disabling_toggle_enabled);
        protoWriter.writeBytes(setDateRequest.unknownFields());
    }
}
