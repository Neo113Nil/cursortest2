package com.squareup.protos.cash.supportal.app;

import com.google.android.gms.internal.mlkit_vision_common.zzlq;
import com.squareup.protos.cash.supportal.app.SupportPhoneStatusResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SupportPhoneStatusResponse$Granted$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        zzlq zzlqVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SupportPhoneStatusResponse.Granted(zzlqVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                zzlqVar = new SupportPhoneStatusResponse$Granted$State$Idle((SupportPhoneStatusResponse.Idle) SupportPhoneStatusResponse.Idle.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                zzlqVar = new SupportPhoneStatusResponse$Granted$State$Active((SupportPhoneStatusResponse.Active) SupportPhoneStatusResponse.Active.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SupportPhoneStatusResponse.Granted granted = (SupportPhoneStatusResponse.Granted) obj;
        reverseProtoWriter.getClass();
        granted.getClass();
        reverseProtoWriter.writeBytes(granted.unknownFields());
        zzlq zzlqVar = granted.state;
        if (zzlqVar instanceof SupportPhoneStatusResponse$Granted$State$Idle) {
            SupportPhoneStatusResponse.Idle.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((SupportPhoneStatusResponse$Granted$State$Idle) zzlqVar).value);
        } else if (zzlqVar instanceof SupportPhoneStatusResponse$Granted$State$Active) {
            SupportPhoneStatusResponse.Active.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((SupportPhoneStatusResponse$Granted$State$Active) zzlqVar).value);
        } else {
            if (zzlqVar == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        SupportPhoneStatusResponse.Granted granted = (SupportPhoneStatusResponse.Granted) obj;
        granted.getClass();
        int size$okio = granted.unknownFields().getSize$okio();
        zzlq zzlqVar = granted.state;
        if (zzlqVar instanceof SupportPhoneStatusResponse$Granted$State$Idle) {
            encodedSizeWithTag = SupportPhoneStatusResponse.Idle.ADAPTER.encodedSizeWithTag(1, ((SupportPhoneStatusResponse$Granted$State$Idle) zzlqVar).value);
        } else {
            if (!(zzlqVar instanceof SupportPhoneStatusResponse$Granted$State$Active)) {
                if (zzlqVar == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = SupportPhoneStatusResponse.Active.ADAPTER.encodedSizeWithTag(2, ((SupportPhoneStatusResponse$Granted$State$Active) zzlqVar).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SupportPhoneStatusResponse.Granted granted = (SupportPhoneStatusResponse.Granted) obj;
        granted.getClass();
        ByteString byteString = ByteString.EMPTY;
        zzlq zzlqVar = granted.state;
        byteString.getClass();
        return new SupportPhoneStatusResponse.Granted(zzlqVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SupportPhoneStatusResponse.Granted granted = (SupportPhoneStatusResponse.Granted) obj;
        granted.getClass();
        zzlq zzlqVar = granted.state;
        if (zzlqVar instanceof SupportPhoneStatusResponse$Granted$State$Idle) {
            SupportPhoneStatusResponse.Idle.ADAPTER.encodeWithTag(protoWriter, 1, ((SupportPhoneStatusResponse$Granted$State$Idle) zzlqVar).value);
        } else if (zzlqVar instanceof SupportPhoneStatusResponse$Granted$State$Active) {
            SupportPhoneStatusResponse.Active.ADAPTER.encodeWithTag(protoWriter, 2, ((SupportPhoneStatusResponse$Granted$State$Active) zzlqVar).value);
        } else if (zzlqVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(granted.unknownFields());
    }
}
