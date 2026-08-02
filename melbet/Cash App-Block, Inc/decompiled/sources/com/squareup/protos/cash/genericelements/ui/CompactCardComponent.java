package com.squareup.protos.cash.genericelements.ui;

import android.os.Parcelable;
import com.squareup.protos.cash.grantly.api.Card;
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
public final class CompactCardComponent extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CompactCardComponent> CREATOR;
    public final StyleAttributes attributes;
    public final TextElement description;
    public final TwoColumnComponent header;
    public final Action tap;

    static {
        CompactCardComponent$Companion$ADAPTER$1 compactCardComponent$Companion$ADAPTER$1 = new CompactCardComponent$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CompactCardComponent.class), "type.googleapis.com/squareup.cash.genericelements.ui.CompactCardComponent", Syntax.PROTO_2, null, "squareup/cash/genericelements/ui/GenericTreeElements.proto");
        ADAPTER = compactCardComponent$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(compactCardComponent$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompactCardComponent(TwoColumnComponent twoColumnComponent, TextElement textElement, StyleAttributes styleAttributes, Action action, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.header = twoColumnComponent;
        this.description = textElement;
        this.attributes = styleAttributes;
        this.tap = action;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CompactCardComponent)) {
            return false;
        }
        CompactCardComponent compactCardComponent = (CompactCardComponent) obj;
        return Intrinsics.areEqual(unknownFields(), compactCardComponent.unknownFields()) && Intrinsics.areEqual(this.header, compactCardComponent.header) && Intrinsics.areEqual(this.description, compactCardComponent.description) && Intrinsics.areEqual(this.attributes, compactCardComponent.attributes) && Intrinsics.areEqual(this.tap, compactCardComponent.tap);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        TwoColumnComponent twoColumnComponent = this.header;
        int hashCode2 = (hashCode + (twoColumnComponent != null ? twoColumnComponent.hashCode() : 0)) * 37;
        TextElement textElement = this.description;
        int hashCode3 = (hashCode2 + (textElement != null ? textElement.hashCode() : 0)) * 37;
        StyleAttributes styleAttributes = this.attributes;
        int hashCode4 = (hashCode3 + (styleAttributes != null ? styleAttributes.hashCode() : 0)) * 37;
        Action action = this.tap;
        int hashCode5 = hashCode4 + (action != null ? action.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Card.CardPii.Builder builder = new Card.CardPii.Builder(11, false);
        builder.postal_code = this.header;
        builder.last_four_digits = this.description;
        builder.expiration = this.attributes;
        builder.ciphertext_ = this.tap;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        TwoColumnComponent twoColumnComponent = this.header;
        if (twoColumnComponent != null) {
            arrayList.add("header=" + twoColumnComponent);
        }
        TextElement textElement = this.description;
        if (textElement != null) {
            arrayList.add("description=" + textElement);
        }
        StyleAttributes styleAttributes = this.attributes;
        if (styleAttributes != null) {
            arrayList.add("attributes=" + styleAttributes);
        }
        Action action = this.tap;
        if (action != null) {
            arrayList.add("tap=" + action);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CompactCardComponent{", "}", 0, null, null, 56);
    }
}
