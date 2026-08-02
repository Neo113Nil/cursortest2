package com.squareup.protos.cash.aegis.core;

import app.cash.local.primitives.BrandCardDetailsKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SubsectionBlock$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        BrandCardDetailsKt brandCardDetailsKt = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SubsectionBlock(brandCardDetailsKt, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                brandCardDetailsKt = new SubsectionBlock$Type$Paragraph((LocalizedString) LocalizedString.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                brandCardDetailsKt = new SubsectionBlock$Type$BulletPoints((BulletPoints) BulletPoints.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SubsectionBlock subsectionBlock = (SubsectionBlock) obj;
        reverseProtoWriter.getClass();
        subsectionBlock.getClass();
        reverseProtoWriter.writeBytes(subsectionBlock.unknownFields());
        BrandCardDetailsKt brandCardDetailsKt = subsectionBlock.f1244type;
        if (brandCardDetailsKt instanceof SubsectionBlock$Type$Paragraph) {
            LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((SubsectionBlock$Type$Paragraph) brandCardDetailsKt).value);
        } else if (brandCardDetailsKt instanceof SubsectionBlock$Type$BulletPoints) {
            BulletPoints.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((SubsectionBlock$Type$BulletPoints) brandCardDetailsKt).value);
        } else {
            if (brandCardDetailsKt == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        SubsectionBlock subsectionBlock = (SubsectionBlock) obj;
        subsectionBlock.getClass();
        int size$okio = subsectionBlock.unknownFields().getSize$okio();
        BrandCardDetailsKt brandCardDetailsKt = subsectionBlock.f1244type;
        if (brandCardDetailsKt instanceof SubsectionBlock$Type$Paragraph) {
            encodedSizeWithTag = LocalizedString.ADAPTER.encodedSizeWithTag(1, ((SubsectionBlock$Type$Paragraph) brandCardDetailsKt).value);
        } else {
            if (!(brandCardDetailsKt instanceof SubsectionBlock$Type$BulletPoints)) {
                if (brandCardDetailsKt == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = BulletPoints.ADAPTER.encodedSizeWithTag(2, ((SubsectionBlock$Type$BulletPoints) brandCardDetailsKt).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SubsectionBlock subsectionBlock = (SubsectionBlock) obj;
        subsectionBlock.getClass();
        ByteString byteString = ByteString.EMPTY;
        BrandCardDetailsKt brandCardDetailsKt = subsectionBlock.f1244type;
        byteString.getClass();
        return new SubsectionBlock(brandCardDetailsKt, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SubsectionBlock subsectionBlock = (SubsectionBlock) obj;
        subsectionBlock.getClass();
        BrandCardDetailsKt brandCardDetailsKt = subsectionBlock.f1244type;
        if (brandCardDetailsKt instanceof SubsectionBlock$Type$Paragraph) {
            LocalizedString.ADAPTER.encodeWithTag(protoWriter, 1, ((SubsectionBlock$Type$Paragraph) brandCardDetailsKt).value);
        } else if (brandCardDetailsKt instanceof SubsectionBlock$Type$BulletPoints) {
            BulletPoints.ADAPTER.encodeWithTag(protoWriter, 2, ((SubsectionBlock$Type$BulletPoints) brandCardDetailsKt).value);
        } else if (brandCardDetailsKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(subsectionBlock.unknownFields());
    }
}
