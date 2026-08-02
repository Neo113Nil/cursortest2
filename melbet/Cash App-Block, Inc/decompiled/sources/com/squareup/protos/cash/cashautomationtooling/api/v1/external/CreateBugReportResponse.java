package com.squareup.protos.cash.cashautomationtooling.api.v1.external;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.SupportConfig;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/cashautomationtooling/api/v1/external/CreateBugReportResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/SupportConfig$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CreateBugReportResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CreateBugReportResponse> CREATOR;
    public final String bug_report_id;
    public final String external_identifier;
    public final String url;

    static {
        CreateBugReportResponse$Companion$ADAPTER$1 createBugReportResponse$Companion$ADAPTER$1 = new CreateBugReportResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CreateBugReportResponse.class), "type.googleapis.com/squareup.cash.cashautomationtooling.api.external.v1beta1.CreateBugReportResponse", Syntax.PROTO_2, null, "squareup/cash/cashautomationtooling/api/external/v1beta1/bug_report_service.proto");
        ADAPTER = createBugReportResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(createBugReportResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateBugReportResponse(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.bug_report_id = str;
        this.external_identifier = str2;
        this.url = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreateBugReportResponse)) {
            return false;
        }
        CreateBugReportResponse createBugReportResponse = (CreateBugReportResponse) obj;
        return Intrinsics.areEqual(unknownFields(), createBugReportResponse.unknownFields()) && Intrinsics.areEqual(this.bug_report_id, createBugReportResponse.bug_report_id) && Intrinsics.areEqual(this.external_identifier, createBugReportResponse.external_identifier) && Intrinsics.areEqual(this.url, createBugReportResponse.url);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.bug_report_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.external_identifier;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.url;
        int hashCode4 = hashCode3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SupportConfig.Builder builder = new SupportConfig.Builder(5);
        builder.contact_support_url = this.bug_report_id;
        builder.privacy_policy_url = this.external_identifier;
        builder.terms_of_service_url = this.url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.bug_report_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "bug_report_id=", arrayList);
        }
        String str2 = this.external_identifier;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "external_identifier=", arrayList);
        }
        String str3 = this.url;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "url=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CreateBugReportResponse{", "}", 0, null, null, 56);
    }
}
