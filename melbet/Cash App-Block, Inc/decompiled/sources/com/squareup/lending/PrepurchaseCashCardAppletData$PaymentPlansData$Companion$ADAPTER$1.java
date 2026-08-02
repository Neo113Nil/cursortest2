package com.squareup.lending;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.lending.PrepurchaseCashCardAppletData;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PrepurchaseCashCardAppletData$PaymentPlansData$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new PrepurchaseCashCardAppletData.PaymentPlansData((LocalizedString) obj, (LocalizedString) obj2, m, (LocalizedString) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                m.add(PrepurchaseCashCardAppletData.PaymentPlansData.Option.ADAPTER.decode(protoReader));
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PrepurchaseCashCardAppletData.PaymentPlansData paymentPlansData = (PrepurchaseCashCardAppletData.PaymentPlansData) obj;
        reverseProtoWriter.getClass();
        paymentPlansData.getClass();
        reverseProtoWriter.writeBytes(paymentPlansData.unknownFields());
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, paymentPlansData.primary_button_text);
        PrepurchaseCashCardAppletData.PaymentPlansData.Option.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, paymentPlansData.options);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, paymentPlansData.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, paymentPlansData.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PrepurchaseCashCardAppletData.PaymentPlansData paymentPlansData = (PrepurchaseCashCardAppletData.PaymentPlansData) obj;
        paymentPlansData.getClass();
        int size$okio = paymentPlansData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return protoAdapter.encodedSizeWithTag(4, paymentPlansData.primary_button_text) + PrepurchaseCashCardAppletData.PaymentPlansData.Option.ADAPTER.asRepeated().encodedSizeWithTag(3, paymentPlansData.options) + protoAdapter.encodedSizeWithTag(2, paymentPlansData.subtitle) + protoAdapter.encodedSizeWithTag(1, paymentPlansData.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PrepurchaseCashCardAppletData.PaymentPlansData paymentPlansData = (PrepurchaseCashCardAppletData.PaymentPlansData) obj;
        paymentPlansData.getClass();
        LocalizedString localizedString = paymentPlansData.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = paymentPlansData.subtitle;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(paymentPlansData.options, PrepurchaseCashCardAppletData.PaymentPlansData.Option.ADAPTER);
        LocalizedString localizedString5 = paymentPlansData.primary_button_text;
        LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new PrepurchaseCashCardAppletData.PaymentPlansData(localizedString2, localizedString4, m1169redactElements, localizedString6, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PrepurchaseCashCardAppletData.PaymentPlansData paymentPlansData = (PrepurchaseCashCardAppletData.PaymentPlansData) obj;
        paymentPlansData.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, paymentPlansData.title);
        protoAdapter.encodeWithTag(protoWriter, 2, paymentPlansData.subtitle);
        PrepurchaseCashCardAppletData.PaymentPlansData.Option.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, paymentPlansData.options);
        protoAdapter.encodeWithTag(protoWriter, 4, paymentPlansData.primary_button_text);
        protoWriter.writeBytes(paymentPlansData.unknownFields());
    }
}
