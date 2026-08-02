package com.squareup.protos.cash.investcustomer.api.v1.drip;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.grantly.api.Card;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/investcustomer/api/v1/drip/SetCustomerDividendSettingsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/grantly/api/Card$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SetCustomerDividendSettingsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SetCustomerDividendSettingsResponse> CREATOR;
    public final ResponseContext response_context;
    public final DividendSetting setting;

    static {
        SetCustomerDividendSettingsResponse$Companion$ADAPTER$1 setCustomerDividendSettingsResponse$Companion$ADAPTER$1 = new SetCustomerDividendSettingsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SetCustomerDividendSettingsResponse.class), "type.googleapis.com/squareup.cash.investcustomer.api.v1.drip.SetCustomerDividendSettingsResponse", Syntax.PROTO_2, null, "squareup/cash/investcustomer/api/v1/drip/drip_service.proto");
        ADAPTER = setCustomerDividendSettingsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(setCustomerDividendSettingsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetCustomerDividendSettingsResponse(DividendSetting dividendSetting, ResponseContext responseContext, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.setting = dividendSetting;
        this.response_context = responseContext;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetCustomerDividendSettingsResponse)) {
            return false;
        }
        SetCustomerDividendSettingsResponse setCustomerDividendSettingsResponse = (SetCustomerDividendSettingsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), setCustomerDividendSettingsResponse.unknownFields()) && this.setting == setCustomerDividendSettingsResponse.setting && Intrinsics.areEqual(this.response_context, setCustomerDividendSettingsResponse.response_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        DividendSetting dividendSetting = this.setting;
        int hashCode2 = (hashCode + (dividendSetting != null ? dividendSetting.hashCode() : 0)) * 37;
        ResponseContext responseContext = this.response_context;
        int hashCode3 = hashCode2 + (responseContext != null ? responseContext.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Card.Builder builder = new Card.Builder(10);
        builder.card_type = this.setting;
        builder.card_pii = this.response_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        DividendSetting dividendSetting = this.setting;
        if (dividendSetting != null) {
            arrayList.add("setting=" + dividendSetting);
        }
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SetCustomerDividendSettingsResponse{", "}", 0, null, null, 56);
    }
}
