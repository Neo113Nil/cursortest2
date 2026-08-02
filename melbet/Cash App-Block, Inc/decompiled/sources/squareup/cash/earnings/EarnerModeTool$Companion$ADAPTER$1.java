package squareup.cash.earnings;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.time.Instant;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class EarnerModeTool$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new EarnerModeTool((LocalizedString) obj, (LocalizedString) obj2, (Boolean) obj3, (String) obj4, (EarnerModeSheetData) obj5, (Instant) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj3 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 4:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(EarnerModeSheetData.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(ProtoAdapter.INSTANT, protoReader, obj6);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        EarnerModeTool earnerModeTool = (EarnerModeTool) obj;
        reverseProtoWriter.getClass();
        earnerModeTool.getClass();
        reverseProtoWriter.writeBytes(earnerModeTool.unknownFields());
        ProtoAdapter.INSTANT.encodeWithTag(reverseProtoWriter, 6, earnerModeTool.earner_mode_ends_at);
        EarnerModeSheetData.ADAPTER.encodeWithTag(reverseProtoWriter, 5, earnerModeTool.earner_mode_sheet_data);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 4, earnerModeTool.client_route);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 3, earnerModeTool.earner_mode_state);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, earnerModeTool.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, earnerModeTool.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        EarnerModeTool earnerModeTool = (EarnerModeTool) obj;
        earnerModeTool.getClass();
        int size$okio = earnerModeTool.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return ProtoAdapter.INSTANT.encodedSizeWithTag(6, earnerModeTool.earner_mode_ends_at) + EarnerModeSheetData.ADAPTER.encodedSizeWithTag(5, earnerModeTool.earner_mode_sheet_data) + ProtoAdapter.STRING.encodedSizeWithTag(4, earnerModeTool.client_route) + ProtoAdapter.BOOL.encodedSizeWithTag(3, earnerModeTool.earner_mode_state) + protoAdapter.encodedSizeWithTag(2, earnerModeTool.subtitle) + protoAdapter.encodedSizeWithTag(1, earnerModeTool.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        EarnerModeTool earnerModeTool = (EarnerModeTool) obj;
        earnerModeTool.getClass();
        LocalizedString localizedString = earnerModeTool.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = earnerModeTool.subtitle;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        EarnerModeSheetData earnerModeSheetData = earnerModeTool.earner_mode_sheet_data;
        EarnerModeSheetData earnerModeSheetData2 = earnerModeSheetData != null ? (EarnerModeSheetData) EarnerModeSheetData.ADAPTER.redact(earnerModeSheetData) : null;
        Instant instant = earnerModeTool.earner_mode_ends_at;
        Instant instant2 = instant != null ? (Instant) ProtoAdapter.INSTANT.redact(instant) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = earnerModeTool.earner_mode_state;
        String str = earnerModeTool.client_route;
        byteString.getClass();
        return new EarnerModeTool(localizedString2, localizedString4, bool, str, earnerModeSheetData2, instant2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        EarnerModeTool earnerModeTool = (EarnerModeTool) obj;
        earnerModeTool.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, earnerModeTool.title);
        protoAdapter.encodeWithTag(protoWriter, 2, earnerModeTool.subtitle);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, earnerModeTool.earner_mode_state);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, earnerModeTool.client_route);
        EarnerModeSheetData.ADAPTER.encodeWithTag(protoWriter, 5, earnerModeTool.earner_mode_sheet_data);
        ProtoAdapter.INSTANT.encodeWithTag(protoWriter, 6, earnerModeTool.earner_mode_ends_at);
        protoWriter.writeBytes(earnerModeTool.unknownFields());
    }
}
