package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashsuggest.api.HeroBalanceSection;
import com.squareup.protos.cash.shop.rendering.api.Button;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class HeroBalanceSection$PaymentCalendar$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new HeroBalanceSection.PaymentCalendar(m, (HeroBalanceSection.PaymentCalendar.Overdue) obj, (Button) obj2, (HeroBalanceSection.SectionCTA) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(HeroBalanceSection.PaymentCalendar.Payment.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                obj = TransactorKt.decodeMessageOrMerge(HeroBalanceSection.PaymentCalendar.Overdue.ADAPTER, protoReader, obj);
            } else if (nextTag == 3) {
                obj2 = TransactorKt.decodeMessageOrMerge(Button.ADAPTER, protoReader, obj2);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(HeroBalanceSection.SectionCTA.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        HeroBalanceSection.PaymentCalendar paymentCalendar = (HeroBalanceSection.PaymentCalendar) obj;
        reverseProtoWriter.getClass();
        paymentCalendar.getClass();
        reverseProtoWriter.writeBytes(paymentCalendar.unknownFields());
        HeroBalanceSection.SectionCTA.ADAPTER.encodeWithTag(reverseProtoWriter, 4, paymentCalendar.cta);
        Button.ADAPTER.encodeWithTag(reverseProtoWriter, 3, paymentCalendar.primary_button);
        HeroBalanceSection.PaymentCalendar.Overdue.ADAPTER.encodeWithTag(reverseProtoWriter, 2, paymentCalendar.overdue);
        HeroBalanceSection.PaymentCalendar.Payment.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, paymentCalendar.upcoming_payments);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        HeroBalanceSection.PaymentCalendar paymentCalendar = (HeroBalanceSection.PaymentCalendar) obj;
        paymentCalendar.getClass();
        return HeroBalanceSection.SectionCTA.ADAPTER.encodedSizeWithTag(4, paymentCalendar.cta) + Button.ADAPTER.encodedSizeWithTag(3, paymentCalendar.primary_button) + HeroBalanceSection.PaymentCalendar.Overdue.ADAPTER.encodedSizeWithTag(2, paymentCalendar.overdue) + HeroBalanceSection.PaymentCalendar.Payment.ADAPTER.asRepeated().encodedSizeWithTag(1, paymentCalendar.upcoming_payments) + paymentCalendar.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        HeroBalanceSection.PaymentCalendar paymentCalendar = (HeroBalanceSection.PaymentCalendar) obj;
        paymentCalendar.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(paymentCalendar.upcoming_payments, HeroBalanceSection.PaymentCalendar.Payment.ADAPTER);
        HeroBalanceSection.PaymentCalendar.Overdue overdue = paymentCalendar.overdue;
        HeroBalanceSection.PaymentCalendar.Overdue overdue2 = overdue != null ? (HeroBalanceSection.PaymentCalendar.Overdue) HeroBalanceSection.PaymentCalendar.Overdue.ADAPTER.redact(overdue) : null;
        Button button = paymentCalendar.primary_button;
        Button button2 = button != null ? (Button) Button.ADAPTER.redact(button) : null;
        HeroBalanceSection.SectionCTA sectionCTA = paymentCalendar.cta;
        HeroBalanceSection.SectionCTA sectionCTA2 = sectionCTA != null ? (HeroBalanceSection.SectionCTA) HeroBalanceSection.SectionCTA.ADAPTER.redact(sectionCTA) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new HeroBalanceSection.PaymentCalendar(m1169redactElements, overdue2, button2, sectionCTA2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        HeroBalanceSection.PaymentCalendar paymentCalendar = (HeroBalanceSection.PaymentCalendar) obj;
        paymentCalendar.getClass();
        HeroBalanceSection.PaymentCalendar.Payment.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, paymentCalendar.upcoming_payments);
        HeroBalanceSection.PaymentCalendar.Overdue.ADAPTER.encodeWithTag(protoWriter, 2, paymentCalendar.overdue);
        Button.ADAPTER.encodeWithTag(protoWriter, 3, paymentCalendar.primary_button);
        HeroBalanceSection.SectionCTA.ADAPTER.encodeWithTag(protoWriter, 4, paymentCalendar.cta);
        protoWriter.writeBytes(paymentCalendar.unknownFields());
    }
}
