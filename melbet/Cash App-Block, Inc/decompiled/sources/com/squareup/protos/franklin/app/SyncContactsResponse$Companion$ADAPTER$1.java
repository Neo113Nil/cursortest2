package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.app.SyncContactsResponse;
import com.squareup.protos.franklin.common.SyncedContact;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import kotlin.collections.EmptyList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SyncContactsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SyncContactsResponse((SyncContactsResponse.Status) obj, (String) obj2, m, arrayList, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = SyncContactsResponse.Status.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                m.add(SyncedContact.ADAPTER.decode(protoReader));
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                arrayList.add(ProtoAdapter.BYTES.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SyncContactsResponse syncContactsResponse = (SyncContactsResponse) obj;
        reverseProtoWriter.getClass();
        syncContactsResponse.getClass();
        reverseProtoWriter.writeBytes(syncContactsResponse.unknownFields());
        ProtoAdapter.BYTES.asRepeated().encodeWithTag(reverseProtoWriter, 4, syncContactsResponse.remove_hashed_aliases);
        SyncedContact.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, syncContactsResponse.add_contacts);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, syncContactsResponse.sync_token);
        SyncContactsResponse.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 1, syncContactsResponse.status);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SyncContactsResponse syncContactsResponse = (SyncContactsResponse) obj;
        syncContactsResponse.getClass();
        return ProtoAdapter.BYTES.asRepeated().encodedSizeWithTag(4, syncContactsResponse.remove_hashed_aliases) + SyncedContact.ADAPTER.asRepeated().encodedSizeWithTag(3, syncContactsResponse.add_contacts) + ProtoAdapter.STRING.encodedSizeWithTag(2, syncContactsResponse.sync_token) + SyncContactsResponse.Status.ADAPTER.encodedSizeWithTag(1, syncContactsResponse.status) + syncContactsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SyncContactsResponse syncContactsResponse = (SyncContactsResponse) obj;
        syncContactsResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(syncContactsResponse.add_contacts, SyncedContact.ADAPTER);
        EmptyList emptyList = EmptyList.INSTANCE;
        ByteString byteString = ByteString.EMPTY;
        SyncContactsResponse.Status status = syncContactsResponse.status;
        String str = syncContactsResponse.sync_token;
        emptyList.getClass();
        byteString.getClass();
        return new SyncContactsResponse(status, str, m1169redactElements, emptyList, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SyncContactsResponse syncContactsResponse = (SyncContactsResponse) obj;
        syncContactsResponse.getClass();
        SyncContactsResponse.Status.ADAPTER.encodeWithTag(protoWriter, 1, syncContactsResponse.status);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, syncContactsResponse.sync_token);
        SyncedContact.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, syncContactsResponse.add_contacts);
        ProtoAdapter.BYTES.asRepeated().encodeWithTag(protoWriter, 4, syncContactsResponse.remove_hashed_aliases);
        protoWriter.writeBytes(syncContactsResponse.unknownFields());
    }
}
