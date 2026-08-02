package com.squareup.protos.cash.genericelements.ui;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.grantly.api.Action;
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
public final class StyleAttributes extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<StyleAttributes> CREATOR;
    public final Color background_color;
    public final Boolean show_drop_shadow;

    static {
        StyleAttributes$Companion$ADAPTER$1 styleAttributes$Companion$ADAPTER$1 = new StyleAttributes$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(StyleAttributes.class), "type.googleapis.com/squareup.cash.genericelements.ui.StyleAttributes", Syntax.PROTO_2, null, "squareup/cash/genericelements/ui/Attributes.proto");
        ADAPTER = styleAttributes$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(styleAttributes$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StyleAttributes(Color color, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.background_color = color;
        this.show_drop_shadow = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StyleAttributes)) {
            return false;
        }
        StyleAttributes styleAttributes = (StyleAttributes) obj;
        return Intrinsics.areEqual(unknownFields(), styleAttributes.unknownFields()) && Intrinsics.areEqual(this.background_color, styleAttributes.background_color) && Intrinsics.areEqual(this.show_drop_shadow, styleAttributes.show_drop_shadow);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Color color = this.background_color;
        int hashCode2 = (hashCode + (color != null ? color.hashCode() : 0)) * 37;
        Boolean bool = this.show_drop_shadow;
        int hashCode3 = hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Action.Builder builder = new Action.Builder(25);
        builder.f1268type = this.background_color;
        builder.details = this.show_drop_shadow;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Color color = this.background_color;
        if (color != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("background_color=", color, arrayList);
        }
        Boolean bool = this.show_drop_shadow;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("show_drop_shadow=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StyleAttributes{", "}", 0, null, null, 56);
    }
}
