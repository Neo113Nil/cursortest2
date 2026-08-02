package com.squareup.protos.cash.fiatly.api.v2;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.grantly.api.LoanOption;
import com.squareup.protos.common.signing.SigningData;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetPaymentUpdatesBySessionRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetPaymentUpdatesBySessionRequest> CREATOR;
    public final String nearby_session_token;
    public final List nearby_session_tokens;
    public final SigningData signing_data_;

    static {
        GetPaymentUpdatesBySessionRequest$Companion$ADAPTER$1 getPaymentUpdatesBySessionRequest$Companion$ADAPTER$1 = new GetPaymentUpdatesBySessionRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetPaymentUpdatesBySessionRequest.class), "type.googleapis.com/squareup.cash.fiatly.api.v2beta.GetPaymentUpdatesBySessionRequest", Syntax.PROTO_2, null, "squareup/cash/fiatly/api/v2beta/p2p_real_time_service.proto");
        ADAPTER = getPaymentUpdatesBySessionRequest$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getPaymentUpdatesBySessionRequest$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetPaymentUpdatesBySessionRequest(String str, List list, SigningData signingData, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.nearby_session_token = str;
        this.signing_data_ = signingData;
        this.nearby_session_tokens = TransactorKt.immutableCopyOf("nearby_session_tokens", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetPaymentUpdatesBySessionRequest)) {
            return false;
        }
        GetPaymentUpdatesBySessionRequest getPaymentUpdatesBySessionRequest = (GetPaymentUpdatesBySessionRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getPaymentUpdatesBySessionRequest.unknownFields()) && Intrinsics.areEqual(this.nearby_session_token, getPaymentUpdatesBySessionRequest.nearby_session_token) && Intrinsics.areEqual(this.nearby_session_tokens, getPaymentUpdatesBySessionRequest.nearby_session_tokens) && Intrinsics.areEqual(this.signing_data_, getPaymentUpdatesBySessionRequest.signing_data_);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.nearby_session_token;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (str != null ? str.hashCode() : 0)) * 37, 37, this.nearby_session_tokens);
        SigningData signingData = this.signing_data_;
        int hashCode2 = m + (signingData != null ? signingData.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        LoanOption.Builder builder = new LoanOption.Builder(20);
        builder.loan_type = this.nearby_session_token;
        builder.payment_schedule = this.nearby_session_tokens;
        builder.tila_data = this.signing_data_;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.nearby_session_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "nearby_session_token=", arrayList);
        }
        List list = this.nearby_session_tokens;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("nearby_session_tokens=", arrayList, list);
        }
        SigningData signingData = this.signing_data_;
        if (signingData != null) {
            arrayList.add("signing_data_=" + signingData);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetPaymentUpdatesBySessionRequest{", "}", 0, null, null, 56);
    }
}
