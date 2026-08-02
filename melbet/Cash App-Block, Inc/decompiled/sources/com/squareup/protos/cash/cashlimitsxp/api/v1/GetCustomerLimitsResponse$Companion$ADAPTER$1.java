package com.squareup.protos.cash.cashlimitsxp.api.v1;

import androidx.room.TransactorKt;
import app.cash.local.viewmodels.OrderBuilderModel;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashlimitsxp.api.v1.GetCustomerLimitsResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetCustomerLimitsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        OrderBuilderModel.OrderType orderType = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetCustomerLimitsResponse(m, orderType, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(GetCustomerLimitsResponse.LimitsSection.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                orderType = new GetCustomerLimitsResponse$Limits$GroupedLimits((GetCustomerLimitsResponse.GroupedLimits) GetCustomerLimitsResponse.GroupedLimits.ADAPTER.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                orderType = new GetCustomerLimitsResponse$Limits$FlatLimits((GetCustomerLimitsResponse.FlatLimits) GetCustomerLimitsResponse.FlatLimits.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetCustomerLimitsResponse getCustomerLimitsResponse = (GetCustomerLimitsResponse) obj;
        reverseProtoWriter.getClass();
        getCustomerLimitsResponse.getClass();
        reverseProtoWriter.writeBytes(getCustomerLimitsResponse.unknownFields());
        OrderBuilderModel.OrderType orderType = getCustomerLimitsResponse.limits;
        if (orderType instanceof GetCustomerLimitsResponse$Limits$GroupedLimits) {
            GetCustomerLimitsResponse.GroupedLimits.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((GetCustomerLimitsResponse$Limits$GroupedLimits) orderType).value);
        } else if (orderType instanceof GetCustomerLimitsResponse$Limits$FlatLimits) {
            GetCustomerLimitsResponse.FlatLimits.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((GetCustomerLimitsResponse$Limits$FlatLimits) orderType).value);
        } else if (orderType != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        GetCustomerLimitsResponse.LimitsSection.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getCustomerLimitsResponse.limits_sections);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetCustomerLimitsResponse getCustomerLimitsResponse = (GetCustomerLimitsResponse) obj;
        getCustomerLimitsResponse.getClass();
        int encodedSizeWithTag = GetCustomerLimitsResponse.LimitsSection.ADAPTER.asRepeated().encodedSizeWithTag(1, getCustomerLimitsResponse.limits_sections) + getCustomerLimitsResponse.unknownFields().getSize$okio();
        OrderBuilderModel.OrderType orderType = getCustomerLimitsResponse.limits;
        if (orderType instanceof GetCustomerLimitsResponse$Limits$GroupedLimits) {
            return GetCustomerLimitsResponse.GroupedLimits.ADAPTER.encodedSizeWithTag(2, ((GetCustomerLimitsResponse$Limits$GroupedLimits) orderType).value) + encodedSizeWithTag;
        }
        if (orderType instanceof GetCustomerLimitsResponse$Limits$FlatLimits) {
            return GetCustomerLimitsResponse.FlatLimits.ADAPTER.encodedSizeWithTag(3, ((GetCustomerLimitsResponse$Limits$FlatLimits) orderType).value) + encodedSizeWithTag;
        }
        if (orderType == null) {
            return encodedSizeWithTag;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetCustomerLimitsResponse getCustomerLimitsResponse = (GetCustomerLimitsResponse) obj;
        getCustomerLimitsResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getCustomerLimitsResponse.limits_sections, GetCustomerLimitsResponse.LimitsSection.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        OrderBuilderModel.OrderType orderType = getCustomerLimitsResponse.limits;
        byteString.getClass();
        return new GetCustomerLimitsResponse(m1169redactElements, orderType, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetCustomerLimitsResponse getCustomerLimitsResponse = (GetCustomerLimitsResponse) obj;
        getCustomerLimitsResponse.getClass();
        GetCustomerLimitsResponse.LimitsSection.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getCustomerLimitsResponse.limits_sections);
        OrderBuilderModel.OrderType orderType = getCustomerLimitsResponse.limits;
        if (orderType instanceof GetCustomerLimitsResponse$Limits$GroupedLimits) {
            GetCustomerLimitsResponse.GroupedLimits.ADAPTER.encodeWithTag(protoWriter, 2, ((GetCustomerLimitsResponse$Limits$GroupedLimits) orderType).value);
        } else if (orderType instanceof GetCustomerLimitsResponse$Limits$FlatLimits) {
            GetCustomerLimitsResponse.FlatLimits.ADAPTER.encodeWithTag(protoWriter, 3, ((GetCustomerLimitsResponse$Limits$FlatLimits) orderType).value);
        } else if (orderType != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(getCustomerLimitsResponse.unknownFields());
    }
}
