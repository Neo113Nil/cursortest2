package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.client.v1.LocalAppointment;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalAppointment$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        String str;
        String str2;
        String str3;
        ?? decode;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        Long l = null;
        Integer num = null;
        LocalAppointment.AppointmentStatus appointmentStatus = null;
        Object obj = null;
        Object obj2 = null;
        String str9 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalAppointment(str4, str5, str6, str7, str8, l, num, appointmentStatus, (LocalCheckoutBrandSummary) obj, (LocalCheckoutLocationSummary) obj2, str9, (LocalMoney) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    decode = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    str5 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str4;
                    break;
                case 3:
                    str6 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str4;
                    break;
                case 4:
                    str7 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str4;
                    break;
                case 5:
                    str8 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str4;
                    break;
                case 6:
                    l = ProtoAdapter.INT64.decode(protoReader);
                    decode = str4;
                    break;
                case 7:
                    num = ProtoAdapter.INT32.decode(protoReader);
                    decode = str4;
                    break;
                case 8:
                    try {
                        appointmentStatus = LocalAppointment.AppointmentStatus.ADAPTER.decode(protoReader);
                        decode = str4;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        str = str5;
                        str2 = str6;
                        str3 = str7;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 9:
                    obj = TransactorKt.decodeMessageOrMerge(LocalCheckoutBrandSummary.ADAPTER, protoReader, obj);
                    decode = str4;
                    break;
                case 10:
                    obj2 = TransactorKt.decodeMessageOrMerge(LocalCheckoutLocationSummary.ADAPTER, protoReader, obj2);
                    decode = str4;
                    break;
                case 11:
                    str9 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str4;
                    break;
                case 12:
                    obj3 = TransactorKt.decodeMessageOrMerge(LocalMoney.ADAPTER, protoReader, obj3);
                    decode = str4;
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    str = str5;
                    str2 = str6;
                    str3 = str7;
                    decode = str4;
                    str5 = str;
                    str6 = str2;
                    str7 = str3;
                    break;
            }
            str4 = decode;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalAppointment localAppointment = (LocalAppointment) obj;
        reverseProtoWriter.getClass();
        localAppointment.getClass();
        reverseProtoWriter.writeBytes(localAppointment.unknownFields());
        LocalMoney.ADAPTER.encodeWithTag(reverseProtoWriter, 12, localAppointment.price);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 11, localAppointment.service_description);
        LocalCheckoutLocationSummary.ADAPTER.encodeWithTag(reverseProtoWriter, 10, localAppointment.location);
        LocalCheckoutBrandSummary.ADAPTER.encodeWithTag(reverseProtoWriter, 9, localAppointment.brand);
        LocalAppointment.AppointmentStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 8, localAppointment.status);
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 7, localAppointment.duration_minutes);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 6, localAppointment.start_at);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, localAppointment.staff_member_image_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, localAppointment.staff_member_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, localAppointment.staff_member_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, localAppointment.service_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, localAppointment.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalAppointment localAppointment = (LocalAppointment) obj;
        localAppointment.getClass();
        int size$okio = localAppointment.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return LocalMoney.ADAPTER.encodedSizeWithTag(12, localAppointment.price) + protoAdapter.encodedSizeWithTag(11, localAppointment.service_description) + LocalCheckoutLocationSummary.ADAPTER.encodedSizeWithTag(10, localAppointment.location) + LocalCheckoutBrandSummary.ADAPTER.encodedSizeWithTag(9, localAppointment.brand) + LocalAppointment.AppointmentStatus.ADAPTER.encodedSizeWithTag(8, localAppointment.status) + ProtoAdapter.INT32.encodedSizeWithTag(7, localAppointment.duration_minutes) + ProtoAdapter.INT64.encodedSizeWithTag(6, localAppointment.start_at) + protoAdapter.encodedSizeWithTag(5, localAppointment.staff_member_image_url) + protoAdapter.encodedSizeWithTag(4, localAppointment.staff_member_name) + protoAdapter.encodedSizeWithTag(3, localAppointment.staff_member_token) + protoAdapter.encodedSizeWithTag(2, localAppointment.service_name) + protoAdapter.encodedSizeWithTag(1, localAppointment.token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalAppointment localAppointment = (LocalAppointment) obj;
        localAppointment.getClass();
        LocalCheckoutBrandSummary localCheckoutBrandSummary = localAppointment.brand;
        LocalCheckoutBrandSummary localCheckoutBrandSummary2 = localCheckoutBrandSummary != null ? (LocalCheckoutBrandSummary) LocalCheckoutBrandSummary.ADAPTER.redact(localCheckoutBrandSummary) : null;
        LocalCheckoutLocationSummary localCheckoutLocationSummary = localAppointment.location;
        LocalCheckoutLocationSummary localCheckoutLocationSummary2 = localCheckoutLocationSummary != null ? (LocalCheckoutLocationSummary) LocalCheckoutLocationSummary.ADAPTER.redact(localCheckoutLocationSummary) : null;
        LocalMoney localMoney = localAppointment.price;
        LocalMoney localMoney2 = localMoney != null ? (LocalMoney) LocalMoney.ADAPTER.redact(localMoney) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = localAppointment.token;
        String str2 = localAppointment.service_name;
        String str3 = localAppointment.staff_member_token;
        String str4 = localAppointment.staff_member_name;
        String str5 = localAppointment.staff_member_image_url;
        Long l = localAppointment.start_at;
        Integer num = localAppointment.duration_minutes;
        LocalAppointment.AppointmentStatus appointmentStatus = localAppointment.status;
        String str6 = localAppointment.service_description;
        byteString.getClass();
        return new LocalAppointment(str, str2, str3, str4, str5, l, num, appointmentStatus, localCheckoutBrandSummary2, localCheckoutLocationSummary2, str6, localMoney2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalAppointment localAppointment = (LocalAppointment) obj;
        localAppointment.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, localAppointment.token);
        protoAdapter.encodeWithTag(protoWriter, 2, localAppointment.service_name);
        protoAdapter.encodeWithTag(protoWriter, 3, localAppointment.staff_member_token);
        protoAdapter.encodeWithTag(protoWriter, 4, localAppointment.staff_member_name);
        protoAdapter.encodeWithTag(protoWriter, 5, localAppointment.staff_member_image_url);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, localAppointment.start_at);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, localAppointment.duration_minutes);
        LocalAppointment.AppointmentStatus.ADAPTER.encodeWithTag(protoWriter, 8, localAppointment.status);
        LocalCheckoutBrandSummary.ADAPTER.encodeWithTag(protoWriter, 9, localAppointment.brand);
        LocalCheckoutLocationSummary.ADAPTER.encodeWithTag(protoWriter, 10, localAppointment.location);
        protoAdapter.encodeWithTag(protoWriter, 11, localAppointment.service_description);
        LocalMoney.ADAPTER.encodeWithTag(protoWriter, 12, localAppointment.price);
        protoWriter.writeBytes(localAppointment.unknownFields());
    }
}
