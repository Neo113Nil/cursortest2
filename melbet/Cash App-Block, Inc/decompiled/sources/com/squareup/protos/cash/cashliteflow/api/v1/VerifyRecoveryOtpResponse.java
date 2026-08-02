package com.squareup.protos.cash.cashliteflow.api.v1;

import android.os.Parcelable;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/cashliteflow/api/v1/VerifyRecoveryOtpResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/cashface/api/Banner$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VerifyRecoveryOtpResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<VerifyRecoveryOtpResponse> CREATOR;
    public final String verification_token;

    static {
        VerifyRecoveryOtpResponse$Companion$ADAPTER$1 verifyRecoveryOtpResponse$Companion$ADAPTER$1 = new VerifyRecoveryOtpResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(VerifyRecoveryOtpResponse.class), "type.googleapis.com/squareup.cash.cashliteflow.api.v1beta1.VerifyRecoveryOtpResponse", Syntax.PROTO_2, null, "squareup/cash/cashliteflow/api/v1beta1/recovery.proto");
        ADAPTER = verifyRecoveryOtpResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(verifyRecoveryOtpResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyRecoveryOtpResponse(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.verification_token = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VerifyRecoveryOtpResponse)) {
            return false;
        }
        VerifyRecoveryOtpResponse verifyRecoveryOtpResponse = (VerifyRecoveryOtpResponse) obj;
        return Intrinsics.areEqual(unknownFields(), verifyRecoveryOtpResponse.unknownFields()) && Intrinsics.areEqual(this.verification_token, verifyRecoveryOtpResponse.verification_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.verification_token;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Banner.Builder builder = new Banner.Builder(11);
        builder.banner_color = this.verification_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.verification_token != null) {
            arrayList.add("verification_token=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "VerifyRecoveryOtpResponse{", "}", 0, null, null, 56);
    }
}
