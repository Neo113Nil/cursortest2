package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import app.cash.redwood.yoga.internal.YGFloatOptional;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.activity.api.v1.ActivityRow;
import com.squareup.protos.cash.cashsuggest.api.OrderListSection;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class OrderListSection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        YGFloatOptional yGFloatOptional = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new OrderListSection(m, yGFloatOptional, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(ActivityRow.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                yGFloatOptional = new OrderListSection$ScreenContent$EligibleOrders((OrderListSection.EligibleRetroOrders) OrderListSection.EligibleRetroOrders.ADAPTER.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                yGFloatOptional = new OrderListSection$ScreenContent$TextLines((OrderListSection.TextLineItems) OrderListSection.TextLineItems.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        OrderListSection orderListSection = (OrderListSection) obj;
        reverseProtoWriter.getClass();
        orderListSection.getClass();
        reverseProtoWriter.writeBytes(orderListSection.unknownFields());
        YGFloatOptional yGFloatOptional = orderListSection.screen_content;
        if (yGFloatOptional instanceof OrderListSection$ScreenContent$EligibleOrders) {
            OrderListSection.EligibleRetroOrders.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((OrderListSection$ScreenContent$EligibleOrders) yGFloatOptional).value);
        } else if (yGFloatOptional instanceof OrderListSection$ScreenContent$TextLines) {
            OrderListSection.TextLineItems.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((OrderListSection$ScreenContent$TextLines) yGFloatOptional).value);
        } else if (yGFloatOptional != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ActivityRow.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, orderListSection.activity_rows);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        OrderListSection orderListSection = (OrderListSection) obj;
        orderListSection.getClass();
        int encodedSizeWithTag = ActivityRow.ADAPTER.asRepeated().encodedSizeWithTag(1, orderListSection.activity_rows) + orderListSection.unknownFields().getSize$okio();
        YGFloatOptional yGFloatOptional = orderListSection.screen_content;
        if (yGFloatOptional instanceof OrderListSection$ScreenContent$EligibleOrders) {
            return OrderListSection.EligibleRetroOrders.ADAPTER.encodedSizeWithTag(2, ((OrderListSection$ScreenContent$EligibleOrders) yGFloatOptional).value) + encodedSizeWithTag;
        }
        if (yGFloatOptional instanceof OrderListSection$ScreenContent$TextLines) {
            return OrderListSection.TextLineItems.ADAPTER.encodedSizeWithTag(3, ((OrderListSection$ScreenContent$TextLines) yGFloatOptional).value) + encodedSizeWithTag;
        }
        if (yGFloatOptional == null) {
            return encodedSizeWithTag;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        OrderListSection orderListSection = (OrderListSection) obj;
        orderListSection.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(orderListSection.activity_rows, ActivityRow.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        YGFloatOptional yGFloatOptional = orderListSection.screen_content;
        byteString.getClass();
        return new OrderListSection(m1169redactElements, yGFloatOptional, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OrderListSection orderListSection = (OrderListSection) obj;
        orderListSection.getClass();
        ActivityRow.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, orderListSection.activity_rows);
        YGFloatOptional yGFloatOptional = orderListSection.screen_content;
        if (yGFloatOptional instanceof OrderListSection$ScreenContent$EligibleOrders) {
            OrderListSection.EligibleRetroOrders.ADAPTER.encodeWithTag(protoWriter, 2, ((OrderListSection$ScreenContent$EligibleOrders) yGFloatOptional).value);
        } else if (yGFloatOptional instanceof OrderListSection$ScreenContent$TextLines) {
            OrderListSection.TextLineItems.ADAPTER.encodeWithTag(protoWriter, 3, ((OrderListSection$ScreenContent$TextLines) yGFloatOptional).value);
        } else if (yGFloatOptional != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(orderListSection.unknownFields());
    }
}
