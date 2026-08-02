package com.squareup.protos.cash.transfers;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class AddCashHalfSheetWithEntryParameters$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new AddCashHalfSheetWithEntryParameters((String) obj, (LocalizedString) obj2, (String) obj3, (Money) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AddCashHalfSheetWithEntryParameters addCashHalfSheetWithEntryParameters = (AddCashHalfSheetWithEntryParameters) obj;
        reverseProtoWriter.getClass();
        addCashHalfSheetWithEntryParameters.getClass();
        reverseProtoWriter.writeBytes(addCashHalfSheetWithEntryParameters.unknownFields());
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 4, addCashHalfSheetWithEntryParameters.suggested_amount);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, addCashHalfSheetWithEntryParameters.entry_token);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 2, addCashHalfSheetWithEntryParameters.title);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, addCashHalfSheetWithEntryParameters.entry_client_route);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AddCashHalfSheetWithEntryParameters addCashHalfSheetWithEntryParameters = (AddCashHalfSheetWithEntryParameters) obj;
        addCashHalfSheetWithEntryParameters.getClass();
        int size$okio = addCashHalfSheetWithEntryParameters.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return Money.ADAPTER.encodedSizeWithTag(4, addCashHalfSheetWithEntryParameters.suggested_amount) + protoAdapter.encodedSizeWithTag(3, addCashHalfSheetWithEntryParameters.entry_token) + LocalizedString.ADAPTER.encodedSizeWithTag(2, addCashHalfSheetWithEntryParameters.title) + protoAdapter.encodedSizeWithTag(1, addCashHalfSheetWithEntryParameters.entry_client_route) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AddCashHalfSheetWithEntryParameters addCashHalfSheetWithEntryParameters = (AddCashHalfSheetWithEntryParameters) obj;
        addCashHalfSheetWithEntryParameters.getClass();
        LocalizedString localizedString = addCashHalfSheetWithEntryParameters.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        Money money = addCashHalfSheetWithEntryParameters.suggested_amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = addCashHalfSheetWithEntryParameters.entry_client_route;
        String str2 = addCashHalfSheetWithEntryParameters.entry_token;
        byteString.getClass();
        return new AddCashHalfSheetWithEntryParameters(str, localizedString2, str2, money2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AddCashHalfSheetWithEntryParameters addCashHalfSheetWithEntryParameters = (AddCashHalfSheetWithEntryParameters) obj;
        addCashHalfSheetWithEntryParameters.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, addCashHalfSheetWithEntryParameters.entry_client_route);
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 2, addCashHalfSheetWithEntryParameters.title);
        protoAdapter.encodeWithTag(protoWriter, 3, addCashHalfSheetWithEntryParameters.entry_token);
        Money.ADAPTER.encodeWithTag(protoWriter, 4, addCashHalfSheetWithEntryParameters.suggested_amount);
        protoWriter.writeBytes(addCashHalfSheetWithEntryParameters.unknownFields());
    }
}
