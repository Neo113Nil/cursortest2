package com.squareup.protos.cash.treelot.app;

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
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/treelot/app/TreehouseConfigResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/common/Headers$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TreehouseConfigResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TreehouseConfigResponse> CREATOR;
    public final List apps;

    static {
        TreehouseConfigResponse$Companion$ADAPTER$1 treehouseConfigResponse$Companion$ADAPTER$1 = new TreehouseConfigResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TreehouseConfigResponse.class), "type.googleapis.com/squareup.cash.treelot.TreehouseConfigResponse", Syntax.PROTO_2, null, "squareup/cash/treelot/app/TreehouseApp.proto");
        ADAPTER = treehouseConfigResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(treehouseConfigResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TreehouseConfigResponse(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.apps = TransactorKt.immutableCopyOf("apps", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TreehouseConfigResponse)) {
            return false;
        }
        TreehouseConfigResponse treehouseConfigResponse = (TreehouseConfigResponse) obj;
        return Intrinsics.areEqual(unknownFields(), treehouseConfigResponse.unknownFields()) && Intrinsics.areEqual(this.apps, treehouseConfigResponse.apps);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.apps.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Headers.Builder builder = new Headers.Builder(5, false);
        builder.header = this.apps;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.apps;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("apps=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TreehouseConfigResponse{", "}", 0, null, null, 56);
    }
}
