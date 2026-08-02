package com.squareup.protos.cash.security.mri.api.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.security.mri.api.v1.ThreeDsSignals;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes.dex */
public final class ThreeDsSignals$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ThreeDsSignals((ThreeDsSignals.Status) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = ThreeDsSignals.Status.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(ThreeDsSdkWarning.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ThreeDsSignals threeDsSignals = (ThreeDsSignals) obj;
        reverseProtoWriter.getClass();
        threeDsSignals.getClass();
        reverseProtoWriter.writeBytes(threeDsSignals.unknownFields());
        ThreeDsSdkWarning.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, threeDsSignals.sdk_warnings);
        ThreeDsSignals.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 1, threeDsSignals.sdk_status);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ThreeDsSignals threeDsSignals = (ThreeDsSignals) obj;
        threeDsSignals.getClass();
        return ThreeDsSdkWarning.ADAPTER.asRepeated().encodedSizeWithTag(2, threeDsSignals.sdk_warnings) + ThreeDsSignals.Status.ADAPTER.encodedSizeWithTag(1, threeDsSignals.sdk_status) + threeDsSignals.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ThreeDsSignals threeDsSignals = (ThreeDsSignals) obj;
        threeDsSignals.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(threeDsSignals.sdk_warnings, ThreeDsSdkWarning.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        ThreeDsSignals.Status status = threeDsSignals.sdk_status;
        byteString.getClass();
        return new ThreeDsSignals(status, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ThreeDsSignals threeDsSignals = (ThreeDsSignals) obj;
        threeDsSignals.getClass();
        ThreeDsSignals.Status.ADAPTER.encodeWithTag(protoWriter, 1, threeDsSignals.sdk_status);
        ThreeDsSdkWarning.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, threeDsSignals.sdk_warnings);
        protoWriter.writeBytes(threeDsSignals.unknownFields());
    }
}
