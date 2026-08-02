package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.kgoose.api.v3.ItemizedTable;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/ItemizedTable$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/ItemizedTable;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ItemizedTable$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ItemizedTable(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(ItemizedTable.Row.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ItemizedTable itemizedTable = (ItemizedTable) obj;
        reverseProtoWriter.getClass();
        itemizedTable.getClass();
        reverseProtoWriter.writeBytes(itemizedTable.unknownFields());
        ItemizedTable.Row.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, itemizedTable.rows);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ItemizedTable itemizedTable = (ItemizedTable) obj;
        itemizedTable.getClass();
        return ItemizedTable.Row.ADAPTER.asRepeated().encodedSizeWithTag(1, itemizedTable.rows) + itemizedTable.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ItemizedTable itemizedTable = (ItemizedTable) obj;
        itemizedTable.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(itemizedTable.rows, ItemizedTable.Row.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ItemizedTable(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ItemizedTable itemizedTable = (ItemizedTable) obj;
        itemizedTable.getClass();
        ItemizedTable.Row.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, itemizedTable.rows);
        protoWriter.writeBytes(itemizedTable.unknownFields());
    }
}
