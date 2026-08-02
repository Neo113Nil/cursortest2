package com.squareup.protos.cash.cashsuggest.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.groups.ExpenseSlice;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/cashsuggest/api/ShopCategoryBrowseResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/groups/ExpenseSlice$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ShopCategoryBrowseResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ShopCategoryBrowseResponse> CREATOR;
    public final String screen_subtitle;
    public final String screen_title;
    public final List sections;
    public final List toggle_screens;
    public final Button toolbar_button;
    public final Integer ttl_in_sec;

    static {
        ShopCategoryBrowseResponse$Companion$ADAPTER$1 shopCategoryBrowseResponse$Companion$ADAPTER$1 = new ShopCategoryBrowseResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ShopCategoryBrowseResponse.class), "type.googleapis.com/squareup.cash.cashsuggest.api.ShopCategoryBrowseResponse", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/ShopBrowse.proto");
        ADAPTER = shopCategoryBrowseResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(shopCategoryBrowseResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopCategoryBrowseResponse(List list, List list2, Integer num, String str, String str2, Button button, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.ttl_in_sec = num;
        this.screen_title = str;
        this.screen_subtitle = str2;
        this.toolbar_button = button;
        this.sections = TransactorKt.immutableCopyOf("sections", list);
        this.toggle_screens = TransactorKt.immutableCopyOf("toggle_screens", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ShopCategoryBrowseResponse)) {
            return false;
        }
        ShopCategoryBrowseResponse shopCategoryBrowseResponse = (ShopCategoryBrowseResponse) obj;
        return Intrinsics.areEqual(unknownFields(), shopCategoryBrowseResponse.unknownFields()) && Intrinsics.areEqual(this.sections, shopCategoryBrowseResponse.sections) && Intrinsics.areEqual(this.toggle_screens, shopCategoryBrowseResponse.toggle_screens) && Intrinsics.areEqual(this.ttl_in_sec, shopCategoryBrowseResponse.ttl_in_sec) && Intrinsics.areEqual(this.screen_title, shopCategoryBrowseResponse.screen_title) && Intrinsics.areEqual(this.screen_subtitle, shopCategoryBrowseResponse.screen_subtitle) && Intrinsics.areEqual(this.toolbar_button, shopCategoryBrowseResponse.toolbar_button);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.sections), 37, this.toggle_screens);
        Integer num = this.ttl_in_sec;
        int hashCode = (m + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        String str = this.screen_title;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.screen_subtitle;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Button button = this.toolbar_button;
        int hashCode4 = hashCode3 + (button != null ? button.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ExpenseSlice.Builder builder = new ExpenseSlice.Builder(1);
        builder.requester = this.sections;
        builder.responder = this.toggle_screens;
        builder.amount = this.ttl_in_sec;
        builder.slice_token = this.screen_title;
        builder.status = this.screen_subtitle;
        builder.action = this.toolbar_button;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.sections;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("sections=", arrayList, list);
        }
        List list2 = this.toggle_screens;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("toggle_screens=", arrayList, list2);
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
        return CollectionsKt.joinToString$default(arrayList, ", ", "ShopCategoryBrowseResponse{", "}", 0, null, null, 56);
    }
}
