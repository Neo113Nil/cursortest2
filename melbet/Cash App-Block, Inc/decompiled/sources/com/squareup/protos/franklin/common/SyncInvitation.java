package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.protos.franklin.ui.UiCashLimits;
import com.squareup.protos.franklin.ui.UiInvitation;
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
public final class SyncInvitation extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SyncInvitation> CREATOR;
    public final UiInvitation invitation;

    static {
        SyncInvitation$Companion$ADAPTER$1 syncInvitation$Companion$ADAPTER$1 = new SyncInvitation$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SyncInvitation.class), "type.googleapis.com/squareup.franklin.SyncInvitation", Syntax.PROTO_2, null, "squareup/franklin/sync_entity.proto");
        ADAPTER = syncInvitation$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(syncInvitation$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncInvitation(UiInvitation uiInvitation, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.invitation = uiInvitation;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SyncInvitation)) {
            return false;
        }
        SyncInvitation syncInvitation = (SyncInvitation) obj;
        return Intrinsics.areEqual(unknownFields(), syncInvitation.unknownFields()) && Intrinsics.areEqual(this.invitation, syncInvitation.invitation);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        UiInvitation uiInvitation = this.invitation;
        int hashCode2 = hashCode + (uiInvitation != null ? uiInvitation.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiCashLimits.Builder builder = new UiCashLimits.Builder(10);
        builder.cash_limit_group = this.invitation;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        UiInvitation uiInvitation = this.invitation;
        if (uiInvitation != null) {
            arrayList.add("invitation=" + uiInvitation);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SyncInvitation{", "}", 0, null, null, 56);
    }
}
