package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.kgoose.api.v3.ActionCard;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;
import squareup.cash.ui.arcade.elements.CellDefault;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/CellActionCard$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/CellActionCard;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CellActionCard$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CellActionCard((CellDefault) obj, (ActionCard.CardButtons) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(CellDefault.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(ActionCard.CardButtons.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CellActionCard cellActionCard = (CellActionCard) obj;
        reverseProtoWriter.getClass();
        cellActionCard.getClass();
        reverseProtoWriter.writeBytes(cellActionCard.unknownFields());
        ActionCard.CardButtons.ADAPTER.encodeWithTag(reverseProtoWriter, 2, cellActionCard.card_buttons);
        CellDefault.ADAPTER.encodeWithTag(reverseProtoWriter, 1, cellActionCard.cell);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CellActionCard cellActionCard = (CellActionCard) obj;
        cellActionCard.getClass();
        return ActionCard.CardButtons.ADAPTER.encodedSizeWithTag(2, cellActionCard.card_buttons) + CellDefault.ADAPTER.encodedSizeWithTag(1, cellActionCard.cell) + cellActionCard.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CellActionCard cellActionCard = (CellActionCard) obj;
        cellActionCard.getClass();
        CellDefault cellDefault = cellActionCard.cell;
        CellDefault cellDefault2 = cellDefault != null ? (CellDefault) CellDefault.ADAPTER.redact(cellDefault) : null;
        ActionCard.CardButtons cardButtons = cellActionCard.card_buttons;
        ActionCard.CardButtons cardButtons2 = cardButtons != null ? (ActionCard.CardButtons) ActionCard.CardButtons.ADAPTER.redact(cardButtons) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CellActionCard(cellDefault2, cardButtons2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CellActionCard cellActionCard = (CellActionCard) obj;
        cellActionCard.getClass();
        CellDefault.ADAPTER.encodeWithTag(protoWriter, 1, cellActionCard.cell);
        ActionCard.CardButtons.ADAPTER.encodeWithTag(protoWriter, 2, cellActionCard.card_buttons);
        protoWriter.writeBytes(cellActionCard.unknownFields());
    }
}
