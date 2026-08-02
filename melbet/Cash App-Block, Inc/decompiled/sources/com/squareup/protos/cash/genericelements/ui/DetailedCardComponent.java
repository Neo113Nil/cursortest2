package com.squareup.protos.cash.genericelements.ui;

import android.os.Parcelable;
import com.squareup.protos.cash.discover.api.app.v1.model.Text;
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
public final class DetailedCardComponent extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DetailedCardComponent> CREATOR;
    public final BaseElement body;
    public final TwoColumnComponent header;
    public final StyleAttributes style_attributes;
    public final Action tap;
    public final BaseElement title;

    static {
        DetailedCardComponent$Companion$ADAPTER$1 detailedCardComponent$Companion$ADAPTER$1 = new DetailedCardComponent$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DetailedCardComponent.class), "type.googleapis.com/squareup.cash.genericelements.ui.DetailedCardComponent", Syntax.PROTO_2, null, "squareup/cash/genericelements/ui/GenericTreeElements.proto");
        ADAPTER = detailedCardComponent$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(detailedCardComponent$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailedCardComponent(TwoColumnComponent twoColumnComponent, BaseElement baseElement, BaseElement baseElement2, Action action, StyleAttributes styleAttributes, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.header = twoColumnComponent;
        this.title = baseElement;
        this.body = baseElement2;
        this.tap = action;
        this.style_attributes = styleAttributes;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DetailedCardComponent)) {
            return false;
        }
        DetailedCardComponent detailedCardComponent = (DetailedCardComponent) obj;
        return Intrinsics.areEqual(unknownFields(), detailedCardComponent.unknownFields()) && Intrinsics.areEqual(this.header, detailedCardComponent.header) && Intrinsics.areEqual(this.title, detailedCardComponent.title) && Intrinsics.areEqual(this.body, detailedCardComponent.body) && Intrinsics.areEqual(this.tap, detailedCardComponent.tap) && Intrinsics.areEqual(this.style_attributes, detailedCardComponent.style_attributes);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        TwoColumnComponent twoColumnComponent = this.header;
        int hashCode2 = (hashCode + (twoColumnComponent != null ? twoColumnComponent.hashCode() : 0)) * 37;
        BaseElement baseElement = this.title;
        int hashCode3 = (hashCode2 + (baseElement != null ? baseElement.hashCode() : 0)) * 37;
        BaseElement baseElement2 = this.body;
        int hashCode4 = (hashCode3 + (baseElement2 != null ? baseElement2.hashCode() : 0)) * 37;
        Action action = this.tap;
        int hashCode5 = (hashCode4 + (action != null ? action.hashCode() : 0)) * 37;
        StyleAttributes styleAttributes = this.style_attributes;
        int hashCode6 = hashCode5 + (styleAttributes != null ? styleAttributes.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Text.Builder builder = new Text.Builder(8);
        builder.text = this.header;
        builder.text_style = this.title;
        builder.text_decoration = this.body;
        builder.text_color = this.tap;
        builder.icon = this.style_attributes;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        TwoColumnComponent twoColumnComponent = this.header;
        if (twoColumnComponent != null) {
            arrayList.add("header=" + twoColumnComponent);
        }
        BaseElement baseElement = this.title;
        if (baseElement != null) {
            arrayList.add("title=" + baseElement);
        }
        BaseElement baseElement2 = this.body;
        if (baseElement2 != null) {
            arrayList.add("body=" + baseElement2);
        }
        Action action = this.tap;
        if (action != null) {
            arrayList.add("tap=" + action);
        }
        StyleAttributes styleAttributes = this.style_attributes;
        if (styleAttributes != null) {
            arrayList.add("style_attributes=" + styleAttributes);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DetailedCardComponent{", "}", 0, null, null, 56);
    }
}
