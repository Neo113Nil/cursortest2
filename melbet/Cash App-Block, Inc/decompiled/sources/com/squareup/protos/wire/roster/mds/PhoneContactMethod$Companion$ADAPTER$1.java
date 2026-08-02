package com.squareup.protos.wire.roster.mds;

import androidx.room.TransactorKt;
import com.squareup.protos.common.location.Phone;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class PhoneContactMethod$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PhoneContactMethod((Phone) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Phone.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PhoneContactMethod phoneContactMethod = (PhoneContactMethod) obj;
        reverseProtoWriter.getClass();
        phoneContactMethod.getClass();
        reverseProtoWriter.writeBytes(phoneContactMethod.unknownFields());
        Phone.ADAPTER.encodeWithTag(reverseProtoWriter, 1, phoneContactMethod.phone_number);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PhoneContactMethod phoneContactMethod = (PhoneContactMethod) obj;
        phoneContactMethod.getClass();
        return Phone.ADAPTER.encodedSizeWithTag(1, phoneContactMethod.phone_number) + phoneContactMethod.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PhoneContactMethod phoneContactMethod = (PhoneContactMethod) obj;
        phoneContactMethod.getClass();
        Phone phone = phoneContactMethod.phone_number;
        Phone phone2 = phone != null ? (Phone) Phone.ADAPTER.redact(phone) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new PhoneContactMethod(phone2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PhoneContactMethod phoneContactMethod = (PhoneContactMethod) obj;
        phoneContactMethod.getClass();
        Phone.ADAPTER.encodeWithTag(protoWriter, 1, phoneContactMethod.phone_number);
        protoWriter.writeBytes(phoneContactMethod.unknownFields());
    }
}
