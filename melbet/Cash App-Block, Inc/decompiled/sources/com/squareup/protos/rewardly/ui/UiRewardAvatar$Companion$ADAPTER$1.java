package com.squareup.protos.rewardly.ui;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class UiRewardAvatar$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new UiRewardAvatar((Image) obj3, (Color) obj4, (String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UiRewardAvatar uiRewardAvatar = (UiRewardAvatar) obj;
        reverseProtoWriter.getClass();
        uiRewardAvatar.getClass();
        reverseProtoWriter.writeBytes(uiRewardAvatar.unknownFields());
        Color.ADAPTER.encodeWithTag(reverseProtoWriter, 4, uiRewardAvatar.themed_color);
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 3, uiRewardAvatar.image);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, uiRewardAvatar.color);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, uiRewardAvatar.url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UiRewardAvatar uiRewardAvatar = (UiRewardAvatar) obj;
        uiRewardAvatar.getClass();
        int size$okio = uiRewardAvatar.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return Color.ADAPTER.encodedSizeWithTag(4, uiRewardAvatar.themed_color) + Image.ADAPTER.encodedSizeWithTag(3, uiRewardAvatar.image) + protoAdapter.encodedSizeWithTag(2, uiRewardAvatar.color) + protoAdapter.encodedSizeWithTag(1, uiRewardAvatar.url) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UiRewardAvatar uiRewardAvatar = (UiRewardAvatar) obj;
        uiRewardAvatar.getClass();
        Image image = uiRewardAvatar.image;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        Color color = uiRewardAvatar.themed_color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = uiRewardAvatar.url;
        String str2 = uiRewardAvatar.color;
        byteString.getClass();
        return new UiRewardAvatar(image2, color2, str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UiRewardAvatar uiRewardAvatar = (UiRewardAvatar) obj;
        uiRewardAvatar.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, uiRewardAvatar.url);
        protoAdapter.encodeWithTag(protoWriter, 2, uiRewardAvatar.color);
        Image.ADAPTER.encodeWithTag(protoWriter, 3, uiRewardAvatar.image);
        Color.ADAPTER.encodeWithTag(protoWriter, 4, uiRewardAvatar.themed_color);
        protoWriter.writeBytes(uiRewardAvatar.unknownFields());
    }
}
