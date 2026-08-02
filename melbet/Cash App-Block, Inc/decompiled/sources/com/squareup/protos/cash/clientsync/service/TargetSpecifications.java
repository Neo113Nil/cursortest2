package com.squareup.protos.cash.clientsync.service;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.composer.app.Card;
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
public final class TargetSpecifications extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TargetSpecifications> CREATOR;
    public final List domain_types;
    public final SyncTopic sync_topic;

    static {
        TargetSpecifications$Companion$ADAPTER$1 targetSpecifications$Companion$ADAPTER$1 = new TargetSpecifications$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TargetSpecifications.class), "type.googleapis.com/squareup.cash.clientsync.service.TargetSpecifications", Syntax.PROTO_2, null, "squareup/cash/clientsync/service.proto");
        ADAPTER = targetSpecifications$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(targetSpecifications$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TargetSpecifications(SyncTopic syncTopic, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.sync_topic = syncTopic;
        this.domain_types = TransactorKt.immutableCopyOf("domain_types", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TargetSpecifications)) {
            return false;
        }
        TargetSpecifications targetSpecifications = (TargetSpecifications) obj;
        return Intrinsics.areEqual(unknownFields(), targetSpecifications.unknownFields()) && this.sync_topic == targetSpecifications.sync_topic && Intrinsics.areEqual(this.domain_types, targetSpecifications.domain_types);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        SyncTopic syncTopic = this.sync_topic;
        int hashCode2 = this.domain_types.hashCode() + ((hashCode + (syncTopic != null ? syncTopic.hashCode() : 0)) * 37);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Card.Builder builder = new Card.Builder(28);
        builder.image_url = this.sync_topic;
        builder.asset = this.domain_types;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        SyncTopic syncTopic = this.sync_topic;
        if (syncTopic != null) {
            arrayList.add("sync_topic=" + syncTopic);
        }
        List list = this.domain_types;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("domain_types=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TargetSpecifications{", "}", 0, null, null, 56);
    }

    public TargetSpecifications(SyncTopic syncTopic, List list) {
        this(syncTopic, list, ByteString.EMPTY);
    }
}
