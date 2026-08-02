package com.squareup.protos.cash.customersearch.api;

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
public final class SearchCommonRowSection extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SearchCommonRowSection> CREATOR;
    public final List results;

    static {
        SearchCommonRowSection$Companion$ADAPTER$1 searchCommonRowSection$Companion$ADAPTER$1 = new SearchCommonRowSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SearchCommonRowSection.class), "type.googleapis.com/squareup.cash.customersearch.api.SearchCommonRowSection", Syntax.PROTO_2, null, "squareup/cash/customersearch/api/SearchCommon.proto");
        ADAPTER = searchCommonRowSection$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(searchCommonRowSection$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchCommonRowSection(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.results = TransactorKt.immutableCopyOf("results", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SearchCommonRowSection)) {
            return false;
        }
        SearchCommonRowSection searchCommonRowSection = (SearchCommonRowSection) obj;
        return Intrinsics.areEqual(unknownFields(), searchCommonRowSection.unknownFields()) && Intrinsics.areEqual(this.results, searchCommonRowSection.results);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.results.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        TrustsData.Builder builder = new TrustsData.Builder(29);
        builder.trust = this.results;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.results;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("results=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SearchCommonRowSection{", "}", 0, null, null, 56);
    }
}
