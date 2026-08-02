package com.squareup.protos.cash.shop.rendering.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.postcard.CardScheme;
import com.squareup.protos.cash.ui.Color;
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

/* loaded from: classes8.dex */
public final class SheetStyledDetails extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SheetStyledDetails> CREATOR;
    public final Color background_color;
    public final StyledText subtitle;
    public final StyledText title;

    static {
        SheetStyledDetails$Companion$ADAPTER$1 sheetStyledDetails$Companion$ADAPTER$1 = new SheetStyledDetails$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SheetStyledDetails.class), "type.googleapis.com/squareup.cash.shop.rendering.api.SheetStyledDetails", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/Sheets.proto");
        ADAPTER = sheetStyledDetails$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(sheetStyledDetails$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SheetStyledDetails(StyledText styledText, StyledText styledText2, Color color, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.title = styledText;
        this.subtitle = styledText2;
        this.background_color = color;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SheetStyledDetails)) {
            return false;
        }
        SheetStyledDetails sheetStyledDetails = (SheetStyledDetails) obj;
        return Intrinsics.areEqual(unknownFields(), sheetStyledDetails.unknownFields()) && Intrinsics.areEqual(this.title, sheetStyledDetails.title) && Intrinsics.areEqual(this.subtitle, sheetStyledDetails.subtitle) && Intrinsics.areEqual(this.background_color, sheetStyledDetails.background_color);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        StyledText styledText = this.title;
        int hashCode2 = (hashCode + (styledText != null ? styledText.hashCode() : 0)) * 37;
        StyledText styledText2 = this.subtitle;
        int hashCode3 = (hashCode2 + (styledText2 != null ? styledText2.hashCode() : 0)) * 37;
        Color color = this.background_color;
        int hashCode4 = hashCode3 + (color != null ? color.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CardScheme.Builder builder = new CardScheme.Builder(23);
        builder.modules = this.title;
        builder.overflow_modules = this.subtitle;
        builder.card_home_actions = this.background_color;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        StyledText styledText = this.title;
        if (styledText != null) {
            SizeMode$EnumUnboxingLocalUtility.m("title=", styledText, arrayList);
        }
        StyledText styledText2 = this.subtitle;
        if (styledText2 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("subtitle=", styledText2, arrayList);
        }
        Color color = this.background_color;
        if (color != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("background_color=", color, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SheetStyledDetails{", "}", 0, null, null, 56);
    }
}
