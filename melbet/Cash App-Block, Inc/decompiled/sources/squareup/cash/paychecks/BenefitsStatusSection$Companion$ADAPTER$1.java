package squareup.cash.paychecks;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.paychecks.BenefitsStatusSection;

/* loaded from: classes10.dex */
public final class BenefitsStatusSection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BenefitsStatusSection((BenefitsStatusSection.ColoredText) obj, (LocalizedString) obj2, (BenefitsStatusSection.State) obj3, (BenefitsStatusSection.Button) obj4, (BenefitsStatusSection.Button) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(BenefitsStatusSection.ColoredText.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                try {
                    obj3 = BenefitsStatusSection.State.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 4) {
                obj4 = TransactorKt.decodeMessageOrMerge(BenefitsStatusSection.Button.ADAPTER, protoReader, obj4);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(BenefitsStatusSection.Button.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BenefitsStatusSection benefitsStatusSection = (BenefitsStatusSection) obj;
        reverseProtoWriter.getClass();
        benefitsStatusSection.getClass();
        reverseProtoWriter.writeBytes(benefitsStatusSection.unknownFields());
        ProtoAdapter protoAdapter = BenefitsStatusSection.Button.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, benefitsStatusSection.finish_benefits_setup_button);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, benefitsStatusSection.view_benefits_button);
        BenefitsStatusSection.State.ADAPTER.encodeWithTag(reverseProtoWriter, 3, benefitsStatusSection.state);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 2, benefitsStatusSection.subtitle);
        BenefitsStatusSection.ColoredText.ADAPTER.encodeWithTag(reverseProtoWriter, 1, benefitsStatusSection.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BenefitsStatusSection benefitsStatusSection = (BenefitsStatusSection) obj;
        benefitsStatusSection.getClass();
        int encodedSizeWithTag = BenefitsStatusSection.State.ADAPTER.encodedSizeWithTag(3, benefitsStatusSection.state) + LocalizedString.ADAPTER.encodedSizeWithTag(2, benefitsStatusSection.subtitle) + BenefitsStatusSection.ColoredText.ADAPTER.encodedSizeWithTag(1, benefitsStatusSection.title) + benefitsStatusSection.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = BenefitsStatusSection.Button.ADAPTER;
        return protoAdapter.encodedSizeWithTag(5, benefitsStatusSection.finish_benefits_setup_button) + protoAdapter.encodedSizeWithTag(4, benefitsStatusSection.view_benefits_button) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BenefitsStatusSection benefitsStatusSection = (BenefitsStatusSection) obj;
        benefitsStatusSection.getClass();
        BenefitsStatusSection.ColoredText coloredText = benefitsStatusSection.title;
        BenefitsStatusSection.ColoredText coloredText2 = coloredText != null ? (BenefitsStatusSection.ColoredText) BenefitsStatusSection.ColoredText.ADAPTER.redact(coloredText) : null;
        LocalizedString localizedString = benefitsStatusSection.subtitle;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        BenefitsStatusSection.Button button = benefitsStatusSection.view_benefits_button;
        BenefitsStatusSection.Button button2 = button != null ? (BenefitsStatusSection.Button) BenefitsStatusSection.Button.ADAPTER.redact(button) : null;
        BenefitsStatusSection.Button button3 = benefitsStatusSection.finish_benefits_setup_button;
        BenefitsStatusSection.Button button4 = button3 != null ? (BenefitsStatusSection.Button) BenefitsStatusSection.Button.ADAPTER.redact(button3) : null;
        ByteString byteString = ByteString.EMPTY;
        BenefitsStatusSection.State state = benefitsStatusSection.state;
        byteString.getClass();
        return new BenefitsStatusSection(coloredText2, localizedString2, state, button2, button4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BenefitsStatusSection benefitsStatusSection = (BenefitsStatusSection) obj;
        benefitsStatusSection.getClass();
        BenefitsStatusSection.ColoredText.ADAPTER.encodeWithTag(protoWriter, 1, benefitsStatusSection.title);
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 2, benefitsStatusSection.subtitle);
        BenefitsStatusSection.State.ADAPTER.encodeWithTag(protoWriter, 3, benefitsStatusSection.state);
        ProtoAdapter protoAdapter = BenefitsStatusSection.Button.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 4, benefitsStatusSection.view_benefits_button);
        protoAdapter.encodeWithTag(protoWriter, 5, benefitsStatusSection.finish_benefits_setup_button);
        protoWriter.writeBytes(benefitsStatusSection.unknownFields());
    }
}
