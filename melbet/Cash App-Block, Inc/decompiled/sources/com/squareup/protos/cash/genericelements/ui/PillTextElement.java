package com.squareup.protos.cash.genericelements.ui;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.grantly.api.Card;
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

/* loaded from: classes7.dex */
public final class PillTextElement extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PillTextElement> CREATOR;
    public final Alignment alignment;
    public final Color background_color;
    public final String text;
    public final Color text_color;

    static {
        PillTextElement$Companion$ADAPTER$1 pillTextElement$Companion$ADAPTER$1 = new PillTextElement$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PillTextElement.class), "type.googleapis.com/squareup.cash.genericelements.ui.PillTextElement", Syntax.PROTO_2, null, "squareup/cash/genericelements/ui/GenericTreeElements.proto");
        ADAPTER = pillTextElement$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(pillTextElement$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PillTextElement(String str, Color color, Color color2, Alignment alignment, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.text = str;
        this.text_color = color;
        this.background_color = color2;
        this.alignment = alignment;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PillTextElement)) {
            return false;
        }
        PillTextElement pillTextElement = (PillTextElement) obj;
        return Intrinsics.areEqual(unknownFields(), pillTextElement.unknownFields()) && Intrinsics.areEqual(this.text, pillTextElement.text) && Intrinsics.areEqual(this.text_color, pillTextElement.text_color) && Intrinsics.areEqual(this.background_color, pillTextElement.background_color) && this.alignment == pillTextElement.alignment;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.text;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Color color = this.text_color;
        int hashCode3 = (hashCode2 + (color != null ? color.hashCode() : 0)) * 37;
        Color color2 = this.background_color;
        int hashCode4 = (hashCode3 + (color2 != null ? color2.hashCode() : 0)) * 37;
        Alignment alignment = this.alignment;
        int hashCode5 = hashCode4 + (alignment != null ? alignment.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Card.CardPii.Builder builder = new Card.CardPii.Builder(14, false);
        builder.postal_code = this.text;
        builder.last_four_digits = this.text_color;
        builder.expiration = this.background_color;
        builder.ciphertext_ = this.alignment;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.text != null) {
            arrayList.add("text=██");
        }
        Color color = this.text_color;
        if (color != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("text_color=", color, arrayList);
        }
        Color color2 = this.background_color;
        if (color2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("background_color=", color2, arrayList);
        }
        Alignment alignment = this.alignment;
        if (alignment != null) {
            arrayList.add("alignment=" + alignment);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PillTextElement{", "}", 0, null, null, 56);
    }
}
