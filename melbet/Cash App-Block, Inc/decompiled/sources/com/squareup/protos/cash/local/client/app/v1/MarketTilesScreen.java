package com.squareup.protos.cash.local.client.app.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashsuggest.api.ToggleScreen;
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

/* loaded from: classes.dex */
public final class MarketTilesScreen extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<MarketTilesScreen> CREATOR;
    public final List brand_tiles;
    public final String title;

    static {
        MarketTilesScreen$Companion$ADAPTER$1 marketTilesScreen$Companion$ADAPTER$1 = new MarketTilesScreen$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(MarketTilesScreen.class), "type.googleapis.com/squareup.cash.local.client.app.v1.MarketTilesScreen", Syntax.PROTO_2, null, "squareup/cash/local/client/app/v1/market_tiles.proto");
        ADAPTER = marketTilesScreen$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(marketTilesScreen$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketTilesScreen(String str, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.title = str;
        this.brand_tiles = TransactorKt.immutableCopyOf("brand_tiles", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MarketTilesScreen)) {
            return false;
        }
        MarketTilesScreen marketTilesScreen = (MarketTilesScreen) obj;
        return Intrinsics.areEqual(unknownFields(), marketTilesScreen.unknownFields()) && Intrinsics.areEqual(this.title, marketTilesScreen.title) && Intrinsics.areEqual(this.brand_tiles, marketTilesScreen.brand_tiles);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.title;
        int hashCode2 = this.brand_tiles.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 37);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ToggleScreen.Builder builder = new ToggleScreen.Builder(18);
        builder.toggle_title = this.title;
        builder.sections = this.brand_tiles;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
        }
        List list = this.brand_tiles;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("brand_tiles=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MarketTilesScreen{", "}", 0, null, null, 56);
    }
}
