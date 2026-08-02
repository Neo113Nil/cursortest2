package com.squareup.protos.cash.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.idv.DisplayName;
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
public final class PaginationResponseMetadata extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PaginationResponseMetadata> CREATOR;
    public final String cursor;

    static {
        PaginationResponseMetadata$Companion$ADAPTER$1 paginationResponseMetadata$Companion$ADAPTER$1 = new PaginationResponseMetadata$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PaginationResponseMetadata.class), "type.googleapis.com/squareup.cash.api.PaginationResponseMetadata", Syntax.PROTO_2, null, "squareup/cash/api/contract.proto");
        ADAPTER = paginationResponseMetadata$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(paginationResponseMetadata$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaginationResponseMetadata(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.cursor = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PaginationResponseMetadata)) {
            return false;
        }
        PaginationResponseMetadata paginationResponseMetadata = (PaginationResponseMetadata) obj;
        return Intrinsics.areEqual(unknownFields(), paginationResponseMetadata.unknownFields()) && Intrinsics.areEqual(this.cursor, paginationResponseMetadata.cursor);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.cursor;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        DisplayName.Builder builder = new DisplayName.Builder(18);
        builder.display_name = this.cursor;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.cursor;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "cursor=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PaginationResponseMetadata{", "}", 0, null, null, 56);
    }
}
