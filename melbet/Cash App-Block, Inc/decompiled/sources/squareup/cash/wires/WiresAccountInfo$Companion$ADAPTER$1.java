package squareup.cash.wires;

import androidx.room.TransactorKt;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;
import squareup.cash.wires.WiresAccountInfo;

/* loaded from: classes10.dex */
public final class WiresAccountInfo$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        WiresAccountInfo.WiresProfile ineligibilityDetails;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        WiresAccountInfo.WiresProfile wiresProfile = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new WiresAccountInfo((String) obj, (String) obj2, (String) obj3, (GlobalAddress) obj4, (ClientScenario) obj5, (WiresAccountInfo.Action) obj6, wiresProfile, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 3:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(GlobalAddress.ADAPTER, protoReader, obj4);
                    continue;
                case 5:
                    try {
                        obj5 = ClientScenario.ADAPTER.decode(protoReader);
                        continue;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(WiresAccountInfo.Action.ADAPTER, protoReader, obj6);
                    continue;
                case 7:
                default:
                    protoReader.readUnknownField(nextTag);
                    continue;
                case 8:
                    ineligibilityDetails = new WiresAccountInfo.WiresProfile.IneligibilityDetails((WiresAccountInfo.IneligibilityDetails) WiresAccountInfo.IneligibilityDetails.ADAPTER.decode(protoReader));
                    break;
                case 9:
                    ineligibilityDetails = new WiresAccountInfo.WiresProfile.EligibilityDetails((WiresAccountInfo.EligibilityDetails) WiresAccountInfo.EligibilityDetails.ADAPTER.decode(protoReader));
                    break;
                case 10:
                    ineligibilityDetails = new WiresAccountInfo.WiresProfile.DeactivationDetails((WiresAccountInfo.DeactivationDetails) WiresAccountInfo.DeactivationDetails.ADAPTER.decode(protoReader));
                    break;
            }
            wiresProfile = ineligibilityDetails;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        WiresAccountInfo wiresAccountInfo = (WiresAccountInfo) obj;
        reverseProtoWriter.getClass();
        wiresAccountInfo.getClass();
        reverseProtoWriter.writeBytes(wiresAccountInfo.unknownFields());
        WiresAccountInfo.WiresProfile wiresProfile = wiresAccountInfo.wires_profile;
        if (wiresProfile instanceof WiresAccountInfo.WiresProfile.IneligibilityDetails) {
            WiresAccountInfo.IneligibilityDetails.ADAPTER.encodeWithTag(reverseProtoWriter, 8, ((WiresAccountInfo.WiresProfile.IneligibilityDetails) wiresProfile).value);
        } else if (wiresProfile instanceof WiresAccountInfo.WiresProfile.EligibilityDetails) {
            WiresAccountInfo.EligibilityDetails.ADAPTER.encodeWithTag(reverseProtoWriter, 9, ((WiresAccountInfo.WiresProfile.EligibilityDetails) wiresProfile).value);
        } else if (wiresProfile instanceof WiresAccountInfo.WiresProfile.DeactivationDetails) {
            WiresAccountInfo.DeactivationDetails.ADAPTER.encodeWithTag(reverseProtoWriter, 10, ((WiresAccountInfo.WiresProfile.DeactivationDetails) wiresProfile).value);
        } else if (wiresProfile != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        WiresAccountInfo.Action.ADAPTER.encodeWithTag(reverseProtoWriter, 6, wiresAccountInfo.action);
        ClientScenario.ADAPTER.encodeWithTag(reverseProtoWriter, 5, wiresAccountInfo.client_scenario);
        GlobalAddress.ADAPTER.encodeWithTag(reverseProtoWriter, 4, wiresAccountInfo.bank_address);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, wiresAccountInfo.customer_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, wiresAccountInfo.account_number);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, wiresAccountInfo.routing_number);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        WiresAccountInfo wiresAccountInfo = (WiresAccountInfo) obj;
        wiresAccountInfo.getClass();
        int size$okio = wiresAccountInfo.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = WiresAccountInfo.Action.ADAPTER.encodedSizeWithTag(6, wiresAccountInfo.action) + ClientScenario.ADAPTER.encodedSizeWithTag(5, wiresAccountInfo.client_scenario) + GlobalAddress.ADAPTER.encodedSizeWithTag(4, wiresAccountInfo.bank_address) + protoAdapter.encodedSizeWithTag(3, wiresAccountInfo.customer_name) + protoAdapter.encodedSizeWithTag(2, wiresAccountInfo.account_number) + protoAdapter.encodedSizeWithTag(1, wiresAccountInfo.routing_number) + size$okio;
        WiresAccountInfo.WiresProfile wiresProfile = wiresAccountInfo.wires_profile;
        if (wiresProfile instanceof WiresAccountInfo.WiresProfile.IneligibilityDetails) {
            encodedSizeWithTag = WiresAccountInfo.IneligibilityDetails.ADAPTER.encodedSizeWithTag(8, ((WiresAccountInfo.WiresProfile.IneligibilityDetails) wiresProfile).value);
        } else if (wiresProfile instanceof WiresAccountInfo.WiresProfile.EligibilityDetails) {
            encodedSizeWithTag = WiresAccountInfo.EligibilityDetails.ADAPTER.encodedSizeWithTag(9, ((WiresAccountInfo.WiresProfile.EligibilityDetails) wiresProfile).value);
        } else {
            if (!(wiresProfile instanceof WiresAccountInfo.WiresProfile.DeactivationDetails)) {
                if (wiresProfile == null) {
                    return encodedSizeWithTag2;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = WiresAccountInfo.DeactivationDetails.ADAPTER.encodedSizeWithTag(10, ((WiresAccountInfo.WiresProfile.DeactivationDetails) wiresProfile).value);
        }
        return encodedSizeWithTag + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        WiresAccountInfo wiresAccountInfo = (WiresAccountInfo) obj;
        wiresAccountInfo.getClass();
        WiresAccountInfo.Action action = wiresAccountInfo.action;
        WiresAccountInfo.Action action2 = action != null ? (WiresAccountInfo.Action) WiresAccountInfo.Action.ADAPTER.redact(action) : null;
        ByteString byteString = ByteString.EMPTY;
        ClientScenario clientScenario = wiresAccountInfo.client_scenario;
        WiresAccountInfo.WiresProfile wiresProfile = wiresAccountInfo.wires_profile;
        byteString.getClass();
        return new WiresAccountInfo(null, null, null, null, clientScenario, action2, wiresProfile, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        WiresAccountInfo wiresAccountInfo = (WiresAccountInfo) obj;
        wiresAccountInfo.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, wiresAccountInfo.routing_number);
        protoAdapter.encodeWithTag(protoWriter, 2, wiresAccountInfo.account_number);
        protoAdapter.encodeWithTag(protoWriter, 3, wiresAccountInfo.customer_name);
        GlobalAddress.ADAPTER.encodeWithTag(protoWriter, 4, wiresAccountInfo.bank_address);
        ClientScenario.ADAPTER.encodeWithTag(protoWriter, 5, wiresAccountInfo.client_scenario);
        WiresAccountInfo.Action.ADAPTER.encodeWithTag(protoWriter, 6, wiresAccountInfo.action);
        WiresAccountInfo.WiresProfile wiresProfile = wiresAccountInfo.wires_profile;
        if (wiresProfile instanceof WiresAccountInfo.WiresProfile.IneligibilityDetails) {
            WiresAccountInfo.IneligibilityDetails.ADAPTER.encodeWithTag(protoWriter, 8, ((WiresAccountInfo.WiresProfile.IneligibilityDetails) wiresProfile).value);
        } else if (wiresProfile instanceof WiresAccountInfo.WiresProfile.EligibilityDetails) {
            WiresAccountInfo.EligibilityDetails.ADAPTER.encodeWithTag(protoWriter, 9, ((WiresAccountInfo.WiresProfile.EligibilityDetails) wiresProfile).value);
        } else if (wiresProfile instanceof WiresAccountInfo.WiresProfile.DeactivationDetails) {
            WiresAccountInfo.DeactivationDetails.ADAPTER.encodeWithTag(protoWriter, 10, ((WiresAccountInfo.WiresProfile.DeactivationDetails) wiresProfile).value);
        } else if (wiresProfile != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(wiresAccountInfo.unknownFields());
    }
}
