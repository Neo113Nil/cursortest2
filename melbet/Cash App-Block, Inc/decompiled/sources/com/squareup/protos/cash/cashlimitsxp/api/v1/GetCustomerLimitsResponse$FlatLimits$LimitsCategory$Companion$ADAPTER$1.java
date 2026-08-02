package com.squareup.protos.cash.cashlimitsxp.api.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashlimitsxp.api.v1.GetCustomerLimitsResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetCustomerLimitsResponse$FlatLimits$LimitsCategory$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetCustomerLimitsResponse.FlatLimits.LimitsCategory((String) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(GetCustomerLimitsResponse.FlatLimits.LimitUsage.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetCustomerLimitsResponse.FlatLimits.LimitsCategory limitsCategory = (GetCustomerLimitsResponse.FlatLimits.LimitsCategory) obj;
        reverseProtoWriter.getClass();
        limitsCategory.getClass();
        reverseProtoWriter.writeBytes(limitsCategory.unknownFields());
        GetCustomerLimitsResponse.FlatLimits.LimitUsage.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, limitsCategory.limit_usages);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, limitsCategory.header_text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetCustomerLimitsResponse.FlatLimits.LimitsCategory limitsCategory = (GetCustomerLimitsResponse.FlatLimits.LimitsCategory) obj;
        limitsCategory.getClass();
        return GetCustomerLimitsResponse.FlatLimits.LimitUsage.ADAPTER.asRepeated().encodedSizeWithTag(2, limitsCategory.limit_usages) + ProtoAdapter.STRING.encodedSizeWithTag(1, limitsCategory.header_text) + limitsCategory.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetCustomerLimitsResponse.FlatLimits.LimitsCategory limitsCategory = (GetCustomerLimitsResponse.FlatLimits.LimitsCategory) obj;
        limitsCategory.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(limitsCategory.limit_usages, GetCustomerLimitsResponse.FlatLimits.LimitUsage.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = limitsCategory.header_text;
        byteString.getClass();
        return new GetCustomerLimitsResponse.FlatLimits.LimitsCategory(str, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetCustomerLimitsResponse.FlatLimits.LimitsCategory limitsCategory = (GetCustomerLimitsResponse.FlatLimits.LimitsCategory) obj;
        limitsCategory.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, limitsCategory.header_text);
        GetCustomerLimitsResponse.FlatLimits.LimitUsage.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, limitsCategory.limit_usages);
        protoWriter.writeBytes(limitsCategory.unknownFields());
    }
}
