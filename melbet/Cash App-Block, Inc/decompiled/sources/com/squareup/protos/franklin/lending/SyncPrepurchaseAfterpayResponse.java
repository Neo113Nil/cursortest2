package com.squareup.protos.franklin.lending;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.lending.PrepurchaseAfterpayAppletData;
import com.squareup.protos.rewardly.ui.AppLinks;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/franklin/lending/SyncPrepurchaseAfterpayResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/rewardly/ui/AppLinks$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SyncPrepurchaseAfterpayResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SyncPrepurchaseAfterpayResponse> CREATOR;
    public final PrepurchaseAfterpayAppletData applet_data;
    public final ResponseContext response_context;

    static {
        SyncPrepurchaseAfterpayResponse$Companion$ADAPTER$1 syncPrepurchaseAfterpayResponse$Companion$ADAPTER$1 = new SyncPrepurchaseAfterpayResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SyncPrepurchaseAfterpayResponse.class), "type.googleapis.com/squareup.franklin.lending.SyncPrepurchaseAfterpayResponse", Syntax.PROTO_2, null, "squareup/franklin/lending_api.proto");
        ADAPTER = syncPrepurchaseAfterpayResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(syncPrepurchaseAfterpayResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncPrepurchaseAfterpayResponse(ResponseContext responseContext, PrepurchaseAfterpayAppletData prepurchaseAfterpayAppletData, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response_context = responseContext;
        this.applet_data = prepurchaseAfterpayAppletData;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SyncPrepurchaseAfterpayResponse)) {
            return false;
        }
        SyncPrepurchaseAfterpayResponse syncPrepurchaseAfterpayResponse = (SyncPrepurchaseAfterpayResponse) obj;
        return Intrinsics.areEqual(unknownFields(), syncPrepurchaseAfterpayResponse.unknownFields()) && Intrinsics.areEqual(this.response_context, syncPrepurchaseAfterpayResponse.response_context) && Intrinsics.areEqual(this.applet_data, syncPrepurchaseAfterpayResponse.applet_data);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ResponseContext responseContext = this.response_context;
        int hashCode2 = (hashCode + (responseContext != null ? responseContext.hashCode() : 0)) * 37;
        PrepurchaseAfterpayAppletData prepurchaseAfterpayAppletData = this.applet_data;
        int hashCode3 = hashCode2 + (prepurchaseAfterpayAppletData != null ? prepurchaseAfterpayAppletData.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        AppLinks.Builder builder = new AppLinks.Builder(2);
        builder.f1411android = this.response_context;
        builder.ios = this.applet_data;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        PrepurchaseAfterpayAppletData prepurchaseAfterpayAppletData = this.applet_data;
        if (prepurchaseAfterpayAppletData != null) {
            arrayList.add("applet_data=" + prepurchaseAfterpayAppletData);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SyncPrepurchaseAfterpayResponse{", "}", 0, null, null, 56);
    }
}
