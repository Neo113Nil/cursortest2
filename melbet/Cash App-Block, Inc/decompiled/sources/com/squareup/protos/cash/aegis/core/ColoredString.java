package com.squareup.protos.cash.aegis.core;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.ColoredString;
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
public final class ColoredString extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ColoredString> CREATOR;
    public final Color color;
    public final LocalizedString text;

    static {
        ColoredString$Companion$ADAPTER$1 coloredString$Companion$ADAPTER$1 = new ColoredString$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ColoredString.class), "type.googleapis.com/squareup.cash.aegis.core.ColoredString", Syntax.PROTO_2, null, "squareup/cash/aegis/core/SafetyEducationHub.proto");
        ADAPTER = coloredString$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(coloredString$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ColoredString(LocalizedString localizedString, Color color, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.text = localizedString;
        this.color = color;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ColoredString)) {
            return false;
        }
        ColoredString coloredString = (ColoredString) obj;
        return Intrinsics.areEqual(unknownFields(), coloredString.unknownFields()) && Intrinsics.areEqual(this.text, coloredString.text) && Intrinsics.areEqual(this.color, coloredString.color);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalizedString localizedString = this.text;
        int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        Color color = this.color;
        int hashCode3 = hashCode2 + (color != null ? color.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ColoredString.Builder builder = new ColoredString.Builder(1);
        builder.text = this.text;
        builder.color = this.color;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalizedString localizedString = this.text;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("text=", localizedString, arrayList);
        }
        Color color = this.color;
        if (color != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("color=", color, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ColoredString{", "}", 0, null, null, 56);
    }

    public /* synthetic */ ColoredString(LocalizedString localizedString, Color color) {
        this(localizedString, color, ByteString.EMPTY);
    }
}
