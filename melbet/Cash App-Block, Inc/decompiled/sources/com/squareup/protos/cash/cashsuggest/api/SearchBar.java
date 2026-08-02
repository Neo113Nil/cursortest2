package com.squareup.protos.cash.cashsuggest.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.aliases.Cashtag;
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
public final class SearchBar extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SearchBar> CREATOR;
    public final String action_url;
    public final String prompt_text;

    static {
        SearchBar$Companion$ADAPTER$1 searchBar$Companion$ADAPTER$1 = new SearchBar$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SearchBar.class), "type.googleapis.com/squareup.cash.cashsuggest.api.SearchBar", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/Common.proto");
        ADAPTER = searchBar$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(searchBar$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBar(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.prompt_text = str;
        this.action_url = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SearchBar)) {
            return false;
        }
        SearchBar searchBar = (SearchBar) obj;
        return Intrinsics.areEqual(unknownFields(), searchBar.unknownFields()) && Intrinsics.areEqual(this.prompt_text, searchBar.prompt_text) && Intrinsics.areEqual(this.action_url, searchBar.action_url);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.prompt_text;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.action_url;
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Cashtag.Builder builder = new Cashtag.Builder(22);
        builder.prefix = this.prompt_text;
        builder.name = this.action_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.prompt_text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "prompt_text=", arrayList);
        }
        String str2 = this.action_url;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "action_url=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SearchBar{", "}", 0, null, null, 56);
    }
}
