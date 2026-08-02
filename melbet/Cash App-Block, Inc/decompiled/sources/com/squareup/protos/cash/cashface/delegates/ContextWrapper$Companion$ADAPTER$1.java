package com.squareup.protos.cash.cashface.delegates;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cashface.delegates.ContextWrapper;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ContextWrapper$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new ContextWrapper((String) obj, (String) obj2, (ByteString) obj3, (String) obj4, (ContextWrapper.Origin) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.BYTES.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(ContextWrapper.Origin.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ContextWrapper contextWrapper = (ContextWrapper) obj;
        reverseProtoWriter.getClass();
        contextWrapper.getClass();
        reverseProtoWriter.writeBytes(contextWrapper.unknownFields());
        ContextWrapper.Origin.ADAPTER.encodeWithTag(reverseProtoWriter, 5, contextWrapper.origin);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, contextWrapper.referrer_flow_token);
        ProtoAdapter.BYTES.encodeWithTag(reverseProtoWriter, 3, contextWrapper.context_data);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, contextWrapper.merchant_flow_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, contextWrapper.profile_context_type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ContextWrapper contextWrapper = (ContextWrapper) obj;
        contextWrapper.getClass();
        int size$okio = contextWrapper.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return ContextWrapper.Origin.ADAPTER.encodedSizeWithTag(5, contextWrapper.origin) + protoAdapter.encodedSizeWithTag(4, contextWrapper.referrer_flow_token) + ProtoAdapter.BYTES.encodedSizeWithTag(3, contextWrapper.context_data) + protoAdapter.encodedSizeWithTag(2, contextWrapper.merchant_flow_token) + protoAdapter.encodedSizeWithTag(1, contextWrapper.profile_context_type) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ContextWrapper contextWrapper = (ContextWrapper) obj;
        contextWrapper.getClass();
        ContextWrapper.Origin origin = contextWrapper.origin;
        ContextWrapper.Origin origin2 = origin != null ? (ContextWrapper.Origin) ContextWrapper.Origin.ADAPTER.redact(origin) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = contextWrapper.profile_context_type;
        String str2 = contextWrapper.merchant_flow_token;
        ByteString byteString2 = contextWrapper.context_data;
        String str3 = contextWrapper.referrer_flow_token;
        byteString.getClass();
        return new ContextWrapper(str, str2, byteString2, str3, origin2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ContextWrapper contextWrapper = (ContextWrapper) obj;
        contextWrapper.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, contextWrapper.profile_context_type);
        protoAdapter.encodeWithTag(protoWriter, 2, contextWrapper.merchant_flow_token);
        ProtoAdapter.BYTES.encodeWithTag(protoWriter, 3, contextWrapper.context_data);
        protoAdapter.encodeWithTag(protoWriter, 4, contextWrapper.referrer_flow_token);
        ContextWrapper.Origin.ADAPTER.encodeWithTag(protoWriter, 5, contextWrapper.origin);
        protoWriter.writeBytes(contextWrapper.unknownFields());
    }
}
