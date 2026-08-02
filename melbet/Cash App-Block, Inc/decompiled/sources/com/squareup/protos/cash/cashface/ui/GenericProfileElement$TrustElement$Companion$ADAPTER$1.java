package com.squareup.protos.cash.cashface.ui;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GenericProfileElement$TrustElement$Companion$ADAPTER$1 extends ProtoAdapter {
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
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GenericProfileElement.TrustElement((Image) obj, (String) obj2, (Boolean) obj3, (GenericProfileElement.TrustElement.Id) obj4, (Icon) obj5, (Icon) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 4:
                    try {
                        obj4 = GenericProfileElement.TrustElement.Id.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(Icon.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(Icon.ADAPTER, protoReader, obj6);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GenericProfileElement.TrustElement trustElement = (GenericProfileElement.TrustElement) obj;
        reverseProtoWriter.getClass();
        trustElement.getClass();
        reverseProtoWriter.writeBytes(trustElement.unknownFields());
        ProtoAdapter protoAdapter = Icon.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, trustElement.arcade_small_icon);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, trustElement.arcade_icon);
        GenericProfileElement.TrustElement.Id.ADAPTER.encodeWithTag(reverseProtoWriter, 4, trustElement.id);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 3, trustElement.enabled);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, trustElement.title);
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 1, trustElement.icon);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GenericProfileElement.TrustElement trustElement = (GenericProfileElement.TrustElement) obj;
        trustElement.getClass();
        int encodedSizeWithTag = GenericProfileElement.TrustElement.Id.ADAPTER.encodedSizeWithTag(4, trustElement.id) + ProtoAdapter.BOOL.encodedSizeWithTag(3, trustElement.enabled) + ProtoAdapter.STRING.encodedSizeWithTag(2, trustElement.title) + Image.ADAPTER.encodedSizeWithTag(1, trustElement.icon) + trustElement.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Icon.ADAPTER;
        return protoAdapter.encodedSizeWithTag(6, trustElement.arcade_small_icon) + protoAdapter.encodedSizeWithTag(5, trustElement.arcade_icon) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GenericProfileElement.TrustElement trustElement = (GenericProfileElement.TrustElement) obj;
        trustElement.getClass();
        Image image = trustElement.icon;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        Icon icon = trustElement.arcade_icon;
        Icon icon2 = icon != null ? (Icon) Icon.ADAPTER.redact(icon) : null;
        Icon icon3 = trustElement.arcade_small_icon;
        Icon icon4 = icon3 != null ? (Icon) Icon.ADAPTER.redact(icon3) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = trustElement.enabled;
        GenericProfileElement.TrustElement.Id id = trustElement.id;
        byteString.getClass();
        return new GenericProfileElement.TrustElement(image2, null, bool, id, icon2, icon4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GenericProfileElement.TrustElement trustElement = (GenericProfileElement.TrustElement) obj;
        trustElement.getClass();
        Image.ADAPTER.encodeWithTag(protoWriter, 1, trustElement.icon);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, trustElement.title);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, trustElement.enabled);
        GenericProfileElement.TrustElement.Id.ADAPTER.encodeWithTag(protoWriter, 4, trustElement.id);
        ProtoAdapter protoAdapter = Icon.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 5, trustElement.arcade_icon);
        protoAdapter.encodeWithTag(protoWriter, 6, trustElement.arcade_small_icon);
        protoWriter.writeBytes(trustElement.unknownFields());
    }
}
