package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_face.zzdj;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.bankbook.Institution;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SubmitPayrollProviderSelectionRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SubmitPayrollProviderSelectionRequest> CREATOR;
    public final String query;
    public final RequestContext request_context;
    public final zzdj selection_result;

    static {
        SubmitPayrollProviderSelectionRequest$Companion$ADAPTER$1 submitPayrollProviderSelectionRequest$Companion$ADAPTER$1 = new SubmitPayrollProviderSelectionRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SubmitPayrollProviderSelectionRequest.class), "type.googleapis.com/squareup.franklin.app.SubmitPayrollProviderSelectionRequest", Syntax.PROTO_2, null, "squareup/franklin/app/payroll_provider_selection.proto");
        ADAPTER = submitPayrollProviderSelectionRequest$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(submitPayrollProviderSelectionRequest$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitPayrollProviderSelectionRequest(RequestContext requestContext, String str, zzdj zzdjVar, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.query = str;
        this.selection_result = zzdjVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SubmitPayrollProviderSelectionRequest)) {
            return false;
        }
        SubmitPayrollProviderSelectionRequest submitPayrollProviderSelectionRequest = (SubmitPayrollProviderSelectionRequest) obj;
        return Intrinsics.areEqual(unknownFields(), submitPayrollProviderSelectionRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, submitPayrollProviderSelectionRequest.request_context) && Intrinsics.areEqual(this.query, submitPayrollProviderSelectionRequest.query) && Intrinsics.areEqual(this.selection_result, submitPayrollProviderSelectionRequest.selection_result);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        String str = this.query;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        zzdj zzdjVar = this.selection_result;
        int hashCode4 = hashCode3 + (zzdjVar != null ? zzdjVar.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Institution.Builder builder = new Institution.Builder(9, false);
        builder.display_info = this.request_context;
        builder.institution_token = this.query;
        builder.help_menu_items = this.selection_result;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        if (this.query != null) {
            arrayList.add("query=██");
        }
        if (this.selection_result != null) {
            arrayList.add("selection_result=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SubmitPayrollProviderSelectionRequest{", "}", 0, null, null, 56);
    }
}
