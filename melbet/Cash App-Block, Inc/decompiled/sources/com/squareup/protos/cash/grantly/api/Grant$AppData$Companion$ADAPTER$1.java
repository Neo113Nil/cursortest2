package com.squareup.protos.cash.grantly.api;

import androidx.room.TransactorKt;
import com.android.volley.toolbox.NetworkUtility;
import com.squareup.protos.cash.grantly.api.Grant;
import com.squareup.protos.cash.orderly.app_data.InternallyCreatedOrder;
import com.squareup.protos.cash.pay.ManagedCustomerRequestFlowData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Grant$AppData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        NetworkUtility networkUtility = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
                Grant.AppData.Type type2 = (Grant.AppData.Type) obj;
                if (type2 != null) {
                    return new Grant.AppData(type2, networkUtility, (ByteString) obj2, endMessageAndGetUnknownFields);
                }
                TransactorKt.missingRequiredFields(obj, "type");
                throw null;
            }
            switch (nextTag) {
                case 1:
                    try {
                        obj = Grant.AppData.Type.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 2:
                    networkUtility = new Grant$AppData$AppData$MerbroPreauthorization((PreAuthorizePaymentResponse) PreAuthorizePaymentResponse.ADAPTER.decode(protoReader));
                    break;
                case 3:
                    networkUtility = new Grant$AppData$AppData$MerbroInTransactionTopUpFlowEndResult((InTransactionTopUpFlowEndResult) InTransactionTopUpFlowEndResult.ADAPTER.decode(protoReader));
                    break;
                case 4:
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
                case 5:
                    networkUtility = new Grant$AppData$AppData$InternallyCreatedOrder((InternallyCreatedOrder) InternallyCreatedOrder.ADAPTER.decode(protoReader));
                    break;
                case 6:
                    networkUtility = new Grant$AppData$AppData$SandboxMetadata((SandboxMetadata) SandboxMetadata.ADAPTER.decode(protoReader));
                    break;
                case 7:
                    networkUtility = new Grant$AppData$AppData$ManagedCustomerRequestFlowData((ManagedCustomerRequestFlowData) ManagedCustomerRequestFlowData.ADAPTER.decode(protoReader));
                    break;
                case 8:
                    networkUtility = new Grant$AppData$AppData$DynamicGrantApprovalMetadata((DynamicGrantApprovalMetadata) DynamicGrantApprovalMetadata.ADAPTER.decode(protoReader));
                    break;
                case 9:
                    networkUtility = new Grant$AppData$AppData$RiskMetadata((RiskMetadata) RiskMetadata.ADAPTER.decode(protoReader));
                    break;
                case 10:
                    obj2 = ProtoAdapter.BYTES.decode(protoReader);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Grant.AppData appData = (Grant.AppData) obj;
        reverseProtoWriter.getClass();
        appData.getClass();
        reverseProtoWriter.writeBytes(appData.unknownFields());
        NetworkUtility networkUtility = appData.app_data;
        if (networkUtility instanceof Grant$AppData$AppData$MerbroPreauthorization) {
            PreAuthorizePaymentResponse.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((Grant$AppData$AppData$MerbroPreauthorization) networkUtility).value);
        } else if (networkUtility instanceof Grant$AppData$AppData$MerbroInTransactionTopUpFlowEndResult) {
            InTransactionTopUpFlowEndResult.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((Grant$AppData$AppData$MerbroInTransactionTopUpFlowEndResult) networkUtility).value);
        } else if (networkUtility instanceof Grant$AppData$AppData$InternallyCreatedOrder) {
            InternallyCreatedOrder.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((Grant$AppData$AppData$InternallyCreatedOrder) networkUtility).value);
        } else if (networkUtility instanceof Grant$AppData$AppData$SandboxMetadata) {
            SandboxMetadata.ADAPTER.encodeWithTag(reverseProtoWriter, 6, ((Grant$AppData$AppData$SandboxMetadata) networkUtility).value);
        } else if (networkUtility instanceof Grant$AppData$AppData$ManagedCustomerRequestFlowData) {
            ManagedCustomerRequestFlowData.ADAPTER.encodeWithTag(reverseProtoWriter, 7, ((Grant$AppData$AppData$ManagedCustomerRequestFlowData) networkUtility).value);
        } else if (networkUtility instanceof Grant$AppData$AppData$DynamicGrantApprovalMetadata) {
            DynamicGrantApprovalMetadata.ADAPTER.encodeWithTag(reverseProtoWriter, 8, ((Grant$AppData$AppData$DynamicGrantApprovalMetadata) networkUtility).value);
        } else if (networkUtility instanceof Grant$AppData$AppData$RiskMetadata) {
            RiskMetadata.ADAPTER.encodeWithTag(reverseProtoWriter, 9, ((Grant$AppData$AppData$RiskMetadata) networkUtility).value);
        } else if (networkUtility != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter.BYTES.encodeWithTag(reverseProtoWriter, 10, appData.serialized_app_data);
        Grant.AppData.Type.ADAPTER.encodeWithTag(reverseProtoWriter, 1, appData.f1273type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        Grant.AppData appData = (Grant.AppData) obj;
        appData.getClass();
        int encodedSizeWithTag2 = Grant.AppData.Type.ADAPTER.encodedSizeWithTag(1, appData.f1273type) + appData.unknownFields().getSize$okio();
        NetworkUtility networkUtility = appData.app_data;
        if (networkUtility instanceof Grant$AppData$AppData$MerbroPreauthorization) {
            encodedSizeWithTag = PreAuthorizePaymentResponse.ADAPTER.encodedSizeWithTag(2, ((Grant$AppData$AppData$MerbroPreauthorization) networkUtility).value);
        } else if (networkUtility instanceof Grant$AppData$AppData$MerbroInTransactionTopUpFlowEndResult) {
            encodedSizeWithTag = InTransactionTopUpFlowEndResult.ADAPTER.encodedSizeWithTag(3, ((Grant$AppData$AppData$MerbroInTransactionTopUpFlowEndResult) networkUtility).value);
        } else if (networkUtility instanceof Grant$AppData$AppData$InternallyCreatedOrder) {
            encodedSizeWithTag = InternallyCreatedOrder.ADAPTER.encodedSizeWithTag(5, ((Grant$AppData$AppData$InternallyCreatedOrder) networkUtility).value);
        } else if (networkUtility instanceof Grant$AppData$AppData$SandboxMetadata) {
            encodedSizeWithTag = SandboxMetadata.ADAPTER.encodedSizeWithTag(6, ((Grant$AppData$AppData$SandboxMetadata) networkUtility).value);
        } else if (networkUtility instanceof Grant$AppData$AppData$ManagedCustomerRequestFlowData) {
            encodedSizeWithTag = ManagedCustomerRequestFlowData.ADAPTER.encodedSizeWithTag(7, ((Grant$AppData$AppData$ManagedCustomerRequestFlowData) networkUtility).value);
        } else if (networkUtility instanceof Grant$AppData$AppData$DynamicGrantApprovalMetadata) {
            encodedSizeWithTag = DynamicGrantApprovalMetadata.ADAPTER.encodedSizeWithTag(8, ((Grant$AppData$AppData$DynamicGrantApprovalMetadata) networkUtility).value);
        } else {
            if (!(networkUtility instanceof Grant$AppData$AppData$RiskMetadata)) {
                if (networkUtility != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                return ProtoAdapter.BYTES.encodedSizeWithTag(10, appData.serialized_app_data) + encodedSizeWithTag2;
            }
            encodedSizeWithTag = RiskMetadata.ADAPTER.encodedSizeWithTag(9, ((Grant$AppData$AppData$RiskMetadata) networkUtility).value);
        }
        encodedSizeWithTag2 += encodedSizeWithTag;
        return ProtoAdapter.BYTES.encodedSizeWithTag(10, appData.serialized_app_data) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Grant.AppData appData = (Grant.AppData) obj;
        appData.getClass();
        ByteString byteString = ByteString.EMPTY;
        Grant.AppData.Type type2 = appData.f1273type;
        NetworkUtility networkUtility = appData.app_data;
        ByteString byteString2 = appData.serialized_app_data;
        type2.getClass();
        byteString.getClass();
        return new Grant.AppData(type2, networkUtility, byteString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Grant.AppData appData = (Grant.AppData) obj;
        appData.getClass();
        Grant.AppData.Type.ADAPTER.encodeWithTag(protoWriter, 1, appData.f1273type);
        ProtoAdapter.BYTES.encodeWithTag(protoWriter, 10, appData.serialized_app_data);
        NetworkUtility networkUtility = appData.app_data;
        if (networkUtility instanceof Grant$AppData$AppData$MerbroPreauthorization) {
            PreAuthorizePaymentResponse.ADAPTER.encodeWithTag(protoWriter, 2, ((Grant$AppData$AppData$MerbroPreauthorization) networkUtility).value);
        } else if (networkUtility instanceof Grant$AppData$AppData$MerbroInTransactionTopUpFlowEndResult) {
            InTransactionTopUpFlowEndResult.ADAPTER.encodeWithTag(protoWriter, 3, ((Grant$AppData$AppData$MerbroInTransactionTopUpFlowEndResult) networkUtility).value);
        } else if (networkUtility instanceof Grant$AppData$AppData$InternallyCreatedOrder) {
            InternallyCreatedOrder.ADAPTER.encodeWithTag(protoWriter, 5, ((Grant$AppData$AppData$InternallyCreatedOrder) networkUtility).value);
        } else if (networkUtility instanceof Grant$AppData$AppData$SandboxMetadata) {
            SandboxMetadata.ADAPTER.encodeWithTag(protoWriter, 6, ((Grant$AppData$AppData$SandboxMetadata) networkUtility).value);
        } else if (networkUtility instanceof Grant$AppData$AppData$ManagedCustomerRequestFlowData) {
            ManagedCustomerRequestFlowData.ADAPTER.encodeWithTag(protoWriter, 7, ((Grant$AppData$AppData$ManagedCustomerRequestFlowData) networkUtility).value);
        } else if (networkUtility instanceof Grant$AppData$AppData$DynamicGrantApprovalMetadata) {
            DynamicGrantApprovalMetadata.ADAPTER.encodeWithTag(protoWriter, 8, ((Grant$AppData$AppData$DynamicGrantApprovalMetadata) networkUtility).value);
        } else if (networkUtility instanceof Grant$AppData$AppData$RiskMetadata) {
            RiskMetadata.ADAPTER.encodeWithTag(protoWriter, 9, ((Grant$AppData$AppData$RiskMetadata) networkUtility).value);
        } else if (networkUtility != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(appData.unknownFields());
    }
}
