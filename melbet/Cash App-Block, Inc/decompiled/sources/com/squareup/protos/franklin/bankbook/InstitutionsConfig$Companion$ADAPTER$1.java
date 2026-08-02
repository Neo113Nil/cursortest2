package com.squareup.protos.franklin.bankbook;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class InstitutionsConfig$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InstitutionsConfig(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(Institution.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InstitutionsConfig institutionsConfig = (InstitutionsConfig) obj;
        reverseProtoWriter.getClass();
        institutionsConfig.getClass();
        reverseProtoWriter.writeBytes(institutionsConfig.unknownFields());
        Institution.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, institutionsConfig.institutions);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InstitutionsConfig institutionsConfig = (InstitutionsConfig) obj;
        institutionsConfig.getClass();
        return Institution.ADAPTER.asRepeated().encodedSizeWithTag(1, institutionsConfig.institutions) + institutionsConfig.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InstitutionsConfig institutionsConfig = (InstitutionsConfig) obj;
        institutionsConfig.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(institutionsConfig.institutions, Institution.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new InstitutionsConfig(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InstitutionsConfig institutionsConfig = (InstitutionsConfig) obj;
        institutionsConfig.getClass();
        Institution.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, institutionsConfig.institutions);
        protoWriter.writeBytes(institutionsConfig.unknownFields());
    }
}
