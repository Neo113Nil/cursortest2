package com.squareup.protos.cash.shop.rendering.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Headers;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class TextLinesSection extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TextLinesSection> CREATOR;
    public final List text_lines;

    static {
        TextLinesSection$Companion$ADAPTER$1 textLinesSection$Companion$ADAPTER$1 = new TextLinesSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TextLinesSection.class), "type.googleapis.com/squareup.cash.shop.rendering.api.TextLinesSection", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/TextLinesSection.proto");
        ADAPTER = textLinesSection$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(textLinesSection$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextLinesSection(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.text_lines = TransactorKt.immutableCopyOf("text_lines", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TextLinesSection)) {
            return false;
        }
        TextLinesSection textLinesSection = (TextLinesSection) obj;
        return Intrinsics.areEqual(unknownFields(), textLinesSection.unknownFields()) && Intrinsics.areEqual(this.text_lines, textLinesSection.text_lines);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.text_lines.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Headers.Builder builder = new Headers.Builder(1, false);
        builder.header = this.text_lines;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.text_lines;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("text_lines=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TextLinesSection{", "}", 0, null, null, 56);
    }

    public TextLinesSection(List list) {
        this(list, ByteString.EMPTY);
    }
}
