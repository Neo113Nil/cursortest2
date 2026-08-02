package com.squareup.protos.lending.sync_values;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.lending.sync_values.BorrowAppletPaymentTimelineTile;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class BorrowAppletPaymentTimelineTile$Data$Button$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new BorrowAppletPaymentTimelineTile.Data.Button((LocalizedString) obj2, (Boolean) obj3, (String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BorrowAppletPaymentTimelineTile.Data.Button button = (BorrowAppletPaymentTimelineTile.Data.Button) obj;
        reverseProtoWriter.getClass();
        button.getClass();
        reverseProtoWriter.writeBytes(button.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 3, button.enabled);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 2, button.text);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, button.action_url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BorrowAppletPaymentTimelineTile.Data.Button button = (BorrowAppletPaymentTimelineTile.Data.Button) obj;
        button.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(3, button.enabled) + LocalizedString.ADAPTER.encodedSizeWithTag(2, button.text) + ProtoAdapter.STRING.encodedSizeWithTag(1, button.action_url) + button.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BorrowAppletPaymentTimelineTile.Data.Button button = (BorrowAppletPaymentTimelineTile.Data.Button) obj;
        button.getClass();
        LocalizedString localizedString = button.text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = button.action_url;
        Boolean bool = button.enabled;
        byteString.getClass();
        return new BorrowAppletPaymentTimelineTile.Data.Button(localizedString2, bool, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BorrowAppletPaymentTimelineTile.Data.Button button = (BorrowAppletPaymentTimelineTile.Data.Button) obj;
        button.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, button.action_url);
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 2, button.text);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, button.enabled);
        protoWriter.writeBytes(button.unknownFields());
    }
}
