package com.squareup.protos.cash.janus.api;

import android.os.Parcelable;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes.dex */
public final class GetAccountSettingsRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetAccountSettingsRequest> CREATOR;

    static {
        GetAccountSettingsRequest$Companion$ADAPTER$1 getAccountSettingsRequest$Companion$ADAPTER$1 = new GetAccountSettingsRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetAccountSettingsRequest.class), "type.googleapis.com/squareup.cash.janus.api.GetAccountSettingsRequest", Syntax.PROTO_2, null, "squareup/cash/janus/api/AccountSettings.proto");
        ADAPTER = getAccountSettingsRequest$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getAccountSettingsRequest$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAccountSettingsRequest(ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof GetAccountSettingsRequest) && Intrinsics.areEqual(unknownFields(), ((GetAccountSettingsRequest) obj).unknownFields());
    }

    public final int hashCode() {
        return unknownFields().hashCode();
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Action.OpenID.Builder builder = new Action.OpenID.Builder(9);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        return "GetAccountSettingsRequest{}";
    }
}
