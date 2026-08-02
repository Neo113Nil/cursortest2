package com.squareup.protos.cash.compass.api;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CellTowerInfo$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CellTowerInfo((Integer) obj, (Integer) obj2, (Long) obj3, (Integer) obj4, (Integer) obj5, (Integer) obj6, (Boolean) obj7, (RadioType) obj8, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.INT32.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.INT32.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 4:
                    obj4 = ProtoAdapter.INT32.decode(protoReader);
                    break;
                case 5:
                    obj5 = ProtoAdapter.INT32.decode(protoReader);
                    break;
                case 6:
                    obj6 = ProtoAdapter.INT32.decode(protoReader);
                    break;
                case 7:
                    obj7 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 8:
                    try {
                        obj8 = RadioType.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CellTowerInfo cellTowerInfo = (CellTowerInfo) obj;
        reverseProtoWriter.getClass();
        cellTowerInfo.getClass();
        reverseProtoWriter.writeBytes(cellTowerInfo.unknownFields());
        RadioType.ADAPTER.encodeWithTag(reverseProtoWriter, 8, cellTowerInfo.radio_type);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 7, cellTowerInfo.is_registered);
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, cellTowerInfo.signal_strength_dbm);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, cellTowerInfo.physical_cell_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, cellTowerInfo.area_code);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 3, cellTowerInfo.cell_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, cellTowerInfo.mnc);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, cellTowerInfo.mcc);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CellTowerInfo cellTowerInfo = (CellTowerInfo) obj;
        cellTowerInfo.getClass();
        int size$okio = cellTowerInfo.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        return RadioType.ADAPTER.encodedSizeWithTag(8, cellTowerInfo.radio_type) + ProtoAdapter.BOOL.encodedSizeWithTag(7, cellTowerInfo.is_registered) + protoAdapter.encodedSizeWithTag(6, cellTowerInfo.signal_strength_dbm) + protoAdapter.encodedSizeWithTag(5, cellTowerInfo.physical_cell_id) + protoAdapter.encodedSizeWithTag(4, cellTowerInfo.area_code) + ProtoAdapter.INT64.encodedSizeWithTag(3, cellTowerInfo.cell_id) + protoAdapter.encodedSizeWithTag(2, cellTowerInfo.mnc) + protoAdapter.encodedSizeWithTag(1, cellTowerInfo.mcc) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CellTowerInfo cellTowerInfo = (CellTowerInfo) obj;
        cellTowerInfo.getClass();
        ByteString byteString = ByteString.EMPTY;
        Integer num = cellTowerInfo.signal_strength_dbm;
        Boolean bool = cellTowerInfo.is_registered;
        RadioType radioType = cellTowerInfo.radio_type;
        byteString.getClass();
        return new CellTowerInfo(null, null, null, null, null, num, bool, radioType, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CellTowerInfo cellTowerInfo = (CellTowerInfo) obj;
        cellTowerInfo.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, cellTowerInfo.mcc);
        protoAdapter.encodeWithTag(protoWriter, 2, cellTowerInfo.mnc);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, cellTowerInfo.cell_id);
        protoAdapter.encodeWithTag(protoWriter, 4, cellTowerInfo.area_code);
        protoAdapter.encodeWithTag(protoWriter, 5, cellTowerInfo.physical_cell_id);
        protoAdapter.encodeWithTag(protoWriter, 6, cellTowerInfo.signal_strength_dbm);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, cellTowerInfo.is_registered);
        RadioType.ADAPTER.encodeWithTag(protoWriter, 8, cellTowerInfo.radio_type);
        protoWriter.writeBytes(cellTowerInfo.unknownFields());
    }
}
