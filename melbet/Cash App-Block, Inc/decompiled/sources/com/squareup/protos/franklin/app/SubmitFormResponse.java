package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.lending.BorrowHomeBenefitRouteOpenedResponse;
import com.squareup.protos.franklin.lending.BulletinInteractionResponse;
import com.squareup.protos.franklin.lending.EntryPointTappedResponse;
import com.squareup.protos.franklin.lending.InitiateLoanPaymentResponse;
import com.squareup.protos.franklin.lending.InitiateLoanResponse;
import com.squareup.protos.franklin.lending.SkipLoanPaymentResponse;
import com.squareup.protos.franklin.persona.ResolvePersonaDidvBlockerResponse;
import com.squareup.protos.investnotifications.api.UpdateNotificationSettingsResponse;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/franklin/app/SubmitFormResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/app/SubmitFormResponse$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SubmitFormResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SubmitFormResponse> CREATOR;
    public final ResponseContext response_context;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public ResponseContext response_context;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new SubmitFormResponse(this.response_context, buildUnknownFields());
                case 1:
                    return new SelectTransferOptionResponse(this.response_context, buildUnknownFields());
                case 2:
                    return new SendTaxFormEmailResponse(this.response_context, buildUnknownFields());
                case 3:
                    return new SetAppMessagePreferenceResponse(this.response_context, buildUnknownFields());
                case 4:
                    return new SetBitcoinDisplayPreferenceResponse(this.response_context, buildUnknownFields());
                case 5:
                    return new SetScheduledTransactionPreferenceResponse(this.response_context, buildUnknownFields());
                case 6:
                    return new SubmitFilesetResponse(this.response_context, buildUnknownFields());
                case 7:
                    return new UnlinkBusinessResponse(this.response_context, buildUnknownFields());
                case 8:
                    return new UnlockRewardResponse(this.response_context, buildUnknownFields());
                case 9:
                    return new UploadFileResponse(this.response_context, buildUnknownFields());
                case 10:
                    return new BorrowHomeBenefitRouteOpenedResponse(this.response_context, buildUnknownFields());
                case 11:
                    return new BulletinInteractionResponse(this.response_context, buildUnknownFields());
                case 12:
                    return new EntryPointTappedResponse(this.response_context, buildUnknownFields());
                case 13:
                    return new InitiateLoanPaymentResponse(this.response_context, buildUnknownFields());
                case 14:
                    return new InitiateLoanResponse(this.response_context, buildUnknownFields());
                case 15:
                    return new SkipLoanPaymentResponse(this.response_context, buildUnknownFields());
                case 16:
                    return new ResolvePersonaDidvBlockerResponse(this.response_context, buildUnknownFields());
                default:
                    return new UpdateNotificationSettingsResponse(this.response_context, buildUnknownFields());
            }
        }
    }

    static {
        SubmitFormResponse$Companion$ADAPTER$1 submitFormResponse$Companion$ADAPTER$1 = new SubmitFormResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SubmitFormResponse.class), "type.googleapis.com/squareup.franklin.app.SubmitFormResponse", Syntax.PROTO_2, null, "squareup/franklin/app/submit_form.proto");
        ADAPTER = submitFormResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(submitFormResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitFormResponse(ResponseContext responseContext, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response_context = responseContext;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SubmitFormResponse)) {
            return false;
        }
        SubmitFormResponse submitFormResponse = (SubmitFormResponse) obj;
        return Intrinsics.areEqual(unknownFields(), submitFormResponse.unknownFields()) && Intrinsics.areEqual(this.response_context, submitFormResponse.response_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ResponseContext responseContext = this.response_context;
        int hashCode2 = hashCode + (responseContext != null ? responseContext.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.response_context = this.response_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SubmitFormResponse{", "}", 0, null, null, 56);
    }
}
