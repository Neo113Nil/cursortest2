package com.squareup.protos.unicorn;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class FdicDisclosureCopy$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new FdicDisclosureCopy((LocalizedString) obj, (LocalizedString) obj2, (Image) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        FdicDisclosureCopy fdicDisclosureCopy = (FdicDisclosureCopy) obj;
        reverseProtoWriter.getClass();
        fdicDisclosureCopy.getClass();
        reverseProtoWriter.writeBytes(fdicDisclosureCopy.unknownFields());
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 3, fdicDisclosureCopy.icon);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, fdicDisclosureCopy.insured_copy);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, fdicDisclosureCopy.uninsured_copy);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        FdicDisclosureCopy fdicDisclosureCopy = (FdicDisclosureCopy) obj;
        fdicDisclosureCopy.getClass();
        int size$okio = fdicDisclosureCopy.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return Image.ADAPTER.encodedSizeWithTag(3, fdicDisclosureCopy.icon) + protoAdapter.encodedSizeWithTag(2, fdicDisclosureCopy.insured_copy) + protoAdapter.encodedSizeWithTag(1, fdicDisclosureCopy.uninsured_copy) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        FdicDisclosureCopy fdicDisclosureCopy = (FdicDisclosureCopy) obj;
        fdicDisclosureCopy.getClass();
        LocalizedString localizedString = fdicDisclosureCopy.uninsured_copy;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = fdicDisclosureCopy.insured_copy;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        Image image = fdicDisclosureCopy.icon;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new FdicDisclosureCopy(localizedString2, localizedString4, image2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        FdicDisclosureCopy fdicDisclosureCopy = (FdicDisclosureCopy) obj;
        fdicDisclosureCopy.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, fdicDisclosureCopy.uninsured_copy);
        protoAdapter.encodeWithTag(protoWriter, 2, fdicDisclosureCopy.insured_copy);
        Image.ADAPTER.encodeWithTag(protoWriter, 3, fdicDisclosureCopy.icon);
        protoWriter.writeBytes(fdicDisclosureCopy.unknownFields());
    }
}
