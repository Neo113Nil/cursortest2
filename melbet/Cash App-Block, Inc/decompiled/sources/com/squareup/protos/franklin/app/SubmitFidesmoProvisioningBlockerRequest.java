package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pools.TransactionType;
import com.squareup.protos.franklin.bankbook.Institution;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SubmitFidesmoProvisioningBlockerRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SubmitFidesmoProvisioningBlockerRequest> CREATOR;
    public final String device_id;
    public final RequestContext request_context;
    public final Result result;

    public enum Result implements WireEnum {
        UNKNOWN(1),
        SUCCESS(2),
        FAILURE(3),
        TOKEN_ACTIVATION_REQUIRED(4);

        public final int value;
        public static final TransactionType.Companion Companion = new TransactionType.Companion();
        public static final SubmitFidesmoProvisioningBlockerRequest$Result$Companion$ADAPTER$1 ADAPTER = new SubmitFidesmoProvisioningBlockerRequest$Result$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Result.class), Syntax.PROTO_2, null);

        Result(int i) {
            this.value = i;
        }

        public static final Result fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return UNKNOWN;
            }
            if (i == 2) {
                return SUCCESS;
            }
            if (i == 3) {
                return FAILURE;
            }
            if (i != 4) {
                return null;
            }
            return TOKEN_ACTIVATION_REQUIRED;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        SubmitFidesmoProvisioningBlockerRequest$Companion$ADAPTER$1 submitFidesmoProvisioningBlockerRequest$Companion$ADAPTER$1 = new SubmitFidesmoProvisioningBlockerRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SubmitFidesmoProvisioningBlockerRequest.class), "type.googleapis.com/squareup.franklin.app.SubmitFidesmoProvisioningBlockerRequest", Syntax.PROTO_2, null, "squareup/franklin/app/payment_token_device.proto");
        ADAPTER = submitFidesmoProvisioningBlockerRequest$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(submitFidesmoProvisioningBlockerRequest$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitFidesmoProvisioningBlockerRequest(RequestContext requestContext, Result result, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.result = result;
        this.device_id = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SubmitFidesmoProvisioningBlockerRequest)) {
            return false;
        }
        SubmitFidesmoProvisioningBlockerRequest submitFidesmoProvisioningBlockerRequest = (SubmitFidesmoProvisioningBlockerRequest) obj;
        return Intrinsics.areEqual(unknownFields(), submitFidesmoProvisioningBlockerRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, submitFidesmoProvisioningBlockerRequest.request_context) && this.result == submitFidesmoProvisioningBlockerRequest.result && Intrinsics.areEqual(this.device_id, submitFidesmoProvisioningBlockerRequest.device_id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        Result result = this.result;
        int hashCode3 = (hashCode2 + (result != null ? result.hashCode() : 0)) * 37;
        String str = this.device_id;
        int hashCode4 = hashCode3 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Institution.Builder builder = new Institution.Builder(7, false);
        builder.display_info = this.request_context;
        builder.help_menu_items = this.result;
        builder.institution_token = this.device_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        Result result = this.result;
        if (result != null) {
            arrayList.add("result=" + result);
        }
        String str = this.device_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "device_id=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SubmitFidesmoProvisioningBlockerRequest{", "}", 0, null, null, 56);
    }
}
