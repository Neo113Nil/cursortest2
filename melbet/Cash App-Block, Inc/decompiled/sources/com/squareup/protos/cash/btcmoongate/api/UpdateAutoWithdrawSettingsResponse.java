package com.squareup.protos.cash.btcmoongate.api;

import android.os.Parcelable;
import com.squareup.protos.cash.btcmoongate.api.UpdateAutoWithdrawSettingsRequest;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/btcmoongate/api/UpdateAutoWithdrawSettingsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/btcmoongate/api/UpdateAutoWithdrawSettingsRequest$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UpdateAutoWithdrawSettingsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UpdateAutoWithdrawSettingsResponse> CREATOR;
    public final AutoWithdrawSettings settings;

    static {
        UpdateAutoWithdrawSettingsResponse$Companion$ADAPTER$1 updateAutoWithdrawSettingsResponse$Companion$ADAPTER$1 = new UpdateAutoWithdrawSettingsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UpdateAutoWithdrawSettingsResponse.class), "type.googleapis.com/squareup.cash.btcmoongate.api.UpdateAutoWithdrawSettingsResponse", Syntax.PROTO_2, null, "squareup/cash/btcmoongate/api/auto_withdraw.proto");
        ADAPTER = updateAutoWithdrawSettingsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(updateAutoWithdrawSettingsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateAutoWithdrawSettingsResponse(AutoWithdrawSettings autoWithdrawSettings, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.settings = autoWithdrawSettings;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UpdateAutoWithdrawSettingsResponse)) {
            return false;
        }
        UpdateAutoWithdrawSettingsResponse updateAutoWithdrawSettingsResponse = (UpdateAutoWithdrawSettingsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), updateAutoWithdrawSettingsResponse.unknownFields()) && Intrinsics.areEqual(this.settings, updateAutoWithdrawSettingsResponse.settings);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        AutoWithdrawSettings autoWithdrawSettings = this.settings;
        int hashCode2 = hashCode + (autoWithdrawSettings != null ? autoWithdrawSettings.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UpdateAutoWithdrawSettingsRequest.Builder builder = new UpdateAutoWithdrawSettingsRequest.Builder(1);
        builder.settings = this.settings;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AutoWithdrawSettings autoWithdrawSettings = this.settings;
        if (autoWithdrawSettings != null) {
            arrayList.add("settings=" + autoWithdrawSettings);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UpdateAutoWithdrawSettingsResponse{", "}", 0, null, null, 56);
    }
}
