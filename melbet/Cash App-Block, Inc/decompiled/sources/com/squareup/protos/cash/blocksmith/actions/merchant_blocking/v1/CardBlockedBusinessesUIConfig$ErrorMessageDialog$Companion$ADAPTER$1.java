package com.squareup.protos.cash.blocksmith.actions.merchant_blocking.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.blocksmith.actions.merchant_blocking.v1.CardBlockedBusinessesUIConfig;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CardBlockedBusinessesUIConfig$ErrorMessageDialog$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new CardBlockedBusinessesUIConfig.ErrorMessageDialog((LocalizedString) obj, (LocalizedString) obj2, (LocalizedString) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardBlockedBusinessesUIConfig.ErrorMessageDialog errorMessageDialog = (CardBlockedBusinessesUIConfig.ErrorMessageDialog) obj;
        reverseProtoWriter.getClass();
        errorMessageDialog.getClass();
        reverseProtoWriter.writeBytes(errorMessageDialog.unknownFields());
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, errorMessageDialog.button_title);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, errorMessageDialog.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, errorMessageDialog.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardBlockedBusinessesUIConfig.ErrorMessageDialog errorMessageDialog = (CardBlockedBusinessesUIConfig.ErrorMessageDialog) obj;
        errorMessageDialog.getClass();
        int size$okio = errorMessageDialog.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return protoAdapter.encodedSizeWithTag(3, errorMessageDialog.button_title) + protoAdapter.encodedSizeWithTag(2, errorMessageDialog.subtitle) + protoAdapter.encodedSizeWithTag(1, errorMessageDialog.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardBlockedBusinessesUIConfig.ErrorMessageDialog errorMessageDialog = (CardBlockedBusinessesUIConfig.ErrorMessageDialog) obj;
        errorMessageDialog.getClass();
        LocalizedString localizedString = errorMessageDialog.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = errorMessageDialog.subtitle;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        LocalizedString localizedString5 = errorMessageDialog.button_title;
        LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CardBlockedBusinessesUIConfig.ErrorMessageDialog(localizedString2, localizedString4, localizedString6, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardBlockedBusinessesUIConfig.ErrorMessageDialog errorMessageDialog = (CardBlockedBusinessesUIConfig.ErrorMessageDialog) obj;
        errorMessageDialog.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, errorMessageDialog.title);
        protoAdapter.encodeWithTag(protoWriter, 2, errorMessageDialog.subtitle);
        protoAdapter.encodeWithTag(protoWriter, 3, errorMessageDialog.button_title);
        protoWriter.writeBytes(errorMessageDialog.unknownFields());
    }
}
