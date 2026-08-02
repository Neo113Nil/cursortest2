package com.squareup.protos.franklin.ui;

import com.squareup.protos.franklin.ui.CardOrderData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CardOrderData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        Object obj2;
        Object obj3;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        Object obj12 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardOrderData((CardOrderData.State) obj4, (CardOrderData.StateReason) obj5, (Long) obj6, (Long) obj7, (String) obj8, (Long) obj9, (String) obj10, (String) obj11, (CardOrderData.OrderScenarioType) obj12, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = obj4;
                    obj2 = obj5;
                    obj3 = obj6;
                    try {
                        obj4 = CardOrderData.State.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                    obj6 = obj3;
                    obj5 = obj2;
                    break;
                case 2:
                    obj = obj4;
                    obj2 = obj5;
                    try {
                        obj4 = obj;
                        obj5 = CardOrderData.StateReason.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        obj3 = obj6;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 3:
                    obj6 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 4:
                    obj7 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 5:
                    obj8 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj9 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 7:
                    obj10 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 8:
                    obj11 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 9:
                    try {
                        obj12 = CardOrderData.OrderScenarioType.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                        obj = obj4;
                        obj2 = obj5;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                        break;
                    }
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj4;
                    obj2 = obj5;
                    obj3 = obj6;
                    obj4 = obj;
                    obj6 = obj3;
                    obj5 = obj2;
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardOrderData cardOrderData = (CardOrderData) obj;
        reverseProtoWriter.getClass();
        cardOrderData.getClass();
        reverseProtoWriter.writeBytes(cardOrderData.unknownFields());
        CardOrderData.OrderScenarioType.ADAPTER.encodeWithTag(reverseProtoWriter, 9, cardOrderData.order_scenario_type);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, cardOrderData.card_theme_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, cardOrderData.name_on_card);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 6, cardOrderData.last_card_ordered_at);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, cardOrderData.flow_type);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, cardOrderData.issued_at);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, cardOrderData.state_transitioned_at);
        CardOrderData.StateReason.ADAPTER.encodeWithTag(reverseProtoWriter, 2, cardOrderData.state_reason);
        CardOrderData.State.ADAPTER.encodeWithTag(reverseProtoWriter, 1, cardOrderData.state);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardOrderData cardOrderData = (CardOrderData) obj;
        cardOrderData.getClass();
        int encodedSizeWithTag = CardOrderData.StateReason.ADAPTER.encodedSizeWithTag(2, cardOrderData.state_reason) + CardOrderData.State.ADAPTER.encodedSizeWithTag(1, cardOrderData.state) + cardOrderData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(4, cardOrderData.issued_at) + protoAdapter.encodedSizeWithTag(3, cardOrderData.state_transitioned_at) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        return CardOrderData.OrderScenarioType.ADAPTER.encodedSizeWithTag(9, cardOrderData.order_scenario_type) + protoAdapter2.encodedSizeWithTag(8, cardOrderData.card_theme_token) + protoAdapter2.encodedSizeWithTag(7, cardOrderData.name_on_card) + protoAdapter.encodedSizeWithTag(6, cardOrderData.last_card_ordered_at) + protoAdapter2.encodedSizeWithTag(5, cardOrderData.flow_type) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardOrderData cardOrderData = (CardOrderData) obj;
        cardOrderData.getClass();
        ByteString byteString = ByteString.EMPTY;
        CardOrderData.State state = cardOrderData.state;
        CardOrderData.StateReason stateReason = cardOrderData.state_reason;
        Long l = cardOrderData.state_transitioned_at;
        Long l2 = cardOrderData.issued_at;
        String str = cardOrderData.flow_type;
        Long l3 = cardOrderData.last_card_ordered_at;
        String str2 = cardOrderData.card_theme_token;
        CardOrderData.OrderScenarioType orderScenarioType = cardOrderData.order_scenario_type;
        byteString.getClass();
        return new CardOrderData(state, stateReason, l, l2, str, l3, null, str2, orderScenarioType, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardOrderData cardOrderData = (CardOrderData) obj;
        cardOrderData.getClass();
        CardOrderData.State.ADAPTER.encodeWithTag(protoWriter, 1, cardOrderData.state);
        CardOrderData.StateReason.ADAPTER.encodeWithTag(protoWriter, 2, cardOrderData.state_reason);
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 3, cardOrderData.state_transitioned_at);
        protoAdapter.encodeWithTag(protoWriter, 4, cardOrderData.issued_at);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 5, cardOrderData.flow_type);
        protoAdapter.encodeWithTag(protoWriter, 6, cardOrderData.last_card_ordered_at);
        protoAdapter2.encodeWithTag(protoWriter, 7, cardOrderData.name_on_card);
        protoAdapter2.encodeWithTag(protoWriter, 8, cardOrderData.card_theme_token);
        CardOrderData.OrderScenarioType.ADAPTER.encodeWithTag(protoWriter, 9, cardOrderData.order_scenario_type);
        protoWriter.writeBytes(cardOrderData.unknownFields());
    }
}
