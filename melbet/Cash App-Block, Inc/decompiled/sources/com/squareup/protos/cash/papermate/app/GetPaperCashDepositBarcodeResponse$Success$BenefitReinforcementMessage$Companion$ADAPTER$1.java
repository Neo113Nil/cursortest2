package com.squareup.protos.cash.papermate.app;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.papermate.app.GetPaperCashDepositBarcodeResponse;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetPaperCashDepositBarcodeResponse$Success$BenefitReinforcementMessage$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetPaperCashDepositBarcodeResponse.Success.BenefitReinforcementMessage((Icon) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Icon.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetPaperCashDepositBarcodeResponse.Success.BenefitReinforcementMessage benefitReinforcementMessage = (GetPaperCashDepositBarcodeResponse.Success.BenefitReinforcementMessage) obj;
        reverseProtoWriter.getClass();
        benefitReinforcementMessage.getClass();
        reverseProtoWriter.writeBytes(benefitReinforcementMessage.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, benefitReinforcementMessage.text);
        Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 1, benefitReinforcementMessage.icon);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetPaperCashDepositBarcodeResponse.Success.BenefitReinforcementMessage benefitReinforcementMessage = (GetPaperCashDepositBarcodeResponse.Success.BenefitReinforcementMessage) obj;
        benefitReinforcementMessage.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, benefitReinforcementMessage.text) + Icon.ADAPTER.encodedSizeWithTag(1, benefitReinforcementMessage.icon) + benefitReinforcementMessage.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetPaperCashDepositBarcodeResponse.Success.BenefitReinforcementMessage benefitReinforcementMessage = (GetPaperCashDepositBarcodeResponse.Success.BenefitReinforcementMessage) obj;
        benefitReinforcementMessage.getClass();
        Icon icon = benefitReinforcementMessage.icon;
        Icon icon2 = icon != null ? (Icon) Icon.ADAPTER.redact(icon) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = benefitReinforcementMessage.text;
        byteString.getClass();
        return new GetPaperCashDepositBarcodeResponse.Success.BenefitReinforcementMessage(icon2, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetPaperCashDepositBarcodeResponse.Success.BenefitReinforcementMessage benefitReinforcementMessage = (GetPaperCashDepositBarcodeResponse.Success.BenefitReinforcementMessage) obj;
        benefitReinforcementMessage.getClass();
        Icon.ADAPTER.encodeWithTag(protoWriter, 1, benefitReinforcementMessage.icon);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, benefitReinforcementMessage.text);
        protoWriter.writeBytes(benefitReinforcementMessage.unknownFields());
    }
}
