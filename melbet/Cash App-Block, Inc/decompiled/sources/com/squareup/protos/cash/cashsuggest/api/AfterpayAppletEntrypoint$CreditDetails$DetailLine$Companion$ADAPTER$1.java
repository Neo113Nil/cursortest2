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
public final class AfterpayAppletEntrypoint$CreditDetails$DetailLine$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new AfterpayAppletEntrypoint.CreditDetails.DetailLine((UiAvatar) obj, (Money) obj2, (LocalizedString) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(UiAvatar.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AfterpayAppletEntrypoint.CreditDetails.DetailLine detailLine = (AfterpayAppletEntrypoint.CreditDetails.DetailLine) obj;
        reverseProtoWriter.getClass();
        detailLine.getClass();
        reverseProtoWriter.writeBytes(detailLine.unknownFields());
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 3, detailLine.text_suffix);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 2, detailLine.amount);
        UiAvatar.ADAPTER.encodeWithTag(reverseProtoWriter, 1, detailLine.avatar);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AfterpayAppletEntrypoint.CreditDetails.DetailLine detailLine = (AfterpayAppletEntrypoint.CreditDetails.DetailLine) obj;
        detailLine.getClass();
        return LocalizedString.ADAPTER.encodedSizeWithTag(3, detailLine.text_suffix) + Money.ADAPTER.encodedSizeWithTag(2, detailLine.amount) + UiAvatar.ADAPTER.encodedSizeWithTag(1, detailLine.avatar) + detailLine.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AfterpayAppletEntrypoint.CreditDetails.DetailLine detailLine = (AfterpayAppletEntrypoint.CreditDetails.DetailLine) obj;
        detailLine.getClass();
        UiAvatar uiAvatar = detailLine.avatar;
        UiAvatar uiAvatar2 = uiAvatar != null ? (UiAvatar) UiAvatar.ADAPTER.redact(uiAvatar) : null;
        Money money = detailLine.amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        LocalizedString localizedString = detailLine.text_suffix;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new AfterpayAppletEntrypoint.CreditDetails.DetailLine(uiAvatar2, money2, localizedString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AfterpayAppletEntrypoint.CreditDetails.DetailLine detailLine = (AfterpayAppletEntrypoint.CreditDetails.DetailLine) obj;
        detailLine.getClass();
        UiAvatar.ADAPTER.encodeWithTag(protoWriter, 1, detailLine.avatar);
        Money.ADAPTER.encodeWithTag(protoWriter, 2, detailLine.amount);
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 3, detailLine.text_suffix);
        protoWriter.writeBytes(detailLine.unknownFields());
    }
}
