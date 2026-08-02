package squareup.cash.wires;

import androidx.room.TransactorKt;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.wires.WiresAccountInfo;

/* loaded from: classes10.dex */
public final class WiresAccountInfo$EligibilityDetails$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new WiresAccountInfo.EligibilityDetails((String) obj, (String) obj2, (String) obj3, (GlobalAddress) obj4, (WiresAccountInfo.Action) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = TransactorKt.decodeMessageOrMerge(GlobalAddress.ADAPTER, protoReader, obj4);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(WiresAccountInfo.Action.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        WiresAccountInfo.EligibilityDetails eligibilityDetails = (WiresAccountInfo.EligibilityDetails) obj;
        reverseProtoWriter.getClass();
        eligibilityDetails.getClass();
        reverseProtoWriter.writeBytes(eligibilityDetails.unknownFields());
        WiresAccountInfo.Action.ADAPTER.encodeWithTag(reverseProtoWriter, 5, eligibilityDetails.action);
        GlobalAddress.ADAPTER.encodeWithTag(reverseProtoWriter, 4, eligibilityDetails.bank_address);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, eligibilityDetails.customer_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, eligibilityDetails.account_number);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, eligibilityDetails.routing_number);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        WiresAccountInfo.EligibilityDetails eligibilityDetails = (WiresAccountInfo.EligibilityDetails) obj;
        eligibilityDetails.getClass();
        int size$okio = eligibilityDetails.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return WiresAccountInfo.Action.ADAPTER.encodedSizeWithTag(5, eligibilityDetails.action) + GlobalAddress.ADAPTER.encodedSizeWithTag(4, eligibilityDetails.bank_address) + protoAdapter.encodedSizeWithTag(3, eligibilityDetails.customer_name) + protoAdapter.encodedSizeWithTag(2, eligibilityDetails.account_number) + protoAdapter.encodedSizeWithTag(1, eligibilityDetails.routing_number) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        WiresAccountInfo.EligibilityDetails eligibilityDetails = (WiresAccountInfo.EligibilityDetails) obj;
        eligibilityDetails.getClass();
        WiresAccountInfo.Action action = eligibilityDetails.action;
        WiresAccountInfo.Action action2 = action != null ? (WiresAccountInfo.Action) WiresAccountInfo.Action.ADAPTER.redact(action) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new WiresAccountInfo.EligibilityDetails(null, null, null, null, action2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        WiresAccountInfo.EligibilityDetails eligibilityDetails = (WiresAccountInfo.EligibilityDetails) obj;
        eligibilityDetails.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, eligibilityDetails.routing_number);
        protoAdapter.encodeWithTag(protoWriter, 2, eligibilityDetails.account_number);
        protoAdapter.encodeWithTag(protoWriter, 3, eligibilityDetails.customer_name);
        GlobalAddress.ADAPTER.encodeWithTag(protoWriter, 4, eligibilityDetails.bank_address);
        WiresAccountInfo.Action.ADAPTER.encodeWithTag(protoWriter, 5, eligibilityDetails.action);
        protoWriter.writeBytes(eligibilityDetails.unknownFields());
    }
}
