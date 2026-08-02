package squareup.cash.earnings;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class EarnerModeSheetData$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new EarnerModeSheetData((LocalizedString) obj, (LocalizedString) obj2, m, (LocalizedString) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                m.add(ProtoAdapter.DURATION.decode(protoReader));
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        EarnerModeSheetData earnerModeSheetData = (EarnerModeSheetData) obj;
        reverseProtoWriter.getClass();
        earnerModeSheetData.getClass();
        reverseProtoWriter.writeBytes(earnerModeSheetData.unknownFields());
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, earnerModeSheetData.primary_button_text);
        ProtoAdapter.DURATION.asRepeated().encodeWithTag(reverseProtoWriter, 3, earnerModeSheetData.durations);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, earnerModeSheetData.body);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, earnerModeSheetData.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        EarnerModeSheetData earnerModeSheetData = (EarnerModeSheetData) obj;
        earnerModeSheetData.getClass();
        int size$okio = earnerModeSheetData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return protoAdapter.encodedSizeWithTag(4, earnerModeSheetData.primary_button_text) + ProtoAdapter.DURATION.asRepeated().encodedSizeWithTag(3, earnerModeSheetData.durations) + protoAdapter.encodedSizeWithTag(2, earnerModeSheetData.body) + protoAdapter.encodedSizeWithTag(1, earnerModeSheetData.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        EarnerModeSheetData earnerModeSheetData = (EarnerModeSheetData) obj;
        earnerModeSheetData.getClass();
        LocalizedString localizedString = earnerModeSheetData.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = earnerModeSheetData.body;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(earnerModeSheetData.durations, ProtoAdapter.DURATION);
        LocalizedString localizedString5 = earnerModeSheetData.primary_button_text;
        LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new EarnerModeSheetData(localizedString2, localizedString4, m1169redactElements, localizedString6, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        EarnerModeSheetData earnerModeSheetData = (EarnerModeSheetData) obj;
        earnerModeSheetData.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, earnerModeSheetData.title);
        protoAdapter.encodeWithTag(protoWriter, 2, earnerModeSheetData.body);
        ProtoAdapter.DURATION.asRepeated().encodeWithTag(protoWriter, 3, earnerModeSheetData.durations);
        protoAdapter.encodeWithTag(protoWriter, 4, earnerModeSheetData.primary_button_text);
        protoWriter.writeBytes(earnerModeSheetData.unknownFields());
    }
}
