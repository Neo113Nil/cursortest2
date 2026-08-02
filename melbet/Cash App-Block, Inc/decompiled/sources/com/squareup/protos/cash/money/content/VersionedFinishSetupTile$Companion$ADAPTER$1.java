package com.squareup.protos.cash.money.content;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class VersionedFinishSetupTile$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        VersionedFinishSetupTile$Payload$V1 versionedFinishSetupTile$Payload$V1 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new VersionedFinishSetupTile(versionedFinishSetupTile$Payload$V1, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                versionedFinishSetupTile$Payload$V1 = new VersionedFinishSetupTile$Payload$V1((FinishSetupTileV1) FinishSetupTileV1.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        VersionedFinishSetupTile versionedFinishSetupTile = (VersionedFinishSetupTile) obj;
        reverseProtoWriter.getClass();
        versionedFinishSetupTile.getClass();
        reverseProtoWriter.writeBytes(versionedFinishSetupTile.unknownFields());
        VersionedFinishSetupTile$Payload$V1 versionedFinishSetupTile$Payload$V1 = versionedFinishSetupTile.payload;
        if (versionedFinishSetupTile$Payload$V1 != null) {
            FinishSetupTileV1.ADAPTER.encodeWithTag(reverseProtoWriter, 1, versionedFinishSetupTile$Payload$V1.value);
        } else {
            if (versionedFinishSetupTile$Payload$V1 == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        VersionedFinishSetupTile versionedFinishSetupTile = (VersionedFinishSetupTile) obj;
        versionedFinishSetupTile.getClass();
        int size$okio = versionedFinishSetupTile.unknownFields().getSize$okio();
        VersionedFinishSetupTile$Payload$V1 versionedFinishSetupTile$Payload$V1 = versionedFinishSetupTile.payload;
        if (versionedFinishSetupTile$Payload$V1 != null) {
            return FinishSetupTileV1.ADAPTER.encodedSizeWithTag(1, versionedFinishSetupTile$Payload$V1.value) + size$okio;
        }
        if (versionedFinishSetupTile$Payload$V1 == null) {
            return size$okio;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        VersionedFinishSetupTile versionedFinishSetupTile = (VersionedFinishSetupTile) obj;
        versionedFinishSetupTile.getClass();
        ByteString byteString = ByteString.EMPTY;
        VersionedFinishSetupTile$Payload$V1 versionedFinishSetupTile$Payload$V1 = versionedFinishSetupTile.payload;
        byteString.getClass();
        return new VersionedFinishSetupTile(versionedFinishSetupTile$Payload$V1, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        VersionedFinishSetupTile versionedFinishSetupTile = (VersionedFinishSetupTile) obj;
        versionedFinishSetupTile.getClass();
        VersionedFinishSetupTile$Payload$V1 versionedFinishSetupTile$Payload$V1 = versionedFinishSetupTile.payload;
        if (versionedFinishSetupTile$Payload$V1 != null) {
            FinishSetupTileV1.ADAPTER.encodeWithTag(protoWriter, 1, versionedFinishSetupTile$Payload$V1.value);
        } else if (versionedFinishSetupTile$Payload$V1 != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(versionedFinishSetupTile.unknownFields());
    }
}
