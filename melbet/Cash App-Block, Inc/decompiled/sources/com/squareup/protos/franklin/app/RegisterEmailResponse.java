package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.app.BankingConfig;
import com.squareup.protos.franklin.common.ResponseContext;
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
import okio.internal.ResourceFileSystem;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/protos/franklin/app/RegisterEmailResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/app/BankingConfig$Builder;", "Builder", "Status", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RegisterEmailResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RegisterEmailResponse> CREATOR;
    public final ResponseContext response_context;
    public final Status status;

    /* loaded from: classes.dex */
    public enum Status implements WireEnum {
        INVALID(0),
        SUCCESS(1),
        INVALID_EMAIL_ADDRESS(3),
        TOO_MANY_REQUESTS(4),
        DUPLICATE_EMAIL_ADDRESS(5),
        CUSTOMER_DOES_NOT_EXIST(6),
        INVALID_ENROLLMENT_TOKEN(7);

        public static final RegisterEmailResponse$Status$Companion$ADAPTER$1 ADAPTER;
        public static final ResourceFileSystem.Companion Companion;
        public final int value;

        static {
            Status status = INVALID;
            Companion = new ResourceFileSystem.Companion();
            ADAPTER = new RegisterEmailResponse$Status$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Status.class), Syntax.PROTO_2, status);
        }

        Status(int i) {
            this.value = i;
        }

        public static final Status fromValue(int i) {
            Companion.getClass();
            return ResourceFileSystem.Companion.m4355fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        RegisterEmailResponse$Companion$ADAPTER$1 registerEmailResponse$Companion$ADAPTER$1 = new RegisterEmailResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RegisterEmailResponse.class), "type.googleapis.com/squareup.franklin.app.RegisterEmailResponse", Syntax.PROTO_2, null, "squareup/franklin/app/email.proto");
        ADAPTER = registerEmailResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(registerEmailResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegisterEmailResponse(ResponseContext responseContext, Status status, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response_context = responseContext;
        this.status = status;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RegisterEmailResponse)) {
            return false;
        }
        RegisterEmailResponse registerEmailResponse = (RegisterEmailResponse) obj;
        return Intrinsics.areEqual(unknownFields(), registerEmailResponse.unknownFields()) && Intrinsics.areEqual(this.response_context, registerEmailResponse.response_context) && this.status == registerEmailResponse.status;
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
        int hashCode3 = hashCode2 + (status != null ? status.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BankingConfig.Builder builder = new BankingConfig.Builder(26);
        builder.strings = this.response_context;
        builder.recurring_deposits_dda_upsell = this.status;
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
        return CollectionsKt.joinToString$default(arrayList, ", ", "RegisterEmailResponse{", "}", 0, null, null, 56);
    }
}
