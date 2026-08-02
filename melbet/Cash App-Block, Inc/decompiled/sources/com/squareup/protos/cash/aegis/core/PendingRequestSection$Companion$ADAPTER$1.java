package com.squareup.protos.cash.aegis.core;

import com.google.android.gms.internal.mlkit_vision_barcode.zztj;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PendingRequestSection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        zztj zztjVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PendingRequestSection(zztjVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                zztjVar = new PendingRequestSection$Type$PendingRequest((PendingRequest) PendingRequest.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                zztjVar = new PendingRequestSection$Type$MultiplePendingRequestsRow((MultiplePendingRequestsRow) MultiplePendingRequestsRow.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PendingRequestSection pendingRequestSection = (PendingRequestSection) obj;
        reverseProtoWriter.getClass();
        pendingRequestSection.getClass();
        reverseProtoWriter.writeBytes(pendingRequestSection.unknownFields());
        zztj zztjVar = pendingRequestSection.f1243type;
        if (zztjVar instanceof PendingRequestSection$Type$PendingRequest) {
            PendingRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((PendingRequestSection$Type$PendingRequest) zztjVar).value);
        } else if (zztjVar instanceof PendingRequestSection$Type$MultiplePendingRequestsRow) {
            MultiplePendingRequestsRow.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((PendingRequestSection$Type$MultiplePendingRequestsRow) zztjVar).value);
        } else {
            if (zztjVar == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        PendingRequestSection pendingRequestSection = (PendingRequestSection) obj;
        pendingRequestSection.getClass();
        int size$okio = pendingRequestSection.unknownFields().getSize$okio();
        zztj zztjVar = pendingRequestSection.f1243type;
        if (zztjVar instanceof PendingRequestSection$Type$PendingRequest) {
            encodedSizeWithTag = PendingRequest.ADAPTER.encodedSizeWithTag(1, ((PendingRequestSection$Type$PendingRequest) zztjVar).value);
        } else {
            if (!(zztjVar instanceof PendingRequestSection$Type$MultiplePendingRequestsRow)) {
                if (zztjVar == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = MultiplePendingRequestsRow.ADAPTER.encodedSizeWithTag(2, ((PendingRequestSection$Type$MultiplePendingRequestsRow) zztjVar).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PendingRequestSection pendingRequestSection = (PendingRequestSection) obj;
        pendingRequestSection.getClass();
        ByteString byteString = ByteString.EMPTY;
        zztj zztjVar = pendingRequestSection.f1243type;
        byteString.getClass();
        return new PendingRequestSection(zztjVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PendingRequestSection pendingRequestSection = (PendingRequestSection) obj;
        pendingRequestSection.getClass();
        zztj zztjVar = pendingRequestSection.f1243type;
        if (zztjVar instanceof PendingRequestSection$Type$PendingRequest) {
            PendingRequest.ADAPTER.encodeWithTag(protoWriter, 1, ((PendingRequestSection$Type$PendingRequest) zztjVar).value);
        } else if (zztjVar instanceof PendingRequestSection$Type$MultiplePendingRequestsRow) {
            MultiplePendingRequestsRow.ADAPTER.encodeWithTag(protoWriter, 2, ((PendingRequestSection$Type$MultiplePendingRequestsRow) zztjVar).value);
        } else if (zztjVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(pendingRequestSection.unknownFields());
    }
}
