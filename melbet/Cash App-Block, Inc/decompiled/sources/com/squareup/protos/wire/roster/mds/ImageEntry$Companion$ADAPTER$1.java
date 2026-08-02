package com.squareup.protos.wire.roster.mds;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ImageEntry$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        Object obj2;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ImageEntry(m, (String) obj3, (String) obj4, (String) obj5, (String) obj6, (Integer) obj7, (Integer) obj8, (Integer) obj9, (Integer) obj10, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    try {
                        ImagePurposeScope$ImagePurpose.ADAPTER.tryDecode(protoReader, m);
                        obj2 = obj3;
                        obj = obj4;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        obj2 = obj3;
                        obj = obj4;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                    }
                    obj4 = obj;
                    obj3 = obj2;
                    break;
                case 2:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj7 = ProtoAdapter.UINT32.decode(protoReader);
                    break;
                case 7:
                    obj8 = ProtoAdapter.UINT32.decode(protoReader);
                    break;
                case 8:
                    obj9 = ProtoAdapter.UINT32.decode(protoReader);
                    break;
                case 9:
                    obj10 = ProtoAdapter.UINT32.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    obj2 = obj3;
                    obj = obj4;
                    obj4 = obj;
                    obj3 = obj2;
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ImageEntry imageEntry = (ImageEntry) obj;
        reverseProtoWriter.getClass();
        imageEntry.getClass();
        reverseProtoWriter.writeBytes(imageEntry.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.UINT32;
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, imageEntry.center_y);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, imageEntry.center_x);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, imageEntry.height);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, imageEntry.width);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, imageEntry.file_name);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, imageEntry.image_url);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, imageEntry.content_type);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, imageEntry.content_digest);
        ImagePurposeScope$ImagePurpose.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, imageEntry.image_purposes);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ImageEntry imageEntry = (ImageEntry) obj;
        imageEntry.getClass();
        int encodedSizeWithTag = ImagePurposeScope$ImagePurpose.ADAPTER.asRepeated().encodedSizeWithTag(1, imageEntry.image_purposes) + imageEntry.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(5, imageEntry.file_name) + protoAdapter.encodedSizeWithTag(4, imageEntry.image_url) + protoAdapter.encodedSizeWithTag(3, imageEntry.content_type) + protoAdapter.encodedSizeWithTag(2, imageEntry.content_digest) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = ProtoAdapter.UINT32;
        return protoAdapter2.encodedSizeWithTag(9, imageEntry.center_y) + protoAdapter2.encodedSizeWithTag(8, imageEntry.center_x) + protoAdapter2.encodedSizeWithTag(7, imageEntry.height) + protoAdapter2.encodedSizeWithTag(6, imageEntry.width) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ImageEntry imageEntry = (ImageEntry) obj;
        imageEntry.getClass();
        ByteString byteString = ByteString.EMPTY;
        List list = imageEntry.image_purposes;
        String str = imageEntry.content_digest;
        String str2 = imageEntry.content_type;
        String str3 = imageEntry.image_url;
        String str4 = imageEntry.file_name;
        Integer num = imageEntry.width;
        Integer num2 = imageEntry.height;
        Integer num3 = imageEntry.center_x;
        Integer num4 = imageEntry.center_y;
        list.getClass();
        byteString.getClass();
        return new ImageEntry(list, str, str2, str3, str4, num, num2, num3, num4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ImageEntry imageEntry = (ImageEntry) obj;
        imageEntry.getClass();
        ImagePurposeScope$ImagePurpose.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, imageEntry.image_purposes);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, imageEntry.content_digest);
        protoAdapter.encodeWithTag(protoWriter, 3, imageEntry.content_type);
        protoAdapter.encodeWithTag(protoWriter, 4, imageEntry.image_url);
        protoAdapter.encodeWithTag(protoWriter, 5, imageEntry.file_name);
        ProtoAdapter protoAdapter2 = ProtoAdapter.UINT32;
        protoAdapter2.encodeWithTag(protoWriter, 6, imageEntry.width);
        protoAdapter2.encodeWithTag(protoWriter, 7, imageEntry.height);
        protoAdapter2.encodeWithTag(protoWriter, 8, imageEntry.center_x);
        protoAdapter2.encodeWithTag(protoWriter, 9, imageEntry.center_y);
        protoWriter.writeBytes(imageEntry.unknownFields());
    }
}
