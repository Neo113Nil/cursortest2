package com.squareup.protos.cash.composer.app;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.composer.app.Card;
import com.squareup.protos.cash.grantly.api.Action;
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
    public final TextStyle style;
    public final String text;

    public enum TextStyle implements WireEnum {
        TITLE(1),
        SUBTITLE(2);

        public final int value;
        public static final Action.Type.Companion Companion = new Action.Type.Companion();
        public static final TextElement$TextStyle$Companion$ADAPTER$1 ADAPTER = new TextElement$TextStyle$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(TextStyle.class), Syntax.PROTO_2, null);

        TextStyle(int i) {
            this.value = i;
        }

        public static final TextStyle fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return TITLE;
            }
            if (i != 2) {
                return null;
            }
            return SUBTITLE;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        TextElement$Companion$ADAPTER$1 textElement$Companion$ADAPTER$1 = new TextElement$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TextElement.class), "type.googleapis.com/squareup.cash.composer.app.TextElement", Syntax.PROTO_2, null, "squareup/cash/composer/app/CardTabNullStateV2.proto");
        ADAPTER = textElement$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(textElement$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextElement(String str, TextStyle textStyle, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.text = str;
        this.style = textStyle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TextElement)) {
            return false;
        }
        TextElement textElement = (TextElement) obj;
        return Intrinsics.areEqual(unknownFields(), textElement.unknownFields()) && Intrinsics.areEqual(this.text, textElement.text) && this.style == textElement.style;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.text;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        TextStyle textStyle = this.style;
        int hashCode3 = hashCode2 + (textStyle != null ? textStyle.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Card.Builder builder = new Card.Builder(29);
        builder.image_url = this.text;
        builder.asset = this.style;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "text=", arrayList);
        }
        TextStyle textStyle = this.style;
        if (textStyle != null) {
            arrayList.add("style=" + textStyle);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TextElement{", "}", 0, null, null, 56);
    }
}
