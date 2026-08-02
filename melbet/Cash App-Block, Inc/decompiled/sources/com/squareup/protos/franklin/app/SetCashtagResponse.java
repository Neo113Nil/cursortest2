package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pools.PoolVisibility;
import com.squareup.protos.document.Document;
import com.squareup.protos.franklin.api.CashtagStatus;
import com.squareup.protos.franklin.api.UiAlias;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/franklin/app/SetCashtagResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/document/Document$Builder;", "Builder", "Status", "FailureReason", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SetCashtagResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SetCashtagResponse> CREATOR;
    public final CashtagStatus cashtag_status;
    public final String cashtag_url;
    public final String cashtag_url_display_text;
    public final FailureReason failure_reason;
    public final ResponseContext response_context;
    public final Status status;

    public enum FailureReason implements WireEnum {
        TOO_MANY_CASHTAGS(1),
        ACCOUNT_DENYLISTED(2);

        public final int value;
        public static final PoolVisibility.Companion Companion = new PoolVisibility.Companion();
        public static final SetCashtagResponse$FailureReason$Companion$ADAPTER$1 ADAPTER = new SetCashtagResponse$FailureReason$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(FailureReason.class), Syntax.PROTO_2, null);

        FailureReason(int i) {
            this.value = i;
        }

        public static final FailureReason fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return TOO_MANY_CASHTAGS;
            }
            if (i != 2) {
                return null;
            }
            return ACCOUNT_DENYLISTED;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    /* loaded from: classes.dex */
    public enum Status implements WireEnum {
        INVALID(0),
        SUCCESS(1),
        CASHTAG_STATUS_FAILURE(3),
        FAILURE(4);

        public static final SetCashtagResponse$Status$Companion$ADAPTER$1 ADAPTER;
        public static final UiAlias.Type.Companion Companion;
        public final int value;

        static {
            Status status = INVALID;
            Companion = new UiAlias.Type.Companion();
            ADAPTER = new SetCashtagResponse$Status$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Status.class), Syntax.PROTO_2, status);
        }

        Status(int i) {
            this.value = i;
        }

        public static final Status fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return INVALID;
            }
            if (i == 1) {
                return SUCCESS;
            }
            if (i == 3) {
                return CASHTAG_STATUS_FAILURE;
            }
            if (i != 4) {
                return null;
            }
            return FAILURE;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        SetCashtagResponse$Companion$ADAPTER$1 setCashtagResponse$Companion$ADAPTER$1 = new SetCashtagResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SetCashtagResponse.class), "type.googleapis.com/squareup.franklin.app.SetCashtagResponse", Syntax.PROTO_2, null, "squareup/franklin/app/cashtag.proto");
        ADAPTER = setCashtagResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(setCashtagResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetCashtagResponse(ResponseContext responseContext, Status status, String str, String str2, CashtagStatus cashtagStatus, FailureReason failureReason, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response_context = responseContext;
        this.status = status;
        this.cashtag_url = str;
        this.cashtag_url_display_text = str2;
        this.cashtag_status = cashtagStatus;
        this.failure_reason = failureReason;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetCashtagResponse)) {
            return false;
        }
        SetCashtagResponse setCashtagResponse = (SetCashtagResponse) obj;
        return Intrinsics.areEqual(unknownFields(), setCashtagResponse.unknownFields()) && Intrinsics.areEqual(this.response_context, setCashtagResponse.response_context) && this.status == setCashtagResponse.status && Intrinsics.areEqual(this.cashtag_url, setCashtagResponse.cashtag_url) && Intrinsics.areEqual(this.cashtag_url_display_text, setCashtagResponse.cashtag_url_display_text) && this.cashtag_status == setCashtagResponse.cashtag_status && this.failure_reason == setCashtagResponse.failure_reason;
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
        String str = this.cashtag_url;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.cashtag_url_display_text;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        CashtagStatus cashtagStatus = this.cashtag_status;
        int hashCode6 = (hashCode5 + (cashtagStatus != null ? cashtagStatus.hashCode() : 0)) * 37;
        FailureReason failureReason = this.failure_reason;
        int hashCode7 = hashCode6 + (failureReason != null ? failureReason.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Document.Builder builder = new Document.Builder(17, false);
        builder.title = this.response_context;
        builder.url = this.status;
        builder.category = this.cashtag_url;
        builder.token = this.cashtag_url_display_text;
        builder.owner_token = this.cashtag_status;
        builder.document_date = this.failure_reason;
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
        if (this.cashtag_url != null) {
            arrayList.add("cashtag_url=██");
        }
        if (this.cashtag_url_display_text != null) {
            arrayList.add("cashtag_url_display_text=██");
        }
        CashtagStatus cashtagStatus = this.cashtag_status;
        if (cashtagStatus != null) {
            arrayList.add("cashtag_status=" + cashtagStatus);
        }
        FailureReason failureReason = this.failure_reason;
        if (failureReason != null) {
            arrayList.add("failure_reason=" + failureReason);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SetCashtagResponse{", "}", 0, null, null, 56);
    }
}
