package com.squareup.protos.cash.customersearch.api;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.customersearch.api.RecipientSelectorCustomer;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class RecipientSelectorCustomer$Metadata$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RecipientSelectorCustomer.Metadata((String) obj, (Integer) obj2, (Boolean) obj3, m, (String) obj4, (Boolean) obj5, (Boolean) obj6, (Boolean) obj7, (Boolean) obj8, (Boolean) obj9, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.INT32.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 4:
                    m.add(ProtoAdapter.STRING.decode(protoReader));
                    break;
                case 5:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj5 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 7:
                    obj6 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 8:
                    obj7 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 9:
                    obj8 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 10:
                    obj9 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RecipientSelectorCustomer.Metadata metadata = (RecipientSelectorCustomer.Metadata) obj;
        reverseProtoWriter.getClass();
        metadata.getClass();
        reverseProtoWriter.writeBytes(metadata.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, metadata.is_client_candidate);
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, metadata.is_first_linked_account);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, metadata.is_multiple_account_holder);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, metadata.is_c4b_account);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, metadata.is_linked_account);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, metadata.query_token);
        protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 4, metadata.match_fields);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, metadata.is_cash_customer);
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 2, metadata.match_length);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, metadata.model_version);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RecipientSelectorCustomer.Metadata metadata = (RecipientSelectorCustomer.Metadata) obj;
        metadata.getClass();
        int size$okio = metadata.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(2, metadata.match_length) + protoAdapter.encodedSizeWithTag(1, metadata.model_version) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        return protoAdapter2.encodedSizeWithTag(10, metadata.is_client_candidate) + protoAdapter2.encodedSizeWithTag(9, metadata.is_first_linked_account) + protoAdapter2.encodedSizeWithTag(8, metadata.is_multiple_account_holder) + protoAdapter2.encodedSizeWithTag(7, metadata.is_c4b_account) + protoAdapter2.encodedSizeWithTag(6, metadata.is_linked_account) + protoAdapter.encodedSizeWithTag(5, metadata.query_token) + protoAdapter.asRepeated().encodedSizeWithTag(4, metadata.match_fields) + protoAdapter2.encodedSizeWithTag(3, metadata.is_cash_customer) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RecipientSelectorCustomer.Metadata metadata = (RecipientSelectorCustomer.Metadata) obj;
        metadata.getClass();
        ByteString byteString = ByteString.EMPTY;
        Integer num = metadata.match_length;
        Boolean bool = metadata.is_cash_customer;
        List list = metadata.match_fields;
        String str = metadata.query_token;
        Boolean bool2 = metadata.is_linked_account;
        Boolean bool3 = metadata.is_c4b_account;
        Boolean bool4 = metadata.is_multiple_account_holder;
        Boolean bool5 = metadata.is_first_linked_account;
        Boolean bool6 = metadata.is_client_candidate;
        list.getClass();
        byteString.getClass();
        return new RecipientSelectorCustomer.Metadata(null, num, bool, list, str, bool2, bool3, bool4, bool5, bool6, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RecipientSelectorCustomer.Metadata metadata = (RecipientSelectorCustomer.Metadata) obj;
        metadata.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, metadata.model_version);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, metadata.match_length);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(protoWriter, 3, metadata.is_cash_customer);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 4, metadata.match_fields);
        protoAdapter.encodeWithTag(protoWriter, 5, metadata.query_token);
        protoAdapter2.encodeWithTag(protoWriter, 6, metadata.is_linked_account);
        protoAdapter2.encodeWithTag(protoWriter, 7, metadata.is_c4b_account);
        protoAdapter2.encodeWithTag(protoWriter, 8, metadata.is_multiple_account_holder);
        protoAdapter2.encodeWithTag(protoWriter, 9, metadata.is_first_linked_account);
        protoAdapter2.encodeWithTag(protoWriter, 10, metadata.is_client_candidate);
        protoWriter.writeBytes(metadata.unknownFields());
    }
}
