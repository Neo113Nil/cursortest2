package com.squareup.cash.supportarticles.app.v1;

import android.os.Parcelable;
import com.squareup.protos.cash.aegis.core.Member;
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
public final class Icon extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Icon> CREATOR;
    public final Color color;
    public final Glyph glyph;

    static {
        Icon$Companion$ADAPTER$1 icon$Companion$ADAPTER$1 = new Icon$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Icon.class), "type.googleapis.com/squareup.cash.supportarticles.app.v1beta1.Icon", Syntax.PROTO_3, null, "squareup/cash/supportarticles/app/v1beta1/icon.proto");
        ADAPTER = icon$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(icon$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Icon(Glyph glyph, Color color, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.glyph = glyph;
        this.color = color;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Icon)) {
            return false;
        }
        Icon icon = (Icon) obj;
        return Intrinsics.areEqual(unknownFields(), icon.unknownFields()) && this.glyph == icon.glyph && this.color == icon.color;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Glyph glyph = this.glyph;
        int hashCode2 = (hashCode + (glyph != null ? glyph.hashCode() : 0)) * 37;
        Color color = this.color;
        int hashCode3 = hashCode2 + (color != null ? color.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Member.Builder builder = new Member.Builder(25);
        builder.customer_token = this.glyph;
        builder.sponsorship_tier = this.color;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Glyph glyph = this.glyph;
        if (glyph != null) {
            arrayList.add("glyph=" + glyph);
        }
        Color color = this.color;
        if (color != null) {
            arrayList.add("color=" + color);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Icon{", "}", 0, null, null, 56);
    }
}
