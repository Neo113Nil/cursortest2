package com.squareup.cash.supportarticles.app.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.appthemes.Gradient;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/cash/supportarticles/app/v1/SearchSupportArticlesResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/appthemes/Gradient$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SearchSupportArticlesResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SearchSupportArticlesResponse> CREATOR;
    public final List links;

    static {
        SearchSupportArticlesResponse$Companion$ADAPTER$1 searchSupportArticlesResponse$Companion$ADAPTER$1 = new SearchSupportArticlesResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SearchSupportArticlesResponse.class), "type.googleapis.com/squareup.cash.supportarticles.app.v1beta1.SearchSupportArticlesResponse", Syntax.PROTO_3, null, "squareup/cash/supportarticles/app/v1beta1/app.proto");
        ADAPTER = searchSupportArticlesResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(searchSupportArticlesResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchSupportArticlesResponse(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.links = TransactorKt.immutableCopyOf("links", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SearchSupportArticlesResponse)) {
            return false;
        }
        SearchSupportArticlesResponse searchSupportArticlesResponse = (SearchSupportArticlesResponse) obj;
        return Intrinsics.areEqual(unknownFields(), searchSupportArticlesResponse.unknownFields()) && Intrinsics.areEqual(this.links, searchSupportArticlesResponse.links);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.links.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Gradient.Builder builder = new Gradient.Builder(13, false);
        builder.colors = this.links;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.links;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("links=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SearchSupportArticlesResponse{", "}", 0, null, null, 56);
    }
}
