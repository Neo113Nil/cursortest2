package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.kgoose.api.v3.CellList;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/CellList$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/CellList;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CellList$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CellList(m, (Boolean) obj, (Integer) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(CellList.TappableCell.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.INT32.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CellList cellList = (CellList) obj;
        reverseProtoWriter.getClass();
        cellList.getClass();
        reverseProtoWriter.writeBytes(cellList.unknownFields());
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 3, cellList.version);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, cellList.show_as_pinned_suggestions);
        CellList.TappableCell.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, cellList.cells);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CellList cellList = (CellList) obj;
        cellList.getClass();
        return ProtoAdapter.INT32.encodedSizeWithTag(3, cellList.version) + ProtoAdapter.BOOL.encodedSizeWithTag(2, cellList.show_as_pinned_suggestions) + CellList.TappableCell.ADAPTER.asRepeated().encodedSizeWithTag(1, cellList.cells) + cellList.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CellList cellList = (CellList) obj;
        cellList.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(cellList.cells, CellList.TappableCell.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = cellList.show_as_pinned_suggestions;
        Integer num = cellList.version;
        byteString.getClass();
        return new CellList(m1169redactElements, bool, num, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CellList cellList = (CellList) obj;
        cellList.getClass();
        CellList.TappableCell.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, cellList.cells);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, cellList.show_as_pinned_suggestions);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, cellList.version);
        protoWriter.writeBytes(cellList.unknownFields());
    }
}
