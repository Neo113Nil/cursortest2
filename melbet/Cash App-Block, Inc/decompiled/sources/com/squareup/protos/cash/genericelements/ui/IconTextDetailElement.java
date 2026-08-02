package com.squareup.protos.cash.genericelements.ui;

import android.os.Parcelable;
import com.squareup.protos.cash.grantly.api.Action;
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
public final class IconTextDetailElement extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<IconTextDetailElement> CREATOR;
    public final ImageElement icon;
    public final TextElement text;

    static {
        IconTextDetailElement$Companion$ADAPTER$1 iconTextDetailElement$Companion$ADAPTER$1 = new IconTextDetailElement$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(IconTextDetailElement.class), "type.googleapis.com/squareup.cash.genericelements.ui.IconTextDetailElement", Syntax.PROTO_2, null, "squareup/cash/genericelements/ui/GenericTreeElements.proto");
        ADAPTER = iconTextDetailElement$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(iconTextDetailElement$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconTextDetailElement(ImageElement imageElement, TextElement textElement, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.icon = imageElement;
        this.text = textElement;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IconTextDetailElement)) {
            return false;
        }
        IconTextDetailElement iconTextDetailElement = (IconTextDetailElement) obj;
        return Intrinsics.areEqual(unknownFields(), iconTextDetailElement.unknownFields()) && Intrinsics.areEqual(this.icon, iconTextDetailElement.icon) && Intrinsics.areEqual(this.text, iconTextDetailElement.text);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ImageElement imageElement = this.icon;
        int hashCode2 = (hashCode + (imageElement != null ? imageElement.hashCode() : 0)) * 37;
        TextElement textElement = this.text;
        int hashCode3 = hashCode2 + (textElement != null ? textElement.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Action.Builder builder = new Action.Builder(23);
        builder.f1268type = this.icon;
        builder.details = this.text;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ImageElement imageElement = this.icon;
        if (imageElement != null) {
            arrayList.add("icon=" + imageElement);
        }
        TextElement textElement = this.text;
        if (textElement != null) {
            arrayList.add("text=" + textElement);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "IconTextDetailElement{", "}", 0, null, null, 56);
    }
}
