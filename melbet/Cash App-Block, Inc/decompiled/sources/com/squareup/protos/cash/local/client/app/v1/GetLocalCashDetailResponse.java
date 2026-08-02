package com.squareup.protos.cash.local.client.app.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.discover.api.app.v1.model.Text;
import com.squareup.protos.cash.local.client.v1.GetNeighborhoodsTabContentResponse;
import com.squareup.protos.cash.local.client.v1.LocalCashActivity;
import com.squareup.protos.cash.local.client.v1.LocalCashInformationalContent;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/local/client/app/v1/GetLocalCashDetailResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/discover/api/app/v1/model/Text$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetLocalCashDetailResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetLocalCashDetailResponse> CREATOR;
    public final LocalCashActivity activity;
    public final LocalCashInformationalContent content;
    public final GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding.HowItWorks how_it_works;
    public final String local_cash_label;
    public final ResponseContext response_context;

    static {
        GetLocalCashDetailResponse$Companion$ADAPTER$1 getLocalCashDetailResponse$Companion$ADAPTER$1 = new GetLocalCashDetailResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetLocalCashDetailResponse.class), "type.googleapis.com/squareup.cash.local.client.app.v1.GetLocalCashDetailResponse", Syntax.PROTO_2, null, "squareup/cash/local/client/app/v1/cash_app_local_client_app_service.proto");
        ADAPTER = getLocalCashDetailResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getLocalCashDetailResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetLocalCashDetailResponse(String str, LocalCashInformationalContent localCashInformationalContent, LocalCashActivity localCashActivity, ResponseContext responseContext, GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding.HowItWorks howItWorks, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.local_cash_label = str;
        this.content = localCashInformationalContent;
        this.activity = localCashActivity;
        this.response_context = responseContext;
        this.how_it_works = howItWorks;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetLocalCashDetailResponse)) {
            return false;
        }
        GetLocalCashDetailResponse getLocalCashDetailResponse = (GetLocalCashDetailResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getLocalCashDetailResponse.unknownFields()) && Intrinsics.areEqual(this.local_cash_label, getLocalCashDetailResponse.local_cash_label) && Intrinsics.areEqual(this.content, getLocalCashDetailResponse.content) && Intrinsics.areEqual(this.activity, getLocalCashDetailResponse.activity) && Intrinsics.areEqual(this.response_context, getLocalCashDetailResponse.response_context) && Intrinsics.areEqual(this.how_it_works, getLocalCashDetailResponse.how_it_works);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.local_cash_label;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        LocalCashInformationalContent localCashInformationalContent = this.content;
        int hashCode3 = (hashCode2 + (localCashInformationalContent != null ? localCashInformationalContent.hashCode() : 0)) * 37;
        LocalCashActivity localCashActivity = this.activity;
        int hashCode4 = (hashCode3 + (localCashActivity != null ? localCashActivity.hashCode() : 0)) * 37;
        ResponseContext responseContext = this.response_context;
        int hashCode5 = (hashCode4 + (responseContext != null ? responseContext.hashCode() : 0)) * 37;
        GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding.HowItWorks howItWorks = this.how_it_works;
        int hashCode6 = hashCode5 + (howItWorks != null ? howItWorks.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Text.Builder builder = new Text.Builder(20);
        builder.text = this.local_cash_label;
        builder.text_style = this.content;
        builder.text_decoration = this.activity;
        builder.text_color = this.response_context;
        builder.icon = this.how_it_works;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.local_cash_label;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "local_cash_label=", arrayList);
        }
        LocalCashInformationalContent localCashInformationalContent = this.content;
        if (localCashInformationalContent != null) {
            arrayList.add("content=" + localCashInformationalContent);
        }
        LocalCashActivity localCashActivity = this.activity;
        if (localCashActivity != null) {
            arrayList.add("activity=" + localCashActivity);
        }
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding.HowItWorks howItWorks = this.how_it_works;
        if (howItWorks != null) {
            arrayList.add("how_it_works=" + howItWorks);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetLocalCashDetailResponse{", "}", 0, null, null, 56);
    }
}
