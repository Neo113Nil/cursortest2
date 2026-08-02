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
import squareup.cash.paychecks.DistributionSummaryUi;

/* loaded from: classes10.dex */
public final class DistributionSummaryUi$HelpSheetUi$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DistributionSummaryUi.HelpSheetUi((String) obj, (LocalizedString) obj2, m, (LocalizedString) obj3, (LocalizedString) obj4, arrayList, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 5:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                case 7:
                case 11:
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
                case 8:
                    obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
                    break;
                case 9:
                    m.add(LocalizedString.ADAPTER.decode(protoReader));
                    break;
                case 10:
                    obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
                    break;
                case 12:
                    obj4 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj4);
                    break;
                case 13:
                    arrayList.add(LocalizedString.ADAPTER.decode(protoReader));
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        DistributionSummaryUi.HelpSheetUi helpSheetUi = (DistributionSummaryUi.HelpSheetUi) obj;
        reverseProtoWriter.getClass();
        helpSheetUi.getClass();
        reverseProtoWriter.writeBytes(helpSheetUi.unknownFields());
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 13, helpSheetUi.numbered_item_subtexts);
        protoAdapter.encodeWithTag(reverseProtoWriter, 12, helpSheetUi.dismiss_button_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, helpSheetUi.additional_help_button_text);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 9, helpSheetUi.numbered_item_texts);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, helpSheetUi.centered_title);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 5, helpSheetUi.additional_help_button_client_route);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DistributionSummaryUi.HelpSheetUi helpSheetUi = (DistributionSummaryUi.HelpSheetUi) obj;
        helpSheetUi.getClass();
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(5, helpSheetUi.additional_help_button_client_route) + helpSheetUi.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return protoAdapter.asRepeated().encodedSizeWithTag(13, helpSheetUi.numbered_item_subtexts) + protoAdapter.encodedSizeWithTag(12, helpSheetUi.dismiss_button_text) + protoAdapter.encodedSizeWithTag(10, helpSheetUi.additional_help_button_text) + protoAdapter.asRepeated().encodedSizeWithTag(9, helpSheetUi.numbered_item_texts) + protoAdapter.encodedSizeWithTag(8, helpSheetUi.centered_title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DistributionSummaryUi.HelpSheetUi helpSheetUi = (DistributionSummaryUi.HelpSheetUi) obj;
        helpSheetUi.getClass();
        LocalizedString localizedString = helpSheetUi.centered_title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        List list = helpSheetUi.numbered_item_texts;
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(list, protoAdapter);
        LocalizedString localizedString3 = helpSheetUi.additional_help_button_text;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) protoAdapter.redact(localizedString3) : null;
        LocalizedString localizedString5 = helpSheetUi.dismiss_button_text;
        LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) protoAdapter.redact(localizedString5) : null;
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(helpSheetUi.numbered_item_subtexts, protoAdapter);
        ByteString byteString = ByteString.EMPTY;
        String str = helpSheetUi.additional_help_button_client_route;
        byteString.getClass();
        return new DistributionSummaryUi.HelpSheetUi(str, localizedString2, m1169redactElements, localizedString4, localizedString6, m1169redactElements2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DistributionSummaryUi.HelpSheetUi helpSheetUi = (DistributionSummaryUi.HelpSheetUi) obj;
        helpSheetUi.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, helpSheetUi.additional_help_button_client_route);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 8, helpSheetUi.centered_title);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 9, helpSheetUi.numbered_item_texts);
        protoAdapter.encodeWithTag(protoWriter, 10, helpSheetUi.additional_help_button_text);
        protoAdapter.encodeWithTag(protoWriter, 12, helpSheetUi.dismiss_button_text);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 13, helpSheetUi.numbered_item_subtexts);
        protoWriter.writeBytes(helpSheetUi.unknownFields());
    }
}
