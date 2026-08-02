package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.app.CheckDepositConfig;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CheckDepositConfig$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CheckDepositConfig((CheckDepositConfig.Image) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(CheckDepositConfig.Image.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CheckDepositConfig checkDepositConfig = (CheckDepositConfig) obj;
        reverseProtoWriter.getClass();
        checkDepositConfig.getClass();
        reverseProtoWriter.writeBytes(checkDepositConfig.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, checkDepositConfig.description);
        CheckDepositConfig.Image.ADAPTER.encodeWithTag(reverseProtoWriter, 1, checkDepositConfig.image);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CheckDepositConfig checkDepositConfig = (CheckDepositConfig) obj;
        checkDepositConfig.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, checkDepositConfig.description) + CheckDepositConfig.Image.ADAPTER.encodedSizeWithTag(1, checkDepositConfig.image) + checkDepositConfig.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CheckDepositConfig checkDepositConfig = (CheckDepositConfig) obj;
        checkDepositConfig.getClass();
        CheckDepositConfig.Image image = checkDepositConfig.image;
        CheckDepositConfig.Image image2 = image != null ? (CheckDepositConfig.Image) CheckDepositConfig.Image.ADAPTER.redact(image) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = checkDepositConfig.description;
        byteString.getClass();
        return new CheckDepositConfig(image2, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CheckDepositConfig checkDepositConfig = (CheckDepositConfig) obj;
        checkDepositConfig.getClass();
        CheckDepositConfig.Image.ADAPTER.encodeWithTag(protoWriter, 1, checkDepositConfig.image);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, checkDepositConfig.description);
        protoWriter.writeBytes(checkDepositConfig.unknownFields());
    }
}
