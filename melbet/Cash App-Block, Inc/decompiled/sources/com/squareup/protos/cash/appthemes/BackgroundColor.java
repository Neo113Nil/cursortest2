package com.squareup.protos.cash.appthemes;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.discover.api.app.v1.model.NavigationIcon;
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
public final class BackgroundColor extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BackgroundColor> CREATOR;
    public final Color color;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Color color;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new BackgroundColor(this.color, buildUnknownFields());
                case 1:
                    return new NavigationIcon(this.color, buildUnknownFields());
                default:
                    return new com.squareup.protos.cash.messagingplatformcommon.app.NavigationIcon(this.color, buildUnknownFields());
            }
        }
    }

    static {
        BackgroundColor$Companion$ADAPTER$1 backgroundColor$Companion$ADAPTER$1 = new BackgroundColor$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BackgroundColor.class), "type.googleapis.com/squareup.cash.appthemes.BackgroundColor", Syntax.PROTO_2, null, "squareup/cash/appthemes/app_theme_definitions.proto");
        ADAPTER = backgroundColor$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(backgroundColor$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundColor(Color color, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.color = color;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BackgroundColor)) {
            return false;
        }
        BackgroundColor backgroundColor = (BackgroundColor) obj;
        return Intrinsics.areEqual(unknownFields(), backgroundColor.unknownFields()) && Intrinsics.areEqual(this.color, backgroundColor.color);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Color color = this.color;
        int hashCode2 = hashCode + (color != null ? color.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.color = this.color;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Color color = this.color;
        if (color != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("color=", color, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BackgroundColor{", "}", 0, null, null, 56);
    }
}
