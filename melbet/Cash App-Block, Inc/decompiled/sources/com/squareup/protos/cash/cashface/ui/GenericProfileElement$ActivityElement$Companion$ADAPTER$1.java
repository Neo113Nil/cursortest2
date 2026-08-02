package com.squareup.protos.cash.cashface.ui;

import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GenericProfileElement$ActivityElement$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GenericProfileElement.ActivityElement(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GenericProfileElement.ActivityElement activityElement = (GenericProfileElement.ActivityElement) obj;
        reverseProtoWriter.getClass();
        activityElement.getClass();
        reverseProtoWriter.writeBytes(activityElement.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GenericProfileElement.ActivityElement activityElement = (GenericProfileElement.ActivityElement) obj;
        activityElement.getClass();
        return activityElement.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((GenericProfileElement.ActivityElement) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GenericProfileElement.ActivityElement(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GenericProfileElement.ActivityElement activityElement = (GenericProfileElement.ActivityElement) obj;
        activityElement.getClass();
        protoWriter.writeBytes(activityElement.unknownFields());
    }
}
