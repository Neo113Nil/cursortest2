package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.AppLinks;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SyncValueSchemaVersion extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SyncValueSchemaVersion> CREATOR;

    /* renamed from: type, reason: collision with root package name */
    public final SyncValueType f1394type;
    public final Long version;

    static {
        SyncValueSchemaVersion$Companion$ADAPTER$1 syncValueSchemaVersion$Companion$ADAPTER$1 = new SyncValueSchemaVersion$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SyncValueSchemaVersion.class), "type.googleapis.com/squareup.franklin.SyncValueSchemaVersion", Syntax.PROTO_2, null, "squareup/franklin/sync_entity.proto");
        ADAPTER = syncValueSchemaVersion$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(syncValueSchemaVersion$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncValueSchemaVersion(SyncValueType syncValueType, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.f1394type = syncValueType;
        this.version = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SyncValueSchemaVersion)) {
            return false;
        }
        SyncValueSchemaVersion syncValueSchemaVersion = (SyncValueSchemaVersion) obj;
        return Intrinsics.areEqual(unknownFields(), syncValueSchemaVersion.unknownFields()) && this.f1394type == syncValueSchemaVersion.f1394type && Intrinsics.areEqual(this.version, syncValueSchemaVersion.version);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        SyncValueType syncValueType = this.f1394type;
        int hashCode2 = (hashCode + (syncValueType != null ? syncValueType.hashCode() : 0)) * 37;
        Long l = this.version;
        int hashCode3 = hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        AppLinks.Builder builder = new AppLinks.Builder(22);
        builder.f1372android = this.f1394type;
        builder.ios = this.version;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        SyncValueType syncValueType = this.f1394type;
        if (syncValueType != null) {
            arrayList.add("type=" + syncValueType);
        }
        Long l = this.version;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("version=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SyncValueSchemaVersion{", "}", 0, null, null, 56);
    }
}
