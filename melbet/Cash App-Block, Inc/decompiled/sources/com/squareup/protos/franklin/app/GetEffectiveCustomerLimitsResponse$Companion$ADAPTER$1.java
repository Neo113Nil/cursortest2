package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.app.GetEffectiveCustomerLimitsResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class GetEffectiveCustomerLimitsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetEffectiveCustomerLimitsResponse(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(GetEffectiveCustomerLimitsResponse.LimitForAction.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetEffectiveCustomerLimitsResponse getEffectiveCustomerLimitsResponse = (GetEffectiveCustomerLimitsResponse) obj;
        reverseProtoWriter.getClass();
        getEffectiveCustomerLimitsResponse.getClass();
        reverseProtoWriter.writeBytes(getEffectiveCustomerLimitsResponse.unknownFields());
        GetEffectiveCustomerLimitsResponse.LimitForAction.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getEffectiveCustomerLimitsResponse.limits);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetEffectiveCustomerLimitsResponse getEffectiveCustomerLimitsResponse = (GetEffectiveCustomerLimitsResponse) obj;
        getEffectiveCustomerLimitsResponse.getClass();
        return GetEffectiveCustomerLimitsResponse.LimitForAction.ADAPTER.asRepeated().encodedSizeWithTag(1, getEffectiveCustomerLimitsResponse.limits) + getEffectiveCustomerLimitsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetEffectiveCustomerLimitsResponse getEffectiveCustomerLimitsResponse = (GetEffectiveCustomerLimitsResponse) obj;
        getEffectiveCustomerLimitsResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getEffectiveCustomerLimitsResponse.limits, GetEffectiveCustomerLimitsResponse.LimitForAction.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetEffectiveCustomerLimitsResponse(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetEffectiveCustomerLimitsResponse getEffectiveCustomerLimitsResponse = (GetEffectiveCustomerLimitsResponse) obj;
        getEffectiveCustomerLimitsResponse.getClass();
        GetEffectiveCustomerLimitsResponse.LimitForAction.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getEffectiveCustomerLimitsResponse.limits);
        protoWriter.writeBytes(getEffectiveCustomerLimitsResponse.unknownFields());
    }
}
