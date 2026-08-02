package com.squareup.protos.cash.registrar.api;

import com.google.android.gms.internal.mlkit_vision_common.zzko;
import com.squareup.protos.cash.registrar.api.StatementCoverage;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes.dex */
public final class StatementCoverage$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        zzko zzkoVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new StatementCoverage(zzkoVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                zzkoVar = new StatementCoverage$Type$Monthly((StatementCoverage.Monthly) StatementCoverage.Monthly.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                zzkoVar = new StatementCoverage$Type$Annual((StatementCoverage.Annual) StatementCoverage.Annual.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        StatementCoverage statementCoverage = (StatementCoverage) obj;
        reverseProtoWriter.getClass();
        statementCoverage.getClass();
        reverseProtoWriter.writeBytes(statementCoverage.unknownFields());
        zzko zzkoVar = statementCoverage.f1334type;
        if (zzkoVar instanceof StatementCoverage$Type$Monthly) {
            StatementCoverage.Monthly.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((StatementCoverage$Type$Monthly) zzkoVar).getValue());
        } else if (zzkoVar instanceof StatementCoverage$Type$Annual) {
            StatementCoverage.Annual.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((StatementCoverage$Type$Annual) zzkoVar).getValue());
        } else {
            if (zzkoVar == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        StatementCoverage statementCoverage = (StatementCoverage) obj;
        statementCoverage.getClass();
        int size$okio = statementCoverage.unknownFields().getSize$okio();
        zzko zzkoVar = statementCoverage.f1334type;
        if (zzkoVar instanceof StatementCoverage$Type$Monthly) {
            encodedSizeWithTag = StatementCoverage.Monthly.ADAPTER.encodedSizeWithTag(1, ((StatementCoverage$Type$Monthly) zzkoVar).getValue());
        } else {
            if (!(zzkoVar instanceof StatementCoverage$Type$Annual)) {
                if (zzkoVar == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = StatementCoverage.Annual.ADAPTER.encodedSizeWithTag(2, ((StatementCoverage$Type$Annual) zzkoVar).getValue());
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        StatementCoverage statementCoverage = (StatementCoverage) obj;
        statementCoverage.getClass();
        ByteString byteString = ByteString.EMPTY;
        zzko zzkoVar = statementCoverage.f1334type;
        byteString.getClass();
        return new StatementCoverage(zzkoVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        StatementCoverage statementCoverage = (StatementCoverage) obj;
        statementCoverage.getClass();
        zzko zzkoVar = statementCoverage.f1334type;
        if (zzkoVar instanceof StatementCoverage$Type$Monthly) {
            StatementCoverage.Monthly.ADAPTER.encodeWithTag(protoWriter, 1, ((StatementCoverage$Type$Monthly) zzkoVar).getValue());
        } else if (zzkoVar instanceof StatementCoverage$Type$Annual) {
            StatementCoverage.Annual.ADAPTER.encodeWithTag(protoWriter, 2, ((StatementCoverage$Type$Annual) zzkoVar).getValue());
        } else if (zzkoVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(statementCoverage.unknownFields());
    }
}
