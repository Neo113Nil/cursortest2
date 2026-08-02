package com.squareup.protos.cash.genericelements.ui;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.genericelements.ui.ListUnorderedComponent;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ListUnorderedComponent$Item$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ListUnorderedComponent.Item((String) obj, (String) obj2, (Action) obj3, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(Action.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ListUnorderedComponent.Item item = (ListUnorderedComponent.Item) obj;
        reverseProtoWriter.getClass();
        item.getClass();
        reverseProtoWriter.writeBytes(item.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, item.icon_id);
        Action.ADAPTER.encodeWithTag(reverseProtoWriter, 3, item.onClick);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, item.value);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, item.label);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ListUnorderedComponent.Item item = (ListUnorderedComponent.Item) obj;
        item.getClass();
        int size$okio = item.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(4, item.icon_id) + Action.ADAPTER.encodedSizeWithTag(3, item.onClick) + protoAdapter.encodedSizeWithTag(2, item.value) + protoAdapter.encodedSizeWithTag(1, item.label) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ListUnorderedComponent.Item item = (ListUnorderedComponent.Item) obj;
        item.getClass();
        Action action = item.onClick;
        Action action2 = action != null ? (Action) Action.ADAPTER.redact(action) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = item.label;
        String str2 = item.value;
        String str3 = item.icon_id;
        byteString.getClass();
        return new ListUnorderedComponent.Item(str, str2, action2, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ListUnorderedComponent.Item item = (ListUnorderedComponent.Item) obj;
        item.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, item.label);
        protoAdapter.encodeWithTag(protoWriter, 2, item.value);
        Action.ADAPTER.encodeWithTag(protoWriter, 3, item.onClick);
        protoAdapter.encodeWithTag(protoWriter, 4, item.icon_id);
        protoWriter.writeBytes(item.unknownFields());
    }
}
