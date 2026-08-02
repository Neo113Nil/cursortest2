package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.document.Document;
import com.squareup.protos.franklin.api.CashtagStatus;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/protos/franklin/app/GetCashtagStatusResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/document/Document$Builder;", "Builder", "Status", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class GetCashtagStatusResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetCashtagStatusResponse> CREATOR;
    public final String cashtag_candidate;
    public final CashtagStatus cashtag_status;
    public final String cashtag_url_display_text;
    public final String confirm_message;
    public final String failure_message;
    public final Status status;

    /* loaded from: classes.dex */
    public enum Status implements WireEnum {
        INVALID(0),
        SUCCESS(1),
        TOO_MANY_REQUESTS(3);

        public static final GetCashtagStatusResponse$Status$Companion$ADAPTER$1 ADAPTER;
        public static final ByteString.Companion Companion;
        public final int value;

        static {
            Status status = INVALID;
            Companion = new ByteString.Companion();
            ADAPTER = new GetCashtagStatusResponse$Status$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Status.class), Syntax.PROTO_2, status);
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
            if (i != 3) {
                return null;
            }
            return TOO_MANY_REQUESTS;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        GetCashtagStatusResponse$Companion$ADAPTER$1 getCashtagStatusResponse$Companion$ADAPTER$1 = new GetCashtagStatusResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetCashtagStatusResponse.class), "type.googleapis.com/squareup.franklin.app.GetCashtagStatusResponse", Syntax.PROTO_2, null, "squareup/franklin/app/cashtag.proto");
        ADAPTER = getCashtagStatusResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getCashtagStatusResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCashtagStatusResponse(Status status, String str, CashtagStatus cashtagStatus, String str2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.status = status;
        this.cashtag_candidate = str;
        this.cashtag_status = cashtagStatus;
        this.cashtag_url_display_text = str2;
        this.failure_message = str3;
        this.confirm_message = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetCashtagStatusResponse)) {
            return false;
        }
        GetCashtagStatusResponse getCashtagStatusResponse = (GetCashtagStatusResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getCashtagStatusResponse.unknownFields()) && this.status == getCashtagStatusResponse.status && Intrinsics.areEqual(this.cashtag_candidate, getCashtagStatusResponse.cashtag_candidate) && this.cashtag_status == getCashtagStatusResponse.cashtag_status && Intrinsics.areEqual(this.cashtag_url_display_text, getCashtagStatusResponse.cashtag_url_display_text) && Intrinsics.areEqual(this.failure_message, getCashtagStatusResponse.failure_message) && Intrinsics.areEqual(this.confirm_message, getCashtagStatusResponse.confirm_message);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Status status = this.status;
        int hashCode2 = (hashCode + (status != null ? status.hashCode() : 0)) * 37;
        String str = this.cashtag_candidate;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        CashtagStatus cashtagStatus = this.cashtag_status;
        int hashCode4 = (hashCode3 + (cashtagStatus != null ? cashtagStatus.hashCode() : 0)) * 37;
        String str2 = this.cashtag_url_display_text;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.failure_message;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.confirm_message;
        int hashCode7 = hashCode6 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Document.Builder builder = new Document.Builder(13, false);
        builder.owner_token = this.status;
        builder.category = this.cashtag_candidate;
        builder.document_date = this.cashtag_status;
        builder.token = this.cashtag_url_display_text;
        builder.title = this.failure_message;
        builder.url = this.confirm_message;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Status status = this.status;
        if (status != null) {
            arrayList.add("status=" + status);
        }
        if (this.cashtag_candidate != null) {
            arrayList.add("cashtag_candidate=██");
        }
        CashtagStatus cashtagStatus = this.cashtag_status;
        if (cashtagStatus != null) {
            arrayList.add("cashtag_status=" + cashtagStatus);
        }
        if (this.cashtag_url_display_text != null) {
            arrayList.add("cashtag_url_display_text=██");
        }
        String str = this.failure_message;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "failure_message=", arrayList);
        }
        String str2 = this.confirm_message;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "confirm_message=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetCashtagStatusResponse{", "}", 0, null, null, 56);
    }
}
