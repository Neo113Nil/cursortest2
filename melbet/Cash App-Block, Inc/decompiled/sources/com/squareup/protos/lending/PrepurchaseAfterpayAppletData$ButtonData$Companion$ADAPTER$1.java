package com.squareup.protos.lending;

import com.google.android.gms.internal.mlkit_vision_face.zzje;
import com.squareup.protos.lending.PrepurchaseAfterpayAppletData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class PrepurchaseAfterpayAppletData$ButtonData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        zzje zzjeVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PrepurchaseAfterpayAppletData.ButtonData(zzjeVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    zzjeVar = new PrepurchaseAfterpayAppletData$ButtonData$State$UnknownState((PrepurchaseAfterpayAppletData.ButtonData.UnknownState) PrepurchaseAfterpayAppletData.ButtonData.UnknownState.ADAPTER.decode(protoReader));
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                zzjeVar = new PrepurchaseAfterpayAppletData$ButtonData$State$Loaded((PrepurchaseAfterpayAppletData.ButtonData.Content) PrepurchaseAfterpayAppletData.ButtonData.Content.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PrepurchaseAfterpayAppletData.ButtonData buttonData = (PrepurchaseAfterpayAppletData.ButtonData) obj;
        reverseProtoWriter.getClass();
        buttonData.getClass();
        reverseProtoWriter.writeBytes(buttonData.unknownFields());
        zzje zzjeVar = buttonData.state;
        if (zzjeVar instanceof PrepurchaseAfterpayAppletData$ButtonData$State$UnknownState) {
            PrepurchaseAfterpayAppletData.ButtonData.UnknownState.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((PrepurchaseAfterpayAppletData$ButtonData$State$UnknownState) zzjeVar).value);
        } else if (zzjeVar instanceof PrepurchaseAfterpayAppletData$ButtonData$State$Loaded) {
            PrepurchaseAfterpayAppletData.ButtonData.Content.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((PrepurchaseAfterpayAppletData$ButtonData$State$Loaded) zzjeVar).value);
        } else {
            if (zzjeVar == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        PrepurchaseAfterpayAppletData.ButtonData buttonData = (PrepurchaseAfterpayAppletData.ButtonData) obj;
        buttonData.getClass();
        int size$okio = buttonData.unknownFields().getSize$okio();
        zzje zzjeVar = buttonData.state;
        if (zzjeVar instanceof PrepurchaseAfterpayAppletData$ButtonData$State$UnknownState) {
            encodedSizeWithTag = PrepurchaseAfterpayAppletData.ButtonData.UnknownState.ADAPTER.encodedSizeWithTag(1, ((PrepurchaseAfterpayAppletData$ButtonData$State$UnknownState) zzjeVar).value);
        } else {
            if (!(zzjeVar instanceof PrepurchaseAfterpayAppletData$ButtonData$State$Loaded)) {
                if (zzjeVar == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = PrepurchaseAfterpayAppletData.ButtonData.Content.ADAPTER.encodedSizeWithTag(2, ((PrepurchaseAfterpayAppletData$ButtonData$State$Loaded) zzjeVar).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PrepurchaseAfterpayAppletData.ButtonData buttonData = (PrepurchaseAfterpayAppletData.ButtonData) obj;
        buttonData.getClass();
        ByteString byteString = ByteString.EMPTY;
        zzje zzjeVar = buttonData.state;
        byteString.getClass();
        return new PrepurchaseAfterpayAppletData.ButtonData(zzjeVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PrepurchaseAfterpayAppletData.ButtonData buttonData = (PrepurchaseAfterpayAppletData.ButtonData) obj;
        buttonData.getClass();
        zzje zzjeVar = buttonData.state;
        if (zzjeVar instanceof PrepurchaseAfterpayAppletData$ButtonData$State$UnknownState) {
            PrepurchaseAfterpayAppletData.ButtonData.UnknownState.ADAPTER.encodeWithTag(protoWriter, 1, ((PrepurchaseAfterpayAppletData$ButtonData$State$UnknownState) zzjeVar).value);
        } else if (zzjeVar instanceof PrepurchaseAfterpayAppletData$ButtonData$State$Loaded) {
            PrepurchaseAfterpayAppletData.ButtonData.Content.ADAPTER.encodeWithTag(protoWriter, 2, ((PrepurchaseAfterpayAppletData$ButtonData$State$Loaded) zzjeVar).value);
        } else if (zzjeVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(buttonData.unknownFields());
    }
}
