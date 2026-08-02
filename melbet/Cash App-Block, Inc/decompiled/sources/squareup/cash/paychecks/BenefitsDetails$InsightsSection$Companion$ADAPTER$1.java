package squareup.cash.paychecks;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;
import squareup.cash.paychecks.BenefitsDetails;

/* loaded from: classes10.dex */
public final class BenefitsDetails$InsightsSection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BenefitsDetails.InsightsSection((BenefitsDetails.ColoredText) obj, (LocalizedString) obj2, (BenefitsDetails.Button) obj3, m, (LocalizedString) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(BenefitsDetails.ColoredText.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(BenefitsDetails.Button.ADAPTER, protoReader, obj3);
            } else if (nextTag == 4) {
                m.add(LocalizedString.ADAPTER.decode(protoReader));
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BenefitsDetails.InsightsSection insightsSection = (BenefitsDetails.InsightsSection) obj;
        reverseProtoWriter.getClass();
        insightsSection.getClass();
        reverseProtoWriter.writeBytes(insightsSection.unknownFields());
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, insightsSection.spend_progress_text);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 4, insightsSection.disclosures);
        BenefitsDetails.Button.ADAPTER.encodeWithTag(reverseProtoWriter, 3, insightsSection.button);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, insightsSection.subtitle);
        BenefitsDetails.ColoredText.ADAPTER.encodeWithTag(reverseProtoWriter, 1, insightsSection.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BenefitsDetails.InsightsSection insightsSection = (BenefitsDetails.InsightsSection) obj;
        insightsSection.getClass();
        int encodedSizeWithTag = BenefitsDetails.ColoredText.ADAPTER.encodedSizeWithTag(1, insightsSection.title) + insightsSection.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return protoAdapter.encodedSizeWithTag(5, insightsSection.spend_progress_text) + protoAdapter.asRepeated().encodedSizeWithTag(4, insightsSection.disclosures) + BenefitsDetails.Button.ADAPTER.encodedSizeWithTag(3, insightsSection.button) + protoAdapter.encodedSizeWithTag(2, insightsSection.subtitle) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BenefitsDetails.InsightsSection insightsSection = (BenefitsDetails.InsightsSection) obj;
        insightsSection.getClass();
        BenefitsDetails.ColoredText coloredText = insightsSection.title;
        BenefitsDetails.ColoredText coloredText2 = coloredText != null ? (BenefitsDetails.ColoredText) BenefitsDetails.ColoredText.ADAPTER.redact(coloredText) : null;
        LocalizedString localizedString = insightsSection.subtitle;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        BenefitsDetails.Button button = insightsSection.button;
        BenefitsDetails.Button button2 = button != null ? (BenefitsDetails.Button) BenefitsDetails.Button.ADAPTER.redact(button) : null;
        List list = insightsSection.disclosures;
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(list, protoAdapter);
        LocalizedString localizedString3 = insightsSection.spend_progress_text;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) protoAdapter.redact(localizedString3) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new BenefitsDetails.InsightsSection(coloredText2, localizedString2, button2, m1169redactElements, localizedString4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BenefitsDetails.InsightsSection insightsSection = (BenefitsDetails.InsightsSection) obj;
        insightsSection.getClass();
        BenefitsDetails.ColoredText.ADAPTER.encodeWithTag(protoWriter, 1, insightsSection.title);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, insightsSection.subtitle);
        BenefitsDetails.Button.ADAPTER.encodeWithTag(protoWriter, 3, insightsSection.button);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 4, insightsSection.disclosures);
        protoAdapter.encodeWithTag(protoWriter, 5, insightsSection.spend_progress_text);
        protoWriter.writeBytes(insightsSection.unknownFields());
    }
}
