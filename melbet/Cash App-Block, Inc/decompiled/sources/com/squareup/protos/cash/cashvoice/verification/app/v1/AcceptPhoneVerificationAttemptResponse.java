package com.squareup.protos.cash.cashvoice.verification.app.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashface.api.Trust;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/cashvoice/verification/app/v1/AcceptPhoneVerificationAttemptResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/cashface/api/Trust$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AcceptPhoneVerificationAttemptResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AcceptPhoneVerificationAttemptResponse> CREATOR;
    public final String message;
    public final ResponseContext response_context;
    public final String title;
    public final PhoneVerificationAttemptState verification_state;

    static {
        AcceptPhoneVerificationAttemptResponse$Companion$ADAPTER$1 acceptPhoneVerificationAttemptResponse$Companion$ADAPTER$1 = new AcceptPhoneVerificationAttemptResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AcceptPhoneVerificationAttemptResponse.class), "type.googleapis.com/squareup.cash.cashvoice.verification.app.v1.AcceptPhoneVerificationAttemptResponse", Syntax.PROTO_2, null, "squareup/cash/cashvoice/verification/app/v1/app.proto");
        ADAPTER = acceptPhoneVerificationAttemptResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(acceptPhoneVerificationAttemptResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AcceptPhoneVerificationAttemptResponse(PhoneVerificationAttemptState phoneVerificationAttemptState, String str, String str2, ResponseContext responseContext, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.verification_state = phoneVerificationAttemptState;
        this.title = str;
        this.message = str2;
        this.response_context = responseContext;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AcceptPhoneVerificationAttemptResponse)) {
            return false;
        }
        AcceptPhoneVerificationAttemptResponse acceptPhoneVerificationAttemptResponse = (AcceptPhoneVerificationAttemptResponse) obj;
        return Intrinsics.areEqual(unknownFields(), acceptPhoneVerificationAttemptResponse.unknownFields()) && this.verification_state == acceptPhoneVerificationAttemptResponse.verification_state && Intrinsics.areEqual(this.title, acceptPhoneVerificationAttemptResponse.title) && Intrinsics.areEqual(this.message, acceptPhoneVerificationAttemptResponse.message) && Intrinsics.areEqual(this.response_context, acceptPhoneVerificationAttemptResponse.response_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        PhoneVerificationAttemptState phoneVerificationAttemptState = this.verification_state;
        int hashCode2 = (hashCode + (phoneVerificationAttemptState != null ? phoneVerificationAttemptState.hashCode() : 0)) * 37;
        String str = this.title;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.message;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        ResponseContext responseContext = this.response_context;
        int hashCode5 = hashCode4 + (responseContext != null ? responseContext.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Trust.Builder builder = new Trust.Builder(21, false);
        builder.icon = this.verification_state;
        builder.title = this.title;
        builder.enabled = this.message;
        builder.id = this.response_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        PhoneVerificationAttemptState phoneVerificationAttemptState = this.verification_state;
        if (phoneVerificationAttemptState != null) {
            arrayList.add("verification_state=" + phoneVerificationAttemptState);
        }
        String str = this.title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
        }
        String str2 = this.message;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "message=", arrayList);
        }
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AcceptPhoneVerificationAttemptResponse{", "}", 0, null, null, 56);
    }
}
