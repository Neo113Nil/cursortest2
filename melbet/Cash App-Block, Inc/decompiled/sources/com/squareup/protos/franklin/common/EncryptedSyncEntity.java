package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.protos.franklin.bankbook.Institution;
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
public final class EncryptedSyncEntity extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<EncryptedSyncEntity> CREATOR;
    public final ByteString encrypted_sync_entity;
    public final SyncValueType sync_value_type;

    /* renamed from: type, reason: collision with root package name */
    public final SyncEntityType f1377type;

    static {
        EncryptedSyncEntity$Companion$ADAPTER$1 encryptedSyncEntity$Companion$ADAPTER$1 = new EncryptedSyncEntity$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EncryptedSyncEntity.class), "type.googleapis.com/squareup.franklin.EncryptedSyncEntity", Syntax.PROTO_2, null, "squareup/franklin/sync_entity.proto");
        ADAPTER = encryptedSyncEntity$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(encryptedSyncEntity$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EncryptedSyncEntity(ByteString byteString, SyncEntityType syncEntityType, SyncValueType syncValueType, ByteString byteString2) {
        super(ADAPTER, byteString2);
        byteString2.getClass();
        this.encrypted_sync_entity = byteString;
        this.f1377type = syncEntityType;
        this.sync_value_type = syncValueType;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EncryptedSyncEntity)) {
            return false;
        }
        EncryptedSyncEntity encryptedSyncEntity = (EncryptedSyncEntity) obj;
        return Intrinsics.areEqual(unknownFields(), encryptedSyncEntity.unknownFields()) && Intrinsics.areEqual(this.encrypted_sync_entity, encryptedSyncEntity.encrypted_sync_entity) && this.f1377type == encryptedSyncEntity.f1377type && this.sync_value_type == encryptedSyncEntity.sync_value_type;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ByteString byteString = this.encrypted_sync_entity;
        int hashCode2 = (hashCode + (byteString != null ? byteString.hashCode() : 0)) * 37;
        SyncEntityType syncEntityType = this.f1377type;
        int hashCode3 = (hashCode2 + (syncEntityType != null ? syncEntityType.hashCode() : 0)) * 37;
        SyncValueType syncValueType = this.sync_value_type;
        int hashCode4 = hashCode3 + (syncValueType != null ? syncValueType.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Institution.Builder builder = new Institution.Builder(17, false);
        builder.institution_token = this.encrypted_sync_entity;
        builder.display_info = this.f1377type;
        builder.help_menu_items = this.sync_value_type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ByteString byteString = this.encrypted_sync_entity;
        if (byteString != null) {
            Request$Priority$EnumUnboxingLocalUtility.m("encrypted_sync_entity=", byteString, arrayList);
        }
        SyncEntityType syncEntityType = this.f1377type;
        if (syncEntityType != null) {
            arrayList.add("type=" + syncEntityType);
        }
        SyncValueType syncValueType = this.sync_value_type;
        if (syncValueType != null) {
            arrayList.add("sync_value_type=" + syncValueType);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "EncryptedSyncEntity{", "}", 0, null, null, 56);
    }
}
