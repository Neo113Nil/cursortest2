package com.squareup.protos.cash.local.client.app.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class StaffBrandDetails$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new StaffBrandDetails((LocalColor) obj, (LocalColor) obj2, (LocalImage) obj3, (LocalColor) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalColor.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalColor.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalImage.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(LocalColor.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        StaffBrandDetails staffBrandDetails = (StaffBrandDetails) obj;
        reverseProtoWriter.getClass();
        staffBrandDetails.getClass();
        reverseProtoWriter.writeBytes(staffBrandDetails.unknownFields());
        ProtoAdapter protoAdapter = LocalColor.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, staffBrandDetails.brand_card_outline_color);
        LocalImage.ADAPTER.encodeWithTag(reverseProtoWriter, 3, staffBrandDetails.artwork_image);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, staffBrandDetails.background_color);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, staffBrandDetails.foreground_color);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        StaffBrandDetails staffBrandDetails = (StaffBrandDetails) obj;
        staffBrandDetails.getClass();
        int size$okio = staffBrandDetails.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalColor.ADAPTER;
        return protoAdapter.encodedSizeWithTag(4, staffBrandDetails.brand_card_outline_color) + LocalImage.ADAPTER.encodedSizeWithTag(3, staffBrandDetails.artwork_image) + protoAdapter.encodedSizeWithTag(2, staffBrandDetails.background_color) + protoAdapter.encodedSizeWithTag(1, staffBrandDetails.foreground_color) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        StaffBrandDetails staffBrandDetails = (StaffBrandDetails) obj;
        staffBrandDetails.getClass();
        LocalColor localColor = staffBrandDetails.foreground_color;
        LocalColor localColor2 = localColor != null ? (LocalColor) LocalColor.ADAPTER.redact(localColor) : null;
        LocalColor localColor3 = staffBrandDetails.background_color;
        LocalColor localColor4 = localColor3 != null ? (LocalColor) LocalColor.ADAPTER.redact(localColor3) : null;
        LocalImage localImage = staffBrandDetails.artwork_image;
        LocalImage localImage2 = localImage != null ? (LocalImage) LocalImage.ADAPTER.redact(localImage) : null;
        LocalColor localColor5 = staffBrandDetails.brand_card_outline_color;
        LocalColor localColor6 = localColor5 != null ? (LocalColor) LocalColor.ADAPTER.redact(localColor5) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new StaffBrandDetails(localColor2, localColor4, localImage2, localColor6, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        StaffBrandDetails staffBrandDetails = (StaffBrandDetails) obj;
        staffBrandDetails.getClass();
        ProtoAdapter protoAdapter = LocalColor.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, staffBrandDetails.foreground_color);
        protoAdapter.encodeWithTag(protoWriter, 2, staffBrandDetails.background_color);
        LocalImage.ADAPTER.encodeWithTag(protoWriter, 3, staffBrandDetails.artwork_image);
        protoAdapter.encodeWithTag(protoWriter, 4, staffBrandDetails.brand_card_outline_color);
        protoWriter.writeBytes(staffBrandDetails.unknownFields());
    }
}
