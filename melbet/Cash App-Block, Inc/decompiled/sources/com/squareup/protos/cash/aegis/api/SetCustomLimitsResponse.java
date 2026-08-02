package com.squareup.protos.cash.aegis.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashsuggest.api.ToggleScreen;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/aegis/api/SetCustomLimitsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/cashsuggest/api/ToggleScreen$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SetCustomLimitsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SetCustomLimitsResponse> CREATOR;
    public final List custom_limits;
    public final String customer_token;

    static {
        SetCustomLimitsResponse$Companion$ADAPTER$1 setCustomLimitsResponse$Companion$ADAPTER$1 = new SetCustomLimitsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SetCustomLimitsResponse.class), "type.googleapis.com/squareup.cash.aegis.api.SetCustomLimitsResponse", Syntax.PROTO_2, null, "squareup/cash/aegis/api/SetCustomLimitsResponse.proto");
        ADAPTER = setCustomLimitsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(setCustomLimitsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetCustomLimitsResponse(String str, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.customer_token = str;
        this.custom_limits = TransactorKt.immutableCopyOf("custom_limits", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetCustomLimitsResponse)) {
            return false;
        }
        SetCustomLimitsResponse setCustomLimitsResponse = (SetCustomLimitsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), setCustomLimitsResponse.unknownFields()) && Intrinsics.areEqual(this.customer_token, setCustomLimitsResponse.customer_token) && Intrinsics.areEqual(this.custom_limits, setCustomLimitsResponse.custom_limits);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.customer_token;
        int hashCode2 = this.custom_limits.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 37);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ToggleScreen.Builder builder = new ToggleScreen.Builder(6, false);
        builder.toggle_title = this.customer_token;
        builder.sections = this.custom_limits;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.customer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "customer_token=", arrayList);
        }
        List list = this.custom_limits;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("custom_limits=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SetCustomLimitsResponse{", "}", 0, null, null, 56);
    }
}
