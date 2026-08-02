package com.squareup.protos.cash.grantly.api;

import com.android.volley.toolbox.HttpHeaderParser;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Action$OAuth$Metadata$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        HttpHeaderParser httpHeaderParser = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Action.OAuth.Metadata((Action.OAuth.Metadata.Type) obj, httpHeaderParser, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = Action.OAuth.Metadata.Type.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                httpHeaderParser = new Action$OAuth$Metadata$Metadata$FinancialDataSharing((Action.OAuth.Metadata.FinancialDataSharing) Action.OAuth.Metadata.FinancialDataSharing.ADAPTER.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                httpHeaderParser = new Action$OAuth$Metadata$Metadata$AgentConnection((Action.OAuth.Metadata.AgentConnection) Action.OAuth.Metadata.AgentConnection.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Action.OAuth.Metadata metadata = (Action.OAuth.Metadata) obj;
        reverseProtoWriter.getClass();
        metadata.getClass();
        reverseProtoWriter.writeBytes(metadata.unknownFields());
        HttpHeaderParser httpHeaderParser = metadata.metadata;
        if (httpHeaderParser instanceof Action$OAuth$Metadata$Metadata$FinancialDataSharing) {
            Action.OAuth.Metadata.FinancialDataSharing.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((Action$OAuth$Metadata$Metadata$FinancialDataSharing) httpHeaderParser).value);
        } else if (httpHeaderParser instanceof Action$OAuth$Metadata$Metadata$AgentConnection) {
            Action.OAuth.Metadata.AgentConnection.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((Action$OAuth$Metadata$Metadata$AgentConnection) httpHeaderParser).value);
        } else if (httpHeaderParser != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        Action.OAuth.Metadata.Type.ADAPTER.encodeWithTag(reverseProtoWriter, 1, metadata.f1269type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Action.OAuth.Metadata metadata = (Action.OAuth.Metadata) obj;
        metadata.getClass();
        int encodedSizeWithTag = Action.OAuth.Metadata.Type.ADAPTER.encodedSizeWithTag(1, metadata.f1269type) + metadata.unknownFields().getSize$okio();
        HttpHeaderParser httpHeaderParser = metadata.metadata;
        if (httpHeaderParser instanceof Action$OAuth$Metadata$Metadata$FinancialDataSharing) {
            return Action.OAuth.Metadata.FinancialDataSharing.ADAPTER.encodedSizeWithTag(2, ((Action$OAuth$Metadata$Metadata$FinancialDataSharing) httpHeaderParser).value) + encodedSizeWithTag;
        }
        if (httpHeaderParser instanceof Action$OAuth$Metadata$Metadata$AgentConnection) {
            return Action.OAuth.Metadata.AgentConnection.ADAPTER.encodedSizeWithTag(3, ((Action$OAuth$Metadata$Metadata$AgentConnection) httpHeaderParser).value) + encodedSizeWithTag;
        }
        if (httpHeaderParser == null) {
            return encodedSizeWithTag;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Action.OAuth.Metadata metadata = (Action.OAuth.Metadata) obj;
        metadata.getClass();
        ByteString byteString = ByteString.EMPTY;
        Action.OAuth.Metadata.Type type2 = metadata.f1269type;
        HttpHeaderParser httpHeaderParser = metadata.metadata;
        byteString.getClass();
        return new Action.OAuth.Metadata(type2, httpHeaderParser, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Action.OAuth.Metadata metadata = (Action.OAuth.Metadata) obj;
        metadata.getClass();
        Action.OAuth.Metadata.Type.ADAPTER.encodeWithTag(protoWriter, 1, metadata.f1269type);
        HttpHeaderParser httpHeaderParser = metadata.metadata;
        if (httpHeaderParser instanceof Action$OAuth$Metadata$Metadata$FinancialDataSharing) {
            Action.OAuth.Metadata.FinancialDataSharing.ADAPTER.encodeWithTag(protoWriter, 2, ((Action$OAuth$Metadata$Metadata$FinancialDataSharing) httpHeaderParser).value);
        } else if (httpHeaderParser instanceof Action$OAuth$Metadata$Metadata$AgentConnection) {
            Action.OAuth.Metadata.AgentConnection.ADAPTER.encodeWithTag(protoWriter, 3, ((Action$OAuth$Metadata$Metadata$AgentConnection) httpHeaderParser).value);
        } else if (httpHeaderParser != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(metadata.unknownFields());
    }
}
