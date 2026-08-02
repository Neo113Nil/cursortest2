package com.squareup.protos.cash.requirements;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.client.ClientInfo;
import com.squareup.protos.franklin.accounts.AddressSource;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SetAddressRequirementData$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        ?? decode;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Boolean bool4 = null;
        Object obj = null;
        Boolean bool5 = null;
        Boolean bool6 = null;
        Boolean bool7 = null;
        String str = null;
        Boolean bool8 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        AddressSource addressSource = null;
        AddressCollectionValidationPolicy addressCollectionValidationPolicy = null;
        String str5 = null;
        String str6 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SetAddressRequirementData((ClientInfo) obj, bool4, bool5, bool6, bool7, str, bool8, str2, str3, str4, addressSource, addressCollectionValidationPolicy, str5, str6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(ClientInfo.ADAPTER, protoReader, obj);
                    decode = bool4;
                    break;
                case 2:
                    decode = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 3:
                    bool5 = ProtoAdapter.BOOL.decode(protoReader);
                    decode = bool4;
                    break;
                case 4:
                    bool6 = ProtoAdapter.BOOL.decode(protoReader);
                    decode = bool4;
                    break;
                case 5:
                    bool7 = ProtoAdapter.BOOL.decode(protoReader);
                    decode = bool4;
                    break;
                case 6:
                    str = ProtoAdapter.STRING.decode(protoReader);
                    decode = bool4;
                    break;
                case 7:
                    bool8 = ProtoAdapter.BOOL.decode(protoReader);
                    decode = bool4;
                    break;
                case 8:
                    str2 = ProtoAdapter.STRING.decode(protoReader);
                    decode = bool4;
                    break;
                case 9:
                    str3 = ProtoAdapter.STRING.decode(protoReader);
                    decode = bool4;
                    break;
                case 10:
                    str4 = ProtoAdapter.STRING.decode(protoReader);
                    decode = bool4;
                    break;
                case 11:
                    bool = bool5;
                    bool2 = bool6;
                    bool3 = bool7;
                    try {
                        addressSource = AddressSource.ADAPTER.decode(protoReader);
                        bool5 = bool;
                        bool6 = bool2;
                        bool7 = bool3;
                        decode = bool4;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 12:
                    try {
                        addressCollectionValidationPolicy = AddressCollectionValidationPolicy.ADAPTER.decode(protoReader);
                        decode = bool4;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        bool = bool5;
                        bool2 = bool6;
                        bool3 = bool7;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 13:
                    str5 = ProtoAdapter.STRING.decode(protoReader);
                    decode = bool4;
                    break;
                case 14:
                    str6 = ProtoAdapter.STRING.decode(protoReader);
                    decode = bool4;
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    bool = bool5;
                    bool2 = bool6;
                    bool3 = bool7;
                    decode = bool4;
                    bool5 = bool;
                    bool6 = bool2;
                    bool7 = bool3;
                    break;
            }
            bool4 = decode;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SetAddressRequirementData setAddressRequirementData = (SetAddressRequirementData) obj;
        reverseProtoWriter.getClass();
        setAddressRequirementData.getClass();
        reverseProtoWriter.writeBytes(setAddressRequirementData.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 14, setAddressRequirementData.parent_flow);
        protoAdapter.encodeWithTag(reverseProtoWriter, 13, setAddressRequirementData.prefill_address_token);
        AddressCollectionValidationPolicy.ADAPTER.encodeWithTag(reverseProtoWriter, 12, setAddressRequirementData.address_collection_validation_policy);
        AddressSource.ADAPTER.encodeWithTag(reverseProtoWriter, 11, setAddressRequirementData.address_source_to_collect);
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, setAddressRequirementData.hint_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, setAddressRequirementData.sub_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, setAddressRequirementData.main_text);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 7, setAddressRequirementData.force_set_address);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, setAddressRequirementData.region);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, setAddressRequirementData.requires_postal_code);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, setAddressRequirementData.requires_city);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, setAddressRequirementData.requires_state);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, setAddressRequirementData.requires_street_address);
        ClientInfo.ADAPTER.encodeWithTag(reverseProtoWriter, 1, setAddressRequirementData.client_info);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SetAddressRequirementData setAddressRequirementData = (SetAddressRequirementData) obj;
        setAddressRequirementData.getClass();
        int encodedSizeWithTag = ClientInfo.ADAPTER.encodedSizeWithTag(1, setAddressRequirementData.client_info) + setAddressRequirementData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(5, setAddressRequirementData.requires_postal_code) + protoAdapter.encodedSizeWithTag(4, setAddressRequirementData.requires_city) + protoAdapter.encodedSizeWithTag(3, setAddressRequirementData.requires_state) + protoAdapter.encodedSizeWithTag(2, setAddressRequirementData.requires_street_address) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        return protoAdapter2.encodedSizeWithTag(14, setAddressRequirementData.parent_flow) + protoAdapter2.encodedSizeWithTag(13, setAddressRequirementData.prefill_address_token) + AddressCollectionValidationPolicy.ADAPTER.encodedSizeWithTag(12, setAddressRequirementData.address_collection_validation_policy) + AddressSource.ADAPTER.encodedSizeWithTag(11, setAddressRequirementData.address_source_to_collect) + protoAdapter2.encodedSizeWithTag(10, setAddressRequirementData.hint_text) + protoAdapter2.encodedSizeWithTag(9, setAddressRequirementData.sub_text) + protoAdapter2.encodedSizeWithTag(8, setAddressRequirementData.main_text) + protoAdapter.encodedSizeWithTag(7, setAddressRequirementData.force_set_address) + protoAdapter2.encodedSizeWithTag(6, setAddressRequirementData.region) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SetAddressRequirementData setAddressRequirementData = (SetAddressRequirementData) obj;
        setAddressRequirementData.getClass();
        ClientInfo clientInfo = setAddressRequirementData.client_info;
        ClientInfo clientInfo2 = clientInfo != null ? (ClientInfo) ClientInfo.ADAPTER.redact(clientInfo) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = setAddressRequirementData.requires_street_address;
        Boolean bool2 = setAddressRequirementData.requires_state;
        Boolean bool3 = setAddressRequirementData.requires_city;
        Boolean bool4 = setAddressRequirementData.requires_postal_code;
        String str = setAddressRequirementData.region;
        Boolean bool5 = setAddressRequirementData.force_set_address;
        String str2 = setAddressRequirementData.main_text;
        String str3 = setAddressRequirementData.sub_text;
        String str4 = setAddressRequirementData.hint_text;
        AddressSource addressSource = setAddressRequirementData.address_source_to_collect;
        AddressCollectionValidationPolicy addressCollectionValidationPolicy = setAddressRequirementData.address_collection_validation_policy;
        String str5 = setAddressRequirementData.prefill_address_token;
        String str6 = setAddressRequirementData.parent_flow;
        byteString.getClass();
        return new SetAddressRequirementData(clientInfo2, bool, bool2, bool3, bool4, str, bool5, str2, str3, str4, addressSource, addressCollectionValidationPolicy, str5, str6, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SetAddressRequirementData setAddressRequirementData = (SetAddressRequirementData) obj;
        setAddressRequirementData.getClass();
        ClientInfo.ADAPTER.encodeWithTag(protoWriter, 1, setAddressRequirementData.client_info);
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(protoWriter, 2, setAddressRequirementData.requires_street_address);
        protoAdapter.encodeWithTag(protoWriter, 3, setAddressRequirementData.requires_state);
        protoAdapter.encodeWithTag(protoWriter, 4, setAddressRequirementData.requires_city);
        protoAdapter.encodeWithTag(protoWriter, 5, setAddressRequirementData.requires_postal_code);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 6, setAddressRequirementData.region);
        protoAdapter.encodeWithTag(protoWriter, 7, setAddressRequirementData.force_set_address);
        protoAdapter2.encodeWithTag(protoWriter, 8, setAddressRequirementData.main_text);
        protoAdapter2.encodeWithTag(protoWriter, 9, setAddressRequirementData.sub_text);
        protoAdapter2.encodeWithTag(protoWriter, 10, setAddressRequirementData.hint_text);
        AddressSource.ADAPTER.encodeWithTag(protoWriter, 11, setAddressRequirementData.address_source_to_collect);
        AddressCollectionValidationPolicy.ADAPTER.encodeWithTag(protoWriter, 12, setAddressRequirementData.address_collection_validation_policy);
        protoAdapter2.encodeWithTag(protoWriter, 13, setAddressRequirementData.prefill_address_token);
        protoAdapter2.encodeWithTag(protoWriter, 14, setAddressRequirementData.parent_flow);
        protoWriter.writeBytes(setAddressRequirementData.unknownFields());
    }
}
