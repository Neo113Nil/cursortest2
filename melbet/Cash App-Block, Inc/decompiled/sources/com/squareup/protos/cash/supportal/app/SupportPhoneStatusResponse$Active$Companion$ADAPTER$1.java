package com.squareup.protos.cash.supportal.app;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.supportal.app.SupportPhoneStatusResponse;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SupportPhoneStatusResponse$Active$Companion$ADAPTER$1 extends ProtoAdapter {
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
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SupportPhoneStatusResponse.Active((SupportPhoneStatusResponse.ActiveStatus) obj, (SupportPhoneStatusResponse.ServiceAvailability) obj2, (String) obj3, (String) obj4, (Boolean) obj5, (String) obj6, (String) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    try {
                        obj = SupportPhoneStatusResponse.ActiveStatus.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(SupportPhoneStatusResponse.ServiceAvailability.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj5 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 6:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 7:
                    obj7 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SupportPhoneStatusResponse.Active active = (SupportPhoneStatusResponse.Active) obj;
        reverseProtoWriter.getClass();
        active.getClass();
        reverseProtoWriter.writeBytes(active.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, active.notification_message);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, active.notification_title);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 5, active.allow_cancellation);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, active.message);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, active.title);
        SupportPhoneStatusResponse.ServiceAvailability.ADAPTER.encodeWithTag(reverseProtoWriter, 2, active.service_availability);
        SupportPhoneStatusResponse.ActiveStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 1, active.status);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SupportPhoneStatusResponse.Active active = (SupportPhoneStatusResponse.Active) obj;
        active.getClass();
        int encodedSizeWithTag = SupportPhoneStatusResponse.ServiceAvailability.ADAPTER.encodedSizeWithTag(2, active.service_availability) + SupportPhoneStatusResponse.ActiveStatus.ADAPTER.encodedSizeWithTag(1, active.status) + active.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(7, active.notification_message) + protoAdapter.encodedSizeWithTag(6, active.notification_title) + ProtoAdapter.BOOL.encodedSizeWithTag(5, active.allow_cancellation) + protoAdapter.encodedSizeWithTag(4, active.message) + protoAdapter.encodedSizeWithTag(3, active.title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SupportPhoneStatusResponse.Active active = (SupportPhoneStatusResponse.Active) obj;
        active.getClass();
        SupportPhoneStatusResponse.ServiceAvailability serviceAvailability = active.service_availability;
        SupportPhoneStatusResponse.ServiceAvailability serviceAvailability2 = serviceAvailability != null ? (SupportPhoneStatusResponse.ServiceAvailability) SupportPhoneStatusResponse.ServiceAvailability.ADAPTER.redact(serviceAvailability) : null;
        ByteString byteString = ByteString.EMPTY;
        SupportPhoneStatusResponse.ActiveStatus activeStatus = active.status;
        String str = active.title;
        String str2 = active.message;
        Boolean bool = active.allow_cancellation;
        String str3 = active.notification_title;
        String str4 = active.notification_message;
        byteString.getClass();
        return new SupportPhoneStatusResponse.Active(activeStatus, serviceAvailability2, str, str2, bool, str3, str4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SupportPhoneStatusResponse.Active active = (SupportPhoneStatusResponse.Active) obj;
        active.getClass();
        SupportPhoneStatusResponse.ActiveStatus.ADAPTER.encodeWithTag(protoWriter, 1, active.status);
        SupportPhoneStatusResponse.ServiceAvailability.ADAPTER.encodeWithTag(protoWriter, 2, active.service_availability);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 3, active.title);
        protoAdapter.encodeWithTag(protoWriter, 4, active.message);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, active.allow_cancellation);
        protoAdapter.encodeWithTag(protoWriter, 6, active.notification_title);
        protoAdapter.encodeWithTag(protoWriter, 7, active.notification_message);
        protoWriter.writeBytes(active.unknownFields());
    }
}
