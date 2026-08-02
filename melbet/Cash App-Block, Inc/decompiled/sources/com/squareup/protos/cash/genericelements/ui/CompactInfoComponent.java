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
public final class CompactInfoComponent extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CompactInfoComponent> CREATOR;
    public final TextElement description;
    public final TwoColumnComponent header;

    static {
        CompactInfoComponent$Companion$ADAPTER$1 compactInfoComponent$Companion$ADAPTER$1 = new CompactInfoComponent$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CompactInfoComponent.class), "type.googleapis.com/squareup.cash.genericelements.ui.CompactInfoComponent", Syntax.PROTO_2, null, "squareup/cash/genericelements/ui/GenericTreeElements.proto");
        ADAPTER = compactInfoComponent$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(compactInfoComponent$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompactInfoComponent(TwoColumnComponent twoColumnComponent, TextElement textElement, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.header = twoColumnComponent;
        this.description = textElement;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CompactInfoComponent)) {
            return false;
        }
        CompactInfoComponent compactInfoComponent = (CompactInfoComponent) obj;
        return Intrinsics.areEqual(unknownFields(), compactInfoComponent.unknownFields()) && Intrinsics.areEqual(this.header, compactInfoComponent.header) && Intrinsics.areEqual(this.description, compactInfoComponent.description);
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
        int hashCode3 = hashCode2 + (textElement != null ? textElement.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Action.Builder builder = new Action.Builder(20);
        builder.f1268type = this.header;
        builder.details = this.description;
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
        return CollectionsKt.joinToString$default(arrayList, ", ", "CompactInfoComponent{", "}", 0, null, null, 56);
    }
}
