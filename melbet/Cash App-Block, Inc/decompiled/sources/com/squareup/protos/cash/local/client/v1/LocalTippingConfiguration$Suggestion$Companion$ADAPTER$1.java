package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.client.v1.LocalTippingConfiguration;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalTippingConfiguration$Suggestion$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalTippingConfiguration.Suggestion((String) obj, (LocalMoney) obj2, (Boolean) obj3, (String) obj4, (Boolean) obj5, (String) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(LocalMoney.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj3 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 4:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj5 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 6:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalTippingConfiguration.Suggestion suggestion = (LocalTippingConfiguration.Suggestion) obj;
        reverseProtoWriter.getClass();
        suggestion.getClass();
        reverseProtoWriter.writeBytes(suggestion.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, suggestion.local_cash_earnings_label);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, suggestion.hide_tip_amount);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, suggestion.summary_line_label);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, suggestion.selected_by_default);
        LocalMoney.ADAPTER.encodeWithTag(reverseProtoWriter, 2, suggestion.tip_amount);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, suggestion.label);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalTippingConfiguration.Suggestion suggestion = (LocalTippingConfiguration.Suggestion) obj;
        suggestion.getClass();
        int size$okio = suggestion.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = LocalMoney.ADAPTER.encodedSizeWithTag(2, suggestion.tip_amount) + protoAdapter.encodedSizeWithTag(1, suggestion.label) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        return protoAdapter.encodedSizeWithTag(6, suggestion.local_cash_earnings_label) + protoAdapter2.encodedSizeWithTag(5, suggestion.hide_tip_amount) + protoAdapter.encodedSizeWithTag(4, suggestion.summary_line_label) + protoAdapter2.encodedSizeWithTag(3, suggestion.selected_by_default) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalTippingConfiguration.Suggestion suggestion = (LocalTippingConfiguration.Suggestion) obj;
        suggestion.getClass();
        LocalMoney localMoney = suggestion.tip_amount;
        LocalMoney localMoney2 = localMoney != null ? (LocalMoney) LocalMoney.ADAPTER.redact(localMoney) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = suggestion.label;
        Boolean bool = suggestion.selected_by_default;
        String str2 = suggestion.summary_line_label;
        Boolean bool2 = suggestion.hide_tip_amount;
        String str3 = suggestion.local_cash_earnings_label;
        byteString.getClass();
        return new LocalTippingConfiguration.Suggestion(str, localMoney2, bool, str2, bool2, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalTippingConfiguration.Suggestion suggestion = (LocalTippingConfiguration.Suggestion) obj;
        suggestion.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, suggestion.label);
        LocalMoney.ADAPTER.encodeWithTag(protoWriter, 2, suggestion.tip_amount);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(protoWriter, 3, suggestion.selected_by_default);
        protoAdapter.encodeWithTag(protoWriter, 4, suggestion.summary_line_label);
        protoAdapter2.encodeWithTag(protoWriter, 5, suggestion.hide_tip_amount);
        protoAdapter.encodeWithTag(protoWriter, 6, suggestion.local_cash_earnings_label);
        protoWriter.writeBytes(suggestion.unknownFields());
    }
}
