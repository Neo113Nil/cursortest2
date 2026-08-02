package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.app.GetEffectiveCustomerLimitsResponse;
import com.squareup.protos.franklin.common.LimitedAction;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class GetEffectiveCustomerLimitsResponse$LimitForAction$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new GetEffectiveCustomerLimitsResponse.LimitForAction((LimitedAction) obj, (Money) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = LimitedAction.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetEffectiveCustomerLimitsResponse.LimitForAction limitForAction = (GetEffectiveCustomerLimitsResponse.LimitForAction) obj;
        reverseProtoWriter.getClass();
        limitForAction.getClass();
        reverseProtoWriter.writeBytes(limitForAction.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, limitForAction.limit_exceeded_message);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 2, limitForAction.limit);
        LimitedAction.ADAPTER.encodeWithTag(reverseProtoWriter, 1, limitForAction.action);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetEffectiveCustomerLimitsResponse.LimitForAction limitForAction = (GetEffectiveCustomerLimitsResponse.LimitForAction) obj;
        limitForAction.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(3, limitForAction.limit_exceeded_message) + Money.ADAPTER.encodedSizeWithTag(2, limitForAction.limit) + LimitedAction.ADAPTER.encodedSizeWithTag(1, limitForAction.action) + limitForAction.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetEffectiveCustomerLimitsResponse.LimitForAction limitForAction = (GetEffectiveCustomerLimitsResponse.LimitForAction) obj;
        limitForAction.getClass();
        Money money = limitForAction.limit;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        LimitedAction limitedAction = limitForAction.action;
        String str = limitForAction.limit_exceeded_message;
        byteString.getClass();
        return new GetEffectiveCustomerLimitsResponse.LimitForAction(limitedAction, money2, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetEffectiveCustomerLimitsResponse.LimitForAction limitForAction = (GetEffectiveCustomerLimitsResponse.LimitForAction) obj;
        limitForAction.getClass();
        LimitedAction.ADAPTER.encodeWithTag(protoWriter, 1, limitForAction.action);
        Money.ADAPTER.encodeWithTag(protoWriter, 2, limitForAction.limit);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, limitForAction.limit_exceeded_message);
        protoWriter.writeBytes(limitForAction.unknownFields());
    }
}
