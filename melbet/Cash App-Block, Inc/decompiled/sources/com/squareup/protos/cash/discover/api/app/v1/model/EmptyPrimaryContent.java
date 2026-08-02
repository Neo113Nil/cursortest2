package com.squareup.protos.cash.discover.api.app.v1.model;

import android.os.Parcelable;
import com.squareup.protos.cash.cashlimitsxp.api.v1.Empty;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class EmptyPrimaryContent extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<EmptyPrimaryContent> CREATOR;

    static {
        EmptyPrimaryContent$Companion$ADAPTER$1 emptyPrimaryContent$Companion$ADAPTER$1 = new EmptyPrimaryContent$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EmptyPrimaryContent.class), "type.googleapis.com/squareup.cash.discover.api.app.v1.model.EmptyPrimaryContent", Syntax.PROTO_2, null, "squareup/cash/discover/api/app/v1/model/details_page.proto");
        ADAPTER = emptyPrimaryContent$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(emptyPrimaryContent$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmptyPrimaryContent(ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof EmptyPrimaryContent) && Intrinsics.areEqual(unknownFields(), ((EmptyPrimaryContent) obj).unknownFields());
    }

    public final int hashCode() {
        return unknownFields().hashCode();
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Empty.Builder builder = new Empty.Builder(24);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        return "EmptyPrimaryContent{}";
    }
}
