package com.squareup.protos.cash.weaver.api;

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
public final class ApStoreList extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ApStoreList> CREATOR;
    public final List store_ids;

    static {
        ApStoreList$Companion$ADAPTER$1 apStoreList$Companion$ADAPTER$1 = new ApStoreList$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ApStoreList.class), "type.googleapis.com/squareup.cash.weaver.api.ApStoreList", Syntax.PROTO_2, null, "squareup/cash/weaver/api/service.proto");
        ADAPTER = apStoreList$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(apStoreList$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApStoreList(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.store_ids = TransactorKt.immutableCopyOf("store_ids", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ApStoreList)) {
            return false;
        }
        ApStoreList apStoreList = (ApStoreList) obj;
        return Intrinsics.areEqual(unknownFields(), apStoreList.unknownFields()) && Intrinsics.areEqual(this.store_ids, apStoreList.store_ids);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.store_ids.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Headers.Builder builder = new Headers.Builder(8, false);
        builder.header = this.store_ids;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.store_ids;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("store_ids=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ApStoreList{", "}", 0, null, null, 56);
    }
}
