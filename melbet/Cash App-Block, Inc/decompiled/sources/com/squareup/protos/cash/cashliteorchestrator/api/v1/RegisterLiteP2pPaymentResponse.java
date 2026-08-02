package com.squareup.protos.cash.cashliteorchestrator.api.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashface.api.Banner;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/RegisterLiteP2pPaymentResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/cashface/api/Banner$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RegisterLiteP2pPaymentResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RegisterLiteP2pPaymentResponse> CREATOR;
    public final String operation_token;

    static {
        RegisterLiteP2pPaymentResponse$Companion$ADAPTER$1 registerLiteP2pPaymentResponse$Companion$ADAPTER$1 = new RegisterLiteP2pPaymentResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RegisterLiteP2pPaymentResponse.class), "type.googleapis.com/squareup.cash.cashliteorchestrator.api.v1beta1.RegisterLiteP2pPaymentResponse", Syntax.PROTO_2, null, "squareup/cash/cashliteorchestrator/api/v1beta1/orchestrator.proto");
        ADAPTER = registerLiteP2pPaymentResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(registerLiteP2pPaymentResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegisterLiteP2pPaymentResponse(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.operation_token = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RegisterLiteP2pPaymentResponse)) {
            return false;
        }
        RegisterLiteP2pPaymentResponse registerLiteP2pPaymentResponse = (RegisterLiteP2pPaymentResponse) obj;
        return Intrinsics.areEqual(unknownFields(), registerLiteP2pPaymentResponse.unknownFields()) && Intrinsics.areEqual(this.operation_token, registerLiteP2pPaymentResponse.operation_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.operation_token;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Banner.Builder builder = new Banner.Builder(12);
        builder.banner_color = this.operation_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.operation_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "operation_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RegisterLiteP2pPaymentResponse{", "}", 0, null, null, 56);
    }
}
