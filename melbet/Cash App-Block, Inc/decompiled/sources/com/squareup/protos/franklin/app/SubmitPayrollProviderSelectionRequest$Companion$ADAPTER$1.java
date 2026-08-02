package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.google.android.gms.internal.mlkit_vision_face.zzdj;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.payrollconnector.common.PayrollProvider;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SubmitPayrollProviderSelectionRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        zzdj zzdjVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SubmitPayrollProviderSelectionRequest((RequestContext) obj, (String) obj2, zzdjVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                zzdjVar = new SubmitPayrollProviderSelectionRequest$SelectionResult$SelectedPayrollProvider((PayrollProvider) PayrollProvider.ADAPTER.decode(protoReader));
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                zzdjVar = new SubmitPayrollProviderSelectionRequest$SelectionResult$SelectedFallbackResult(((Boolean) ProtoAdapter.BOOL.decode(protoReader)).booleanValue());
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SubmitPayrollProviderSelectionRequest submitPayrollProviderSelectionRequest = (SubmitPayrollProviderSelectionRequest) obj;
        reverseProtoWriter.getClass();
        submitPayrollProviderSelectionRequest.getClass();
        reverseProtoWriter.writeBytes(submitPayrollProviderSelectionRequest.unknownFields());
        zzdj zzdjVar = submitPayrollProviderSelectionRequest.selection_result;
        if (zzdjVar instanceof SubmitPayrollProviderSelectionRequest$SelectionResult$SelectedPayrollProvider) {
            PayrollProvider.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((SubmitPayrollProviderSelectionRequest$SelectionResult$SelectedPayrollProvider) zzdjVar).value);
        } else if (zzdjVar instanceof SubmitPayrollProviderSelectionRequest$SelectionResult$SelectedFallbackResult) {
            ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 4, Boolean.valueOf(((SubmitPayrollProviderSelectionRequest$SelectionResult$SelectedFallbackResult) zzdjVar).value));
        } else if (zzdjVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, submitPayrollProviderSelectionRequest.query);
        RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, submitPayrollProviderSelectionRequest.request_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SubmitPayrollProviderSelectionRequest submitPayrollProviderSelectionRequest = (SubmitPayrollProviderSelectionRequest) obj;
        submitPayrollProviderSelectionRequest.getClass();
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(2, submitPayrollProviderSelectionRequest.query) + RequestContext.ADAPTER.encodedSizeWithTag(1, submitPayrollProviderSelectionRequest.request_context) + submitPayrollProviderSelectionRequest.unknownFields().getSize$okio();
        zzdj zzdjVar = submitPayrollProviderSelectionRequest.selection_result;
        if (zzdjVar instanceof SubmitPayrollProviderSelectionRequest$SelectionResult$SelectedPayrollProvider) {
            return PayrollProvider.ADAPTER.encodedSizeWithTag(3, ((SubmitPayrollProviderSelectionRequest$SelectionResult$SelectedPayrollProvider) zzdjVar).value) + encodedSizeWithTag;
        }
        if (zzdjVar instanceof SubmitPayrollProviderSelectionRequest$SelectionResult$SelectedFallbackResult) {
            return SizeMode$EnumUnboxingLocalUtility.m(((SubmitPayrollProviderSelectionRequest$SelectionResult$SelectedFallbackResult) zzdjVar).value, ProtoAdapter.BOOL, 4, encodedSizeWithTag);
        }
        if (zzdjVar == null) {
            return encodedSizeWithTag;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SubmitPayrollProviderSelectionRequest submitPayrollProviderSelectionRequest = (SubmitPayrollProviderSelectionRequest) obj;
        submitPayrollProviderSelectionRequest.getClass();
        RequestContext requestContext = submitPayrollProviderSelectionRequest.request_context;
        RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SubmitPayrollProviderSelectionRequest(requestContext2, null, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SubmitPayrollProviderSelectionRequest submitPayrollProviderSelectionRequest = (SubmitPayrollProviderSelectionRequest) obj;
        submitPayrollProviderSelectionRequest.getClass();
        RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, submitPayrollProviderSelectionRequest.request_context);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, submitPayrollProviderSelectionRequest.query);
        zzdj zzdjVar = submitPayrollProviderSelectionRequest.selection_result;
        if (zzdjVar instanceof SubmitPayrollProviderSelectionRequest$SelectionResult$SelectedPayrollProvider) {
            PayrollProvider.ADAPTER.encodeWithTag(protoWriter, 3, ((SubmitPayrollProviderSelectionRequest$SelectionResult$SelectedPayrollProvider) zzdjVar).value);
        } else if (zzdjVar instanceof SubmitPayrollProviderSelectionRequest$SelectionResult$SelectedFallbackResult) {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, Boolean.valueOf(((SubmitPayrollProviderSelectionRequest$SelectionResult$SelectedFallbackResult) zzdjVar).value));
        } else if (zzdjVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(submitPayrollProviderSelectionRequest.unknownFields());
    }
}
