package com.squareup.protos.cash.taply.syncvalues;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.taply.syncvalues.CashAppTag;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CashAppTag$Tag$Companion$ADAPTER$1 extends ProtoAdapter {
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
        Object obj8 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashAppTag.Tag((String) obj, (String) obj2, (Boolean) obj3, (Boolean) obj4, (CashAppTag.TagLifecycleState) obj5, (PhysicalTagOrderState) obj6, (Boolean) obj7, (Image) obj8, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 4:
                    obj4 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 5:
                case 8:
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
                case 6:
                    try {
                        obj5 = CashAppTag.TagLifecycleState.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 7:
                    try {
                        obj6 = PhysicalTagOrderState.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 9:
                    obj7 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 10:
                    obj8 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj8);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashAppTag.Tag tag = (CashAppTag.Tag) obj;
        reverseProtoWriter.getClass();
        tag.getClass();
        reverseProtoWriter.writeBytes(tag.unknownFields());
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 10, tag.background_image);
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, tag.is_expired);
        PhysicalTagOrderState.ADAPTER.encodeWithTag(reverseProtoWriter, 7, tag.tag_order_state);
        CashAppTag.TagLifecycleState.ADAPTER.encodeWithTag(reverseProtoWriter, 6, tag.lifecycle_state);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, tag.is_sponsor_locked);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, tag.is_locked);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, tag.tag_theme_token);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, tag.device_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashAppTag.Tag tag = (CashAppTag.Tag) obj;
        tag.getClass();
        int size$okio = tag.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, tag.tag_theme_token) + protoAdapter.encodedSizeWithTag(1, tag.device_id) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        return Image.ADAPTER.encodedSizeWithTag(10, tag.background_image) + protoAdapter2.encodedSizeWithTag(9, tag.is_expired) + PhysicalTagOrderState.ADAPTER.encodedSizeWithTag(7, tag.tag_order_state) + CashAppTag.TagLifecycleState.ADAPTER.encodedSizeWithTag(6, tag.lifecycle_state) + protoAdapter2.encodedSizeWithTag(4, tag.is_sponsor_locked) + protoAdapter2.encodedSizeWithTag(3, tag.is_locked) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashAppTag.Tag tag = (CashAppTag.Tag) obj;
        tag.getClass();
        Image image = tag.background_image;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = tag.device_id;
        String str2 = tag.tag_theme_token;
        Boolean bool = tag.is_locked;
        Boolean bool2 = tag.is_sponsor_locked;
        CashAppTag.TagLifecycleState tagLifecycleState = tag.lifecycle_state;
        PhysicalTagOrderState physicalTagOrderState = tag.tag_order_state;
        Boolean bool3 = tag.is_expired;
        byteString.getClass();
        return new CashAppTag.Tag(str, str2, bool, bool2, tagLifecycleState, physicalTagOrderState, bool3, image2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashAppTag.Tag tag = (CashAppTag.Tag) obj;
        tag.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, tag.device_id);
        protoAdapter.encodeWithTag(protoWriter, 2, tag.tag_theme_token);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(protoWriter, 3, tag.is_locked);
        protoAdapter2.encodeWithTag(protoWriter, 4, tag.is_sponsor_locked);
        CashAppTag.TagLifecycleState.ADAPTER.encodeWithTag(protoWriter, 6, tag.lifecycle_state);
        PhysicalTagOrderState.ADAPTER.encodeWithTag(protoWriter, 7, tag.tag_order_state);
        protoAdapter2.encodeWithTag(protoWriter, 9, tag.is_expired);
        Image.ADAPTER.encodeWithTag(protoWriter, 10, tag.background_image);
        protoWriter.writeBytes(tag.unknownFields());
    }
}
