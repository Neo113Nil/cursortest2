package com.squareup.protos.cash.taply.app.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.api.FidesmoProvisioningBlocker;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class GetCustomerDetailsForDeprovisioningResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetCustomerDetailsForDeprovisioningResponse((String) obj, (FidesmoProvisioningBlocker.PreScanUiConfig) obj2, (FidesmoProvisioningBlocker.ErrorUiConfigs) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(FidesmoProvisioningBlocker.PreScanUiConfig.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(FidesmoProvisioningBlocker.ErrorUiConfigs.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetCustomerDetailsForDeprovisioningResponse getCustomerDetailsForDeprovisioningResponse = (GetCustomerDetailsForDeprovisioningResponse) obj;
        reverseProtoWriter.getClass();
        getCustomerDetailsForDeprovisioningResponse.getClass();
        reverseProtoWriter.writeBytes(getCustomerDetailsForDeprovisioningResponse.unknownFields());
        FidesmoProvisioningBlocker.ErrorUiConfigs.ADAPTER.encodeWithTag(reverseProtoWriter, 3, getCustomerDetailsForDeprovisioningResponse.reset_errors);
        FidesmoProvisioningBlocker.PreScanUiConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 2, getCustomerDetailsForDeprovisioningResponse.pre_scan);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, getCustomerDetailsForDeprovisioningResponse.customer_token_hash_email);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetCustomerDetailsForDeprovisioningResponse getCustomerDetailsForDeprovisioningResponse = (GetCustomerDetailsForDeprovisioningResponse) obj;
        getCustomerDetailsForDeprovisioningResponse.getClass();
        return FidesmoProvisioningBlocker.ErrorUiConfigs.ADAPTER.encodedSizeWithTag(3, getCustomerDetailsForDeprovisioningResponse.reset_errors) + FidesmoProvisioningBlocker.PreScanUiConfig.ADAPTER.encodedSizeWithTag(2, getCustomerDetailsForDeprovisioningResponse.pre_scan) + ProtoAdapter.STRING.encodedSizeWithTag(1, getCustomerDetailsForDeprovisioningResponse.customer_token_hash_email) + getCustomerDetailsForDeprovisioningResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetCustomerDetailsForDeprovisioningResponse getCustomerDetailsForDeprovisioningResponse = (GetCustomerDetailsForDeprovisioningResponse) obj;
        getCustomerDetailsForDeprovisioningResponse.getClass();
        FidesmoProvisioningBlocker.PreScanUiConfig preScanUiConfig = getCustomerDetailsForDeprovisioningResponse.pre_scan;
        FidesmoProvisioningBlocker.PreScanUiConfig preScanUiConfig2 = preScanUiConfig != null ? (FidesmoProvisioningBlocker.PreScanUiConfig) FidesmoProvisioningBlocker.PreScanUiConfig.ADAPTER.redact(preScanUiConfig) : null;
        FidesmoProvisioningBlocker.ErrorUiConfigs errorUiConfigs = getCustomerDetailsForDeprovisioningResponse.reset_errors;
        FidesmoProvisioningBlocker.ErrorUiConfigs errorUiConfigs2 = errorUiConfigs != null ? (FidesmoProvisioningBlocker.ErrorUiConfigs) FidesmoProvisioningBlocker.ErrorUiConfigs.ADAPTER.redact(errorUiConfigs) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetCustomerDetailsForDeprovisioningResponse(null, preScanUiConfig2, errorUiConfigs2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetCustomerDetailsForDeprovisioningResponse getCustomerDetailsForDeprovisioningResponse = (GetCustomerDetailsForDeprovisioningResponse) obj;
        getCustomerDetailsForDeprovisioningResponse.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getCustomerDetailsForDeprovisioningResponse.customer_token_hash_email);
        FidesmoProvisioningBlocker.PreScanUiConfig.ADAPTER.encodeWithTag(protoWriter, 2, getCustomerDetailsForDeprovisioningResponse.pre_scan);
        FidesmoProvisioningBlocker.ErrorUiConfigs.ADAPTER.encodeWithTag(protoWriter, 3, getCustomerDetailsForDeprovisioningResponse.reset_errors);
        protoWriter.writeBytes(getCustomerDetailsForDeprovisioningResponse.unknownFields());
    }
}
