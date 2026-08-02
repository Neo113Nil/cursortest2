package com.squareup.protos.cash.genericelements.ui;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.badging.api.Badge;
import com.squareup.protos.cash.genericelements.ui.Alignment;
import com.squareup.protos.cash.grantly.api.Channel;
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
public final class ArcadeTextElement extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ArcadeTextElement> CREATOR;
    public final Alignment alignment;
    public final Integer max_lines;
    public final Boolean selectable;
    public final SemanticTextColor semantic_text_color;
    public final Style style;
    public final String text;
    public final Color text_color;
    public final VerticalAlignment vertical_alignment;

    public enum SemanticTextColor implements WireEnum {
        BRAND(1),
        DANGER(2),
        DISABLED(3),
        INVERSE(4),
        LINK(5),
        LINK_VISITED(6),
        PLACEHOLDER(7),
        PROMINENT(8),
        STANDARD(9),
        SUBTLE(10),
        SUCCESS(11),
        WARNING(12);

        public final int value;
        public static final Alignment.Companion Companion = new Alignment.Companion();
        public static final ArcadeTextElement$SemanticTextColor$Companion$ADAPTER$1 ADAPTER = new ArcadeTextElement$SemanticTextColor$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(SemanticTextColor.class), Syntax.PROTO_2, null);

        SemanticTextColor(int i) {
            this.value = i;
        }

        public static final SemanticTextColor fromValue(int i) {
            Companion.getClass();
            return Alignment.Companion.m3861fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public enum Style implements WireEnum {
        KEYPAD_TOTAL(1),
        HERO_NUMERICS(2),
        HERO(3),
        HEADER(4),
        KEYPAD_NUMBERS(5),
        LARGE_LABEL(6),
        TAB_TITLE(7),
        SECTION_TITLE(8),
        PAGE_TITLE(9),
        LABEL(10),
        BODY(11),
        BODY_LINK(12),
        INPUT(13),
        BUTTON(14),
        COMPACT_BUTTON(15),
        CELL_BODY(16),
        HELP_TEXT(17),
        DISCLAIMER(18),
        DISCLAIMER_LINK(19),
        META_TEXT(20),
        BADGE_LARGE_ASSET(21),
        BADGE_LARGE_INLINE(22);

        public final int value;
        public static final Channel.Companion Companion = new Channel.Companion();
        public static final ArcadeTextElement$Style$Companion$ADAPTER$1 ADAPTER = new ArcadeTextElement$Style$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Style.class), Syntax.PROTO_2, null);

        Style(int i) {
            this.value = i;
        }

        public static final Style fromValue(int i) {
            Companion.getClass();
            return Channel.Companion.m3873fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        ArcadeTextElement$Companion$ADAPTER$1 arcadeTextElement$Companion$ADAPTER$1 = new ArcadeTextElement$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ArcadeTextElement.class), "type.googleapis.com/squareup.cash.genericelements.ui.ArcadeTextElement", Syntax.PROTO_2, null, "squareup/cash/genericelements/ui/GenericTreeElements.proto");
        ADAPTER = arcadeTextElement$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(arcadeTextElement$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArcadeTextElement(String str, Style style, Alignment alignment, Color color, SemanticTextColor semanticTextColor, Integer num, VerticalAlignment verticalAlignment, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.text = str;
        this.style = style;
        this.alignment = alignment;
        this.text_color = color;
        this.semantic_text_color = semanticTextColor;
        this.max_lines = num;
        this.vertical_alignment = verticalAlignment;
        this.selectable = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ArcadeTextElement)) {
            return false;
        }
        ArcadeTextElement arcadeTextElement = (ArcadeTextElement) obj;
        return Intrinsics.areEqual(unknownFields(), arcadeTextElement.unknownFields()) && Intrinsics.areEqual(this.text, arcadeTextElement.text) && this.style == arcadeTextElement.style && this.alignment == arcadeTextElement.alignment && Intrinsics.areEqual(this.text_color, arcadeTextElement.text_color) && this.semantic_text_color == arcadeTextElement.semantic_text_color && Intrinsics.areEqual(this.max_lines, arcadeTextElement.max_lines) && this.vertical_alignment == arcadeTextElement.vertical_alignment && Intrinsics.areEqual(this.selectable, arcadeTextElement.selectable);
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
        SemanticTextColor semanticTextColor = this.semantic_text_color;
        int hashCode6 = (hashCode5 + (semanticTextColor != null ? semanticTextColor.hashCode() : 0)) * 37;
        Integer num = this.max_lines;
        int hashCode7 = (hashCode6 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        VerticalAlignment verticalAlignment = this.vertical_alignment;
        int hashCode8 = (hashCode7 + (verticalAlignment != null ? verticalAlignment.hashCode() : 0)) * 37;
        Boolean bool = this.selectable;
        int hashCode9 = hashCode8 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode9;
        return hashCode9;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Badge.Builder builder = new Badge.Builder(22, false);
        builder.external_token = this.text;
        builder.customer_token = this.style;
        builder.external_version = this.alignment;
        builder.updated_at = this.text_color;
        builder.created_at = this.semantic_text_color;
        builder.item_type = this.max_lines;
        builder.count_groups = this.vertical_alignment;
        builder.is_badged = this.selectable;
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
        SemanticTextColor semanticTextColor = this.semantic_text_color;
        if (semanticTextColor != null) {
            arrayList.add("semantic_text_color=" + semanticTextColor);
        }
        Integer num = this.max_lines;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("max_lines=", num, arrayList);
        }
        VerticalAlignment verticalAlignment = this.vertical_alignment;
        if (verticalAlignment != null) {
            arrayList.add("vertical_alignment=" + verticalAlignment);
        }
        Boolean bool = this.selectable;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("selectable=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ArcadeTextElement{", "}", 0, null, null, 56);
    }
}
