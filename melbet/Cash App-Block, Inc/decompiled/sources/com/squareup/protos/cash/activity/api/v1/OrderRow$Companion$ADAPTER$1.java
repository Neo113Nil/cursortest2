package com.squareup.protos.cash.activity.api.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.activity.api.v1.OrderRow;
import com.squareup.protos.cash.pay.CashAppPayOrderRenderData;
import com.squareup.protos.franklin.ui.UiCustomer;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/activity/api/v1/OrderRow$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/activity/api/v1/OrderRow;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OrderRow$Companion$ADAPTER$1 extends ProtoAdapter {
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
        Object obj7 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new OrderRow((CashAppPayOrderRenderData) obj, (String) obj2, (OrderRow.OrderRowLoanUiState) obj3, (String) obj4, (String) obj5, (UiCustomer) obj6, (UiCustomer) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(CashAppPayOrderRenderData.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    try {
                        obj3 = OrderRow.OrderRowLoanUiState.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 3:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(UiCustomer.ADAPTER, protoReader, obj6);
                    break;
                case 7:
                    obj7 = TransactorKt.decodeMessageOrMerge(UiCustomer.ADAPTER, protoReader, obj7);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        OrderRow orderRow = (OrderRow) obj;
        reverseProtoWriter.getClass();
        orderRow.getClass();
        reverseProtoWriter.writeBytes(orderRow.unknownFields());
        ProtoAdapter protoAdapter = UiCustomer.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, orderRow.recipient);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, orderRow.sender);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, orderRow.recipient_id);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, orderRow.sender_id);
        OrderRow.OrderRowLoanUiState.ADAPTER.encodeWithTag(reverseProtoWriter, 2, orderRow.loan_ui_state);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, orderRow.render_data);
        CashAppPayOrderRenderData.ADAPTER.encodeWithTag(reverseProtoWriter, 1, orderRow.order);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        OrderRow orderRow = (OrderRow) obj;
        orderRow.getClass();
        int encodedSizeWithTag = CashAppPayOrderRenderData.ADAPTER.encodedSizeWithTag(1, orderRow.order) + orderRow.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(5, orderRow.recipient_id) + protoAdapter.encodedSizeWithTag(4, orderRow.sender_id) + OrderRow.OrderRowLoanUiState.ADAPTER.encodedSizeWithTag(2, orderRow.loan_ui_state) + protoAdapter.encodedSizeWithTag(3, orderRow.render_data) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = UiCustomer.ADAPTER;
        return protoAdapter2.encodedSizeWithTag(7, orderRow.recipient) + protoAdapter2.encodedSizeWithTag(6, orderRow.sender) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        OrderRow orderRow = (OrderRow) obj;
        orderRow.getClass();
        CashAppPayOrderRenderData cashAppPayOrderRenderData = orderRow.order;
        CashAppPayOrderRenderData cashAppPayOrderRenderData2 = cashAppPayOrderRenderData != null ? (CashAppPayOrderRenderData) CashAppPayOrderRenderData.ADAPTER.redact(cashAppPayOrderRenderData) : null;
        UiCustomer uiCustomer = orderRow.sender;
        UiCustomer uiCustomer2 = uiCustomer != null ? (UiCustomer) UiCustomer.ADAPTER.redact(uiCustomer) : null;
        UiCustomer uiCustomer3 = orderRow.recipient;
        UiCustomer uiCustomer4 = uiCustomer3 != null ? (UiCustomer) UiCustomer.ADAPTER.redact(uiCustomer3) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = orderRow.render_data;
        OrderRow.OrderRowLoanUiState orderRowLoanUiState = orderRow.loan_ui_state;
        String str2 = orderRow.sender_id;
        String str3 = orderRow.recipient_id;
        byteString.getClass();
        return new OrderRow(cashAppPayOrderRenderData2, str, orderRowLoanUiState, str2, str3, uiCustomer2, uiCustomer4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OrderRow orderRow = (OrderRow) obj;
        orderRow.getClass();
        CashAppPayOrderRenderData.ADAPTER.encodeWithTag(protoWriter, 1, orderRow.order);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 3, orderRow.render_data);
        OrderRow.OrderRowLoanUiState.ADAPTER.encodeWithTag(protoWriter, 2, orderRow.loan_ui_state);
        protoAdapter.encodeWithTag(protoWriter, 4, orderRow.sender_id);
        protoAdapter.encodeWithTag(protoWriter, 5, orderRow.recipient_id);
        ProtoAdapter protoAdapter2 = UiCustomer.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 6, orderRow.sender);
        protoAdapter2.encodeWithTag(protoWriter, 7, orderRow.recipient);
        protoWriter.writeBytes(orderRow.unknownFields());
    }
}
