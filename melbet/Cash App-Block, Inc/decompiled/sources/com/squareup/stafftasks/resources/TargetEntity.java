package com.squareup.stafftasks.resources;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
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
import squareup.cash.bills.BillsConfig;

/* loaded from: classes8.dex */
public final class TargetEntity extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TargetEntity> CREATOR;
    public final TargetEntityType entity_type;
    public final String id;

    static {
        TargetEntity$Companion$ADAPTER$1 targetEntity$Companion$ADAPTER$1 = new TargetEntity$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TargetEntity.class), "type.googleapis.com/squareup.stafftasks.TargetEntity", Syntax.PROTO_2, null, "squareup/stafftasks/resources/datatypes.proto");
        ADAPTER = targetEntity$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(targetEntity$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TargetEntity(String str, TargetEntityType targetEntityType, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.id = str;
        this.entity_type = targetEntityType;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TargetEntity)) {
            return false;
        }
        TargetEntity targetEntity = (TargetEntity) obj;
        return Intrinsics.areEqual(unknownFields(), targetEntity.unknownFields()) && Intrinsics.areEqual(this.id, targetEntity.id) && this.entity_type == targetEntity.entity_type;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        TargetEntityType targetEntityType = this.entity_type;
        int hashCode3 = hashCode2 + (targetEntityType != null ? targetEntityType.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BillsConfig.Builder builder = new BillsConfig.Builder(6);
        builder.bills_applet_default_action = this.id;
        builder.half_applet_content = this.entity_type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "id=", arrayList);
        }
        TargetEntityType targetEntityType = this.entity_type;
        if (targetEntityType != null) {
            arrayList.add("entity_type=" + targetEntityType);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TargetEntity{", "}", 0, null, null, 56);
    }
}
