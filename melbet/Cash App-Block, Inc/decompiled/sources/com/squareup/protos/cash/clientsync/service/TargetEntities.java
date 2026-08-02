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
public final class TargetEntities extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TargetEntities> CREATOR;
    public final List entities;
    public final TargetSpecifications target_specifications;

    static {
        TargetEntities$Companion$ADAPTER$1 targetEntities$Companion$ADAPTER$1 = new TargetEntities$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TargetEntities.class), "type.googleapis.com/squareup.cash.clientsync.service.TargetEntities", Syntax.PROTO_2, null, "squareup/cash/clientsync/app.proto");
        ADAPTER = targetEntities$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(targetEntities$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TargetEntities(TargetSpecifications targetSpecifications, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.target_specifications = targetSpecifications;
        this.entities = TransactorKt.immutableCopyOf("entities", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TargetEntities)) {
            return false;
        }
        TargetEntities targetEntities = (TargetEntities) obj;
        return Intrinsics.areEqual(unknownFields(), targetEntities.unknownFields()) && Intrinsics.areEqual(this.target_specifications, targetEntities.target_specifications) && Intrinsics.areEqual(this.entities, targetEntities.entities);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        TargetSpecifications targetSpecifications = this.target_specifications;
        int hashCode2 = this.entities.hashCode() + ((hashCode + (targetSpecifications != null ? targetSpecifications.hashCode() : 0)) * 37);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Card.Builder builder = new Card.Builder(27);
        builder.image_url = this.target_specifications;
        builder.asset = this.entities;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        TargetSpecifications targetSpecifications = this.target_specifications;
        if (targetSpecifications != null) {
            arrayList.add("target_specifications=" + targetSpecifications);
        }
        List list = this.entities;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("entities=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TargetEntities{", "}", 0, null, null, 56);
    }
}
