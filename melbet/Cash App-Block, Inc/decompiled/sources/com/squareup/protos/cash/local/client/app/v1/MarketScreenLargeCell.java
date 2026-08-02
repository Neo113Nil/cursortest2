package com.squareup.protos.cash.local.client.app.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.groups.Group;
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
public final class MarketScreenLargeCell extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<MarketScreenLargeCell> CREATOR;
    public final List hero_images;
    public final String profile_share_link_url;
    public final MarketScreenRowCell row_content;

    static {
        MarketScreenLargeCell$Companion$ADAPTER$1 marketScreenLargeCell$Companion$ADAPTER$1 = new MarketScreenLargeCell$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(MarketScreenLargeCell.class), "type.googleapis.com/squareup.cash.local.client.app.v1.MarketScreenLargeCell", Syntax.PROTO_2, null, "squareup/cash/local/client/app/v1/model.proto");
        ADAPTER = marketScreenLargeCell$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(marketScreenLargeCell$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketScreenLargeCell(List list, MarketScreenRowCell marketScreenRowCell, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.row_content = marketScreenRowCell;
        this.profile_share_link_url = str;
        this.hero_images = TransactorKt.immutableCopyOf("hero_images", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MarketScreenLargeCell)) {
            return false;
        }
        MarketScreenLargeCell marketScreenLargeCell = (MarketScreenLargeCell) obj;
        return Intrinsics.areEqual(unknownFields(), marketScreenLargeCell.unknownFields()) && Intrinsics.areEqual(this.hero_images, marketScreenLargeCell.hero_images) && Intrinsics.areEqual(this.row_content, marketScreenLargeCell.row_content) && Intrinsics.areEqual(this.profile_share_link_url, marketScreenLargeCell.profile_share_link_url);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.hero_images);
        MarketScreenRowCell marketScreenRowCell = this.row_content;
        int hashCode = (m + (marketScreenRowCell != null ? marketScreenRowCell.hashCode() : 0)) * 37;
        String str = this.profile_share_link_url;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Group.Builder builder = new Group.Builder(15);
        builder.participants = this.hero_images;
        builder.group_image = this.row_content;
        builder.name = this.profile_share_link_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.hero_images;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("hero_images=", arrayList, list);
        }
        MarketScreenRowCell marketScreenRowCell = this.row_content;
        if (marketScreenRowCell != null) {
            arrayList.add("row_content=" + marketScreenRowCell);
        }
        String str = this.profile_share_link_url;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "profile_share_link_url=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MarketScreenLargeCell{", "}", 0, null, null, 56);
    }
}
