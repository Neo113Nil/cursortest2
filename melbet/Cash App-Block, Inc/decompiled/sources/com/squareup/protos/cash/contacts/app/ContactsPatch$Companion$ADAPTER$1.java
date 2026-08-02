package com.squareup.protos.cash.contacts.app;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ContactsPatch$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ContactsPatch(m, arrayList, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(AddressBookContact.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                arrayList.add(ProtoAdapter.STRING.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ContactsPatch contactsPatch = (ContactsPatch) obj;
        reverseProtoWriter.getClass();
        contactsPatch.getClass();
        reverseProtoWriter.writeBytes(contactsPatch.unknownFields());
        ProtoAdapter.STRING.asRepeated().encodeWithTag(reverseProtoWriter, 2, contactsPatch.removed_contact_ids);
        AddressBookContact.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, contactsPatch.upserted_contacts);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ContactsPatch contactsPatch = (ContactsPatch) obj;
        contactsPatch.getClass();
        return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, contactsPatch.removed_contact_ids) + AddressBookContact.ADAPTER.asRepeated().encodedSizeWithTag(1, contactsPatch.upserted_contacts) + contactsPatch.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ContactsPatch contactsPatch = (ContactsPatch) obj;
        contactsPatch.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(contactsPatch.upserted_contacts, AddressBookContact.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        List list = contactsPatch.removed_contact_ids;
        list.getClass();
        byteString.getClass();
        return new ContactsPatch(m1169redactElements, list, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ContactsPatch contactsPatch = (ContactsPatch) obj;
        contactsPatch.getClass();
        AddressBookContact.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, contactsPatch.upserted_contacts);
        ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, contactsPatch.removed_contact_ids);
        protoWriter.writeBytes(contactsPatch.unknownFields());
    }
}
