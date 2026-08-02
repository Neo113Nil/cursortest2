package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cashsuggest.api.HeroBalanceSection;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class HeroBalanceSection$PaymentCalendar$Payment$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new HeroBalanceSection.PaymentCalendar.Payment((Long) obj, (Money) obj2, (AnalyticsEvent) obj3, (AnalyticsEvent) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(AnalyticsEvent.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(AnalyticsEvent.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        HeroBalanceSection.PaymentCalendar.Payment payment = (HeroBalanceSection.PaymentCalendar.Payment) obj;
        reverseProtoWriter.getClass();
        payment.getClass();
        reverseProtoWriter.writeBytes(payment.unknownFields());
        ProtoAdapter protoAdapter = AnalyticsEvent.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, payment.analytic_tap_event);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, payment.analytic_view_event);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 2, payment.amount);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 1, payment.due_date_ms);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        HeroBalanceSection.PaymentCalendar.Payment payment = (HeroBalanceSection.PaymentCalendar.Payment) obj;
        payment.getClass();
        int encodedSizeWithTag = Money.ADAPTER.encodedSizeWithTag(2, payment.amount) + ProtoAdapter.INT64.encodedSizeWithTag(1, payment.due_date_ms) + payment.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = AnalyticsEvent.ADAPTER;
        return protoAdapter.encodedSizeWithTag(4, payment.analytic_tap_event) + protoAdapter.encodedSizeWithTag(3, payment.analytic_view_event) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        HeroBalanceSection.PaymentCalendar.Payment payment = (HeroBalanceSection.PaymentCalendar.Payment) obj;
        payment.getClass();
        Money money = payment.amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        AnalyticsEvent analyticsEvent = payment.analytic_view_event;
        AnalyticsEvent analyticsEvent2 = analyticsEvent != null ? (AnalyticsEvent) AnalyticsEvent.ADAPTER.redact(analyticsEvent) : null;
        AnalyticsEvent analyticsEvent3 = payment.analytic_tap_event;
        AnalyticsEvent analyticsEvent4 = analyticsEvent3 != null ? (AnalyticsEvent) AnalyticsEvent.ADAPTER.redact(analyticsEvent3) : null;
        ByteString byteString = ByteString.EMPTY;
        Long l = payment.due_date_ms;
        byteString.getClass();
        return new HeroBalanceSection.PaymentCalendar.Payment(l, money2, analyticsEvent2, analyticsEvent4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        HeroBalanceSection.PaymentCalendar.Payment payment = (HeroBalanceSection.PaymentCalendar.Payment) obj;
        payment.getClass();
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, payment.due_date_ms);
        Money.ADAPTER.encodeWithTag(protoWriter, 2, payment.amount);
        ProtoAdapter protoAdapter = AnalyticsEvent.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 3, payment.analytic_view_event);
        protoAdapter.encodeWithTag(protoWriter, 4, payment.analytic_tap_event);
        protoWriter.writeBytes(payment.unknownFields());
    }
}
