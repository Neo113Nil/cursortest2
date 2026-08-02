package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzir;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalButton$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        zzir zzirVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalButton((String) obj, zzirVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                zzirVar = new LocalButton$Action$OpenUrl((String) ProtoAdapter.STRING.decode(protoReader));
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                zzirVar = new LocalButton$Action$NavigateToClientRoute((String) ProtoAdapter.STRING.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalButton localButton = (LocalButton) obj;
        reverseProtoWriter.getClass();
        localButton.getClass();
        reverseProtoWriter.writeBytes(localButton.unknownFields());
        zzir zzirVar = localButton.action;
        if (zzirVar instanceof LocalButton$Action$OpenUrl) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, ((LocalButton$Action$OpenUrl) zzirVar).value);
        } else if (zzirVar instanceof LocalButton$Action$NavigateToClientRoute) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 4, ((LocalButton$Action$NavigateToClientRoute) zzirVar).value);
        } else if (zzirVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, localButton.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalButton localButton = (LocalButton) obj;
        localButton.getClass();
        int size$okio = localButton.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, localButton.text) + size$okio;
        zzir zzirVar = localButton.action;
        if (zzirVar instanceof LocalButton$Action$OpenUrl) {
            return protoAdapter.encodedSizeWithTag(3, ((LocalButton$Action$OpenUrl) zzirVar).value) + encodedSizeWithTag;
        }
        if (zzirVar instanceof LocalButton$Action$NavigateToClientRoute) {
            return protoAdapter.encodedSizeWithTag(4, ((LocalButton$Action$NavigateToClientRoute) zzirVar).value) + encodedSizeWithTag;
        }
        if (zzirVar == null) {
            return encodedSizeWithTag;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalButton localButton = (LocalButton) obj;
        localButton.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = localButton.text;
        zzir zzirVar = localButton.action;
        byteString.getClass();
        return new LocalButton(str, zzirVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalButton localButton = (LocalButton) obj;
        localButton.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, localButton.text);
        zzir zzirVar = localButton.action;
        if (zzirVar instanceof LocalButton$Action$OpenUrl) {
            protoAdapter.encodeWithTag(protoWriter, 3, ((LocalButton$Action$OpenUrl) zzirVar).value);
        } else if (zzirVar instanceof LocalButton$Action$NavigateToClientRoute) {
            protoAdapter.encodeWithTag(protoWriter, 4, ((LocalButton$Action$NavigateToClientRoute) zzirVar).value);
        } else if (zzirVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(localButton.unknownFields());
    }
}
