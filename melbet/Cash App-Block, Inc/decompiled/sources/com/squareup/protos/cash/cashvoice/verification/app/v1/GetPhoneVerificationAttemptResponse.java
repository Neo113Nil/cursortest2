package com.squareup.protos.cash.cashvoice.verification.app.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.groups.ExpenseSlice;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/cashvoice/verification/app/v1/GetPhoneVerificationAttemptResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/groups/ExpenseSlice$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetPhoneVerificationAttemptResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetPhoneVerificationAttemptResponse> CREATOR;
    public final String accept_button_title;
    public final String message;
    public final String reject_button_title;
    public final ResponseContext response_context;
    public final String title;
    public final PhoneVerificationAttemptState verification_state;

    static {
        GetPhoneVerificationAttemptResponse$Companion$ADAPTER$1 getPhoneVerificationAttemptResponse$Companion$ADAPTER$1 = new GetPhoneVerificationAttemptResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetPhoneVerificationAttemptResponse.class), "type.googleapis.com/squareup.cash.cashvoice.verification.app.v1.GetPhoneVerificationAttemptResponse", Syntax.PROTO_2, null, "squareup/cash/cashvoice/verification/app/v1/app.proto");
        ADAPTER = getPhoneVerificationAttemptResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getPhoneVerificationAttemptResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetPhoneVerificationAttemptResponse(PhoneVerificationAttemptState phoneVerificationAttemptState, String str, String str2, String str3, String str4, ResponseContext responseContext, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.verification_state = phoneVerificationAttemptState;
        this.title = str;
        this.message = str2;
        this.accept_button_title = str3;
        this.reject_button_title = str4;
        this.response_context = responseContext;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetPhoneVerificationAttemptResponse)) {
            return false;
        }
        GetPhoneVerificationAttemptResponse getPhoneVerificationAttemptResponse = (GetPhoneVerificationAttemptResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getPhoneVerificationAttemptResponse.unknownFields()) && this.verification_state == getPhoneVerificationAttemptResponse.verification_state && Intrinsics.areEqual(this.title, getPhoneVerificationAttemptResponse.title) && Intrinsics.areEqual(this.message, getPhoneVerificationAttemptResponse.message) && Intrinsics.areEqual(this.accept_button_title, getPhoneVerificationAttemptResponse.accept_button_title) && Intrinsics.areEqual(this.reject_button_title, getPhoneVerificationAttemptResponse.reject_button_title) && Intrinsics.areEqual(this.response_context, getPhoneVerificationAttemptResponse.response_context);
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
        String str3 = this.accept_button_title;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.reject_button_title;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
        ResponseContext responseContext = this.response_context;
        int hashCode7 = hashCode6 + (responseContext != null ? responseContext.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ExpenseSlice.Builder builder = new ExpenseSlice.Builder(3);
        builder.requester = this.verification_state;
        builder.slice_token = this.title;
        builder.responder = this.message;
        builder.amount = this.accept_button_title;
        builder.status = this.reject_button_title;
        builder.action = this.response_context;
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
        String str3 = this.accept_button_title;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "accept_button_title=", arrayList);
        }
        String str4 = this.reject_button_title;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "reject_button_title=", arrayList);
        }
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetPhoneVerificationAttemptResponse{", "}", 0, null, null, 56);
    }
}
