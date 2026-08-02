package com.squareup.protos.cash.aegis.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.aegis.core.CustomLimit;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetCustomLimitsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetCustomLimitsResponse((String) obj, m, arrayList, (Long) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                m.add(CustomLimit.ADAPTER.decode(protoReader));
            } else if (nextTag == 3) {
                arrayList.add(Money.ADAPTER.decode(protoReader));
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetCustomLimitsResponse getCustomLimitsResponse = (GetCustomLimitsResponse) obj;
        reverseProtoWriter.getClass();
        getCustomLimitsResponse.getClass();
        reverseProtoWriter.writeBytes(getCustomLimitsResponse.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 4, getCustomLimitsResponse.custom_card_spend_limit_30_day_max_amount);
        Money.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, getCustomLimitsResponse.custom_card_spend_limit_30_day_presets);
        CustomLimit.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, getCustomLimitsResponse.custom_limits);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, getCustomLimitsResponse.customer_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetCustomLimitsResponse getCustomLimitsResponse = (GetCustomLimitsResponse) obj;
        getCustomLimitsResponse.getClass();
        return ProtoAdapter.INT64.encodedSizeWithTag(4, getCustomLimitsResponse.custom_card_spend_limit_30_day_max_amount) + Money.ADAPTER.asRepeated().encodedSizeWithTag(3, getCustomLimitsResponse.custom_card_spend_limit_30_day_presets) + CustomLimit.ADAPTER.asRepeated().encodedSizeWithTag(2, getCustomLimitsResponse.custom_limits) + ProtoAdapter.STRING.encodedSizeWithTag(1, getCustomLimitsResponse.customer_token) + getCustomLimitsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetCustomLimitsResponse getCustomLimitsResponse = (GetCustomLimitsResponse) obj;
        getCustomLimitsResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getCustomLimitsResponse.custom_limits, CustomLimit.ADAPTER);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(getCustomLimitsResponse.custom_card_spend_limit_30_day_presets, Money.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = getCustomLimitsResponse.customer_token;
        Long l = getCustomLimitsResponse.custom_card_spend_limit_30_day_max_amount;
        byteString.getClass();
        return new GetCustomLimitsResponse(str, m1169redactElements, m1169redactElements2, l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetCustomLimitsResponse getCustomLimitsResponse = (GetCustomLimitsResponse) obj;
        getCustomLimitsResponse.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getCustomLimitsResponse.customer_token);
        CustomLimit.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, getCustomLimitsResponse.custom_limits);
        Money.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, getCustomLimitsResponse.custom_card_spend_limit_30_day_presets);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, getCustomLimitsResponse.custom_card_spend_limit_30_day_max_amount);
        protoWriter.writeBytes(getCustomLimitsResponse.unknownFields());
    }
}
