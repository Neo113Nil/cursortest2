package com.squareup.lending;

import androidx.room.TransactorKt;
import com.squareup.lending.PrepurchaseCashCardAppletData;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PrepurchaseCashCardAppletData$InfoRow$PaymentPlanAction$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PrepurchaseCashCardAppletData.InfoRow.PaymentPlanAction((LocalizedString) obj2, (String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PrepurchaseCashCardAppletData.InfoRow.PaymentPlanAction paymentPlanAction = (PrepurchaseCashCardAppletData.InfoRow.PaymentPlanAction) obj;
        reverseProtoWriter.getClass();
        paymentPlanAction.getClass();
        reverseProtoWriter.writeBytes(paymentPlanAction.unknownFields());
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 3, paymentPlanAction.action_accessibility_hint);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, paymentPlanAction.initial_selected_option_identifier);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PrepurchaseCashCardAppletData.InfoRow.PaymentPlanAction paymentPlanAction = (PrepurchaseCashCardAppletData.InfoRow.PaymentPlanAction) obj;
        paymentPlanAction.getClass();
        return LocalizedString.ADAPTER.encodedSizeWithTag(3, paymentPlanAction.action_accessibility_hint) + ProtoAdapter.STRING.encodedSizeWithTag(1, paymentPlanAction.initial_selected_option_identifier) + paymentPlanAction.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PrepurchaseCashCardAppletData.InfoRow.PaymentPlanAction paymentPlanAction = (PrepurchaseCashCardAppletData.InfoRow.PaymentPlanAction) obj;
        paymentPlanAction.getClass();
        LocalizedString localizedString = paymentPlanAction.action_accessibility_hint;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = paymentPlanAction.initial_selected_option_identifier;
        byteString.getClass();
        return new PrepurchaseCashCardAppletData.InfoRow.PaymentPlanAction(localizedString2, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PrepurchaseCashCardAppletData.InfoRow.PaymentPlanAction paymentPlanAction = (PrepurchaseCashCardAppletData.InfoRow.PaymentPlanAction) obj;
        paymentPlanAction.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, paymentPlanAction.initial_selected_option_identifier);
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 3, paymentPlanAction.action_accessibility_hint);
        protoWriter.writeBytes(paymentPlanAction.unknownFields());
    }
}
