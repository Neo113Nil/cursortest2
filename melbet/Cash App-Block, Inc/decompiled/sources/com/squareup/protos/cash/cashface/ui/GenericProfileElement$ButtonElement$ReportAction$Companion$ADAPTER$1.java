package com.squareup.protos.cash.cashface.ui;

import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GenericProfileElement$ButtonElement$ReportAction$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GenericProfileElement.ButtonElement.ReportAction(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GenericProfileElement.ButtonElement.ReportAction reportAction = (GenericProfileElement.ButtonElement.ReportAction) obj;
        reverseProtoWriter.getClass();
        reportAction.getClass();
        reverseProtoWriter.writeBytes(reportAction.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GenericProfileElement.ButtonElement.ReportAction reportAction = (GenericProfileElement.ButtonElement.ReportAction) obj;
        reportAction.getClass();
        return reportAction.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((GenericProfileElement.ButtonElement.ReportAction) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GenericProfileElement.ButtonElement.ReportAction(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GenericProfileElement.ButtonElement.ReportAction reportAction = (GenericProfileElement.ButtonElement.ReportAction) obj;
        reportAction.getClass();
        protoWriter.writeBytes(reportAction.unknownFields());
    }
}
