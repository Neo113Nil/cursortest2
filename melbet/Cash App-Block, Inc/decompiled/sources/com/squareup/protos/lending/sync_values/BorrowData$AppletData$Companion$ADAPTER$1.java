package com.squareup.protos.lending.sync_values;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.lending.sync_values.BorrowData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class BorrowData$AppletData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BorrowData.AppletData(m, arrayList, (LocalizedString) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(BorrowData.AppletData.EntryPointData.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                try {
                    BorrowData.TileType.ADAPTER.tryDecode(protoReader, arrayList);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BorrowData.AppletData appletData = (BorrowData.AppletData) obj;
        reverseProtoWriter.getClass();
        appletData.getClass();
        reverseProtoWriter.writeBytes(appletData.unknownFields());
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 3, appletData.title);
        BorrowData.TileType.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, appletData.vertical_layout);
        BorrowData.AppletData.EntryPointData.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, appletData.entry_points);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BorrowData.AppletData appletData = (BorrowData.AppletData) obj;
        appletData.getClass();
        return LocalizedString.ADAPTER.encodedSizeWithTag(3, appletData.title) + BorrowData.TileType.ADAPTER.asRepeated().encodedSizeWithTag(2, appletData.vertical_layout) + BorrowData.AppletData.EntryPointData.ADAPTER.asRepeated().encodedSizeWithTag(1, appletData.entry_points) + appletData.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BorrowData.AppletData appletData = (BorrowData.AppletData) obj;
        appletData.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(appletData.entry_points, BorrowData.AppletData.EntryPointData.ADAPTER);
        LocalizedString localizedString = appletData.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ByteString byteString = ByteString.EMPTY;
        List list = appletData.vertical_layout;
        list.getClass();
        byteString.getClass();
        return new BorrowData.AppletData(m1169redactElements, list, localizedString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BorrowData.AppletData appletData = (BorrowData.AppletData) obj;
        appletData.getClass();
        BorrowData.AppletData.EntryPointData.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, appletData.entry_points);
        BorrowData.TileType.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, appletData.vertical_layout);
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 3, appletData.title);
        protoWriter.writeBytes(appletData.unknownFields());
    }
}
