package com.squareup.protos.cash.local.client.app.v1.card;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.discover.api.app.v1.model.Text;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
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
public final class MiniCard extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<MiniCard> CREATOR;
    public final Image artwork_image;
    public final Color background_color;
    public final Color brand_card_outline_color;
    public final Image icon;
    public final String title;

    static {
        MiniCard$Companion$ADAPTER$1 miniCard$Companion$ADAPTER$1 = new MiniCard$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(MiniCard.class), "type.googleapis.com/squareup.cash.local.client.app.v1.card.MiniCard", Syntax.PROTO_2, null, "squareup/cash/local/client/app/v1/card/local_card.proto");
        ADAPTER = miniCard$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(miniCard$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniCard(String str, Color color, Image image, Image image2, Color color2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.title = str;
        this.background_color = color;
        this.icon = image;
        this.artwork_image = image2;
        this.brand_card_outline_color = color2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MiniCard)) {
            return false;
        }
        MiniCard miniCard = (MiniCard) obj;
        return Intrinsics.areEqual(unknownFields(), miniCard.unknownFields()) && Intrinsics.areEqual(this.title, miniCard.title) && Intrinsics.areEqual(this.background_color, miniCard.background_color) && Intrinsics.areEqual(this.icon, miniCard.icon) && Intrinsics.areEqual(this.artwork_image, miniCard.artwork_image) && Intrinsics.areEqual(this.brand_card_outline_color, miniCard.brand_card_outline_color);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.title;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Color color = this.background_color;
        int hashCode3 = (hashCode2 + (color != null ? color.hashCode() : 0)) * 37;
        Image image = this.icon;
        int hashCode4 = (hashCode3 + (image != null ? image.hashCode() : 0)) * 37;
        Image image2 = this.artwork_image;
        int hashCode5 = (hashCode4 + (image2 != null ? image2.hashCode() : 0)) * 37;
        Color color2 = this.brand_card_outline_color;
        int hashCode6 = hashCode5 + (color2 != null ? color2.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Text.Builder builder = new Text.Builder(28);
        builder.text = this.title;
        builder.text_color = this.background_color;
        builder.icon = this.icon;
        builder.text_style = this.artwork_image;
        builder.text_decoration = this.brand_card_outline_color;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
        }
        Color color = this.background_color;
        if (color != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("background_color=", color, arrayList);
        }
        Image image = this.icon;
        if (image != null) {
            SizeMode$EnumUnboxingLocalUtility.m("icon=", image, arrayList);
        }
        Image image2 = this.artwork_image;
        if (image2 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("artwork_image=", image2, arrayList);
        }
        Color color2 = this.brand_card_outline_color;
        if (color2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("brand_card_outline_color=", color2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MiniCard{", "}", 0, null, null, 56);
    }
}
