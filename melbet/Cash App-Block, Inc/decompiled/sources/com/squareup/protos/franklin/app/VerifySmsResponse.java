package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.bankbook.Institution;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.SignInType;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import okio.Path;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/protos/franklin/app/VerifySmsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/bankbook/Institution$Builder;", "Builder", "Status", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class VerifySmsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<VerifySmsResponse> CREATOR;
    public final ResponseContext response_context;
    public final SignInType sign_in_type;
    public final Status status;

    /* loaded from: classes.dex */
    public enum Status implements WireEnum {
        INVALID(0),
        SUCCESS(1),
        INVALID_SMS_NUMBER(2),
        INVALID_VERIFICATION_CODE(3),
        EXPIRED_VERIFICATION_CODE(4),
        TOO_MANY_FAILED_ATTEMPTS(5),
        NOT_ELIGIBLE(7);

        public static final VerifySmsResponse$Status$Companion$ADAPTER$1 ADAPTER;
        public static final Path.Companion Companion;
        public final int value;

        static {
            Status status = INVALID;
            Companion = new Path.Companion();
            ADAPTER = new VerifySmsResponse$Status$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Status.class), Syntax.PROTO_2, status);
        }

        Status(int i) {
            this.value = i;
        }

        public static final Status fromValue(int i) {
            Companion.getClass();
            return Path.Companion.m4348fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        VerifySmsResponse$Companion$ADAPTER$1 verifySmsResponse$Companion$ADAPTER$1 = new VerifySmsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(VerifySmsResponse.class), "type.googleapis.com/squareup.franklin.app.VerifySmsResponse", Syntax.PROTO_2, null, "squareup/franklin/app/sms.proto");
        ADAPTER = verifySmsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(verifySmsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifySmsResponse(ResponseContext responseContext, Status status, SignInType signInType, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response_context = responseContext;
        this.status = status;
        this.sign_in_type = signInType;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VerifySmsResponse)) {
            return false;
        }
        VerifySmsResponse verifySmsResponse = (VerifySmsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), verifySmsResponse.unknownFields()) && Intrinsics.areEqual(this.response_context, verifySmsResponse.response_context) && this.status == verifySmsResponse.status && this.sign_in_type == verifySmsResponse.sign_in_type;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ResponseContext responseContext = this.response_context;
        int hashCode2 = (hashCode + (responseContext != null ? responseContext.hashCode() : 0)) * 37;
        Status status = this.status;
        int hashCode3 = (hashCode2 + (status != null ? status.hashCode() : 0)) * 37;
        SignInType signInType = this.sign_in_type;
        int hashCode4 = hashCode3 + (signInType != null ? signInType.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Institution.Builder builder = new Institution.Builder(11, false);
        builder.institution_token = this.response_context;
        builder.display_info = this.status;
        builder.help_menu_items = this.sign_in_type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        Status status = this.status;
        if (status != null) {
            arrayList.add("status=" + status);
        }
        SignInType signInType = this.sign_in_type;
        if (signInType != null) {
            arrayList.add("sign_in_type=" + signInType);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "VerifySmsResponse{", "}", 0, null, null, 56);
    }
}
