package com.squareup.protos.cash.cashsuggest.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.api.Error;
import com.squareup.protos.cash.p2p.profile_directory.ui.Button;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/cashsuggest/api/ShopBrowseResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/api/Error$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ShopBrowseResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ShopBrowseResponse> CREATOR;
    public final String screen_subtitle;
    public final String screen_title;
    public final SearchBar search_bar;
    public final List sections;
    public final Button toolbar_button;
    public final Integer ttl_in_sec;

    static {
        ShopBrowseResponse$Companion$ADAPTER$1 shopBrowseResponse$Companion$ADAPTER$1 = new ShopBrowseResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ShopBrowseResponse.class), "type.googleapis.com/squareup.cash.cashsuggest.api.ShopBrowseResponse", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/ShopBrowse.proto");
        ADAPTER = shopBrowseResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(shopBrowseResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopBrowseResponse(List list, Integer num, String str, String str2, Button button, SearchBar searchBar, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.ttl_in_sec = num;
        this.screen_title = str;
        this.screen_subtitle = str2;
        this.toolbar_button = button;
        this.search_bar = searchBar;
        this.sections = TransactorKt.immutableCopyOf("sections", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ShopBrowseResponse)) {
            return false;
        }
        ShopBrowseResponse shopBrowseResponse = (ShopBrowseResponse) obj;
        return Intrinsics.areEqual(unknownFields(), shopBrowseResponse.unknownFields()) && Intrinsics.areEqual(this.sections, shopBrowseResponse.sections) && Intrinsics.areEqual(this.ttl_in_sec, shopBrowseResponse.ttl_in_sec) && Intrinsics.areEqual(this.screen_title, shopBrowseResponse.screen_title) && Intrinsics.areEqual(this.screen_subtitle, shopBrowseResponse.screen_subtitle) && Intrinsics.areEqual(this.toolbar_button, shopBrowseResponse.toolbar_button) && Intrinsics.areEqual(this.search_bar, shopBrowseResponse.search_bar);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.sections);
        Integer num = this.ttl_in_sec;
        int hashCode = (m + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        String str = this.screen_title;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.screen_subtitle;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Button button = this.toolbar_button;
        int hashCode4 = (hashCode3 + (button != null ? button.hashCode() : 0)) * 37;
        SearchBar searchBar = this.search_bar;
        int hashCode5 = hashCode4 + (searchBar != null ? searchBar.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Error.Builder builder = new Error.Builder(29, false);
        builder.category = this.sections;
        builder.code = this.ttl_in_sec;
        builder.description = this.screen_title;
        builder.field = this.screen_subtitle;
        builder.retryable = this.toolbar_button;
        builder.metadata = this.search_bar;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.sections;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("sections=", arrayList, list);
        }
        Integer num = this.ttl_in_sec;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("ttl_in_sec=", num, arrayList);
        }
        String str = this.screen_title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "screen_title=", arrayList);
        }
        String str2 = this.screen_subtitle;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "screen_subtitle=", arrayList);
        }
        Button button = this.toolbar_button;
        if (button != null) {
            arrayList.add("toolbar_button=" + button);
        }
        SearchBar searchBar = this.search_bar;
        if (searchBar != null) {
            arrayList.add("search_bar=" + searchBar);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ShopBrowseResponse{", "}", 0, null, null, 56);
    }
}
