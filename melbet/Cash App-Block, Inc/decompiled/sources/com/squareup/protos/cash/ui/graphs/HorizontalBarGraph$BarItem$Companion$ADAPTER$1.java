package com.squareup.protos.cash.ui.graphs;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.graphs.HorizontalBarGraph;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class HorizontalBarGraph$BarItem$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new HorizontalBarGraph.BarItem((LocalizedString) obj, (Long) obj2, (LocalizedString) obj3, (UiAvatar) obj4, (String) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 2) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 3) {
                obj2 = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag == 4) {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
            } else if (nextTag == 5) {
                obj4 = TransactorKt.decodeMessageOrMerge(UiAvatar.ADAPTER, protoReader, obj4);
            } else if (nextTag != 6) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        HorizontalBarGraph.BarItem barItem = (HorizontalBarGraph.BarItem) obj;
        reverseProtoWriter.getClass();
        barItem.getClass();
        reverseProtoWriter.writeBytes(barItem.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 6, barItem.client_route);
        UiAvatar.ADAPTER.encodeWithTag(reverseProtoWriter, 5, barItem.avatar);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, barItem.text);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 3, barItem.value);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, barItem.name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        HorizontalBarGraph.BarItem barItem = (HorizontalBarGraph.BarItem) obj;
        barItem.getClass();
        int size$okio = barItem.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return ProtoAdapter.STRING.encodedSizeWithTag(6, barItem.client_route) + UiAvatar.ADAPTER.encodedSizeWithTag(5, barItem.avatar) + protoAdapter.encodedSizeWithTag(4, barItem.text) + ProtoAdapter.INT64.encodedSizeWithTag(3, barItem.value) + protoAdapter.encodedSizeWithTag(2, barItem.name) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        HorizontalBarGraph.BarItem barItem = (HorizontalBarGraph.BarItem) obj;
        barItem.getClass();
        LocalizedString localizedString = barItem.name;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = barItem.text;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        UiAvatar uiAvatar = barItem.avatar;
        UiAvatar uiAvatar2 = uiAvatar != null ? (UiAvatar) UiAvatar.ADAPTER.redact(uiAvatar) : null;
        ByteString byteString = ByteString.EMPTY;
        Long l = barItem.value;
        String str = barItem.client_route;
        byteString.getClass();
        return new HorizontalBarGraph.BarItem(localizedString2, l, localizedString4, uiAvatar2, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        HorizontalBarGraph.BarItem barItem = (HorizontalBarGraph.BarItem) obj;
        barItem.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, barItem.name);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, barItem.value);
        protoAdapter.encodeWithTag(protoWriter, 4, barItem.text);
        UiAvatar.ADAPTER.encodeWithTag(protoWriter, 5, barItem.avatar);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, barItem.client_route);
        protoWriter.writeBytes(barItem.unknownFields());
    }
}
