package com.squareup.protos.franklin.ui;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.api.DepositPreference;
import com.squareup.protos.franklin.api.RatePlan;
import com.squareup.protos.franklin.common.DepositPreferenceData;
import com.squareup.protos.franklin.common.NearbyVisibility;
import com.squareup.protos.franklin.privacy.IncomingRequestPolicy;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class UiP2pSettings$Companion$ADAPTER$1 extends ProtoAdapter {
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
        Object obj7 = null;
        Object obj8 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UiP2pSettings((Integer) obj, (IncomingRequestPolicy) obj2, (NearbyVisibility) obj3, (RatePlan) obj4, (Boolean) obj5, (DepositPreference) obj6, (DepositPreferenceData) obj7, (Boolean) obj8, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.INT32.decode(protoReader);
                    break;
                case 2:
                    try {
                        obj2 = IncomingRequestPolicy.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 3:
                    try {
                        obj3 = NearbyVisibility.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 4:
                    try {
                        obj4 = RatePlan.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                        break;
                    }
                case 5:
                    obj5 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 6:
                    try {
                        obj6 = DepositPreference.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                        break;
                    }
                case 7:
                    obj7 = TransactorKt.decodeMessageOrMerge(DepositPreferenceData.ADAPTER, protoReader, obj7);
                    break;
                case 8:
                    obj8 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UiP2pSettings uiP2pSettings = (UiP2pSettings) obj;
        reverseProtoWriter.getClass();
        uiP2pSettings.getClass();
        reverseProtoWriter.writeBytes(uiP2pSettings.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, uiP2pSettings.cash_balance_home_screen_button_enabled);
        DepositPreferenceData.ADAPTER.encodeWithTag(reverseProtoWriter, 7, uiP2pSettings.deposit_preference_data);
        DepositPreference.ADAPTER.encodeWithTag(reverseProtoWriter, 6, uiP2pSettings.deposit_preference);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, uiP2pSettings.can_upgrade_to_business);
        RatePlan.ADAPTER.encodeWithTag(reverseProtoWriter, 4, uiP2pSettings.rate_plan);
        NearbyVisibility.ADAPTER.encodeWithTag(reverseProtoWriter, 3, uiP2pSettings.nearby_visibility);
        IncomingRequestPolicy.ADAPTER.encodeWithTag(reverseProtoWriter, 2, uiP2pSettings.incoming_request_policy);
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 1, uiP2pSettings.require_minimum_initiator_notes_length_for_requests);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UiP2pSettings uiP2pSettings = (UiP2pSettings) obj;
        uiP2pSettings.getClass();
        int encodedSizeWithTag = RatePlan.ADAPTER.encodedSizeWithTag(4, uiP2pSettings.rate_plan) + NearbyVisibility.ADAPTER.encodedSizeWithTag(3, uiP2pSettings.nearby_visibility) + IncomingRequestPolicy.ADAPTER.encodedSizeWithTag(2, uiP2pSettings.incoming_request_policy) + ProtoAdapter.INT32.encodedSizeWithTag(1, uiP2pSettings.require_minimum_initiator_notes_length_for_requests) + uiP2pSettings.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        return protoAdapter.encodedSizeWithTag(8, uiP2pSettings.cash_balance_home_screen_button_enabled) + DepositPreferenceData.ADAPTER.encodedSizeWithTag(7, uiP2pSettings.deposit_preference_data) + DepositPreference.ADAPTER.encodedSizeWithTag(6, uiP2pSettings.deposit_preference) + protoAdapter.encodedSizeWithTag(5, uiP2pSettings.can_upgrade_to_business) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UiP2pSettings uiP2pSettings = (UiP2pSettings) obj;
        uiP2pSettings.getClass();
        DepositPreferenceData depositPreferenceData = uiP2pSettings.deposit_preference_data;
        DepositPreferenceData depositPreferenceData2 = depositPreferenceData != null ? (DepositPreferenceData) DepositPreferenceData.ADAPTER.redact(depositPreferenceData) : null;
        ByteString byteString = ByteString.EMPTY;
        Integer num = uiP2pSettings.require_minimum_initiator_notes_length_for_requests;
        IncomingRequestPolicy incomingRequestPolicy = uiP2pSettings.incoming_request_policy;
        NearbyVisibility nearbyVisibility = uiP2pSettings.nearby_visibility;
        RatePlan ratePlan = uiP2pSettings.rate_plan;
        Boolean bool = uiP2pSettings.can_upgrade_to_business;
        DepositPreference depositPreference = uiP2pSettings.deposit_preference;
        Boolean bool2 = uiP2pSettings.cash_balance_home_screen_button_enabled;
        byteString.getClass();
        return new UiP2pSettings(num, incomingRequestPolicy, nearbyVisibility, ratePlan, bool, depositPreference, depositPreferenceData2, bool2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UiP2pSettings uiP2pSettings = (UiP2pSettings) obj;
        uiP2pSettings.getClass();
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, uiP2pSettings.require_minimum_initiator_notes_length_for_requests);
        IncomingRequestPolicy.ADAPTER.encodeWithTag(protoWriter, 2, uiP2pSettings.incoming_request_policy);
        NearbyVisibility.ADAPTER.encodeWithTag(protoWriter, 3, uiP2pSettings.nearby_visibility);
        RatePlan.ADAPTER.encodeWithTag(protoWriter, 4, uiP2pSettings.rate_plan);
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(protoWriter, 5, uiP2pSettings.can_upgrade_to_business);
        DepositPreference.ADAPTER.encodeWithTag(protoWriter, 6, uiP2pSettings.deposit_preference);
        DepositPreferenceData.ADAPTER.encodeWithTag(protoWriter, 7, uiP2pSettings.deposit_preference_data);
        protoAdapter.encodeWithTag(protoWriter, 8, uiP2pSettings.cash_balance_home_screen_button_enabled);
        protoWriter.writeBytes(uiP2pSettings.unknownFields());
    }
}
