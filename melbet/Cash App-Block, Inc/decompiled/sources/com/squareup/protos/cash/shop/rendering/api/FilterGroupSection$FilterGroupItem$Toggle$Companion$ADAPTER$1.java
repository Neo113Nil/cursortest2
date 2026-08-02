package com.squareup.protos.cash.shop.rendering.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.shop.rendering.api.FilterGroupSection;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class FilterGroupSection$FilterGroupItem$Toggle$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new FilterGroupSection.FilterGroupItem.Toggle((String) obj, (TapAction) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(TapAction.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        FilterGroupSection.FilterGroupItem.Toggle toggle = (FilterGroupSection.FilterGroupItem.Toggle) obj;
        reverseProtoWriter.getClass();
        toggle.getClass();
        reverseProtoWriter.writeBytes(toggle.unknownFields());
        TapAction.ADAPTER.encodeWithTag(reverseProtoWriter, 2, toggle.tap_action);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, toggle.filter_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        FilterGroupSection.FilterGroupItem.Toggle toggle = (FilterGroupSection.FilterGroupItem.Toggle) obj;
        toggle.getClass();
        return TapAction.ADAPTER.encodedSizeWithTag(2, toggle.tap_action) + ProtoAdapter.STRING.encodedSizeWithTag(1, toggle.filter_token) + toggle.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        FilterGroupSection.FilterGroupItem.Toggle toggle = (FilterGroupSection.FilterGroupItem.Toggle) obj;
        toggle.getClass();
        TapAction tapAction = toggle.tap_action;
        TapAction tapAction2 = tapAction != null ? (TapAction) TapAction.ADAPTER.redact(tapAction) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = toggle.filter_token;
        byteString.getClass();
        return new FilterGroupSection.FilterGroupItem.Toggle(str, tapAction2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        FilterGroupSection.FilterGroupItem.Toggle toggle = (FilterGroupSection.FilterGroupItem.Toggle) obj;
        toggle.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, toggle.filter_token);
        TapAction.ADAPTER.encodeWithTag(protoWriter, 2, toggle.tap_action);
        protoWriter.writeBytes(toggle.unknownFields());
    }
}
