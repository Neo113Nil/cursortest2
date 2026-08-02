package com.squareup.protos.cash.postcard;

import com.google.android.gms.internal.mlkit_vision_common.zzkl;
import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CardModule$HeroNullStateModule$UnifiedCardHomeNUX$GridConfig$GridItem$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        zzkl zzklVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardModule.HeroNullStateModule.UnifiedCardHomeNUX.GridConfig.GridItem(zzklVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    zzklVar = new CardModule$HeroNullStateModule$UnifiedCardHomeNUX$GridConfig$GridItem$Type$Tag((CardModule.HeroNullStateModule.UnifiedCardHomeNUX.GridConfig.GridItem.Tag) CardModule.HeroNullStateModule.UnifiedCardHomeNUX.GridConfig.GridItem.Tag.ADAPTER.decode(protoReader));
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                zzklVar = new CardModule$HeroNullStateModule$UnifiedCardHomeNUX$GridConfig$GridItem$Type$Card((CardModule.HeroNullStateModule.UnifiedCardHomeNUX.GridConfig.GridItem.Card) CardModule.HeroNullStateModule.UnifiedCardHomeNUX.GridConfig.GridItem.Card.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardModule.HeroNullStateModule.UnifiedCardHomeNUX.GridConfig.GridItem gridItem = (CardModule.HeroNullStateModule.UnifiedCardHomeNUX.GridConfig.GridItem) obj;
        reverseProtoWriter.getClass();
        gridItem.getClass();
        reverseProtoWriter.writeBytes(gridItem.unknownFields());
        zzkl zzklVar = gridItem.f1332type;
        if (zzklVar instanceof CardModule$HeroNullStateModule$UnifiedCardHomeNUX$GridConfig$GridItem$Type$Tag) {
            CardModule.HeroNullStateModule.UnifiedCardHomeNUX.GridConfig.GridItem.Tag.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((CardModule$HeroNullStateModule$UnifiedCardHomeNUX$GridConfig$GridItem$Type$Tag) zzklVar).value);
        } else if (zzklVar instanceof CardModule$HeroNullStateModule$UnifiedCardHomeNUX$GridConfig$GridItem$Type$Card) {
            CardModule.HeroNullStateModule.UnifiedCardHomeNUX.GridConfig.GridItem.Card.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((CardModule$HeroNullStateModule$UnifiedCardHomeNUX$GridConfig$GridItem$Type$Card) zzklVar).value);
        } else {
            if (zzklVar == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        CardModule.HeroNullStateModule.UnifiedCardHomeNUX.GridConfig.GridItem gridItem = (CardModule.HeroNullStateModule.UnifiedCardHomeNUX.GridConfig.GridItem) obj;
        gridItem.getClass();
        int size$okio = gridItem.unknownFields().getSize$okio();
        zzkl zzklVar = gridItem.f1332type;
        if (zzklVar instanceof CardModule$HeroNullStateModule$UnifiedCardHomeNUX$GridConfig$GridItem$Type$Tag) {
            encodedSizeWithTag = CardModule.HeroNullStateModule.UnifiedCardHomeNUX.GridConfig.GridItem.Tag.ADAPTER.encodedSizeWithTag(1, ((CardModule$HeroNullStateModule$UnifiedCardHomeNUX$GridConfig$GridItem$Type$Tag) zzklVar).value);
        } else {
            if (!(zzklVar instanceof CardModule$HeroNullStateModule$UnifiedCardHomeNUX$GridConfig$GridItem$Type$Card)) {
                if (zzklVar == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = CardModule.HeroNullStateModule.UnifiedCardHomeNUX.GridConfig.GridItem.Card.ADAPTER.encodedSizeWithTag(2, ((CardModule$HeroNullStateModule$UnifiedCardHomeNUX$GridConfig$GridItem$Type$Card) zzklVar).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardModule.HeroNullStateModule.UnifiedCardHomeNUX.GridConfig.GridItem gridItem = (CardModule.HeroNullStateModule.UnifiedCardHomeNUX.GridConfig.GridItem) obj;
        gridItem.getClass();
        ByteString byteString = ByteString.EMPTY;
        zzkl zzklVar = gridItem.f1332type;
        byteString.getClass();
        return new CardModule.HeroNullStateModule.UnifiedCardHomeNUX.GridConfig.GridItem(zzklVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardModule.HeroNullStateModule.UnifiedCardHomeNUX.GridConfig.GridItem gridItem = (CardModule.HeroNullStateModule.UnifiedCardHomeNUX.GridConfig.GridItem) obj;
        gridItem.getClass();
        zzkl zzklVar = gridItem.f1332type;
        if (zzklVar instanceof CardModule$HeroNullStateModule$UnifiedCardHomeNUX$GridConfig$GridItem$Type$Tag) {
            CardModule.HeroNullStateModule.UnifiedCardHomeNUX.GridConfig.GridItem.Tag.ADAPTER.encodeWithTag(protoWriter, 1, ((CardModule$HeroNullStateModule$UnifiedCardHomeNUX$GridConfig$GridItem$Type$Tag) zzklVar).value);
        } else if (zzklVar instanceof CardModule$HeroNullStateModule$UnifiedCardHomeNUX$GridConfig$GridItem$Type$Card) {
            CardModule.HeroNullStateModule.UnifiedCardHomeNUX.GridConfig.GridItem.Card.ADAPTER.encodeWithTag(protoWriter, 2, ((CardModule$HeroNullStateModule$UnifiedCardHomeNUX$GridConfig$GridItem$Type$Card) zzklVar).value);
        } else if (zzklVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(gridItem.unknownFields());
    }
}
