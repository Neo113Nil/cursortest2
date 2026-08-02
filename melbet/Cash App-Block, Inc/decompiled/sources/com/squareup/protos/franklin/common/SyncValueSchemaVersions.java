package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Headers;
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

/* loaded from: classes8.dex */
public final class SyncValueSchemaVersions extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SyncValueSchemaVersions> CREATOR;
    public final List versions;

    static {
        SyncValueSchemaVersions$Companion$ADAPTER$1 syncValueSchemaVersions$Companion$ADAPTER$1 = new SyncValueSchemaVersions$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SyncValueSchemaVersions.class), "type.googleapis.com/squareup.franklin.SyncValueSchemaVersions", Syntax.PROTO_2, null, "squareup/franklin/sync_entity.proto");
        ADAPTER = syncValueSchemaVersions$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(syncValueSchemaVersions$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncValueSchemaVersions(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.versions = TransactorKt.immutableCopyOf("versions", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SyncValueSchemaVersions)) {
            return false;
        }
        SyncValueSchemaVersions syncValueSchemaVersions = (SyncValueSchemaVersions) obj;
        return Intrinsics.areEqual(unknownFields(), syncValueSchemaVersions.unknownFields()) && Intrinsics.areEqual(this.versions, syncValueSchemaVersions.versions);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.versions.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Headers.Builder builder = new Headers.Builder(29, false);
        builder.header = this.versions;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.versions;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("versions=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SyncValueSchemaVersions{", "}", 0, null, null, 56);
    }
}
