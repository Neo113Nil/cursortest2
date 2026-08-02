package com.squareup.protos.cash.giftly.app;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.badging.api.Badge;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
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
public final class GiftCardType extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GiftCardType> CREATOR;
    public final List category_tokens;
    public final String dark_theme_icon_url;
    public final String discount_text;
    public final String display_name;
    public final Image icon_image;
    public final String icon_url;
    public final Color themed_color;
    public final String token;

    static {
        GiftCardType$Companion$ADAPTER$1 giftCardType$Companion$ADAPTER$1 = new GiftCardType$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GiftCardType.class), "type.googleapis.com/squareup.cash.giftly.app.GiftCardType", Syntax.PROTO_2, null, "squareup/cash/giftly/app/service.proto");
        ADAPTER = giftCardType$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(giftCardType$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftCardType(String str, String str2, String str3, String str4, Image image, String str5, List list, Color color, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.token = str;
        this.display_name = str2;
        this.icon_url = str3;
        this.dark_theme_icon_url = str4;
        this.icon_image = image;
        this.discount_text = str5;
        this.themed_color = color;
        this.category_tokens = TransactorKt.immutableCopyOf("category_tokens", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GiftCardType)) {
            return false;
        }
        GiftCardType giftCardType = (GiftCardType) obj;
        return Intrinsics.areEqual(unknownFields(), giftCardType.unknownFields()) && Intrinsics.areEqual(this.token, giftCardType.token) && Intrinsics.areEqual(this.display_name, giftCardType.display_name) && Intrinsics.areEqual(this.icon_url, giftCardType.icon_url) && Intrinsics.areEqual(this.dark_theme_icon_url, giftCardType.dark_theme_icon_url) && Intrinsics.areEqual(this.icon_image, giftCardType.icon_image) && Intrinsics.areEqual(this.discount_text, giftCardType.discount_text) && Intrinsics.areEqual(this.category_tokens, giftCardType.category_tokens) && Intrinsics.areEqual(this.themed_color, giftCardType.themed_color);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.display_name;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.icon_url;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.dark_theme_icon_url;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Image image = this.icon_image;
        int hashCode6 = (hashCode5 + (image != null ? image.hashCode() : 0)) * 37;
        String str5 = this.discount_text;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 37, 37, this.category_tokens);
        Color color = this.themed_color;
        int hashCode7 = m + (color != null ? color.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Badge.Builder builder = new Badge.Builder(26, false);
        builder.external_token = this.token;
        builder.customer_token = this.display_name;
        builder.external_version = this.icon_url;
        builder.updated_at = this.dark_theme_icon_url;
        builder.created_at = this.icon_image;
        builder.is_badged = this.discount_text;
        builder.count_groups = this.category_tokens;
        builder.item_type = this.themed_color;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        String str2 = this.display_name;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "display_name=", arrayList);
        }
        if (this.icon_url != null) {
            arrayList.add("icon_url=██");
        }
        if (this.dark_theme_icon_url != null) {
            arrayList.add("dark_theme_icon_url=██");
        }
        Image image = this.icon_image;
        if (image != null) {
            SizeMode$EnumUnboxingLocalUtility.m("icon_image=", image, arrayList);
        }
        String str3 = this.discount_text;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "discount_text=", arrayList);
        }
        List list = this.category_tokens;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("category_tokens=", arrayList, list);
        }
        Color color = this.themed_color;
        if (color != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("themed_color=", color, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GiftCardType{", "}", 0, null, null, 56);
    }
}
