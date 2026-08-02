package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.app.InAppBrowserConfig;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class InAppBrowserConfig$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InAppBrowserConfig((InAppBrowserConfig.FillrConfig) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(InAppBrowserConfig.FillrConfig.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InAppBrowserConfig inAppBrowserConfig = (InAppBrowserConfig) obj;
        reverseProtoWriter.getClass();
        inAppBrowserConfig.getClass();
        reverseProtoWriter.writeBytes(inAppBrowserConfig.unknownFields());
        InAppBrowserConfig.FillrConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 1, inAppBrowserConfig.fillr_config);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InAppBrowserConfig inAppBrowserConfig = (InAppBrowserConfig) obj;
        inAppBrowserConfig.getClass();
        return InAppBrowserConfig.FillrConfig.ADAPTER.encodedSizeWithTag(1, inAppBrowserConfig.fillr_config) + inAppBrowserConfig.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InAppBrowserConfig inAppBrowserConfig = (InAppBrowserConfig) obj;
        inAppBrowserConfig.getClass();
        InAppBrowserConfig.FillrConfig fillrConfig = inAppBrowserConfig.fillr_config;
        InAppBrowserConfig.FillrConfig fillrConfig2 = fillrConfig != null ? (InAppBrowserConfig.FillrConfig) InAppBrowserConfig.FillrConfig.ADAPTER.redact(fillrConfig) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new InAppBrowserConfig(fillrConfig2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InAppBrowserConfig inAppBrowserConfig = (InAppBrowserConfig) obj;
        inAppBrowserConfig.getClass();
        InAppBrowserConfig.FillrConfig.ADAPTER.encodeWithTag(protoWriter, 1, inAppBrowserConfig.fillr_config);
        protoWriter.writeBytes(inAppBrowserConfig.unknownFields());
    }
}
