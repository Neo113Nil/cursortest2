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
public final class HeroBalanceSection$PaymentCalendar$Overdue$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new HeroBalanceSection.PaymentCalendar.Overdue((Money) obj, (AnalyticsEvent) obj2, (AnalyticsEvent) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(AnalyticsEvent.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(AnalyticsEvent.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        HeroBalanceSection.PaymentCalendar.Overdue overdue = (HeroBalanceSection.PaymentCalendar.Overdue) obj;
        reverseProtoWriter.getClass();
        overdue.getClass();
        reverseProtoWriter.writeBytes(overdue.unknownFields());
        ProtoAdapter protoAdapter = AnalyticsEvent.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, overdue.analytic_tap_event);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, overdue.analytic_view_event);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 1, overdue.amount);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        HeroBalanceSection.PaymentCalendar.Overdue overdue = (HeroBalanceSection.PaymentCalendar.Overdue) obj;
        overdue.getClass();
        int encodedSizeWithTag = Money.ADAPTER.encodedSizeWithTag(1, overdue.amount) + overdue.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = AnalyticsEvent.ADAPTER;
        return protoAdapter.encodedSizeWithTag(3, overdue.analytic_tap_event) + protoAdapter.encodedSizeWithTag(2, overdue.analytic_view_event) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        HeroBalanceSection.PaymentCalendar.Overdue overdue = (HeroBalanceSection.PaymentCalendar.Overdue) obj;
        overdue.getClass();
        Money money = overdue.amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        AnalyticsEvent analyticsEvent = overdue.analytic_view_event;
        AnalyticsEvent analyticsEvent2 = analyticsEvent != null ? (AnalyticsEvent) AnalyticsEvent.ADAPTER.redact(analyticsEvent) : null;
        AnalyticsEvent analyticsEvent3 = overdue.analytic_tap_event;
        AnalyticsEvent analyticsEvent4 = analyticsEvent3 != null ? (AnalyticsEvent) AnalyticsEvent.ADAPTER.redact(analyticsEvent3) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new HeroBalanceSection.PaymentCalendar.Overdue(money2, analyticsEvent2, analyticsEvent4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        HeroBalanceSection.PaymentCalendar.Overdue overdue = (HeroBalanceSection.PaymentCalendar.Overdue) obj;
        overdue.getClass();
        Money.ADAPTER.encodeWithTag(protoWriter, 1, overdue.amount);
        ProtoAdapter protoAdapter = AnalyticsEvent.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, overdue.analytic_view_event);
        protoAdapter.encodeWithTag(protoWriter, 3, overdue.analytic_tap_event);
        protoWriter.writeBytes(overdue.unknownFields());
    }
}
