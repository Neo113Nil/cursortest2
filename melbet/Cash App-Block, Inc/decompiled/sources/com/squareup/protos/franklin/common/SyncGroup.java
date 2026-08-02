package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.protos.cash.groups.Group;
import com.squareup.protos.franklin.ui.UiCashLimits;
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
public final class SyncGroup extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SyncGroup> CREATOR;
    public final Group group;

    static {
        SyncGroup$Companion$ADAPTER$1 syncGroup$Companion$ADAPTER$1 = new SyncGroup$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SyncGroup.class), "type.googleapis.com/squareup.franklin.SyncGroup", Syntax.PROTO_2, null, "squareup/franklin/sync_entity.proto");
        ADAPTER = syncGroup$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(syncGroup$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncGroup(Group group, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.group = group;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SyncGroup)) {
            return false;
        }
        SyncGroup syncGroup = (SyncGroup) obj;
        return Intrinsics.areEqual(unknownFields(), syncGroup.unknownFields()) && Intrinsics.areEqual(this.group, syncGroup.group);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Group group = this.group;
        int hashCode2 = hashCode + (group != null ? group.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiCashLimits.Builder builder = new UiCashLimits.Builder(8);
        builder.cash_limit_group = this.group;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Group group = this.group;
        if (group != null) {
            arrayList.add("group=" + group);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SyncGroup{", "}", 0, null, null, 56);
    }
}
