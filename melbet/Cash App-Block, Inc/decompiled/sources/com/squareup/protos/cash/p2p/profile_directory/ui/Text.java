package com.squareup.protos.cash.p2p.profile_directory.ui;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.local.client.v1.BrandBanner;
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
public final class Text extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Text> CREATOR;
    public final Image icon;
    public final String text;
    public final Color text_color;
    public final TextDecoration text_decoration;
    public final TextStyle text_style;

    static {
        Text$Companion$ADAPTER$1 text$Companion$ADAPTER$1 = new Text$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Text.class), "type.googleapis.com/squareup.cash.p2p.profile_directory.ui.Text", Syntax.PROTO_2, null, "squareup/cash/p2p/profile_directory/ui/UIElements.proto");
        ADAPTER = text$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(text$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Text(String str, TextStyle textStyle, TextDecoration textDecoration, Color color, Image image, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.text = str;
        this.text_style = textStyle;
        this.text_decoration = textDecoration;
        this.text_color = color;
        this.icon = image;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Text)) {
            return false;
        }
        Text text = (Text) obj;
        return Intrinsics.areEqual(unknownFields(), text.unknownFields()) && Intrinsics.areEqual(this.text, text.text) && this.text_style == text.text_style && this.text_decoration == text.text_decoration && Intrinsics.areEqual(this.text_color, text.text_color) && Intrinsics.areEqual(this.icon, text.icon);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.text;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        TextStyle textStyle = this.text_style;
        int hashCode3 = (hashCode2 + (textStyle != null ? textStyle.hashCode() : 0)) * 37;
        TextDecoration textDecoration = this.text_decoration;
        int hashCode4 = (hashCode3 + (textDecoration != null ? textDecoration.hashCode() : 0)) * 37;
        Color color = this.text_color;
        int hashCode5 = (hashCode4 + (color != null ? color.hashCode() : 0)) * 37;
        Image image = this.icon;
        int hashCode6 = hashCode5 + (image != null ? image.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BrandBanner.Builder builder = new BrandBanner.Builder(25);
        builder.icon = this.text;
        builder.title = this.text_style;
        builder.subtitle = this.text_decoration;
        builder.action = this.text_color;
        builder.icon_background_color = this.icon;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.text != null) {
            arrayList.add("text=██");
        }
        TextStyle textStyle = this.text_style;
        if (textStyle != null) {
            arrayList.add("text_style=" + textStyle);
        }
        TextDecoration textDecoration = this.text_decoration;
        if (textDecoration != null) {
            arrayList.add("text_decoration=" + textDecoration);
        }
        Color color = this.text_color;
        if (color != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("text_color=", color, arrayList);
        }
        Image image = this.icon;
        if (image != null) {
            SizeMode$EnumUnboxingLocalUtility.m("icon=", image, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Text{", "}", 0, null, null, 56);
    }
}
