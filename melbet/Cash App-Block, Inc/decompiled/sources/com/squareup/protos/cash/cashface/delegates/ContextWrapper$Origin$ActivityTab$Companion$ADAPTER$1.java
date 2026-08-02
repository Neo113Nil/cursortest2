package com.squareup.protos.cash.cashface.delegates;

import com.squareup.protos.cash.cashface.delegates.ContextWrapper;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ContextWrapper$Origin$ActivityTab$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ContextWrapper.Origin.ActivityTab(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ContextWrapper.Origin.ActivityTab activityTab = (ContextWrapper.Origin.ActivityTab) obj;
        reverseProtoWriter.getClass();
        activityTab.getClass();
        reverseProtoWriter.writeBytes(activityTab.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ContextWrapper.Origin.ActivityTab activityTab = (ContextWrapper.Origin.ActivityTab) obj;
        activityTab.getClass();
        return activityTab.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((ContextWrapper.Origin.ActivityTab) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ContextWrapper.Origin.ActivityTab(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ContextWrapper.Origin.ActivityTab activityTab = (ContextWrapper.Origin.ActivityTab) obj;
        activityTab.getClass();
        protoWriter.writeBytes(activityTab.unknownFields());
    }
}
