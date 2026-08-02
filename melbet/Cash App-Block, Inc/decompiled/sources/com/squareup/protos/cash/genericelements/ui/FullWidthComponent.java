package com.squareup.protos.cash.genericelements.ui;

import android.os.Parcelable;
import com.squareup.protos.cash.composer.app.Asset;
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
public final class FullWidthComponent extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<FullWidthComponent> CREATOR;
    public final BaseElement element;

    static {
        FullWidthComponent$Companion$ADAPTER$1 fullWidthComponent$Companion$ADAPTER$1 = new FullWidthComponent$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(FullWidthComponent.class), "type.googleapis.com/squareup.cash.genericelements.ui.FullWidthComponent", Syntax.PROTO_2, null, "squareup/cash/genericelements/ui/GenericTreeElements.proto");
        ADAPTER = fullWidthComponent$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(fullWidthComponent$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullWidthComponent(BaseElement baseElement, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.element = baseElement;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FullWidthComponent)) {
            return false;
        }
        FullWidthComponent fullWidthComponent = (FullWidthComponent) obj;
        return Intrinsics.areEqual(unknownFields(), fullWidthComponent.unknownFields()) && Intrinsics.areEqual(this.element, fullWidthComponent.element);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        BaseElement baseElement = this.element;
        int hashCode2 = hashCode + (baseElement != null ? baseElement.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Asset.Builder builder = new Asset.Builder(26);
        builder.asset_type = this.element;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        BaseElement baseElement = this.element;
        if (baseElement != null) {
            arrayList.add("element=" + baseElement);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FullWidthComponent{", "}", 0, null, null, 56);
    }
}
