package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.app.FindCustomersResponse;
import com.squareup.protos.franklin.ui.UiCustomer;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class FindCustomersResponse$Companion$ADAPTER$1 extends ProtoAdapter {
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
                break;
            }
            if (nextTag == 1) {
                try {
                    obj = FindCustomersResponse.Status.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                m.add(UiCustomer.ADAPTER.decode(protoReader));
            } else if (nextTag == 4) {
                obj3 = TransactorKt.decodeMessageOrMerge(UiCustomer.ADAPTER, protoReader, obj3);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj4 = FindCustomersResponse.Sort.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            }
        }
        ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
        FindCustomersResponse.Status status = (FindCustomersResponse.Status) obj;
        String str = (String) obj2;
        UiCustomer uiCustomer = (UiCustomer) obj3;
        FindCustomersResponse.Sort sort = (FindCustomersResponse.Sort) obj4;
        if (sort != null) {
            return new FindCustomersResponse(status, str, m, uiCustomer, sort, endMessageAndGetUnknownFields);
        }
        TransactorKt.missingRequiredFields(obj4, "sort");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        FindCustomersResponse findCustomersResponse = (FindCustomersResponse) obj;
        reverseProtoWriter.getClass();
        findCustomersResponse.getClass();
        reverseProtoWriter.writeBytes(findCustomersResponse.unknownFields());
        FindCustomersResponse.Sort.ADAPTER.encodeWithTag(reverseProtoWriter, 5, findCustomersResponse.sort);
        ProtoAdapter protoAdapter = UiCustomer.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, findCustomersResponse.exact_match);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 3, findCustomersResponse.matches);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, findCustomersResponse.search_text);
        FindCustomersResponse.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 1, findCustomersResponse.status);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        FindCustomersResponse findCustomersResponse = (FindCustomersResponse) obj;
        findCustomersResponse.getClass();
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(2, findCustomersResponse.search_text) + FindCustomersResponse.Status.ADAPTER.encodedSizeWithTag(1, findCustomersResponse.status) + findCustomersResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = UiCustomer.ADAPTER;
        return FindCustomersResponse.Sort.ADAPTER.encodedSizeWithTag(5, findCustomersResponse.sort) + protoAdapter.encodedSizeWithTag(4, findCustomersResponse.exact_match) + protoAdapter.asRepeated().encodedSizeWithTag(3, findCustomersResponse.matches) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        FindCustomersResponse findCustomersResponse = (FindCustomersResponse) obj;
        findCustomersResponse.getClass();
        List list = findCustomersResponse.matches;
        ProtoAdapter protoAdapter = UiCustomer.ADAPTER;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(list, protoAdapter);
        UiCustomer uiCustomer = findCustomersResponse.exact_match;
        UiCustomer uiCustomer2 = uiCustomer != null ? (UiCustomer) protoAdapter.redact(uiCustomer) : null;
        ByteString byteString = ByteString.EMPTY;
        FindCustomersResponse.Status status = findCustomersResponse.status;
        FindCustomersResponse.Sort sort = findCustomersResponse.sort;
        sort.getClass();
        byteString.getClass();
        return new FindCustomersResponse(status, null, m1169redactElements, uiCustomer2, sort, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        FindCustomersResponse findCustomersResponse = (FindCustomersResponse) obj;
        findCustomersResponse.getClass();
        FindCustomersResponse.Status.ADAPTER.encodeWithTag(protoWriter, 1, findCustomersResponse.status);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, findCustomersResponse.search_text);
        ProtoAdapter protoAdapter = UiCustomer.ADAPTER;
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 3, findCustomersResponse.matches);
        protoAdapter.encodeWithTag(protoWriter, 4, findCustomersResponse.exact_match);
        FindCustomersResponse.Sort.ADAPTER.encodeWithTag(protoWriter, 5, findCustomersResponse.sort);
        protoWriter.writeBytes(findCustomersResponse.unknownFields());
    }
}
