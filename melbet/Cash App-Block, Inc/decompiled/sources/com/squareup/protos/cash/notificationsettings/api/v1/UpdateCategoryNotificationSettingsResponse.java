package com.squareup.protos.cash.notificationsettings.api.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashliteflow.api.v1.GetCashInAccountResponse;
import com.squareup.protos.franklin.common.ResponseContext;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/notificationsettings/api/v1/UpdateCategoryNotificationSettingsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/cashliteflow/api/v1/GetCashInAccountResponse$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UpdateCategoryNotificationSettingsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UpdateCategoryNotificationSettingsResponse> CREATOR;
    public final List failed_updates;
    public final ResponseContext response_context;

    static {
        UpdateCategoryNotificationSettingsResponse$Companion$ADAPTER$1 updateCategoryNotificationSettingsResponse$Companion$ADAPTER$1 = new UpdateCategoryNotificationSettingsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UpdateCategoryNotificationSettingsResponse.class), "type.googleapis.com/squareup.cash.notificationsettings.api.v1.UpdateCategoryNotificationSettingsResponse", Syntax.PROTO_2, null, "squareup/cash/notificationsettings/api/v1/update_category_notification_settings.proto");
        ADAPTER = updateCategoryNotificationSettingsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(updateCategoryNotificationSettingsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateCategoryNotificationSettingsResponse(ResponseContext responseContext, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.response_context = responseContext;
        this.failed_updates = TransactorKt.immutableCopyOf("failed_updates", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UpdateCategoryNotificationSettingsResponse)) {
            return false;
        }
        UpdateCategoryNotificationSettingsResponse updateCategoryNotificationSettingsResponse = (UpdateCategoryNotificationSettingsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), updateCategoryNotificationSettingsResponse.unknownFields()) && Intrinsics.areEqual(this.failed_updates, updateCategoryNotificationSettingsResponse.failed_updates) && Intrinsics.areEqual(this.response_context, updateCategoryNotificationSettingsResponse.response_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.failed_updates);
        ResponseContext responseContext = this.response_context;
        int hashCode = m + (responseContext != null ? responseContext.hashCode() : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GetCashInAccountResponse.Builder builder = new GetCashInAccountResponse.Builder(5);
        builder.account_info_rows = this.failed_updates;
        builder.response_context = this.response_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.failed_updates;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("failed_updates=", arrayList, list);
        }
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UpdateCategoryNotificationSettingsResponse{", "}", 0, null, null, 56);
    }
}
