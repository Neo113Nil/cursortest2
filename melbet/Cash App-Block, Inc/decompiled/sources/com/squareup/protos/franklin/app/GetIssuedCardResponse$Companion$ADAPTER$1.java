package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.app.GetIssuedCardResponse;
import com.squareup.protos.franklin.common.IssuedCard;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class GetIssuedCardResponse$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new GetIssuedCardResponse((GetIssuedCardResponse.Status) obj, (IssuedCard) obj2, (String) obj3, (ScenarioPlan) obj4, (Boolean) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = GetIssuedCardResponse.Status.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(IssuedCard.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = TransactorKt.decodeMessageOrMerge(ScenarioPlan.ADAPTER, protoReader, obj4);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetIssuedCardResponse getIssuedCardResponse = (GetIssuedCardResponse) obj;
        reverseProtoWriter.getClass();
        getIssuedCardResponse.getClass();
        reverseProtoWriter.writeBytes(getIssuedCardResponse.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 5, getIssuedCardResponse.evict_existing_issued_card);
        ScenarioPlan.ADAPTER.encodeWithTag(reverseProtoWriter, 4, getIssuedCardResponse.scenario_plan);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, getIssuedCardResponse.message);
        IssuedCard.ADAPTER.encodeWithTag(reverseProtoWriter, 2, getIssuedCardResponse.issued_card);
        GetIssuedCardResponse.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getIssuedCardResponse.status);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetIssuedCardResponse getIssuedCardResponse = (GetIssuedCardResponse) obj;
        getIssuedCardResponse.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(5, getIssuedCardResponse.evict_existing_issued_card) + ScenarioPlan.ADAPTER.encodedSizeWithTag(4, getIssuedCardResponse.scenario_plan) + ProtoAdapter.STRING.encodedSizeWithTag(3, getIssuedCardResponse.message) + IssuedCard.ADAPTER.encodedSizeWithTag(2, getIssuedCardResponse.issued_card) + GetIssuedCardResponse.Status.ADAPTER.encodedSizeWithTag(1, getIssuedCardResponse.status) + getIssuedCardResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetIssuedCardResponse getIssuedCardResponse = (GetIssuedCardResponse) obj;
        getIssuedCardResponse.getClass();
        IssuedCard issuedCard = getIssuedCardResponse.issued_card;
        IssuedCard issuedCard2 = issuedCard != null ? (IssuedCard) IssuedCard.ADAPTER.redact(issuedCard) : null;
        ScenarioPlan scenarioPlan = getIssuedCardResponse.scenario_plan;
        ScenarioPlan scenarioPlan2 = scenarioPlan != null ? (ScenarioPlan) ScenarioPlan.ADAPTER.redact(scenarioPlan) : null;
        ByteString byteString = ByteString.EMPTY;
        GetIssuedCardResponse.Status status = getIssuedCardResponse.status;
        String str = getIssuedCardResponse.message;
        Boolean bool = getIssuedCardResponse.evict_existing_issued_card;
        byteString.getClass();
        return new GetIssuedCardResponse(status, issuedCard2, str, scenarioPlan2, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetIssuedCardResponse getIssuedCardResponse = (GetIssuedCardResponse) obj;
        getIssuedCardResponse.getClass();
        GetIssuedCardResponse.Status.ADAPTER.encodeWithTag(protoWriter, 1, getIssuedCardResponse.status);
        IssuedCard.ADAPTER.encodeWithTag(protoWriter, 2, getIssuedCardResponse.issued_card);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, getIssuedCardResponse.message);
        ScenarioPlan.ADAPTER.encodeWithTag(protoWriter, 4, getIssuedCardResponse.scenario_plan);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, getIssuedCardResponse.evict_existing_issued_card);
        protoWriter.writeBytes(getIssuedCardResponse.unknownFields());
    }
}
