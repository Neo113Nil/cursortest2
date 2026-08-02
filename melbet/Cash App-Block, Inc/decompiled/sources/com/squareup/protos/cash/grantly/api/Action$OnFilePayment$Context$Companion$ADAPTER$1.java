package com.squareup.protos.cash.grantly.api;

import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Action$OnFilePayment$Context$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Action.OnFilePayment.Context((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Action.OnFilePayment.Context context = (Action.OnFilePayment.Context) obj;
        reverseProtoWriter.getClass();
        context.getClass();
        reverseProtoWriter.writeBytes(context.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, context.order_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Action.OnFilePayment.Context context = (Action.OnFilePayment.Context) obj;
        context.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, context.order_id) + context.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Action.OnFilePayment.Context context = (Action.OnFilePayment.Context) obj;
        context.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = context.order_id;
        byteString.getClass();
        return new Action.OnFilePayment.Context(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Action.OnFilePayment.Context context = (Action.OnFilePayment.Context) obj;
        context.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, context.order_id);
        protoWriter.writeBytes(context.unknownFields());
    }
}
