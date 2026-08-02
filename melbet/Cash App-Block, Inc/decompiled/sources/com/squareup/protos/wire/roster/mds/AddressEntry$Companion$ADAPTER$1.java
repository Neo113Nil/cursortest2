package com.squareup.protos.wire.roster.mds;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.common.address.Verification;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.common.location.Phone;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class AddressEntry$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList arrayList;
        String str;
        Boolean bool;
        ?? decode;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList2 = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        String str2 = null;
        Object obj = null;
        String str3 = null;
        Boolean bool2 = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Boolean bool3 = null;
        Long l = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AddressEntry(str2, (GlobalAddress) obj, str3, m, bool2, (Names) obj2, (Names) obj3, (Phone) obj4, bool3, l, arrayList2, (Verification) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    arrayList = m;
                    obj2 = TransactorKt.decodeMessageOrMerge(Names.ADAPTER, protoReader, obj2);
                    decode = str2;
                    break;
                case 2:
                    arrayList = m;
                    decode = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    arrayList = m;
                    obj = TransactorKt.decodeMessageOrMerge(GlobalAddress.ADAPTER, protoReader, obj);
                    decode = str2;
                    break;
                case 4:
                    arrayList = m;
                    obj3 = TransactorKt.decodeMessageOrMerge(Names.ADAPTER, protoReader, obj3);
                    decode = str2;
                    break;
                case 5:
                    arrayList = m;
                    obj4 = TransactorKt.decodeMessageOrMerge(Phone.ADAPTER, protoReader, obj4);
                    decode = str2;
                    break;
                case 6:
                    arrayList = m;
                    str3 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str2;
                    break;
                case 7:
                    try {
                        AddressTypeScope$AddressType.ADAPTER.tryDecode(protoReader, m);
                        arrayList = m;
                        str = str3;
                        bool = bool2;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        arrayList = m;
                        str = str3;
                        bool = bool2;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                    }
                    decode = str2;
                    str3 = str;
                    bool2 = bool;
                    break;
                case 8:
                    bool3 = ProtoAdapter.BOOL.decode(protoReader);
                    arrayList = m;
                    decode = str2;
                    break;
                case 9:
                    l = ProtoAdapter.INT64.decode(protoReader);
                    arrayList = m;
                    decode = str2;
                    break;
                case 10:
                    bool2 = ProtoAdapter.BOOL.decode(protoReader);
                    arrayList = m;
                    decode = str2;
                    break;
                case 11:
                    arrayList2.add(ScriptAddress.ADAPTER.decode(protoReader));
                    arrayList = m;
                    str = str3;
                    bool = bool2;
                    decode = str2;
                    str3 = str;
                    bool2 = bool;
                    break;
                case 12:
                    obj5 = TransactorKt.decodeMessageOrMerge(Verification.ADAPTER, protoReader, obj5);
                    arrayList = m;
                    decode = str2;
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    arrayList = m;
                    str = str3;
                    bool = bool2;
                    decode = str2;
                    str3 = str;
                    bool2 = bool;
                    break;
            }
            str2 = decode;
            m = arrayList;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AddressEntry addressEntry = (AddressEntry) obj;
        reverseProtoWriter.getClass();
        addressEntry.getClass();
        reverseProtoWriter.writeBytes(addressEntry.unknownFields());
        Verification.ADAPTER.encodeWithTag(reverseProtoWriter, 12, addressEntry.verification);
        ScriptAddress.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 11, addressEntry.script_addresses);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 9, addressEntry.updated_ts);
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, addressEntry.is_personal);
        Phone.ADAPTER.encodeWithTag(reverseProtoWriter, 5, addressEntry.shipping_phone_number);
        ProtoAdapter protoAdapter2 = Names.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, addressEntry.care_of);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, addressEntry.recipient);
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, addressEntry.is_corrected);
        AddressTypeScope$AddressType.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 7, addressEntry.uses);
        ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 6, addressEntry.agrex_code);
        GlobalAddress.ADAPTER.encodeWithTag(reverseProtoWriter, 3, addressEntry.address);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 2, addressEntry.address_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AddressEntry addressEntry = (AddressEntry) obj;
        addressEntry.getClass();
        int size$okio = addressEntry.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = AddressTypeScope$AddressType.ADAPTER.asRepeated().encodedSizeWithTag(7, addressEntry.uses) + protoAdapter.encodedSizeWithTag(6, addressEntry.agrex_code) + GlobalAddress.ADAPTER.encodedSizeWithTag(3, addressEntry.address) + protoAdapter.encodedSizeWithTag(2, addressEntry.address_token) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(10, addressEntry.is_corrected) + encodedSizeWithTag;
        ProtoAdapter protoAdapter3 = Names.ADAPTER;
        return Verification.ADAPTER.encodedSizeWithTag(12, addressEntry.verification) + ScriptAddress.ADAPTER.asRepeated().encodedSizeWithTag(11, addressEntry.script_addresses) + ProtoAdapter.INT64.encodedSizeWithTag(9, addressEntry.updated_ts) + protoAdapter2.encodedSizeWithTag(8, addressEntry.is_personal) + Phone.ADAPTER.encodedSizeWithTag(5, addressEntry.shipping_phone_number) + protoAdapter3.encodedSizeWithTag(4, addressEntry.care_of) + protoAdapter3.encodedSizeWithTag(1, addressEntry.recipient) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AddressEntry addressEntry = (AddressEntry) obj;
        addressEntry.getClass();
        GlobalAddress globalAddress = addressEntry.address;
        GlobalAddress globalAddress2 = globalAddress != null ? (GlobalAddress) GlobalAddress.ADAPTER.redact(globalAddress) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(addressEntry.script_addresses, ScriptAddress.ADAPTER);
        Verification verification = addressEntry.verification;
        Verification verification2 = verification != null ? (Verification) Verification.ADAPTER.redact(verification) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = addressEntry.address_token;
        List list = addressEntry.uses;
        Boolean bool = addressEntry.is_corrected;
        Boolean bool2 = addressEntry.is_personal;
        Long l = addressEntry.updated_ts;
        list.getClass();
        byteString.getClass();
        return new AddressEntry(str, globalAddress2, null, list, bool, null, null, null, bool2, l, m1169redactElements, verification2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AddressEntry addressEntry = (AddressEntry) obj;
        addressEntry.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, addressEntry.address_token);
        GlobalAddress.ADAPTER.encodeWithTag(protoWriter, 3, addressEntry.address);
        protoAdapter.encodeWithTag(protoWriter, 6, addressEntry.agrex_code);
        AddressTypeScope$AddressType.ADAPTER.asRepeated().encodeWithTag(protoWriter, 7, addressEntry.uses);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(protoWriter, 10, addressEntry.is_corrected);
        ProtoAdapter protoAdapter3 = Names.ADAPTER;
        protoAdapter3.encodeWithTag(protoWriter, 1, addressEntry.recipient);
        protoAdapter3.encodeWithTag(protoWriter, 4, addressEntry.care_of);
        Phone.ADAPTER.encodeWithTag(protoWriter, 5, addressEntry.shipping_phone_number);
        protoAdapter2.encodeWithTag(protoWriter, 8, addressEntry.is_personal);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 9, addressEntry.updated_ts);
        ScriptAddress.ADAPTER.asRepeated().encodeWithTag(protoWriter, 11, addressEntry.script_addresses);
        Verification.ADAPTER.encodeWithTag(protoWriter, 12, addressEntry.verification);
        protoWriter.writeBytes(addressEntry.unknownFields());
    }
}
