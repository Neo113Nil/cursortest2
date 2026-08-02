package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.TransactionAuthRenderData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class TransactionAuthRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new TransactionAuthRenderData((TransactionAuthRenderData.TransactionAuthRequestStatus) obj, (String) obj2, (String) obj3, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = TransactionAuthRenderData.TransactionAuthRequestStatus.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TransactionAuthRenderData transactionAuthRenderData = (TransactionAuthRenderData) obj;
        reverseProtoWriter.getClass();
        transactionAuthRenderData.getClass();
        reverseProtoWriter.writeBytes(transactionAuthRenderData.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, transactionAuthRenderData.dark_theme_overlay_icon_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, transactionAuthRenderData.overlay_icon_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, transactionAuthRenderData.view_action_url);
        TransactionAuthRenderData.TransactionAuthRequestStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 1, transactionAuthRenderData.request_status);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TransactionAuthRenderData transactionAuthRenderData = (TransactionAuthRenderData) obj;
        transactionAuthRenderData.getClass();
        int encodedSizeWithTag = TransactionAuthRenderData.TransactionAuthRequestStatus.ADAPTER.encodedSizeWithTag(1, transactionAuthRenderData.request_status) + transactionAuthRenderData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(4, transactionAuthRenderData.dark_theme_overlay_icon_url) + protoAdapter.encodedSizeWithTag(3, transactionAuthRenderData.overlay_icon_url) + protoAdapter.encodedSizeWithTag(2, transactionAuthRenderData.view_action_url) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TransactionAuthRenderData transactionAuthRenderData = (TransactionAuthRenderData) obj;
        transactionAuthRenderData.getClass();
        ByteString byteString = ByteString.EMPTY;
        TransactionAuthRenderData.TransactionAuthRequestStatus transactionAuthRequestStatus = transactionAuthRenderData.request_status;
        String str = transactionAuthRenderData.view_action_url;
        String str2 = transactionAuthRenderData.overlay_icon_url;
        String str3 = transactionAuthRenderData.dark_theme_overlay_icon_url;
        byteString.getClass();
        return new TransactionAuthRenderData(transactionAuthRequestStatus, str, str2, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TransactionAuthRenderData transactionAuthRenderData = (TransactionAuthRenderData) obj;
        transactionAuthRenderData.getClass();
        TransactionAuthRenderData.TransactionAuthRequestStatus.ADAPTER.encodeWithTag(protoWriter, 1, transactionAuthRenderData.request_status);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, transactionAuthRenderData.view_action_url);
        protoAdapter.encodeWithTag(protoWriter, 3, transactionAuthRenderData.overlay_icon_url);
        protoAdapter.encodeWithTag(protoWriter, 4, transactionAuthRenderData.dark_theme_overlay_icon_url);
        protoWriter.writeBytes(transactionAuthRenderData.unknownFields());
    }
}
