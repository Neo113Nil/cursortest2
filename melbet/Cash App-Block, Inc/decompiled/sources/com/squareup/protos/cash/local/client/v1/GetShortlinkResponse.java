package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.datadog.android.rum.internal.utils.ViewUtilsKt;
import com.squareup.protos.cash.local.client.v1.InputValue;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/GetShortlinkResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/InputValue$Builder;", "Builder", "com/datadog/android/rum/internal/utils/ViewUtilsKt", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetShortlinkResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetShortlinkResponse> CREATOR;
    public final ViewUtilsKt action;
    public final List actions;

    static {
        GetShortlinkResponse$Companion$ADAPTER$1 getShortlinkResponse$Companion$ADAPTER$1 = new GetShortlinkResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetShortlinkResponse.class), "type.googleapis.com/squareup.cash.local.client.v1.GetShortlinkResponse", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
        ADAPTER = getShortlinkResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getShortlinkResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetShortlinkResponse(ViewUtilsKt viewUtilsKt, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.action = viewUtilsKt;
        this.actions = TransactorKt.immutableCopyOf("actions", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetShortlinkResponse)) {
            return false;
        }
        GetShortlinkResponse getShortlinkResponse = (GetShortlinkResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getShortlinkResponse.unknownFields()) && Intrinsics.areEqual(this.action, getShortlinkResponse.action) && Intrinsics.areEqual(this.actions, getShortlinkResponse.actions);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ViewUtilsKt viewUtilsKt = this.action;
        int hashCode2 = this.actions.hashCode() + ((hashCode + (viewUtilsKt != null ? viewUtilsKt.hashCode() : 0)) * 37);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        InputValue.Builder builder = new InputValue.Builder(12);
        builder.input_id = this.action;
        builder.value = this.actions;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ViewUtilsKt viewUtilsKt = this.action;
        if (viewUtilsKt != null) {
            arrayList.add("action=" + viewUtilsKt);
        }
        List list = this.actions;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("actions=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetShortlinkResponse{", "}", 0, null, null, 56);
    }
}
