package com.squareup.protos.cash.taply.app.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.taply.app.v1.Denied;
import com.squareup.protos.franklin.api.FidesmoProvisioningBlocker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class Denied$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Denied((Denied.Reason) obj, (FidesmoProvisioningBlocker.ErrorUiConfig) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = Denied.Reason.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(FidesmoProvisioningBlocker.ErrorUiConfig.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Denied denied = (Denied) obj;
        reverseProtoWriter.getClass();
        denied.getClass();
        reverseProtoWriter.writeBytes(denied.unknownFields());
        FidesmoProvisioningBlocker.ErrorUiConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 2, denied.error_ui_config);
        Denied.Reason.ADAPTER.encodeWithTag(reverseProtoWriter, 1, denied.reason);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Denied denied = (Denied) obj;
        denied.getClass();
        return FidesmoProvisioningBlocker.ErrorUiConfig.ADAPTER.encodedSizeWithTag(2, denied.error_ui_config) + Denied.Reason.ADAPTER.encodedSizeWithTag(1, denied.reason) + denied.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Denied denied = (Denied) obj;
        denied.getClass();
        FidesmoProvisioningBlocker.ErrorUiConfig errorUiConfig = denied.error_ui_config;
        FidesmoProvisioningBlocker.ErrorUiConfig errorUiConfig2 = errorUiConfig != null ? (FidesmoProvisioningBlocker.ErrorUiConfig) FidesmoProvisioningBlocker.ErrorUiConfig.ADAPTER.redact(errorUiConfig) : null;
        ByteString byteString = ByteString.EMPTY;
        Denied.Reason reason = denied.reason;
        byteString.getClass();
        return new Denied(reason, errorUiConfig2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Denied denied = (Denied) obj;
        denied.getClass();
        Denied.Reason.ADAPTER.encodeWithTag(protoWriter, 1, denied.reason);
        FidesmoProvisioningBlocker.ErrorUiConfig.ADAPTER.encodeWithTag(protoWriter, 2, denied.error_ui_config);
        protoWriter.writeBytes(denied.unknownFields());
    }
}
