package com.squareup.protos.cash.piggybank.appapi;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.nearby.api.v1.BLEPayload;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.SyncEntity;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/piggybank/appapi/FamiliesSavingsScreensResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/nearby/api/v1/BLEPayload$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FamiliesSavingsScreensResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<FamiliesSavingsScreensResponse> CREATOR;
    public final ResponseContext response_context;
    public final SyncEntity savings_folders;
    public final SyncEntity savings_screens;

    static {
        FamiliesSavingsScreensResponse$Companion$ADAPTER$1 familiesSavingsScreensResponse$Companion$ADAPTER$1 = new FamiliesSavingsScreensResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(FamiliesSavingsScreensResponse.class), "type.googleapis.com/squareup.cash.piggybank.appapi.FamiliesSavingsScreensResponse", Syntax.PROTO_2, null, "squareup/cash/app/families_savings_screens.proto");
        ADAPTER = familiesSavingsScreensResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(familiesSavingsScreensResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FamiliesSavingsScreensResponse(ResponseContext responseContext, SyncEntity syncEntity, SyncEntity syncEntity2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response_context = responseContext;
        this.savings_screens = syncEntity;
        this.savings_folders = syncEntity2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FamiliesSavingsScreensResponse)) {
            return false;
        }
        FamiliesSavingsScreensResponse familiesSavingsScreensResponse = (FamiliesSavingsScreensResponse) obj;
        return Intrinsics.areEqual(unknownFields(), familiesSavingsScreensResponse.unknownFields()) && Intrinsics.areEqual(this.response_context, familiesSavingsScreensResponse.response_context) && Intrinsics.areEqual(this.savings_screens, familiesSavingsScreensResponse.savings_screens) && Intrinsics.areEqual(this.savings_folders, familiesSavingsScreensResponse.savings_folders);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ResponseContext responseContext = this.response_context;
        int hashCode2 = (hashCode + (responseContext != null ? responseContext.hashCode() : 0)) * 37;
        SyncEntity syncEntity = this.savings_screens;
        int hashCode3 = (hashCode2 + (syncEntity != null ? syncEntity.hashCode() : 0)) * 37;
        SyncEntity syncEntity2 = this.savings_folders;
        int hashCode4 = hashCode3 + (syncEntity2 != null ? syncEntity2.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BLEPayload.Builder builder = new BLEPayload.Builder(26, false);
        builder.advertisement_data = this.response_context;
        builder.transmission_level = this.savings_screens;
        builder.frequency = this.savings_folders;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        SyncEntity syncEntity = this.savings_screens;
        if (syncEntity != null) {
            arrayList.add("savings_screens=" + syncEntity);
        }
        SyncEntity syncEntity2 = this.savings_folders;
        if (syncEntity2 != null) {
            arrayList.add("savings_folders=" + syncEntity2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FamiliesSavingsScreensResponse{", "}", 0, null, null, 56);
    }
}
