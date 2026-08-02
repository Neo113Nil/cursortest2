package com.squareup.protos.cash.ui;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.lending.sync_values.BorrowData;
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
public final class ColoredString extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ColoredString> CREATOR;
    public final Color color;
    public final LocalizedString text;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Color color;
        public LocalizedString text;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new ColoredString(this.text, this.color, buildUnknownFields());
                case 1:
                    return new com.squareup.protos.cash.aegis.core.ColoredString(this.text, this.color, buildUnknownFields());
                default:
                    return new BorrowData.AppletData.EntryPointData.TileEntryPoint.Badge(this.text, this.color, buildUnknownFields());
            }
        }
    }

    static {
        ColoredString$Companion$ADAPTER$1 coloredString$Companion$ADAPTER$1 = new ColoredString$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ColoredString.class), "type.googleapis.com/squareup.cash.ui.ColoredString", Syntax.PROTO_2, null, "squareup/cash/ui/common.proto");
        ADAPTER = coloredString$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(coloredString$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ColoredString(LocalizedString localizedString, Color color, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.color = color;
        this.text = localizedString;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ColoredString)) {
            return false;
        }
        ColoredString coloredString = (ColoredString) obj;
        return Intrinsics.areEqual(unknownFields(), coloredString.unknownFields()) && Intrinsics.areEqual(this.color, coloredString.color) && Intrinsics.areEqual(this.text, coloredString.text);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Color color = this.color;
        int hashCode2 = (hashCode + (color != null ? color.hashCode() : 0)) * 37;
        LocalizedString localizedString = this.text;
        int hashCode3 = hashCode2 + (localizedString != null ? localizedString.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.color = this.color;
        builder.text = this.text;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Color color = this.color;
        if (color != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("color=", color, arrayList);
        }
        LocalizedString localizedString = this.text;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("text=", localizedString, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ColoredString{", "}", 0, null, null, 56);
    }
}
