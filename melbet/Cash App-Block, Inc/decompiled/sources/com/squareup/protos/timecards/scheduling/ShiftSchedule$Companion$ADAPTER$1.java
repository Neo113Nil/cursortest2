package com.squareup.protos.timecards.scheduling;

import androidx.room.TransactorKt;
import com.squareup.protos.timecards.scheduling.ShiftSchedule;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ShiftSchedule$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        Object obj2;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ShiftSchedule((String) obj3, (String) obj4, (String) obj5, (ColorScheme) obj6, (ShiftSchedule.Version) obj7, (ShiftSchedule.Version) obj8, (Boolean) obj9, (String) obj10, (String) obj11, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 2:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 3:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 4:
                    obj7 = TransactorKt.decodeMessageOrMerge(ShiftSchedule.Version.ADAPTER, protoReader, obj7);
                    continue;
                case 5:
                    obj8 = TransactorKt.decodeMessageOrMerge(ShiftSchedule.Version.ADAPTER, protoReader, obj8);
                    continue;
                case 6:
                    obj10 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 7:
                    obj11 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 8:
                    obj9 = ProtoAdapter.BOOL.decode(protoReader);
                    continue;
                case 9:
                    try {
                        obj6 = ColorScheme.ADAPTER.decode(protoReader);
                        continue;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        obj = obj3;
                        obj2 = obj4;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj3;
                    obj2 = obj4;
                    break;
            }
            obj3 = obj;
            obj4 = obj2;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ShiftSchedule shiftSchedule = (ShiftSchedule) obj;
        reverseProtoWriter.getClass();
        shiftSchedule.getClass();
        reverseProtoWriter.writeBytes(shiftSchedule.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, shiftSchedule.updated_at);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, shiftSchedule.created_at);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 8, shiftSchedule.deleted);
        ProtoAdapter protoAdapter2 = ShiftSchedule.Version.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, shiftSchedule.published_version);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, shiftSchedule.latest_version);
        ColorScheme.ADAPTER.encodeWithTag(reverseProtoWriter, 9, shiftSchedule.color_scheme);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, shiftSchedule.merchant_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, shiftSchedule.shift_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, shiftSchedule.id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ShiftSchedule shiftSchedule = (ShiftSchedule) obj;
        shiftSchedule.getClass();
        int size$okio = shiftSchedule.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = ColorScheme.ADAPTER.encodedSizeWithTag(9, shiftSchedule.color_scheme) + protoAdapter.encodedSizeWithTag(3, shiftSchedule.merchant_id) + protoAdapter.encodedSizeWithTag(2, shiftSchedule.shift_id) + protoAdapter.encodedSizeWithTag(1, shiftSchedule.id) + size$okio;
        ProtoAdapter protoAdapter2 = ShiftSchedule.Version.ADAPTER;
        return protoAdapter.encodedSizeWithTag(7, shiftSchedule.updated_at) + protoAdapter.encodedSizeWithTag(6, shiftSchedule.created_at) + ProtoAdapter.BOOL.encodedSizeWithTag(8, shiftSchedule.deleted) + protoAdapter2.encodedSizeWithTag(5, shiftSchedule.published_version) + protoAdapter2.encodedSizeWithTag(4, shiftSchedule.latest_version) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ShiftSchedule shiftSchedule = (ShiftSchedule) obj;
        shiftSchedule.getClass();
        ShiftSchedule.Version version = shiftSchedule.latest_version;
        ShiftSchedule.Version version2 = version != null ? (ShiftSchedule.Version) ShiftSchedule.Version.ADAPTER.redact(version) : null;
        ShiftSchedule.Version version3 = shiftSchedule.published_version;
        ShiftSchedule.Version version4 = version3 != null ? (ShiftSchedule.Version) ShiftSchedule.Version.ADAPTER.redact(version3) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = shiftSchedule.id;
        String str2 = shiftSchedule.shift_id;
        String str3 = shiftSchedule.merchant_id;
        ColorScheme colorScheme = shiftSchedule.color_scheme;
        Boolean bool = shiftSchedule.deleted;
        String str4 = shiftSchedule.created_at;
        String str5 = shiftSchedule.updated_at;
        byteString.getClass();
        return new ShiftSchedule(str, str2, str3, colorScheme, version2, version4, bool, str4, str5, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ShiftSchedule shiftSchedule = (ShiftSchedule) obj;
        shiftSchedule.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, shiftSchedule.id);
        protoAdapter.encodeWithTag(protoWriter, 2, shiftSchedule.shift_id);
        protoAdapter.encodeWithTag(protoWriter, 3, shiftSchedule.merchant_id);
        ColorScheme.ADAPTER.encodeWithTag(protoWriter, 9, shiftSchedule.color_scheme);
        ProtoAdapter protoAdapter2 = ShiftSchedule.Version.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 4, shiftSchedule.latest_version);
        protoAdapter2.encodeWithTag(protoWriter, 5, shiftSchedule.published_version);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, shiftSchedule.deleted);
        protoAdapter.encodeWithTag(protoWriter, 6, shiftSchedule.created_at);
        protoAdapter.encodeWithTag(protoWriter, 7, shiftSchedule.updated_at);
        protoWriter.writeBytes(shiftSchedule.unknownFields());
    }
}
