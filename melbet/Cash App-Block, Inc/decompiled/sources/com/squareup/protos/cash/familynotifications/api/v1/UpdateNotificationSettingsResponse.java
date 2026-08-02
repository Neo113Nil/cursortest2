package com.squareup.protos.cash.familynotifications.api.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.knotapi.knot.utilities.PreferenceManager;
import com.squareup.protos.cash.grantly.api.SandboxMetadata;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/familynotifications/api/v1/UpdateNotificationSettingsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/grantly/api/SandboxMetadata$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UpdateNotificationSettingsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UpdateNotificationSettingsResponse> CREATOR;
    public final List settings;

    static {
        UpdateNotificationSettingsResponse$Companion$ADAPTER$1 updateNotificationSettingsResponse$Companion$ADAPTER$1 = new UpdateNotificationSettingsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UpdateNotificationSettingsResponse.class), "type.googleapis.com/squareup.cash.familynotifications.api.v1beta1.UpdateNotificationSettingsResponse", Syntax.PROTO_2, null, "squareup/cash/familynotifications/api/v1beta1/service.proto");
        ADAPTER = updateNotificationSettingsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(updateNotificationSettingsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateNotificationSettingsResponse(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.settings = TransactorKt.immutableCopyOf(PreferenceManager.PREF_SETTINGS, list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UpdateNotificationSettingsResponse)) {
            return false;
        }
        UpdateNotificationSettingsResponse updateNotificationSettingsResponse = (UpdateNotificationSettingsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), updateNotificationSettingsResponse.unknownFields()) && Intrinsics.areEqual(this.settings, updateNotificationSettingsResponse.settings);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.settings.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SandboxMetadata.Builder builder = new SandboxMetadata.Builder(14, false);
        builder.scenarios = this.settings;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.settings;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("settings=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UpdateNotificationSettingsResponse{", "}", 0, null, null, 56);
    }
}
