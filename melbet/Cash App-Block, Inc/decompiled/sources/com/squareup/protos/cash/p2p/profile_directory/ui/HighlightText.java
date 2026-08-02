package com.squareup.protos.cash.p2p.profile_directory.ui;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.pools.PoolParticipant;
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
public final class HighlightText extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<HighlightText> CREATOR;
    public final Color highlighted_text_color;
    public final TextStyle highlighted_text_style;
    public final Image icon;
    public final Range range;
    public final String text;
    public final Color text_color;
    public final TextStyle text_style;

    static {
        HighlightText$Companion$ADAPTER$1 highlightText$Companion$ADAPTER$1 = new HighlightText$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(HighlightText.class), "type.googleapis.com/squareup.cash.p2p.profile_directory.ui.HighlightText", Syntax.PROTO_2, null, "squareup/cash/p2p/profile_directory/ui/UIElements.proto");
        ADAPTER = highlightText$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(highlightText$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HighlightText(String str, Range range, TextStyle textStyle, Color color, TextStyle textStyle2, Color color2, Image image, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.text = str;
        this.range = range;
        this.text_style = textStyle;
        this.text_color = color;
        this.highlighted_text_style = textStyle2;
        this.highlighted_text_color = color2;
        this.icon = image;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HighlightText)) {
            return false;
        }
        HighlightText highlightText = (HighlightText) obj;
        return Intrinsics.areEqual(unknownFields(), highlightText.unknownFields()) && Intrinsics.areEqual(this.text, highlightText.text) && Intrinsics.areEqual(this.range, highlightText.range) && this.text_style == highlightText.text_style && Intrinsics.areEqual(this.text_color, highlightText.text_color) && this.highlighted_text_style == highlightText.highlighted_text_style && Intrinsics.areEqual(this.highlighted_text_color, highlightText.highlighted_text_color) && Intrinsics.areEqual(this.icon, highlightText.icon);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.text;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Range range = this.range;
        int hashCode3 = (hashCode2 + (range != null ? range.hashCode() : 0)) * 37;
        TextStyle textStyle = this.text_style;
        int hashCode4 = (hashCode3 + (textStyle != null ? textStyle.hashCode() : 0)) * 37;
        Color color = this.text_color;
        int hashCode5 = (hashCode4 + (color != null ? color.hashCode() : 0)) * 37;
        TextStyle textStyle2 = this.highlighted_text_style;
        int hashCode6 = (hashCode5 + (textStyle2 != null ? textStyle2.hashCode() : 0)) * 37;
        Color color2 = this.highlighted_text_color;
        int hashCode7 = (hashCode6 + (color2 != null ? color2.hashCode() : 0)) * 37;
        Image image = this.icon;
        int hashCode8 = hashCode7 + (image != null ? image.hashCode() : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        PoolParticipant.Builder builder = new PoolParticipant.Builder(10);
        builder.customer_identifier = this.text;
        builder.full_name = this.range;
        builder.profile_photo_url = this.text_style;
        builder.cashtag = this.text_color;
        builder.added_at = this.highlighted_text_style;
        builder.participant_type = this.highlighted_text_color;
        builder.aggregated_contribution_amount = this.icon;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.text != null) {
            arrayList.add("text=██");
        }
        Range range = this.range;
        if (range != null) {
            arrayList.add("range=" + range);
        }
        TextStyle textStyle = this.text_style;
        if (textStyle != null) {
            arrayList.add("text_style=" + textStyle);
        }
        Color color = this.text_color;
        if (color != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("text_color=", color, arrayList);
        }
        TextStyle textStyle2 = this.highlighted_text_style;
        if (textStyle2 != null) {
            arrayList.add("highlighted_text_style=" + textStyle2);
        }
        Color color2 = this.highlighted_text_color;
        if (color2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("highlighted_text_color=", color2, arrayList);
        }
        Image image = this.icon;
        if (image != null) {
            SizeMode$EnumUnboxingLocalUtility.m("icon=", image, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "HighlightText{", "}", 0, null, null, 56);
    }
}
