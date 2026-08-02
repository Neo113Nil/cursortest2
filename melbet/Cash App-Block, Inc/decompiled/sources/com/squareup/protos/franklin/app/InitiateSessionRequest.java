package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.document.Document;
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

/* loaded from: classes.dex */
public final class InitiateSessionRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InitiateSessionRequest> CREATOR;
    public final String backup_tag;
    public final ClientSecurityContext client_security_context;
    public final ByteString device_check_token;
    public final String device_locale_country;
    public final String device_locales;
    public final RequestContext request_context;

    static {
        InitiateSessionRequest$Companion$ADAPTER$1 initiateSessionRequest$Companion$ADAPTER$1 = new InitiateSessionRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InitiateSessionRequest.class), "type.googleapis.com/squareup.franklin.app.InitiateSessionRequest", Syntax.PROTO_2, null, "squareup/franklin/app/initiateSession.proto");
        ADAPTER = initiateSessionRequest$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(initiateSessionRequest$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitiateSessionRequest(ByteString byteString, String str, ClientSecurityContext clientSecurityContext, String str2, String str3, RequestContext requestContext, ByteString byteString2) {
        super(ADAPTER, byteString2);
        byteString2.getClass();
        this.device_check_token = byteString;
        this.backup_tag = str;
        this.client_security_context = clientSecurityContext;
        this.device_locales = str2;
        this.device_locale_country = str3;
        this.request_context = requestContext;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InitiateSessionRequest)) {
            return false;
        }
        InitiateSessionRequest initiateSessionRequest = (InitiateSessionRequest) obj;
        return Intrinsics.areEqual(unknownFields(), initiateSessionRequest.unknownFields()) && Intrinsics.areEqual(this.device_check_token, initiateSessionRequest.device_check_token) && Intrinsics.areEqual(this.backup_tag, initiateSessionRequest.backup_tag) && Intrinsics.areEqual(this.client_security_context, initiateSessionRequest.client_security_context) && Intrinsics.areEqual(this.device_locales, initiateSessionRequest.device_locales) && Intrinsics.areEqual(this.device_locale_country, initiateSessionRequest.device_locale_country) && Intrinsics.areEqual(this.request_context, initiateSessionRequest.request_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ByteString byteString = this.device_check_token;
        int hashCode2 = (hashCode + (byteString != null ? byteString.hashCode() : 0)) * 37;
        String str = this.backup_tag;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        ClientSecurityContext clientSecurityContext = this.client_security_context;
        int hashCode4 = (hashCode3 + (clientSecurityContext != null ? clientSecurityContext.hashCode() : 0)) * 37;
        String str2 = this.device_locales;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.device_locale_country;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 37;
        RequestContext requestContext = this.request_context;
        int hashCode7 = hashCode6 + (requestContext != null ? requestContext.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Document.Builder builder = new Document.Builder(14, false);
        builder.url = this.device_check_token;
        builder.category = this.backup_tag;
        builder.owner_token = this.client_security_context;
        builder.token = this.device_locales;
        builder.title = this.device_locale_country;
        builder.document_date = this.request_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.device_check_token != null) {
            arrayList.add("device_check_token=██");
        }
        if (this.backup_tag != null) {
            arrayList.add("backup_tag=██");
        }
        ClientSecurityContext clientSecurityContext = this.client_security_context;
        if (clientSecurityContext != null) {
            arrayList.add("client_security_context=" + clientSecurityContext);
        }
        String str = this.device_locales;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "device_locales=", arrayList);
        }
        String str2 = this.device_locale_country;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "device_locale_country=", arrayList);
        }
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InitiateSessionRequest{", "}", 0, null, null, 56);
    }
}
