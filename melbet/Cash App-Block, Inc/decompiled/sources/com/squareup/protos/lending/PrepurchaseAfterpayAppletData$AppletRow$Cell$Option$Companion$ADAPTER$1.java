package com.squareup.protos.lending;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.lending.PrepurchaseAfterpayAppletData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class PrepurchaseAfterpayAppletData$AppletRow$Cell$Option$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PrepurchaseAfterpayAppletData.AppletRow.Cell.Option((LocalizedString) obj, (LocalizedString) obj2, (LocalizedString) obj3, (LocalizedString) obj4, (String) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
            } else if (nextTag == 4) {
                obj4 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj4);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PrepurchaseAfterpayAppletData.AppletRow.Cell.Option option = (PrepurchaseAfterpayAppletData.AppletRow.Cell.Option) obj;
        reverseProtoWriter.getClass();
        option.getClass();
        reverseProtoWriter.writeBytes(option.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 5, option.unique_option_id);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, option.option_secondary_description);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, option.option_description);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, option.option_header);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, option.summary_text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PrepurchaseAfterpayAppletData.AppletRow.Cell.Option option = (PrepurchaseAfterpayAppletData.AppletRow.Cell.Option) obj;
        option.getClass();
        int size$okio = option.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return ProtoAdapter.STRING.encodedSizeWithTag(5, option.unique_option_id) + protoAdapter.encodedSizeWithTag(4, option.option_secondary_description) + protoAdapter.encodedSizeWithTag(3, option.option_description) + protoAdapter.encodedSizeWithTag(2, option.option_header) + protoAdapter.encodedSizeWithTag(1, option.summary_text) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PrepurchaseAfterpayAppletData.AppletRow.Cell.Option option = (PrepurchaseAfterpayAppletData.AppletRow.Cell.Option) obj;
        option.getClass();
        LocalizedString localizedString = option.summary_text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = option.option_header;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        LocalizedString localizedString5 = option.option_description;
        LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null;
        LocalizedString localizedString7 = option.option_secondary_description;
        LocalizedString localizedString8 = localizedString7 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString7) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = option.unique_option_id;
        byteString.getClass();
        return new PrepurchaseAfterpayAppletData.AppletRow.Cell.Option(localizedString2, localizedString4, localizedString6, localizedString8, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PrepurchaseAfterpayAppletData.AppletRow.Cell.Option option = (PrepurchaseAfterpayAppletData.AppletRow.Cell.Option) obj;
        option.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, option.summary_text);
        protoAdapter.encodeWithTag(protoWriter, 2, option.option_header);
        protoAdapter.encodeWithTag(protoWriter, 3, option.option_description);
        protoAdapter.encodeWithTag(protoWriter, 4, option.option_secondary_description);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, option.unique_option_id);
        protoWriter.writeBytes(option.unknownFields());
    }
}
