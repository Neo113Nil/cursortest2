package com.squareup.protos.cash.janus.api;

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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/janus/api/GetContactAliasesResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/grantly/api/SandboxMetadata$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetContactAliasesResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetContactAliasesResponse> CREATOR;
    public final List aliases;

    static {
        GetContactAliasesResponse$Companion$ADAPTER$1 getContactAliasesResponse$Companion$ADAPTER$1 = new GetContactAliasesResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetContactAliasesResponse.class), "type.googleapis.com/squareup.cash.janus.api.GetContactAliasesResponse", Syntax.PROTO_2, null, "squareup/cash/janus/api/AccountHolder.proto");
        ADAPTER = getContactAliasesResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getContactAliasesResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetContactAliasesResponse(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.aliases = TransactorKt.immutableCopyOf("aliases", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetContactAliasesResponse)) {
            return false;
        }
        GetContactAliasesResponse getContactAliasesResponse = (GetContactAliasesResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getContactAliasesResponse.unknownFields()) && Intrinsics.areEqual(this.aliases, getContactAliasesResponse.aliases);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.aliases.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SandboxMetadata.Builder builder = new SandboxMetadata.Builder(23, false);
        builder.scenarios = this.aliases;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.aliases;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("aliases=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetContactAliasesResponse{", "}", 0, null, null, 56);
    }
}
