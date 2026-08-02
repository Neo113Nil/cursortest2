package com.squareup.protos.cash.local.client.app.v1.account;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.app.v1.account.LocalAccount;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalAccount$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalAccount((Boolean) obj, m, (LocalAccount.EnrollmentStatus) obj2, (Boolean) obj3, (Boolean) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag == 2) {
                m.add(ProtoAdapter.STRING.decode(protoReader));
            } else if (nextTag == 3) {
                try {
                    obj2 = LocalAccount.EnrollmentStatus.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 4) {
                obj3 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalAccount localAccount = (LocalAccount) obj;
        reverseProtoWriter.getClass();
        localAccount.getClass();
        reverseProtoWriter.writeBytes(localAccount.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, localAccount.show_geo_tab);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, localAccount.hide_brand_discovery);
        LocalAccount.EnrollmentStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 3, localAccount.enrollment_status);
        ProtoAdapter.STRING.asRepeated().encodeWithTag(reverseProtoWriter, 2, localAccount.auto_display_shortlink_keys);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, localAccount.show_tab);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalAccount localAccount = (LocalAccount) obj;
        localAccount.getClass();
        int size$okio = localAccount.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        return protoAdapter.encodedSizeWithTag(5, localAccount.show_geo_tab) + protoAdapter.encodedSizeWithTag(4, localAccount.hide_brand_discovery) + LocalAccount.EnrollmentStatus.ADAPTER.encodedSizeWithTag(3, localAccount.enrollment_status) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, localAccount.auto_display_shortlink_keys) + protoAdapter.encodedSizeWithTag(1, localAccount.show_tab) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalAccount localAccount = (LocalAccount) obj;
        localAccount.getClass();
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = localAccount.show_tab;
        List list = localAccount.auto_display_shortlink_keys;
        LocalAccount.EnrollmentStatus enrollmentStatus = localAccount.enrollment_status;
        Boolean bool2 = localAccount.hide_brand_discovery;
        Boolean bool3 = localAccount.show_geo_tab;
        list.getClass();
        byteString.getClass();
        return new LocalAccount(bool, list, enrollmentStatus, bool2, bool3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalAccount localAccount = (LocalAccount) obj;
        localAccount.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(protoWriter, 1, localAccount.show_tab);
        ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, localAccount.auto_display_shortlink_keys);
        LocalAccount.EnrollmentStatus.ADAPTER.encodeWithTag(protoWriter, 3, localAccount.enrollment_status);
        protoAdapter.encodeWithTag(protoWriter, 4, localAccount.hide_brand_discovery);
        protoAdapter.encodeWithTag(protoWriter, 5, localAccount.show_geo_tab);
        protoWriter.writeBytes(localAccount.unknownFields());
    }
}
