package com.squareup.protos.person;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class Person$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Person((String) obj, (Long) obj2, (Long) obj3, (Long) obj4, m, arrayList, arrayList2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag != 9) {
                switch (nextTag) {
                    case 1:
                        obj = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 2:
                        obj2 = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 3:
                        obj3 = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 4:
                        obj4 = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 5:
                        m.add(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 6:
                        arrayList.add(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    default:
                        protoReader.readUnknownField(nextTag);
                        break;
                }
            } else {
                arrayList2.add(Alias.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Person person = (Person) obj;
        reverseProtoWriter.getClass();
        person.getClass();
        reverseProtoWriter.writeBytes(person.unknownFields());
        Alias.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 9, person.scoped_alias);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 6, person.DO_NOT_USE_alias);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 5, person.previous_person_token);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, person.retired_at_ms);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, person.updated_at_ms);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, person.created_at_ms);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, person.person_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Person person = (Person) obj;
        person.getClass();
        int size$okio = person.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, person.person_token) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        return Alias.ADAPTER.asRepeated().encodedSizeWithTag(9, person.scoped_alias) + protoAdapter.asRepeated().encodedSizeWithTag(6, person.DO_NOT_USE_alias) + protoAdapter.asRepeated().encodedSizeWithTag(5, person.previous_person_token) + protoAdapter2.encodedSizeWithTag(4, person.retired_at_ms) + protoAdapter2.encodedSizeWithTag(3, person.updated_at_ms) + protoAdapter2.encodedSizeWithTag(2, person.created_at_ms) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Person person = (Person) obj;
        person.getClass();
        EmptyList emptyList = EmptyList.INSTANCE;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(person.scoped_alias, Alias.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = person.person_token;
        Long l = person.created_at_ms;
        Long l2 = person.updated_at_ms;
        Long l3 = person.retired_at_ms;
        List list = person.previous_person_token;
        list.getClass();
        emptyList.getClass();
        byteString.getClass();
        return new Person(str, l, l2, l3, list, emptyList, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Person person = (Person) obj;
        person.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, person.person_token);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(protoWriter, 2, person.created_at_ms);
        protoAdapter2.encodeWithTag(protoWriter, 3, person.updated_at_ms);
        protoAdapter2.encodeWithTag(protoWriter, 4, person.retired_at_ms);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 5, person.previous_person_token);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 6, person.DO_NOT_USE_alias);
        Alias.ADAPTER.asRepeated().encodeWithTag(protoWriter, 9, person.scoped_alias);
        protoWriter.writeBytes(person.unknownFields());
    }
}
