package com.squareup.protos.cash.shop.rendering.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
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

/* loaded from: classes8.dex */
public final class TintedIcon extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TintedIcon> CREATOR;
    public final Icon icon;
    public final Color icon_color;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Icon icon;
        public Color icon_color;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new TintedIcon(this.icon, this.icon_color, buildUnknownFields());
                default:
                    return new com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements.TintedIcon(this.icon, this.icon_color, buildUnknownFields());
            }
        }
    }

    static {
        TintedIcon$Companion$ADAPTER$1 tintedIcon$Companion$ADAPTER$1 = new TintedIcon$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TintedIcon.class), "type.googleapis.com/squareup.cash.shop.rendering.api.TintedIcon", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/TintedIcon.proto");
        ADAPTER = tintedIcon$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(tintedIcon$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TintedIcon(Icon icon, Color color, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.icon = icon;
        this.icon_color = color;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TintedIcon)) {
            return false;
        }
        TintedIcon tintedIcon = (TintedIcon) obj;
        return Intrinsics.areEqual(unknownFields(), tintedIcon.unknownFields()) && Intrinsics.areEqual(this.icon, tintedIcon.icon) && Intrinsics.areEqual(this.icon_color, tintedIcon.icon_color);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Icon icon = this.icon;
        int hashCode2 = (hashCode + (icon != null ? icon.hashCode() : 0)) * 37;
        Color color = this.icon_color;
        int hashCode3 = hashCode2 + (color != null ? color.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.icon = this.icon;
        builder.icon_color = this.icon_color;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Icon icon = this.icon;
        if (icon != null) {
            Matcher$$ExternalSyntheticOutline0.m("icon=", icon, arrayList);
        }
        Color color = this.icon_color;
        if (color != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("icon_color=", color, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TintedIcon{", "}", 0, null, null, 56);
    }
}
