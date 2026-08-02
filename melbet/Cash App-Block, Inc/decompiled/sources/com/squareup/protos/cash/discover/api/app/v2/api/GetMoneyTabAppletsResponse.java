package com.squareup.protos.cash.discover.api.app.v2.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/discover/api/app/v2/api/GetMoneyTabAppletsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/grantly/api/SandboxMetadata$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetMoneyTabAppletsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetMoneyTabAppletsResponse> CREATOR;
    public final List applets;

    static {
        GetMoneyTabAppletsResponse$Companion$ADAPTER$1 getMoneyTabAppletsResponse$Companion$ADAPTER$1 = new GetMoneyTabAppletsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetMoneyTabAppletsResponse.class), "type.googleapis.com/squareup.cash.discover.api.app.v2.api.GetMoneyTabAppletsResponse", Syntax.PROTO_2, null, "squareup/cash/discover/api/app/v2/api/applets.proto");
        ADAPTER = getMoneyTabAppletsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getMoneyTabAppletsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetMoneyTabAppletsResponse(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.applets = TransactorKt.immutableCopyOf("applets", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetMoneyTabAppletsResponse)) {
            return false;
        }
        GetMoneyTabAppletsResponse getMoneyTabAppletsResponse = (GetMoneyTabAppletsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getMoneyTabAppletsResponse.unknownFields()) && Intrinsics.areEqual(this.applets, getMoneyTabAppletsResponse.applets);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.applets.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SandboxMetadata.Builder builder = new SandboxMetadata.Builder(11, false);
        builder.scenarios = this.applets;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.applets;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("applets=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetMoneyTabAppletsResponse{", "}", 0, null, null, 56);
    }
}
