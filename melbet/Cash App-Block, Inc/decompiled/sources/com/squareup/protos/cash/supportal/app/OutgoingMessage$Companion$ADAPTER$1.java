package com.squareup.protos.cash.supportal.app;

import com.google.android.gms.internal.mlkit_vision_common.zzln;
import com.squareup.protos.cash.supportal.app.OutgoingMessage;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class OutgoingMessage$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        zzln zzlnVar = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new OutgoingMessage((String) obj, zzlnVar, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                zzlnVar = new OutgoingMessage$Body$Text((OutgoingMessage.TextBody) OutgoingMessage.TextBody.ADAPTER.decode(protoReader));
            } else if (nextTag == 3) {
                zzlnVar = new OutgoingMessage$Body$File((OutgoingMessage.FileBody) OutgoingMessage.FileBody.ADAPTER.decode(protoReader));
            } else if (nextTag == 5) {
                zzlnVar = new OutgoingMessage$Body$SelectedReply((OutgoingMessage.SelectedReply) OutgoingMessage.SelectedReply.ADAPTER.decode(protoReader));
            } else if (nextTag == 6) {
                zzlnVar = new OutgoingMessage$Body$SelectedTransaction((OutgoingMessage.SelectedTransaction) OutgoingMessage.SelectedTransaction.ADAPTER.decode(protoReader));
            } else if (nextTag != 7) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        OutgoingMessage outgoingMessage = (OutgoingMessage) obj;
        reverseProtoWriter.getClass();
        outgoingMessage.getClass();
        reverseProtoWriter.writeBytes(outgoingMessage.unknownFields());
        zzln zzlnVar = outgoingMessage.body;
        if (zzlnVar instanceof OutgoingMessage$Body$Text) {
            OutgoingMessage.TextBody.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((OutgoingMessage$Body$Text) zzlnVar).value);
        } else if (zzlnVar instanceof OutgoingMessage$Body$File) {
            OutgoingMessage.FileBody.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((OutgoingMessage$Body$File) zzlnVar).value);
        } else if (zzlnVar instanceof OutgoingMessage$Body$SelectedReply) {
            OutgoingMessage.SelectedReply.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((OutgoingMessage$Body$SelectedReply) zzlnVar).value);
        } else if (zzlnVar instanceof OutgoingMessage$Body$SelectedTransaction) {
            OutgoingMessage.SelectedTransaction.ADAPTER.encodeWithTag(reverseProtoWriter, 6, ((OutgoingMessage$Body$SelectedTransaction) zzlnVar).value);
        } else if (zzlnVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, outgoingMessage.flow_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, outgoingMessage.idempotence_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        OutgoingMessage outgoingMessage = (OutgoingMessage) obj;
        outgoingMessage.getClass();
        int size$okio = outgoingMessage.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(1, outgoingMessage.idempotence_token) + size$okio;
        zzln zzlnVar = outgoingMessage.body;
        if (zzlnVar instanceof OutgoingMessage$Body$Text) {
            encodedSizeWithTag = OutgoingMessage.TextBody.ADAPTER.encodedSizeWithTag(2, ((OutgoingMessage$Body$Text) zzlnVar).value);
        } else if (zzlnVar instanceof OutgoingMessage$Body$File) {
            encodedSizeWithTag = OutgoingMessage.FileBody.ADAPTER.encodedSizeWithTag(3, ((OutgoingMessage$Body$File) zzlnVar).value);
        } else if (zzlnVar instanceof OutgoingMessage$Body$SelectedReply) {
            encodedSizeWithTag = OutgoingMessage.SelectedReply.ADAPTER.encodedSizeWithTag(5, ((OutgoingMessage$Body$SelectedReply) zzlnVar).value);
        } else {
            if (!(zzlnVar instanceof OutgoingMessage$Body$SelectedTransaction)) {
                if (zzlnVar != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                return protoAdapter.encodedSizeWithTag(7, outgoingMessage.flow_token) + encodedSizeWithTag2;
            }
            encodedSizeWithTag = OutgoingMessage.SelectedTransaction.ADAPTER.encodedSizeWithTag(6, ((OutgoingMessage$Body$SelectedTransaction) zzlnVar).value);
        }
        encodedSizeWithTag2 += encodedSizeWithTag;
        return protoAdapter.encodedSizeWithTag(7, outgoingMessage.flow_token) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        OutgoingMessage outgoingMessage = (OutgoingMessage) obj;
        outgoingMessage.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = outgoingMessage.idempotence_token;
        zzln zzlnVar = outgoingMessage.body;
        String str2 = outgoingMessage.flow_token;
        byteString.getClass();
        return new OutgoingMessage(str, zzlnVar, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OutgoingMessage outgoingMessage = (OutgoingMessage) obj;
        outgoingMessage.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, outgoingMessage.idempotence_token);
        protoAdapter.encodeWithTag(protoWriter, 7, outgoingMessage.flow_token);
        zzln zzlnVar = outgoingMessage.body;
        if (zzlnVar instanceof OutgoingMessage$Body$Text) {
            OutgoingMessage.TextBody.ADAPTER.encodeWithTag(protoWriter, 2, ((OutgoingMessage$Body$Text) zzlnVar).value);
        } else if (zzlnVar instanceof OutgoingMessage$Body$File) {
            OutgoingMessage.FileBody.ADAPTER.encodeWithTag(protoWriter, 3, ((OutgoingMessage$Body$File) zzlnVar).value);
        } else if (zzlnVar instanceof OutgoingMessage$Body$SelectedReply) {
            OutgoingMessage.SelectedReply.ADAPTER.encodeWithTag(protoWriter, 5, ((OutgoingMessage$Body$SelectedReply) zzlnVar).value);
        } else if (zzlnVar instanceof OutgoingMessage$Body$SelectedTransaction) {
            OutgoingMessage.SelectedTransaction.ADAPTER.encodeWithTag(protoWriter, 6, ((OutgoingMessage$Body$SelectedTransaction) zzlnVar).value);
        } else if (zzlnVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(outgoingMessage.unknownFields());
    }
}
