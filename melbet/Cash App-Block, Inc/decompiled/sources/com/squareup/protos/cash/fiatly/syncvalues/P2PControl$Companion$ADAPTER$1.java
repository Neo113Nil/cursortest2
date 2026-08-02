package com.squareup.protos.cash.fiatly.syncvalues;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class P2PControl$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new P2PControl((Boolean) obj, (LocalizedString) obj2, (Long) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        P2PControl p2PControl = (P2PControl) obj;
        reverseProtoWriter.getClass();
        p2PControl.getClass();
        reverseProtoWriter.writeBytes(p2PControl.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 3, p2PControl.limit_amount_cents);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 2, p2PControl.limit_helper_text);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, p2PControl.enabled);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        P2PControl p2PControl = (P2PControl) obj;
        p2PControl.getClass();
        return ProtoAdapter.INT64.encodedSizeWithTag(3, p2PControl.limit_amount_cents) + LocalizedString.ADAPTER.encodedSizeWithTag(2, p2PControl.limit_helper_text) + ProtoAdapter.BOOL.encodedSizeWithTag(1, p2PControl.enabled) + p2PControl.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        P2PControl p2PControl = (P2PControl) obj;
        p2PControl.getClass();
        LocalizedString localizedString = p2PControl.limit_helper_text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = p2PControl.enabled;
        Long l = p2PControl.limit_amount_cents;
        byteString.getClass();
        return new P2PControl(bool, localizedString2, l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        P2PControl p2PControl = (P2PControl) obj;
        p2PControl.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, p2PControl.enabled);
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 2, p2PControl.limit_helper_text);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, p2PControl.limit_amount_cents);
        protoWriter.writeBytes(p2PControl.unknownFields());
    }
}
