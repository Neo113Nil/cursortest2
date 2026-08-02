package com.squareup.protos.franklin.service;

import android.os.Parcelable;
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
public final class HandleThreeDomainSecureRedirectRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<HandleThreeDomainSecureRedirectRequest> CREATOR;
    public final String redirect_url;
    public final RequestContext request_context;
    public final String security_code;
    public final String transaction_id;
    public final String transaction_type;

    static {
        HandleThreeDomainSecureRedirectRequest$Companion$ADAPTER$1 handleThreeDomainSecureRedirectRequest$Companion$ADAPTER$1 = new HandleThreeDomainSecureRedirectRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(HandleThreeDomainSecureRedirectRequest.class), "type.googleapis.com/squareup.franklin.rpc.HandleThreeDomainSecureRedirectRequest", Syntax.PROTO_2, null, "squareup/franklin/rpc/handle_three_domain_secure_redirect.proto");
        ADAPTER = handleThreeDomainSecureRedirectRequest$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(handleThreeDomainSecureRedirectRequest$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandleThreeDomainSecureRedirectRequest(RequestContext requestContext, String str, String str2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.redirect_url = str;
        this.transaction_type = str2;
        this.transaction_id = str3;
        this.security_code = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HandleThreeDomainSecureRedirectRequest)) {
            return false;
        }
        HandleThreeDomainSecureRedirectRequest handleThreeDomainSecureRedirectRequest = (HandleThreeDomainSecureRedirectRequest) obj;
        return Intrinsics.areEqual(unknownFields(), handleThreeDomainSecureRedirectRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, handleThreeDomainSecureRedirectRequest.request_context) && Intrinsics.areEqual(this.redirect_url, handleThreeDomainSecureRedirectRequest.redirect_url) && Intrinsics.areEqual(this.transaction_type, handleThreeDomainSecureRedirectRequest.transaction_type) && Intrinsics.areEqual(this.transaction_id, handleThreeDomainSecureRedirectRequest.transaction_id) && Intrinsics.areEqual(this.security_code, handleThreeDomainSecureRedirectRequest.security_code);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        String str = this.redirect_url;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.transaction_type;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.transaction_id;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.security_code;
        int hashCode6 = hashCode5 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ProfileAlias.Builder builder = new ProfileAlias.Builder(19, false);
        builder.alias = this.request_context;
        builder.verified = this.redirect_url;
        builder.expires_at = this.transaction_type;
        builder.version = this.transaction_id;
        builder.display_date = this.security_code;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        String str = this.redirect_url;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "redirect_url=", arrayList);
        }
        String str2 = this.transaction_type;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "transaction_type=", arrayList);
        }
        String str3 = this.transaction_id;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "transaction_id=", arrayList);
        }
        if (this.security_code != null) {
            arrayList.add("security_code=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "HandleThreeDomainSecureRedirectRequest{", "}", 0, null, null, 56);
    }
}
