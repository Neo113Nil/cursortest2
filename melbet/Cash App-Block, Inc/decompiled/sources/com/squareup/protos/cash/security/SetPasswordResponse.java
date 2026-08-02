package com.squareup.protos.cash.security;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.taply.app.v1.Allowed;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/security/SetPasswordResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/taply/app/v1/Allowed$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SetPasswordResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SetPasswordResponse> CREATOR;
    public final String password_error_message;
    public final String password_token;
    public final Long password_version;
    public final ResponseContext response_context;

    static {
        SetPasswordResponse$Companion$ADAPTER$1 setPasswordResponse$Companion$ADAPTER$1 = new SetPasswordResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SetPasswordResponse.class), "type.googleapis.com/squareup.cash.security.SetPasswordResponse", Syntax.PROTO_2, null, "squareup/cash/security/api.proto");
        ADAPTER = setPasswordResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(setPasswordResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetPasswordResponse(ResponseContext responseContext, String str, String str2, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response_context = responseContext;
        this.password_token = str;
        this.password_error_message = str2;
        this.password_version = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetPasswordResponse)) {
            return false;
        }
        SetPasswordResponse setPasswordResponse = (SetPasswordResponse) obj;
        return Intrinsics.areEqual(unknownFields(), setPasswordResponse.unknownFields()) && Intrinsics.areEqual(this.response_context, setPasswordResponse.response_context) && Intrinsics.areEqual(this.password_token, setPasswordResponse.password_token) && Intrinsics.areEqual(this.password_error_message, setPasswordResponse.password_error_message) && Intrinsics.areEqual(this.password_version, setPasswordResponse.password_version);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ResponseContext responseContext = this.response_context;
        int hashCode2 = (hashCode + (responseContext != null ? responseContext.hashCode() : 0)) * 37;
        String str = this.password_token;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.password_error_message;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Long l = this.password_version;
        int hashCode5 = hashCode4 + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Allowed.Builder builder = new Allowed.Builder(13);
        builder.card_encryption_data = this.response_context;
        builder.customer_token_hash_email = this.password_token;
        builder.device_metadata = this.password_error_message;
        builder.success_screen = this.password_version;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        if (this.password_token != null) {
            arrayList.add("password_token=██");
        }
        String str = this.password_error_message;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "password_error_message=", arrayList);
        }
        Long l = this.password_version;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("password_version=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SetPasswordResponse{", "}", 0, null, null, 56);
    }
}
