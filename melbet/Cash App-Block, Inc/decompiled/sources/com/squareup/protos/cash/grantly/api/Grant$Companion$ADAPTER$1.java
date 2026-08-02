package com.squareup.protos.cash.grantly.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.appsflyer.AppsFlyerProperties;
import com.squareup.protos.cash.grantly.api.Grant;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Grant$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        Object obj2;
        Object obj3;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        Object obj12 = null;
        Object obj13 = null;
        Object obj14 = null;
        Object obj15 = null;
        Object obj16 = null;
        Object obj17 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                Object obj18 = obj5;
                ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
                Object obj19 = obj14;
                String str = (String) obj15;
                String str2 = (String) obj17;
                String str3 = (String) obj6;
                Action action = (Action) obj7;
                Grant.Status status = (Grant.Status) obj8;
                Grant.Type type2 = (Grant.Type) obj9;
                Long l = (Long) obj10;
                Long l2 = (Long) obj11;
                Long l3 = (Long) obj12;
                String str4 = (String) obj13;
                Channel channel = (Channel) obj4;
                if (channel != null) {
                    return new Grant(str, str2, str3, action, status, type2, l, l2, l3, str4, channel, m, (DecisionMethod) obj19, (RiskSignals) obj18, (Long) obj16, endMessageAndGetUnknownFields);
                }
                TransactorKt.missingRequiredFields(obj4, AppsFlyerProperties.CHANNEL);
                throw null;
            }
            switch (nextTag) {
                case 1:
                    obj15 = ProtoAdapter.STRING.decode(protoReader);
                    obj5 = obj5;
                    break;
                case 2:
                    obj17 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj7 = TransactorKt.decodeMessageOrMerge(Action.ADAPTER, protoReader, obj7);
                    break;
                case 5:
                    obj = obj5;
                    obj2 = obj8;
                    obj3 = obj9;
                    try {
                        obj5 = obj;
                        obj8 = Grant.Status.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                    obj9 = obj3;
                    break;
                case 6:
                    obj = obj5;
                    obj2 = obj8;
                    obj3 = obj9;
                    try {
                        obj9 = Grant.Type.ADAPTER.decode(protoReader);
                        obj5 = obj;
                        obj8 = obj2;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 7:
                    obj10 = ProtoAdapter.UINT64.decode(protoReader);
                    break;
                case 8:
                    obj11 = ProtoAdapter.UINT64.decode(protoReader);
                    break;
                case 9:
                    obj12 = ProtoAdapter.UINT64.decode(protoReader);
                    break;
                case 10:
                    obj13 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 11:
                    obj = obj5;
                    obj2 = obj8;
                    obj3 = obj9;
                    try {
                        obj4 = Channel.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                    }
                    obj5 = obj;
                    obj8 = obj2;
                    obj9 = obj3;
                    break;
                case 12:
                    obj = obj5;
                    obj2 = obj8;
                    obj3 = obj9;
                    m.add(Grant.AppData.ADAPTER.decode(protoReader));
                    obj5 = obj;
                    obj8 = obj2;
                    obj9 = obj3;
                    break;
                case 13:
                    try {
                        obj14 = DecisionMethod.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                        obj = obj5;
                        obj2 = obj8;
                        obj3 = obj9;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                        break;
                    }
                case 14:
                    obj5 = TransactorKt.decodeMessageOrMerge(RiskSignals.ADAPTER, protoReader, obj5);
                    break;
                case 15:
                    obj16 = ProtoAdapter.UINT64.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj5;
                    obj2 = obj8;
                    obj3 = obj9;
                    obj5 = obj;
                    obj8 = obj2;
                    obj9 = obj3;
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Grant grant = (Grant) obj;
        reverseProtoWriter.getClass();
        grant.getClass();
        reverseProtoWriter.writeBytes(grant.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.UINT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 15, grant.revoked_at);
        RiskSignals.ADAPTER.encodeWithTag(reverseProtoWriter, 14, grant.risk_signals);
        DecisionMethod.ADAPTER.encodeWithTag(reverseProtoWriter, 13, grant.decision_method);
        Grant.AppData.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 12, grant.app_data);
        Channel.ADAPTER.encodeWithTag(reverseProtoWriter, 11, grant.channel);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 10, grant.request_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, grant.expires_at);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, grant.updated_at);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, grant.created_at);
        Grant.Type.ADAPTER.encodeWithTag(reverseProtoWriter, 6, grant.f1272type);
        Grant.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 5, grant.status);
        Action.ADAPTER.encodeWithTag(reverseProtoWriter, 4, grant.action);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, grant.customer_id);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, grant.client_id);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, grant.id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Grant grant = (Grant) obj;
        grant.getClass();
        int size$okio = grant.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = Grant.Type.ADAPTER.encodedSizeWithTag(6, grant.f1272type) + Grant.Status.ADAPTER.encodedSizeWithTag(5, grant.status) + Action.ADAPTER.encodedSizeWithTag(4, grant.action) + protoAdapter.encodedSizeWithTag(3, grant.customer_id) + protoAdapter.encodedSizeWithTag(2, grant.client_id) + protoAdapter.encodedSizeWithTag(1, grant.id) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.UINT64;
        return protoAdapter2.encodedSizeWithTag(15, grant.revoked_at) + RiskSignals.ADAPTER.encodedSizeWithTag(14, grant.risk_signals) + DecisionMethod.ADAPTER.encodedSizeWithTag(13, grant.decision_method) + Grant.AppData.ADAPTER.asRepeated().encodedSizeWithTag(12, grant.app_data) + Channel.ADAPTER.encodedSizeWithTag(11, grant.channel) + protoAdapter.encodedSizeWithTag(10, grant.request_id) + protoAdapter2.encodedSizeWithTag(9, grant.expires_at) + protoAdapter2.encodedSizeWithTag(8, grant.updated_at) + protoAdapter2.encodedSizeWithTag(7, grant.created_at) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Grant grant = (Grant) obj;
        grant.getClass();
        Action action = grant.action;
        Action action2 = action != null ? (Action) Action.ADAPTER.redact(action) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(grant.app_data, Grant.AppData.ADAPTER);
        RiskSignals riskSignals = grant.risk_signals;
        RiskSignals riskSignals2 = riskSignals != null ? (RiskSignals) RiskSignals.ADAPTER.redact(riskSignals) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = grant.id;
        String str2 = grant.client_id;
        String str3 = grant.customer_id;
        Grant.Status status = grant.status;
        Grant.Type type2 = grant.f1272type;
        Long l = grant.created_at;
        Long l2 = grant.updated_at;
        Long l3 = grant.expires_at;
        String str4 = grant.request_id;
        Channel channel = grant.channel;
        DecisionMethod decisionMethod = grant.decision_method;
        Long l4 = grant.revoked_at;
        channel.getClass();
        byteString.getClass();
        return new Grant(str, str2, str3, action2, status, type2, l, l2, l3, str4, channel, m1169redactElements, decisionMethod, riskSignals2, l4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Grant grant = (Grant) obj;
        grant.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, grant.id);
        protoAdapter.encodeWithTag(protoWriter, 2, grant.client_id);
        protoAdapter.encodeWithTag(protoWriter, 3, grant.customer_id);
        Action.ADAPTER.encodeWithTag(protoWriter, 4, grant.action);
        Grant.Status.ADAPTER.encodeWithTag(protoWriter, 5, grant.status);
        Grant.Type.ADAPTER.encodeWithTag(protoWriter, 6, grant.f1272type);
        ProtoAdapter protoAdapter2 = ProtoAdapter.UINT64;
        protoAdapter2.encodeWithTag(protoWriter, 7, grant.created_at);
        protoAdapter2.encodeWithTag(protoWriter, 8, grant.updated_at);
        protoAdapter2.encodeWithTag(protoWriter, 9, grant.expires_at);
        protoAdapter.encodeWithTag(protoWriter, 10, grant.request_id);
        Channel.ADAPTER.encodeWithTag(protoWriter, 11, grant.channel);
        Grant.AppData.ADAPTER.asRepeated().encodeWithTag(protoWriter, 12, grant.app_data);
        DecisionMethod.ADAPTER.encodeWithTag(protoWriter, 13, grant.decision_method);
        RiskSignals.ADAPTER.encodeWithTag(protoWriter, 14, grant.risk_signals);
        protoAdapter2.encodeWithTag(protoWriter, 15, grant.revoked_at);
        protoWriter.writeBytes(grant.unknownFields());
    }
}
