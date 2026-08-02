package com.squareup.protos.payrollconnector.common;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class PayrollProviderUiAvatar$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PayrollProviderUiAvatar((Image) obj, (Color) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PayrollProviderUiAvatar payrollProviderUiAvatar = (PayrollProviderUiAvatar) obj;
        reverseProtoWriter.getClass();
        payrollProviderUiAvatar.getClass();
        reverseProtoWriter.writeBytes(payrollProviderUiAvatar.unknownFields());
        Color.ADAPTER.encodeWithTag(reverseProtoWriter, 2, payrollProviderUiAvatar.avatar_accent_color);
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 1, payrollProviderUiAvatar.avatar_url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PayrollProviderUiAvatar payrollProviderUiAvatar = (PayrollProviderUiAvatar) obj;
        payrollProviderUiAvatar.getClass();
        return Color.ADAPTER.encodedSizeWithTag(2, payrollProviderUiAvatar.avatar_accent_color) + Image.ADAPTER.encodedSizeWithTag(1, payrollProviderUiAvatar.avatar_url) + payrollProviderUiAvatar.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PayrollProviderUiAvatar payrollProviderUiAvatar = (PayrollProviderUiAvatar) obj;
        payrollProviderUiAvatar.getClass();
        Image image = payrollProviderUiAvatar.avatar_url;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        Color color = payrollProviderUiAvatar.avatar_accent_color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new PayrollProviderUiAvatar(image2, color2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PayrollProviderUiAvatar payrollProviderUiAvatar = (PayrollProviderUiAvatar) obj;
        payrollProviderUiAvatar.getClass();
        Image.ADAPTER.encodeWithTag(protoWriter, 1, payrollProviderUiAvatar.avatar_url);
        Color.ADAPTER.encodeWithTag(protoWriter, 2, payrollProviderUiAvatar.avatar_accent_color);
        protoWriter.writeBytes(payrollProviderUiAvatar.unknownFields());
    }
}
