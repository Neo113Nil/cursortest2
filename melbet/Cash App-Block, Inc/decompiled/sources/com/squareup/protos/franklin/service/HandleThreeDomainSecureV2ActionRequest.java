package com.squareup.protos.franklin.service;

import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_face.zzed;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.ProfileAlias;
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
public final class HandleThreeDomainSecureV2ActionRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<HandleThreeDomainSecureV2ActionRequest> CREATOR;
    public final String action_details;
    public final RequestContext request_context;
    public final zzed result;
    public final String transaction_id;
    public final String transaction_type;

    static {
        HandleThreeDomainSecureV2ActionRequest$Companion$ADAPTER$1 handleThreeDomainSecureV2ActionRequest$Companion$ADAPTER$1 = new HandleThreeDomainSecureV2ActionRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(HandleThreeDomainSecureV2ActionRequest.class), "type.googleapis.com/squareup.franklin.rpc.HandleThreeDomainSecureV2ActionRequest", Syntax.PROTO_2, null, "squareup/franklin/rpc/handle_three_domain_secure_v2_action.proto");
        ADAPTER = handleThreeDomainSecureV2ActionRequest$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(handleThreeDomainSecureV2ActionRequest$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandleThreeDomainSecureV2ActionRequest(RequestContext requestContext, String str, String str2, String str3, zzed zzedVar, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.action_details = str;
        this.transaction_type = str2;
        this.transaction_id = str3;
        this.result = zzedVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HandleThreeDomainSecureV2ActionRequest)) {
            return false;
        }
        HandleThreeDomainSecureV2ActionRequest handleThreeDomainSecureV2ActionRequest = (HandleThreeDomainSecureV2ActionRequest) obj;
        return Intrinsics.areEqual(unknownFields(), handleThreeDomainSecureV2ActionRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, handleThreeDomainSecureV2ActionRequest.request_context) && Intrinsics.areEqual(this.action_details, handleThreeDomainSecureV2ActionRequest.action_details) && Intrinsics.areEqual(this.transaction_type, handleThreeDomainSecureV2ActionRequest.transaction_type) && Intrinsics.areEqual(this.transaction_id, handleThreeDomainSecureV2ActionRequest.transaction_id) && Intrinsics.areEqual(this.result, handleThreeDomainSecureV2ActionRequest.result);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        String str = this.action_details;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.transaction_type;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.transaction_id;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        zzed zzedVar = this.result;
        int hashCode6 = hashCode5 + (zzedVar != null ? zzedVar.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ProfileAlias.Builder builder = new ProfileAlias.Builder(20, false);
        builder.alias = this.request_context;
        builder.verified = this.action_details;
        builder.expires_at = this.transaction_type;
        builder.version = this.transaction_id;
        builder.display_date = this.result;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        String str = this.action_details;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "action_details=", arrayList);
        }
        String str2 = this.transaction_type;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "transaction_type=", arrayList);
        }
        String str3 = this.transaction_id;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "transaction_id=", arrayList);
        }
        zzed zzedVar = this.result;
        if (zzedVar != null) {
            arrayList.add("result=" + zzedVar);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "HandleThreeDomainSecureV2ActionRequest{", "}", 0, null, null, 56);
    }
}
