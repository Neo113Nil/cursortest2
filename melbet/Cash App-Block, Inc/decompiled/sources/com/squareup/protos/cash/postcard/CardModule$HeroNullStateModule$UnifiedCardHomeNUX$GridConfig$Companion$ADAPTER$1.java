package com.squareup.protos.cash.postcard;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CardModule$HeroNullStateModule$UnifiedCardHomeNUX$GridConfig$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardModule.HeroNullStateModule.UnifiedCardHomeNUX.GridConfig(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(CardModule.HeroNullStateModule.UnifiedCardHomeNUX.GridConfig.GridItem.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardModule.HeroNullStateModule.UnifiedCardHomeNUX.GridConfig gridConfig = (CardModule.HeroNullStateModule.UnifiedCardHomeNUX.GridConfig) obj;
        reverseProtoWriter.getClass();
        gridConfig.getClass();
        reverseProtoWriter.writeBytes(gridConfig.unknownFields());
        CardModule.HeroNullStateModule.UnifiedCardHomeNUX.GridConfig.GridItem.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, gridConfig.items);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardModule.HeroNullStateModule.UnifiedCardHomeNUX.GridConfig gridConfig = (CardModule.HeroNullStateModule.UnifiedCardHomeNUX.GridConfig) obj;
        gridConfig.getClass();
        return CardModule.HeroNullStateModule.UnifiedCardHomeNUX.GridConfig.GridItem.ADAPTER.asRepeated().encodedSizeWithTag(1, gridConfig.items) + gridConfig.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardModule.HeroNullStateModule.UnifiedCardHomeNUX.GridConfig gridConfig = (CardModule.HeroNullStateModule.UnifiedCardHomeNUX.GridConfig) obj;
        gridConfig.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(gridConfig.items, CardModule.HeroNullStateModule.UnifiedCardHomeNUX.GridConfig.GridItem.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CardModule.HeroNullStateModule.UnifiedCardHomeNUX.GridConfig(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardModule.HeroNullStateModule.UnifiedCardHomeNUX.GridConfig gridConfig = (CardModule.HeroNullStateModule.UnifiedCardHomeNUX.GridConfig) obj;
        gridConfig.getClass();
        CardModule.HeroNullStateModule.UnifiedCardHomeNUX.GridConfig.GridItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, gridConfig.items);
        protoWriter.writeBytes(gridConfig.unknownFields());
    }
}
