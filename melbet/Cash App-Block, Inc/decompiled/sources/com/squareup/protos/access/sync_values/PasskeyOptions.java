package com.squareup.protos.access.sync_values;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.appthemes.Gradient;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PasskeyOptions extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PasskeyOptions> CREATOR;
    public final List registered_credentials;

    static {
        PasskeyOptions$Companion$ADAPTER$1 passkeyOptions$Companion$ADAPTER$1 = new PasskeyOptions$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PasskeyOptions.class), "type.googleapis.com/squareup.access.sync_values.PasskeyOptions", Syntax.PROTO_2, null, "squareup/access/sync_values.proto");
        ADAPTER = passkeyOptions$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(passkeyOptions$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyOptions(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.registered_credentials = TransactorKt.immutableCopyOf("registered_credentials", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PasskeyOptions)) {
            return false;
        }
        PasskeyOptions passkeyOptions = (PasskeyOptions) obj;
        return Intrinsics.areEqual(unknownFields(), passkeyOptions.unknownFields()) && Intrinsics.areEqual(this.registered_credentials, passkeyOptions.registered_credentials);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.registered_credentials.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Gradient.Builder builder = new Gradient.Builder(15, false);
        builder.colors = this.registered_credentials;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.registered_credentials;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("registered_credentials=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PasskeyOptions{", "}", 0, null, null, 56);
    }
}
