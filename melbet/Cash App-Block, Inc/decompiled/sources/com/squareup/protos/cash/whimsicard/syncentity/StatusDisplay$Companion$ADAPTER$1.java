package com.squareup.protos.cash.whimsicard.syncentity;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class StatusDisplay$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new StatusDisplay((LocalizedString) obj, (LocalizedString) obj2, (Action) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(Action.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        StatusDisplay statusDisplay = (StatusDisplay) obj;
        reverseProtoWriter.getClass();
        statusDisplay.getClass();
        reverseProtoWriter.writeBytes(statusDisplay.unknownFields());
        Action.ADAPTER.encodeWithTag(reverseProtoWriter, 3, statusDisplay.primary_action);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, statusDisplay.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, statusDisplay.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        StatusDisplay statusDisplay = (StatusDisplay) obj;
        statusDisplay.getClass();
        int size$okio = statusDisplay.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return Action.ADAPTER.encodedSizeWithTag(3, statusDisplay.primary_action) + protoAdapter.encodedSizeWithTag(2, statusDisplay.subtitle) + protoAdapter.encodedSizeWithTag(1, statusDisplay.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        StatusDisplay statusDisplay = (StatusDisplay) obj;
        statusDisplay.getClass();
        LocalizedString localizedString = statusDisplay.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = statusDisplay.subtitle;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        Action action = statusDisplay.primary_action;
        Action action2 = action != null ? (Action) Action.ADAPTER.redact(action) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new StatusDisplay(localizedString2, localizedString4, action2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        StatusDisplay statusDisplay = (StatusDisplay) obj;
        statusDisplay.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, statusDisplay.title);
        protoAdapter.encodeWithTag(protoWriter, 2, statusDisplay.subtitle);
        Action.ADAPTER.encodeWithTag(protoWriter, 3, statusDisplay.primary_action);
        protoWriter.writeBytes(statusDisplay.unknownFields());
    }
}
