package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletEntrypoint;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AfterpayAppletEntrypoint$V3LoanBrief$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new AfterpayAppletEntrypoint.V3LoanBrief((UiAvatar) obj, (Money) obj2, (LocalizedString) obj3, (LocalizedString) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(UiAvatar.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AfterpayAppletEntrypoint.V3LoanBrief v3LoanBrief = (AfterpayAppletEntrypoint.V3LoanBrief) obj;
        reverseProtoWriter.getClass();
        v3LoanBrief.getClass();
        reverseProtoWriter.writeBytes(v3LoanBrief.unknownFields());
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, v3LoanBrief.hint_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, v3LoanBrief.text);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 2, v3LoanBrief.amount);
        UiAvatar.ADAPTER.encodeWithTag(reverseProtoWriter, 1, v3LoanBrief.avatar);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AfterpayAppletEntrypoint.V3LoanBrief v3LoanBrief = (AfterpayAppletEntrypoint.V3LoanBrief) obj;
        v3LoanBrief.getClass();
        int encodedSizeWithTag = Money.ADAPTER.encodedSizeWithTag(2, v3LoanBrief.amount) + UiAvatar.ADAPTER.encodedSizeWithTag(1, v3LoanBrief.avatar) + v3LoanBrief.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return protoAdapter.encodedSizeWithTag(4, v3LoanBrief.hint_text) + protoAdapter.encodedSizeWithTag(3, v3LoanBrief.text) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AfterpayAppletEntrypoint.V3LoanBrief v3LoanBrief = (AfterpayAppletEntrypoint.V3LoanBrief) obj;
        v3LoanBrief.getClass();
        UiAvatar uiAvatar = v3LoanBrief.avatar;
        UiAvatar uiAvatar2 = uiAvatar != null ? (UiAvatar) UiAvatar.ADAPTER.redact(uiAvatar) : null;
        Money money = v3LoanBrief.amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        LocalizedString localizedString = v3LoanBrief.text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = v3LoanBrief.hint_text;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new AfterpayAppletEntrypoint.V3LoanBrief(uiAvatar2, money2, localizedString2, localizedString4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AfterpayAppletEntrypoint.V3LoanBrief v3LoanBrief = (AfterpayAppletEntrypoint.V3LoanBrief) obj;
        v3LoanBrief.getClass();
        UiAvatar.ADAPTER.encodeWithTag(protoWriter, 1, v3LoanBrief.avatar);
        Money.ADAPTER.encodeWithTag(protoWriter, 2, v3LoanBrief.amount);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 3, v3LoanBrief.text);
        protoAdapter.encodeWithTag(protoWriter, 4, v3LoanBrief.hint_text);
        protoWriter.writeBytes(v3LoanBrief.unknownFields());
    }
}
