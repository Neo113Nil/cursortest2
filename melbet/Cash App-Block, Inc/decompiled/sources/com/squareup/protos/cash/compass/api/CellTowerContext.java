package com.squareup.protos.cash.compass.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashface.api.TrustsData;
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
public final class CellTowerContext extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CellTowerContext> CREATOR;
    public final List towers;

    static {
        CellTowerContext$Companion$ADAPTER$1 cellTowerContext$Companion$ADAPTER$1 = new CellTowerContext$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CellTowerContext.class), "type.googleapis.com/squareup.cash.compass.api.v1.CellTowerContext", Syntax.PROTO_2, null, "squareup/cash/compass/api/v1/cell_tower_context.proto");
        ADAPTER = cellTowerContext$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cellTowerContext$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CellTowerContext(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.towers = TransactorKt.immutableCopyOf("towers", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CellTowerContext)) {
            return false;
        }
        CellTowerContext cellTowerContext = (CellTowerContext) obj;
        return Intrinsics.areEqual(unknownFields(), cellTowerContext.unknownFields()) && Intrinsics.areEqual(this.towers, cellTowerContext.towers);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.towers.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        TrustsData.Builder builder = new TrustsData.Builder(19);
        builder.trust = this.towers;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.towers;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("towers=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CellTowerContext{", "}", 0, null, null, 56);
    }

    public CellTowerContext(List list) {
        this(list, ByteString.EMPTY);
    }
}
