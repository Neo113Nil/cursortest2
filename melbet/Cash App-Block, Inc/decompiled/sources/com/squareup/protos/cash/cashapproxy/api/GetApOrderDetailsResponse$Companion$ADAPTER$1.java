package com.squareup.protos.cash.cashapproxy.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetApOrderDetailsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList arrayList;
        ?? decodeMessageOrMerge;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Text text = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Avatar avatar = null;
        Text text2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            Object obj11 = obj5;
            if (nextTag == -1) {
                return new GetApOrderDetailsResponse(avatar, text, text2, (OrderPaymentMethod) obj11, (Text) obj6, m, (Text) obj7, (Text) obj8, arrayList2, arrayList3, (Button) obj9, (InfoTile) obj10, (SingleUsePaymentSummary) obj2, (Text) obj3, (SupTransactions) obj, (Button) obj4, arrayList4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj5 = obj11;
                    arrayList = arrayList4;
                    avatar = TransactorKt.decodeMessageOrMerge(Avatar.ADAPTER, protoReader, avatar);
                    decodeMessageOrMerge = text;
                    break;
                case 2:
                    obj5 = obj11;
                    arrayList = arrayList4;
                    decodeMessageOrMerge = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, text);
                    break;
                case 3:
                    obj5 = obj11;
                    arrayList = arrayList4;
                    text2 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, text2);
                    decodeMessageOrMerge = text;
                    break;
                case 4:
                    Object decodeMessageOrMerge2 = TransactorKt.decodeMessageOrMerge(OrderPaymentMethod.ADAPTER, protoReader, obj11);
                    arrayList = arrayList4;
                    obj5 = decodeMessageOrMerge2;
                    decodeMessageOrMerge = text;
                    break;
                case 5:
                    obj6 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj6);
                    obj5 = obj11;
                    arrayList = arrayList4;
                    decodeMessageOrMerge = text;
                    break;
                case 6:
                    m.add(ScheduledPayment.ADAPTER.decode(protoReader));
                    obj5 = obj11;
                    arrayList = arrayList4;
                    decodeMessageOrMerge = text;
                    break;
                case 7:
                    obj7 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj7);
                    obj5 = obj11;
                    arrayList = arrayList4;
                    decodeMessageOrMerge = text;
                    break;
                case 8:
                    obj8 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj8);
                    obj5 = obj11;
                    arrayList = arrayList4;
                    decodeMessageOrMerge = text;
                    break;
                case 9:
                    arrayList2.add(OrderDetailRow.ADAPTER.decode(protoReader));
                    obj5 = obj11;
                    arrayList = arrayList4;
                    decodeMessageOrMerge = text;
                    break;
                case 10:
                    arrayList3.add(OverflowAction.ADAPTER.decode(protoReader));
                    obj5 = obj11;
                    arrayList = arrayList4;
                    decodeMessageOrMerge = text;
                    break;
                case 11:
                    obj9 = TransactorKt.decodeMessageOrMerge(Button.ADAPTER, protoReader, obj9);
                    obj5 = obj11;
                    arrayList = arrayList4;
                    decodeMessageOrMerge = text;
                    break;
                case 12:
                    obj10 = TransactorKt.decodeMessageOrMerge(InfoTile.ADAPTER, protoReader, obj10);
                    obj5 = obj11;
                    arrayList = arrayList4;
                    decodeMessageOrMerge = text;
                    break;
                case 13:
                    obj2 = TransactorKt.decodeMessageOrMerge(SingleUsePaymentSummary.ADAPTER, protoReader, obj2);
                    obj5 = obj11;
                    arrayList = arrayList4;
                    decodeMessageOrMerge = text;
                    break;
                case 14:
                    obj3 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj3);
                    obj5 = obj11;
                    arrayList = arrayList4;
                    decodeMessageOrMerge = text;
                    break;
                case 15:
                    obj = TransactorKt.decodeMessageOrMerge(SupTransactions.ADAPTER, protoReader, obj);
                    obj5 = obj11;
                    arrayList = arrayList4;
                    decodeMessageOrMerge = text;
                    break;
                case 16:
                    obj4 = TransactorKt.decodeMessageOrMerge(Button.ADAPTER, protoReader, obj4);
                    obj5 = obj11;
                    arrayList = arrayList4;
                    decodeMessageOrMerge = text;
                    break;
                case 17:
                    arrayList4.add(OrderPaymentMethod.ADAPTER.decode(protoReader));
                    obj5 = obj11;
                    arrayList = arrayList4;
                    decodeMessageOrMerge = text;
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    obj5 = obj11;
                    arrayList = arrayList4;
                    decodeMessageOrMerge = text;
                    break;
            }
            text = decodeMessageOrMerge;
            arrayList4 = arrayList;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetApOrderDetailsResponse getApOrderDetailsResponse = (GetApOrderDetailsResponse) obj;
        reverseProtoWriter.getClass();
        getApOrderDetailsResponse.getClass();
        reverseProtoWriter.writeBytes(getApOrderDetailsResponse.unknownFields());
        ProtoAdapter protoAdapter = OrderPaymentMethod.ADAPTER;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 17, getApOrderDetailsResponse.available_payment_methods);
        ProtoAdapter protoAdapter2 = Button.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 16, getApOrderDetailsResponse.secondary_action_button);
        SupTransactions.ADAPTER.encodeWithTag(reverseProtoWriter, 15, getApOrderDetailsResponse.sup_transactions);
        ProtoAdapter protoAdapter3 = Text.ADAPTER;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 14, getApOrderDetailsResponse.sup_message);
        SingleUsePaymentSummary.ADAPTER.encodeWithTag(reverseProtoWriter, 13, getApOrderDetailsResponse.sup_card);
        InfoTile.ADAPTER.encodeWithTag(reverseProtoWriter, 12, getApOrderDetailsResponse.info_tile);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 11, getApOrderDetailsResponse.primary_action_button);
        OverflowAction.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 10, getApOrderDetailsResponse.overflow_actions);
        OrderDetailRow.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 9, getApOrderDetailsResponse.order_details_rows);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 8, getApOrderDetailsResponse.order_details_title);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 7, getApOrderDetailsResponse.info_text);
        ScheduledPayment.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 6, getApOrderDetailsResponse.schedule_payments);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 5, getApOrderDetailsResponse.balance_summary);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, getApOrderDetailsResponse.order_payment_method);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 3, getApOrderDetailsResponse.subtitle);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 2, getApOrderDetailsResponse.title);
        Avatar.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getApOrderDetailsResponse.avatar);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetApOrderDetailsResponse getApOrderDetailsResponse = (GetApOrderDetailsResponse) obj;
        getApOrderDetailsResponse.getClass();
        int encodedSizeWithTag = Avatar.ADAPTER.encodedSizeWithTag(1, getApOrderDetailsResponse.avatar) + getApOrderDetailsResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Text.ADAPTER;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(3, getApOrderDetailsResponse.subtitle) + protoAdapter.encodedSizeWithTag(2, getApOrderDetailsResponse.title) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = OrderPaymentMethod.ADAPTER;
        int encodedSizeWithTag3 = OverflowAction.ADAPTER.asRepeated().encodedSizeWithTag(10, getApOrderDetailsResponse.overflow_actions) + OrderDetailRow.ADAPTER.asRepeated().encodedSizeWithTag(9, getApOrderDetailsResponse.order_details_rows) + protoAdapter.encodedSizeWithTag(8, getApOrderDetailsResponse.order_details_title) + protoAdapter.encodedSizeWithTag(7, getApOrderDetailsResponse.info_text) + ScheduledPayment.ADAPTER.asRepeated().encodedSizeWithTag(6, getApOrderDetailsResponse.schedule_payments) + protoAdapter.encodedSizeWithTag(5, getApOrderDetailsResponse.balance_summary) + protoAdapter2.encodedSizeWithTag(4, getApOrderDetailsResponse.order_payment_method) + encodedSizeWithTag2;
        ProtoAdapter protoAdapter3 = Button.ADAPTER;
        return protoAdapter2.asRepeated().encodedSizeWithTag(17, getApOrderDetailsResponse.available_payment_methods) + protoAdapter3.encodedSizeWithTag(16, getApOrderDetailsResponse.secondary_action_button) + SupTransactions.ADAPTER.encodedSizeWithTag(15, getApOrderDetailsResponse.sup_transactions) + protoAdapter.encodedSizeWithTag(14, getApOrderDetailsResponse.sup_message) + SingleUsePaymentSummary.ADAPTER.encodedSizeWithTag(13, getApOrderDetailsResponse.sup_card) + InfoTile.ADAPTER.encodedSizeWithTag(12, getApOrderDetailsResponse.info_tile) + protoAdapter3.encodedSizeWithTag(11, getApOrderDetailsResponse.primary_action_button) + encodedSizeWithTag3;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetApOrderDetailsResponse getApOrderDetailsResponse = (GetApOrderDetailsResponse) obj;
        getApOrderDetailsResponse.getClass();
        Avatar avatar = getApOrderDetailsResponse.avatar;
        Avatar avatar2 = avatar != null ? (Avatar) Avatar.ADAPTER.redact(avatar) : null;
        Text text = getApOrderDetailsResponse.title;
        Text text2 = text != null ? (Text) Text.ADAPTER.redact(text) : null;
        Text text3 = getApOrderDetailsResponse.subtitle;
        Text text4 = text3 != null ? (Text) Text.ADAPTER.redact(text3) : null;
        OrderPaymentMethod orderPaymentMethod = getApOrderDetailsResponse.order_payment_method;
        OrderPaymentMethod orderPaymentMethod2 = orderPaymentMethod != null ? (OrderPaymentMethod) OrderPaymentMethod.ADAPTER.redact(orderPaymentMethod) : null;
        Text text5 = getApOrderDetailsResponse.balance_summary;
        Text text6 = text5 != null ? (Text) Text.ADAPTER.redact(text5) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getApOrderDetailsResponse.schedule_payments, ScheduledPayment.ADAPTER);
        Text text7 = getApOrderDetailsResponse.info_text;
        Text text8 = text7 != null ? (Text) Text.ADAPTER.redact(text7) : null;
        Text text9 = getApOrderDetailsResponse.order_details_title;
        Text text10 = text9 != null ? (Text) Text.ADAPTER.redact(text9) : null;
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(getApOrderDetailsResponse.order_details_rows, OrderDetailRow.ADAPTER);
        ArrayList m1169redactElements3 = TransactorKt.m1169redactElements(getApOrderDetailsResponse.overflow_actions, OverflowAction.ADAPTER);
        Button button = getApOrderDetailsResponse.primary_action_button;
        Button button2 = button != null ? (Button) Button.ADAPTER.redact(button) : null;
        InfoTile infoTile = getApOrderDetailsResponse.info_tile;
        InfoTile infoTile2 = infoTile != null ? (InfoTile) InfoTile.ADAPTER.redact(infoTile) : null;
        SingleUsePaymentSummary singleUsePaymentSummary = getApOrderDetailsResponse.sup_card;
        SingleUsePaymentSummary singleUsePaymentSummary2 = singleUsePaymentSummary != null ? (SingleUsePaymentSummary) SingleUsePaymentSummary.ADAPTER.redact(singleUsePaymentSummary) : null;
        Text text11 = getApOrderDetailsResponse.sup_message;
        Text text12 = text11 != null ? (Text) Text.ADAPTER.redact(text11) : null;
        SupTransactions supTransactions = getApOrderDetailsResponse.sup_transactions;
        SupTransactions supTransactions2 = supTransactions != null ? (SupTransactions) SupTransactions.ADAPTER.redact(supTransactions) : null;
        Button button3 = getApOrderDetailsResponse.secondary_action_button;
        Button button4 = button3 != null ? (Button) Button.ADAPTER.redact(button3) : null;
        ArrayList m1169redactElements4 = TransactorKt.m1169redactElements(getApOrderDetailsResponse.available_payment_methods, OrderPaymentMethod.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetApOrderDetailsResponse(avatar2, text2, text4, orderPaymentMethod2, text6, m1169redactElements, text8, text10, m1169redactElements2, m1169redactElements3, button2, infoTile2, singleUsePaymentSummary2, text12, supTransactions2, button4, m1169redactElements4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetApOrderDetailsResponse getApOrderDetailsResponse = (GetApOrderDetailsResponse) obj;
        getApOrderDetailsResponse.getClass();
        Avatar.ADAPTER.encodeWithTag(protoWriter, 1, getApOrderDetailsResponse.avatar);
        ProtoAdapter protoAdapter = Text.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, getApOrderDetailsResponse.title);
        protoAdapter.encodeWithTag(protoWriter, 3, getApOrderDetailsResponse.subtitle);
        ProtoAdapter protoAdapter2 = OrderPaymentMethod.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 4, getApOrderDetailsResponse.order_payment_method);
        protoAdapter.encodeWithTag(protoWriter, 5, getApOrderDetailsResponse.balance_summary);
        ScheduledPayment.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, getApOrderDetailsResponse.schedule_payments);
        protoAdapter.encodeWithTag(protoWriter, 7, getApOrderDetailsResponse.info_text);
        protoAdapter.encodeWithTag(protoWriter, 8, getApOrderDetailsResponse.order_details_title);
        OrderDetailRow.ADAPTER.asRepeated().encodeWithTag(protoWriter, 9, getApOrderDetailsResponse.order_details_rows);
        OverflowAction.ADAPTER.asRepeated().encodeWithTag(protoWriter, 10, getApOrderDetailsResponse.overflow_actions);
        ProtoAdapter protoAdapter3 = Button.ADAPTER;
        protoAdapter3.encodeWithTag(protoWriter, 11, getApOrderDetailsResponse.primary_action_button);
        InfoTile.ADAPTER.encodeWithTag(protoWriter, 12, getApOrderDetailsResponse.info_tile);
        SingleUsePaymentSummary.ADAPTER.encodeWithTag(protoWriter, 13, getApOrderDetailsResponse.sup_card);
        protoAdapter.encodeWithTag(protoWriter, 14, getApOrderDetailsResponse.sup_message);
        SupTransactions.ADAPTER.encodeWithTag(protoWriter, 15, getApOrderDetailsResponse.sup_transactions);
        protoAdapter3.encodeWithTag(protoWriter, 16, getApOrderDetailsResponse.secondary_action_button);
        protoAdapter2.asRepeated().encodeWithTag(protoWriter, 17, getApOrderDetailsResponse.available_payment_methods);
        protoWriter.writeBytes(getApOrderDetailsResponse.unknownFields());
    }
}
