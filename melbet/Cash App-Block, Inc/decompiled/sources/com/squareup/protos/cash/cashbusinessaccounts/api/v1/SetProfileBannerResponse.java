package com.squareup.protos.cash.cashbusinessaccounts.api.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.moneta.api.CashInResponse;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/cashbusinessaccounts/api/v1/SetProfileBannerResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/moneta/api/CashInResponse$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SetProfileBannerResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SetProfileBannerResponse> CREATOR;
    public final String banner_color;
    public final ResponseContext response_context;

    static {
        SetProfileBannerResponse$Companion$ADAPTER$1 setProfileBannerResponse$Companion$ADAPTER$1 = new SetProfileBannerResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SetProfileBannerResponse.class), "type.googleapis.com/squareup.cash.cashbusinessaccounts.api.v1.SetProfileBannerResponse", Syntax.PROTO_2, null, "squareup/cash/cashbusinessaccounts/api/v1/set_profile_banner_color.proto");
        ADAPTER = setProfileBannerResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(setProfileBannerResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetProfileBannerResponse(ResponseContext responseContext, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.banner_color = str;
        this.response_context = responseContext;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetProfileBannerResponse)) {
            return false;
        }
        SetProfileBannerResponse setProfileBannerResponse = (SetProfileBannerResponse) obj;
        return Intrinsics.areEqual(unknownFields(), setProfileBannerResponse.unknownFields()) && Intrinsics.areEqual(this.banner_color, setProfileBannerResponse.banner_color) && Intrinsics.areEqual(this.response_context, setProfileBannerResponse.response_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.banner_color;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        ResponseContext responseContext = this.response_context;
        int hashCode3 = hashCode2 + (responseContext != null ? responseContext.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CashInResponse.Builder builder = new CashInResponse.Builder(3);
        builder.passcode_token = this.banner_color;
        builder.response_context = this.response_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.banner_color;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "banner_color=", arrayList);
        }
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SetProfileBannerResponse{", "}", 0, null, null, 56);
    }
}
