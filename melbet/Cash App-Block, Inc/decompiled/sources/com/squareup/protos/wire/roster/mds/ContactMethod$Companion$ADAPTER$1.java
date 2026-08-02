package com.squareup.protos.wire.roster.mds;

import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_face.zzko;
import com.squareup.protos.wire.roster.mds.ContactMethod;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ContactMethod$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        zzko zzkoVar = null;
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ContactMethod(zzkoVar, (ContactMethod.VerificationStatus) obj, (Long) obj2, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                zzkoVar = new ContactMethod$Type$Phone((PhoneContactMethod) PhoneContactMethod.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                zzkoVar = new ContactMethod$Type$Email((EmailContactMethod) EmailContactMethod.ADAPTER.decode(protoReader));
            } else if (nextTag == 3) {
                try {
                    obj = ContactMethod.VerificationStatus.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 4) {
                obj2 = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    ContactMethod.ContactType.ADAPTER.tryDecode(protoReader, m);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ContactMethod contactMethod = (ContactMethod) obj;
        reverseProtoWriter.getClass();
        contactMethod.getClass();
        reverseProtoWriter.writeBytes(contactMethod.unknownFields());
        zzko zzkoVar = contactMethod.f1414type;
        if (zzkoVar instanceof ContactMethod$Type$Phone) {
            PhoneContactMethod.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((ContactMethod$Type$Phone) zzkoVar).value);
        } else if (zzkoVar instanceof ContactMethod$Type$Email) {
            EmailContactMethod.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((ContactMethod$Type$Email) zzkoVar).value);
        } else if (zzkoVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ContactMethod.ContactType.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 5, contactMethod.uses);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 4, contactMethod.verified_timestamp);
        ContactMethod.VerificationStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 3, contactMethod.verification_status);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        ContactMethod contactMethod = (ContactMethod) obj;
        contactMethod.getClass();
        int size$okio = contactMethod.unknownFields().getSize$okio();
        zzko zzkoVar = contactMethod.f1414type;
        if (zzkoVar instanceof ContactMethod$Type$Phone) {
            encodedSizeWithTag = PhoneContactMethod.ADAPTER.encodedSizeWithTag(1, ((ContactMethod$Type$Phone) zzkoVar).value);
        } else {
            if (!(zzkoVar instanceof ContactMethod$Type$Email)) {
                if (zzkoVar != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                return ContactMethod.ContactType.ADAPTER.asRepeated().encodedSizeWithTag(5, contactMethod.uses) + ProtoAdapter.INT64.encodedSizeWithTag(4, contactMethod.verified_timestamp) + ContactMethod.VerificationStatus.ADAPTER.encodedSizeWithTag(3, contactMethod.verification_status) + size$okio;
            }
            encodedSizeWithTag = EmailContactMethod.ADAPTER.encodedSizeWithTag(2, ((ContactMethod$Type$Email) zzkoVar).value);
        }
        size$okio += encodedSizeWithTag;
        return ContactMethod.ContactType.ADAPTER.asRepeated().encodedSizeWithTag(5, contactMethod.uses) + ProtoAdapter.INT64.encodedSizeWithTag(4, contactMethod.verified_timestamp) + ContactMethod.VerificationStatus.ADAPTER.encodedSizeWithTag(3, contactMethod.verification_status) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ContactMethod contactMethod = (ContactMethod) obj;
        contactMethod.getClass();
        ByteString byteString = ByteString.EMPTY;
        zzko zzkoVar = contactMethod.f1414type;
        ContactMethod.VerificationStatus verificationStatus = contactMethod.verification_status;
        Long l = contactMethod.verified_timestamp;
        List list = contactMethod.uses;
        list.getClass();
        byteString.getClass();
        return new ContactMethod(zzkoVar, verificationStatus, l, list, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ContactMethod contactMethod = (ContactMethod) obj;
        contactMethod.getClass();
        ContactMethod.VerificationStatus.ADAPTER.encodeWithTag(protoWriter, 3, contactMethod.verification_status);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, contactMethod.verified_timestamp);
        ContactMethod.ContactType.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, contactMethod.uses);
        zzko zzkoVar = contactMethod.f1414type;
        if (zzkoVar instanceof ContactMethod$Type$Phone) {
            PhoneContactMethod.ADAPTER.encodeWithTag(protoWriter, 1, ((ContactMethod$Type$Phone) zzkoVar).value);
        } else if (zzkoVar instanceof ContactMethod$Type$Email) {
            EmailContactMethod.ADAPTER.encodeWithTag(protoWriter, 2, ((ContactMethod$Type$Email) zzkoVar).value);
        } else if (zzkoVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(contactMethod.unknownFields());
    }
}
