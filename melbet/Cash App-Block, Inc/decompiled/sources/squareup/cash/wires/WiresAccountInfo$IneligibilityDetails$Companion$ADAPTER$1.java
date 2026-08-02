package squareup.cash.wires;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.wires.WiresAccountInfo;

/* loaded from: classes10.dex */
public final class WiresAccountInfo$IneligibilityDetails$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new WiresAccountInfo.IneligibilityDetails((LocalizedString) obj, (LocalizedString) obj2, (WiresAccountInfo.Action) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(WiresAccountInfo.Action.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        WiresAccountInfo.IneligibilityDetails ineligibilityDetails = (WiresAccountInfo.IneligibilityDetails) obj;
        reverseProtoWriter.getClass();
        ineligibilityDetails.getClass();
        reverseProtoWriter.writeBytes(ineligibilityDetails.unknownFields());
        WiresAccountInfo.Action.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ineligibilityDetails.action);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, ineligibilityDetails.action_title);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, ineligibilityDetails.description);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        WiresAccountInfo.IneligibilityDetails ineligibilityDetails = (WiresAccountInfo.IneligibilityDetails) obj;
        ineligibilityDetails.getClass();
        int size$okio = ineligibilityDetails.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return WiresAccountInfo.Action.ADAPTER.encodedSizeWithTag(3, ineligibilityDetails.action) + protoAdapter.encodedSizeWithTag(2, ineligibilityDetails.action_title) + protoAdapter.encodedSizeWithTag(1, ineligibilityDetails.description) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        WiresAccountInfo.IneligibilityDetails ineligibilityDetails = (WiresAccountInfo.IneligibilityDetails) obj;
        ineligibilityDetails.getClass();
        LocalizedString localizedString = ineligibilityDetails.description;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = ineligibilityDetails.action_title;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        WiresAccountInfo.Action action = ineligibilityDetails.action;
        WiresAccountInfo.Action action2 = action != null ? (WiresAccountInfo.Action) WiresAccountInfo.Action.ADAPTER.redact(action) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new WiresAccountInfo.IneligibilityDetails(localizedString2, localizedString4, action2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        WiresAccountInfo.IneligibilityDetails ineligibilityDetails = (WiresAccountInfo.IneligibilityDetails) obj;
        ineligibilityDetails.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, ineligibilityDetails.description);
        protoAdapter.encodeWithTag(protoWriter, 2, ineligibilityDetails.action_title);
        WiresAccountInfo.Action.ADAPTER.encodeWithTag(protoWriter, 3, ineligibilityDetails.action);
        protoWriter.writeBytes(ineligibilityDetails.unknownFields());
    }
}
