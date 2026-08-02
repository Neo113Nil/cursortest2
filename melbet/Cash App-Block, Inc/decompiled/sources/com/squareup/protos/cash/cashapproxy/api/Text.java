package com.squareup.protos.cash.cashapproxy.api;

import android.os.Parcelable;
import com.squareup.protos.cash.cashface.api.Trust;
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
    public final TextAlignment alignment;
    public final TextStyle style;
    public final String text;
    public final SemanticColor text_color;

    static {
        Text$Companion$ADAPTER$1 text$Companion$ADAPTER$1 = new Text$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Text.class), "type.googleapis.com/squareup.cash.cashapproxy.api.v1.Text", Syntax.PROTO_2, null, "squareup/cash/cashapproxy/api/v1/common_ui_elements.proto");
        ADAPTER = text$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(text$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Text(String str, SemanticColor semanticColor, TextStyle textStyle, TextAlignment textAlignment, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.text = str;
        this.text_color = semanticColor;
        this.style = textStyle;
        this.alignment = textAlignment;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Text)) {
            return false;
        }
        Text text = (Text) obj;
        return Intrinsics.areEqual(unknownFields(), text.unknownFields()) && Intrinsics.areEqual(this.text, text.text) && this.text_color == text.text_color && this.style == text.style && this.alignment == text.alignment;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.text;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        SemanticColor semanticColor = this.text_color;
        int hashCode3 = (hashCode2 + (semanticColor != null ? semanticColor.hashCode() : 0)) * 37;
        TextStyle textStyle = this.style;
        int hashCode4 = (hashCode3 + (textStyle != null ? textStyle.hashCode() : 0)) * 37;
        TextAlignment textAlignment = this.alignment;
        int hashCode5 = hashCode4 + (textAlignment != null ? textAlignment.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Trust.Builder builder = new Trust.Builder(2, false);
        builder.title = this.text;
        builder.icon = this.text_color;
        builder.enabled = this.style;
        builder.id = this.alignment;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.text != null) {
            arrayList.add("text=██");
        }
        SemanticColor semanticColor = this.text_color;
        if (semanticColor != null) {
            arrayList.add("text_color=" + semanticColor);
        }
        TextStyle textStyle = this.style;
        if (textStyle != null) {
            arrayList.add("style=" + textStyle);
        }
        TextAlignment textAlignment = this.alignment;
        if (textAlignment != null) {
            arrayList.add("alignment=" + textAlignment);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Text{", "}", 0, null, null, 56);
    }
}
