package com.squareup.protos.cash.aegis.sync_values;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class FamilyTileContent$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        FamilyTileContent$Type$SponsorTileContent familyTileContent$Type$SponsorTileContent = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new FamilyTileContent(familyTileContent$Type$SponsorTileContent, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                familyTileContent$Type$SponsorTileContent = new FamilyTileContent$Type$SponsorTileContent((SponsorTileContent) SponsorTileContent.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        FamilyTileContent familyTileContent = (FamilyTileContent) obj;
        reverseProtoWriter.getClass();
        familyTileContent.getClass();
        reverseProtoWriter.writeBytes(familyTileContent.unknownFields());
        FamilyTileContent$Type$SponsorTileContent familyTileContent$Type$SponsorTileContent = familyTileContent.f1247type;
        if (familyTileContent$Type$SponsorTileContent != null) {
            SponsorTileContent.ADAPTER.encodeWithTag(reverseProtoWriter, 1, familyTileContent$Type$SponsorTileContent.value);
        } else {
            if (familyTileContent$Type$SponsorTileContent == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        FamilyTileContent familyTileContent = (FamilyTileContent) obj;
        familyTileContent.getClass();
        int size$okio = familyTileContent.unknownFields().getSize$okio();
        FamilyTileContent$Type$SponsorTileContent familyTileContent$Type$SponsorTileContent = familyTileContent.f1247type;
        if (familyTileContent$Type$SponsorTileContent != null) {
            return SponsorTileContent.ADAPTER.encodedSizeWithTag(1, familyTileContent$Type$SponsorTileContent.value) + size$okio;
        }
        if (familyTileContent$Type$SponsorTileContent == null) {
            return size$okio;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        FamilyTileContent familyTileContent = (FamilyTileContent) obj;
        familyTileContent.getClass();
        ByteString byteString = ByteString.EMPTY;
        FamilyTileContent$Type$SponsorTileContent familyTileContent$Type$SponsorTileContent = familyTileContent.f1247type;
        byteString.getClass();
        return new FamilyTileContent(familyTileContent$Type$SponsorTileContent, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        FamilyTileContent familyTileContent = (FamilyTileContent) obj;
        familyTileContent.getClass();
        FamilyTileContent$Type$SponsorTileContent familyTileContent$Type$SponsorTileContent = familyTileContent.f1247type;
        if (familyTileContent$Type$SponsorTileContent != null) {
            SponsorTileContent.ADAPTER.encodeWithTag(protoWriter, 1, familyTileContent$Type$SponsorTileContent.value);
        } else if (familyTileContent$Type$SponsorTileContent != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(familyTileContent.unknownFields());
    }
}
