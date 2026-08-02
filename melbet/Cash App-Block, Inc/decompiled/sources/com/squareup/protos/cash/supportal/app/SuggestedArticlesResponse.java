package com.squareup.protos.cash.supportal.app;

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
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Deprecated
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/supportal/app/SuggestedArticlesResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/common/Headers$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SuggestedArticlesResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SuggestedArticlesResponse> CREATOR;
    public final List matched_nodes;

    static {
        SuggestedArticlesResponse$Companion$ADAPTER$1 suggestedArticlesResponse$Companion$ADAPTER$1 = new SuggestedArticlesResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SuggestedArticlesResponse.class), "type.googleapis.com/squareup.cash.supportal.app.SuggestedArticlesResponse", Syntax.PROTO_2, null, "squareup/cash/supportal/app.proto");
        ADAPTER = suggestedArticlesResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(suggestedArticlesResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuggestedArticlesResponse(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.matched_nodes = TransactorKt.immutableCopyOf("matched_nodes", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SuggestedArticlesResponse)) {
            return false;
        }
        SuggestedArticlesResponse suggestedArticlesResponse = (SuggestedArticlesResponse) obj;
        return Intrinsics.areEqual(unknownFields(), suggestedArticlesResponse.unknownFields()) && Intrinsics.areEqual(this.matched_nodes, suggestedArticlesResponse.matched_nodes);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.matched_nodes.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Headers.Builder builder = new Headers.Builder(4, false);
        builder.header = this.matched_nodes;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.matched_nodes;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("matched_nodes=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SuggestedArticlesResponse{", "}", 0, null, null, 56);
    }
}
