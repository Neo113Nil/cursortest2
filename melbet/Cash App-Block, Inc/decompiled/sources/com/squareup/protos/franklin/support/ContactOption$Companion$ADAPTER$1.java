package com.squareup.protos.franklin.support;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ContactOption$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ContactOption((SupportContactType) obj, (Boolean) obj2, (String) obj3, (String) obj4, (String) obj5, (Boolean) obj6, (String) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = SupportContactType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag == 4) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 5) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 7) {
                obj5 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 8) {
                obj6 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 9) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj7 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ContactOption contactOption = (ContactOption) obj;
        reverseProtoWriter.getClass();
        contactOption.getClass();
        reverseProtoWriter.writeBytes(contactOption.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, contactOption.contact_terms);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 8, contactOption.include_issue_description);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, contactOption.time_estimate);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, contactOption.contact_header);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, contactOption.summary_text);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, contactOption.available);
        SupportContactType.ADAPTER.encodeWithTag(reverseProtoWriter, 1, contactOption.contact_type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ContactOption contactOption = (ContactOption) obj;
        contactOption.getClass();
        int encodedSizeWithTag = SupportContactType.ADAPTER.encodedSizeWithTag(1, contactOption.contact_type) + contactOption.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(2, contactOption.available) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        return protoAdapter2.encodedSizeWithTag(9, contactOption.contact_terms) + protoAdapter.encodedSizeWithTag(8, contactOption.include_issue_description) + protoAdapter2.encodedSizeWithTag(7, contactOption.time_estimate) + protoAdapter2.encodedSizeWithTag(5, contactOption.contact_header) + protoAdapter2.encodedSizeWithTag(4, contactOption.summary_text) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ContactOption contactOption = (ContactOption) obj;
        contactOption.getClass();
        ByteString byteString = ByteString.EMPTY;
        SupportContactType supportContactType = contactOption.contact_type;
        Boolean bool = contactOption.available;
        String str = contactOption.summary_text;
        String str2 = contactOption.contact_header;
        String str3 = contactOption.time_estimate;
        Boolean bool2 = contactOption.include_issue_description;
        String str4 = contactOption.contact_terms;
        byteString.getClass();
        return new ContactOption(supportContactType, bool, str, str2, str3, bool2, str4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ContactOption contactOption = (ContactOption) obj;
        contactOption.getClass();
        SupportContactType.ADAPTER.encodeWithTag(protoWriter, 1, contactOption.contact_type);
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(protoWriter, 2, contactOption.available);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 4, contactOption.summary_text);
        protoAdapter2.encodeWithTag(protoWriter, 5, contactOption.contact_header);
        protoAdapter2.encodeWithTag(protoWriter, 7, contactOption.time_estimate);
        protoAdapter.encodeWithTag(protoWriter, 8, contactOption.include_issue_description);
        protoAdapter2.encodeWithTag(protoWriter, 9, contactOption.contact_terms);
        protoWriter.writeBytes(contactOption.unknownFields());
    }
}
