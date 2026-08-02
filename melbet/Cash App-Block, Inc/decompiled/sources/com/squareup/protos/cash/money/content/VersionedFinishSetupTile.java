package com.squareup.protos.cash.money.content;

import android.os.Parcelable;
import com.squareup.protos.cash.local.client.v1.LocalBuyer;
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

/* loaded from: classes7.dex */
public final class VersionedFinishSetupTile extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<VersionedFinishSetupTile> CREATOR;
    public final VersionedFinishSetupTile$Payload$V1 payload;

    static {
        VersionedFinishSetupTile$Companion$ADAPTER$1 versionedFinishSetupTile$Companion$ADAPTER$1 = new VersionedFinishSetupTile$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(VersionedFinishSetupTile.class), "type.googleapis.com/squareup.cash.money.VersionedFinishSetupTile", Syntax.PROTO_2, null, "squareup/cash/money/content/finish_setup_tile.proto");
        ADAPTER = versionedFinishSetupTile$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(versionedFinishSetupTile$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VersionedFinishSetupTile(VersionedFinishSetupTile$Payload$V1 versionedFinishSetupTile$Payload$V1, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.payload = versionedFinishSetupTile$Payload$V1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VersionedFinishSetupTile)) {
            return false;
        }
        VersionedFinishSetupTile versionedFinishSetupTile = (VersionedFinishSetupTile) obj;
        return Intrinsics.areEqual(unknownFields(), versionedFinishSetupTile.unknownFields()) && Intrinsics.areEqual(this.payload, versionedFinishSetupTile.payload);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        VersionedFinishSetupTile$Payload$V1 versionedFinishSetupTile$Payload$V1 = this.payload;
        int hashCode2 = hashCode + (versionedFinishSetupTile$Payload$V1 != null ? versionedFinishSetupTile$Payload$V1.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        LocalBuyer.Builder builder = new LocalBuyer.Builder(24);
        builder.local_buyer = this.payload;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        VersionedFinishSetupTile$Payload$V1 versionedFinishSetupTile$Payload$V1 = this.payload;
        if (versionedFinishSetupTile$Payload$V1 != null) {
            arrayList.add("payload=" + versionedFinishSetupTile$Payload$V1);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "VersionedFinishSetupTile{", "}", 0, null, null, 56);
    }
}
