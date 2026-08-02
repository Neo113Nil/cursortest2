package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/P2PTransferOptionPicker$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/P2PTransferOptionPicker;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class P2PTransferOptionPicker$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new P2PTransferOptionPicker((String) obj, (String) obj2, (LocalizedString) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        P2PTransferOptionPicker p2PTransferOptionPicker = (P2PTransferOptionPicker) obj;
        reverseProtoWriter.getClass();
        p2PTransferOptionPicker.getClass();
        reverseProtoWriter.writeBytes(p2PTransferOptionPicker.unknownFields());
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 3, p2PTransferOptionPicker.title_template);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, p2PTransferOptionPicker.token_placeholder_key);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, p2PTransferOptionPicker.prefilled_instrument_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        P2PTransferOptionPicker p2PTransferOptionPicker = (P2PTransferOptionPicker) obj;
        p2PTransferOptionPicker.getClass();
        int size$okio = p2PTransferOptionPicker.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return LocalizedString.ADAPTER.encodedSizeWithTag(3, p2PTransferOptionPicker.title_template) + protoAdapter.encodedSizeWithTag(2, p2PTransferOptionPicker.token_placeholder_key) + protoAdapter.encodedSizeWithTag(1, p2PTransferOptionPicker.prefilled_instrument_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        P2PTransferOptionPicker p2PTransferOptionPicker = (P2PTransferOptionPicker) obj;
        p2PTransferOptionPicker.getClass();
        LocalizedString localizedString = p2PTransferOptionPicker.title_template;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = p2PTransferOptionPicker.prefilled_instrument_token;
        String str2 = p2PTransferOptionPicker.token_placeholder_key;
        byteString.getClass();
        return new P2PTransferOptionPicker(str, str2, localizedString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        P2PTransferOptionPicker p2PTransferOptionPicker = (P2PTransferOptionPicker) obj;
        p2PTransferOptionPicker.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, p2PTransferOptionPicker.prefilled_instrument_token);
        protoAdapter.encodeWithTag(protoWriter, 2, p2PTransferOptionPicker.token_placeholder_key);
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 3, p2PTransferOptionPicker.title_template);
        protoWriter.writeBytes(p2PTransferOptionPicker.unknownFields());
    }
}
