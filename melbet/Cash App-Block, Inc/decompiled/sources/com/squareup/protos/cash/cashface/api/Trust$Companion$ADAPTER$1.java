package com.squareup.protos.cash.cashface.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cashface.api.Trust;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Trust$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Trust((Image) obj, (String) obj2, (Boolean) obj3, (Trust.Id) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj4 = Trust.Id.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Trust trust = (Trust) obj;
        reverseProtoWriter.getClass();
        trust.getClass();
        reverseProtoWriter.writeBytes(trust.unknownFields());
        Trust.Id.ADAPTER.encodeWithTag(reverseProtoWriter, 4, trust.id);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 3, trust.enabled);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, trust.title);
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 1, trust.icon);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Trust trust = (Trust) obj;
        trust.getClass();
        return Trust.Id.ADAPTER.encodedSizeWithTag(4, trust.id) + ProtoAdapter.BOOL.encodedSizeWithTag(3, trust.enabled) + ProtoAdapter.STRING.encodedSizeWithTag(2, trust.title) + Image.ADAPTER.encodedSizeWithTag(1, trust.icon) + trust.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Trust trust = (Trust) obj;
        trust.getClass();
        Image image = trust.icon;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = trust.enabled;
        Trust.Id id = trust.id;
        byteString.getClass();
        return new Trust(image2, null, bool, id, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Trust trust = (Trust) obj;
        trust.getClass();
        Image.ADAPTER.encodeWithTag(protoWriter, 1, trust.icon);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, trust.title);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, trust.enabled);
        Trust.Id.ADAPTER.encodeWithTag(protoWriter, 4, trust.id);
        protoWriter.writeBytes(trust.unknownFields());
    }
}
