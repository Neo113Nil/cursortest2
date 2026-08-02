package com.squareup.protos.cash.incidentalerts.app.v1;

import com.squareup.protos.cash.incidentalerts.app.v1.Incident;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Incident$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        Object obj2;
        Object obj3;
        protoReader.getClass();
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
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Incident((String) obj4, (String) obj5, (String) obj6, (Long) obj7, (Boolean) obj8, (Incident.Status) obj9, (Long) obj10, (Boolean) obj11, (Incident.Workflow) obj12, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj7 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 5:
                    obj8 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 6:
                    obj = obj4;
                    obj2 = obj5;
                    try {
                        obj4 = obj;
                        obj9 = Incident.Status.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        obj3 = obj6;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                    obj5 = obj2;
                    break;
                case 7:
                    obj10 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 8:
                    obj11 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 9:
                    try {
                        obj12 = Incident.Workflow.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        obj = obj4;
                        obj2 = obj5;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj4;
                    obj2 = obj5;
                    obj3 = obj6;
                    obj4 = obj;
                    obj6 = obj3;
                    obj5 = obj2;
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Incident incident = (Incident) obj;
        reverseProtoWriter.getClass();
        incident.getClass();
        reverseProtoWriter.writeBytes(incident.unknownFields());
        Incident.Workflow.ADAPTER.encodeWithTag(reverseProtoWriter, 9, incident.workflow);
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, incident.customer_can_change_subscription);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 7, incident.resolved_at);
        Incident.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 6, incident.status);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, incident.customer_subscribed);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, incident.reported_at);
        ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 3, incident.details);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 2, incident.title);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 1, incident.id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Incident incident = (Incident) obj;
        incident.getClass();
        int size$okio = incident.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(3, incident.details) + protoAdapter.encodedSizeWithTag(2, incident.title) + protoAdapter.encodedSizeWithTag(1, incident.id) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(4, incident.reported_at) + encodedSizeWithTag;
        ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
        return Incident.Workflow.ADAPTER.encodedSizeWithTag(9, incident.workflow) + protoAdapter3.encodedSizeWithTag(8, incident.customer_can_change_subscription) + protoAdapter2.encodedSizeWithTag(7, incident.resolved_at) + Incident.Status.ADAPTER.encodedSizeWithTag(6, incident.status) + protoAdapter3.encodedSizeWithTag(5, incident.customer_subscribed) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Incident incident = (Incident) obj;
        incident.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = incident.id;
        String str2 = incident.title;
        String str3 = incident.details;
        Long l = incident.reported_at;
        Boolean bool = incident.customer_subscribed;
        Incident.Status status = incident.status;
        Long l2 = incident.resolved_at;
        Boolean bool2 = incident.customer_can_change_subscription;
        Incident.Workflow workflow = incident.workflow;
        byteString.getClass();
        return new Incident(str, str2, str3, l, bool, status, l2, bool2, workflow, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Incident incident = (Incident) obj;
        incident.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, incident.id);
        protoAdapter.encodeWithTag(protoWriter, 2, incident.title);
        protoAdapter.encodeWithTag(protoWriter, 3, incident.details);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(protoWriter, 4, incident.reported_at);
        ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
        protoAdapter3.encodeWithTag(protoWriter, 5, incident.customer_subscribed);
        Incident.Status.ADAPTER.encodeWithTag(protoWriter, 6, incident.status);
        protoAdapter2.encodeWithTag(protoWriter, 7, incident.resolved_at);
        protoAdapter3.encodeWithTag(protoWriter, 8, incident.customer_can_change_subscription);
        Incident.Workflow.ADAPTER.encodeWithTag(protoWriter, 9, incident.workflow);
        protoWriter.writeBytes(incident.unknownFields());
    }
}
