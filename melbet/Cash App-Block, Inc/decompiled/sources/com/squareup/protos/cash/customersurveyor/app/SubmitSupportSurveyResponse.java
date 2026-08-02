package com.squareup.protos.cash.customersurveyor.app;

import android.os.Parcelable;
import com.squareup.protos.cash.cashlimitsxp.api.v1.Empty;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/customersurveyor/app/SubmitSupportSurveyResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/cashlimitsxp/api/v1/Empty$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SubmitSupportSurveyResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SubmitSupportSurveyResponse> CREATOR;

    static {
        SubmitSupportSurveyResponse$Companion$ADAPTER$1 submitSupportSurveyResponse$Companion$ADAPTER$1 = new SubmitSupportSurveyResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SubmitSupportSurveyResponse.class), "type.googleapis.com/squareup.cash.customersurveyor.app.SubmitSupportSurveyResponse", Syntax.PROTO_2, null, "squareup/cash/customersurveyor/app.proto");
        ADAPTER = submitSupportSurveyResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(submitSupportSurveyResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitSupportSurveyResponse(ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof SubmitSupportSurveyResponse) && Intrinsics.areEqual(unknownFields(), ((SubmitSupportSurveyResponse) obj).unknownFields());
    }

    public final int hashCode() {
        return unknownFields().hashCode();
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Empty.Builder builder = new Empty.Builder(22);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        return "SubmitSupportSurveyResponse{}";
    }
}
