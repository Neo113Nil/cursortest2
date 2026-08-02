package com.squareup.protos.cash.local.client.v1;

import com.squareup.protos.cash.local.client.v1.LocalProfileWidget;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalProfileWidget$AboutData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalProfileWidget.AboutData(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalProfileWidget.AboutData aboutData = (LocalProfileWidget.AboutData) obj;
        reverseProtoWriter.getClass();
        aboutData.getClass();
        reverseProtoWriter.writeBytes(aboutData.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalProfileWidget.AboutData aboutData = (LocalProfileWidget.AboutData) obj;
        aboutData.getClass();
        return aboutData.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((LocalProfileWidget.AboutData) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new LocalProfileWidget.AboutData(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalProfileWidget.AboutData aboutData = (LocalProfileWidget.AboutData) obj;
        aboutData.getClass();
        protoWriter.writeBytes(aboutData.unknownFields());
    }
}
