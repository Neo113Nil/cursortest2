package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import com.squareup.protos.franklin.app.GetProfileRequest;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes.dex */
public final class CheckVersionRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CheckVersionRequest> CREATOR;

    static {
        CheckVersionRequest$Companion$ADAPTER$1 checkVersionRequest$Companion$ADAPTER$1 = new CheckVersionRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CheckVersionRequest.class), "type.googleapis.com/squareup.franklin.app.CheckVersionRequest", Syntax.PROTO_2, null, "squareup/franklin/app/version.proto");
        ADAPTER = checkVersionRequest$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(checkVersionRequest$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckVersionRequest(ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof CheckVersionRequest) && Intrinsics.areEqual(unknownFields(), ((CheckVersionRequest) obj).unknownFields());
    }

    public final int hashCode() {
        return unknownFields().hashCode();
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GetProfileRequest.Builder builder = new GetProfileRequest.Builder(19);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        return "CheckVersionRequest{}";
    }
}
