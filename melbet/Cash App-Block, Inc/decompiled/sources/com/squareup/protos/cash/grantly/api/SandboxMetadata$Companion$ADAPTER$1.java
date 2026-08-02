package com.squareup.protos.cash.grantly.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.grantly.api.SandboxMetadata;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SandboxMetadata$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SandboxMetadata(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(SandboxMetadata.Scenario.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SandboxMetadata sandboxMetadata = (SandboxMetadata) obj;
        reverseProtoWriter.getClass();
        sandboxMetadata.getClass();
        reverseProtoWriter.writeBytes(sandboxMetadata.unknownFields());
        SandboxMetadata.Scenario.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, sandboxMetadata.scenarios);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SandboxMetadata sandboxMetadata = (SandboxMetadata) obj;
        sandboxMetadata.getClass();
        return SandboxMetadata.Scenario.ADAPTER.asRepeated().encodedSizeWithTag(1, sandboxMetadata.scenarios) + sandboxMetadata.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SandboxMetadata sandboxMetadata = (SandboxMetadata) obj;
        sandboxMetadata.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(sandboxMetadata.scenarios, SandboxMetadata.Scenario.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SandboxMetadata(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SandboxMetadata sandboxMetadata = (SandboxMetadata) obj;
        sandboxMetadata.getClass();
        SandboxMetadata.Scenario.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, sandboxMetadata.scenarios);
        protoWriter.writeBytes(sandboxMetadata.unknownFields());
    }
}
