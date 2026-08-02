package squareup.cash.paychecks;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.paychecks.BenefitsDetails;

/* loaded from: classes10.dex */
public final class BenefitsDetails$PaychecksSection$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new BenefitsDetails.PaychecksSection((BenefitsDetails.ColoredText) obj, (LocalizedString) obj2, (BenefitsDetails.Button) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(BenefitsDetails.ColoredText.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(BenefitsDetails.Button.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BenefitsDetails.PaychecksSection paychecksSection = (BenefitsDetails.PaychecksSection) obj;
        reverseProtoWriter.getClass();
        paychecksSection.getClass();
        reverseProtoWriter.writeBytes(paychecksSection.unknownFields());
        BenefitsDetails.Button.ADAPTER.encodeWithTag(reverseProtoWriter, 3, paychecksSection.button);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 2, paychecksSection.subtitle);
        BenefitsDetails.ColoredText.ADAPTER.encodeWithTag(reverseProtoWriter, 1, paychecksSection.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BenefitsDetails.PaychecksSection paychecksSection = (BenefitsDetails.PaychecksSection) obj;
        paychecksSection.getClass();
        return BenefitsDetails.Button.ADAPTER.encodedSizeWithTag(3, paychecksSection.button) + LocalizedString.ADAPTER.encodedSizeWithTag(2, paychecksSection.subtitle) + BenefitsDetails.ColoredText.ADAPTER.encodedSizeWithTag(1, paychecksSection.title) + paychecksSection.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BenefitsDetails.PaychecksSection paychecksSection = (BenefitsDetails.PaychecksSection) obj;
        paychecksSection.getClass();
        BenefitsDetails.ColoredText coloredText = paychecksSection.title;
        BenefitsDetails.ColoredText coloredText2 = coloredText != null ? (BenefitsDetails.ColoredText) BenefitsDetails.ColoredText.ADAPTER.redact(coloredText) : null;
        LocalizedString localizedString = paychecksSection.subtitle;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        BenefitsDetails.Button button = paychecksSection.button;
        BenefitsDetails.Button button2 = button != null ? (BenefitsDetails.Button) BenefitsDetails.Button.ADAPTER.redact(button) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new BenefitsDetails.PaychecksSection(coloredText2, localizedString2, button2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BenefitsDetails.PaychecksSection paychecksSection = (BenefitsDetails.PaychecksSection) obj;
        paychecksSection.getClass();
        BenefitsDetails.ColoredText.ADAPTER.encodeWithTag(protoWriter, 1, paychecksSection.title);
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 2, paychecksSection.subtitle);
        BenefitsDetails.Button.ADAPTER.encodeWithTag(protoWriter, 3, paychecksSection.button);
        protoWriter.writeBytes(paychecksSection.unknownFields());
    }
}
