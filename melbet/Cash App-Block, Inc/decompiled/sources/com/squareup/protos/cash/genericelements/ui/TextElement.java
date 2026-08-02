package com.squareup.protos.cash.genericelements.ui;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.compass.api.RadioType;
import com.squareup.protos.cash.janus.api.ContactAlias;
import com.squareup.protos.cash.ui.Color;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class TextElement extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TextElement> CREATOR;
    public final Alignment alignment;
    public final Integer max_line_number;
    public final Boolean selectable;
    public final Style style;
    public final String text;
    public final Color text_color;
    public final VerticalAlignment vertical_alignment;

    public enum Style implements WireEnum {
        BIO(1),
        BIG_MONEY(2),
        HEADER_1(3),
        HEADER_2(4),
        HEADER_3(5),
        HEADER_4(6),
        INPUT(7),
        MAIN_TITLE(8),
        MAIN_BODY(9),
        SMALL_TITLE(10),
        SMALL_BODY(11),
        SMALL_BODY_ITALIC(12),
        STRONG_CAPTION(13),
        CAPTION(14),
        IDENTIFIER(15),
        SMALL_CAPTION(16);

        public final int value;
        public static final RadioType.Companion Companion = new RadioType.Companion();
        public static final TextElement$Style$Companion$ADAPTER$1 ADAPTER = new TextElement$Style$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Style.class), Syntax.PROTO_2, null);

        Style(int i) {
            this.value = i;
        }

        public static final Style fromValue(int i) {
            Companion.getClass();
            return RadioType.Companion.m3855fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        TextElement$Companion$ADAPTER$1 textElement$Companion$ADAPTER$1 = new TextElement$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TextElement.class), "type.googleapis.com/squareup.cash.genericelements.ui.TextElement", Syntax.PROTO_2, null, "squareup/cash/genericelements/ui/GenericTreeElements.proto");
        ADAPTER = textElement$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(textElement$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextElement(String str, Style style, Alignment alignment, Color color, Integer num, VerticalAlignment verticalAlignment, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.text = str;
        this.style = style;
        this.alignment = alignment;
        this.text_color = color;
        this.max_line_number = num;
        this.vertical_alignment = verticalAlignment;
        this.selectable = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TextElement)) {
            return false;
        }
        TextElement textElement = (TextElement) obj;
        return Intrinsics.areEqual(unknownFields(), textElement.unknownFields()) && Intrinsics.areEqual(this.text, textElement.text) && this.style == textElement.style && this.alignment == textElement.alignment && Intrinsics.areEqual(this.text_color, textElement.text_color) && Intrinsics.areEqual(this.max_line_number, textElement.max_line_number) && this.vertical_alignment == textElement.vertical_alignment && Intrinsics.areEqual(this.selectable, textElement.selectable);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.text;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Style style = this.style;
        int hashCode3 = (hashCode2 + (style != null ? style.hashCode() : 0)) * 37;
        Alignment alignment = this.alignment;
        int hashCode4 = (hashCode3 + (alignment != null ? alignment.hashCode() : 0)) * 37;
        Color color = this.text_color;
        int hashCode5 = (hashCode4 + (color != null ? color.hashCode() : 0)) * 37;
        Integer num = this.max_line_number;
        int hashCode6 = (hashCode5 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        VerticalAlignment verticalAlignment = this.vertical_alignment;
        int hashCode7 = (hashCode6 + (verticalAlignment != null ? verticalAlignment.hashCode() : 0)) * 37;
        Boolean bool = this.selectable;
        int hashCode8 = hashCode7 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ContactAlias.Builder builder = new ContactAlias.Builder(26, false);
        builder.customer_token = this.text;
        builder.alias_value = this.style;
        builder.hashed_alias_token = this.alignment;
        builder.alias_type = this.text_color;
        builder.updated_at = this.max_line_number;
        builder.linked_at = this.vertical_alignment;
        builder.version = this.selectable;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.text != null) {
            arrayList.add("text=██");
        }
        Style style = this.style;
        if (style != null) {
            arrayList.add("style=" + style);
        }
        Alignment alignment = this.alignment;
        if (alignment != null) {
            arrayList.add("alignment=" + alignment);
        }
        Color color = this.text_color;
        if (color != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("text_color=", color, arrayList);
        }
        Integer num = this.max_line_number;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("max_line_number=", num, arrayList);
        }
        VerticalAlignment verticalAlignment = this.vertical_alignment;
        if (verticalAlignment != null) {
            arrayList.add("vertical_alignment=" + verticalAlignment);
        }
        Boolean bool = this.selectable;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("selectable=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TextElement{", "}", 0, null, null, 56);
    }
}
