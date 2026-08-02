package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzhu;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class EducationalSheetImage$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        zzhu zzhuVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new EducationalSheetImage(zzhuVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                zzhuVar = new EducationalSheetImage$Image$TiledHeroImage((TiledHeroImage) TiledHeroImage.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                zzhuVar = new EducationalSheetImage$Image$MiniCard((LocalMiniCard) LocalMiniCard.ADAPTER.decode(protoReader));
            } else if (nextTag == 3) {
                zzhuVar = new EducationalSheetImage$Image$HeroImage((LocalImage) LocalImage.ADAPTER.decode(protoReader));
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                zzhuVar = new EducationalSheetImage$Image$FullBleedHeroImage((LocalImage) LocalImage.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        EducationalSheetImage educationalSheetImage = (EducationalSheetImage) obj;
        reverseProtoWriter.getClass();
        educationalSheetImage.getClass();
        reverseProtoWriter.writeBytes(educationalSheetImage.unknownFields());
        zzhu zzhuVar = educationalSheetImage.image;
        if (zzhuVar instanceof EducationalSheetImage$Image$TiledHeroImage) {
            TiledHeroImage.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((EducationalSheetImage$Image$TiledHeroImage) zzhuVar).value);
            return;
        }
        if (zzhuVar instanceof EducationalSheetImage$Image$MiniCard) {
            LocalMiniCard.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((EducationalSheetImage$Image$MiniCard) zzhuVar).value);
            return;
        }
        if (zzhuVar instanceof EducationalSheetImage$Image$HeroImage) {
            LocalImage.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((EducationalSheetImage$Image$HeroImage) zzhuVar).value);
        } else if (zzhuVar instanceof EducationalSheetImage$Image$FullBleedHeroImage) {
            LocalImage.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((EducationalSheetImage$Image$FullBleedHeroImage) zzhuVar).value);
        } else {
            if (zzhuVar == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        EducationalSheetImage educationalSheetImage = (EducationalSheetImage) obj;
        educationalSheetImage.getClass();
        int size$okio = educationalSheetImage.unknownFields().getSize$okio();
        zzhu zzhuVar = educationalSheetImage.image;
        if (zzhuVar instanceof EducationalSheetImage$Image$TiledHeroImage) {
            encodedSizeWithTag = TiledHeroImage.ADAPTER.encodedSizeWithTag(1, ((EducationalSheetImage$Image$TiledHeroImage) zzhuVar).value);
        } else if (zzhuVar instanceof EducationalSheetImage$Image$MiniCard) {
            encodedSizeWithTag = LocalMiniCard.ADAPTER.encodedSizeWithTag(2, ((EducationalSheetImage$Image$MiniCard) zzhuVar).value);
        } else if (zzhuVar instanceof EducationalSheetImage$Image$HeroImage) {
            encodedSizeWithTag = LocalImage.ADAPTER.encodedSizeWithTag(3, ((EducationalSheetImage$Image$HeroImage) zzhuVar).value);
        } else {
            if (!(zzhuVar instanceof EducationalSheetImage$Image$FullBleedHeroImage)) {
                if (zzhuVar == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = LocalImage.ADAPTER.encodedSizeWithTag(4, ((EducationalSheetImage$Image$FullBleedHeroImage) zzhuVar).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        EducationalSheetImage educationalSheetImage = (EducationalSheetImage) obj;
        educationalSheetImage.getClass();
        ByteString byteString = ByteString.EMPTY;
        zzhu zzhuVar = educationalSheetImage.image;
        byteString.getClass();
        return new EducationalSheetImage(zzhuVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        EducationalSheetImage educationalSheetImage = (EducationalSheetImage) obj;
        educationalSheetImage.getClass();
        zzhu zzhuVar = educationalSheetImage.image;
        if (zzhuVar instanceof EducationalSheetImage$Image$TiledHeroImage) {
            TiledHeroImage.ADAPTER.encodeWithTag(protoWriter, 1, ((EducationalSheetImage$Image$TiledHeroImage) zzhuVar).value);
        } else if (zzhuVar instanceof EducationalSheetImage$Image$MiniCard) {
            LocalMiniCard.ADAPTER.encodeWithTag(protoWriter, 2, ((EducationalSheetImage$Image$MiniCard) zzhuVar).value);
        } else if (zzhuVar instanceof EducationalSheetImage$Image$HeroImage) {
            LocalImage.ADAPTER.encodeWithTag(protoWriter, 3, ((EducationalSheetImage$Image$HeroImage) zzhuVar).value);
        } else if (zzhuVar instanceof EducationalSheetImage$Image$FullBleedHeroImage) {
            LocalImage.ADAPTER.encodeWithTag(protoWriter, 4, ((EducationalSheetImage$Image$FullBleedHeroImage) zzhuVar).value);
        } else if (zzhuVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(educationalSheetImage.unknownFields());
    }
}
