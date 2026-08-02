package com.squareup.cash.supportarticles.app.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
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
import xyz.block.protos.genie.Submit;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/cash/supportarticles/app/v1/ListSupportArticlesResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lxyz/block/protos/genie/Submit$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ListSupportArticlesResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ListSupportArticlesResponse> CREATOR;
    public final List articles;
    public final List home_article_ids;
    public final List links;
    public final String stylesheet_url;

    static {
        ListSupportArticlesResponse$Companion$ADAPTER$1 listSupportArticlesResponse$Companion$ADAPTER$1 = new ListSupportArticlesResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ListSupportArticlesResponse.class), "type.googleapis.com/squareup.cash.supportarticles.app.v1beta1.ListSupportArticlesResponse", Syntax.PROTO_3, null, "squareup/cash/supportarticles/app/v1beta1/app.proto");
        ADAPTER = listSupportArticlesResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(listSupportArticlesResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListSupportArticlesResponse(String str, List list, List list2, List list3, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, list3, byteString);
        this.stylesheet_url = str;
        this.articles = TransactorKt.immutableCopyOf("articles", list);
        this.home_article_ids = TransactorKt.immutableCopyOf("home_article_ids", list2);
        this.links = TransactorKt.immutableCopyOf("links", list3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ListSupportArticlesResponse)) {
            return false;
        }
        ListSupportArticlesResponse listSupportArticlesResponse = (ListSupportArticlesResponse) obj;
        return Intrinsics.areEqual(unknownFields(), listSupportArticlesResponse.unknownFields()) && Intrinsics.areEqual(this.articles, listSupportArticlesResponse.articles) && Intrinsics.areEqual(this.home_article_ids, listSupportArticlesResponse.home_article_ids) && Intrinsics.areEqual(this.stylesheet_url, listSupportArticlesResponse.stylesheet_url) && Intrinsics.areEqual(this.links, listSupportArticlesResponse.links);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.articles), 37, this.home_article_ids);
        String str = this.stylesheet_url;
        int hashCode = this.links.hashCode() + ((m + (str != null ? str.hashCode() : 0)) * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Submit.Builder builder = new Submit.Builder(1);
        builder.request_value_mappings = this.articles;
        builder.on_start_value_mappings = this.home_article_ids;
        builder.action_id = this.stylesheet_url;
        builder.on_error_value_mappings = this.links;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.articles;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("articles=", arrayList, list);
        }
        List list2 = this.home_article_ids;
        if (!list2.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("home_article_ids=", arrayList, list2);
        }
        String str = this.stylesheet_url;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "stylesheet_url=", arrayList);
        }
        List list3 = this.links;
        if (!list3.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("links=", arrayList, list3);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ListSupportArticlesResponse{", "}", 0, null, null, 56);
    }
}
