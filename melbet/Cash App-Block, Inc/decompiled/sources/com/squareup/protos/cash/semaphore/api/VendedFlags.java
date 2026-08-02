package com.squareup.protos.cash.semaphore.api;

import android.os.Parcelable;
import com.squareup.protos.cash.pools.ListPoolsRequest;
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
public final class VendedFlags extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<VendedFlags> CREATOR;
    public final VendedFlagNode root;

    static {
        VendedFlags$Companion$ADAPTER$1 vendedFlags$Companion$ADAPTER$1 = new VendedFlags$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(VendedFlags.class), "type.googleapis.com/squareup.cash.semaphore.api.VendedFlags", Syntax.PROTO_2, null, "squareup/cash/semaphore/api/VendedFlags.proto");
        ADAPTER = vendedFlags$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(vendedFlags$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VendedFlags(VendedFlagNode vendedFlagNode, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.root = vendedFlagNode;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VendedFlags)) {
            return false;
        }
        VendedFlags vendedFlags = (VendedFlags) obj;
        return Intrinsics.areEqual(unknownFields(), vendedFlags.unknownFields()) && Intrinsics.areEqual(this.root, vendedFlags.root);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        VendedFlagNode vendedFlagNode = this.root;
        int hashCode2 = hashCode + (vendedFlagNode != null ? vendedFlagNode.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ListPoolsRequest.Builder builder = new ListPoolsRequest.Builder(16);
        builder.pool_lifecycle_filter = this.root;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        VendedFlagNode vendedFlagNode = this.root;
        if (vendedFlagNode != null) {
            arrayList.add("root=" + vendedFlagNode);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "VendedFlags{", "}", 0, null, null, 56);
    }
}
